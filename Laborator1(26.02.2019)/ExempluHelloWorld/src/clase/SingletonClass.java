package clase;

public class SingletonClass {

    private static SingletonClass SINGLETON = null;
    private String s;

    private SingletonClass() {
        s = "This is a singleton";
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public static SingletonClass getInstance(){
        if(SINGLETON == null){
            SINGLETON = new SingletonClass();
        }

        return SINGLETON;
    }
}
