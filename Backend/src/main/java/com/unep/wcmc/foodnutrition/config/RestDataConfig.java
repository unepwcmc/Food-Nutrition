package com.unep.wcmc.foodnutrition.config;

import com.unep.wcmc.foodnutrition.support.BaseEntity;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.reflections.Reflections;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Configuration
public class RestDataConfig extends RepositoryRestConfigurerAdapter {

    protected static final Log logger = LogFactory.getLog(RestDataConfig.class);

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        List<Class> entityClasses = new ArrayList<>();
        Reflections reflections = new Reflections("com.unep.wcmc.foodnutrition.model");
        Set<Class<? extends BaseEntity>> classes = reflections.getSubTypesOf(BaseEntity.class);
        for (Class<? extends BaseEntity> clazz : classes) {
            try {
                entityClasses.add(clazz);
            } catch (Exception e) {
                logger.error(e);
            }
        }
        config.exposeIdsFor(entityClasses.toArray(new Class[0]));
    }
}
