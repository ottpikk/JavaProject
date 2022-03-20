package Advanced2.homeWork5Classes.service;

public class WriteToFile {

    String path = null;

    public String getPath(int choice){

        switch (choice){
            case 1: path = "C:/user/desktop/";
            break;
            case 2: path = "C:/user2/desktop/";
            break;
            case 3: path = "C:/user3/desktop/";
            break;
            case 4: path = "C:/user4/desktop/";
            break;
        }
        return path;
    }



}
