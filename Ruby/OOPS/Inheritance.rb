class Animal

    #constructor should be in the name initialize
    def initialize
        puts "this is a constructor #{@name}"
    end

    #methods
    def run(var1="",var2="")
        puts "run method1 #{var1}"
    end

end

class Mammals < Animal

    #constructor
    def initialize 
       puts "this is child constructor"
    end

    #methods
    def run(var1,var2)
        super  #runs the code in the parent method also(like calling the parent method)
        puts "run method2 #{var1} #{var2}"
    end
end

obj1=Animal.new 
obj1.run("dog")
obj2=Mammals.new
obj2.run("dog","lab")

puts Mammals.superclass