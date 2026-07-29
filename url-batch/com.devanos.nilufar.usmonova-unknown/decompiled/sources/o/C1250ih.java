package o;

/* renamed from: o.ih, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1250ih implements InterfaceC1119gh {
    public final float b;
    public final float c;
    public final InterfaceC1388ko d;

    public C1250ih(float f, float f2, InterfaceC1388ko interfaceC1388ko) {
        this.b = f;
        this.c = f2;
        this.d = interfaceC1388ko;
    }

    @Override // o.InterfaceC1119gh
    public final float c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1250ih)) {
            return false;
        }
        C1250ih c1250ih = (C1250ih) obj;
        return Float.compare(this.b, c1250ih.b) == 0 && Float.compare(this.c, c1250ih.c) == 0 && AbstractC0048Bt.h(this.d, c1250ih.d);
    }

    @Override // o.InterfaceC1119gh
    public final float f() {
        return this.b;
    }

    public final int hashCode() {
        return this.d.hashCode() + AbstractC1888sN.e(this.c, Float.hashCode(this.b) * 31, 31);
    }

    @Override // o.InterfaceC1119gh
    public final float o(long j) {
        if (C1896sV.a(C1830rV.b(j), 4294967296L)) {
            return this.d.a(C1830rV.c(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.b + ", fontScale=" + this.c + ", converter=" + this.d + ')';
    }
}
