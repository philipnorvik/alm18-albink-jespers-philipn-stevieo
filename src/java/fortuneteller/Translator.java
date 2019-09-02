public class Translator {
    
    private String message;
    private final String[] alternatives1 = {"rich", "poor", "dead", "angry about something",
                                            "happy about something", "sad about something",
                                            "muscular", "skinny", "moving to another country",
                                            "a unicorn"};
    private final String[] alternatives2 = {"daughter", "son", "poodle", "cat", "dog", "Ferrari",
                                            "Lamborghini", "10 bedroom house", "5 square meter apartment",
                                            "lizard"};

    public void fortune(Person person){
        int factor = RandomFactor.zeroToNine();
        StringBuilder result = new StringBuilder();
        
        result.append("You will soon be ")
            .append(alternatives1[factor])
            .append(". ")
            .append("At the age of ")
            .append(person.getAge() + factor)
            .append(" you will have a ")
            .append(alternatives2[factor])
            .append(". ");
    }
    
    public String getMessage() {
        return message;
    }
}
