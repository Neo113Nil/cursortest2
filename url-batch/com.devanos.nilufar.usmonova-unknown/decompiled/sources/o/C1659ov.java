package o;

/* renamed from: o.ov, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1659ov implements InterfaceC0607Xh {
    public final C0870cv h;
    public final C0870cv i;
    public final OM j;

    public C1659ov(OM om, C2281yK c2281yK, C1593nv c1593nv, int i) {
        AbstractC0048Bt.n(om, "kotlinClass");
        AbstractC0048Bt.n(c2281yK, "packageProto");
        AbstractC0048Bt.n(c1593nv, "nameResolver");
        AbstractC1888sN.p(i, "abiStability");
        C0870cv b = C0870cv.b(AbstractC1492mM.a(om.a));
        C0202Hr c0202Hr = om.b;
        C0870cv c0870cv = null;
        String str = ((EnumC0571Vx) c0202Hr.c) != EnumC0571Vx.MULTIFILE_CLASS_PART ? null : (String) c0202Hr.h;
        if (str != null && str.length() > 0) {
            c0870cv = C0870cv.d(str);
        }
        this.h = b;
        this.i = c0870cv;
        this.j = om;
        C2049uq c2049uq = AbstractC0180Gv.m;
        AbstractC0048Bt.m(c2049uq, "packageModuleName");
        Integer num = (Integer) AbstractC1305jX.s(c2281yK, c2049uq);
        if (num != null) {
            c1593nv.getString(num.intValue());
        }
    }

    public final C1639ob a() {
        C2245xo c2245xo;
        C0870cv c0870cv = this.h;
        String str = c0870cv.a;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            c2245xo = C2245xo.c;
            if (c2245xo == null) {
                C0870cv.a(7);
                throw null;
            }
        } else {
            c2245xo = new C2245xo(str.substring(0, lastIndexOf).replace('/', '.'));
        }
        String e = c0870cv.e();
        AbstractC0048Bt.m(e, "className.internalName");
        return new C1639ob(c2245xo, C0827cE.e(UT.Q(e, '/', e)));
    }

    @Override // o.InterfaceC0607Xh
    public final String f() {
        return "Class '" + a().b().b() + '\'';
    }

    public final String toString() {
        return C1659ov.class.getSimpleName() + ": " + this.h;
    }
}
