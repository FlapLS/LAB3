import java.util.Objects;

public abstract class WorldObject {
    private String name;
    private int x1, y1, x2, y2;
    private Locations location = Locations.IDLE;

    WorldObject(String name) {
        this.name = name;
    }

    public int[] getCoordinates() {
        int[] coorarray = new int[4];
        coorarray[0] = this.x1;
        coorarray[1] = this.y1;
        coorarray[2] = this.x2;
        coorarray[3] = this.y2;
        return coorarray;
    }

    public void setCoordinates(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }


    public String getName() {
        return name;
    }

    public Locations getLocation() {
        return location;
    }
    public void setLocation() {
        if (getCoordinates()[0] >= Locations.SIDEWALK.getX1() && getCoordinates()[0] <= Locations.SIDEWALK.getX2() && getCoordinates()[1] >= Locations.SIDEWALK.getY1() && getCoordinates()[1] <= Locations.SIDEWALK.getY2()) {
            location = Locations.SIDEWALK;
        }
        if (getCoordinates()[0] >= Locations.CHUTE.getX1() && getCoordinates()[0] <= Locations.CHUTE.getX2() && getCoordinates()[1] >= Locations.CHUTE.getY1() && getCoordinates()[1] <= Locations.CHUTE.getY2()) {
            location = Locations.CHUTE;
        }
        if (getCoordinates()[0] >= Locations.ROOF.getX1() && getCoordinates()[0] <= Locations.ROOF.getX2() && getCoordinates()[1] >= Locations.ROOF.getY1() && getCoordinates()[1] <= Locations.ROOF.getY2()) {
            location = Locations.ROOF;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorldObject that = (WorldObject) o;
        return x1 == that.x1 &&
                y1 == that.y1 &&
                x2 == that.x2 &&
                y2 == that.y2 &&
                Objects.equals(name, that.name) &&
                location == that.location;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, x1, y1, x2, y2, location);
    }

    @Override
    public String toString() {
        return "WorldObject{" +
                "name='" + name + '\'' +
                ", x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", location=" + location +
                '}';
    }
}


