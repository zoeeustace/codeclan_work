class Airplane:
    def __init__(self, type, crew, airport):
        self.type = type
        self.crew = crew
        self.airport = airport

    def add_member(self, new_member):
        self.crew.append(new_member)

    def check_glue(self):
        return "This is the wrong day to stop sniffing glue"
    
    def hasShirley(self):
        
        for member in self.crew:
            if member ==  "Shirley":
                return "Please, call me Shirley"
        else:
            return "Don't call me Shirley"
    # MAKE SURE INDENTED CORRECTLY!!!
        #   if "Shirley" in self.crew:
        #   rather than using the for loop - would be better for large lists of data