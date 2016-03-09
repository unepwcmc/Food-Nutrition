package com.unep.wcmc.foodnutrition.config;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import com.unep.wcmc.foodnutrition.model.NutrientType;
import com.unep.wcmc.foodnutrition.repository.NutrientTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class MvcConfig extends WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter {

    @Autowired
    ApplicationContext context;

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters){
        List<MediaType> supportedMediaTypes=new ArrayList<>();
        supportedMediaTypes.add(MediaType.APPLICATION_JSON);
        supportedMediaTypes.add(MediaType.TEXT_PLAIN);
        MappingJackson2HttpMessageConverter converter=new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(new HibernateAwareObjectMapper());
        converter.setPrettyPrint(true);
        converter.setSupportedMediaTypes(supportedMediaTypes);
        converters.add(converter);
        super.configureMessageConverters(converters);
    }

    public class HibernateAwareObjectMapper extends ObjectMapper {
        public HibernateAwareObjectMapper() {
            registerModule(new Hibernate5Module());
            registerModule(new CustomModule());
        }
    }

    public class CustomModule extends SimpleModule {
        public CustomModule() {
            addKeyDeserializer(NutrientType.class, new KeyDeserializer() {
                @Override
                public Object deserializeKey(String key, DeserializationContext ctxt)
                        throws IOException {
                    return context.getBean(NutrientTypeRepository.class).findByName(key);
                }
            });
        }
    }

}