import java.util.ArrayList;
import java.util.Scanner;

// ==================================================================================
// PASSO 2: EXCEÇÃO PERSONALIZADA
// ==================================================================================
class InstrumentoDesafinadoException extends Exception {
    public InstrumentoDesafinadoException(String nome) {
        super("O instrumento " + nome + " esta desafinado! Nao pode tocar.");
    }
}

// ==================================================================================
// PASSO 1: CLASSE PAI (INSTRUMENTO)
// ==================================================================================
class Instrumento {
    protected String nome;
    protected boolean afinado;

    public Instrumento(String nome) {
       this.nome = nome;
       this.afinado = false;
    }

    public String getNome() {
        return this.nome;
    }

    public String afinar() {
        this.afinado = true;
        return "O instrumento " + nome + " foi afinado com sucesso!";
    }

    // PASSO 2: 
    public String tocar() throws InstrumentoDesafinadoException {
        if(!afinado){
            throw new InstrumentoDesafinadoException(nome);
        }
        return "Tocando instrumento generico.";
    }
}

// ==================================================================================
// PASSO 3: CLASSES FILHAS
// ==================================================================================

class Violao extends Instrumento {
    public Violao(String nome){
        super(nome);
    }
    public String tocar() throws InstrumentoDesafinadoException {
        if(!afinado){
            throw new InstrumentoDesafinadoException(nome);
        }
        return "Violão " + nome + "tocou: STRUMMM!";
    }
}

class Piano extends Instrumento {
    public Piano(String nome){
        super(nome);
    }
    public String tocar() throws InstrumentoDesafinadoException {
        if(!afinado){
            throw new InstrumentoDesafinadoException(nome);
        }
        return "Piano " + nome + "tocou: PLIN PLIN PLIN!";
    }
}


// ==================================================================================
// PASSO 4: O PALCO (GERENCIADOR)
// ==================================================================================
class Palco {
    private ArrayList<Instrumento> instrumentos = new ArrayList<>();

    public Palco(){
        instrumentos = new ArrayList<>();
    }
    public void adicionar(Instrumento i) {
        instrumentos.add(i);
        System.out.println(i.nome + " adicionado ao palco.");
    }

    public Instrumento buscar(String nome) {
        for(Instrumento i: instrumentos){
            if(i.nome.equals(nome)){
                return i;
            }
        }
        return null;
    }

    public void showAoVivo() {
        System.out.println("--- INICIANDO O SHOW ---");
         for(Instrumento i: instrumentos){
            try{
                System.out.println(i.tocar());
            }catch
            (InstrumentoDesafinadoException e){
                System.out.println("FALHA NO SHOW: ");
            }
        }
        
        System.out.println("--- FIM DO SHOW ---");
    }
}

// ==================================================================================
// MAIN
// ==================================================================================
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palco palco = new Palco();

        while (true) {
            if (!scanner.hasNextLine()) break;
            String linha = scanner.nextLine().trim();
            if (linha.isEmpty()) continue;
            
            System.out.println("$" + linha);
            String[] tokens = linha.split(" ");
            String cmd = tokens[0].toLowerCase();

            try {
                if (cmd.equals("end")) {
                    break;
                } else if (cmd.equals("init")) {
                    palco = new Palco();
                    
                } else if (cmd.equals("add")) { // PASSO 1 e 4
                    palco.adicionar(new Instrumento(tokens[1]));
                    
                } else if (cmd.equals("violao")) { // PASSO 3
                    // TODO: Descomente
                     palco.adicionar(new Violao(tokens[1]));
                    
                } else if (cmd.equals("piano")) { // PASSO 3
                    // TODO: Descomente
                     palco.adicionar(new Piano(tokens[1]));
                    
                } else if (cmd.equals("afinar")) { // PASSO 1
                    Instrumento i = palco.buscar(tokens[1]);
                    if (i != null) System.out.println(i.afinar());
                    
                } else if (cmd.equals("tocar")) { // PASSO 2
                    Instrumento i = palco.buscar(tokens[1]);
                    if (i != null) System.out.println(i.tocar());
                    
                } else if (cmd.equals("show")) { // PASSO 4
                    palco.showAoVivo();
                }
                
            } catch (InstrumentoDesafinadoException e) {
                System.out.println("ERRO: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        scanner.close();
    }
}