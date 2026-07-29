package o;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class WQ extends AbstractC0773bP {
    public static LinkedHashSet n(Set set, Iterable iterable) {
        AbstractC0048Bt.n(set, "<this>");
        AbstractC0048Bt.n(iterable, "elements");
        Integer valueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(EB.E(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        AbstractC1048fc.f0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet o(Set set, Object obj) {
        AbstractC0048Bt.n(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(EB.E(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
