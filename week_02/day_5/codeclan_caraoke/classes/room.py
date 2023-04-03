class Room:
    def __init__(self, name, max_capacity):
        self.name = name
        self.max_capacity = max_capacity
        self.capacity = []
        self.songs = []

    def add_song(self, song):
        self.songs.append(song)

    def check_in_guest(self, guest):
        self.capacity.append(guest)

    def check_out_guest(self, guest):
        self.capacity.remove(guest)
    
    def has_capacity(self):
        if len(self.capacity) <= self.max_capacity:
            return True
        elif len(self.capacity) > self.max_capacity:
            return False