//usando if_else
import java.util.Scanner;
public class Exercicio_Sal�rio_P_Hora {

  public static void main(String[] args) {
    
    double Salario_Hora, Salario_Total; 
    int Horas_Trabalhadas, Horas_Extras ; 
    
      Scanner s = new Scanner(System.in);  
      
      System.out.println("Digite o valor das horas trabalhadas: ");
      
        Horas_Trabalhadas = s.nextInt();
      
      System.out.println("Digite o valor do sal�rio por hora: ");
        Salario_Hora = s.nextDouble();
        
      Horas_Extras = Horas_Trabalhadas - 160;
        
        if (Horas_Extras <=0) {
        
          Salario_Total = (Horas_Trabalhadas * Salario_Hora);
          
        }
        else {
         
        	Salario_Total = 160*Salario_Hora + Horas_Extras *1.5*Salario_Hora;
  }
        System.out.println("o sal�rio total �: " + Salario_Total);
    }
  }