
class Livros {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
       
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
       
        super.finalize();
    }

    @Override
    public int hashCode() {
        
        return super.hashCode();
    }

    @Override
    public String toString() {
        
        return super.toString();
    }

    private int lanccamentoAno;
    private int lanccamentoDia;
    private int lanccamentoMes;
    private String nomeDoLivro;
    private String autor;
    private String editora;
    private String pais;
    private String lingua;
    private String titulo;

    public Livros(int lanccamentoAno, int lanccamentoDia, int lanccamentoMes, String nomeDoLivro, String autor,
            String editora, String pais, String lingua, String titulo) {
        this.lanccamentoAno = lanccamentoAno;
        this.lanccamentoDia = lanccamentoDia;
        this.lanccamentoMes = lanccamentoMes;
        this.nomeDoLivro = nomeDoLivro;
        this.autor = autor;
        this.editora = editora;
        this.pais = pais;
        this.lingua = lingua;
        this.titulo = titulo;
    }

    // Getters and setters

    public Livros(String titulo2, String autor2, int lanccamentoAno2, int lanccamentoMes2, int lanccamentoDia2) {
       
    }

    public int getLanccamentoAno() {
        return lanccamentoAno;
    }

    public void setLanccamentoAno(int lanccamentoAno) {
        this.lanccamentoAno = lanccamentoAno;
    }

    public int getLanccamentoDia() {
        return lanccamentoDia;
    }

    public void setLanccamentoDia(int lanccamentoDia) {
        this.lanccamentoDia = lanccamentoDia;
    }

    public int getLanccamentoMes() {
        return lanccamentoMes;
    }

    public void setLanccamentoMes(int lanccamentoMes) {
        this.lanccamentoMes = lanccamentoMes;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

