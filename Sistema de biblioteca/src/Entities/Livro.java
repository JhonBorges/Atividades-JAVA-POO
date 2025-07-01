package Entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
    private String titulo;
    private LocalDateTime data;

    private Editora editora;
    private List<Capitulo> capitulos = new ArrayList<>();

    public Livro() {
    }

    public Livro(String titulo, Editora editora, LocalDateTime data) {
        this.titulo = titulo;
        this.editora = editora;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void addCapitulo(Capitulo capitulo){
        capitulos.add(capitulo);
    }

    public void removeCapitulo(Capitulo capitulo){
        capitulos.remove(capitulo);
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTITULO DO LIVRO: "+ titulo);
        sb.append("\nEDITORA: "+ editora.getNome()+"\n");
        for (Capitulo cap : capitulos){
            sb.append(cap);
        }
        sb.append("\nDATA DO ALUGUEL: " + fmt.format(data));
        return sb.toString();
    }
}
