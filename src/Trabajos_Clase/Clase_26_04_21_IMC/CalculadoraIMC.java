package Trabajos_Clase.Clase_26_04_21_IMC;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class CalculadoraIMC {
    private double peso;
    private double altura;
    private double imc;

    public void calcularIMC(){
        this.imc = this.peso / (this.altura * this.altura);
    }
}
