package org.ems;

class Employee{
    private String name;
    private String department;
    private Integer id;
    private String contact;

    public Employee(String name, String department, String contact, Integer id){
        this.name=name;
        this.department=department;
        this.contact=contact;
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public Integer getID(){
        return id;
    }
    public String getContact(){
        return contact;
    }
    public String getDepartment(){
        return department;
    }

    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setContact(String contact) { this.contact = contact; }

}