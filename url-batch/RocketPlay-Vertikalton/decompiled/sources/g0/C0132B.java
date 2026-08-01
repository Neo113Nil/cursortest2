package g0;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132B extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((C0147Q) ((Observable) this).mObservers.get(size)).f2804a;
            recyclerView.k(null);
            recyclerView.f1987e0.f2816f = true;
            recyclerView.W(true);
            if (!recyclerView.f1986e.f()) {
                recyclerView.requestLayout();
            }
        }
    }
}
