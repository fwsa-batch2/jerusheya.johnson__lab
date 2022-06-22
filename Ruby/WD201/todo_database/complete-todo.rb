require "./connect_db.rb"
require "./todo.rb"

connect_db!
Todo.show_list
puts "enter the task_id you want to mark as completed"
todo_id=gets.strip
Todo.mark_as_completed(todo_id)
puts "Done! ID[#{todo_id}] is marked as completed"

puts Todo.to_displayable_list