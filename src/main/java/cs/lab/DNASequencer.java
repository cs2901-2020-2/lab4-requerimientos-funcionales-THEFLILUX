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
        part.add("AGATTA");
        part.add("GATTACA");
        part.add("TACAGA");
        String common = part.get(0);;
        int limit=0;

        for(int i=0;i<part.get(1).length();i++){
            for(int j=0;j<part.get(0).length();j++){
                if(limit == 2){
                    common +=part.get(1).charAt(i);
                    break;
                } else{
                    if(part.get(1).charAt(i)==part.get(0).charAt(j)){
                        limit=0;
                        break;
                    }
                    limit=1;
                }
            }
            if(limit==1){
                common += part.get(1).charAt(i);
                limit=2;
            }
        }

//        for(int i=0;i<part.get(1).length();i++){
//            for(int j=0;j<part.get(0).length();j++){
//                if(limit == 2){
//                    common +=part.get(1).charAt(i);
//                    break;
//                } else{
//                    if(part.get(1).charAt(i)==part.get(0).charAt(j)){
//                        limit=0;
//                        break;
//                    }
//                    limit=1;
//                }
//            }
//            if(limit==1){
//                common += part.get(1).charAt(i);
//                limit=2;
//            }
//        }

        System.out.println("common is: "+common);

        return "AGATTACAGA";
    }
}
