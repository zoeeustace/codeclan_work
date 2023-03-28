# # WRITE YOUR FUNCTIONS HERE


def get_pet_shop_name(pet_shop):
   return pet_shop["name"]

def get_total_cash(total_cash):
   return total_cash["admin"]["total_cash"]

def add_or_remove_cash(list, new_cash):
   list["admin"]["total_cash"] = list["admin"]["total_cash"] + new_cash
   # list["admin"]["total_cash"] += new_cash


def get_pets_sold(sold):
   return sold["admin"]["pets_sold"]

def increase_pets_sold(list, now_sold):
    list["admin"]["pets_sold"] += now_sold

def get_stock_count(count):
   return len(cc_pet_shop["pets"])

def get_pets_by_breed(list, pet_breed):
   pets = []
   for pet in list["pets"]:
      if pet["breed"] == pet_breed:
         pets.append(pet)
   return pets

   
def find_pet_by_name(pet_shop, name):
   for pet in pet_shop["pets"]:
      if pet["name"] == name:
         return pet

def remove_pet_by_name(pet_shop, name):
   pet_shop["pets"].remove(find_pet_by_name(pet_shop, name))

def add_pet_to_stock(pet_shop, pet):
   pet_shop["pets"].append(pet)

def get_customer_cash(customer):
   return customer["cash"]

def remove_customer_cash(customer, amount):
   customer["cash"] -= amount

def get_customer_pet_count(customer):
   return len(customer["pets"])

def add_pet_to_customer(customer, pet):
   customer["pets"].append(pet)

def customer_can_afford_pet(customer, pet):
   return customer["cash"] >= pet["price"]
   
def sell_pet_to_customer(pet_shop, pet, customer):
   if pet != None and customer_can_afford_pet(customer, pet):
      remove_pet_by_name(pet_shop, pet["name"])
      add_pet_to_customer(customer, pet)
      remove_customer_cash(customer, pet["price"])
      add_or_remove_cash(pet_shop, pet["price"])
      increase_pets_sold(pet_shop, 1)







