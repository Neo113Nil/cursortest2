package o;

import java.util.HashMap;

/* renamed from: o.y8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2269y8 extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ AbstractC0700aI h;
    public final /* synthetic */ IB i;
    public final /* synthetic */ AbstractC1415lB j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ A8 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2269y8(AbstractC0700aI abstractC0700aI, IB ib, AbstractC1415lB abstractC1415lB, int i, int i2, A8 a8) {
        super(1);
        this.h = abstractC0700aI;
        this.i = ib;
        this.j = abstractC1415lB;
        this.k = i;
        this.l = i2;
        this.m = a8;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        EnumC2057uy N = this.j.N();
        C1150h8 c1150h8 = this.m.a;
        HashMap hashMap = AbstractC2203x8.a;
        this.i.g();
        AbstractC0700aI abstractC0700aI = this.h;
        ZH.d((ZH) obj, abstractC0700aI, c1150h8.a(AbstractC0946e20.a(abstractC0700aI.b, abstractC0700aI.c), AbstractC0946e20.a(this.k, this.l), N));
        return C0782bY.a;
    }
}
