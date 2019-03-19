import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        AreaAggregator aggregator = new AreaAggregator();
        aggregator.addShape(new Ellipse(4, 5));
        aggregator.addShape(new Square(4));
        aggregator.addShape(new Circle(1));
        aggregator.addShape(new Rectangle(5, 10));
        aggregator.addShape(new Triangle(1, 2));
        AreaStringOutputter stringOutputter = new AreaStringOutputter(aggregator);
        System.out.println(stringOutputter.output());
        AreaXMLOutputter xmlOutputter = new AreaXMLOutputter(aggregator);
        System.out.println(xmlOutputter.output());
        List<House> houses = new ArrayList<>();
        houses.add(new House(150));
        houses.add(new House(10));
        houses.add(new House(50));
        City city = new City(houses);
        AreaStringOutputter cityStringOutputter = new AreaStringOutputter(city);
        AreaXMLOutputter cityXMLOutputter = new AreaXMLOutputter(city);
        System.out.println(cityStringOutputter.output());
        System.out.println(cityXMLOutputter.output());
    }
}
