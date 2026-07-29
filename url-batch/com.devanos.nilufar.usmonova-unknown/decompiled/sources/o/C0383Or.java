package o;

import java.io.IOException;
import java.util.List;

/* renamed from: o.Or, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383Or extends LU {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ C0461Rr f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0383Or(String str, C0461Rr c0461Rr, int i, List list) {
        super(str, true);
        this.f = c0461Rr;
        this.g = i;
    }

    @Override // o.LU
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.r.getClass();
                try {
                    this.f.D.t(this.g, 9);
                    synchronized (this.f) {
                        this.f.F.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f.r.getClass();
                try {
                    this.f.D.t(this.g, 9);
                    synchronized (this.f) {
                        this.f.F.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0383Or(String str, C0461Rr c0461Rr, int i, List list, boolean z) {
        super(str, true);
        this.f = c0461Rr;
        this.g = i;
    }
}
