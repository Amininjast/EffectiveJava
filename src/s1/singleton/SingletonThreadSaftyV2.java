package s1.singleton;

public class SingletonThreadSaftyV2 {
    private static volatile SingletonThreadSaftyV2 singletonThreadSaftyV2;

    private SingletonThreadSaftyV2(){}

    public static SingletonThreadSaftyV2 getInstance(){
        if (singletonThreadSaftyV2 == null){
            synchronized (SingletonThreadSaftyV2.class){
                if (singletonThreadSaftyV2 == null){
                    singletonThreadSaftyV2 = new SingletonThreadSaftyV2();
                }
            }
        }
        return singletonThreadSaftyV2;
    }

}
