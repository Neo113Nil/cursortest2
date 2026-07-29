package o;

/* renamed from: o.zc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2365zc {
    public final Object a;
    public final Y9 b;
    public final InterfaceC2378zp c;
    public final Object d;
    public final Throwable e;

    public C2365zc(Object obj, Y9 y9, InterfaceC2378zp interfaceC2378zp, Object obj2, Throwable th) {
        this.a = obj;
        this.b = y9;
        this.c = interfaceC2378zp;
        this.d = obj2;
        this.e = th;
    }

    public static C2365zc a(C2365zc c2365zc, Y9 y9, Throwable th, int i) {
        Object obj = c2365zc.a;
        if ((i & 2) != 0) {
            y9 = c2365zc.b;
        }
        Y9 y92 = y9;
        InterfaceC2378zp interfaceC2378zp = c2365zc.c;
        Object obj2 = c2365zc.d;
        if ((i & 16) != 0) {
            th = c2365zc.e;
        }
        c2365zc.getClass();
        return new C2365zc(obj, y92, interfaceC2378zp, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2365zc)) {
            return false;
        }
        C2365zc c2365zc = (C2365zc) obj;
        return AbstractC0048Bt.h(this.a, c2365zc.a) && AbstractC0048Bt.h(this.b, c2365zc.b) && AbstractC0048Bt.h(this.c, c2365zc.c) && AbstractC0048Bt.h(this.d, c2365zc.d) && AbstractC0048Bt.h(this.e, c2365zc.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Y9 y9 = this.b;
        int hashCode2 = (hashCode + (y9 == null ? 0 : y9.hashCode())) * 31;
        InterfaceC2378zp interfaceC2378zp = this.c;
        int hashCode3 = (hashCode2 + (interfaceC2378zp == null ? 0 : interfaceC2378zp.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ C2365zc(Object obj, Y9 y9, InterfaceC2378zp interfaceC2378zp, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : y9, (i & 4) != 0 ? null : interfaceC2378zp, (Object) null, (i & 16) != 0 ? null : th);
    }
}
