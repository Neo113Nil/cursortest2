package k;

import android.view.ActionProvider;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0171p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public C.g f2741a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC0175t f2743c;

    public ActionProviderVisibilityListenerC0171p(MenuItemC0175t menuItemC0175t, ActionProvider actionProvider) {
        this.f2743c = menuItemC0175t;
        this.f2742b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C.g gVar = this.f2741a;
        if (gVar != null) {
            MenuC0168m menuC0168m = ((C0170o) gVar.f62b).f2728n;
            menuC0168m.h = true;
            menuC0168m.p(true);
        }
    }
}
