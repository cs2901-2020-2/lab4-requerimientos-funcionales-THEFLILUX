package cs.lab;

import java.util.Scanner;
import java.util.List;
import java.util.logging.Logger;
import java.util.TooManyListenersException;

public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }
    Scanner scanner = new Scanner(System.in);

    public String calculate(List<String> part) throws TooManyListenersException, Exception{
        part.add("AGATTA");
        part.add("GATTACA");
        part.add("TACAGA");

        for(int i=0; i<part.size();i++){
            if(part.get(i).length() > 200){
                throw new Exception("Sequencia demasiada grande");
            } else{
                continue;
            }
        }

        if(part.size() > 160000){
            throw new Exception("Muchas subsequencias");
        } else{
            String common = part.get(0);
            int limit=0;

            for(int i=0;i<part.get(2).length();i++){
                for(int j=0;j<common.length();j++){
                    if(limit == 2){
                        common += (part.get(2).charAt(i));
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
                    common += (part.get(2).charAt(i));
                    limit=2;
                }
            }

            return common;
        }
    }
}
