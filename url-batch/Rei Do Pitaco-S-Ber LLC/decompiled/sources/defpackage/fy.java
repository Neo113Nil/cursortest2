package defpackage;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class fy extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((vy) ((Observable) this).mObservers.get(size)).a;
            recyclerView.k(null);
            recyclerView.l0.f = true;
            recyclerView.Y(true);
            if (!recyclerView.j.k()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((vy) ((Observable) this).mObservers.get(size)).a;
            recyclerView.k(null);
            y1 y1Var = recyclerView.j;
            ArrayList arrayList = (ArrayList) y1Var.c;
            arrayList.add(y1Var.m(null, 4, i, 1));
            y1Var.a |= 4;
            if (arrayList.size() == 1) {
                if (recyclerView.y && recyclerView.x) {
                    ay ayVar = recyclerView.n;
                    WeakHashMap weakHashMap = f80.a;
                    recyclerView.postOnAnimation(ayVar);
                } else {
                    recyclerView.F = true;
                    recyclerView.requestLayout();
                }
            }
        }
    }
}
