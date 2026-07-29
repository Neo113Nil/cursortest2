package o;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class G5 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ B5 h;
    public final /* synthetic */ H5 i;

    public G5(H5 h5, B5 b5) {
        this.i = h5;
        this.h = b5;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.i.M.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.h);
        }
    }
}
