from db.run_sql import run_sql

from models.task import Task
  
def select_all():  
    tasks = [] 

    sql = "SELECT * FROM tasks"
    results = run_sql(sql)

    for row in results:
        task = Task(row['description'], row['assignee'], row['duration'], row['completed'], row['id'] )
        tasks.append(task)
    return tasks 

def save(task):
    sql = "INSERT INTO tasks (description, assignee, duration, completed) VALUES (%s, %s, %s, %s) RETURNING *"
    values = [task.description, task.assignee, task.duration, task.completed]
    results = run_sql(sql, values)
    id = results[0]['id']
    task.id = id
    return task

def select(id):
    task = None
    sql = "SELECT * FROM tasks WHERE id = %s"
    values = [id]
    results = run_sql(sql, values)

    if results:
        result = results[0]
        task = Task(result['description'], result['assignee'], result['duration'], result['completed'], result['id'])
        return task
    
def delete_all():
    sql = "DELETE FROM tasks"
    run_sql(sql)

def delete(id):
    sql = 'DELETE FROM tasks WHERE id = %s'
    values = [id]
    run_sql(sql, values)

def update(task):
    sql = 'UPDATE tasks SET (description, assignee, duration, completed) = (%s, %s, %s, %s) WHERE id = %s'
    values = [task.description, task.assignee, task.duration, task.completed, task.id]
    run_sql(sql, values)







# line 8 - when running in python, don't finish with ; as will run error - only in psql
# line 11-12, the row names are from task_manager.sql not from Task class (might be the same but need to ensure it's linked to the the actual database, not the class)
# line 17 - placeholders of %s need to match the same number of tasks in sql