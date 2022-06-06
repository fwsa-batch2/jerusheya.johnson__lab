class Person
   #class variable to count the entries
    @@people_count = 0
    
    def initialize(name)
      #local variable to get the entries
      @name = name
      @@people_count += 1
    end
    
    def self.number_of_instances
      return @@people_count
    end
end
  
  Person.new("Yukihiro")
  Person.new("David")
  
  puts "Number of Person instances: #{Person.number_of_instances}"