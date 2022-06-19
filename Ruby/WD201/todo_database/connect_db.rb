require 'active_record'

def connect_db!
  ActiveRecord::Base.establish_connection(
    host: 'localhost', 
    adapter: 'mysql2',
    database: 'Disney_Holiday_Hype', 
    username: 'jerusheya', 
    password: 'Jeru@2002'
  )
end