package io.appmetrica.analytics.impl;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class U3 implements Zm {
    @NotNull
    public final J3 a(@NotNull I3 i3, @NotNull List<I3> list) {
        return new J3(i3, list);
    }

    @Override // io.appmetrica.analytics.impl.Zm, kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new J3((I3) obj, (List) obj2);
    }
}
