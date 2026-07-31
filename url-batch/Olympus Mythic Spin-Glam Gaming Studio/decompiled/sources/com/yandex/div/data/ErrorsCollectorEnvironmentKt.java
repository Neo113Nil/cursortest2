package com.yandex.div.data;

import com.yandex.div.json.ParsingEnvironment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: ErrorsCollectorEnvironment.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001*\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0004H\u0000¨\u0006\u0007"}, d2 = {"collectErrors", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/yandex/div/json/ParsingEnvironment;", "withErrorsCollector", "Lcom/yandex/div/data/ErrorsCollectorEnvironment;", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ErrorsCollectorEnvironmentKt {
    @NotNull
    public static final ErrorsCollectorEnvironment withErrorsCollector(@NotNull ParsingEnvironment parsingEnvironment) {
        return new ErrorsCollectorEnvironment(parsingEnvironment);
    }

    @NotNull
    public static final List<Exception> collectErrors(@NotNull ParsingEnvironment parsingEnvironment) {
        if (parsingEnvironment instanceof ErrorsCollectorEnvironment) {
            return ((ErrorsCollectorEnvironment) parsingEnvironment).collectErrors();
        }
        return CollectionsKt.emptyList();
    }
}
