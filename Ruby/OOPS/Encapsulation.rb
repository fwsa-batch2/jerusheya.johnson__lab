=begin
#to initialize a variable and create getter method
class Person
    def name  
      @name
    end
  
    def name=(str)
      @name = str  #sets a variable to the param
      #or
      self.name=str  #calls the setter method and sets the value to the param    
    end
end
=end

class AttrAccessor

    #attr_accessor
    #create both setter and getter methods

    attr_accessor :name

    #attr_writer
    #initialize a variable name and create setter method

    attr_writer :class ,:address
    

    #attr_reader
    #inititalize a variable name and creater getter method
    
    attr_reader :class 
   

    #attr
    #similar to attr_reader
    
    attr :address
    
    

end

obj=AttrAccessor.new
obj.name="jeru"
puts obj.name

obj.class="12"
puts obj.class

obj.address="vickramasingapuram"
puts obj.address










