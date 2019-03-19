public class Ellipse implements AreaShape {
    private double xRadius;
    private double yRadius;

    Ellipse(double xRadius, double yRadius){
        this.xRadius = xRadius;
        this.yRadius = yRadius;
    }

    public double getxRadius() {
        return xRadius;
    }

    public void setxRadius(int xRadius) {
        this.xRadius = xRadius;
    }

    public double getyRadius() {
        return yRadius;
    }

    public void setyRadius(int yRadius) {
        this.yRadius = yRadius;
    }

    @Override
    public double getArea(){
        return Math.PI * this.getxRadius() * this.getyRadius();
    }

    @Override
    public String draw() {
        return "Ellipse";
    }
}
