package com.ironsource;

import com.ironsource.C4849r0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class L {
    private final int a;

    @NotNull
    private final List<J> b = new CopyOnWriteArrayList();

    public L(int i) {
        this.a = i;
    }

    private final boolean b() {
        return this.a == 0;
    }

    private final boolean c() {
        return this.a != -1;
    }

    public final void a(@Nullable J j) {
        if (b()) {
            return;
        }
        if (a()) {
            CollectionsKt.removeFirstOrNull(this.b);
        }
        if (j == null) {
            j = new J(C4849r0.a.NotPartOfWaterfall);
        }
        this.b.add(j);
    }

    @NotNull
    public final String d() {
        List<J> list = this.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((J) it.next()).b().ordinal()));
        }
        return CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }

    private final boolean a() {
        return c() && this.b.size() >= this.a;
    }
}
