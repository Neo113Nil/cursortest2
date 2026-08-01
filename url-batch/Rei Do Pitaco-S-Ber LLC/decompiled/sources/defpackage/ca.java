package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ca implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ ca(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int min = Math.min(str.length(), str2.length());
                int i3 = 4;
                while (true) {
                    if (i3 >= min) {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length >= length2) {
                            return 1;
                        }
                    } else {
                        char charAt = str.charAt(i3);
                        char charAt2 = str2.charAt(i3);
                        if (charAt == charAt2) {
                            i3++;
                        } else if (oo.h(charAt, charAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            case 1:
                WeakHashMap weakHashMap = f80.a;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 2:
                bm bmVar = (bm) obj;
                bm bmVar2 = (bm) obj2;
                RecyclerView recyclerView = bmVar.d;
                if ((recyclerView == null) == (bmVar2.d == null)) {
                    boolean z3 = bmVar.a;
                    if (z3 == bmVar2.a) {
                        int i4 = bmVar2.b - bmVar.b;
                        if (i4 != 0) {
                            return i4;
                        }
                        int i5 = bmVar.c - bmVar2.c;
                        if (i5 != 0) {
                            return i5;
                        }
                        return 0;
                    }
                    if (!z3) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 3:
                i = ((o20) obj).g;
                i2 = ((o20) obj2).g;
                break;
            default:
                i = ((View) obj).getTop();
                i2 = ((View) obj2).getTop();
                break;
        }
        return i - i2;
    }
}
