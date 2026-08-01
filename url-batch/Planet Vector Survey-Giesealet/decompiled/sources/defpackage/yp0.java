package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yp0 {
    public final String a;
    public final qu b;
    public final boolean c;

    public yp0(String str, qu quVar) {
        this.a = str;
        this.b = quVar;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ yp0(String str) {
        this(str, h6.G);
    }

    public yp0(String str, int i) {
        this(str);
        this.c = true;
    }

    public yp0(String str, boolean z, qu quVar) {
        this(str, quVar);
        this.c = z;
    }
}
