
require "/home/jerusheyajohnson/Documents/jerusheya.johnson__lab/Ruby/WD201/todo_database/connect_db.rb"
require "/home/jerusheyajohnson/Documents/jerusheya.johnson__lab/Ruby/WD201/todo_database/todo.rb"

def get_new_todo
  puts "Todo text:"
  todo_text = gets.strip
  return nil if todo_text.empty?

  puts "How many days from now is it due? (give an integer value)"
  due_in_days = gets.strip.to_i

  @h={
    todo_text: todo_text,
    due_in_days: due_in_days,
  }
end

connect_db!
@h[:todo_text] = todo_text 
@h[:due_in_days]= due_date
@h = get_new_todo
if @h
  new_todo = Todo.add_task(todo_text,due_date)
  puts "New todo created with id #{new_todo.id}"
  Todo.show_list
end