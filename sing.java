public class sing {

    public static void main(String[] args) {
    
    ban renbanA = ban.getInstance();
    
    ban renbanB = ban.getInstance();
    
    System.out.println( renbanA.getNumber() );
    
    System.out.println( renbanB.getNumber() );
    
    System.out.println( renbanB.getNumber() );
    
    System.out.println( renbanA.getNumber() );
    
    System.out.println( renbanB.getNumber() );
    
    }
    
    }
    
    class ban{
        private static ban instance = new ban();
        private int number;
        private ban() {
            
        }
        public static ban getInstance() {
            return instance;
        }
        public String getNumber(){
            String str = String.format("%02d",number);
            number++;
            return str;
        }
    }