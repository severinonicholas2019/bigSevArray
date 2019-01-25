public class Main {
    public static double tot, dec, finQuota,sales;
    public static String RED_COLOR_CODE = "\u001B[31m";
    public static void main(String[] args) {


        double bigSevArray[][][] = new double[][][]{{{15000,15000},{15000,14000},{15000,12000},{15000,25000}},{{12000,18000},{13000,17000},{14000,9000},{15000,5000}},{{10000,17000},{15000,12000},{20000,10000},{25000,5000}}};
        double tot = 0;
        double finQuota = 0;
        for (int i=0; i<bigSevArray.length; i++){
            for (int j=0; j<bigSevArray[i].length; j++) {
                for (int k=1; k<bigSevArray[i][j].length; k++) {
                    double dec = bigSevArray[i][j][0] / 1000;
                    double quota = bigSevArray[i][j][1] / 1000;
                    tot += dec;
                    finQuota += quota;
                    System.out.print(dec + " " + quota + "      ");

                }
            }
            System.out.print(tot);
            System.out.print("/"+ finQuota);
            finQuota = 0;
            tot= 0;
            System.out.println("");

        }

            System.out.print(RED_COLOR_CODE+"yes");
    }

}
