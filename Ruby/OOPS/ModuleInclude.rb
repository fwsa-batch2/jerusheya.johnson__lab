module MartialArts
    def swordsman
      puts "I'm a swordsman."
    end
end
  
  class Ninja
  include MartialArts #to include the defined module
    def initialize(clan)
      @clan = clan
      puts @clan
    end
  end
  obj = Ninja.new ("ninja") #just creating an obj calls the constructor
  obj.swordsman #to call method
  
  class Samurai
  include MartialArts # to call the defined module
    def initialize(shogun)
      @shogun = shogun
      puts @shogun
    end
  end
  obj1 = Samurai.new ("samurai") #
  obj1.swordsman #to call method