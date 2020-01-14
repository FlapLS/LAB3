public class World {
    private String name;
    private int sizex;
    private int sizey;
    Human[] humarray = new Human[10];
    private int Hcnt = 0;
    Things[] thinarray = new Things[10];
    private int Mcnt = 0;

    World(String name, int sizex, int sizey) {
        this.name = name;
        this.sizex = sizex;
        this.sizey = sizey;
    }

    public void addtoWorld(Human human, int x, int y) {
        humarray[Hcnt] = human;
        Hcnt++;
        human.setCoordinates(x, y);
        human.setLocation();
        System.out.println(human.getName() + " появился в " + name + " в локации " + human.getLocation().getTitle());
    }

    public void addtoWorld(Things things, int x1, int y1, int x2, int y2) {
        thinarray[Mcnt]= things;
        Mcnt++;
        things.setCoordinates(x1,y1,x2,y2);
        things.setLocation();
        System.out.println(things.getName() + " появился в " + name +" в локации " + things.getLocation().getTitle());
    }

    public int getHcnt() {
        return Hcnt;
    }

    public int getMcnt() {
        return Mcnt;
    }
}
