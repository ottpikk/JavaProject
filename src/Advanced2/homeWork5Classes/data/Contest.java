package Advanced2.homeWork5Classes.data;

public class Contest {
    String contestName;
    Competitor[] participants;
    String[] listOfContests;



}

class ContestFactory {
    public Contest getContest(String contestName){
        if(contestName == null){
            return null;
        }
        if(contestName.length() > 0){
            return new Contest();
        }
        return null;
    }
}
