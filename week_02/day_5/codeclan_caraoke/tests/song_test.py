import unittest
from classes.song import Song

class TestSong(unittest.TestCase):
    def setUp(self):
        self.song1 = Song("Lose It", "Eminem")
        self.song2 = Song("Waterloo", "Abba")
        self.song3 = Song("American Pie", "Don Mclean")
        
    def test_song_has_name(self):
        self.assertEqual("Lose It", self.song1.name)

    def test_song_has_artist(self):
        self.assertEqual("Don Mclean", self.song3.artist)
