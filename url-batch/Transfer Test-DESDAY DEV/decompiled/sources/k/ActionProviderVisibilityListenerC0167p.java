package k;

import android.view.ActionProvider;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0167p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public A0.h f2806a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2807b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0171t f2808c;

    public ActionProviderVisibilityListenerC0167p(MenuItemC0171t menuItemC0171t, ActionProvider actionProvider) {
        this.f2808c = menuItemC0171t;
        this.f2807b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        A0.h hVar = this.f2806a;
        if (hVar != null) {
            MenuC0164m menuC0164m = ((C0166o) hVar.f30b).f2793n;
            menuC0164m.h = true;
            menuC0164m.p(true);
        }
    }
}
