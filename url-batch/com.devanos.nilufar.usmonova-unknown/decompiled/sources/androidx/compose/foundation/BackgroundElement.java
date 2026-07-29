package androidx.compose.foundation;

import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC1305jX;
import o.AbstractC1888sN;
import o.C0140Fh;
import o.C1114gc;
import o.TC;
import o.W7;
import o.XC;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Lo/XC;", "Lo/W7;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackgroundElement extends XC {
    public final long a;
    public final float b;
    public final C0140Fh c;

    public BackgroundElement(long j) {
        C0140Fh c0140Fh = AbstractC1305jX.k;
        this.a = j;
        this.b = 1.0f;
        this.c = c0140Fh;
    }

    @Override // o.XC
    public final TC d() {
        W7 w7 = new W7();
        w7.n = this.a;
        w7.f122o = this.c;
        w7.p = 9205357640488583168L;
        return w7;
    }

    @Override // o.XC
    public final void e(TC tc) {
        W7 w7 = (W7) tc;
        w7.n = this.a;
        w7.f122o = this.c;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && C1114gc.b(this.a, backgroundElement.a) && this.b == backgroundElement.b && AbstractC0048Bt.h(this.c, backgroundElement.c);
    }

    public final int hashCode() {
        int i = C1114gc.g;
        return this.c.hashCode() + AbstractC1888sN.e(this.b, Long.hashCode(this.a) * 961, 31);
    }
}
