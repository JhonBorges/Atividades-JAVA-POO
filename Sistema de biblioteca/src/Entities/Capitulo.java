package Entities;

public class Capitulo {
    private String titulo;
    private Integer paginas;

    public Capitulo(String titulo, Integer paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return String.format(
                "TITULOS DOS CAPITULOS: %s PAGINAS: %d\n",
                titulo, paginas
        );
    }
}
