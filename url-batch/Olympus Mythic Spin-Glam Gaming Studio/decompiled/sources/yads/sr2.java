package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
public final class sr2 {
    public final WeakReference a;

    public sr2(View view) {
        this.a = new WeakReference(view);
    }

    public final void a() {
        View view = (View) this.a.get();
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
