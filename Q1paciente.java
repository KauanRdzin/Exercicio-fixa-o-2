    public class Q1paciente {

    private int codigo; private String nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo;

    public Q1_paciente(int cod, String nome, String data, String sexo, String plano, String alergia, String tipo){

        this.codigo = cod;
        this.nome = nome;
        this.dataNascimento = data;
        this.sexo = sexo;
        this.planoSaude = plano;
        this.alergia = alergia;
        this.tipoSanguineo = tipo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getNome (){
        return this.nome;
    }

    public String getDataNascimento (){
        return this.dataNascimento;
    }

    public String getSexo (){
        return this.sexo;
    }

    public String getPlanoSaude (){
        return this.planoSaude;
    }

    public String getAlergia (){
        return this.alergia;
    }

    public String getTipoSanguineo (){
        return this.tipoSanguineo;
    }

    //Métodos para modificação dos atributos
    public void setCodigo(int cod){
        this.codigo = cod;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setDataNascimento (String data) {
        this.dataNascimento = data;
    }

    public void setSexo (String sexo) {
        this.sexo = sexo;
    }

    public void setAlergia (String alergia) {
        this.alergia = alergia;
    }

    public void setTipoSanguineo (String sgl) {
        this.tipoSanguineo = sgl;
    }

    public void setPlanoSaude(String plano){
        this.planoSaude = plano;
    }
}
