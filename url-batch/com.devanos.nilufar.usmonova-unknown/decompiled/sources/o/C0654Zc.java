package o;

import java.util.Arrays;

/* renamed from: o.Zc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654Zc extends AbstractC1596ny implements InterfaceC2312yp {
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0654Zc(int i, int i2, Object obj, Object obj2) {
        super(2);
        this.h = i2;
        this.j = obj;
        this.k = obj2;
        this.i = i;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                ((Number) obj2).intValue();
                C0721ad c0721ad = (C0721ad) this.j;
                int a0 = AbstractC1052fg.a0(this.i) | 1;
                c0721ad.a(this.k, (InterfaceC1377kd) obj, a0);
                break;
            case 1:
                ((Number) obj2).intValue();
                C1491mL[] c1491mLArr = (C1491mL[]) this.j;
                AbstractC1473m3.b((C1491mL[]) Arrays.copyOf(c1491mLArr, c1491mLArr.length), (InterfaceC2312yp) this.k, (InterfaceC1377kd) obj, AbstractC1052fg.a0(this.i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC1473m3.a((C1491mL) this.k, (C0721ad) this.j, (InterfaceC1377kd) obj, AbstractC1052fg.a0(this.i | 1));
                break;
        }
        return C0782bY.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0654Zc(C1491mL c1491mL, C0721ad c0721ad, int i) {
        super(2);
        this.h = 2;
        this.k = c1491mL;
        this.j = c0721ad;
        this.i = i;
    }
}
