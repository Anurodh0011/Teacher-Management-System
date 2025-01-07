public class Lecturer extends Teacher
{
    //instance variable of Teacher class
    private String department;
    private int years_of_experience;
    private int graded_score;
    private boolean has_graded;
    public Lecturer(int teacher_id, String teacher_name, String address,
    String working_type, String employment_status, String department,
    int years_of_experience, int working_hours)
    {
        /*calling teacher class constructor and a setter method 
        using super keyword. While calling from parent classdatatypes are ignored*/
        super(teacher_id, teacher_name, address, working_type, employment_status);
        super.setWorking_hours (working_hours);
        this.department = department;
        this.years_of_experience = years_of_experience;
        this.graded_score = 0;
        this.has_graded = false;
    }
    //Accessor method for Lecturer class attributes
    public String getDepartment()
    {
        return this.department;
    }
    
    public int getYears_of_experience()
    {
        
        return this.years_of_experience;
    }
    
    public int getGraded_score()
    {
        
        return this.graded_score;
    }
    
    public boolean getHas_graded()
    {
        return this.has_graded;
    }
    
    
    //mutator method for graded_score
    public void setGraded_score(int graded_score)
    {
        this.graded_score = graded_score;
    }
    
    
    //used to grade assignments of students who have submitted their assignments on time.
    public void grade_assignment(int graded_score, String department, int years_of_experience)
    {
        
        /*both years_of_experience should be greater or equal to 5 and
        local variable department should match with the instance variable
        department*/
         if(years_of_experience >= 5 && this.department == department)
         {
             
             //for filtering valid marks
             if(graded_score<=100 && graded_score>=0)
             {
                 //for grading score
                 
                 if(graded_score>=70)
                 {
                     System.out.println("Grade obtained: A");
                 }
                 else if(graded_score>=60)
                 {
                     System.out.println("Grade obtained: B");
                 }
                 else if(graded_score>=50)
                 {
                     System.out.println("Grade obtained: C");
                 }
                 else if(graded_score>=40)
                 {
                     System.out.println("Grade obtained: D");
                 }
                 else
                 {
                     System.out.println("Grade obtained: E");
                 }
                 
             }
             else
             {
                 System.out.println("Please enter valid marks.");
             }
             has_graded = true;
         }
         else
         {
          System.out.println("Not Qualified");   
         }
    }
    //display_details overriding the one in the teacher class
    //display the details of Lecture
    @Override
    public void display_details()
    {
        super.display_details();//call the display_details method of the Teacher
        System.out.println("Department Name: "+department);
        System.out.println("Years of Experience: "+years_of_experience);
        if(has_graded)
        {
            System.out.println("Graded : "+graded_score);
        }
        else
        {
            System.out.println("Score not graded yet");
        }
    }
}