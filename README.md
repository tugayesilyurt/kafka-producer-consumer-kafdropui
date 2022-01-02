# Docker Compose Spring,Kafka,Producer,Consumer and Kafdrop UI

## Run the System
We can easily run the whole with only a single command:

* `docker-compose up`

The services can be run on the background with command:

* `docker-compose up -d`


## Stop the System
Stopping all the running containers is also simple with a single command:

* `docker-compose down`


If you need to stop and remove all containers, networks, and all images used by any service in <em>docker-compose.yml</em> file, use the command:

* `docker-compose down --rmi all`

### EndPoints ###

| Service        | EndPoint                          | Method | Description                                      |
| -------------  | --------------------------------- | :-----:| ------------------------------------------------ |
| kafka-producer | localhost:8000/api/v1/send/kafka  | POST   | Sending data to kafka             	             |

- **KafDrop Main Screen**

![Kafdrop](https://github.com/tugayesilyurt/kafka-producer-consumer-kafdropui/blob/main/assets/kafdrop_ui.PNG)

- **KafDrop Topic**

![Kafdrop](https://github.com/tugayesilyurt/kafka-producer-consumer-kafdropui/blob/main/assets/kafdrop_ui_topic.PNG)
	
- **Postman**

![Postman](https://github.com/tugayesilyurt/kafka-producer-consumer-kafdropui/blob/main/assets/postman.PNG)