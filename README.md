# CRUDAppSpring

## Задание для самостоятельной работы.

### Задание 1. Реализовать получение данных с эндпоинта (30 баллов)

Создать класс контроллер с `GET` эндпоинтом `/user`, принимающий

  а) число из строки запроса в браузере. 

  б) JSON из тела HTTP запроса, содержащий поле с числом.

Метод эндпоинта вызывает `getUser()` интерфейса `UserService` и передаёт туда полученный из запроса `id`. После чего возвращает полученный из базы объект `user`. Исходный код проекта выложить для проверки на GitHub.

### Задание 2. Реализовать добавление данных в таблицу (30 баллов)

Создать на том же эндпоинте метод `POST`, принимающий JSON объект следующего вида:

```JSON
{
  "email": "string",
  "firstName": "string",
  "lastName": "string",
  "job": "string
}
```


В качестве data-bean создать класс `UserRequest`, содержащий поля в которые будут записываться соответствующие поля из JSON объекта.

В интерфейсе `UserService` добавить метод `addUser(UserRequest)` и реализовать в нём функцию добавления в базу данных нового пользователя (объект `UserEntity`).

