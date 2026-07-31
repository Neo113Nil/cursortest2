package io.appmetrica.analytics.impl;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class Mf implements Zm {
    @NotNull
    public final C5802xf a(@NotNull Kf kf, @NotNull List<? extends C5776wf> list) {
        return new C5802xf(kf, list);
    }

    @Override // io.appmetrica.analytics.impl.Zm, kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C5802xf((Kf) obj, (List) obj2);
    }
}
