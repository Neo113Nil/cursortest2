package androidx.compose.ui.input.rotary;

import kotlin.Metadata;
import o.I2;
import o.MO;
import o.TC;
import o.XC;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Lo/XC;", "Lo/MO;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class RotaryInputElement extends XC {
    @Override // o.XC
    public final TC d() {
        I2 i2 = I2.k;
        MO mo = new MO();
        mo.n = i2;
        return mo;
    }

    @Override // o.XC
    public final void e(TC tc) {
        ((MO) tc).n = I2.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        Object obj2 = I2.k;
        ((RotaryInputElement) obj).getClass();
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return I2.k.hashCode() * 31;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + I2.k + ", onPreRotaryScrollEvent=null)";
    }
}
