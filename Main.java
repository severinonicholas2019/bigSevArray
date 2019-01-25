public class Main {
    public static double tot, dec;
    public static void main(String[] args) {

        double bigSevArray[][][] = new double[][][]{{{15000,15000},{15000,14000},{15000,12000},{15000,25000}},{{12000,18000},{13000,17000},{14000,9000},{15000,5000}},{{10000,17000},{15000,12000},{20000,10000},{25000,5000}}};
        double tot = 0;
        for (int i=0; i<bigSevArray.length; i++){
            for (int j=0; j<bigSevArray[i].length; j++) {
                for (int k=0; j<bigSevArray[i][j].length; j++) {
                    double dec = bigSevArray[i][j][k] / 1000;
                    tot += dec;
                    System.out.print(dec + "      ");
                }
            }

            System.out.print(tot);
            tot= 0;
            System.out.println("");

        }
    }

}
