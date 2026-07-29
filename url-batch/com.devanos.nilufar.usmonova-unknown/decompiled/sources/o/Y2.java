package o;

import android.R;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class Y2 {
    public static final void a(Q0 q0, C2287yQ c2287yQ) {
        boolean c = AbstractC0048Bt.c(c2287yQ);
        LinkedHashMap linkedHashMap = c2287yQ.d.h;
        if (c) {
            Object obj = linkedHashMap.get(C1957tQ.u);
            if (obj == null) {
                obj = null;
            }
            C1599o0 c1599o0 = (C1599o0) obj;
            if (c1599o0 != null) {
                q0.a(new L0(null, R.id.accessibilityActionPageUp, c1599o0.a, null));
            }
            Object obj2 = linkedHashMap.get(C1957tQ.w);
            if (obj2 == null) {
                obj2 = null;
            }
            C1599o0 c1599o02 = (C1599o0) obj2;
            if (c1599o02 != null) {
                q0.a(new L0(null, R.id.accessibilityActionPageDown, c1599o02.a, null));
            }
            Object obj3 = linkedHashMap.get(C1957tQ.v);
            if (obj3 == null) {
                obj3 = null;
            }
            C1599o0 c1599o03 = (C1599o0) obj3;
            if (c1599o03 != null) {
                q0.a(new L0(null, R.id.accessibilityActionPageLeft, c1599o03.a, null));
            }
            Object obj4 = linkedHashMap.get(C1957tQ.x);
            if (obj4 == null) {
                obj4 = null;
            }
            C1599o0 c1599o04 = (C1599o0) obj4;
            if (c1599o04 != null) {
                q0.a(new L0(null, R.id.accessibilityActionPageRight, c1599o04.a, null));
            }
        }
    }
}
