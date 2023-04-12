public class InversedString {
    public static void main(String[] args){
        String str = "Salutations";

        StringBuilder one = new StringBuilder();

        one.append(str);

        one = one.reverse();

        System.out.println(one);
    }
}
