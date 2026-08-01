package M0;

import android.view.View;

/* renamed from: M0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0026b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f504b;

    public /* synthetic */ ViewOnFocusChangeListenerC0026b(r rVar, int i) {
        this.f503a = i;
        this.f504b = rVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f503a) {
            case 0:
                C0029e c0029e = (C0029e) this.f504b;
                c0029e.t(c0029e.u());
                break;
            default:
                l lVar = (l) this.f504b;
                lVar.f528l = z2;
                lVar.q();
                if (!z2) {
                    lVar.t(false);
                    lVar.f529m = false;
                    break;
                }
                break;
        }
    }
}
