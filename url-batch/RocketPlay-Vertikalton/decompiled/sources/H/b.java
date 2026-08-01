package H;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import g0.AbstractC0139I;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f541a;

    /* renamed from: b, reason: collision with root package name */
    public final int f542b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f543c;

    public /* synthetic */ b(Object obj, int i, int i2) {
        this.f541a = i2;
        this.f543c = obj;
        this.f542b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f541a) {
            case 0:
                B.b bVar = (B.b) ((A1.d) this.f543c).f38b;
                if (bVar != null) {
                    bVar.g(this.f542b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f543c;
                int size = arrayList.size();
                int i = 0;
                if (this.f542b == 1) {
                    while (i < size) {
                        ((U.h) arrayList.get(i)).a();
                        i++;
                    }
                    break;
                } else {
                    while (i < size) {
                        ((U.h) arrayList.get(i)).getClass();
                        i++;
                    }
                    break;
                }
            default:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) this.f543c).f2269a0;
                if (!recyclerView.f2018w) {
                    AbstractC0139I abstractC0139I = recyclerView.f2000m;
                    if (abstractC0139I != null) {
                        abstractC0139I.z0(recyclerView, this.f542b);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
        }
    }

    public b(List list, int i, Throwable th) {
        this.f541a = 1;
        F1.l.j(list, "initCallbacks cannot be null");
        this.f543c = new ArrayList(list);
        this.f542b = i;
    }
}
