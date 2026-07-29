package o;

/* loaded from: classes.dex */
public class RA implements InterfaceC1455lp {
    public final VA h;
    public final InterfaceC1455lp i;
    public volatile Object j;

    public RA(VA va, InterfaceC1455lp interfaceC1455lp) {
        if (va == null) {
            a(0);
            throw null;
        }
        this.j = UA.h;
        this.h = va;
        this.i = interfaceC1455lp;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i == 2 || i == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 2) {
            objArr[1] = "recursionDetected";
        } else if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i != 2 && i != 3) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 2 && i != 3) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public C0260Jx f(boolean z) {
        C0260Jx d = this.h.d(null, "in a lazy value");
        if (d != null) {
            return d;
        }
        a(2);
        throw null;
    }

    @Override // o.InterfaceC1455lp
    public Object invoke() {
        Object invoke;
        UA ua = UA.j;
        UA ua2 = UA.i;
        Object obj = this.j;
        if (!(obj instanceof UA)) {
            AbstractC1052fg.Z(obj);
            return obj;
        }
        this.h.a.lock();
        try {
            Object obj2 = this.j;
            if (!(obj2 instanceof UA)) {
                AbstractC1052fg.Z(obj2);
                return obj2;
            }
            try {
                if (obj2 == ua2) {
                    this.j = ua;
                    C0260Jx f = f(true);
                    if (!f.i) {
                        invoke = f.j;
                        return invoke;
                    }
                }
                if (obj2 == ua) {
                    C0260Jx f2 = f(false);
                    if (!f2.i) {
                        invoke = f2.j;
                        return invoke;
                    }
                }
                invoke = this.i.invoke();
                d(invoke);
                this.j = invoke;
                return invoke;
            } catch (Throwable th) {
                if (AbstractC1305jX.x(th)) {
                    this.j = UA.h;
                    throw th;
                }
                if (this.j == ua2) {
                    this.j = new V10(th);
                }
                this.h.b.getClass();
                throw th;
            }
            this.j = ua2;
        } finally {
            this.h.a.unlock();
        }
    }

    public void d(Object obj) {
    }
}
