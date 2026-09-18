package s1.singleton;

public class SingletonThreadSafty {
    private static SingletonThreadSafty singletonThreadSafty;

    private SingletonThreadSafty(){}

    public synchronized SingletonThreadSafty getInstance(){
        if (singletonThreadSafty == null){
            singletonThreadSafty = new SingletonThreadSafty();
        }
        return singletonThreadSafty;
    }

}
