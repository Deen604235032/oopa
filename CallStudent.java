
import chap4.GadauateStudent;

public class CallStudent {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        Student kanittha = new Student();
        System.out.println("objrct kanittha "+kanittha);
        kanittha.addCoures();
        kanittha.dropCoures();
        kanittha.payment();
        kanittha.enrollment();
        
        //crete object GraduateStudent
        GadauateStudent bus = new GadauateStudent();
        System.out.println("object bus = "+bus);
        bus.oralExamination();
        bus.thesisExamination();
        bus.enrollment();
        bus.addCoures();
        bus.dropCoures();
        bus.payment();
    }
}
