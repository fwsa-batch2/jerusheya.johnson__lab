require 'active_record'
class Todo < ActiveRecord::Base
      def self.due_today?
        @due_date == Date.today
      end

      def to_displayable_string
        display_status = completed ? "[X]" : "[ ]"
        "#{display_status} #{todo_text}"
      end

      def self.to_displayable_list
        all.map {|todo| todo.to_displayable_string }
      end

      def self.show_list 
        result = []
        all.each do |rec|
          if Todo.due_today?
            result.push("#{rec.to_displayable_string}")
          else
            result.push("#{rec.to_displayable_string} #{rec.due_date}")
          end
        end
    
        return result 
      end
      def self.insert_into_table(todo_text, due_date)
        Todo.create!(todo_text: todo_text, due_date: due_date, completed: false)
      end
      
      def self.add_task(h)
        todo_text=h[:todo_text]
        no_of_days=h[:due_in_days]
        due_date=Date.today+no_of_days
        Todo.insert_into_table(todo_text,due_date)
       
      end
      def self.mark_as_completed(todo_id)
        mark_as_complete = Todo.find(todo_id)
        mark_as_complete.completed = true
        mark_as_complete.save
      end
end