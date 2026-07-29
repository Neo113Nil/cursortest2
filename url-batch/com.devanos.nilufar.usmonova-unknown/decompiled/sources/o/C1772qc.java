package o;

/* renamed from: o.qc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1772qc implements InterfaceC0844cV {
    public final long h;

    public C1772qc(long j) {
        this.h = j;
        if (j == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // o.InterfaceC0844cV
    public final float a() {
        return C1114gc.c(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1772qc) && C1114gc.b(this.h, ((C1772qc) obj).h);
    }

    @Override // o.InterfaceC0844cV
    public final long f() {
        return this.h;
    }

    public final int hashCode() {
        int i = C1114gc.g;
        return Long.hashCode(this.h);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C1114gc.g(this.h)) + ')';
    }
}
