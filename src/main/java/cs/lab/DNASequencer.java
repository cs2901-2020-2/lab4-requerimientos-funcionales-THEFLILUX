package cs.lab;

import java.util.List;
import java.util.logging.Logger;

public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public String calculate(List<String> part) throws SequenceSizeException, QuantitySequenceException{

        for (String s : part) {
            if (s.length() > 200) {
                throw new SequenceSizeException("Sequencia demasiada grande");
            }
        }

        if(part.size() > 160000){
            throw new QuantitySequenceException("Muchas subsequencias");
        } else{
            StringBuilder dna = new StringBuilder(part.get(0));

            for (int i = 1; i < part.size(); i++) {
                StringBuilder aux = new StringBuilder();

                for (int j = 0; j < part.get(i).length(); j++){
                    aux.append(part.get(i).charAt(j));

                    if(!(dna.toString()).contains(aux)){
                        dna.append(part.get(i).charAt(j));
                    }
                }
            }
            return dna.toString();
        }
    }
}
