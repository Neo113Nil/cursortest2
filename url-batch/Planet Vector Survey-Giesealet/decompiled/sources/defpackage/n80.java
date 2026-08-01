package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class n80 {
    public final p90 a;
    public final String b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final LinkedHashMap e = new LinkedHashMap();

    public n80(p90 p90Var, String str) {
        this.a = p90Var;
        this.b = str;
    }

    public m80 a() {
        m80 b = b();
        b.getClass();
        LinkedHashMap linkedHashMap = b.h;
        Iterator it = this.c.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                g8.q();
                return null;
            }
            str.getClass();
            throw null;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i80 i80Var = (i80) obj;
            i80Var.getClass();
            ArrayList K = mz.K(linkedHashMap, new l80(i80Var, 0));
            if (!K.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + i80Var.a + " can't be used to open destination " + b + ".\nFollowing required arguments are missing: " + K).toString());
            }
            b.f.add(i80Var);
        }
        Iterator it2 = this.e.entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            ((Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            g8.q();
            return null;
        }
        String str2 = this.b;
        if (str2 != null) {
            if (tt0.w(str2)) {
                g8.r("Cannot have an empty route");
                return null;
            }
            String concat = "android-app://androidx.navigation/".concat(str2);
            ArrayList K2 = mz.K(linkedHashMap, new l80(new i80(concat), 1));
            if (!K2.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + b + ". Following required arguments are missing: " + K2).toString());
            }
            b.k = new lu0(new b(10, concat));
            b.i = concat.hashCode();
            b.j = str2;
        }
        return b;
    }

    public m80 b() {
        return this.a.a();
    }
}
