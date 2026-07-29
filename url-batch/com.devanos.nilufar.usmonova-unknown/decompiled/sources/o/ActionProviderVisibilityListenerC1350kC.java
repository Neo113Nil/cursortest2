package o;

import android.view.ActionProvider;

/* renamed from: o.kC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC1350kC implements ActionProvider.VisibilityListener {
    public C1590ns a;
    public final ActionProvider b;

    public ActionProviderVisibilityListenerC1350kC(MenuItemC1548nC menuItemC1548nC, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C1590ns c1590ns = this.a;
        if (c1590ns != null) {
            MenuC0825cC menuC0825cC = ((C1284jC) c1590ns.i).n;
            menuC0825cC.h = true;
            menuC0825cC.p(true);
        }
    }
}
