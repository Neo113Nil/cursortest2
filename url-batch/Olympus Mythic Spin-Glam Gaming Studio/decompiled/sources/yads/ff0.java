package yads;

/* loaded from: classes15.dex */
public final class ff0 implements Comparable {
    public final boolean b;
    public final boolean c;

    public ff0(jw0 jw0Var, int i) {
        this.b = (jw0Var.e & 1) != 0;
        this.c = pf0.a(false, i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ff0 ff0Var = (ff0) obj;
        return xx.a(bq.a(this.c, ff0Var.c)).a(this.b, ff0Var.b).a();
    }
}
