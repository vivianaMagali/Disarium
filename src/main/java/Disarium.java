public class Disarium {
    public static String disarium (int number) {

        if(number<0) {throw new IndexOutOfBoundsException();}

        if (number>0 && number<10) return "Disarium";

        char [] chars = String.valueOf(number).toCharArray();
        int[] entero=new int[chars.length];

        int suma=0;
        for (int i = 0; i < chars.length; i++) {
            entero[i]=Integer.parseInt(String.valueOf(chars[i]));
            suma+=Math.pow(entero[i],i+1);
        }

        return (suma==number) ? "Disarium" : "Not disarium";




    }




}
