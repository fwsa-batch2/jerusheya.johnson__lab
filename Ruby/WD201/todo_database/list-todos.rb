require './connect_db.rb'
require './todo.rb'
require './add-todo.rb'
require './complete-todo.rb'

connect_db!
Todo.show_list
