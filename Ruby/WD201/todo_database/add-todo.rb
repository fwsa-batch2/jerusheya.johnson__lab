
require "/home/jerusheyajohnson/Documents/jerusheya.johnson__lab/Ruby/WD201/todo_CLI/connect_db.rb"
require "/home/jerusheyajohnson/Documents/jerusheya.johnson__lab/Ruby/WD201/todo_CLI/todo.rb"

def get_new_todo
  puts "Todo text:"
  todo_text = gets.strip
  return nil if todo_text.empty?

  puts "How many days from now is it due? (give an integer value)"
  due_in_days = gets.strip.to_i

  {
    todo_text: todo_text,
    due_in_days: due_in_days,
  }
end

connect_db!
h = get_new_todo
if h
  new_todo = Todo.add_task(h)
  puts "New todo created with id #{new_todo.id}"
  Todo.show_list
end


connect_db!
h = get_new_todo
if h
  new_todo = TodoList.add_task(h)
  puts "New todo created with id #{new_todo.id}"
#   Todo.show_list
end