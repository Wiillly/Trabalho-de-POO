// Classe Automovel
class Automovel {
    private String registro;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public void imprimaDados() {
        System.out.println("Registro: " + registro);
    }
}

// Subclasse Motocicleta
class Motocicleta extends Automovel {
    public void imprimaDados() {
        super.imprimaDados();
    }
}

// Subclasse Carro
class Carro extends Automovel {
    private int quantidadeDePortas;

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int portas) {
        this.quantidadeDePortas = portas;
    }

    public void imprimaDados() {
        super.imprimaDados();
        System.out.println("Quantidade de portas: " + quantidadeDePortas);
    }
}

// Interface ICombustao
interface ICombustao {
    void abastece(double volume);
    double getQuantidadeDeCombustivel();
}

// Interface IEletrico
interface IEletrico {
    void carregue(double energia);
    double getCargaDaBateria();
}

// Subclasse MotoCombustao
class MotoCombustao extends Motocicleta implements ICombustao {
    private double tanque;

    public void abastece(double volume) {
        // Implementação para abastecer a moto a combustão
    }

    public double getQuantidadeDeCombustivel() {
        // Implementação para obter a quantidade de combustível
        return tanque;
    }

    public void imprimaDados() {
        System.out.println("Dados da Moto a Combustão:");
        super.imprimaDados();
    }
}

// Subclasse MotoEletrica
class MotoEletrica extends Motocicleta implements IEletrico {
    private double bateria;

    public void carregue(double energia) {
        // Implementação para carregar a moto elétrica
    }

    public double getCargaDaBateria() {
        // Implementação para obter a carga da bateria
        return bateria;
    }

    public void imprimaDados() {
        System.out.println("Dados da Moto Elétrica:");
        super.imprimaDados();
    }
}

// Subclasse CarroCombustao
class CarroCombustao extends Carro implements ICombustao {
    private double tanque;

    public void abastece(double volume) {
        // Implementação para abastecer o carro a combustão
    }

    public double getQuantidadeDeCombustivel() {
        // Implementação para obter a quantidade de combustível
        return tanque;
    }

    public void imprimaDados() {
        System.out.println("Dados do Carro a Combustão:");
        super.imprimaDados();
    }
}

// Subclasse CarroEletrico
class CarroEletrico extends Carro implements IEletrico {
    private double bateria;

    public void carregue(double energia) {
        // Implementação para carregar o carro elétrico
    }

    public double getCargaDaBateria() {
        // Implementação para obter a carga da bateria
        return bateria;
    }

    public void imprimaDados() {
        System.out.println("Dados do Carro Elétrico:");
        super.imprimaDados();
    }
}

// Subclasse CarroHibrido
class CarroHibrido extends Carro implements ICombustao, IEletrico {
    private double tanque;
    private double bateria;

    public void abastece(double volume) {
        // Implementação para abastecer o carro híbrido
    }

    public double getQuantidadeDeCombustivel() {
        // Implementação para obter a quantidade de combustível
        return tanque;
    }

    public void carregue(double energia) {
        // Implementação para carregar o carro híbrido
    }

    public double getCargaDaBateria() {
        // Implementação para obter a carga da bateria
        return bateria;
    }

    public void imprimaDados() {
        System.out.println("Dados do Carro Híbrido:");
        super.imprimaDados();
    }
}

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso das classes e métodos
        CarroHibrido carroHibrido = new CarroHibrido();
        carroHibrido.setRegistro("ABC123");
        carroHibrido.setQuantidadeDePortas(4);
        carroHibrido.abastece(50.0);
        carroHibrido.carregue(80.0);

        carroHibrido.imprimaDados();
        System.out.println("tanque: 50L");
        System.out.println("Bateria: 80%");
        System.out.println();

        // Criando instâncias de todas as classes e chamando imprimaDados()
        MotoCombustao motoCombustao = new MotoCombustao();
        motoCombustao.setRegistro("DEF456");
        motoCombustao.imprimaDados();
        motoCombustao.abastece(40.0);
        System.out.println("tanque: 40L");
        System.out.println();

        MotoEletrica motoEletrica = new MotoEletrica();
        motoEletrica.setRegistro("GHI789");
        motoEletrica.imprimaDados();
        motoEletrica.carregue(70.0);
        System.out.println("Bateria: 70%");
        System.out.println();

        CarroCombustao carroCombustao = new CarroCombustao();
        carroCombustao.setRegistro("JKL012");
        carroCombustao.setQuantidadeDePortas(2);
        carroCombustao.imprimaDados();
        carroCombustao.abastece(50.0);
        System.out.println("tanque: 50L");
        System.out.println();

        CarroEletrico carroEletrico = new CarroEletrico();
        carroEletrico.setRegistro("MNO345");
        carroEletrico.setQuantidadeDePortas(4);
        carroEletrico.imprimaDados();
        carroEletrico.carregue(80.0);
        System.out.println("Bateria: 80%");
    }
}
