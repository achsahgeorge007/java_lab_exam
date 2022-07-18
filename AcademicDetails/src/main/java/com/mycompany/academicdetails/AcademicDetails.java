package com.mycompany.academicdetails;
        
class AcademicDetails {
    public static void main(String[] args) {
       Sports studObj[] = new Sports[5];
       studObj[0] = new Sports("Anna",20,98,93,96,91,89,"Athlete",2);
       studObj[1] = new Sports("Annie",21,89,92,76,81,79,"ShotPut",1);
       studObj[2] = new Sports("Meena",22,60,65,60,77,64,"Athlete",1);
       studObj[3] = new Sports("Nancy",23,82,89,87,81,89,"High Jump",2);
       studObj[4] = new Sports("Shilpa",24,77,72,76,71,79,"Long Jump", 1);
       studObj[0].display();
       studObj[1].display();
       studObj[2].display();
       studObj[3].display();
       studObj[4].display();
    }
}

class Student {
    String name;
    int roll_no;
    float mark1, mark2, mark3, mark4, mark5;
    
    Student(String n, int roll, float m1, float m2, float m3, float m4, float m5) {
        this.name = n;
        this.roll_no = roll;
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
        this.mark4 = m4;
        this.mark5 = m5;
    }
    
    void display() {
        System.out.println("___Details of Student___");
        System.out.println("Name of the Student: " + this.name);
        System.out.println("Roll No. of Student: " + this.roll_no);
        System.out.println("Mark of Subject 1: " + this.mark1);
        System.out.println("Mark of Subject 2: " + this.mark2);
        System.out.println("Mark of Subject 3: " + this.mark3);
        System.out.println("Mark of Subject 4: " + this.mark4);
        System.out.println("Mark of Subject 5: " + this.mark5);
        float total = (mark1 + mark2 + mark3 + mark4 + mark5);
        float percent = total * 100 / 500;
        System.out.println("\n ___Academic Info___");
        System.out.println("Total : " + total+"/500.0");
        System.out.println("Percentage: " + percent + "%");
    }
}

class Sports extends Student {
    String Item;
    int Rank;
    Sports(String n, int roll, float m1, float m2, float m3, float m4, float m5, String item, int rank){
        super(n,roll,m1,m2,m3,m4,m5);
        this.Item=item;
        this.Rank=rank;
    }
    void display(){
        System.out.println("..........................................");
        super.display();
        System.out.println("\n ___Sports Info___");
        System.out.println("Sports Item : " + this.Item);
        System.out.println("Sports Rank : " + this.Rank);
        System.out.println("..........................................");
    }
}
