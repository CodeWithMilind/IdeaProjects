package Polymorphism;

// polymorphism is that ---> one mobile and multiple Variants --->>> like one for music one for camera one for gaming.....
//i am giving my phone to my dude but i don't want to access my photos and i have to give permission only for music


interface MyMusic{
    default void AccessMusic(){
        System.out.println("musics are here...");
    }
}

interface MyPhoto{
    default void AccessPhotos(){
        System.out.println("photos are here...");
    }
}


class MySmartPhone  implements MyMusic,MyPhoto{
   public void AccessMusic(){
        System.out.println("musics are here...");
    }
}

class MySmartPhone2 implements MyMusic,MyPhoto{
    public void AccessPhotos()
    {
        System.out.println("photos are here...");
    }
}

public class Tut59 {
    public static void main(String[] args) {


        MyMusic Vivo1 = new MySmartPhone();  //MyMusic is an interface
//        Vivo1.AccessPhotos();  -->> he can't Access Photos Bcz he don't have permission to access the photos
        Vivo1.AccessMusic();
/*----------------------------------------------------------------------------------------------------------------*/
        MyPhoto Vivo2 = new MySmartPhone2();  //MyPhoto is an interface
//        Vivo2.AccessMusic();  -->> he can't Access musics Bcz he don't have permission to access the musics
        Vivo2.AccessPhotos();


    }
}
