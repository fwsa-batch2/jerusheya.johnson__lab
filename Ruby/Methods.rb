#method1
def method1
    puts "This is a method"
end

#invoking method1
method1

#method2
def method2(var1="a", var2="b")
    puts "This is a method with parameter #{var1} and #{var2}"
end

#invoking method2
method2 #calling method without parameter
method2 "Jeru", "Sess" #calling method with parameter

#addition
def addition
    @a = 20
    @b = 30
    sum = @a+@b
    sum
end
puts "The sum is #{addition}"