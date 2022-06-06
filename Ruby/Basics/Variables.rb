#global variable 
$global_variable = 10

class Customer
      
    # class variable
     @@no_of_customers = 0
       
     def initialize(id, name, addr)
           
    # An instance Variable
     @cust_id = id
     @cust_name = name
     @cust_addr = addr
     end
      
    # displaying result p in ruby
     def display_details()
     puts "Customer id #@cust_id"
     puts "Customer name #@cust_name"
     puts "Customer address #@cust_addr"
     end
       
     def total_no_of_customers()
           
    # class variable
     @@no_of_customers += 1
     puts "Total number of customers: #@@no_of_customers"
     end
end
      
    # Create Objects
    cust1 = Customer.new("1", "Jeru", "Sivanthipuram")
    cust2 = Customer.new("2", "Sess", "Vickramasingapuram")
      
    # Call Methods
    cust1.display_details()
    cust1.total_no_of_customers()
    cust2.display_details()
    cust2.total_no_of_customers()


   
class Class1
     def print_global
        puts "Global variable in Class1 is #$global_variable"
     end
end

class1obj = Class1.new
class1obj.print_global
