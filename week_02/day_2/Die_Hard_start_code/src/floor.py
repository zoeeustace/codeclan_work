class Floor:
    def __init__(self, floor_number):
        self.floor_number = floor_number
        self.people = []
        

    def floor_count(self):
        return len(self.people)
    
    def add_person(self, bad_guy):
        self.people.append(bad_guy)

    def remove_person(self, bad_guy2):
        self.people.remove(bad_guy2)