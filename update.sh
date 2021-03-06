#! /bin/sh

cd /opt/Food-Nutrition/

echo "Stopping the PostgreSQL..."
sudo service postgresql stop

echo "Stopping the frontend..."
sudo service nginx stop

echo "Stopping the backend REST API..."
sudo service food-nutrition stop

echo "Updating the project files..."
sudo git stash
sudo git pull

echo "Starting the PostgreSQL..."
sudo service postgresql start

echo "Starting the backend REST API..."
cd ./Backend
sudo chmod +x ./gradlew
sudo ./gradlew build -x test
sudo service food-nutrition start

#echo "Starting the frontend..."
#cd ../Frontend
#sudo grunt setup
#sudo grunt deploy --force
sudo service nginx start
