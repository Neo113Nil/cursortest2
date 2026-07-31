package yads;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes12.dex */
public final class b80 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(((g50) obj).a, ((g50) obj2).a);
    }
}
