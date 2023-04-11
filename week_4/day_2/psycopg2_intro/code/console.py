import pdb 
from models.task import Task
import repositories.task_repository as task_repository  
from models.user import User
from repositories import user_repository

user_repository.delete_all()
task_repository.delete_all()

user_1 = User("Scooby", "Doo")
user_repository.save(user_1)
user_2 = User("Scrappy", "Doo")
user_repository.save(user_2)

users = user_repository.select_all()

for user in users:
    print(user.__dict__)




# task_1 = Task("Go for a run", "Jack Jarvis", 20)

# task_repository.save(task_1)

# task_1.mark_complete()
# task_repository.update(task_1)

# result = task_repository.select_all()

# for task in result:
#     print(task.__dict__)
# #task.__dict__ allows results to be printed in dictionary format

# pdb.set_trace()