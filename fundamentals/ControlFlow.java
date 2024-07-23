
class ControlFlow {
    public static void main(String[] args) {

        // CONTROL FLOW

        // IF ELSE
        boolean result = false;
        boolean otherResult = true;
        if (result) {
            System.out.println("result :" + result);
        } else if (result && otherResult) {
            System.out.println("otherresult");
        } else
            System.out.println("Other!");
            

        // SWITCH CASE

        int option = 1;

        switch (option) {
            case 1:
                System.out.println("y");
                break;
            default:
                System.out.println("default");
                break;
        }

        // STRINGS

        String toolChoice = "pen";

        switch (toolChoice) {
            case "eraser":
                System.out.println("eraser");
                break;
            case "pen":
                System.out.println("pen");
                break;
            default:
                System.out.println("default");
                break;
        }

        // int nb1 = 1;
        // // int nb2 = nb1++; // nb2 = nb1 puis nb1 += 1;
        // int nb2 = ++nb1; // nb1 =+ 1 puis nb2 = nb1

        // System.out.println(nb1); // 2
        // System.out.println(nb2);//
        // mets 1 en nb2 et ensuite fait l'incrementation

    }
}