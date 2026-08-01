package H;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import g0.I;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f215a;

    /* renamed from: b, reason: collision with root package name */
    public final int f216b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f217c;

    public /* synthetic */ b(Object obj, int i, int i2) {
        this.f215a = i2;
        this.f217c = obj;
        this.f216b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f215a) {
            case 0:
                B.b bVar = (B.b) ((A0.h) this.f217c).f30b;
                if (bVar != null) {
                    bVar.g(this.f216b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f217c;
                int size = arrayList.size();
                int i = 0;
                if (this.f216b == 1) {
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
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) this.f217c).f1901a0;
                if (!recyclerView.f1639w) {
                    I i2 = recyclerView.f1621m;
                    if (i2 != null) {
                        i2.z0(recyclerView, this.f216b);
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
        this.f215a = 1;
        A.c.l(list, "initCallbacks cannot be null");
        this.f217c = new ArrayList(list);
        this.f216b = i;
    }
}
