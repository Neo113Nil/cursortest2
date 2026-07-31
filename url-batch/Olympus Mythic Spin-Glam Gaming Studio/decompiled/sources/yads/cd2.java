package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* loaded from: classes4.dex */
public final class cd2 {
    public final i5 a;

    public cd2(i5 i5Var) {
        this.a = i5Var;
    }

    public final LinkedHashMap a(Set set) {
        List list;
        i5 i5Var = this.a;
        synchronized (i5Var.a) {
            list = CollectionsKt.toList(i5Var.d);
        }
        Sequence<g5> filter = SequencesKt.filter(CollectionsKt.asSequence(list), new bd2(set));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (g5 g5Var : filter) {
            String str = g5Var.a.b;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(g5Var.b);
        }
        return linkedHashMap;
    }
}
