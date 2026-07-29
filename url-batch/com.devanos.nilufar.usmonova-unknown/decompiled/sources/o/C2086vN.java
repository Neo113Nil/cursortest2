package o;

/* renamed from: o.vN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2086vN implements InterfaceC0288Kz {
    public final /* synthetic */ EnumC0054Bz h;
    public final /* synthetic */ C1360kM i;
    public final /* synthetic */ InterfaceC0422Qe j;
    public final /* synthetic */ EnumC0054Bz k;
    public final /* synthetic */ C0849ca l;
    public final /* synthetic */ C0762bE m;
    public final /* synthetic */ C0041Bm n;

    public C2086vN(EnumC0054Bz enumC0054Bz, C1360kM c1360kM, InterfaceC0422Qe interfaceC0422Qe, EnumC0054Bz enumC0054Bz2, C0849ca c0849ca, C0762bE c0762bE, C0041Bm c0041Bm) {
        this.h = enumC0054Bz;
        this.i = c1360kM;
        this.j = interfaceC0422Qe;
        this.k = enumC0054Bz2;
        this.l = c0849ca;
        this.m = c0762bE;
        this.n = c0041Bm;
    }

    @Override // o.InterfaceC0288Kz
    public final void j(InterfaceC0365Nz interfaceC0365Nz, EnumC0054Bz enumC0054Bz) {
        EnumC0054Bz enumC0054Bz2 = this.h;
        C1360kM c1360kM = this.i;
        if (enumC0054Bz == enumC0054Bz2) {
            c1360kM.h = AbstractC0868ct.H(this.j, null, null, new C2020uN(this.m, this.n, null), 3);
            return;
        }
        if (enumC0054Bz == this.k) {
            InterfaceC0075Cu interfaceC0075Cu = (InterfaceC0075Cu) c1360kM.h;
            if (interfaceC0075Cu != null) {
                interfaceC0075Cu.c(null);
            }
            c1360kM.h = null;
        }
        if (enumC0054Bz == EnumC0054Bz.ON_DESTROY) {
            this.l.resumeWith(C0782bY.a);
        }
    }
}
