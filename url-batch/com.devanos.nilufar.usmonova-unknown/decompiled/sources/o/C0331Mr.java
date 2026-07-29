package o;

import java.io.IOException;

/* renamed from: o.Mr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331Mr extends LU {
    public final /* synthetic */ int e;
    public final /* synthetic */ C0461Rr f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0331Mr(String str, C0461Rr c0461Rr, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.f = c0461Rr;
        this.g = i;
        this.h = i2;
    }

    @Override // o.LU
    public final long a() {
        switch (this.e) {
            case 0:
                C0461Rr c0461Rr = this.f;
                try {
                    c0461Rr.D.q(this.g, this.h, true);
                    return -1L;
                } catch (IOException e) {
                    c0461Rr.b(2, 2, e);
                    return -1L;
                }
            case 1:
                C1623oL c1623oL = this.f.r;
                int i = this.h;
                c1623oL.getClass();
                AbstractC1888sN.p(i, "errorCode");
                synchronized (this.f) {
                    this.f.F.remove(Integer.valueOf(this.g));
                }
                return -1L;
            default:
                C0461Rr c0461Rr2 = this.f;
                try {
                    int i2 = this.g;
                    int i3 = this.h;
                    AbstractC1888sN.p(i3, "statusCode");
                    c0461Rr2.D.t(i2, i3);
                    return -1L;
                } catch (IOException e2) {
                    c0461Rr2.b(2, 2, e2);
                    return -1L;
                }
        }
    }
}
