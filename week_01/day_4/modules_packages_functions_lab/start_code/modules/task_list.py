

# Functions to complete:

## Get a list of uncompleted tasks
def get_uncompleted_tasks(list):
    list_of_incomplete = []
    for task in list:
        if task["completed"] == False:
            list_of_incomplete.append(task)
    return list_of_incomplete



## Get a list of completed tasks
def get_completed_tasks(list):
    list_of_complete = []
    for task in list:
        if task["completed"] == True:
            list_of_complete.append(task)
    return list_of_complete

## Get tasks where time_taken is at least a given time
def get_tasks_taking_at_least(list, time):
    minimum_time_task = []
    for task in list:
        if task["time_taken"] >= time:
            minimum_time_task.append(task)
    return minimum_time_task


## Find a task with a given description
def get_task_with_description(list, description):
    described_task = None
    for task in list:
        if task["description"] == description:
            described_task = task
    return described_task


# Extention (Function): 

## Get a list of tasks by status
def get_tasks_by_status(list, status):
    same_status = []
    for task in list:
        if task["completed"] == status:
            same_status.append(task)
    return same_status

