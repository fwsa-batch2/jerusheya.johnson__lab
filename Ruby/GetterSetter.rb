class Employee
    public
        def setEmployeeId(empId)
            @employeeId = empId
        end

        def setEmployeeName(empName)
            @employeeName = empName
        end

        def getEmployeeId
            return @employeeId
        end

        def getEmployeeName
            return @employeeName
        end
end

employee1 = Employee.new
employee1.setEmployeeId(5)
employee1.setEmployeeName('Water')
puts "Employee ID is #{employee1.getEmployeeId()}"
puts "Employee Name is #{employee1.getEmployeeName()}"