package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class zq {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public boolean e = false;
    public String f = null;

    public zq(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq)) {
            return false;
        }
        zq zqVar = (zq) obj;
        return this.a.equals(zqVar.a) && this.b.equals(zqVar.b) && this.c == zqVar.c && this.d == zqVar.d && this.e == zqVar.e && oo.b(this.f, zqVar.f);
    }

    public final int hashCode() {
        int hashCode = (Boolean.hashCode(this.e) + ((Integer.hashCode(this.d) + ((Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Achievement(id=" + this.a + ", emoji=" + this.b + ", titleRes=" + this.c + ", descRes=" + this.d + ", isUnlocked=" + this.e + ", unlockedAt=" + this.f + ")";
    }
}
