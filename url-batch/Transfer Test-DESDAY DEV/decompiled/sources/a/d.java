package a;

import androidx.activity.ComponentActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f1185b;

    public /* synthetic */ d(ComponentActivity componentActivity, int i) {
        this.f1184a = i;
        this.f1185b = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ComponentActivity componentActivity = this.f1185b;
        switch (this.f1184a) {
            case 0:
                int i = ComponentActivity.f1237r;
                g1.f.e(componentActivity, "this$0");
                componentActivity.invalidateOptionsMenu();
                return;
            default:
                g1.f.e(componentActivity, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!g1.f.a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!g1.f.a(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
        }
    }
}
