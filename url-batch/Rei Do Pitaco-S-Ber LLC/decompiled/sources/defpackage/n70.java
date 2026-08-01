package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class n70 {
    public final l6 a;
    public final l6 b;
    public final l6 c;

    public n70(l6 l6Var, l6 l6Var2, l6 l6Var3) {
        this.a = l6Var;
        this.b = l6Var2;
        this.c = l6Var3;
    }

    public abstract o70 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        l6 l6Var = this.c;
        Class cls2 = (Class) l6Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        l6Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        l6 l6Var = this.a;
        Method method = (Method) l6Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, n70.class.getClassLoader()).getDeclaredMethod("read", n70.class);
        l6Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        l6 l6Var = this.b;
        Method method = (Method) l6Var.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, n70.class);
        l6Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((o70) this).e.readParcelable(o70.class.getClassLoader());
    }

    public final p70 g() {
        String readString = ((o70) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (p70) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void h(int i);

    public final void i(p70 p70Var) {
        if (p70Var == null) {
            ((o70) this).e.writeString(null);
            return;
        }
        try {
            ((o70) this).e.writeString(b(p70Var.getClass()).getName());
            o70 a = a();
            try {
                d(p70Var.getClass()).invoke(null, p70Var, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(p70Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
