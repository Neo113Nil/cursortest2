package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.uq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2049uq {
    public final E a;
    public final Object b;
    public final E c;
    public final C1983tq d;
    public final Method e;

    public C2049uq(E e, Object obj, E e2, C1983tq c1983tq, Class cls) {
        if (e == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (c1983tq.i == I10.m && e2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = e;
        this.b = obj;
        this.c = e2;
        this.d = c1983tq;
        if (!InterfaceC1854rt.class.isAssignableFrom(cls)) {
            this.e = null;
            return;
        }
        try {
            this.e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e3) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(name.length() + 52);
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"valueOf\".");
            throw new RuntimeException(sb.toString(), e3);
        }
    }

    public final Object a(Object obj) {
        if (this.d.i.h != K10.p) {
            return obj;
        }
        try {
            return this.e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final Object b(Object obj) {
        return this.d.i.h == K10.p ? Integer.valueOf(((InterfaceC1854rt) obj).getNumber()) : obj;
    }
}
