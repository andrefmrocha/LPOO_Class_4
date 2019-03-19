public class AreaStringOutputter {
    private SumProvider aggregator;
    AreaStringOutputter(SumProvider aggregator){
        this.aggregator = aggregator;
    }

    public String output(){
        return "Sum of areas: " + this.aggregator.sum();
    }
}
