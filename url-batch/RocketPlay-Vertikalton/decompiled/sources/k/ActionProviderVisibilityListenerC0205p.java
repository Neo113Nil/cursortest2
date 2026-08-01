package k;

import android.view.ActionProvider;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0205p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public A1.d f3237a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f3238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0209t f3239c;

    public ActionProviderVisibilityListenerC0205p(MenuItemC0209t menuItemC0209t, ActionProvider actionProvider) {
        this.f3239c = menuItemC0209t;
        this.f3238b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        A1.d dVar = this.f3237a;
        if (dVar != null) {
            MenuC0202m menuC0202m = ((C0204o) dVar.f38b).f3224n;
            menuC0202m.h = true;
            menuC0202m.p(true);
        }
    }
}
