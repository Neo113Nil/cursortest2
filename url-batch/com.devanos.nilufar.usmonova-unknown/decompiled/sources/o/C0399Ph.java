package o;

/* renamed from: o.Ph, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0399Ph extends C0981eb implements InterfaceC0373Oh {
    public final C1162hK L;
    public final InterfaceC0893dE M;
    public final C0695aD N;
    public final C1097gL O;
    public final InterfaceC0607Xh P;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public C0399Ph(o.InterfaceC1245ib r12, o.InterfaceC0629Yd r13, o.InterfaceC1738q4 r14, boolean r15, int r16, o.C1162hK r17, o.InterfaceC0893dE r18, o.C0695aD r19, o.C1097gL r20, o.InterfaceC0607Xh r21, o.IS r22) {
        /*
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "containingDeclaration"
            o.AbstractC0048Bt.n(r12, r0)
            java.lang.String r0 = "annotations"
            o.AbstractC0048Bt.n(r14, r0)
            java.lang.String r0 = "kind"
            r5 = r16
            o.AbstractC1888sN.p(r5, r0)
            java.lang.String r0 = "proto"
            o.AbstractC0048Bt.n(r7, r0)
            java.lang.String r0 = "nameResolver"
            o.AbstractC0048Bt.n(r8, r0)
            java.lang.String r0 = "typeTable"
            o.AbstractC0048Bt.n(r9, r0)
            java.lang.String r0 = "versionRequirementTable"
            o.AbstractC0048Bt.n(r10, r0)
            if (r22 != 0) goto L38
            o.Fh r0 = o.IS.e
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L3f
        L38:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L3f:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.L = r7
            r11.M = r8
            r11.N = r9
            r11.O = r10
            r1 = r21
            r11.P = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0399Ph.<init>(o.ib, o.Yd, o.q4, boolean, int, o.hK, o.dE, o.aD, o.gL, o.Xh, o.IS):void");
    }

    @Override // o.C0981eb, o.AbstractC0433Qp
    public final /* bridge */ /* synthetic */ AbstractC0433Qp J0(int i, InterfaceC1738q4 interfaceC1738q4, InterfaceC1118gg interfaceC1118gg, InterfaceC0381Op interfaceC0381Op, C0827cE c0827cE, IS is) {
        return Y0(interfaceC1118gg, interfaceC0381Op, i, interfaceC1738q4, is);
    }

    @Override // o.InterfaceC0726ai
    public final E N() {
        return this.L;
    }

    @Override // o.C0981eb
    /* renamed from: S0 */
    public final /* bridge */ /* synthetic */ C0981eb J0(int i, InterfaceC1738q4 interfaceC1738q4, InterfaceC1118gg interfaceC1118gg, InterfaceC0381Op interfaceC0381Op, C0827cE c0827cE, IS is) {
        return Y0(interfaceC1118gg, interfaceC0381Op, i, interfaceC1738q4, is);
    }

    public final C0399Ph Y0(InterfaceC1118gg interfaceC1118gg, InterfaceC0381Op interfaceC0381Op, int i, InterfaceC1738q4 interfaceC1738q4, IS is) {
        AbstractC0048Bt.n(interfaceC1118gg, "newOwner");
        AbstractC1888sN.p(i, "kind");
        AbstractC0048Bt.n(interfaceC1738q4, "annotations");
        C0399Ph c0399Ph = new C0399Ph((InterfaceC1245ib) interfaceC1118gg, (InterfaceC0629Yd) interfaceC0381Op, interfaceC1738q4, this.K, i, this.L, this.M, this.N, this.O, this.P, is);
        c0399Ph.C = this.C;
        return c0399Ph;
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC0381Op
    public final boolean e0() {
        return false;
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC0381Op
    public final boolean isSuspend() {
        return false;
    }

    @Override // o.InterfaceC0726ai
    public final C0695aD k0() {
        return this.N;
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC0381Op
    public final boolean m() {
        return false;
    }

    @Override // o.InterfaceC0726ai
    public final InterfaceC0607Xh s() {
        return this.P;
    }

    @Override // o.InterfaceC0726ai
    public final InterfaceC0893dE v0() {
        return this.M;
    }

    @Override // o.AbstractC0433Qp, o.OB
    public final boolean w() {
        return false;
    }
}
