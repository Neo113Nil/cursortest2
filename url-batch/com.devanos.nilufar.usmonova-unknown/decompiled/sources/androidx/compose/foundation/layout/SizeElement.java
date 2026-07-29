package androidx.compose.foundation.layout;

import kotlin.Metadata;
import o.AbstractC0556Vi;
import o.AbstractC1888sN;
import o.C0710aS;
import o.TC;
import o.XC;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Lo/XC;", "Lo/aS;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SizeElement extends XC {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public SizeElement(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // o.XC
    public final TC d() {
        C0710aS c0710aS = new C0710aS();
        c0710aS.n = this.a;
        c0710aS.f139o = this.b;
        c0710aS.p = this.c;
        c0710aS.q = this.d;
        c0710aS.r = true;
        return c0710aS;
    }

    @Override // o.XC
    public final void e(TC tc) {
        C0710aS c0710aS = (C0710aS) tc;
        c0710aS.n = this.a;
        c0710aS.f139o = this.b;
        c0710aS.p = this.c;
        c0710aS.q = this.d;
        c0710aS.r = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return AbstractC0556Vi.a(this.a, sizeElement.a) && AbstractC0556Vi.a(this.b, sizeElement.b) && AbstractC0556Vi.a(this.c, sizeElement.c) && AbstractC0556Vi.a(this.d, sizeElement.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC1888sN.e(this.d, AbstractC1888sN.e(this.c, AbstractC1888sN.e(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
