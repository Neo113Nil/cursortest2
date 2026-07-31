package com.yandex.div.json;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ParsingEnvironmentExtensions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"withLogger", "Lcom/yandex/div/json/ParsingEnvironmentWrapper;", "Lcom/yandex/div/json/ParsingEnvironment;", "logger", "Lcom/yandex/div/json/ParsingErrorLogger;", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ParsingEnvironmentExtensionsKt {
    @NotNull
    public static final ParsingEnvironmentWrapper withLogger(@NotNull ParsingEnvironment parsingEnvironment, @NotNull ParsingErrorLogger parsingErrorLogger) {
        return new ParsingEnvironmentWrapper(parsingEnvironment, parsingErrorLogger);
    }
}
