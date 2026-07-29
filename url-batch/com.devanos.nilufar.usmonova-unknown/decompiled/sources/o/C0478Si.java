package o;

/* renamed from: o.Si, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0478Si implements InterfaceC1557nL {
    public static final Object j = new Object();
    public volatile InterfaceC2374zl h;
    public volatile Object i;

    public static InterfaceC1557nL a(InterfaceC2374zl interfaceC2374zl) {
        if (interfaceC2374zl instanceof C0478Si) {
            return interfaceC2374zl;
        }
        C0478Si c0478Si = new C0478Si();
        c0478Si.i = j;
        c0478Si.h = interfaceC2374zl;
        return c0478Si;
    }

    @Override // o.InterfaceC1557nL
    public final Object get() {
        Object obj;
        Object obj2 = this.i;
        Object obj3 = j;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.i;
                if (obj == obj3) {
                    obj = this.h.get();
                    Object obj4 = this.i;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.i = obj;
                    this.h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
