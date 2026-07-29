package o;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: o.xR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2222xR implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int h = 1;
    public final Object i;
    public final Object j;

    public ViewOnAttachStateChangeListenerC2222xR(C2288yR c2288yR, Activity activity) {
        AbstractC0048Bt.n(c2288yR, "sidecarCompat");
        this.i = c2288yR;
        this.j = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.j).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((C2288yR) this.i).c(iBinder, activity);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n(view, "view");
                break;
            default:
                ((View) this.i).removeOnAttachStateChangeListener(this);
                ((C0901dM) this.j).d();
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC2222xR(View view, C0901dM c0901dM) {
        this.i = view;
        this.j = c0901dM;
    }

    private final void a(View view) {
    }
}
