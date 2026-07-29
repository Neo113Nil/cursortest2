package o;

import java.io.IOException;

/* renamed from: o.d20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0881d20 extends AbstractC1596ny implements InterfaceC2312yp {
    public final /* synthetic */ C1098gM h;
    public final /* synthetic */ long i;
    public final /* synthetic */ C1294jM j;
    public final /* synthetic */ JL k;
    public final /* synthetic */ C1294jM l;
    public final /* synthetic */ C1294jM m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0881d20(C1098gM c1098gM, long j, C1294jM c1294jM, JL jl, C1294jM c1294jM2, C1294jM c1294jM3) {
        super(2);
        this.h = c1098gM;
        this.i = j;
        this.j = c1294jM;
        this.k = jl;
        this.l = c1294jM2;
        this.m = c1294jM3;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            C1098gM c1098gM = this.h;
            if (c1098gM.h) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            c1098gM.h = true;
            if (longValue < this.i) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            C1294jM c1294jM = this.j;
            long j = c1294jM.h;
            JL jl = this.k;
            if (j == 4294967295L) {
                j = jl.k();
            }
            c1294jM.h = j;
            C1294jM c1294jM2 = this.l;
            c1294jM2.h = c1294jM2.h == 4294967295L ? jl.k() : 0L;
            C1294jM c1294jM3 = this.m;
            c1294jM3.h = c1294jM3.h == 4294967295L ? jl.k() : 0L;
        }
        return C0782bY.a;
    }
}
