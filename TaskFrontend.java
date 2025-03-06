<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Task Manager</title>
</head>
<body>
    <h1>Task Manager</h1>
    <form action="/tasks" method="post">
        <input type="text" name="name" placeholder="Task Name" required>
        <input type="text" name="description" placeholder="Task Description" required>
        <button type="submit">Add Task</button>
    </form>
    <ul>
        <li th:each="task : ${tasks}">
            <span th:text="${task.name}"></span> - <span th:text="${task.description}"></span>
            <form action="/tasks/{{task.id}}/delete" method="post" style="display:inline;">
                <button type="submit">Delete</button>
            </form>
            <form action="/tasks/{{task.id}}/update" method="post" style="display:inline;">
                <input type="checkbox" th:checked="${task.completed}" name="completed"> Mark as Completed
                <button type="submit">Update</button>
            </form>
        </li>
    </ul>
</body>
</html>
