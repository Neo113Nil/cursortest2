package com.moloco.sdk.internal.ortb;

import com.moloco.sdk.internal.ortb.model.C;
import com.moloco.sdk.internal.ortb.model.C5023e;
import com.moloco.sdk.internal.ortb.model.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class e {

    @NotNull
    public static final Regex a = new Regex("\\$\\{AUCTION_PRICE\\}");

    @NotNull
    public static final g a(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        List<C> b = gVar.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b, 10));
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            List<C5023e> b2 = ((C) it.next()).b();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(b2, 10));
            for (C5023e c5023e : b2) {
                float price = c5023e.getPrice();
                String crid = c5023e.getCrid();
                String a2 = a(c5023e.getAdm(), Float.valueOf(price));
                String str = c5023e.getCom.ironsource.q2.y java.lang.String();
                arrayList2.add(new C5023e(a2, price, str != null ? a(str, Float.valueOf(price)) : null, c5023e.getExt(), crid, c5023e.getBundle()));
            }
            arrayList.add(new C(arrayList2));
        }
        return new g(arrayList);
    }

    @NotNull
    public static final String a(@NotNull String str, @Nullable Float f) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Regex regex = a;
        if (f == null || (str2 = f.toString()) == null) {
            str2 = "";
        }
        return regex.replace(str, str2);
    }
}
