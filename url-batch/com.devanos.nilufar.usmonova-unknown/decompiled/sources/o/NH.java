package o;

/* loaded from: classes.dex */
public class NH extends C {
    public static final NH j = new NH(BW.e, 0);
    public final BW h;
    public final int i;

    public NH(BW bw, int i) {
        this.h = bw;
        this.i = i;
    }

    public final NH a(Object obj, C0758bA c0758bA) {
        C1143h2 u = this.h.u(obj != null ? obj.hashCode() : 0, 0, obj, c0758bA);
        return u == null ? this : new NH((BW) u.i, this.i + u.h);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.h.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.h.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
