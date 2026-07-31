package com.yandex.div.core.dagger;

import com.yandex.yatagan.Optional;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExternalOptional.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\u0005"}, d2 = {"asExternal", "Lcom/yandex/div/core/dagger/ExternalOptional;", "T", "", "Lcom/yandex/yatagan/Optional;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ExternalOptionalKt {
    @NotNull
    public static final <T> ExternalOptional<T> asExternal(@NotNull Optional optional) {
        return new ExternalOptional<>(optional);
    }
}
