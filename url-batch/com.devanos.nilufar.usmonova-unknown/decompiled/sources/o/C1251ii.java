package o;

/* renamed from: o.ii, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1251ii extends HR implements InterfaceC0373Oh {
    public final C2017uK K;
    public final InterfaceC0893dE L;
    public final C0695aD M;
    public final C1097gL N;
    public final InterfaceC0607Xh O;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public C1251ii(o.InterfaceC1118gg r12, o.HR r13, o.InterfaceC1738q4 r14, o.C0827cE r15, int r16, o.C2017uK r17, o.InterfaceC0893dE r18, o.C0695aD r19, o.C1097gL r20, o.InterfaceC0607Xh r21, o.IS r22) {
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
            r11.K = r7
            r11.L = r8
            r11.M = r9
            r11.N = r10
            r1 = r21
            r11.O = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1251ii.<init>(o.gg, o.HR, o.q4, o.cE, int, o.uK, o.dE, o.aD, o.gL, o.Xh, o.IS):void");
    }

    @Override // o.HR, o.AbstractC0433Qp
    public final AbstractC0433Qp J0(int i, InterfaceC1738q4 interfaceC1738q4, InterfaceC1118gg interfaceC1118gg, InterfaceC0381Op interfaceC0381Op, C0827cE c0827cE, IS is) {
        C0827cE c0827cE2;
        AbstractC0048Bt.n(interfaceC1118gg, "newOwner");
        AbstractC1888sN.p(i, "kind");
        AbstractC0048Bt.n(interfaceC1738q4, "annotations");
        HR hr = (HR) interfaceC0381Op;
        if (c0827cE == null) {
            C0827cE name = getName();
            AbstractC0048Bt.m(name, "name");
            c0827cE2 = name;
        } else {
            c0827cE2 = c0827cE;
        }
        C1251ii c1251ii = new C1251ii(interfaceC1118gg, hr, interfaceC1738q4, c0827cE2, i, this.K, this.L, this.M, this.N, this.O, is);
        c1251ii.C = this.C;
        return c1251ii;
    }

    @Override // o.InterfaceC0726ai
    public final E N() {
        return this.K;
    }

    @Override // o.InterfaceC0726ai
    public final C0695aD k0() {
        return this.M;
    }

    @Override // o.InterfaceC0726ai
    public final InterfaceC0607Xh s() {
        return this.O;
    }

    @Override // o.InterfaceC0726ai
    public final InterfaceC0893dE v0() {
        return this.L;
    }
}
