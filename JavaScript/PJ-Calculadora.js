    public static void main(String[] args) throws Exception {
        System.out.println(":::::::::::::::::::::Start:::::::::::::::::::");
        System.out.println("\n\n");

        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Substraction");
        System.out.println("4. Division");
        System.out.println("0. Exit");
        System.out.println("\n");

        System.out.println("Enter Your Choice :::::::  ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int usrChoice = Integer.parseInt(str);

        switch (usrChoice) {
            case 1:
                doAddition();
                break;
            case 2:
                doMultiplication();
                break;
            case 3:
                doSubstraction();
                break;
            case 4:
                doDivision();
                break;

            case 0:
                System.out.println("Thank you.....");
                break;

            default:
                System.out.println("Invalid Value");
        }

        System.out.println(":::::::::::::::::::::End:::::::::::::::::::");
}

public static void doAddition() throws Exception {
    System.out.println("******* Enter in Addition Process ********");

    String strNo1, strNo2;

    System.out.println("Enter Number 1 For Addition : ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    strNo1 = br.readLine();

    System.out.println("Enter Number 2 For Addition : ");
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    strNo2 = br1.readLine();

    int no1 = Integer.parseInt(strNo1);
    int no2 = Integer.parseInt(strNo2);

    int result = no1 + no2;

    System.out.println("Addition of " + no1 + " and " + no2 + " is ::::::: " + result);
}

public static void doSubstraction() throws Exception {
    System.out.println("******* Enter in Substraction Process ********");

    String strNo1, strNo2;

    System.out.println("Enter Number 1 For Substraction : ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    strNo1 = br.readLine();

    System.out.println("Enter Number 2 For Substraction : ");
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    strNo2 = br1.readLine();

    int no1 = Integer.parseInt(strNo1);
    int no2 = Integer.parseInt(strNo2);

    int result = no1 - no2;

    System.out.println("Substraction of " + no1 + " and " + no2 + " is ::::::: " + result);
}

public static void doMultiplication() throws Exception {
    System.out.println("******* Enter in Multiplication Process ********");

    String strNo1, strNo2;

    System.out.println("Enter Number 1 For Multiplication : ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    strNo1 = br.readLine();

    System.out.println("Enter Number 2 For Multiplication : ");
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    strNo2 = br1.readLine();

    int no1 = Integer.parseInt(strNo1);
    int no2 = Integer.parseInt(strNo2);

    int result = no1 * no2;

    System.out.println("Multiplication of " + no1 + " and " + no2 + " is ::::::: " + result);
}

public static void doDivision() throws Exception {
    System.out.println("******* Enter in Dividion Process ********");

    String strNo1, strNo2;

    System.out.println("Enter Number 1 For Dividion : ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    strNo1 = br.readLine();

    System.out.println("Enter Number 2 For Dividion : ");
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    strNo2 = br1.readLine();

    int no1 = Integer.parseInt(strNo1);
    int no2 = Integer.parseInt(strNo2);

    float result = no1 / no2;

    System.out.println("Division of " + no1 + " and " + no2 + " is ::::::: " + result);
}
