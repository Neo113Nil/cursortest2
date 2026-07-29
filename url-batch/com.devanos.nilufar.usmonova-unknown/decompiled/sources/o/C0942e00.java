package o;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: o.e00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0942e00 {
    public final WeakReference a;

    public C0942e00(View view) {
        this.a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(InterfaceC1008f00 interfaceC1008f00) {
        View view = (View) this.a.get();
        if (view != null) {
            if (interfaceC1008f00 != null) {
                view.animate().setListener(new C1337k1(interfaceC1008f00, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
