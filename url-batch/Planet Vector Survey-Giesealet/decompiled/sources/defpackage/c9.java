package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class c9 extends v00 implements bu {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (r10.x == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r0 = r10.k0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r10.l0(r0, r10.y) != true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r7 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        r10.x = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        ((defpackage.uy0) r4).e = defpackage.dj.j0(r10, (defpackage.ta) r3);
     */
    @Override // defpackage.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                r10 r10Var = (r10) obj;
                ((gj0) obj3).d = ((d9) obj2).u.a(r10Var.d.e.r(), r10Var.getLayoutDirection(), r10Var);
                break;
            case 1:
                pa paVar = (pa) obj3;
                zi0 j0 = pa.j0(paVar, (ea0) obj2, (bu) obj);
                if (j0 != null) {
                    dj djVar = paVar.r;
                    if (!iz.a(djVar.y, 0L)) {
                        break;
                    } else {
                        g8.s("Expected BringIntoViewRequester to not be used before parents are placed.");
                        break;
                    }
                }
                break;
            case 2:
                dj djVar2 = (dj) obj3;
                p01 p01Var = djVar2.u;
                while (true) {
                    l70 l70Var = (l70) p01Var.e;
                    int i2 = l70Var.f;
                    boolean z = true;
                    if (i2 != 0) {
                        if (i2 == 0) {
                            g8.e("MutableVector is empty.");
                            break;
                        } else {
                            zi0 zi0Var = (zi0) ((bj) l70Var.d[i2 - 1]).a.a();
                            if (!(zi0Var == null ? true : djVar2.l0(zi0Var, djVar2.y))) {
                                break;
                            } else {
                                l70 l70Var2 = (l70) p01Var.e;
                                ((bj) l70Var2.j(l70Var2.f - 1)).b.resumeWith(ky0Var);
                            }
                        }
                    } else {
                        break;
                    }
                }
            default:
                k kVar = (k) obj3;
                kVar.removeOnAttachStateChangeListener((i3) obj2);
                ch0.g(kVar).a.remove((g8) obj);
                break;
        }
        return ky0Var;
    }
}
