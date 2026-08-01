package G0;

import K.H;
import K.T;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g0.C0161n;
import java.util.Comparator;
import java.util.WeakHashMap;
import q.C0333f;

/* loaded from: classes.dex */
public final class n implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f515a;

    public /* synthetic */ n(int i) {
        this.f515a = i;
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
        switch (this.f515a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0161n c0161n = (C0161n) obj;
                C0161n c0161n2 = (C0161n) obj2;
                RecyclerView recyclerView = c0161n.d;
                if ((recyclerView == null) == (c0161n2.d == null)) {
                    boolean z2 = c0161n.f2955a;
                    if (z2 == c0161n2.f2955a) {
                        i = c0161n2.f2956b - c0161n.f2956b;
                        if (i == 0) {
                            int i2 = c0161n.f2957c - c0161n2.f2957c;
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
                return ((C0333f) obj).f3844b - ((C0333f) obj2).f3844b;
            default:
                WeakHashMap weakHashMap = T.f633a;
                float m2 = H.m((View) obj);
                float m3 = H.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
