package yads;

import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes15.dex */
public abstract class az2 {
    public static Set a() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static xy2 a(Set set, ig2 ig2Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof xy2) {
                xy2 xy2Var = (xy2) sortedSet;
                ig2 ig2Var2 = xy2Var.c;
                ig2Var2.getClass();
                ig2Var.getClass();
                return new yy2((SortedSet) xy2Var.b, new jg2(Arrays.asList(ig2Var2, ig2Var)));
            }
            sortedSet.getClass();
            ig2Var.getClass();
            return new yy2(sortedSet, ig2Var);
        }
        if (set instanceof xy2) {
            xy2 xy2Var2 = (xy2) set;
            ig2 ig2Var3 = xy2Var2.c;
            ig2Var3.getClass();
            ig2Var.getClass();
            return new xy2(xy2Var2.b, new jg2(Arrays.asList(ig2Var3, ig2Var)));
        }
        set.getClass();
        ig2Var.getClass();
        return new xy2(set, ig2Var);
    }

    public static int a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
