=begin
* toolbox that contains a set methods and constants.
* modules as being very much like classes, 
  only modules can’t create instances and can’t have subclasses. 
  They’re just used to store things!
=end

module Circle

    PI = 3.141592653589793
    
    def Circle.area(radius)
      puts PI * radius**2
    end
    
    def Circle.circumference(radius)
      puts 2 * PI * radius
    end
end

require 'date' # imports module
puts Date.today #prints today's date

