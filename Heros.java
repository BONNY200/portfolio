
class Heros {
    private String reg_no;
    private String course_title;
    private String course_code;
    private String  CAT;
    private String exam;
    
    public Heros (String reg_no,String course_title,String course_code,String CAT,String exam){
        this.reg_no = reg_no;
        this.course_title = course_title;
        this.course_code = course_code;
        this.CAT = CAT;
        this.exam = exam;
    }
    public String getReg_no(){
        return reg_no;
    }
     public String getCourse_title(){
        return course_title;
    }
      public String getCourse_code(){
        return course_code;
    }
       public String getCAT(){
        return CAT;
    }
     public String getExam(){
        return exam;
    }
    
    
    
    
    
}
