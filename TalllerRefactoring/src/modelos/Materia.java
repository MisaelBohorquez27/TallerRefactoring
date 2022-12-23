package modelos;

public class Materia {
    public String codigo;
    public String nombre;
    public String facultad;
    public double notaInicial;
    public double notaFinal;
    public double notaTotal;
    public double nexamen;
    public double ndeberes;
    public double nlecciones;
    public double ntalleres;
    public double CalcularNota(String Aux){

        double nota=0;
                double notaTeorico=(this.nexamen+this.ndeberes+this.nlecciones)*0.80;
                double notaPractico=(ntalleres)*0.20;
                nota=notaTeorico+notaPractico;    
        }
        return nota;
    }
    

