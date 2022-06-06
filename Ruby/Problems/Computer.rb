class Computer
    @@users = {} #hash ={username => password}
    def initialize(username, password)
      @username = username
      @password = password
      @files = {}
      @@users[username] = password
    end
    
    def create(filename)
      time = Time.now #to get local time
      @files[filename] = time
      puts "#{filename} was created at #{time} by #{@username}. "
    end
    
    def Computer.get_users #by giving like this you can call this method without using the obj
      puts @@users
    end
end
  
  my_computer = Computer.new("jeru", "jeru@2002")
  puts my_computer.create("password.txt")
  Computer.get_users
  