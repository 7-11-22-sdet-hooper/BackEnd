
# Backend of [SDETinterview.com](https://SDETinterview.com)

Spring boot project with a RESTful API and a MySQL DB


## API Reference

#### Get category

`http
  GET /api/vocab/category/{category}
`

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `category` | `string` | Returns json by category |

#### Get id

```http
  GET /api/vocab/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long`   | Returns json of a single vocab by id |

#### Get vocab

```http
  GET /api/vocab
```

| Description                       |
 | :-------------------------------- |
 | Returns json for all vocab |

#### Get id

```http
  GET /api/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | Returns a single question by id |






## Configuration file

To run this project, you will need to add a config.yml file located at the project root with the following information and update: 
IP_ADDRESS,
DB_NAME,
USERNAME, 
PASSWORD

```
spring:
  datasource:
    url: jdbc:mysql://IP_ADDRESS:3306/YOUR_DB_NAME
    username: NAME
    password: PASSWORD
```




## Run Locally

Clone the project

```bash
  git clone https://github.com/7-11-22-sdet-hooper/BackEnd.git
```

Go to the project directory

```bash
  cd BackEnd
```

To add config.yml file see configuration file section above

```bash
  nano config.yml
```

Start the server

```bash
  mvn spring-boot:run
```


![Logo](https://dev-to-uploads.s3.amazonaws.com/uploads/articles/th5xamgrr6se0x5ro4g6.png)


## License

[MIT](https://choosealicense.com/licenses/mit/)


## Appendix

[Frontend](https://github.com/7-11-22-sdet-hooper/ReviewsFrontend)

[Database](https://github.com/7-11-22-sdet-hooper/Database)

[SeleniumTestAutomation](https://github.com/7-11-22-sdet-hooper/SeleniumTestAutomation)
