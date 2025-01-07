
public class Tutor extends Teacher
{
    private double salary;
    private String specialization, academic_qualifications;
    private int performance_index;
    private boolean is_certified;
    
    //constructor
    public Tutor(int teacher_id, String teacher_name, String address, String working_type, String employment_status, int working_hours, double salary, String specialization, String academic_qualifications, int performance_index)
    {
        //Calling Teacher class constructor
        super(teacher_id, teacher_name, address, working_type, employment_status);
        //ask teacher about call to a setter method of teacher class
        super.setWorking_hours(working_hours);
        this.salary = salary;
        this.specialization = specialization;
        this.academic_qualifications = academic_qualifications;
        this.performance_index = performance_index;
        this.is_certified = false;
    }
    
    // Accessor method for each attribute of Tutor class
    public double getSalary()
    {
        return this.salary;
    }
    public String getSpecialization()
    {
        return this.specialization;
    }
    public String getAcademic_qualifications()
    {
        return this.academic_qualifications;
    }
    public int getPerformance_index()
    {
        return this.performance_index;
    }
    public boolean getIs_certified()
    {
        return this.is_certified;
    }
    
    //setter method for salary
    public void setSalary(double salary, int performance_index)
    {
        
        if(performance_index>5 && getWorking_hours()>20)
        {
            if(performance_index >= 5 && performance_index <= 7)
            {
                salary = salary + 0.05 * salary;
            }
            else if(performance_index == 8 || performance_index == 9)
            {
                salary = salary + 0.1 * salary;
            }
            else if(performance_index == 10)
            {
                salary = salary + 0.2 * salary;
            }
            is_certified = true;
        }
        else
        {
            System.out.println("Salary cannot be approved");
        }
        this.salary = salary;
        this.performance_index = performance_index;
    }
    
    //methods for removing tutor
    public void remove_tutor()
    {
        if(!is_certified)
        {
            this.salary = 0;
            this.specialization = "";
            this.academic_qualifications = "";
            this.performance_index = 0;
        }
        else
        {
            System.out.println("Qualified teacher cannot be removed");
        }
        this.is_certified = false;
    }
    @Override
    public void display_details()
    {
        //super class display_details() method is called using super keyword.
        super.display_details();
        if(!is_certified)
        {
            System.out.println("Salary: "+this.salary);
            System.out.println("Academic Qualification: "+ this.academic_qualifications);
            System.out.println("Specialization: "+ this.specialization);
            System.out.println("Performance Index: "+ this.performance_index);
        }
    }
}
