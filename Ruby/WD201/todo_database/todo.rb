require 'active_record'
class Todo < ActiveRecord::Base
      def due_today?
        due_date == Date.today
      end

      def to_displayable_string
        display_status = completed ? "[X]" : "[ ]"
        display_date = due_today? ? nil : due_date
        "#{display_status} #{todo_text} #{display_date}"
      end

      def self.to_displayable_list
        all.map {|todo| todo.to_displayable_string }
      end

      def self.show_list(todos)  
        result = []
        todos.each do |rec|
          if rec.date == due_date
            result.push("#{rec.to_displayable_string}")
          else
            result.push("#{rec.to_displayable_string} #{rec.date}")
          end
        end
    
        return result 
      end
    
      
      def self.add_task(todo_text,due_date)
        hash={}
        hash[:todo_text]=text
        hash[:due_date]=Date.Today+dates_remaining
        hash[:completed]=false
        todos.push(hash)
      end
      def self.mark_as_complete(todo_id)
        if todos[todo_id].include? todo_id
            @completed == true
        else  
            @completed == false
        end
      end
end