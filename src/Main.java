public class Main {


                                                                                    // Adapter





    public static void main(String[] arg){

        JucarieMobila jucarieMobila = new AdapterMasina(new Autoturism());
        jucarieMobila.seDeplaseaza();
        jucarieMobila.emiteSunete();




    }


}
