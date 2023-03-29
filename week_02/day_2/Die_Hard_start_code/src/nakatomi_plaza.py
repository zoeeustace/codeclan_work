class NakatomiPlaza:
    def __init__(self, floor1, floor2, floor3):
        self.floor1 = floor1
        self.floor2 = floor2
        self.floor3 = floor3

    def add_to_floor(self, bad_guy, floor):
        floor.people.append(bad_guy)
