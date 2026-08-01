package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class tl implements sl {
    public final float d;
    public final float e;

    public tl(float f, float f2) {
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.sl
    public final /* synthetic */ long G(long j) {
        return y6.g(j, this);
    }

    @Override // defpackage.sl
    public final /* synthetic */ float I(long j) {
        return y6.f(j, this);
    }

    @Override // defpackage.sl
    public final long P(float f) {
        return y6.h(f / a(), this);
    }

    @Override // defpackage.sl
    public final float a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl)) {
            return false;
        }
        tl tlVar = (tl) obj;
        return Float.compare(this.d, tlVar.d) == 0 && Float.compare(this.e, tlVar.e) == 0;
    }

    @Override // defpackage.sl
    public final float h() {
        return this.e;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.e) + (Float.floatToIntBits(this.d) * 31);
    }

    @Override // defpackage.sl
    public final float o(float f) {
        return a() * f;
    }

    @Override // defpackage.sl
    public final /* synthetic */ float t(long j) {
        return y6.e(j, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.d);
        sb.append(", fontScale=");
        return y6.w(sb, this.e, ')');
    }

    @Override // defpackage.sl
    public final /* synthetic */ int y(float f) {
        return y6.c(f, this);
    }
}
