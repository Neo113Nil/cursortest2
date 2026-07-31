package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Iterators.kt */
/* loaded from: classes10.dex */
public abstract class CollectionsKt__IteratorsKt extends CollectionsKt__IteratorsJVMKt {
    public static Iterator withIndex(Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return new IndexingIterator(it);
    }
}
