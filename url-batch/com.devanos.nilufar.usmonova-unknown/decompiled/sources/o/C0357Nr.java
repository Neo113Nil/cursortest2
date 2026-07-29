package o;

import java.io.IOException;

/* renamed from: o.Nr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357Nr extends LU {
    public final /* synthetic */ C0461Rr e;
    public final /* synthetic */ int f;
    public final /* synthetic */ G8 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0357Nr(String str, C0461Rr c0461Rr, int i, G8 g8, int i2, boolean z) {
        super(str, true);
        this.e = c0461Rr;
        this.f = i;
        this.g = g8;
        this.h = i2;
    }

    @Override // o.LU
    public final long a() {
        try {
            C1623oL c1623oL = this.e.r;
            G8 g8 = this.g;
            int i = this.h;
            c1623oL.getClass();
            g8.skip(i);
            this.e.D.t(this.f, 9);
            synchronized (this.e) {
                this.e.F.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
