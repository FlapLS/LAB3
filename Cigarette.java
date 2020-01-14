public class Cigarette implements Action{
    @Override
    public void smoke(Human human,Locations location) {
        System.out.println(human.getName()+" курит и идет по "+human.getLocation().getTitle());
    }

}
