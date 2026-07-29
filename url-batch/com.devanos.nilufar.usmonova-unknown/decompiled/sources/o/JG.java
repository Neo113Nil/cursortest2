package o;

/* loaded from: classes.dex */
public abstract class JG {
    public final int a;
    public final int b;

    public JG(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public abstract void a(C0575Wb c0575Wb, C0950e6 c0950e6, C0972eS c0972eS, C1970td c1970td);

    public String b(int i) {
        return "IntParameter(" + i + ')';
    }

    public String c(int i) {
        return "ObjectParameter(" + i + ')';
    }

    public final String toString() {
        String g = UM.a.b(getClass()).g();
        return g == null ? "" : g;
    }

    public /* synthetic */ JG(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
