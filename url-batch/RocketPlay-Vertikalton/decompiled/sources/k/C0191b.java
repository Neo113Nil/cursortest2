package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0284w0;
import l.C0251g;
import l.C0253h;
import l.C0257j;
import l.C0259k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191b extends AbstractViewOnTouchListenerC0284w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f3142j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f3143k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0191b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f3143k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0284w0
    public final InterfaceC0187C b() {
        C0251g c0251g;
        switch (this.f3142j) {
            case 0:
                AbstractC0192c abstractC0192c = ((ActionMenuItemView) this.f3143k).f1646m;
                if (abstractC0192c == null || (c0251g = ((C0253h) abstractC0192c).f3429a.f3464t) == null) {
                    return null;
                }
                return c0251g.a();
            default:
                C0251g c0251g2 = ((C0257j) this.f3143k).d.f3463s;
                if (c0251g2 == null) {
                    return null;
                }
                return c0251g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0284w0
    public final boolean c() {
        InterfaceC0187C b2;
        switch (this.f3142j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f3143k;
                InterfaceC0201l interfaceC0201l = actionMenuItemView.f1644k;
                return interfaceC0201l != null && interfaceC0201l.b(actionMenuItemView.h) && (b2 = b()) != null && b2.a();
            default:
                ((C0257j) this.f3143k).d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0284w0
    public boolean d() {
        switch (this.f3142j) {
            case 1:
                C0259k c0259k = ((C0257j) this.f3143k).d;
                if (c0259k.f3465u != null) {
                    return false;
                }
                c0259k.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0191b(C0257j c0257j, C0257j c0257j2) {
        super(c0257j2);
        this.f3143k = c0257j;
    }
}
