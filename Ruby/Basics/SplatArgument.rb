#splat operator converts the arguments into an array

def order_pizza(*pizzas)
    if pizzas.count == 1 
      puts "1 pizza!"
    elsif pizzas.count == 2
      puts "2 pizzas!"
    elsif pizzas.count == 3
      puts "3 pizzas!"
    end 
end 
  order_pizza("Big pizza A")
  order_pizza("Big pizza A", "Big pizza B")
  order_pizza("Big pizza A", "Big pizza B", "Big pizza C")


def print_phrases(main_phrase, *phrases)
    puts "This is main phrase: #{main_phrase}" 
    puts phrases 
    puts phrases.inspect   #ans: array with its elements
    puts phrases.class   #ans: array
end 
  print_phrases("phrase one","phrase two", "phrase three", "phrase four", "phrase five")
  

def sum_of_all_args(one, two, *x)
    sum = one + two 

    x.each do |number|
        sum+=number
    end
    puts sum

  
end 
  sum_of_all_args(1,2,3,4,5,6,7,8,9,10)
  #sum_of_all_args()  #can create empty argumented constructor also