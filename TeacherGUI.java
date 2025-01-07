import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.BorderFactory;
import java.awt.GridLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TeacherGUI implements ActionListener
{
    ArrayList<Teacher> myArrayList;
    
    JFrame myFrame,myFrame1, myFrame2, myFrame3,myFrame4, myFrame5;
    
    JPanel add_lecturer_panel, add_tutor_panel, grade_assignment_panel, set_salary_panel, side_panel, side_panel1, side_panel2, side_panel3,
    lecturer_details_panel, tutor_details_panel, grade_details_panel, set_salary_details_panel, remove_tutor_panel, side_panel4,
    remove_details_panel, display_panel, side_panel5, display_details_panel, heading_panel, heading_panel1, heading_panel2, heading_panel3, heading_panel4, lecturer_main_panel, tutor_main_panel,
    grade_main_panel, salary_main_panel, remove_main_panel;
    
    JLabel lecturer_id, new_lecturer_id, tutor_id, new_tutor_id, lecturer_name, tutor_name, lecturer_address,tutor_address,
     lecturer_working_type, tutor_working_type, lecturer_employment_status, tutor_employment_status,
     lecturer_working_hours, tutor_working_hours, department, new_department, years_of_experience, new_years_of_experience,
     graded_score, salary, new_salary, specialization, academic_qualifications,
     performance_index, new_performance_index, teacher_id, set_salary_heading;
    
    JTextField lecturer_id_field, new_lecturer_id_field, tutor_id_field, new_tutor_id_field, lecturer_name_field, tutor_name_field,
     lecturer_address_field, tutor_address_field, lecturer_working_type_field, tutor_working_type_field,
     lecturer_employment_status_field, tutor_employment_status_field,lecturer_working_hours_field,
     tutor_working_hours_field, department_field, new_department_field, years_of_experience_field, graded_score_field,
     new_years_of_experience_field, salary_field, new_salary_field, specialization_field, academic_qualifications_field,
     performance_index_field, new_performance_index_field, teacher_id_field;
    
    JButton lecturer, lecturer1, lecturer2, lecturer3, lecturer4, lecturer5, tutor, tutor1, tutor2, tutor3, tutor4,
    tutor5, grade,grade1, grade2, grade3, grade4, grade5, set_salary,set_salary1, set_salary2, set_salary3, set_salary4,
    set_salary5, remove_tutor, remove_tutor1, remove_tutor2, remove_tutor3, remove_tutor4, remove_tutor5, display,
    display1, display2, display3, display4, display5;
     
    JButton add_lect_button, clear_lect_button, add_tut_button, clear_tut_button,
     grade_button, clear_grade_button, set_salary_button, clear_salary_button,
     remove_button, clear_remove_button, display_lect_button, display_tut_button;
    
    
     
    TeacherGUI()
    {
        //Creating new ArrayList of the Teacher class to store Lecturer and Tutor objects.
        myArrayList = new ArrayList<Teacher>();
        
        
        //***********************************GUI Part*************************************
        myFrame = new JFrame();
        myFrame.setSize(1000,735);//(width, height)
        myFrame.setLayout(null);
        
        myFrame1 = new JFrame();
        myFrame1.setSize(1000,735);//(width, height)
        myFrame1.setLayout(null);
        
        myFrame2 = new JFrame();
        myFrame2.setSize(1000,735);//(width, height)
        myFrame2.setLayout(null);
        
        myFrame3 = new JFrame();
        myFrame3.setSize(1000,735);//(width, height)
        myFrame3.setLayout(null);
        
        myFrame4 = new JFrame();
        myFrame4.setSize(1000,735);//(width, height)
        myFrame4.setLayout(null);
        
        myFrame5 = new JFrame();
        myFrame5.setSize(1000,735);//(width, height)
        myFrame5.setLayout(null);
        
        //**************************Add Lecturer************************
        //for adding a lecturer
        
        add_lecturer_panel = new JPanel();
        add_lecturer_panel.setBounds(0, 0, 1000, 700);
        
        side_panel = new JPanel();
        side_panel.setBounds(0, 0, 200, 700);
        
        //heading panel for heading
        heading_panel = new JPanel();
        heading_panel.setBackground(Color.LIGHT_GRAY);
        heading_panel.setBounds(0, 0, 800, 200);
        
        lecturer_main_panel = new JPanel();
        lecturer_main_panel.setBounds(200, 0, 800, 700);

        JLabel lecturer_heading = new JLabel("Lecturer Details");
        lecturer_heading.setFont(new Font("Arial", Font.BOLD, 22));
        lecturer_heading.setBounds(220, 100, 200, 30);
        
        //adding heading to heading_panel
        heading_panel.add(lecturer_heading);
        

        
        lecturer_details_panel = new JPanel();
        lecturer_details_panel.setBounds(0, 200, 800, 500);
        
        //creating buttons for side bar
        //no need to set bounds bcz layout is set to grid
        lecturer = new JButton("Lecturer");
        tutor = new JButton("Tutor");        
        grade = new JButton("Grade");        
        set_salary = new JButton("Set Salary");
        remove_tutor = new JButton("Remove Tutor");
        display = new JButton("Display");
        
        //adding elements in the side panel
        side_panel.add(lecturer);
        side_panel.add(tutor);
        side_panel.add(grade);
        side_panel.add(set_salary);
        side_panel.add(remove_tutor);
        side_panel.add(display);
        
        lecturer_id = new JLabel("ID:");
        lecturer_id.setBounds(178, 25, 145, 20);
        lecturer_id_field = new JTextField();
        lecturer_id_field.setBounds(327, 25, 145, 20);
           
        lecturer_name = new JLabel("Name:");
        lecturer_name.setBounds(178, 57, 145, 20);
        lecturer_name_field = new JTextField();
        lecturer_name_field.setBounds(327, 57, 145, 20);
        
        lecturer_address = new JLabel("Address:");
        lecturer_address.setBounds(178, 89, 145, 20);
        lecturer_address_field = new JTextField();
        lecturer_address_field.setBounds(327, 89, 145, 20);
        
        lecturer_working_type = new JLabel("Working Type:");
        lecturer_working_type.setBounds(178, 121, 145, 20);
        lecturer_working_type_field = new JTextField();
        lecturer_working_type_field.setBounds(327, 121, 145, 20);
        
        lecturer_employment_status = new JLabel("Employment Status:");
        lecturer_employment_status.setBounds(178, 153, 145, 20);
        lecturer_employment_status_field = new JTextField();
        lecturer_employment_status_field.setBounds(327, 153, 145, 20);
        
        lecturer_working_hours = new JLabel("Working Hours:");
        lecturer_working_hours.setBounds(178, 185, 145, 20);
        lecturer_working_hours_field = new JTextField();
        lecturer_working_hours_field.setBounds(327, 185, 145, 20);
        
        years_of_experience = new JLabel("Years of Experience:");
        years_of_experience.setBounds(178, 217, 145, 20);
        years_of_experience_field = new JTextField();
        years_of_experience_field.setBounds(327, 217, 145, 20);
        
        department = new JLabel("Department:");
        department.setBounds(178, 249, 145, 20);
        department_field = new JTextField();
        department_field.setBounds(327, 249, 145, 20);
        
        add_lect_button = new JButton("Add a Lecturer");
        add_lect_button.setBounds(216, 285, 177, 37);
        
        clear_lect_button = new JButton("Clear");
        clear_lect_button.setBounds(216, 329, 177, 37);
        
        //adding elements in add_lecturer_panel
        lecturer_details_panel.add(lecturer_id);
        lecturer_details_panel.add(lecturer_id_field);
        lecturer_details_panel.add(lecturer_name);
        lecturer_details_panel.add(lecturer_name_field);
        lecturer_details_panel.add(lecturer_address);
        lecturer_details_panel.add(lecturer_address_field);
        lecturer_details_panel.add(lecturer_working_type);
        lecturer_details_panel.add(lecturer_working_type_field);
        lecturer_details_panel.add(lecturer_employment_status);
        lecturer_details_panel.add(lecturer_employment_status_field);
        lecturer_details_panel.add(lecturer_working_hours);
        lecturer_details_panel.add(lecturer_working_hours_field);
        lecturer_details_panel.add(years_of_experience);
        lecturer_details_panel.add(years_of_experience_field);
        lecturer_details_panel.add(department);
        lecturer_details_panel.add(department_field);
        lecturer_details_panel.add(add_lect_button);
        lecturer_details_panel.add(clear_lect_button);
        
        lecturer_main_panel.add(lecturer_details_panel);
        lecturer_main_panel.add(heading_panel);
        
        //adding lecturer_details_panel
        add_lecturer_panel.add(lecturer_main_panel);
        
        //adding side_panel in the add_lecturer_panel
        add_lecturer_panel.add(side_panel);
        add_lecturer_panel.add(lecturer_main_panel);
        
        //*****************************Tutor******************************
        add_tutor_panel = new JPanel();
        add_tutor_panel.setBounds(0, 0, 1000, 700);
        
        side_panel1 = new JPanel();
        side_panel1.setBounds(0, 0, 200, 700);
        
        //heading panel for heading
        heading_panel1 = new JPanel();
        heading_panel1.setBackground(Color.LIGHT_GRAY);
        heading_panel1.setBounds(0, 0, 800, 200);
        
        tutor_main_panel = new JPanel();
        tutor_main_panel.setBounds(200, 0, 800, 700);

        JLabel tutor_heading = new JLabel("Tutor Details");
        tutor_heading.setFont(new Font("Arial", Font.BOLD, 22));
        tutor_heading.setBounds(240, 100, 800, 30);
        
        //adding heading to heading_panel
        heading_panel1.add(tutor_heading);
        
        
        
        //creating buttons for side bar
        //no need to set bounds bcz layout is set to grid
        lecturer1 = new JButton("Lecturer");
        tutor1 = new JButton("Tutor");        
        grade1 = new JButton("Grade");        
        set_salary1 = new JButton("Set Salary");
        remove_tutor1 = new JButton("Remove Tutor");
        display1 = new JButton("Display");
        
        //adding elements in the side panel
        side_panel1.add(lecturer1);
        side_panel1.add(tutor1);
        side_panel1.add(grade1);
        side_panel1.add(set_salary1);
        side_panel1.add(remove_tutor1);
        side_panel1.add(display1);
        
        tutor_details_panel = new JPanel();
        tutor_details_panel.setBounds(0, 200, 800, 500);
        
        tutor_id = new JLabel("ID:");
        tutor_id.setBounds(178, 25, 145, 20);
        tutor_id_field = new JTextField();
        tutor_id_field.setBounds(327, 25, 145, 20);
           
        tutor_name = new JLabel("Name:");
        tutor_name.setBounds(178, 57, 145, 20);
        tutor_name_field = new JTextField();
        tutor_name_field.setBounds(327, 57, 145, 20);
        
        tutor_address = new JLabel("Address:");
        tutor_address.setBounds(178, 89, 145, 20);
        tutor_address_field = new JTextField();
        tutor_address_field.setBounds(327, 89, 145, 20);
        
        tutor_working_type = new JLabel("Working Type:");
        tutor_working_type.setBounds(178, 121, 145, 20);
        tutor_working_type_field = new JTextField();
        tutor_working_type_field.setBounds(327, 121, 145, 20);
        
        tutor_employment_status = new JLabel("Employment Status:");
        tutor_employment_status.setBounds(178, 153, 145, 20);
        tutor_employment_status_field = new JTextField();
        tutor_employment_status_field.setBounds(327, 153, 145, 20);
        
        tutor_working_hours = new JLabel("Working Hours:");
        tutor_working_hours.setBounds(178, 185, 145, 20);
        tutor_working_hours_field = new JTextField();
        tutor_working_hours_field.setBounds(327, 185, 145, 20);
        
        salary = new JLabel("Salary:");
        salary.setBounds(178, 217, 145, 20);
        salary_field = new JTextField();
        salary_field.setBounds(327, 217, 145, 20);
        
        specialization = new JLabel("Specialization:");
        specialization.setBounds(178, 249, 145, 20);
        specialization_field = new JTextField();
        specialization_field.setBounds(327, 249, 145, 20);
        
        academic_qualifications = new JLabel("Academic Qualifications:");
        academic_qualifications.setBounds(178, 281, 145, 20);
        academic_qualifications_field = new JTextField();
        academic_qualifications_field.setBounds(327, 281, 145, 20);
        
        performance_index = new JLabel("Performance Index:");
        performance_index.setBounds(178, 313, 145, 20);
        performance_index_field = new JTextField();
        performance_index_field.setBounds(327, 313, 145, 20);
        
        add_tut_button = new JButton("Add a Tutor");
        add_tut_button.setBounds(216, 349, 177, 37);
        
        clear_tut_button = new JButton("Clear");
        clear_tut_button.setBounds(216, 393, 177, 37);
        
        
        //adding elements in add_tutor_panel
        tutor_details_panel.add(tutor_id);
        tutor_details_panel.add(tutor_id_field);
        tutor_details_panel.add(tutor_name);
        tutor_details_panel.add(tutor_name_field);
        tutor_details_panel.add(tutor_address);
        tutor_details_panel.add(tutor_address_field);
        tutor_details_panel.add(tutor_working_type);
        tutor_details_panel.add(tutor_working_type_field);
        tutor_details_panel.add(tutor_employment_status);
        tutor_details_panel.add(tutor_employment_status_field);
        tutor_details_panel.add(tutor_working_hours);
        tutor_details_panel.add(tutor_working_hours_field);
        tutor_details_panel.add(salary);
        tutor_details_panel.add(salary_field);
        tutor_details_panel.add(specialization);
        tutor_details_panel.add(specialization_field);
        tutor_details_panel.add(academic_qualifications);
        tutor_details_panel.add(academic_qualifications_field);
        tutor_details_panel.add(performance_index);
        tutor_details_panel.add(performance_index_field);
        tutor_details_panel.add(add_tut_button);
        tutor_details_panel.add(clear_tut_button);
        
        tutor_main_panel.add(tutor_details_panel);
        tutor_main_panel.add(heading_panel1);
        
        add_tutor_panel.add(tutor_main_panel);
        add_tutor_panel.add(side_panel1);
        
        
        
        //**************************Grade an Assignment***************************
        grade_assignment_panel = new JPanel();
        grade_assignment_panel.setBounds(0, 0, 1000, 700);
        
        grade_details_panel = new JPanel();
        grade_details_panel.setBounds(0, 200, 800, 500);
        
        side_panel2 = new JPanel();
        side_panel2.setBounds(0, 0, 200, 700);
        
        //heading panel for heading
        heading_panel2 = new JPanel();
        heading_panel2.setBackground(Color.LIGHT_GRAY);
        heading_panel2.setBounds(0, 0, 800, 200);
        
        grade_main_panel = new JPanel();
        grade_main_panel.setBounds(200, 0, 800, 700);

        JLabel grade_heading = new JLabel("Grade an Assignments");
        grade_heading.setFont(new Font("Arial", Font.BOLD, 22));
        grade_heading.setBounds(240, 100, 800, 30);
        
        //adding heading to heading_panel
        heading_panel2.add(grade_heading);
        
        //creating buttons for side bar
        //no need to set bounds bcz layout is set to grid
        lecturer2 = new JButton("Lecturer");        
        tutor2 = new JButton("Tutor");        
        grade2 = new JButton("Grade");        
        set_salary2 = new JButton("Set Salary");
        remove_tutor2 = new JButton("Remove Tutor");
        display2 = new JButton("Display");
        
        //adding elements in the side panel
        side_panel2.add(lecturer2);
        side_panel2.add(tutor2);
        side_panel2.add(grade2);
        side_panel2.add(set_salary2);
        side_panel2.add(remove_tutor2);
        side_panel2.add(display2);
        
        new_lecturer_id = new JLabel("ID:");
        new_lecturer_id.setBounds(178, 25, 145, 20);
        new_lecturer_id_field = new JTextField();
        new_lecturer_id_field.setBounds(327, 25, 145, 20);
        
        graded_score = new JLabel("Graded Score:");
        graded_score.setBounds(178, 57, 145, 20);
        graded_score_field = new JTextField();
        graded_score_field.setBounds(327, 57, 145, 20);
        
        new_department = new JLabel("Department:");
        new_department.setBounds(178, 89, 145, 20);
        new_department_field = new JTextField();
        new_department_field.setBounds(327, 89, 145, 20);
        
        new_years_of_experience = new JLabel("Years of Experience:");
        new_years_of_experience.setBounds(178, 121, 145, 20);
        new_years_of_experience_field = new JTextField();
        new_years_of_experience_field.setBounds(327, 121, 145, 20);
        
        grade_button = new JButton("Grade the Assignments:");
        grade_button.setBounds(216, 157, 177, 37);
        
        clear_grade_button = new JButton("Clear");
        clear_grade_button.setBounds(216, 201, 177, 37);
        
        
        //adding elements in grade_assignment_panel
        grade_details_panel.add(new_lecturer_id);
        grade_details_panel.add(new_lecturer_id_field);
        grade_details_panel.add(graded_score);
        grade_details_panel.add(graded_score_field);
        grade_details_panel.add(new_department);
        grade_details_panel.add(new_department_field);
        grade_details_panel.add(new_years_of_experience);
        grade_details_panel.add(new_years_of_experience_field);
        grade_details_panel.add(grade_button);
        grade_details_panel.add(clear_grade_button);
        
        grade_main_panel.add(grade_heading);
        grade_main_panel.add(grade_details_panel);
        
        grade_assignment_panel.add(side_panel2);
        grade_assignment_panel.add(grade_main_panel);
        
        
        
        
        //********************************Set Salary******************************
        set_salary_panel = new JPanel();
        set_salary_panel.setBounds(0, 0, 1000, 700);
        
        set_salary_details_panel = new JPanel();
        set_salary_details_panel.setBounds(0, 200, 800, 500);
        
        side_panel3 = new JPanel();
        side_panel3.setBounds(0, 0, 200, 700);
        
        //heading panel for heading
        heading_panel3 = new JPanel();
        heading_panel3.setBackground(Color.LIGHT_GRAY);
        heading_panel3.setBounds(0, 0, 800, 200);
        
        salary_main_panel = new JPanel();
        salary_main_panel.setBounds(200, 0, 800, 700);

        JLabel salary_heading = new JLabel("Grade an Assignments");
        salary_heading.setFont(new Font("Arial", Font.BOLD, 22));
        salary_heading.setBounds(200, 100, 250, 30);
        
        //adding heading to heading_panel
        heading_panel3.add(salary_heading);
        
        /*creating buttons for side bar
        no need to set bounds bcz layout is set to grid*/
        lecturer3 = new JButton("Lecturer");        
        tutor3 = new JButton("Tutor");        
        grade3 = new JButton("Grade");        
        set_salary3 = new JButton("Set Salary");
        remove_tutor3 = new JButton("Remove Tutor");
        display3 = new JButton("Remove Tutor");
        
        //adding elements in the side panel
        side_panel3.add(lecturer3);
        side_panel3.add(tutor3);
        side_panel3.add(grade3);
        side_panel3.add(set_salary3);
        side_panel3.add(remove_tutor3);
        side_panel3.add(display3);
        
        new_tutor_id = new JLabel("ID:");
        new_tutor_id.setBounds(178, 25, 145, 20);
        new_tutor_id_field = new JTextField();
        new_tutor_id_field.setBounds(327, 25, 145, 20);
           
        new_salary = new JLabel("Salary:");
        new_salary.setBounds(178, 57, 145, 20);
        new_salary_field = new JTextField();
        new_salary_field.setBounds(327, 57, 145, 20);
        
        new_performance_index = new JLabel("Performance Index:");
        new_performance_index.setBounds(178, 89, 145, 20);
        new_performance_index_field = new JTextField();
        new_performance_index_field.setBounds(327, 89, 145, 20);
        
        set_salary_button = new JButton("Set Salary");
        set_salary_button.setBounds(216, 157, 177, 37);
        
        clear_salary_button = new JButton("Clear");
        clear_salary_button.setBounds(216, 201, 177, 37);
        
        //adding elements to the add_tutor_panel
        set_salary_details_panel.add(new_tutor_id);
        set_salary_details_panel.add(new_tutor_id_field);
        set_salary_details_panel.add(new_salary);
        set_salary_details_panel.add(new_salary_field);
        set_salary_details_panel.add(new_performance_index);
        set_salary_details_panel.add(new_performance_index_field);
        set_salary_details_panel.add(set_salary_button);
        set_salary_details_panel.add(clear_salary_button);
        
        salary_main_panel.add(heading_panel3);
        salary_main_panel.add(set_salary_details_panel);
        
        set_salary_panel.add(side_panel3);
        set_salary_panel.add(salary_main_panel);
        
        //**********************Remove Tutor**********************
        //for remove_tutor_panel
        remove_tutor_panel = new JPanel();
        remove_tutor_panel.setBounds(0, 0, 1000, 700);
        
        side_panel4 = new JPanel();
        side_panel4.setBounds(0, 0, 200, 700);
        
        //creating buttons for side bar
        //no need to set bounds bcz layout is set to grid
        lecturer4 = new JButton("Lecturer");
        tutor4 = new JButton("Tutor");        
        grade4 = new JButton("Grade");        
        set_salary4 = new JButton("Set Salary");
        remove_tutor4 = new JButton("Remove Tutor");
        display4 = new JButton("Display");
        
        //adding elements in the side panel
        side_panel4.add(lecturer4);
        side_panel4.add(tutor4);
        side_panel4.add(grade4);
        side_panel4.add(set_salary4);
        side_panel4.add(remove_tutor4);
        side_panel4.add(display4);
        
        remove_details_panel = new JPanel();
        remove_details_panel.setBounds(200, 0, 800, 700);
        
        teacher_id = new JLabel("ID:");
        teacher_id.setBounds(178, 60, 145, 20);
        teacher_id_field = new JTextField();
        teacher_id_field.setBounds(327, 60, 145, 20);
        
        remove_button = new JButton("Remove Tutor");
        remove_button.setBounds(178, 95, 294, 37);
        
        clear_remove_button = new JButton("Clear");
        clear_remove_button.setBounds(178, 137, 294, 37);
        
        remove_details_panel.add(teacher_id);
        remove_details_panel.add(teacher_id_field);
        remove_details_panel.add(remove_button);
        remove_details_panel.add(clear_remove_button);
        
        remove_tutor_panel.add(remove_details_panel);
        remove_tutor_panel.add(side_panel4);
        
        
        
        //****************************Display*******************************
        display_panel = new JPanel();
        display_panel.setBounds(0, 0, 1000, 700);
        
        side_panel5 = new JPanel();
        side_panel5.setBounds(0, 0, 200, 700);
        
        /*creating buttons for side bar
        no need to set bounds bcz layout is set to grid*/
        lecturer5 = new JButton("Lecturer");
        tutor5 = new JButton("Tutor");        
        grade5 = new JButton("Grade");        
        set_salary5 = new JButton("Set Salary");
        remove_tutor5 = new JButton("Remove Tutor");
        display5 = new JButton("Display");
        
        //adding elements in the side panel
        side_panel5.add(lecturer5);
        side_panel5.add(tutor5);
        side_panel5.add(grade5);
        side_panel5.add(set_salary5);
        side_panel5.add(remove_tutor5);
        side_panel5.add(display5);
        
        display_details_panel = new JPanel();
        display_details_panel.setBounds(200, 0, 800, 700);
        
        display_lect_button = new JButton("Display Lecturer");
        display_lect_button.setBounds(178, 150, 294, 37);
        
        display_tut_button = new JButton("Display Tutor");
        display_tut_button.setBounds(178, 220, 294, 37);

        
        display_details_panel.add(display_lect_button);
        display_details_panel.add(display_tut_button);
        
        display_panel.add(side_panel5);
        display_panel.add(display_details_panel);
        
        
        
        
        /*setting layout of all panels to null
        default layoout of the panel is FlowLayout which arranges items in a row*/
        lecturer_details_panel.setLayout(null);
        tutor_details_panel.setLayout(null);
        grade_details_panel.setLayout(null);
        set_salary_details_panel.setLayout(null);
        remove_details_panel.setLayout(null);
        display_details_panel.setLayout(null);
        side_panel.setLayout(new GridLayout(6, 1));
        side_panel1.setLayout(new GridLayout(6, 1));
        side_panel2.setLayout(new GridLayout(6, 1));
        side_panel3.setLayout(new GridLayout(6, 1));
        side_panel4.setLayout(new GridLayout(6, 1));
        side_panel5.setLayout(new GridLayout(6, 1));
        add_lecturer_panel.setLayout(null);
        add_tutor_panel.setLayout(null);
        grade_assignment_panel.setLayout(null);
        set_salary_panel.setLayout(null);
        remove_tutor_panel.setLayout(null);
        display_panel.setLayout(null);
        lecturer_main_panel.setLayout(null);
        heading_panel.setLayout(null);
        tutor_main_panel.setLayout(null);
        heading_panel1.setLayout(null);
        grade_main_panel.setLayout(null);
        heading_panel2.setLayout(null);
        salary_main_panel.setLayout(null);
        heading_panel3.setLayout(null);
        
        
        
        myFrame.add(add_lecturer_panel);
        myFrame1.add(add_tutor_panel);
        myFrame2.add(grade_assignment_panel);
        myFrame3.add(set_salary_panel);
        myFrame4.add(remove_tutor_panel);
        myFrame5.add(display_panel);
        
        JButton[] buttons = {lecturer, tutor, grade, set_salary, remove_tutor,
        display, lecturer1, tutor1, grade1, set_salary1, remove_tutor1, display1,
        lecturer2, tutor2, grade2, set_salary2, remove_tutor2, display2, lecturer3,
        tutor3, grade3, set_salary3, remove_tutor3, display3, lecturer4, tutor4,
        grade4, set_salary4, remove_tutor4, display4, lecturer5, tutor5, grade5,
        set_salary5, remove_tutor5, display5, add_lect_button, clear_lect_button,
        add_tut_button, clear_tut_button, grade_button, clear_grade_button,
        set_salary_button, clear_salary_button, remove_button, clear_remove_button,
        display_lect_button, display_tut_button};
        
        // Set the button colors and text
        setButtonColors(buttons, Color.DARK_GRAY, Color.WHITE);
        
        lecturer_details_panel.setBackground(Color.LIGHT_GRAY);
        tutor_details_panel.setBackground(Color.LIGHT_GRAY);
        grade_details_panel.setBackground(Color.LIGHT_GRAY);
        set_salary_details_panel.setBackground(Color.LIGHT_GRAY);
        remove_details_panel.setBackground(Color.LIGHT_GRAY);
        display_details_panel.setBackground(Color.LIGHT_GRAY);
        
        myFrame.setVisible(true);
        //making non resizable JFrame
        myFrame.setResizable(false);
        //this completely close the JFrame
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        
        
        //making non resizable JFrame
        myFrame1.setResizable(false);
        //this completely close the JFrame
        myFrame1.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        
        //making non resizable JFrame
        myFrame2.setResizable(false);
        //this completely close the JFrame
        myFrame2.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        
        //making non resizable JFrame
        myFrame3.setResizable(false);
        //this completely close the JFrame
        myFrame3.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        
        //making non resizable JFrame
        myFrame4.setResizable(false);
        //this completely close the JFrame
        myFrame4.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        
        //making non resizable JFrame
        myFrame5.setResizable(false);
        //this completely close the JFrame
        myFrame5.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        
        //Adding ActionListener to the "Add a Lecturer" button
        lecturer.addActionListener(this);
        tutor.addActionListener(this);
        grade.addActionListener(this);
        set_salary.addActionListener(this);
        remove_tutor.addActionListener(this);
        display.addActionListener(this);
        
        
        lecturer1.addActionListener(this);
        tutor1.addActionListener(this);
        grade1.addActionListener(this);
        set_salary1.addActionListener(this);
        remove_tutor1.addActionListener(this);
        display1.addActionListener(this);
        
        lecturer2.addActionListener(this);
        tutor2.addActionListener(this);
        grade2.addActionListener(this);
        set_salary2.addActionListener(this);
        remove_tutor2.addActionListener(this);
        display2.addActionListener(this);
        
        lecturer3.addActionListener(this);
        tutor3.addActionListener(this);
        grade3.addActionListener(this);
        set_salary3.addActionListener(this);
        remove_tutor3.addActionListener(this);
        display3.addActionListener(this);
        
        lecturer4.addActionListener(this);
        tutor4.addActionListener(this);
        grade4.addActionListener(this);
        set_salary4.addActionListener(this);
        remove_tutor4.addActionListener(this);
        display4.addActionListener(this);
        
        lecturer5.addActionListener(this);
        tutor5.addActionListener(this);
        grade5.addActionListener(this);
        set_salary5.addActionListener(this);
        remove_tutor5.addActionListener(this);
        display5.addActionListener(this);
        
        add_lect_button.addActionListener(this);
        clear_lect_button.addActionListener(this);
        add_tut_button.addActionListener(this);
        clear_tut_button.addActionListener(this);
        grade_button.addActionListener(this);
        clear_grade_button.addActionListener(this);
        set_salary_button.addActionListener(this);
        clear_salary_button.addActionListener(this);
        remove_button.addActionListener(this);
        clear_remove_button.addActionListener(this);
        display_lect_button.addActionListener(this);
        display_tut_button.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == lecturer || ae.getSource() == lecturer1 || 
        ae.getSource() == lecturer2 || ae.getSource() == lecturer3 || 
        ae.getSource() == lecturer4 || ae.getSource() == lecturer5)
        {
            // Show myFrame when Lecturer button is clicked
            myFrame.setVisible(true);
            myFrame1.setVisible(false);
            myFrame2.setVisible(false);
            myFrame3.setVisible(false);
            myFrame4.setVisible(false);
            myFrame5.setVisible(false);
        } 
        else if (ae.getSource() == tutor || ae.getSource() == tutor1 || 
        ae.getSource() == tutor2 || ae.getSource() == tutor3 || 
        ae.getSource() == tutor4 || ae.getSource() == tutor5)
        {
            // Show myFrame1 when Tutor button is clicked
            myFrame.setVisible(false);
            myFrame1.setVisible(true);
            myFrame2.setVisible(false);
            myFrame3.setVisible(false);
            myFrame4.setVisible(false);
            myFrame5.setVisible(false);
        } 
        else if (ae.getSource() == grade || ae.getSource() == grade1 || 
        ae.getSource() == grade2 || ae.getSource() == grade3 || 
        ae.getSource() == grade4 || ae.getSource() == grade5) 
        {
            // Show myFrame2 when Grade button is clicked
            myFrame.setVisible(false);
            myFrame1.setVisible(false);
            myFrame2.setVisible(true);
            myFrame3.setVisible(false);
            myFrame4.setVisible(false);
            myFrame5.setVisible(false);
        } 
        else if (ae.getSource() == set_salary || ae.getSource() == set_salary1 || 
        ae.getSource() == set_salary2 || ae.getSource() == set_salary3 || 
        ae.getSource() == set_salary4 || ae.getSource() == set_salary5) 
        {
            // Show myFrame3 when Set Salary button is clicked
            myFrame.setVisible(false);
            myFrame1.setVisible(false);
            myFrame2.setVisible(false);
            myFrame3.setVisible(true);
            myFrame4.setVisible(false);
            myFrame5.setVisible(false);
        }
        
        else if (ae.getSource() == remove_tutor || ae.getSource() == remove_tutor1 ||
        ae.getSource() == remove_tutor2 || ae.getSource() == remove_tutor3 || 
        ae.getSource() == remove_tutor4 || ae.getSource() == remove_tutor5) 
        {
            // Show myFrame3 when Set Salary button is clicked
            myFrame.setVisible(false);
            myFrame1.setVisible(false);
            myFrame2.setVisible(false);
            myFrame3.setVisible(false);
            myFrame4.setVisible(true);
            myFrame5.setVisible(false);
        }
        else if (ae.getSource() == display || ae.getSource() == display1 ||
        ae.getSource() == display2 || ae.getSource() == display3 || 
        ae.getSource() == display4 || ae.getSource() == display5) 
        {
            // Show myFrame3 when Set Salary button is clicked
            myFrame.setVisible(false);
            myFrame1.setVisible(false);
            myFrame2.setVisible(false);
            myFrame3.setVisible(false);
            myFrame4.setVisible(false);
            myFrame5.setVisible(true);
        }
        
        else if (ae.getSource() == add_lect_button) 
        {
            try 
            {
                if (validateLecturerFields()) 
                {
                    // Get input values from text fields
                    int id = Integer.parseInt(lecturer_id_field.getText());
                    String name = lecturer_name_field.getText();
                    String address = lecturer_address_field.getText();
                    String workingType = lecturer_working_type_field.getText();
                    String employmentStatus = lecturer_employment_status_field.getText();
                    int workingHours = Integer.parseInt(lecturer_working_hours_field.getText());
                    int yearsOfExperience = Integer.parseInt(years_of_experience_field.getText());
                    String department = department_field.getText();

                    // Create a new Lecturer object
                    Lecturer lecturer1 = new Lecturer(id, name, address, workingType, employmentStatus, department,
                            yearsOfExperience, workingHours);

                    // Add the new lecturer to the ArrayList
                    myArrayList.add(lecturer1);

                    // Clear the input fields after adding
                    clearLecturerFields();

                    // Display a success message
                    JOptionPane.showMessageDialog(myFrame, "Lecturer added successfully!");
                }
            } 
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(myFrame, "Invalid input format for numeric fields.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        
        else if (ae.getSource() == clear_lect_button) 
        {
            // Clearing Lecturer fields
            clearLecturerFields();
        }
        
        else if (ae.getSource() == add_tut_button) 
        {
            try 
            {
                if (validateTutorFields()) 
                {
                    // Adding a Tutor
                    int id = Integer.parseInt(tutor_id_field.getText());
                    String name = tutor_name_field.getText();
                    String address = tutor_address_field.getText();
                    String workingType = tutor_working_type_field.getText();
                    String employmentStatus = tutor_employment_status_field.getText();
                    int workingHours = Integer.parseInt(tutor_working_hours_field.getText());
                    double salary = Double.parseDouble(salary_field.getText());
                    String specialization = specialization_field.getText();
                    String academicQualifications = academic_qualifications_field.getText();
                    int performanceIndex = Integer.parseInt(performance_index_field.getText());

                    // Create a new Tutor object
                    Tutor tutor1 = new Tutor(id, name, address, workingType, employmentStatus, workingHours, salary,
                            specialization, academicQualifications, performanceIndex);

                    // Add the new tutor to the ArrayList
                    myArrayList.add(tutor1);

                    // Clear the input fields after adding
                    clearTutorFields();

                    // Display a success message
                    JOptionPane.showMessageDialog(myFrame, "Tutor added successfully!");
                }
            } 
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(myFrame, "Invalid input format for numeric fields.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
            
        else if (ae.getSource() == clear_tut_button) 
        {
            // Clearing Tutor fields
            clearTutorFields();
        }
        
        else if (ae.getSource() == grade_button) 
        {
            try 
            {
                if (validateGradeFields()) 
                {
                    int teacherID = Integer.parseInt(new_lecturer_id_field.getText());
                    int gradedScore = Integer.parseInt(graded_score_field.getText());
                    String department = new_department_field.getText();
                    int yearsOfExperience = Integer.parseInt(new_years_of_experience_field.getText());
                    Teacher foundTeacher = findTeacherByID(teacherID);
                    if (foundTeacher != null) 
                    {
                        if (foundTeacher instanceof Lecturer) 
                        {
                            Lecturer lecturer = (Lecturer) foundTeacher;
                            lecturer.grade_assignment(gradedScore, department, yearsOfExperience);
                            JOptionPane.showMessageDialog(myFrame, "Assignments graded successfully!");
                        } 
                        else 
                        {
                            JOptionPane.showMessageDialog(myFrame, "Teacher found but is not a Lecturer.");
                        }
                    } 
                    else 
                    {
                        JOptionPane.showMessageDialog(myFrame, "Teacher with ID " + teacherID + " not found.");
                    }
                }
            } 
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(myFrame, "Invalid input format for numeric fields.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (ae.getSource() == set_salary_button) 
        {
            try 
            {
                if (validateSetSalaryFields()) 
                {
                    int tutorID = Integer.parseInt(new_tutor_id_field.getText());
                    double newSalary = Double.parseDouble(new_salary_field.getText());
                    int newPerformanceIndex = Integer.parseInt(new_performance_index_field.getText());

                    Teacher foundTeacher = findTeacherByID(tutorID);
                    if (foundTeacher != null && foundTeacher instanceof Tutor) 
                    {
                        Tutor tutor = (Tutor) foundTeacher;
                        tutor.setSalary(newSalary, newPerformanceIndex);

                        // Display success message
                        JOptionPane.showMessageDialog(myFrame, "Salary updated for Tutor with ID: " + tutorID);
                    } 
                    else 
                    {
                        JOptionPane.showMessageDialog(myFrame, "Invalid Tutor ID.");
                    }
                }
            } 
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(myFrame, "Invalid input format for numeric fields.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (ae.getSource() == clear_salary_button) 
        {
            clearSetSalaryFields();
        }
        
        else if (ae.getSource() == display_lect_button) 
        {
            for (Teacher teacher : myArrayList) 
            {
                if (teacher instanceof Lecturer) 
                {
                    Lecturer lecturer = (Lecturer) teacher;
                    lecturer.display_details();
                }
            }
        } 
        else if (ae.getSource() == display_tut_button) 
        {
            for (Teacher teacher : myArrayList)
            {
                if (teacher instanceof Tutor) 
                {
                    Tutor tutor = (Tutor) teacher;
                    tutor.display_details();
                }
            }
        }
    }
    
    // Method to validate lecturer input fields
    private boolean validateLecturerFields() 
    {
        boolean isValid = true;
        //creating array to store all the field in order to iterate over them for validation of the empty field.
        JTextField[] fieldsToValidate = {lecturer_id_field, lecturer_name_field, lecturer_address_field,
                lecturer_working_type_field, lecturer_employment_status_field, lecturer_working_hours_field,
                years_of_experience_field, department_field};

        for (JTextField field : fieldsToValidate) 
        {
            if (field.getText().trim().isEmpty())//Trim to handle leading whitespace.
            {
                field.setBorder(BorderFactory.createLineBorder(Color.RED));
                isValid = false;
            } 
            else 
            {
                field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
        }
        if (!isValid) 
        {
            JOptionPane.showMessageDialog(myFrame, "Please fill all the fields.");
        }
        return isValid;
    }

    // Method to validate tutor input fields
    private boolean validateTutorFields() 
    {
        boolean isValid = true;
        JTextField[] fieldsToValidate = {tutor_id_field, tutor_name_field, tutor_address_field,
                tutor_working_type_field, tutor_employment_status_field, tutor_working_hours_field,
                salary_field, specialization_field, academic_qualifications_field, performance_index_field};

        for (JTextField field : fieldsToValidate) 
        {
            if (field.getText().trim().isEmpty()) //trim to handle leading whitespace
            {
                field.setBorder(BorderFactory.createLineBorder(Color.RED));
                isValid = false;
            } 
            else 
            {
                field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
        }
        if (!isValid) 
        {
            JOptionPane.showMessageDialog(myFrame, "Please fill all the fields.");
        }
        return isValid;
    }
    
    // Method to clear lecturer input fields
    private void clearLecturerFields() 
    {
        lecturer_id_field.setText("");
        lecturer_name_field.setText("");
        lecturer_address_field.setText("");
        lecturer_working_type_field.setText("");
        lecturer_employment_status_field.setText("");
        lecturer_working_hours_field.setText("");
        years_of_experience_field.setText("");
        department_field.setText("");
    }
    
    // Method to clear tutor input fields
    private void clearTutorFields() 
    {
        tutor_id_field.setText("");
        tutor_name_field.setText("");
        tutor_address_field.setText("");
        tutor_working_type_field.setText("");
        tutor_employment_status_field.setText("");
        tutor_working_hours_field.setText("");
        salary_field.setText("");
        specialization_field.setText("");
        academic_qualifications_field.setText("");
        performance_index_field.setText("");
    }
    
    // Method to validate grade input fields
    private boolean validateGradeFields() 
    {
        boolean isValid = true;
        JTextField[] fieldsToValidate = {new_lecturer_id_field, graded_score_field, new_department_field, new_years_of_experience_field};
    
        for (JTextField field : fieldsToValidate) 
        {
            if (field.getText().isEmpty())
            {
                field.setBorder(BorderFactory.createLineBorder(Color.RED));
                isValid = false;
            } 
            else 
            {
                field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
        }
        if (!isValid) 
        {
            JOptionPane.showMessageDialog(myFrame, "Please fill all the fields.");
        }
        return isValid;
    }
    
    // Method to find a teacher by ID
    private Teacher findTeacherByID(int teacherID) 
    {
        String idAsString = String.valueOf(teacherID);
        for (Teacher teacher : myArrayList) 
        {
            if (teacher instanceof Lecturer && idAsString.equals(((Lecturer) teacher).getTeacher_id())) 
            {
                return teacher;
            } 
            else if (teacher instanceof Tutor && idAsString.equals(((Tutor) teacher).getTeacher_id())) 
            {
                return teacher;
            }
        }
        return null;
    }
    // Method to validate set salary input fields
    private boolean validateSetSalaryFields() 
    {
        boolean isValid = true;
        JTextField[] fieldsToValidate = { new_tutor_id_field, new_salary_field, new_performance_index_field };
    
        for (JTextField field : fieldsToValidate) 
        {
            if (field.getText().isEmpty()) 
            {
                field.setBorder(BorderFactory.createLineBorder(Color.RED));
                isValid = false;
            }
            else 
            {
                field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
        }
        if (!isValid) 
        {
            JOptionPane.showMessageDialog(myFrame, "Please fill all the fields.");
        }
        return isValid;
    }
    
    // Method to clear set salary input fields
    private void clearSetSalaryFields() 
    {
        new_tutor_id_field.setText("");
        new_salary_field.setText("");
        new_performance_index_field.setText("");
    }
    
    private void setButtonColors(JButton[] buttons, Color background, Color foreground) {
        for (JButton button : buttons) 
        {
            button.setBackground(background);
            button.setForeground(foreground);
        }
    }
    
    
}