package o;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class WZ extends YZ {
    public static WZ c;
    public static final GU d = new GU(5);
    public final Application b;

    public WZ(Application application) {
        this.b = application;
    }

    @Override // o.YZ, o.XZ
    public final UZ a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // o.YZ, o.XZ
    public final UZ b(Class cls, C2142wD c2142wD) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) c2142wD.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (S3.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(cls);
    }

    public final UZ d(Class cls, Application application) {
        if (!S3.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            UZ uz = (UZ) cls.getConstructor(Application.class).newInstance(application);
            AbstractC0048Bt.m(uz, "{\n                try {\n…          }\n            }");
            return uz;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }
}
