package uniprogress;

import java.util.Date;

public class SOB extends Tests{
   private String difficulty; 
   private int sobNumber;
   private String desc;

    public SOB(String moduleNumber, String awardDate, String tutorName, String topic) {
        super(moduleNumber, awardDate, tutorName, topic);
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getSobNumber() {
        return sobNumber;
    }

    public void setSobNumber(int sobNumber) {
        this.sobNumber = sobNumber;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


   
   
   
}
