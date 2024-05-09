public class TestSwich {
    public static void main(String[] args) {
        
        String pais = "Mexico";

        switch (pais) {
            case "Brasil":
            case "Portugal":
                System.out.println("Boa Tarde");
                break;
            case "Espanha":
            case "Mexico":
            case "Argentina":
               System.out.println("Buenos dias");
               break;               
            default:
                System.out.println("good morning");
        }
    }
}
