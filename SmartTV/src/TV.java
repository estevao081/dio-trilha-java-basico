public class TV {
    boolean ligada = false;
    int volume = 10;
    int canal = 1;

    public void ligarTV() {
        ligada = true;
    }

    public void desligarTV() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume: " + volume);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Canal atual: " + canal);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal atual: " + canal);
    }
}
