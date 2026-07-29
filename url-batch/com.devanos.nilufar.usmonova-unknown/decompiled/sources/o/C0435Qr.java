package o;

import java.io.IOException;

/* renamed from: o.Qr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435Qr extends LU {
    public final /* synthetic */ C0461Rr e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0435Qr(String str, C0461Rr c0461Rr, int i, long j) {
        super(str, true);
        this.e = c0461Rr;
        this.f = i;
        this.g = j;
    }

    @Override // o.LU
    public final long a() {
        C0461Rr c0461Rr = this.e;
        try {
            c0461Rr.D.v(this.g, this.f);
            return -1L;
        } catch (IOException e) {
            c0461Rr.b(2, 2, e);
            return -1L;
        }
    }
}
