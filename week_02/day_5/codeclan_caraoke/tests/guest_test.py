import unittest
from classes.guest import Guest
from classes.song import Song

class TestGuest(unittest.TestCase):
    
    def setUp(self):
        self.song1 = Song("Lose It", "Eminem")
        self.song2 = Song("Waterloo", "Abba")
        self.song3 = Song("American Pie", "Don Mclean")

        self.guest1 = Guest("Ami Shields-Webb", 100)
        self.guest2 = Guest("Murray Hamilton", 70)
        self.guest3 = Guest("Zoe Eustace", 40)

    def test_guest_has_name(self):
        self.assertEqual("Ami Shields-Webb", self.guest1.name)

    def test_guest_has_money(self):
        self.assertEqual(40, self.guest3.wallet)