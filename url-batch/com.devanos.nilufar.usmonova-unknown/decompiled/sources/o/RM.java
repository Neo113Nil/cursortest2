package o;

import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public final class RM extends PX implements InterfaceC1455lp {
    public final InterfaceC1455lp p;
    public volatile SoftReference q;

    public RM(Object obj, InterfaceC1455lp interfaceC1455lp) {
        if (interfaceC1455lp == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.q = null;
        this.p = interfaceC1455lp;
        if (obj != null) {
            this.q = new SoftReference(obj);
        }
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        Object obj;
        Object obj2 = PX.k;
        SoftReference softReference = this.q;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object invoke = this.p.invoke();
        if (invoke != null) {
            obj2 = invoke;
        }
        this.q = new SoftReference(obj2);
        return invoke;
    }
}
