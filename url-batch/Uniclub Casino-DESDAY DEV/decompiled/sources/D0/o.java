package D0;

import K.G;
import K.S;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f0.C0110n;
import java.util.Comparator;
import java.util.WeakHashMap;
import q.C0287f;

/* loaded from: classes.dex */
public final class o implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163a;

    public /* synthetic */ o(int i) {
        this.f163a = i;
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
        switch (this.f163a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0110n c0110n = (C0110n) obj;
                C0110n c0110n2 = (C0110n) obj2;
                RecyclerView recyclerView = c0110n.d;
                if ((recyclerView == null) == (c0110n2.d == null)) {
                    boolean z2 = c0110n.f2137a;
                    if (z2 == c0110n2.f2137a) {
                        i = c0110n2.f2138b - c0110n.f2138b;
                        if (i == 0) {
                            int i2 = c0110n.f2139c - c0110n2.f2139c;
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
                return ((C0287f) obj).f3542b - ((C0287f) obj2).f3542b;
            default:
                WeakHashMap weakHashMap = S.f360a;
                float m2 = G.m((View) obj);
                float m3 = G.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
