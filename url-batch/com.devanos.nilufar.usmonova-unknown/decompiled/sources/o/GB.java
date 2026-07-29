package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class GB extends AbstractC1596ny implements InterfaceC2312yp {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GB(C1376kc c1376kc, C0906dR c0906dR, QX qx, C0721ad c0721ad, int i) {
        super(2);
        this.i = c1376kc;
        this.j = c0906dR;
        this.k = qx;
        this.l = c0721ad;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                ((Number) obj2).intValue();
                HB.a((C1376kc) this.i, (C0906dR) this.j, (QX) this.k, (C0721ad) this.l, (InterfaceC1377kd) obj, AbstractC1052fg.a0(3073));
                return C0782bY.a;
            default:
                int intValue = ((Number) obj).intValue();
                long longValue = ((Number) obj2).longValue();
                JL jl = (JL) this.i;
                if (intValue == 21589) {
                    if (longValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    byte readByte = jl.readByte();
                    boolean z = (readByte & 1) == 1;
                    boolean z2 = (readByte & 2) == 2;
                    boolean z3 = (readByte & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (longValue < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z) {
                        ((C1360kM) this.j).h = Long.valueOf(jl.j() * 1000);
                    }
                    if (z2) {
                        ((C1360kM) this.k).h = Long.valueOf(jl.j() * 1000);
                    }
                    if (z3) {
                        ((C1360kM) this.l).h = Long.valueOf(jl.j() * 1000);
                    }
                }
                return C0782bY.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GB(JL jl, C1360kM c1360kM, C1360kM c1360kM2, C1360kM c1360kM3) {
        super(2);
        this.i = jl;
        this.j = c1360kM;
        this.k = c1360kM2;
        this.l = c1360kM3;
    }
}
