package Java;

public class Main {
    public static void main(String[] args) {
        Human grandParent = new GrandParent("할아버지",80);
        Human parent = new Parent("엄마",51);
        Human child = new Child("나",26);

        Human[] humans = {grandParent, parent, child};
        for( Human human : humans){
            System.out.println(human.name+", 나이:"+human.age+", 속도:"+human.speed+", 현재위치"+human.getLocation());
        }
        System.out.println("활동 시작");
        for( Human human : humans){
            if(human instanceof Walkable){
                ((Walkable)human).walk(1,1);// 캐스팅
                System.out.println("--------------");
            }
            if(human instanceof  Runnable){
                ((Runnable) human).run(2,2);
                System.out.println("--------------");
            }
            if(human instanceof  Swimmable){
                ((Swimmable) human).swim(3,-1);
                System.out.println("--------------");
            }
        }
    }
}
