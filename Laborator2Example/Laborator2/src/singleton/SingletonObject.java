package singleton;

public class SingletonObject {
    private String mesaj = "prima instanta";
    private static SingletonObject SINGLETON = null;

    public String getMesaj() {
        return mesaj;
    }

    private SingletonObject(){

    }

    public static SingletonObject getInstance(){
        if(SINGLETON == null){
            SINGLETON = new SingletonObject();
        }
        return SINGLETON;
    }
}
