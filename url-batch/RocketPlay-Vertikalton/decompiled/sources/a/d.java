package a;

import g.AbstractActivityC0129i;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0129i f1564b;

    public /* synthetic */ d(AbstractActivityC0129i abstractActivityC0129i, int i) {
        this.f1563a = i;
        this.f1564b = abstractActivityC0129i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1563a) {
            case 0:
                this.f1564b.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!i1.f.a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!i1.f.a(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
        }
    }
}
