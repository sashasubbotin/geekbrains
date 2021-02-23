public class MyArrayDataException extends Exception {
    public int i, j;
    MyArrayDataException(int i,int j){
        this.i= i;
        this.j= j;
    }
}