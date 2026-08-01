package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class mq0 extends ud0 {
    public static LinkedHashSet t(Set set, y70 y70Var) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(x40.J(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(y70Var);
        return linkedHashSet;
    }
}
