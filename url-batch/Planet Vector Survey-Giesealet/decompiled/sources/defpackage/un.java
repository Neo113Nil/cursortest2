package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class un {
    public static final float a = 0.125f / 18.0f;

    public static final boolean a(qg0 qg0Var, long j) {
        Object obj;
        List list = qg0Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (vg0.a(((wg0) obj).a, j)) {
                break;
            }
            i++;
        }
        wg0 wg0Var = (wg0) obj;
        if (wg0Var != null && wg0Var.d) {
            z = true;
        }
        return true ^ z;
    }
}
