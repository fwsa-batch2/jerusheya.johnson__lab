require '/home/jerusheyajohnson/Documents/jerusheya.johnson__lab/Ruby/WD201/todo_CLI/connect_db.rb'
connect_db!

ActiveRecord::Migration.create_table(:todos) do |t|
  t.column :todo_text, :text
  t.column :due_date, :date
  t.column :completed, :bool  
end