public class Principal {
    
    public enum Naipe
    {
        Paus, Ouros, Copas,Espada 
    }
    public enum ValorCarta 
    {
        Um,Dois,Tres,Quatro,Cinto,Seis,Sete,Oito,Nove,Valete,Dama,Rei,As;
    }
    class Carta 
    {
       private Naipe naipe;
       private ValorCarta valorCarta;
         public Carta(Naipe naipe, ValorCarta carta){
            this.naipe = naipe; this.valorCarta = carta;
         }
       public Naipe getNaipe(){
           return naipe;
       }     

       public ValorCarta getValorCarta(){
        return this.valorCarta;
    }     

    }

    public static void main(String[] args) {
            
        Naipe carta ;
        carta = Naipe.Copas;

        System.out.println(carta);
    
    }      

}