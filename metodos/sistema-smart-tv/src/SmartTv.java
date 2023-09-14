public class SmartTv {

  private boolean ligada;
  private int canal;
  private int volume;

  public SmartTv() {
    ligada = false;
    canal = 1;
    volume = 25;
  }

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public void aumentarVolume() {
    if (ligada) {
      if (volume < 100) {
        volume++;
        System.out.println("Você aumentou o volume para: " + volume);
      } else {
        System.out.println("O volume já está no máximo.");
      }
    } else {
      System.out.println("A TV está desligada. Não é possível aumentar o volume.");
    }
  }

  public void diminuirVolume() {
    if (ligada) {
      if (volume > 0) {
        volume--;
        System.out.println("Você diminuiu o volume para: " + volume);
      } else {
        System.out.println("O volume já está no mínimo.");
      }
    } else {
      System.out.println("A TV está desligada. Não é possível diminuir o volume.");
    }
  }

  public void mudarCanal(int canal) {
    if (ligada) {
      this.canal = canal;
      System.out.println("Você mudou o canal para: " + canal);
    } else {
      System.out.println("A TV está desligada. Não é possível mudar o canal.");
    }
  }

  @Override
  public String toString() {
    if (ligada) {
      return "A TV está ligada!\nCanal Atual: " + canal + "\nVolume Atual: " + volume;
    } else {
      return "A TV está desligada.";
    }
  }
}