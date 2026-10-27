public class Aluno implements Comparable<Aluno> {

    private String nome;
    private int matricula;



    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    @Override
    public int compareTo(Aluno other) {
        return Integer.compare(this.matricula, other.matricula);
    }

    @Override 
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aluno other = (Aluno) obj;
        return this.matricula == other.matricula;
    }

    public String toString() {
        return "[Matrícula: " + this.matricula + " - Nome: " + this.nome + "]";
    }

}

