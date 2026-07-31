package com.ogury.ad.internal;

import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class m8 {
    public static final b a(List list, String nextAdId) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(nextAdId, "nextAdId");
        if (list.isEmpty()) {
            return null;
        }
        if (nextAdId.length() == 0 || Intrinsics.areEqual(nextAdId, POBCommonConstants.NULL_VALUE)) {
            return (b) list.remove(0);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (Intrinsics.areEqual(bVar.b, nextAdId)) {
                it.remove();
                return bVar;
            }
        }
        return null;
    }
}
