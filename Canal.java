public class Canal {
    private static int id_canais = 0;
    private int id_canal;
    private String nome_canal;
    private String dt_criacao;
    private Usuario usuario_dono;
    private Assinatura assinatura;
    
    public Canal(String nome_canal, String dt_criacao, Usuario usuario_dono) {
        setId_canal(++id_canais);
        setNome_canal(nome_canal);
        setDt_criacao(dt_criacao);
        setUsuario_dono(usuario_dono);
        setAssinatura( assinatura = new Assinatura("", 0));
        
    }

    public Canal(String nome_canal, String dt_criacao, Usuario usuario_dono, Assinatura assinatura) {
        setId_canal(++id_canais);
        setNome_canal(nome_canal);
        setDt_criacao(dt_criacao);
        setUsuario_dono(usuario_dono);
        setAssinatura(assinatura);
    }

    // Setters e Getters

    //#region id_canal
    public void setId_canal(int id_canal) {
        this.id_canal = id_canal;
    }

    public int getId_canal() {
        return id_canal;
    }
    //#endregion

    //#region nome_canal
    public void setNome_canal(String nome_canal) {
        this.nome_canal = nome_canal;
    }

    public String getNome_canal() {
        return nome_canal;
    }
    //#endregion

    //#region dt_criacao
    public void setDt_criacao(String dt_criacao) {
        this.dt_criacao = dt_criacao;
    }

    public String getDt_criacao() {
        return dt_criacao;
    }
    //#endregion

    //#region usuario_dono
    protected void setUsuario_dono(Usuario usuario_dono) {
        this.usuario_dono = usuario_dono;
    }

    public Usuario getUsuario_dono() {
        return usuario_dono;
    }
    //#endregion

    //#region assinatura
    public void setAssinatura(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    public Assinatura getAssinatura() {
        return assinatura;
    }
    //#endregion

    //#region id_canais
    public static int getId_canais() {
        return id_canais;
    }
    //endregion

}
