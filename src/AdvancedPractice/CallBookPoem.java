package AdvancedPractice;

public class CallBookPoem {
    public static void main(String[] args) {

        Book a = new Book(
                "The Lord Of The RIngs",
                "J.R.R. Tolkein",
                "George Allen and Unwin",
                "Fantasy");
        Poem b = new Poem(
                "The Iliad",
                "Homer",
                "Dectylic Hexameter");


        Literature[] lits = new Literature[5];
        lits[0] = a;
        lits[1] = b;
        lits[2] = a;
        lits[3] = a;
        lits[4] = b;

        for (int i=0; i< lits.length; i++){
            lits[i].Print();
        }


    }
}
