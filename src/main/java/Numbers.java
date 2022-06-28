public class Numbers {
    public int sum (int numbers){
        int result = 0 ;
        for (int i = 0; i <= numbers; i++){
            result += i;
        }
        return result;
    }

    public static String fromDouble(double source) {
        return String.valueOf(source);
    }
}
