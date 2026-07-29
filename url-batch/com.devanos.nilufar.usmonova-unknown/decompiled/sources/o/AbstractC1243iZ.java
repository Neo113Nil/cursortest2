package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.iZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1243iZ {
    public final K6 a;
    public final K6 b;
    public final K6 c;

    public AbstractC1243iZ(K6 k6, K6 k62, K6 k63) {
        this.a = k6;
        this.b = k62;
        this.c = k63;
    }

    public abstract C1307jZ a();

    public final Class b(Class cls) {
        String name = cls.getName();
        K6 k6 = this.c;
        Class cls2 = (Class) k6.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        k6.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        K6 k6 = this.a;
        Method method = (Method) k6.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1243iZ.class.getClassLoader()).getDeclaredMethod("read", AbstractC1243iZ.class);
        k6.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        K6 k6 = this.b;
        Method method = (Method) k6.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, AbstractC1243iZ.class);
        k6.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((C1307jZ) this).e.readParcelable(C1307jZ.class.getClassLoader());
    }

    public final InterfaceC1373kZ g() {
        String readString = ((C1307jZ) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC1373kZ) c(readString).invoke(null, a());
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

    public final void i(InterfaceC1373kZ interfaceC1373kZ) {
        if (interfaceC1373kZ == null) {
            ((C1307jZ) this).e.writeString(null);
            return;
        }
        try {
            ((C1307jZ) this).e.writeString(b(interfaceC1373kZ.getClass()).getName());
            C1307jZ a = a();
            try {
                d(interfaceC1373kZ.getClass()).invoke(null, interfaceC1373kZ, a);
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
            throw new RuntimeException(interfaceC1373kZ.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
