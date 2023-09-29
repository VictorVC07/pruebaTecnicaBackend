# Prueba entrevista

Bienvenidos al microservicio hecho en Java 11 utilizando maven y como base de datos PostgresQL.
#
### Backup
[Descargar Backup Base de datos - PostgreSQL](https://drive.google.com/file/d/1TFXh-f1Bm3QdBSoYFQa5ifDIeO7bkqhn/view?usp=drive_link)
#
### Local
* [Java 11 SDK](https://www.oracle.com/co/java/technologies/javase/jdk11-archive-downloads.html)
* [Maven](https://maven.apache.org/download.cgi)

Puerto: 8080
#
#### endpoints
##### messages
```
- /api/messages/send *POST*
    - Descripcion:
    Guarda la conversacion de un usuario con el creador del post.
    - Body de ejemplo:
    ```bash
    {
        "senderUserId":2,
        "receiverUserId":1,
        "messageText": "Hola, yo tambien",
        "timestamp": "2023-09-29T14:35:00",
        "post":{
            "id":1
        }
    }
    
    -- Response:
    ```bash
    {
        "id": 1,
        "senderUserId": 2,
        "receiverUserId": 1,
        "messageText": "Hola, yo tambien",
        "timestamp": "2023-09-29T14:35:00.000+00:00",
        "post": {
            "id": 1,
            "userId": 1,
            "title": "Título 1",
            "content": "Contenido 1"
        }
    }
    
- /api/messages/post/{postId}/{userId}?page={numPage}&size={numSize} *GET*

    - Descripcion:
    Lista por paginacion las conversaciones que tuvo un usuario con el publicador del post
    - parametros:
    ```bash
    postId = el id del post
    userId = el id del usuario que está interesado en el post
    numPage = numero de pagina a mostrar, por default es 0 (primera pagina)
    size = tamaño de la conversacion a mostrar por pagina, por default es 15
    
    - response:
    ```bash
        [
        {
            "id": 1,
            "senderUserId": 1,
            "receiverUserId": 2,
            "messageText": "1111",
            "timestamp": "2023-09-29T14:30:00.000+00:00",
            "post": {
                "id": 1,
                "userId": 1,
                "title": "Título 1",
                "content": "Contenido 1"
            }
        },
        {
            "id": 3,
            "senderUserId": 1,
            "receiverUserId": 2,
            "messageText": "33333",
            "timestamp": "2023-09-29T14:30:00.000+00:00",
            "post": {
                "id": 1,
                "userId": 1,
                "title": "Título 1",
                "content": "Contenido 1"
            }
        }
    ]
    ´´´
##### posts
- /api/posts/create *POST* (prueba)
- /api/posts/all *GET* (prueba)

# Author
Victor Alonso Vargas Callejas
