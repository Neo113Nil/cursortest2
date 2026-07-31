package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IteratorsJVM.kt */
/* loaded from: classes3.dex */
public abstract class CollectionsKt__IteratorsJVMKt extends CollectionsKt__IterablesKt {
    public static Iterator iterator(Enumeration enumeration) {
        Intrinsics.checkNotNullParameter(enumeration, "<this>");
        return new CollectionsKt__IteratorsJVMKt$iterator$1(enumeration);
    }
}
