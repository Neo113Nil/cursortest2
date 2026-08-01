package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class eq extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ kq f;
    public final /* synthetic */ wq g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eq(kq kqVar, wq wqVar, int i) {
        super(1);
        this.e = i;
        this.f = kqVar;
        this.g = wqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r9.a.a != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        r8 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        if (r1.a.a != null) goto L26;
     */
    @Override // defpackage.mu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj) {
        int i = this.e;
        kq kqVar = this.f;
        cq cqVar = cq.f;
        cq cqVar2 = cq.e;
        cq cqVar3 = cq.d;
        float f = 1.0f;
        wq wqVar = this.g;
        switch (i) {
            case 0:
                yw0 yw0Var = (yw0) obj;
                if (yw0Var.a(cqVar3, cqVar2)) {
                    xq xqVar = kqVar.a.a;
                    return xqVar != null ? xqVar.a : gq.b;
                }
                if (!yw0Var.a(cqVar2, cqVar)) {
                    return gq.b;
                }
                xq xqVar2 = wqVar.a.a;
                return xqVar2 != null ? xqVar2.a : gq.b;
            case 1:
                int ordinal = ((cq) obj).ordinal();
                if (ordinal == 0) {
                    break;
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            g8.c();
                            return null;
                        }
                        break;
                    }
                    return Float.valueOf(f);
                }
            case 2:
                yw0 yw0Var2 = (yw0) obj;
                if (yw0Var2.a(cqVar3, cqVar2)) {
                    return gq.b;
                }
                if (!yw0Var2.a(cqVar2, cqVar)) {
                    return gq.b;
                }
                dx0 dx0Var = wqVar.a;
                return gq.b;
            default:
                int ordinal2 = ((cq) obj).ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        g8.c();
                        return null;
                    }
                    dx0 dx0Var2 = wqVar.a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
