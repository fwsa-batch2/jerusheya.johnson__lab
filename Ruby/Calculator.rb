class Simple_Calc
    @@a = 10
    @@b = 20
    @@c = 2
    @@d = 3
    def operation
        puts @@a + @@b
        puts @@a - @@b
        puts @@a * @@b
        puts @@a / @@c
        puts @@a % @@b
        puts @@a ** @@d
    end
end
obj = Simple_Calc.new
obj.operation