import unittest
from src.card_game import *
from src.card import *

class TestCardGame(unittest.TestCase):

    def setUp(self):
        self.card2 = Card("Diamond", 6)
        self.card1 = Card("Heart", 10)
        self.card = Card("Heart", 1)
        self.cards = [self.card1, self.card, self.card2]

    def test_check_for_ace(self):
        self.assertEqual(True, CardGame.check_for_ace(self, self.card))

    def test_check_which_is_the_highest_card(self):
        self.assertEqual(self.card1, CardGame.highest_card(self, self.card1, self.card2))

    def test_check_can_calculate_total_value_of_all_cards(self):
        self.assertEqual("You have a total of 17", CardGame.cards_total(self, self.cards))


if __name__ == "__main__":
    unittest.main()
    
        
