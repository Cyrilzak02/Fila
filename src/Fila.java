public class Fila {
    private int inicio;
    private int fim;
    private int dados[];

    private int capacidade;

    public Fila(int capacidade){
        this.capacidade = capacidade;
        dados = new int[this.capacidade];
        fim = -1;
        inicio =-1;

    }
    public boolean vazia(){
        if(inicio == fim){
            return true;
        }
        return false;

    }
    public boolean cheio(){
        if((fim == inicio-1 && fim!=-1) || (inicio == fim -(dados.length-1))){
            return true;
        }
        return false;
    }
    public void insere(int dado){

        if(cheio()){ // se o vetor ta cheio
            System.out.println("Elemento "+dado + " adicionado na posicao "+ inicio );
            dados[inicio] = dado;

            if(inicio == capacidade-1){ // se o mais antigo elemento acrescentado ficasse no ultimo index do vetor
                inicio = 0; // o inicio sera o index 0 da array nesse caso
            }


            else {
                ++inicio;
            }
            if(fim == capacidade-1){ // se o mais novo elemento acrescentado ficasse no ultimo index do vetor
                fim = 0;
            }

            else {
                ++fim;
            }

        }
        else if(vazia() && inicio==-1){ // se a array esta vazia e inicio=-1

            ++inicio;
            System.out.println("=============================================");
            System.out.println("Elemento "+dado + " adicionado na posicao "+ inicio );
            dados[inicio]=dado;



        }
        else if(vazia() && everything_null()){
            System.out.println("=============================================");
            System.out.println("Elemento "+dado + " adicionado na posicao "+ inicio );
             dados[inicio] = dado;

        }
        else{
            System.out.println("3d loop");
            if(fim ==-1 || ((fim == inicio) && !everything_null())){
                fim = inicio+1;
                System.out.println("=============================================");
                System.out.println("Elemento "+dado + " adicionado na posicao "+ fim );
                dados[fim]= dado;
            }

            else {
                if(fim != capacidade-1){
                ++fim;

                System.out.println("=============================================");
                System.out.println("Elemento "+dado + " adicionado na posicao "+ fim );
                dados[fim] = dado;}
                else {

                    fim = 0 ;
                    System.out.println("=============================================");
                    System.out.println("Elemento "+dado + " adicionado na posicao "+ fim );
                    dados[fim] = dado;
                }
            }

        }

        imprime();
    }

    public boolean everything_null(){
        for (int i =0 ; i<capacidade;i++){
            if(dados[i] !=0){
                return false;
            }
        }
        return true;
    }
    public void remove(){
        if(vazia() && everything_null() ){
            System.out.println("=============================================");
            System.out.println("You cannot remove an item because the array is empty.");
        }
        else if(vazia() && !everything_null() ){
            System.out.println("=============================================");
            System.out.println("Elemento removido na posicao "+ inicio );
            dados[inicio] = 0;
        }
        else{
            if(fim ==-1 && inicio == 0){
                dados[inicio] = 0 ;
                System.out.println("=============================================");
                System.out.println("Elemento removido na posicao "+ inicio );
                inicio--;
            }
            else{
                if(inicio == capacidade-1){
                    dados[inicio] = 0;
                    System.out.println("=============================================");
                    System.out.println("Elemento removido na posicao "+ inicio );
                    inicio = 0;


                }
                else{
                    dados[inicio]=0;
                    System.out.println("=============================================");
                    System.out.println("Elemento removido na posicao "+ inicio );
                    inicio++;

                }
            }

        }
        imprime();
    }
    public void imprime(){

        System.out.println("Fim = " +fim + " Inicio = "+inicio);
        for (int i =0 ; i<capacidade;i++){
            System.out.println(dados[i]  +" | ["+i+"]");
        }
    }


}
