
public class Student {

    protected String studentId;
    protected String stduentName;
    protected String facultg;
    protected String major;

    protected void enrollment() {
        System.out.println("enrollment");
    }

    public void payment() {
        System.out.println("payment");
    }

    public void addCourse() {
        System.out.println("addCourse");
    }

    public void droopCourse() {
        System.out.println("droopCourse");
    }

    public static void main(String[] args) {
        Student mariam = new Student();
        System.out.println(">>" + mariam);
        mariam.enrollment();

    }

}//end
