public class Carro {
    private int passageiros;
    private int combustivel;
    private int quilometragem;
    private int maxPassageiros = 2;
    private int maxCombustivel = 100;
    
    public Carro(){
        System.out.println("O carro foi construído!!!");
    }

    public int getPassageiros() {
        return passageiros;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public int getMaxPassageiros(){
        return maxPassageiros;
    }

    public int getMaxCombustivel() {
        return maxCombustivel;         
    }

    public boolean embarcar() {
        if(passageiros == maxPassageiros){
            System.out.println("O carro já está lotado!");
            return false;
        }else{
            passageiros++;
            System.out.println("Passageiro entrou no carro!");
        }
        return true;
    }

    public boolean desembarcar() {
        if(passageiros == 0){
            return false;
        }else{
            passageiros--;
            System.out.println("Passageiro desceu do carro!");
        }
        return true;
    }

    public boolean dirigir(int distancia) {
        if(passageiros == 0 || combustivel == 0){
            if(passageiros == 0){
                System.out.println("Não há ninguém para dirigir!");
            }
            if(combustivel == 0){
                System.out.println("Não há combutível no tanque!");
            }
            return false;
        }else if(distancia == combustivel){
            quilometragem += distancia;
            combustivel -= distancia;
            System.out.println("Você percorreu " + distancia + " km!!");
            System.out.println("Você têm "+ combustivel + " litros de combustível!");
            return true;
        }else if(distancia >= combustivel){
            distancia = combustivel;
            quilometragem += distancia;
            combustivel -= distancia;
            System.out.println("Você percorreu " + distancia + " km!!");
            System.out.println("Você têm "+ combustivel + " litros de combustível!");
            System.out.println("O combustível acabou!");
            return true;
        }else{
            quilometragem += distancia;
            combustivel -= distancia;
            System.out.println("Você percorreu " + distancia + " km!!");
            System.out.println("Você têm "+ combustivel + " litros de combustível!");
        }
        return true;
    }

    public boolean abastecer(int quantidade) {
        if(quantidade <= 0){
            System.out.println("O quantidade de combustível tem que se maior que 0 litros!");
            System.out.println("Você têm " + combustivel + " litros de combustivel!");
            return false;
        }else if(quantidade >= maxCombustivel){
            combustivel = maxCombustivel;
            System.out.println("O tanque foi abastecido ao máximo!");
            System.out.println("Você têm " + combustivel + " litros de combustivel!");
            return true;
        }else{
            combustivel += quantidade;
            System.out.println("O tanque foi abastecido em " + quantidade + " litros!");
            System.out.println("Você têm " + combustivel + " litros de combustivel!");
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "passageiros=" + -1 +
                ", combustivel=" + -1 +
                ", quilometragem=" + -1 +
                '}';
    }
}
