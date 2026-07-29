package o;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* renamed from: o.Go, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173Go extends AbstractC1305jX implements InterfaceC0829cG, InterfaceC0746b00, ZF, MP, InterfaceC0799bp {
    public final J4 r;
    public final J4 s;
    public final Handler t;
    public final C0614Xo u;
    public final /* synthetic */ J4 v;

    public C0173Go(J4 j4) {
        this.v = j4;
        Handler handler = new Handler();
        this.r = j4;
        this.s = j4;
        this.t = handler;
        this.u = new C0614Xo();
    }

    @Override // o.AbstractC1305jX
    public final View C(int i) {
        return this.v.findViewById(i);
    }

    @Override // o.AbstractC1305jX
    public final boolean D() {
        Window window = this.v.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // o.InterfaceC0799bp
    public final void a(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        this.v.onAttachFragment(abstractComponentCallbacksC0069Co);
    }

    @Override // o.InterfaceC0829cG
    public final void addOnConfigurationChangedListener(InterfaceC0655Zd interfaceC0655Zd) {
        this.v.addOnConfigurationChangedListener(interfaceC0655Zd);
    }

    @Override // o.InterfaceC0365Nz
    public final AbstractC0106Dz getLifecycle() {
        return this.v.mFragmentLifecycleRegistry;
    }

    @Override // o.ZF
    public final YF getOnBackPressedDispatcher() {
        return this.v.getOnBackPressedDispatcher();
    }

    @Override // o.MP
    public final KP getSavedStateRegistry() {
        return this.v.getSavedStateRegistry();
    }

    @Override // o.InterfaceC0746b00
    public final C0680a00 getViewModelStore() {
        return this.v.getViewModelStore();
    }

    @Override // o.InterfaceC0829cG
    public final void removeOnConfigurationChangedListener(InterfaceC0655Zd interfaceC0655Zd) {
        this.v.removeOnConfigurationChangedListener(interfaceC0655Zd);
    }
}
