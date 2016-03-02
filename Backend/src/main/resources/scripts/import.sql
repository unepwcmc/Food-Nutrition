-- UserRole data
INSERT INTO user_role (id, name, role) VALUES (1, 'ADMIN', 'ADMIN');
-- User
INSERT INTO users (id, first_name, last_name, email, username, enabled, password, language, user_role_id) VALUES (1,'Admin', 'Fodd','admin@email.com','admin@email.com', TRUE, '$2a$10$xxI6/lZ2J3T7/FsK8IQuEetMpjJOTeVaRkpwQ0ITQyTVFLKIfEApW','pt_BR', 1);
INSERT INTO users (id, first_name, last_name, email, username, enabled, password, language, user_role_id) VALUES (2,'Joze', 'Carlos','jozecarlos@email.com','jozecarlos@email.com', TRUE, '$2a$10$xxI6/lZ2J3T7/FsK8IQuEetMpjJOTeVaRkpwQ0ITQyTVFLKIfEApW','pt_BR', 1);
INSERT INTO users (id, first_name, last_name, email, username, enabled, password, language, user_role_id) VALUES (3,'Rodrigo', 'Silva','rodrigo@email.com', 'rodrigo@email.com',TRUE, '$2a$10$xxI6/lZ2J3T7/FsK8IQuEetMpjJOTeVaRkpwQ0ITQyTVFLKIfEApW','pt_BR', 1);
INSERT INTO users (id, first_name, last_name, email, username, enabled, password, language, user_role_id) VALUES (4,'Edmilson', 'Silva','edmilson@email.com','edmilson@email.com', TRUE, '$2a$10$xxI6/lZ2J3T7/FsK8IQuEetMpjJOTeVaRkpwQ0ITQyTVFLKIfEApW','pt_BR', 1);


-- Preservation methods
INSERT INTO preservation_method (id, "name") VALUES (16, 'CANNED');
INSERT INTO preservation_method (id, "name") VALUES (3, 'ADDITIVES');
INSERT INTO preservation_method (id, "name") VALUES (14, 'CANNED_IN_OIL');
INSERT INTO preservation_method (id, "name") VALUES (5, 'SALTED');
INSERT INTO preservation_method (id, "name") VALUES (10, 'PASTEURIZED');
INSERT INTO preservation_method (id, "name") VALUES (9, 'BLANCHED');
INSERT INTO preservation_method (id, "name") VALUES (12, 'IRRADIATED');
INSERT INTO preservation_method (id, "name") VALUES (7, 'SMOKED');
INSERT INTO preservation_method (id, "name") VALUES (2, 'CHILLED');
INSERT INTO preservation_method (id, "name") VALUES (15, 'CANNED_IN_SYRUP');
INSERT INTO preservation_method (id, "name") VALUES (4, 'FREEZE_DRIED');
INSERT INTO preservation_method (id, "name") VALUES (11, 'STERLIZED');
INSERT INTO preservation_method (id, "name") VALUES (8, 'FILTRATED');
INSERT INTO preservation_method (id, "name") VALUES (13, 'VACUUM');
INSERT INTO preservation_method (id, "name") VALUES (6, 'CURED');
INSERT INTO preservation_method (id, "name") VALUES (1, 'FROZEN');

-- Cooking degree
INSERT INTO cooking_degree (id, "name") VALUES (3, 'FULLY_COOKED');
INSERT INTO cooking_degree (id, "name") VALUES (5, 'MEDIUM');
INSERT INTO cooking_degree (id, "name") VALUES (7, 'MEDIUM_WELL');
INSERT INTO cooking_degree (id, "name") VALUES (2, 'PARTIALLY_COOKED');
INSERT INTO cooking_degree (id, "name") VALUES (4, 'RARE');
INSERT INTO cooking_degree (id, "name") VALUES (8, 'WELL_DONE');
INSERT INTO cooking_degree (id, "name") VALUES (6, 'MEDIUM_RARE');
INSERT INTO cooking_degree (id, "name") VALUES (1, 'RAW');

-- Food group
INSERT INTO food_group (id, "name") VALUES (3, 'LEGUMES_AND_DERIVATIVES');
INSERT INTO food_group (id, "name") VALUES (5, 'VEGETABLES');
INSERT INTO food_group (id, "name") VALUES (10, 'MILK');
INSERT INTO food_group (id, "name") VALUES (9, 'FISH_AND_SEAFOOD');
INSERT INTO food_group (id, "name") VALUES (12, 'MISCELLANEOUS');
INSERT INTO food_group (id, "name") VALUES (7, 'MEAT_AND_DERIVATIVES');
INSERT INTO food_group (id, "name") VALUES (2, 'STARCHY_ROOTS_AND_TUBERS');
INSERT INTO food_group (id, "name") VALUES (4, 'NUTS_AND_SEEDS');
INSERT INTO food_group (id, "name") VALUES (11, 'HERBS_AND_SPICES');
INSERT INTO food_group (id, "name") VALUES (8, 'EGGS');
INSERT INTO food_group (id, "name") VALUES (6, 'FRUITS_AND_DERIVATIVES');
INSERT INTO food_group (id, "name") VALUES (1, 'CEREALS_AND_DERIVATIVES');

-- Food type
INSERT INTO food_type (id, "name") VALUES (2, 'MIXED');
INSERT INTO food_type (id, "name") VALUES (1, 'SINGLE');

-- Food processing
INSERT INTO food_processing (id, "name") VALUES (16, 'PARBOILED');
INSERT INTO food_processing (id, "name") VALUES (3, 'BOILED');
INSERT INTO food_processing (id, "name") VALUES (14, 'POACHED');
INSERT INTO food_processing (id, "name") VALUES (5, 'MICROWAVED');
INSERT INTO food_processing (id, "name") VALUES (10, 'SHALLOW_FRIED');
INSERT INTO food_processing (id, "name") VALUES (9, 'DEEP_FRIED');
INSERT INTO food_processing (id, "name") VALUES (12, 'STIR_FRIED');
INSERT INTO food_processing (id, "name") VALUES (7, 'STEAMED_UNDER_PRESSURE');
INSERT INTO food_processing (id, "name") VALUES (2, 'BAKED');
INSERT INTO food_processing (id, "name") VALUES (15, 'FERMENTED');
INSERT INTO food_processing (id, "name") VALUES (4, 'BRAISED');
INSERT INTO food_processing (id, "name") VALUES (11, 'SAUTEED');
INSERT INTO food_processing (id, "name") VALUES (8, 'TOASTED');
INSERT INTO food_processing (id, "name") VALUES (13, 'COOKED_IN_WATER_BATH');
INSERT INTO food_processing (id, "name") VALUES (6, 'STEAMED');
INSERT INTO food_processing (id, "name") VALUES (1, 'DRIED');

-- Part plant / animal
INSERT INTO part_plant_animal (id, "name") VALUES (16, 'CORN');
INSERT INTO part_plant_animal (id, "name") VALUES (9, 'NUT');
INSERT INTO part_plant_animal (id, "name") VALUES (24, 'HEART');
INSERT INTO part_plant_animal (id, "name") VALUES (17, 'RHIZOME');
INSERT INTO part_plant_animal (id, "name") VALUES (8, 'SEED');
INSERT INTO part_plant_animal (id, "name") VALUES (23, 'FLOWER');
INSERT INTO part_plant_animal (id, "name") VALUES (10, 'ROOT');
INSERT INTO part_plant_animal (id, "name") VALUES (22, 'ROOT_TUBER_BULB_WOUT_PEEL');
INSERT INTO part_plant_animal (id, "name") VALUES (7, 'CORE');
INSERT INTO part_plant_animal (id, "name") VALUES (2, 'FRUIT_W_PEEL_R_CORE_SEED');
INSERT INTO part_plant_animal (id, "name") VALUES (15, 'BULB');
INSERT INTO part_plant_animal (id, "name") VALUES (25, 'MEAT');
INSERT INTO part_plant_animal (id, "name") VALUES (5, 'FRUIT_INDUSTRIALIZED_PULP');
INSERT INTO part_plant_animal (id, "name") VALUES (20, 'ROOT_TUBER_BULB_PEEL_ONLY');
INSERT INTO part_plant_animal (id, "name") VALUES (27, 'BREAST');
INSERT INTO part_plant_animal (id, "name") VALUES (12, 'LEAF');
INSERT INTO part_plant_animal (id, "name") VALUES (19, 'BULB');
INSERT INTO part_plant_animal (id, "name") VALUES (4, 'FRUIT_R_PEEL_R_CORE_SEED');
INSERT INTO part_plant_animal (id, "name") VALUES (13, 'LEAVES_AND_STEM');
INSERT INTO part_plant_animal (id, "name") VALUES (28, 'FILLET');
INSERT INTO part_plant_animal (id, "name") VALUES (18, 'TUBER');
INSERT INTO part_plant_animal (id, "name") VALUES (3, 'FRUIT_R_PEEL_W_CORE_SEED');
INSERT INTO part_plant_animal (id, "name") VALUES (14, 'STEM');
INSERT INTO part_plant_animal (id, "name") VALUES (21, 'ROOT_TUBER_BULB_W_PEEL');
INSERT INTO part_plant_animal (id, "name") VALUES (26, 'LEG');
INSERT INTO part_plant_animal (id, "name") VALUES (11, 'POD');
INSERT INTO part_plant_animal (id, "name") VALUES (6, 'PEEL');
INSERT INTO part_plant_animal (id, "name") VALUES (1, 'FRUIT_WHOLE');

-- Agricultural production conditions
INSERT INTO agricultural_production_condition (id, "name") VALUES (3, 'HYDROPONIC');
INSERT INTO agricultural_production_condition (id, "name") VALUES (5, 'MECHANICALLY_HARVESTED');
INSERT INTO agricultural_production_condition (id, "name") VALUES (7, 'FARMED');
INSERT INTO agricultural_production_condition (id, "name") VALUES (2, 'AGROECOLOGICAL');
INSERT INTO agricultural_production_condition (id, "name") VALUES (4, 'HAND_PICKED');
INSERT INTO agricultural_production_condition (id, "name") VALUES (6, 'WILD');
INSERT INTO agricultural_production_condition (id, "name") VALUES (1, 'ORGANIC');

-- Ripeness maturity
INSERT INTO ripeness_maturity (id, "name") VALUES (3, 'PARTIALLY_RIPE');
INSERT INTO ripeness_maturity (id, "name") VALUES (2, 'IMMATURE');
INSERT INTO ripeness_maturity (id, "name") VALUES (1, 'RIPE');

-- Storage conditions
INSERT INTO storage_condition (id, "name") VALUES (3, 'REFRIGERATOR');
INSERT INTO storage_condition (id, "name") VALUES (2, 'FREEZER');
INSERT INTO storage_condition (id, "name") VALUES (1, 'ROOM_TEMPERATURE');

-- Contact surface container
INSERT INTO contact_surface_container (id, "name") VALUES (3, 'METAL');
INSERT INTO contact_surface_container (id, "name") VALUES (5, 'STEEL');
INSERT INTO contact_surface_container (id, "name") VALUES (10, 'WAX');
INSERT INTO contact_surface_container (id, "name") VALUES (9, 'FABRIC');
INSERT INTO contact_surface_container (id, "name") VALUES (12, 'WOOD');
INSERT INTO contact_surface_container (id, "name") VALUES (7, 'PAPER');
INSERT INTO contact_surface_container (id, "name") VALUES (2, 'GLASS');
INSERT INTO contact_surface_container (id, "name") VALUES (4, 'ALUMINUM');
INSERT INTO contact_surface_container (id, "name") VALUES (11, 'IRON');
INSERT INTO contact_surface_container (id, "name") VALUES (8, 'PLASTIC');
INSERT INTO contact_surface_container (id, "name") VALUES (6, 'TIN');
INSERT INTO contact_surface_container (id, "name") VALUES (1, 'CERAMIC');

-- Physical state
INSERT INTO physical_state (id, "name") VALUES (3, 'SEMI_SOLID');
INSERT INTO physical_state (id, "name") VALUES (2, 'LIQUID');
INSERT INTO physical_state (id, "name") VALUES (1, 'SOLID');

-- Colour
INSERT INTO colour (id, "name") VALUES (16, 'LIGHT_YELLOW');
INSERT INTO colour (id, "name") VALUES (5, 'BLACK');
INSERT INTO colour (id, "name") VALUES (9, 'VIOLET');
INSERT INTO colour (id, "name") VALUES (12, 'PURPLE_SKIN_WHITE_FLESH');
INSERT INTO colour (id, "name") VALUES (17, 'LIGHT_ORANGE');
INSERT INTO colour (id, "name") VALUES (4, 'ORANGE');
INSERT INTO colour (id, "name") VALUES (8, 'PURPLE');
INSERT INTO colour (id, "name") VALUES (13, 'ORANGE_SKIN_YELLOW_FLESH');
INSERT INTO colour (id, "name") VALUES (3, 'GREEN');
INSERT INTO colour (id, "name") VALUES (14, 'DARK_GREEN');
INSERT INTO colour (id, "name") VALUES (10, 'WHITE');
INSERT INTO colour (id, "name") VALUES (7, 'LIGHT_BROWN');
INSERT INTO colour (id, "name") VALUES (2, 'YELLOW');
INSERT INTO colour (id, "name") VALUES (15, 'LIGHT_GREEN');
INSERT INTO colour (id, "name") VALUES (11, 'YELLOW_SKIN_WHITE_FLESH');
INSERT INTO colour (id, "name") VALUES (6, 'BROWN');
INSERT INTO colour (id, "name") VALUES (1, 'RED');

-- Reference type
INSERT INTO reference_type (id, "name") VALUES (3, 'ARTICLE_IN_REPORT');
INSERT INTO reference_type (id, "name") VALUES (14, 'REFERENCE_TYPE_NOT_KNOW');
INSERT INTO reference_type (id, "name") VALUES (5, 'FILE_OR_DATABASE');
INSERT INTO reference_type (id, "name") VALUES (10, 'REPORT');
INSERT INTO reference_type (id, "name") VALUES (9, 'PHAMPLET_FOLDER');
INSERT INTO reference_type (id, "name") VALUES (12, 'WEBPAGE');
INSERT INTO reference_type (id, "name") VALUES (7, 'PRODUCT_LABEL');
INSERT INTO reference_type (id, "name") VALUES (2, 'ARTICLE_IN_JOURNAL');
INSERT INTO reference_type (id, "name") VALUES (4, 'BOOK');
INSERT INTO reference_type (id, "name") VALUES (11, 'SOFTWARE');
INSERT INTO reference_type (id, "name") VALUES (8, 'PERSONAL_COMMUNICATION');
INSERT INTO reference_type (id, "name") VALUES (13, 'OTHER_REFERENCE_TYPE');
INSERT INTO reference_type (id, "name") VALUES (6, 'JOURNAL_ISSUE');
INSERT INTO reference_type (id, "name") VALUES (1, 'ARTICLE_IN_BOOK');

-- Country
INSERT INTO country (id, "name") VALUES(1, 'BRAZIL');

-- State
INSERT INTO "state" (id, "name", country_id) VALUES(1, 'SAO_PAULO', 1);


-- ####### MOCK DATA - FOOD COMPOSITION #######
INSERT INTO sampling_origin (id, city, latitude, longitude, country_id, state_id) VALUES (1, 'São Paulo', 46.6333, 23.55, 1, 1);
INSERT INTO sampling (id, analysis_reason, analytical_replicates_number, analytical_samples_number, arrives_sample_handling, before_sample_handling, food_samples_number, food_samples_weights, plan, seasson_end, seasson_start, storage_conditions, sampling_origin_id) VALUES (1, 'analysis', 3, 3, 'wash, peel separated', 'Transport at -5C', 10, 3000.0, '10 fruits collected for each sample', TO_DATE('2016-03-13','YYYY-MM-DD'), TO_DATE('2016-01-13','YYYY-MM-DD'), 'Frozen -80C', 1);
INSERT INTO reference (id, biblio_id, doi, isbn, issn, issue_number, pages_number, published_date, publisher, publisher_location, title, url, volume_number, origin_id, reference_type_id) VALUES (1, '1', NULL, NULL, NULL, 4, '55-67', TO_DATE('2016-01-01','YYYY-MM-DD'), 'Food Composition', 'London', 'Nutritional composition of red guava fruits', NULL, 1, NULL, 1);
INSERT INTO reference_author (reference, authors) VALUES (1, 'Thomas Hazell');
INSERT INTO reference_author (reference, authors) VALUES (1, 'Daniela Beltrame');
INSERT INTO food_characteristic (id, max_value, min_value, "name", unit, "value", characteristic_type) VALUES (6, NULL, NULL, 'FOOD_WEIGHT', NULL, 50.0, '6');
INSERT INTO food_characteristic (id, max_value, min_value, "name", unit, "value", characteristic_type) VALUES (3, NULL, NULL, 'PH', NULL, 6.0, '3');
INSERT INTO food_characteristic (id, max_value, min_value, "name", unit, "value", characteristic_type) VALUES (1, NULL, NULL, 'DENSITY', NULL, NULL, '1');
INSERT INTO food_characteristic (id, max_value, min_value, "name", unit, "value", characteristic_type) VALUES (5, NULL, NULL, 'FOOD_SIZE', NULL, 24.0, '5');
INSERT INTO food_characteristic (id, max_value, min_value, "name", unit, "value", characteristic_type) VALUES (2, NULL, NULL, 'EDIBLE_PORTION', NULL, 67.0, '2');
INSERT INTO food_characteristic (id, max_value, min_value, "name", unit, "value", characteristic_type) VALUES (4, NULL, NULL, 'SOLID_SOLUBLE', NULL, NULL, '4');
INSERT INTO general_analysis (id, density_id, edible_portion_id, food_size_id, food_weight_id, ph_id, solid_soluble_id) VALUES (1, 1, 2, 5, 6, 3, 4);
INSERT INTO food (id, grade, manufacturer, "name", notes, recipe_procedure, scientific_name, shape_form, taxon_rank, agricultural_condition_id, colour_id, contact_surface_id, cooking_degree_id, general_analysis_id, physical_state_id, preservation_method_id, food_processing_id, ripeness_maturity_id, sampling_id, storage_condition_id, food_group_id, food_type_id, part_plant_animal_id, reference_id) VALUES (1, NULL, NULL, 'Red guava', NULL, NULL, 'Psidium cattleianum Sabine', NULL, 'Species', 1, 1, NULL, 1, 1,  1, NULL, 1, 1, 1, NULL, 6, 1, 6, 1);
INSERT INTO nutrient (id, max_value, min_value, "name", num_studies, unit, "value", nutrient_type, food_id) VALUES (4, 1.0, 1.0, 'ALC', NULL, NULL, 1.0, '4', 1);
INSERT INTO nutrient (id, max_value, min_value, "name", num_studies, unit, "value", nutrient_type, food_id) VALUES (5, 1.0, 1.0, 'PROTCNT', NULL, NULL, 1.0, '5', 1);
INSERT INTO nutrient (id, max_value, min_value, "name", num_studies, unit, "value", nutrient_type, food_id) VALUES (2, 1.0, 1.0, 'WATER', NULL, NULL, 1.0, '2', 1);
INSERT INTO nutrient (id, max_value, min_value, "name", num_studies, unit, "value", nutrient_type, food_id) VALUES (3, 1.0, 1.0, 'ASH', NULL, NULL, 1.0, '3', 1);
INSERT INTO nutrient (id, max_value, min_value, "name", num_studies, unit, "value", nutrient_type, food_id) VALUES (1, 1.0, 1.0, 'ENERGY', NULL, NULL, 1.0, '1', 1);



