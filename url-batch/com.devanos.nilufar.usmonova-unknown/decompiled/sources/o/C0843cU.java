package o;

/* renamed from: o.cU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0843cU extends AbstractC1807r8 {
    public final float i;
    public final int j;

    public C0843cU(float f, int i) {
        this.i = f;
        this.j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0843cU)) {
            return false;
        }
        C0843cU c0843cU = (C0843cU) obj;
        return this.i == c0843cU.i && this.j == c0843cU.j;
    }

    public final int hashCode() {
        return (Integer.hashCode(0) + ((Integer.hashCode(this.j) + AbstractC1888sN.e(4.0f, Float.hashCode(this.i) * 31, 31)) * 31)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.i);
        sb.append(", miter=4.0, cap=");
        int i = this.j;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        sb.append((Object) "Miter");
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
