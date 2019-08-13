

public class GadauateStudent extends Student{
    private String studylevel;
    private String thesisAdviser;
    
    public void oralExamination (){
        System.out.println("oralExamination");
    }
    public void thesisExamination (){
        System.out.println("thesisExamination");
        
    }

    @Override
    public void payment() {
        System.out.println("playment by cradit"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
