package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class j9 {
    public static final j9 c;
    public final Set a;
    public final oo b;

    static {
        Set set;
        ArrayList arrayList = new ArrayList();
        int size = arrayList.size();
        if (size != 0) {
            int i = 0;
            if (size != 1) {
                set = new LinkedHashSet(hr.g0(arrayList.size()));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    set.add(obj);
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                set.getClass();
            }
        } else {
            set = wh.f;
        }
        c = new j9(set, null);
    }

    public j9(Set set, oo ooVar) {
        this.a = set;
        this.b = ooVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j9)) {
            return false;
        }
        j9 j9Var = (j9) obj;
        return j9Var.a.equals(this.a) && oo.b(j9Var.b, this.b);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 1517) * 41;
        oo ooVar = this.b;
        return hashCode + (ooVar != null ? ooVar.hashCode() : 0);
    }
}
