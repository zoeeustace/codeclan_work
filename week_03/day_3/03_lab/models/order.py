class Order():
    def __init__(self, id, customer_name, order_date, quantity, book_title, author, read):
        self.id = id
        self.customer_name = customer_name
        self.order_date = order_date
        self.quantity = quantity
        self.book_title = book_title
        self.author = author
        self.read = read