class PetShop:
    def __init__(self, name, pets, total_cash):
        self.name = name
        self.pets = pets
        self.total_cash = total_cash
        self.pets_sold = 0

    def stock_count(self):
        return len(self.pets)
    
    def increase_pets_sold(self):
        self.pets_sold += 1

    def increase_total_cash(self, add_cash):
        self.total_cash += add_cash

    def remove_pet(self, pet):
        self.pets.remove(pet)

    def find_pet_by_name(self, pet_name):
        for pet in self.pets:
            if pet.name == pet_name:
                return pet
       
    def sell_pet_to_customer(self, pet_name, customer):
        pet_to_sell = self.find_pet_by_name(pet_name)
        customer.reduce_cash(pet_to_sell.price)
        self.increase_total_cash(pet_to_sell.price)
        self.increase_pets_sold()
        self.remove_pet(pet_to_sell)
        customer.add_pet(pet_to_sell)