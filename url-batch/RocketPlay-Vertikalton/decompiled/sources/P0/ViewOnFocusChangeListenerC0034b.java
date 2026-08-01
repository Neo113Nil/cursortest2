package P0;

import android.view.View;

/* renamed from: P0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0034b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f923b;

    public /* synthetic */ ViewOnFocusChangeListenerC0034b(q qVar, int i) {
        this.f922a = i;
        this.f923b = qVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f922a) {
            case 0:
                e eVar = (e) this.f923b;
                eVar.t(eVar.u());
                break;
            default:
                k kVar = (k) this.f923b;
                kVar.f946l = z2;
                kVar.q();
                if (!z2) {
                    kVar.t(false);
                    kVar.f947m = false;
                    break;
                }
                break;
        }
    }
}
