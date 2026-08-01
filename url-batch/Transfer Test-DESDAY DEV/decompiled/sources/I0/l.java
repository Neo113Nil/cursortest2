package I0;

import K.H;
import K.T;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g0.C0126o;
import java.util.Comparator;
import java.util.WeakHashMap;
import q.C0322f;

/* loaded from: classes.dex */
public final class l implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f346a;

    public /* synthetic */ l(int i) {
        this.f346a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i = 1;
        switch (this.f346a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0126o c0126o = (C0126o) obj;
                C0126o c0126o2 = (C0126o) obj2;
                RecyclerView recyclerView = c0126o.d;
                if ((recyclerView == null) == (c0126o2.d == null)) {
                    boolean z2 = c0126o.f2519a;
                    if (z2 == c0126o2.f2519a) {
                        i = c0126o2.f2520b - c0126o.f2520b;
                        if (i == 0) {
                            int i2 = c0126o.f2521c - c0126o2.f2521c;
                            if (i2 != 0) {
                                return i2;
                            }
                            return 0;
                        }
                    }
                    return i;
                }
                break;
            case 2:
                return ((C0322f) obj).f3459b - ((C0322f) obj2).f3459b;
            default:
                WeakHashMap weakHashMap = T.f372a;
                float m2 = H.m((View) obj);
                float m3 = H.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
