public class SistemaMedida {
    public static void main(String[] args) {
        // String sigla = "A";

        // if(sigla == "")
        //     System.out.println("PEQUENO");
        // else if(sigla == "M")
        //     System.out.println("MEDIO");
        // else if(sigla == "G")
        //     System.out.println("GRANDE");
        // else
        //     System.out.println("INDEFINIDO");

        // switch (sigla) {
        //     case "P":
        //         System.out.println("PEQUENO");
        //         break;
        //     case "M":
        //         System.out.println("MEDIO");
        //         break;
        //     case "G":
        //         System.out.println("GRANDE");
        //         break;

        //     default:
        //         System.out.println("INDEFINIDO");
        //         break;
        // }


        String plano = "T"; //M / T

        // como está sem o break, ele vai cascateando, por isso
        // que só tem 3 sysout o que facilita na escrita.

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M":{
                System.out.println("Whats e Instagram grátis");
            }

            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }

    }
}
