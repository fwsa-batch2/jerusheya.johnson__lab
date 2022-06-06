#each instance of Person will have its own @name.

#class
class Person 
    $jeru="1"
    def initialize(name)
      @name = name
      puts "jeru"
    end
end

#calling a class
Person.new("jeru")
puts $jeru
