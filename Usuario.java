public class Usuario {
    // Atributos privados
    private String username;
    private String correo;
    private int nivel;
    private boolean activo;

    // Getters y Setters con validaciones
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        if (username != null && !username.trim().isEmpty()) {
            this.username = username;
        }
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        if (correo != null && !correo.trim().isEmpty()) {
            this.correo = correo;
        }
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0) {
            this.nivel = nivel;
        }
    }

    public boolean isActivo() {
        return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Métodos solicitados
    public void activar() {
        this.activo = true;
    }

    public void desactivar() {
        this.activo = false;
    }
}
