package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.nn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5550nn implements InterfaceC5785wo {
    public final ArrayList a;

    public C5550nn(@NotNull String str, @NotNull List<String> list, int i, @NotNull Cdo cdo, @NotNull Ko ko, @NotNull W2 w2) {
        List take = CollectionsKt.take(CollectionsKt.toList(CollectionsKt.toSet(list)), i);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(take, 10));
        int i2 = 0;
        for (Object obj : take) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new C5602pn(str + '_' + i2, (String) obj, cdo, ko, w2));
            i2 = i3;
        }
        this.a = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5785wo
    public final void a(@NotNull C5759vo c5759vo) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((C5602pn) it.next()).a(c5759vo);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5785wo
    public final void a(@NotNull PublicLogger publicLogger) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((C5602pn) it.next()).e = publicLogger;
        }
    }
}
