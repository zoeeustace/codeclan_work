public class Printer {
    private int numberOfPages;

    public Printer(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    public int getPages(){
        return numberOfPages;
    }

    public int printCopies(int noOfPages, int noOfCopies){
       return noOfPages * noOfCopies;
    }

//    public boolean ableToPrint(int noOfPages, int noOfCopies){
//        if(numberOfPages >= printCopies()){
//            return true;
//        }
//        return false;
//    }
}
