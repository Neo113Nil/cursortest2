package o;

/* renamed from: o.Ec, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0109Ec implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ AbstractActivityC0446Rc i;

    public /* synthetic */ RunnableC0109Ec(AbstractActivityC0446Rc abstractActivityC0446Rc, int i) {
        this.h = i;
        this.i = abstractActivityC0446Rc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                AbstractActivityC0446Rc abstractActivityC0446Rc = this.i;
                AbstractC0048Bt.n(abstractActivityC0446Rc, "this$0");
                abstractActivityC0446Rc.invalidateMenu();
                return;
            default:
                AbstractActivityC0446Rc abstractActivityC0446Rc2 = this.i;
                AbstractC0048Bt.n(abstractActivityC0446Rc2, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!AbstractC0048Bt.h(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!AbstractC0048Bt.h(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
        }
    }
}
