package com.yandex.div.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: ParsingContext.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\f\u0010\t\u001a\u00020\u0004*\u00020\u0004H\u0000\u001a\f\u0010\n\u001a\u00020\u0004*\u00020\u0004H\u0000\"(\u0010\u0000\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"collectedErrors", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/yandex/div/serialization/ParsingContext;", "getCollectedErrors$annotations", "(Lcom/yandex/div/serialization/ParsingContext;)V", "getCollectedErrors", "(Lcom/yandex/div/serialization/ParsingContext;)Ljava/util/List;", "collectingErrors", "restrictPropertyOverride", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ParsingContextKt {
    public static /* synthetic */ void getCollectedErrors$annotations(ParsingContext parsingContext) {
    }

    @NotNull
    public static final ParsingContext collectingErrors(@NotNull ParsingContext parsingContext) {
        return parsingContext instanceof ErrorCollectingParsingContext ? parsingContext : new ErrorCollectingParsingContext(parsingContext);
    }

    @NotNull
    public static final List<Exception> getCollectedErrors(@NotNull ParsingContext parsingContext) {
        return parsingContext instanceof ErrorCollectingParsingContext ? ((ErrorCollectingParsingContext) parsingContext).getErrors() : parsingContext instanceof ParsingContextWrapper ? getCollectedErrors(((ParsingContextWrapper) parsingContext).getBaseContext()) : CollectionsKt.emptyList();
    }

    @NotNull
    public static final ParsingContext restrictPropertyOverride(@NotNull ParsingContext parsingContext) {
        return parsingContext instanceof OverrideRestrictingParsingContext ? parsingContext : new OverrideRestrictingParsingContext(parsingContext);
    }
}
