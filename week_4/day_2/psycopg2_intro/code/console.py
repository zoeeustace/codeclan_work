import pdb 
from models.task import Task
import repositories.task_repository as task_repository  
from models.user import User
import repositories.user_repository as user_repository

result = user_repository.select_all()

task_repository.delete_all()

task_1 = Task("Go for a run", "Jack Jarvis", 20)

task_repository.save(task_1)

task_1.mark_complete()
task_repository.update(task_1)

result = task_repository.select_all()

for task in result:
    print(task.__dict__)
#task.__dict__ allows results to be printed in dictionary format

pdb.set_trace()