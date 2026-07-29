package o;

/* loaded from: classes.dex */
public interface ZY extends YY {
    @Override // o.YY
    default long a(V3 v3, V3 v32, V3 v33) {
        return (i() + d()) * 1000000;
    }

    int d();

    int i();
}
