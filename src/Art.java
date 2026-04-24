public class Art {

    public static void mostrarImagemSala(Sala sala) {
        mostrarImagemSala(sala, null);
    }

    public static void mostrarImagemSala(Sala sala, Jogador jogador) {
        if (sala == null) {
            System.out.println("[Sala inválida]");
            return;
        }

        String nome = sala.getNome();
        switch (nome) {
            case "mosteiro":
                System.out.println(
                "                            \n" +                       
                "           -|-              \n" +
                "            |               \n" +
                "            |               \n" +
                "           /A\\              \n" +           
                "          //^\\              \n" +
                "        ,// _ \\,            \n" +
                "        |/`/_\\`\\|           \n" +
                "         |  ,  |            \n" +
                "         | /^\\ |            \n" +
                "         |//'\\|             \n" +
                "       ,//` _ `\\,           \n" +
                "     ,//` .'|'. `\\,         \n" +
                "   ,//`   |-|-|   `\\,       \n" +
                " ,//`     [_|_]     `\\,     \n" +
                " |/T                 T\\|    \n" +
                "   |  _   __ __   _  |      \n" +
                "   | /_\\ |  |  | /_\\ |      \n" +
                "   | |_| | .|. | |_| |      \n" +
                "   |     |__|__|     |      \n" +
                "   '----[_______]----'      \n" +
                "         =======            \n" +
                "        ======              \n" +
                "     ======                 \n" +
                "                            \n"
                );

                break;

/*
"                            \n" +                       
"           -|-              \n" +
"            |               \n" +
"            |               \n" +
"           /A\              \n" +           
"          //^\\             \n" +
"        ,// _ \\,           \n" +
"        |/`/_\`\|           \n" +
"         |  ,  |            \n" +
"         | /^\ |            \n" +
"         |//'\\|            \n" +
"       ,//` _ `\\,          \n" +
"     ,//` .'|'. `\\,        \n" +
"   ,//`   |-|-|   `\\,      \n" +
" ,//`     [_|_]     `\\,    \n" +
" |/T                 T\|    \n" +
"   |  _   __ __   _  |      \n" +
"   | /_\ |  |  | /_\ |      \n" +
"   | |_| | .|. | |_| |      \n" +
"   |     |__|__|     |      \n" +
"   '----[_______]----'      \n" +
"         =======            \n" +
"        ======              \n" +
"     ======                 \n" +
"                            \n"
*/
            case "entrada":
                System.out.println(
                    "                                     \n" +
                    "      \\                        /     \n" +
                    "       \\                      /      \n" +
                    "        \\____________________/       \n" +      
                    "        |                    |       \n" + 
                    "        |                    |       \n" + 
                    "        |                    |       \n" + 
                    "        |       ┌────┐       | |\\     \n" + 
                    "        |       |    |       |  \\ |   \n" + 
                    "        |       |   °|       |   \\|  \n" + 
                    "        |_______|____|_______|       \n" + 
                    "       /                     \\       \n" + 
                    "      /                       \\      \n" + 
                    "     /                         \\     \n" + 
                    "    /                           \\    \n"  

                   /*
                     
                    |\    
                    \ |   
                     \|  

                   */ 

            );
                break;

            case "tenda":
                // TODO: Cole aqui a arte ASCII da sala "Tenda".
                System.out.println("[Arte ASCII: Tenda]");
                break;

            case "palco":
                // TODO: Cole aqui a arte ASCII da sala "Sala dos Espelhos".
                System.out.println("[Arte ASCII: Sala dos Espelhos]");
                break;

            case "salaSilencio":
                // TODO: Cole aqui a arte ASCII da sala "Sala do Silêncio".
                System.out.println("[Arte ASCII: Sala do Silêncio]");
                break;

            case "camarim":
                // TODO: Cole aqui a arte ASCII da sala "Palco".
                System.out.println("[Arte ASCII: Palco]");
                break;

            case "salaRisada":
                // TODO: Cole aqui a arte ASCII da sala "Sala dos Espelhos".
                System.out.println("[Arte ASCII: Sala dos Espelhos]");
                break;

            case "escritorioAbel":
                // TODO: Cole aqui a arte ASCII da sala "Sala de Controle".
                System.out.println("[Arte ASCII: Sala de Controle]");
                break;

            case "corredor":
                // TODO: Cole aqui a arte ASCII da sala "Corredor".
                System.out.println("[Arte ASCII: Corredor]");
                break;

            default:
                System.out.println("[Sem imagem ASCII para esta sala]");
                break;
        }
    }
}
