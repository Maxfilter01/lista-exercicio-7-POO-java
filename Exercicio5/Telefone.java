public class Telefone {
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
 
    public void validarCorrigirNumero(){
        String numeroLimpo = numero.replace("-", " "); 
        if(numeroLimpo.length() ==8){
            String numeroComNove = "9"+ numeroLimpo;
            String numeroCorrigido = numeroComNove.substring(0,5)+ "-"+ numeroComNove.substring(5);
            System.out.println("Telefone possui 8 dígitos.");
            System.out.println("O dígito '9' será incluido na frente.");
            System.out.println("Telefone corrigido sem formatação:"+ numeroComNove);
            System.out.println("Telefone corrigido com formatação:"+ numeroCorrigido);
        }else{
            System.out.println("Número de telefone inválido");
        }
    }
    
        
    }
    

