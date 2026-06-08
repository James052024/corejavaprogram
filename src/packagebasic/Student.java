package packagebasic;

 class Student {
	 String name;
     String college = "ACS Engineering College";

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " " + college);
    }
}