class BankAccount:
    def __init__(self, input_holder_name, input_balance, input_type):
        self.holder_name = input_holder_name
        self.balance = input_balance
        self.type = input_type
        self._rates = {
            "personal": 10,
            "business": 50
        }

    def pay_in(self, amount):
        self.balance += amount

#  if self.rates hasn't been put in
    # def pay_monthly_fee(self):
    #     if self.type == "business":
    #         self.balance -= 50
    #     elif self.type == "personal":
    #         self.balance -= 10

    def pay_monthly_fee(self):
        self.balance -= self._rates[self.type]

# def get_account_name(account):
#     return account["holder_name"]