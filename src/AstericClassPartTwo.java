public class AstericClassPartTwo {

    public static void main(String[] args) {

        String stars = "*";


        for(int verticalStar = 10; verticalStar > 0; verticalStar--) {

            for(int horinzontalStar = 0; horinzontalStar < verticalStar; horinzontalStar++) {
                System.out.print(stars);
            }
            System.out.println();



        }

    }


}
