
public class Teacher
{
    //instance variable
    private int teacher_id, working_hours;
    private String teacher_name, address, working_type, employment_status;
    //constructor
    public Teacher(int teacher_id, String teacher_name, String address, String working_type, String employment_status)
    {
        //assigning instance variable with local variable 
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.address = address;
        this.working_type = working_type;
        this.employment_status = employment_status;
    }
    
    //Accessor method for private instance variable
    public int getTeacher_id()
    {
        
        return this.teacher_id;
    }
    public String getTeacher_name()
    {
        
        return this.teacher_name;
    }
    public String getAddress()
    {
        
        return this.address;
    }
    public String getWorking_type()
    {
        
        return this.working_type;
    }
    public String getEmployment_status()
    {
        
        return this.employment_status;
    }
    public int getWorking_hours()
    {
        return this.working_hours;
    }
    
    //mutator method to set the working hour
    public void setWorking_hours(int working_hours)
    {
        this.working_hours = working_hours;
    }
    
    //display teacher info
    public void display_details()
    {
        System.out.println("Teacher ID = "+ teacher_id);
        System.out.println("Teacher Name = "+ teacher_name);
        System.out.println("Teacher Address = "+ address);
        System.out.println("Working type of Teacher = "+ working_type);
        System.out.println("Employment status of Teacher = "+ employment_status);
        //check working_hours
        if(working_hours > 0)
        {
            System.out.println("Working Hours = " + working_hours);
        }
        else
        {
            System.out.println("Working Hours not assigned");
        }
    }
}
