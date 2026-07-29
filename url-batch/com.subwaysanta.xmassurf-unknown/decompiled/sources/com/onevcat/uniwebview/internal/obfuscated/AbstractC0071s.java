package com.onevcat.uniwebview.internal.obfuscated;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0071s {
    public static final String a(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        List plus = CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new CharRange('A', 'Z'), (Iterable) new CharRange('a', 'z')), (Iterable) new CharRange('0', '9'));
        IntRange intRange = new IntRange(1, 8);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            Character ch = (Character) CollectionsKt.random(plus, Random.INSTANCE);
            ch.getClass();
            arrayList.add(ch);
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
