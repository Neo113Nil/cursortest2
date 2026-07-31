package com.ogury.ad.internal;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w {
    public static String a(String str) {
        Object obj;
        Iterator<E> it = x.i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((x) obj).a, str)) {
                break;
            }
        }
        x xVar = (x) obj;
        return xVar != null ? xVar.b : str;
    }
}
