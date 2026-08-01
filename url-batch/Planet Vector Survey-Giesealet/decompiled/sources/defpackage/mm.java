package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class mm {
    public final boolean a = true;
    public final boolean b = true;
    public final ap0 c = ap0.d;
    public final boolean d = true;
    public final boolean e = true;
    public final String f = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm)) {
            return false;
        }
        mm mmVar = (mm) obj;
        return this.a == mmVar.a && this.b == mmVar.b && this.c == mmVar.c && this.d == mmVar.d && this.e == mmVar.e;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() + ((((this.a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237);
    }
}
