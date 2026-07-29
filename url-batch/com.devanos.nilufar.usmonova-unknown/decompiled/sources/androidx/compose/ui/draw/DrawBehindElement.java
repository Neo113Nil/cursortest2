package androidx.compose.ui.draw;

import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.C0858cj;
import o.InterfaceC2114vp;
import o.TC;
import o.XC;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Lo/XC;", "Lo/cj;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DrawBehindElement extends XC {
    public final InterfaceC2114vp a;

    public DrawBehindElement(InterfaceC2114vp interfaceC2114vp) {
        this.a = interfaceC2114vp;
    }

    @Override // o.XC
    public final TC d() {
        C0858cj c0858cj = new C0858cj();
        c0858cj.n = this.a;
        return c0858cj;
    }

    @Override // o.XC
    public final void e(TC tc) {
        ((C0858cj) tc).n = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && AbstractC0048Bt.h(this.a, ((DrawBehindElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.a + ')';
    }
}
