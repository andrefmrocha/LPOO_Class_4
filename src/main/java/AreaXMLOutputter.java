public class AreaXMLOutputter{
    private SumProvider aggregator;
    AreaXMLOutputter(SumProvider aggregator){
        this.aggregator = aggregator;
    }

    public String output(){
        return "<area>" + this.aggregator.sum() + "</area>";
    }
}
