package androidx.compose.ui.semantics;

import kotlin.Metadata;
import o.AbstractC1596ny;
import o.C0085De;
import o.InterfaceC2114vp;
import o.SC;
import o.TC;
import o.XC;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Lo/XC;", "Lo/De;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AppendedSemanticsElement extends XC implements SC {
    public final AbstractC1596ny a;

    /* JADX WARN: Multi-variable type inference failed */
    public AppendedSemanticsElement(InterfaceC2114vp interfaceC2114vp) {
        this.a = (AbstractC1596ny) interfaceC2114vp;
    }

    @Override // o.XC
    public final TC d() {
        C0085De c0085De = new C0085De();
        c0085De.n = true;
        c0085De.f32o = this.a;
        return c0085De;
    }

    @Override // o.XC
    public final void e(TC tc) {
        C0085De c0085De = (C0085De) tc;
        c0085De.n = true;
        c0085De.f32o = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        appendedSemanticsElement.getClass();
        return this.a.equals(appendedSemanticsElement.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=true, properties=" + this.a + ')';
    }
}
