package o;

/* loaded from: classes.dex */
public final class OA extends RA implements XE {
    public volatile C0208Hx k;
    public final /* synthetic */ C1400l l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OA(VA va, C1139h0 c1139h0, C1400l c1400l) {
        super(va, c1139h0);
        this.l = c1400l;
        if (va == null) {
            g(0);
            throw null;
        }
        this.k = null;
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 2 ? 2 : 3];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String format = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalArgumentException(format);
        }
    }

    public static /* synthetic */ void g(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(format);
        }
    }

    @Override // o.RA
    public final void d(Object obj) {
        this.k = new C0208Hx(24, obj);
        try {
            if (obj != null) {
                this.l.invoke(obj);
            } else {
                a(2);
                throw null;
            }
        } finally {
            this.k = null;
        }
    }

    @Override // o.RA
    public final C0260Jx f(boolean z) {
        return new C0260Jx(new C1073g0(AbstractC0868ct.J(C0273Kk.d)), false, 2);
    }

    @Override // o.RA, o.InterfaceC1455lp
    public final Object invoke() {
        Object invoke;
        C0208Hx c0208Hx = this.k;
        if (c0208Hx == null || ((Thread) c0208Hx.j) != Thread.currentThread()) {
            invoke = super.invoke();
        } else {
            if (((Thread) c0208Hx.j) != Thread.currentThread()) {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            invoke = c0208Hx.i;
        }
        if (invoke != null) {
            return invoke;
        }
        g(2);
        throw null;
    }
}
