public class Rectangle extends Shape {
    private List<Segment> sides;

    public Rectangle(PointPlan topLeft, int width, int height) {
        PointPlan topRight = new PointPlan(topLeft.getX() + width, topLeft.getY());
        PointPlan bottomLeft = new PointPlan(topLeft.getX(), topLeft.getY() + height);
        PointPlan bottomRight = new PointPlan(topLeft.getX() + width, topLeft.getY() + height);

        this.sides = new ArrayList<>();
        this.sides.add(new Segment(topLeft, topRight));
        this.sides.add(new Segment(topLeft, bottomLeft));
        this.sides.add(new Segment(topRight, bottomRight));
        this.sides.add(new Segment(bottomLeft, bottomRight));
    }

    public List<Segment> getSides() {
        return this.sides;
    }
}
##############################################################
public class PointPlan {
    private int x;
    private int y;

    public PointPlan(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

public class Segment {
    private PointPlan p1;
    private PointPlan p2;

    public Segment(PointPlan p1, PointPlan p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public PointPlan getP1() {
        return this.p1;
    }

    public PointPlan getP2() {
        return this.p2;
    }
}

public class Ardoise {
    private List<PointPlan> points;
    private List<Segment> segments;

    public Ardoise() {
        this.points = new ArrayList<>();
        this.segments = new ArrayList<>();
    }

    public void addPoint(PointPlan point) {
        this.points.add(point);
    }

    public void addSegment(Segment segment) {
        this.segments.add(segment);
    }

    public void draw() {
        // code to draw the shapes goes here
    }

    public void moveBirds() {
        // code to move the birds goes here
    }
}
##########################################################################
public class PointPlan {
    private int x;
    private int y;

    public PointPlan(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Segment {
    private PointPlan p1;
    private PointPlan p2;

    public Segment(PointPlan p1, PointPlan p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public PointPlan getP1() {
        return this.p1;
    }

    public PointPlan getP2() {
        return this.p2;
    }
}

public class Ardoise {
    private List<PointPlan> points;
    private List<Segment> segments;

    public Ardoise() {
        this.points = new ArrayList<>();
        this.segments = new ArrayList<>();
    }

    public void addPoint(PointPlan point) {
        this.points.add(point);
    }

    public void addSegment(Segment segment) {
        this.segments.add(segment);
    }

    public List<PointPlan> getPoints() {
        return this.points;
    }

    public void draw() {
        // code to draw the shapes goes here
    }

    public void moveBirds() {
        for (PointPlan point : this.points) {
            point.setX(point.getX() + 10);
            point.setY(point.getY() + 20);
        }
    }
}
#############################################################################
public class GFShape extends Shape {
    private List<Shape> shapes;

    public GFShape() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return this.shapes;
    }

    @Override
    public void draw() {
        // code to draw the composite shape goes here
    }
}
public class TestArdoise {
    public static void main(String[] args) {
        PointPlan p1 = new PointPlan(0, 0);
        PointPlan p2 = new PointPlan(10, 10);
        Segment s1 = new Segment(p1, p2);
        Ardoise ardoise = new Ardoise();
        ardoise.addPoint(p1);
        ardoise.addPoint(p2);
        ardoise.addSegment(s1);
        ardoise.draw();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ardoise.moveBirds();
        GFShape house = new GFShape();
        Rectangle roof = new Rectangle();
        Rectangle body = new Rectangle();
        house.addShape(roof);
        house.addShape(body);
        ardoise.addShape(house);
        ardoise.draw();
    }
}
###########################################################################
public class PointPlan {
    private int x;
    private int y;
    private static final int MAX_VALUE = 1000;

    public PointPlan(int x, int y) {
        if (x < 0 || x > MAX_VALUE || y < 0 || y > MAX_VALUE) {
            throw new IllegalArgumentException("Invalid x or y value");
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        if (x < 0 || x > MAX_VALUE) {
            throw new IllegalArgumentException("Invalid x value");
        }
        this.x = x;
    }

    public void setY(int y) {
        if (y < 0 || y > MAX_VALUE) {
            throw new IllegalArgumentException("Invalid y value");
        }
        this.y = y;
    }
}

############################################################################
public class PointPlan {
    private int x;
    private int y;

    public PointPlan(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Invalid input: x and y must be non-negative");
        }
        this.x = x;
        this.y = y;
    }

    // getters and setters
}

public class Segment {
    private PointPlan p1;
    private PointPlan p2;

    public Segment(PointPlan p1, PointPlan p2) {
        if (p1 == null || p2 == null) {
            throw new NullPointerException("Null input: p1 and p2 must be non-null");
        }
        this.p1 = p1;
        this.p2 = p2;
    }

    // getters
}

public class Ardoise {
    private List<PointPlan> points;
    private List<Segment> segments;

    public Ardoise() {
        this.points = new ArrayList<>();
        this.segments = new ArrayList<>();
    }

    public void addPoint(PointPlan point) {
        this.points.add(point);
    }

    public void addSegment(Segment segment) {
        this.segments.add(segment);
    }

    public List<PointPlan> getPoints() {
        return this.points;
    }

    public void draw() throws DrawingException {
        try {
            // code to draw the shapes goes here
        } catch (Exception e) {
            throw new DrawingException("Drawing error: " + e.getMessage());
        }
    }

    public void moveBirds() {
        for (PointPlan point : this.points) {
            point.setX(point.getX() + 10);
            point.setY(point.getY() + 20);
        }
    }
}

public class DrawingException extends Exception {
    public DrawingException(String message) {
        super(message);
    }
}