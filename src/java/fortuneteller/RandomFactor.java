package fortuneteller;

public class RandomFactor {
    
    private RandomFactor(){}
    
    public static int zeroToNine(){
        return (int) (Math.random() * 9);
    }
}
