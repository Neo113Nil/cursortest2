package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class rz0 {
    public final n8 a;
    public final n8 b;
    public final n8 c;

    public rz0(n8 n8Var, n8 n8Var2, n8 n8Var3) {
        this.a = n8Var;
        this.b = n8Var2;
        this.c = n8Var3;
    }

    public abstract sz0 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        n8 n8Var = this.c;
        Class cls2 = (Class) n8Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        n8Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        n8 n8Var = this.a;
        Method method = (Method) n8Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, rz0.class.getClassLoader()).getDeclaredMethod("read", rz0.class);
        n8Var.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) {
        String name = cls.getName();
        n8 n8Var = this.b;
        Method method = (Method) n8Var.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, rz0.class);
        n8Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((sz0) this).e.readParcelable(sz0.class.getClassLoader());
    }

    public final tz0 g() {
        String readString = ((sz0) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (tz0) c(readString).invoke(null, a());
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

    public final void i(tz0 tz0Var) {
        if (tz0Var == null) {
            ((sz0) this).e.writeString(null);
            return;
        }
        try {
            ((sz0) this).e.writeString(b(tz0Var.getClass()).getName());
            sz0 a = a();
            try {
                d(tz0Var.getClass()).invoke(null, tz0Var, a);
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
            throw new RuntimeException(tz0Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
