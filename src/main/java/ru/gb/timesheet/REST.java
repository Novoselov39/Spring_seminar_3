package ru.gb.timesheet;

public class REST {

  /**
   * HTTP - протокол
   * gRPC - протокол
   * WebSockets - протокол
   *
   * Путь\эндпоинт\ручка\ресурс - /timesheet
   *
   * REST - набор соглашений, как оформлять\проектировать ресурсы вашего сервиса
   * 1. НЕ использовать глаголы в путях
   * /deleteTimesheet/{id} - плохо
   * DELETE /timesheet/{id} - хорошо
   *
   * 2. Ресурсы должны вкладываться друг в друга
   * GET /users/{userId}/roles/{roleId} - получить РОЛЬ с идентификатором roleId у юзера userId
   * GET /roles/{id}
   * GET /departments/{id}/employees/{id}/head/consultant/roles/{id}
   *
   * Полчить юзеров, у которых имя содержит какую-то подстроку
   * GET /users?name-like="adfasdf" -> 204 No Content
   * GET /users?sort-by=age&sort-order=desc
   *
   * 3. Рекомендация: использовать множественное число для ресурсов
   * Вмест /user использовать /users
   *
   * 4. Слова внутри ресурса соединяются дефисом
   * GET github.com/project/pull-requests/{id}
   *
   *
   *
   */

}
