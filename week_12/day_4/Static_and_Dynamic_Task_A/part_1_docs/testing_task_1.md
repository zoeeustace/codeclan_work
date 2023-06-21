### Testing task 1:

# Carry out static testing on the code below.
# Comment on any errors that you see below.

Note that we are only looking for errors here.

**Not** any issues with, i.e.: 
Thinking that methods should be renamed or should be class level, or using string interpolation etc. 

These aren't errors but rather standards that vary from developer to developer. 

Only comment on errors that would stop the tests running.

```python

class CardGame:


  def check_for_ace(self, card):
    if card.value = 1: # this should have a double equals: ==
      return True
    else # this should have a colon after the else: 
      return False
   

  dif highest_card(self, card1 card2): # this should be def instead of dif, and there needs to be a comma between card1 and card2
  if card1.value > card2.value: # indentation needs to be fixed up to l31, they all need an indentation each
    return card # this return should be card1
  else:
    return card2
  


def cards_total(self, cards): # this whole code block needs to be indented to the right to bring it within the class
  total # total needs to be given a starting value: total = 0
  for card in cards:
    total += card.value
    return "You have a total of" + total # this line needs to be indented back to be out of the for loop, and there needs to be a space after the of and a str() around total otherwise they can't concatonate
  
```
