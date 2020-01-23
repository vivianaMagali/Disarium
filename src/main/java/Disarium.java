public class Disarium {
    public static String disarium (int number) {
        if (number>0 && number<10){
            return "Disarium";
        }
        throw new IndexOutOfBoundsException();
    }


}
