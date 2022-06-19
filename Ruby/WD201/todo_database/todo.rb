require "active_record"

class Todo < ActiveRecord::Base

  def to_displayable_string
    display_status = completed ? "[X]" : "[ ]"
    display_date = (due_date == Date.today) ? nil : due_date
    "#{id}#{display_status} #{todo_text} #{display_date}"
  end

  def self.overdue
    where("due_date < ?", Date.today)
  end
  def self.duetoday
    where(due_date: Date.today)
  end
  def self.duelater
    where("due_date > ?", Date.today)
  end

  def self.to_displayable_list
    all.map { |todo| todo.to_displayable_string }
  end

  def self.show_list
    puts "My Todo-list\n\n"
    
    puts "Overdue\n"
    puts overdue.to_displayable_list
    puts "\n\n"
   
    puts "Due Today\n"
    puts duetoday.to_displayable_list
    puts "\n\n"

    puts "Due Later\n"
    puts duelater.to_displayable_list
    puts "\n\n"
  end
  
  def self.add_task(todohash)
    Todo.create!(todo_text: todohash[:todo_text], due_date: Date.today + todohash[:due_in_days], completed: false)
  end
 
  def self.mark_as_complete(todo_id)
    Todo.find(todo_id).update(completed: true)
    exit
  end
end