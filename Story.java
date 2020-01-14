public class Story {
    public static void main(String[] args) {
    World world = new World("Мир",10,10);
    Human kid = new Human("Малыш");
    Human sir = new Human("Господин");
    Things nuts = new Things("Ореховая скорлупа");
    Things paper = new Things("Скомканая бумага");
    Things cherry = new Things("Вишневые косточки");
    world.addtoWorld(kid,0,0);
    world.addtoWorld(sir,0,0);
    world.addtoWorld(nuts,0,10,2,0);
    world.addtoWorld(paper,0,8,4,0);
    world.addtoWorld(cherry,3,5,10,0);
    System.out.println("--------------------------------------------------------------");
    kid.move(2,7);
    kid.setSideDirection(MoveDirecions.UP);
    sir.move(3,3);
    sir.smoke(new Cigarette());
    }

}

