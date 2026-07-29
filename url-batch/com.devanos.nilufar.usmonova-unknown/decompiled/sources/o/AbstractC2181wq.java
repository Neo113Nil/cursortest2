package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.wq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2181wq extends F {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC2181wq> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C0847cY unknownFields;

    public AbstractC2181wq() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C0847cY.f;
    }

    public static AbstractC2181wq d(Class cls) {
        AbstractC2181wq abstractC2181wq = defaultInstanceMap.get(cls);
        if (abstractC2181wq == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2181wq = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC2181wq != null) {
            return abstractC2181wq;
        }
        AbstractC2181wq abstractC2181wq2 = (AbstractC2181wq) ((AbstractC2181wq) AbstractC1768qY.b(cls)).c(6);
        if (abstractC2181wq2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC2181wq2);
        return abstractC2181wq2;
    }

    public static Object e(Method method, AbstractC2181wq abstractC2181wq, Object... objArr) {
        try {
            return method.invoke(abstractC2181wq, objArr);
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

    public static final boolean f(AbstractC2181wq abstractC2181wq, boolean z) {
        byte byteValue = ((Byte) abstractC2181wq.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C1229iL c1229iL = C1229iL.c;
        c1229iL.getClass();
        boolean e = c1229iL.a(abstractC2181wq.getClass()).e(abstractC2181wq);
        if (z) {
            abstractC2181wq.c(2);
        }
        return e;
    }

    public static void j(Class cls, AbstractC2181wq abstractC2181wq) {
        abstractC2181wq.h();
        defaultInstanceMap.put(cls, abstractC2181wq);
    }

    @Override // o.F
    public final int a(InterfaceC0839cQ interfaceC0839cQ) {
        int g;
        int g2;
        if (g()) {
            if (interfaceC0839cQ == null) {
                C1229iL c1229iL = C1229iL.c;
                c1229iL.getClass();
                g2 = c1229iL.a(getClass()).g(this);
            } else {
                g2 = interfaceC0839cQ.g(this);
            }
            if (g2 >= 0) {
                return g2;
            }
            throw new IllegalStateException(AbstractC2188wx.g(g2, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (interfaceC0839cQ == null) {
            C1229iL c1229iL2 = C1229iL.c;
            c1229iL2.getClass();
            g = c1229iL2.a(getClass()).g(this);
        } else {
            g = interfaceC0839cQ.g(this);
        }
        k(g);
        return g;
    }

    @Override // o.F
    public final void b(C0627Yb c0627Yb) {
        C1229iL c1229iL = C1229iL.c;
        c1229iL.getClass();
        InterfaceC0839cQ a = c1229iL.a(getClass());
        Y1 y1 = c0627Yb.r;
        if (y1 == null) {
            y1 = new Y1(c0627Yb);
        }
        a.c(this, y1);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1229iL c1229iL = C1229iL.c;
        c1229iL.getClass();
        return c1229iL.a(getClass()).b(this, (AbstractC2181wq) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            C1229iL c1229iL = C1229iL.c;
            c1229iL.getClass();
            return c1229iL.a(getClass()).i(this);
        }
        if (this.memoizedHashCode == 0) {
            C1229iL c1229iL2 = C1229iL.c;
            c1229iL2.getClass();
            this.memoizedHashCode = c1229iL2.a(getClass()).i(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC2181wq i() {
        return (AbstractC2181wq) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC2188wx.g(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = FC.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        FC.c(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }
}
