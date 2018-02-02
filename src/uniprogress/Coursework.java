package uniprogress;


public class Coursework extends Tests{

    
    private int worldLimit;

    public Coursework(int worldLimit,String moduleNumber, String awardDate, String tutorName, String topic) {
        super(moduleNumber, awardDate, tutorName, topic);
        this.worldLimit=worldLimit;
    }

   
    public int getWorldLimit() {
        return worldLimit;
    }

    public void setWorldLimit(int worldLimit) {
        this.worldLimit = worldLimit;
    }
    
    
    
}
