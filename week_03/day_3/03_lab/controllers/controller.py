from app import app
from flask import render_template
from models.books import orders


@app.route('/')
def index():
    return render_template("index.html", title="Home", orders=orders)

@app.route("/orders/<int:id>")
def single_order(id):
    return render_template("order.html", title="Individual Order", order=orders[id])