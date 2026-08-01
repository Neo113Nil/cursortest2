package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class m01 extends ll {
    public static m01 e;
    public static final pg0 f = new pg0(19);
    public final Application d;

    public m01(Application application) {
        super(3);
        this.d = application;
    }

    @Override // defpackage.ll, defpackage.n01
    public final k01 a(Class cls) {
        Application application = this.d;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.ll, defpackage.n01
    public final k01 b(Class cls, m60 m60Var) {
        if (this.d != null) {
            return a(cls);
        }
        Application application = (Application) m60Var.a.get(f);
        if (application != null) {
            return d(cls, application);
        }
        if (!v5.class.isAssignableFrom(cls)) {
            return a50.o(cls);
        }
        g8.r("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final k01 d(Class cls, Application application) {
        if (!v5.class.isAssignableFrom(cls)) {
            return a50.o(cls);
        }
        try {
            k01 k01Var = (k01) cls.getConstructor(Application.class).newInstance(application);
            k01Var.getClass();
            return k01Var;
        } catch (IllegalAccessException e2) {
            g8.j("Cannot create an instance of ", cls, e2);
            return null;
        } catch (InstantiationException e3) {
            g8.j("Cannot create an instance of ", cls, e3);
            return null;
        } catch (NoSuchMethodException e4) {
            g8.j("Cannot create an instance of ", cls, e4);
            return null;
        } catch (InvocationTargetException e5) {
            g8.j("Cannot create an instance of ", cls, e5);
            return null;
        }
    }
}
