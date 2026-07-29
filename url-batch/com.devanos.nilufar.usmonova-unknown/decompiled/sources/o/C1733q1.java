package o;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* renamed from: o.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1733q1 extends AbstractViewOnTouchListenerC1981to {
    public final /* synthetic */ int q = 0;
    public final /* synthetic */ View r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1733q1(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.r = actionMenuItemView;
    }

    @Override // o.AbstractViewOnTouchListenerC1981to
    public final InterfaceC1629oR b() {
        C1864s1 c1864s1;
        switch (this.q) {
            case 0:
                AbstractC1798r1 abstractC1798r1 = ((ActionMenuItemView) this.r).t;
                if (abstractC1798r1 == null || (c1864s1 = ((C1930t1) abstractC1798r1).a.A) == null) {
                    return null;
                }
                return c1864s1.a();
            default:
                C1864s1 c1864s12 = ((C2062v1) this.r).k.z;
                if (c1864s12 == null) {
                    return null;
                }
                return c1864s12.a();
        }
    }

    @Override // o.AbstractViewOnTouchListenerC1981to
    public final boolean c() {
        InterfaceC1629oR b;
        switch (this.q) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.r;
                InterfaceC0760bC interfaceC0760bC = actionMenuItemView.r;
                return interfaceC0760bC != null && interfaceC0760bC.b(actionMenuItemView.f0o) && (b = b()) != null && b.a();
            default:
                ((C2062v1) this.r).k.l();
                return true;
        }
    }

    @Override // o.AbstractViewOnTouchListenerC1981to
    public boolean d() {
        switch (this.q) {
            case 1:
                C2128w1 c2128w1 = ((C2062v1) this.r).k;
                if (c2128w1.B != null) {
                    return false;
                }
                c2128w1.d();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1733q1(C2062v1 c2062v1, C2062v1 c2062v12) {
        super(c2062v12);
        this.r = c2062v1;
    }
}
