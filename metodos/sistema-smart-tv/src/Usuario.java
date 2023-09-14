public class Usuario {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();

    System.out.println(smartTv);

    smartTv.ligar();
    System.out.println(smartTv);

    smartTv.diminuirVolume();
    System.out.println(smartTv);

    smartTv.mudarCanal(10);
    System.out.println(smartTv);
  }
}
