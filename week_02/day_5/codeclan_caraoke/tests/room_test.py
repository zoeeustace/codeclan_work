import unittest
from classes.room import Room
from classes.guest import Guest
from classes.song import Song

class TestRoom(unittest.TestCase):
    def setUp(self):
        self.song1 = Song("Lose It", "Eminem")
        self.song2 = Song("Waterloo", "Abba")
        self.song3 = Song("American Pie", "Don Mclean")

        self.guest1 = Guest("Ami Shields-Webb", 100)
        self.guest2 = Guest("Murray Hamilton", 70)
        self.guest3 = Guest("Zoe Eustace", 40)

        self.room1 = Room("Dallas", 10)
        self.room2 = Room("New York", 2)
        self.room3 = Room("London", 25)

    def test_that_room_has_name(self):
        self.assertEqual("Dallas", self.room1.name)

    def test_that_room_has_capacity(self):
        self.assertEqual(2, self.room2.max_capacity)

    def test_song_can_be_added_to_room(self):
        self.room1.add_song(self.song1)
        self.assertEqual("Lose It", self.song1.name)

    def test_guest_can_be_checked_into_room(self):
        self.room2.check_in_guest(self.guest2)
        self.assertEqual("Murray Hamilton", self.guest2.name)

    def test_guest_can_be_checked_out_of_room(self):
        self.room2.check_in_guest(self.guest2)
        self.room2.check_out_guest(self.guest2)
        self.assertEqual("Murray Hamilton", self.guest2.name)

    def test_is_there_capacity_in_the_room(self):        
        self.room2.has_capacity()
        self.assertEqual(True, self.room2.max_capacity)