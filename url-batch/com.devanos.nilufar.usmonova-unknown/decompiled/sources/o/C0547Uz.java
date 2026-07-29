package o;

/* renamed from: o.Uz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547Uz implements InterfaceC1388ko {
    public final float a;

    public C0547Uz(float f) {
        this.a = f;
    }

    @Override // o.InterfaceC1388ko
    public final float a(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0547Uz) && Float.compare(this.a, ((C0547Uz) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ')';
    }
}
