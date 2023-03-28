class Book:
    def __init__(self, title, author, date_of_publication):
        self.title = title
        self.author = author
        self.date_of_publication = date_of_publication
        self.number_pulped = 100000

    def read(self):
        return "It put me into a coma"

