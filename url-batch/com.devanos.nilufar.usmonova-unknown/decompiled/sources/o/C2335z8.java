package o;

import java.util.HashMap;
import java.util.List;

/* renamed from: o.z8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2335z8 extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ AbstractC0700aI[] h;
    public final /* synthetic */ List i;
    public final /* synthetic */ AbstractC1415lB j;
    public final /* synthetic */ C1230iM k;
    public final /* synthetic */ C1230iM l;
    public final /* synthetic */ A8 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2335z8(AbstractC0700aI[] abstractC0700aIArr, List list, AbstractC1415lB abstractC1415lB, C1230iM c1230iM, C1230iM c1230iM2, A8 a8) {
        super(1);
        this.h = abstractC0700aIArr;
        this.i = list;
        this.j = abstractC1415lB;
        this.k = c1230iM;
        this.l = c1230iM2;
        this.m = a8;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        ZH zh = (ZH) obj;
        AbstractC0700aI[] abstractC0700aIArr = this.h;
        int length = abstractC0700aIArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            AbstractC0700aI abstractC0700aI = abstractC0700aIArr[i];
            int i3 = i2 + 1;
            AbstractC0048Bt.l(abstractC0700aI, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            IB ib = (IB) this.i.get(i2);
            EnumC2057uy N = this.j.N();
            int i4 = this.k.h;
            int i5 = this.l.h;
            C1150h8 c1150h8 = this.m.a;
            HashMap hashMap = AbstractC2203x8.a;
            ib.g();
            ZH.d(zh, abstractC0700aI, c1150h8.a(AbstractC0946e20.a(abstractC0700aI.b, abstractC0700aI.c), AbstractC0946e20.a(i4, i5), N));
            i++;
            i2 = i3;
        }
        return C0782bY.a;
    }
}
