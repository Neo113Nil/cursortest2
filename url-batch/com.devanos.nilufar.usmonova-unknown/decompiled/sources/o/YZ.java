package o;

/* loaded from: classes.dex */
public class YZ implements XZ {
    public static YZ a;

    @Override // o.XZ
    public UZ a(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            AbstractC0048Bt.m(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (UZ) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }

    @Override // o.XZ
    public UZ b(Class cls, C2142wD c2142wD) {
        return a(cls);
    }

    @Override // o.XZ
    public final UZ c(InterfaceC0517Tv interfaceC0517Tv, C2142wD c2142wD) {
        return b(AbstractC1473m3.D(interfaceC0517Tv), c2142wD);
    }
}
