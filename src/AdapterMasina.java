public class AdapterMasina implements JucarieMobila {

    private Masina m;

    public AdapterMasina(Masina m) {

        this.m = new Autoturism();


    }

    @Override
    public void seDeplaseaza() {

        m.ruleaza();
    }

    @Override
    public void emiteSunete() {

        m.claxoneaza();
    }
}
