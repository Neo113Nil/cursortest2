package o;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class TA implements InterfaceC2114vp {
    public final VA h;
    public final ConcurrentHashMap i;
    public final InterfaceC2114vp j;

    public TA(VA va, ConcurrentHashMap concurrentHashMap, InterfaceC2114vp interfaceC2114vp) {
        this.h = va;
        this.i = concurrentHashMap;
        this.j = interfaceC2114vp;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 3) {
            objArr[1] = "recursionDetected";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i != 3 && i != 4) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public final AssertionError d(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.h);
        VA.e(assertionError);
        return assertionError;
    }

    @Override // o.InterfaceC2114vp
    public Object invoke(Object obj) {
        Object obj2 = AbstractC1052fg.g;
        VA va = this.h;
        C0460Rq c0460Rq = va.b;
        IR ir = va.a;
        ConcurrentHashMap concurrentHashMap = this.i;
        Object obj3 = concurrentHashMap.get(obj);
        UA ua = UA.i;
        if (obj3 != null && obj3 != ua) {
            AbstractC1052fg.Z(obj3);
            if (obj3 == obj2) {
                return null;
            }
            return obj3;
        }
        ir.lock();
        try {
            Object obj4 = concurrentHashMap.get(obj);
            UA ua2 = UA.j;
            if (obj4 == ua) {
                C0260Jx d = va.d(obj, "");
                if (d == null) {
                    a(3);
                    throw null;
                }
                if (!d.i) {
                    return d.j;
                }
                obj4 = ua2;
            }
            if (obj4 == ua2) {
                C0260Jx d2 = va.d(obj, "");
                if (d2 == null) {
                    a(3);
                    throw null;
                }
                if (!d2.i) {
                    return d2.j;
                }
            }
            if (obj4 != null) {
                AbstractC1052fg.Z(obj4);
                return obj4 != obj2 ? obj4 : null;
            }
            try {
                concurrentHashMap.put(obj, ua);
                Object invoke = this.j.invoke(obj);
                if (invoke != null) {
                    obj2 = invoke;
                }
                Object put = concurrentHashMap.put(obj, obj2);
                if (put == ua) {
                    return invoke;
                }
                r6 = d(obj, put);
                throw r6;
            } catch (Throwable th) {
                if (AbstractC1305jX.x(th)) {
                    concurrentHashMap.remove(obj);
                    throw th;
                }
                if (th == r6) {
                    c0460Rq.getClass();
                    throw th;
                }
                Object put2 = concurrentHashMap.put(obj, new V10(th));
                if (put2 != ua) {
                    throw d(obj, put2);
                }
                c0460Rq.getClass();
                throw th;
            }
        } finally {
            ir.unlock();
        }
    }
}
