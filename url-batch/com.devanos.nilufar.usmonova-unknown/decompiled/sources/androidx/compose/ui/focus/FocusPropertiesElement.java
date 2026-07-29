package androidx.compose.ui.focus;

import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.C0276Kn;
import o.C0327Mn;
import o.I2;
import o.TC;
import o.XC;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Lo/XC;", "Lo/Mn;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FocusPropertiesElement extends XC {
    public final C0276Kn a;

    public FocusPropertiesElement(C0276Kn c0276Kn) {
        this.a = c0276Kn;
    }

    @Override // o.XC
    public final TC d() {
        C0327Mn c0327Mn = new C0327Mn();
        c0327Mn.n = this.a;
        return c0327Mn;
    }

    @Override // o.XC
    public final void e(TC tc) {
        ((C0327Mn) tc).n = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && AbstractC0048Bt.h(this.a, ((FocusPropertiesElement) obj).a);
    }

    public final int hashCode() {
        return I2.F.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.a + ')';
    }
}
