package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractViewOnTouchListenerC0267w0;
import l.C0234g;
import l.C0236h;
import l.C0240j;
import l.C0244l;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146b extends AbstractViewOnTouchListenerC0267w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2637j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2638k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0146b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2638k = actionMenuItemView;
    }

    @Override // l.AbstractViewOnTouchListenerC0267w0
    public final InterfaceC0142C b() {
        C0234g c0234g;
        switch (this.f2637j) {
            case 0:
                AbstractC0147c abstractC0147c = ((ActionMenuItemView) this.f2638k).f1107m;
                if (abstractC0147c == null || (c0234g = ((C0236h) abstractC0147c).f2985a.f3021t) == null) {
                    return null;
                }
                return c0234g.a();
            default:
                C0234g c0234g2 = ((C0240j) this.f2638k).d.f3020s;
                if (c0234g2 == null) {
                    return null;
                }
                return c0234g2.a();
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0267w0
    public final boolean c() {
        InterfaceC0142C b2;
        switch (this.f2637j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2638k;
                InterfaceC0156l interfaceC0156l = actionMenuItemView.f1105k;
                return interfaceC0156l != null && interfaceC0156l.b(actionMenuItemView.h) && (b2 = b()) != null && b2.a();
            default:
                ((C0240j) this.f2638k).d.l();
                return true;
        }
    }

    @Override // l.AbstractViewOnTouchListenerC0267w0
    public boolean d() {
        switch (this.f2637j) {
            case 1:
                C0244l c0244l = ((C0240j) this.f2638k).d;
                if (c0244l.f3022u != null) {
                    return false;
                }
                c0244l.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0146b(C0240j c0240j, C0240j c0240j2) {
        super(c0240j2);
        this.f2638k = c0240j;
    }
}
