package a;

import g.AbstractActivityC0125i;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0125i f1035b;

    public /* synthetic */ d(AbstractActivityC0125i abstractActivityC0125i, int i) {
        this.f1034a = i;
        this.f1035b = abstractActivityC0125i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1034a) {
            case 0:
                this.f1035b.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!X0.e.a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!X0.e.a(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
        }
    }
}
