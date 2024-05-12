import java.util.ArrayList;

public class ProcessoSeletivo {

    private final double salario_base = 2000.00;
    public static void main(String[] args) {
        System.out.println(" --- Processo Seletivo ---");

        ProcessoSeletivo processoSeletivo = new ProcessoSeletivo();
        ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
        candidatos.add(new Candidato("João", 1500.00));
        candidatos.add(new Candidato("Maria", 1500.00));
        candidatos.add(new Candidato("José", 1800.00));
        candidatos.add(new Candidato("Ana", 1100.00));
        candidatos.add(new Candidato("Carlos", 1900.00));
        candidatos.add(new Candidato("Mariana", 1200.00));

        ArrayList<Candidato> candidatos_selecionados = processoSeletivo.selecaoCandidatos(candidatos);
        for (Candidato candidato : candidatos_selecionados) {
            processoSeletivo.entrandoEmContato(candidato);
        }

    }

    public void entrandoEmContato(Candidato candidato){
        int count = 0;
        System.out.println(" --- ");

        while(count < 3){
            System.out.println("Entrando em contato com " + candidato.getNome());

            if(candidato.atender()){
                System.out.println("Candidato " + candidato.getNome() + " atendeu a ligação na " + (count+1) + "ª tentativa.");
                break;
            }else{
                count++;
            }
        }

        if(count == 3){
            System.out.println("Candidato " + candidato.getNome() + " não atendeu a ligação.");
        }

        
    }

    public ArrayList<Candidato> selecaoCandidatos(ArrayList<Candidato> candidatos){
        ArrayList<Candidato> candidatos_selecionados = new ArrayList<Candidato>();
        for (Candidato candidato : candidatos) {
            if(analizarCandidato(candidato)){
                candidatos_selecionados.add(candidato);
            }

            if (candidatos_selecionados.size() == 5) {
                break; 
            }
        }

        System.out.println("Candidatos selecionados:");
        for (Candidato candidato : candidatos_selecionados) {
            System.out.println(candidato.getNome());
        }

        return candidatos_selecionados;
    }


    public boolean analizarCandidato(Candidato candidato){

        if (candidato.getSalario_pretendido() <= salario_base) {
            return true;
        }else{
            return false;
        } 
    }
}
