package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class cr {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final LinkedHashSet e;
    public int f;
    public int g;

    public cr(String str, String str2, String str3, String str4, LinkedHashSet linkedHashSet, int i, int i2) {
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = linkedHashSet;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr)) {
            return false;
        }
        cr crVar = (cr) obj;
        return this.a.equals(crVar.a) && oo.b(this.b, crVar.b) && oo.b(this.c, crVar.c) && oo.b(this.d, crVar.d) && this.e.equals(crVar.e) && this.f == crVar.f && this.g == crVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ((Integer.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Habit(id=" + this.a + ", name=" + this.b + ", emoji=" + this.c + ", colorHex=" + this.d + ", completedDates=" + this.e + ", currentStreak=" + this.f + ", bestStreak=" + this.g + ")";
    }
}
