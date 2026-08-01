package R0;

import android.view.View;

/* renamed from: R0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0028b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f657b;

    public /* synthetic */ ViewOnFocusChangeListenerC0028b(q qVar, int i) {
        this.f656a = i;
        this.f657b = qVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f656a) {
            case 0:
                e eVar = (e) this.f657b;
                eVar.t(eVar.u());
                break;
            default:
                k kVar = (k) this.f657b;
                kVar.f680l = z2;
                kVar.q();
                if (!z2) {
                    kVar.t(false);
                    kVar.f681m = false;
                    break;
                }
                break;
        }
    }
}
