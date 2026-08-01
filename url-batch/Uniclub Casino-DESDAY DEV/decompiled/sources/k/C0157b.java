package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0257w0;
import l.C0224g;
import l.C0226h;
import l.C0230j;
import l.C0232k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157b extends AbstractViewOnTouchListenerC0257w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2646j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2647k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0157b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2647k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0257w0
    public final InterfaceC0153C b() {
        C0224g c0224g;
        switch (this.f2646j) {
            case 0:
                AbstractC0158c abstractC0158c = ((ActionMenuItemView) this.f2647k).f1112m;
                if (abstractC0158c == null || (c0224g = ((C0226h) abstractC0158c).f2994a.f3029t) == null) {
                    return null;
                }
                return c0224g.a();
            default:
                C0224g c0224g2 = ((C0230j) this.f2647k).d.f3028s;
                if (c0224g2 == null) {
                    return null;
                }
                return c0224g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0257w0
    public final boolean c() {
        InterfaceC0153C b2;
        switch (this.f2646j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2647k;
                InterfaceC0167l interfaceC0167l = actionMenuItemView.f1110k;
                return interfaceC0167l != null && interfaceC0167l.b(actionMenuItemView.h) && (b2 = b()) != null && b2.a();
            default:
                ((C0230j) this.f2647k).d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0257w0
    public boolean d() {
        switch (this.f2646j) {
            case 1:
                C0232k c0232k = ((C0230j) this.f2647k).d;
                if (c0232k.f3030u != null) {
                    return false;
                }
                c0232k.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0157b(C0230j c0230j, C0230j c0230j2) {
        super(c0230j2);
        this.f2647k = c0230j;
    }
}
