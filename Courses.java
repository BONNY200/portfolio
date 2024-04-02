
 class Courses {
     private String staff_num;
    private String course1;
    private String course2;
    private String course3;
    
    public Courses(String staff_num, String course1, String course2, String course3){
        this.staff_num=staff_num;
        this.course1=course1;
        this.course2=course2;
        this.course3=course3;
    }

    public String getStaff_num() {
        return staff_num;
    }

    public void setStaff_num(String staff_num) {
        this.staff_num = staff_num;
    }

    public String getCourse1() {
        return course1;
    }

    public void setCourse1(String course1) {
        this.course1 = course1;
    }

    public String getCourse2() {
        return course2;
    }

    public void setCourse2(String course2) {
        this.course2 = course2;
    }

    public String getCourse3() {
        return course3;
    }

    public void setCourse3(String course3) {
        this.course3 = course3;
    }
    
 }
