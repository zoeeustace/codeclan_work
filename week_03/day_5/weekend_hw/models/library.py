from models.book import *

book1 = Book("The Great Gatsby", "F Scott Fitzgerald", "Literary Realism")
book2 = Book("The Catcher in the Rye", "J D Sallinger", "Young Adult")
book3 = Book("The Electric Kool-Aid Acid Test", "Tom Wolfe", "Nonfiction")
books = [book1, book2, book3]

def find_book_by_id(id):
    for book in books:
        if book.id == id:
            return book
    return None

def add_new_book(book):
    books.append(book)

def delete_book(title):
    book_to_delete = None
    for book in books:
        if book.title == title:
            book_to_delete = book
            break

    books.remove(book_to_delete)