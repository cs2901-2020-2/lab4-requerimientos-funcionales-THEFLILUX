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
            StringBuilder common = new StringBuilder(part.get(0));
            int limit=0;

            for(int i=0;i<part.get(2).length();i++){
                for(int j=0;j<common.length();j++){
                    if(limit == 2){
                        common.append(part.get(2).charAt(i));
                        break;
                    } else{
                        if(part.get(2).charAt(i)==common.charAt(j)){
                            limit=0;
                            break;
                        }
                        limit=1;
                    }
                }
                if(limit==1){
                    common.append(part.get(2).charAt(i));
                    limit=2;
                }
            }

            return common.toString();
        }
    }
}
