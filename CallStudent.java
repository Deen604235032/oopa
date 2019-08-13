public class CallStudent {
    public static void main(String[] args) {
        Student peetoey = new Student();
        System.out.println(">>" + peetoey );
        peetoey.enrollment();
        peetoey.payment();
        peetoey.addCourse();
        peetoey.droopCourse();
        System.out.println("=========");
        GraduateSttudent yaya = new GraduateSttudent();
        yaya.enrollment();
        yaya.addCourse();
        yaya.droopCourse();
        yaya.payment();
        yaya.oralExamination();
        yaya.thesisExamination();
        
    } 
    
}
