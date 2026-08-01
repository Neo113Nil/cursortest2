package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0239u0;
import l.C0210g;
import l.C0212h;
import l.C0216j;
import l.C0218k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153b extends AbstractViewOnTouchListenerC0239u0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2711j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2712k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2712k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0239u0
    public final InterfaceC0149C b() {
        C0210g c0210g;
        switch (this.f2711j) {
            case 0:
                AbstractC0154c abstractC0154c = ((ActionMenuItemView) this.f2712k).f1257m;
                if (abstractC0154c == null || (c0210g = ((C0212h) abstractC0154c).f3007a.f3032t) == null) {
                    return null;
                }
                return c0210g.a();
            default:
                C0210g c0210g2 = ((C0216j) this.f2712k).d.f3031s;
                if (c0210g2 == null) {
                    return null;
                }
                return c0210g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0239u0
    public final boolean c() {
        InterfaceC0149C b2;
        switch (this.f2711j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2712k;
                InterfaceC0163l interfaceC0163l = actionMenuItemView.f1255k;
                return interfaceC0163l != null && interfaceC0163l.b(actionMenuItemView.h) && (b2 = b()) != null && b2.a();
            default:
                ((C0216j) this.f2712k).d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0239u0
    public boolean d() {
        switch (this.f2711j) {
            case 1:
                C0218k c0218k = ((C0216j) this.f2712k).d;
                if (c0218k.f3033u != null) {
                    return false;
                }
                c0218k.e();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153b(C0216j c0216j, C0216j c0216j2) {
        super(c0216j2);
        this.f2712k = c0216j;
    }
}
