package B0;

import K.H;
import K.T;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f0.C0098n;
import java.util.Comparator;
import java.util.WeakHashMap;
import q.C0292f;

/* loaded from: classes.dex */
public final class p implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140a;

    public /* synthetic */ p(int i) {
        this.f140a = i;
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
        switch (this.f140a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0098n c0098n = (C0098n) obj;
                C0098n c0098n2 = (C0098n) obj2;
                RecyclerView recyclerView = c0098n.d;
                if ((recyclerView == null) == (c0098n2.d == null)) {
                    boolean z2 = c0098n.f2132a;
                    if (z2 == c0098n2.f2132a) {
                        i = c0098n2.f2133b - c0098n.f2133b;
                        if (i == 0) {
                            int i2 = c0098n.f2134c - c0098n2.f2134c;
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
                return ((C0292f) obj).f3521b - ((C0292f) obj2).f3521b;
            default:
                WeakHashMap weakHashMap = T.f381a;
                float m2 = H.m((View) obj);
                float m3 = H.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
