public class Printer {
    private int numberOfPages;
    private int toner;

    public Printer(int numberOfPages, int toner){
        this.numberOfPages = numberOfPages;
        this.toner = toner;
    }

    public int getPages(){
        return numberOfPages;
    }

    public void printCopies(int noOfPages, int noOfCopies){
        if(numberOfPages > noOfPages*noOfCopies) {
            this.numberOfPages -= noOfPages * noOfCopies;
            this.toner -= noOfPages*noOfCopies;
        }
    }

    public int getToner(){
        return toner;
    }

}
