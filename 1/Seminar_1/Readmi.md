Команды для создания образа:
sudo docker build . -t javadoc_docker
sudo docker run --rm -v $PWD/:/Seminar_1 javadoc_docker
