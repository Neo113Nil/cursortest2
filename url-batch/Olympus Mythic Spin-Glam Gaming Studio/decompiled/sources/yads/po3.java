package yads;

/* loaded from: classes3.dex */
public final class po3 implements Comparable {
    public final int b;
    public final lo3 c;

    public po3(int i, lo3 lo3Var) {
        this.b = i;
        this.c = lo3Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.b, ((po3) obj).b);
    }
}
