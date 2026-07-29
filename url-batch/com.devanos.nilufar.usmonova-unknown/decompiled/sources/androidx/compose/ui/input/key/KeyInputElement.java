package androidx.compose.ui.input.key;

import kotlin.Metadata;
import o.C0182Gx;
import o.P2;
import o.TC;
import o.XC;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Lo/XC;", "Lo/Gx;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class KeyInputElement extends XC {
    public final P2 a;

    public KeyInputElement(P2 p2) {
        this.a = p2;
    }

    @Override // o.XC
    public final TC d() {
        C0182Gx c0182Gx = new C0182Gx();
        c0182Gx.n = this.a;
        return c0182Gx;
    }

    @Override // o.XC
    public final void e(TC tc) {
        ((C0182Gx) tc).n = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KeyInputElement) && this.a.equals(((KeyInputElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "KeyInputElement(onKeyEvent=" + this.a + ", onPreKeyEvent=null)";
    }
}
