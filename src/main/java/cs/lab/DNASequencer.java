package cs.lab;

import java.util.HashSet;
import java.util.List;
import java.util.logging.Logger;

public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public String calculate(List<String> part){
        String secuencia_adn1="AGATTA";
        String secuencia_adn2="GATTACA";
        String secuencia_adn3="TACAGA";
        String common = secuencia_adn1;

//        HashSet<Character> h1 = new HashSet<Character>();
//        HashSet<Character> h2 = new HashSet<Character>();
//
//        for(int i=0; i<secuencia_adn1.length();i++){
//            h1.add(secuencia_adn1.charAt(i));
//        }
//
//        for(int i=0; i<secuencia_adn2.length();i++){
//            h2.add(secuencia_adn1.charAt(i));
//        }

        for(int i=0;i<secuencia_adn2.length();i++){
            for(int j=0;j<secuencia_adn1.length();j++){
                if(secuencia_adn2.charAt(i)!=secuencia_adn1.charAt(j)){
                    common += secuencia_adn2.charAt(i);
                    break;
                }
            }
        }
        System.out.println("common is: "+common);

        return "AGATTACAGA";
    }
}
