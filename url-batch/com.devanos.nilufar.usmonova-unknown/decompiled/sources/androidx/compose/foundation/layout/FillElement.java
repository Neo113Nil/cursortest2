package androidx.compose.foundation.layout;

import kotlin.Metadata;
import o.AbstractC1888sN;
import o.C0611Xl;
import o.TC;
import o.XC;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Lo/XC;", "Lo/Xl;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FillElement extends XC {
    public final int a;

    public FillElement(int i) {
        this.a = i;
    }

    @Override // o.XC
    public final TC d() {
        C0611Xl c0611Xl = new C0611Xl();
        c0611Xl.n = this.a;
        c0611Xl.f130o = 1.0f;
        return c0611Xl;
    }

    @Override // o.XC
    public final void e(TC tc) {
        C0611Xl c0611Xl = (C0611Xl) tc;
        c0611Xl.n = this.a;
        c0611Xl.f130o = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FillElement) {
            return this.a == ((FillElement) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (AbstractC1888sN.v(this.a) * 31);
    }
}
