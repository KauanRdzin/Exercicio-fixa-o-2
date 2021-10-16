public class Q1_clinica_paciente {

    public static void main(String[] args){

        Q1_paciente n1 = new Q1_paciente(1, "Kauan Rodrigo Souza Damasceno", "13/04/2004", "Masculino", "Padrão", "Nenhum", "O+");

        System.out.println("\nCodigo: "+n1.getCodigo());
        System.out.println("Nome: "+n1.getNome());
        System.out.println("Data de nascimento: "+n1.getDataNascimento());
        System.out.println("Sexo: "+n1.getSexo());
        System.out.println("Plano de saúde: "+n1.getPlanoSaude());
        System.out.println("Alergia: "+n1.getAlergia());
        System.out.println("Tipo Sanguíneo: "+n1.getTipoSanguineo()+"\n");

        n1.setNome("Maria Santos Souza");
        n1.setDataNascimento("29/05/1980");
        n1.setSexo("Feminino");
        n1.setAlergia("Nenhuma");
        n1.setTipoSanguineo("O-");
        n1.setCodigo(2);
        n1.setPlanoSaude("Plus");

        System.out.println("\nCodigo: "+n1.getCodigo());
        System.out.println("Nome: "+n1.getNome());
        System.out.println("Data de nascimento: "+n1.getDataNascimento());
        System.out.println("Sexo: "+n1.getSexo());
        System.out.println("Plano de saúde: "+n1.getPlanoSaude());
        System.out.println("Alergia: "+n1.getAlergia());
        System.out.println("Tipo Sanguíneo: "+n1.getTipoSanguineo()+"\n");
    }
}
