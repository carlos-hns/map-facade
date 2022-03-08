import subsistemas.*;

import java.util.List;

public class SIG {

    private Administrativo administrativo;
    private Financeiro financeiro;
    private Professores professores;
    private Alunos alunos;
    private Almoxarifado almoxarifado;
    private Infraestrutura infraestrutura;

    public SIG() {
        this.administrativo = new Administrativo();
        this.financeiro = new Financeiro();
        this.professores = new Professores();
        this.alunos = new Alunos();
        this.almoxarifado = new Almoxarifado();
        this.infraestrutura = new Infraestrutura();
    }

    // Administrativo

    public void getReunioesAgendadasComADiretoria() {
        System.out.println("Reuniões agendadas com a diretoria: ");
        this.imprimirLista(this.administrativo.getAgendamentosComADiretoria());
    }

    public void getEntrevistas() {
        System.out.println("Entrevistas: ");
        this.imprimirLista(this.administrativo.getEntrevistas());
    }

    // Financeiro

    public void getBalancoDeContas() {
        System.out.println("Balanço de contas: " + this.financeiro.balancoDeContas());
        System.out.println();
    }

        public void getFolhaDePagamento() {
        System.out.println("Folha de pagamento: " + this.financeiro.balancoDeContas());
    }

    // Professores

    // Almaxorifado

    // Infraestrutura

    public void getAlocacoesDeSalas() {
        System.out.println("Alocações dde salas: ");
        this.imprimirLista(this.infraestrutura.getAlocacaoDasSalas());
    }



    public void getHistoricoDoAluno(String idAluno) {
        System.out.println(this.alunos.getHistoricoPeloIdAluno(idAluno));
        System.out.println();
    }

    public void getRdmDoAluno(String idAluno) {
        System.out.println(this.alunos.getRDMPeloIdAluno(idAluno));
        System.out.println();
    }

    private void imprimirLista(List lista) {
        for (Object elemento : lista) {
            System.out.println(elemento.toString());
        }

        System.out.println();
    }
}
