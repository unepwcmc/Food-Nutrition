#!/usr/bin/env bash

cd /opt/Food-Nutrition
#Update script for new releases
sudo chmod +x update.sh

#Run the Rest API
cd ./Backend
sudo chmod +x gradlew
sudo ./gradlew build

#Installing the backend application as Linux service
sudo cp /vagrant/config/spring-boot /etc/init.d/food-nutrition
sudo chmod 755 /etc/init.d/food-nutrition
sudo update-rc.d food-nutrition defaults
sudo echo -e "\n\MODE=service" >> /etc/environment;

service food-nutrition start
