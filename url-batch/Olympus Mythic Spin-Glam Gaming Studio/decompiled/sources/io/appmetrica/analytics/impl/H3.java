package io.appmetrica.analytics.impl;

import androidx.annotation.MainThread;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class H3 implements P5 {
    @Override // io.appmetrica.analytics.impl.P5, kotlin.jvm.functions.Function1
    @MainThread
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(@NotNull Map<String, String> map) {
        return Boolean.valueOf(Ka.I.f().b(new I3(map, EnumC5483l8.f)));
    }
}
