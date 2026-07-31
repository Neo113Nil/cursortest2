package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.vf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5750vf implements InterfaceC5681so {
    public final boolean a;

    public C5750vf(@NotNull C5802xf c5802xf) {
        boolean z;
        List<C5776wf> list = c5802xf.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C5776wf) it.next()).c == EnumC5483l8.d) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        this.a = z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5681so, kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C5776wf> invoke(@NotNull List<? extends C5776wf> list, @NotNull Kf kf) {
        C5776wf c5776wf = new C5776wf(kf.a, kf.b, kf.e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C5776wf) it.next()).c == kf.e) {
                    if (c5776wf.c == EnumC5483l8.d && this.a) {
                        return CollectionsKt.plus(list, c5776wf);
                    }
                    return null;
                }
            }
        }
        return CollectionsKt.plus(list, c5776wf);
    }
}
