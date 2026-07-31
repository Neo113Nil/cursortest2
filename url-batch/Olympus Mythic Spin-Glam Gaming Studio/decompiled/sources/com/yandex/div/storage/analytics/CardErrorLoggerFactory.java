package com.yandex.div.storage.analytics;

import com.sglib.easymobile.androidnative.notification.NotificationCategory;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.CardErrorTransformer;
import com.yandex.div.storage.util.LazyProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: CardErrorLoggerFactory.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B'\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ*\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/storage/analytics/CardErrorLoggerFactory;", "", "externalErrorTransformer", "Ljavax/inject/Provider;", "Lcom/yandex/div/storage/util/CardErrorTransformer;", "templateContainer", "Lcom/yandex/div/storage/templates/TemplatesContainer;", "parsingErrorLogger", "Lcom/yandex/div/json/ParsingErrorLogger;", "(Ljavax/inject/Provider;Lcom/yandex/div/storage/templates/TemplatesContainer;Lcom/yandex/div/json/ParsingErrorLogger;)V", "errorTransformer", "createContextualLogger", "origin", "cardId", "", NotificationCategory.GROUP_ID_KEY, "metadata", "Lorg/json/JSONObject;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public class CardErrorLoggerFactory {

    @NotNull
    private final Provider errorTransformer;

    @NotNull
    private final ParsingErrorLogger parsingErrorLogger;

    @NotNull
    private final TemplatesContainer templateContainer;

    public CardErrorLoggerFactory(@Nullable final Provider provider, @NotNull TemplatesContainer templatesContainer, @NotNull ParsingErrorLogger parsingErrorLogger) {
        this.templateContainer = templatesContainer;
        this.parsingErrorLogger = parsingErrorLogger;
        this.errorTransformer = new LazyProvider(new Function0() { // from class: com.yandex.div.storage.analytics.CardErrorLoggerFactory$errorTransformer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final CardErrorTransformer mo4828invoke() {
                TemplatesContainer templatesContainer2;
                ParsingErrorLogger parsingErrorLogger2;
                TemplatesContainer templatesContainer3;
                ParsingErrorLogger parsingErrorLogger3;
                Provider provider2 = Provider.this;
                if (provider2 == null) {
                    templatesContainer3 = this.templateContainer;
                    parsingErrorLogger3 = this.parsingErrorLogger;
                    return new TemplateCardErrorTransformer(templatesContainer3, parsingErrorLogger3);
                }
                templatesContainer2 = this.templateContainer;
                parsingErrorLogger2 = this.parsingErrorLogger;
                return new CardErrorTransformer.Composite(provider2.get(), new TemplateCardErrorTransformer(templatesContainer2, parsingErrorLogger2));
            }
        });
    }

    @NotNull
    public ParsingErrorLogger createContextualLogger(@NotNull final ParsingErrorLogger origin, @NotNull final String cardId, @NotNull final String groupId, @Nullable final JSONObject metadata) {
        return new ParsingErrorLogger() { // from class: com.yandex.div.storage.analytics.CardErrorLoggerFactory$createContextualLogger$1
            @Override // com.yandex.div.json.ParsingErrorLogger
            public void logError(@NotNull Exception e) {
                Provider provider;
                CardErrorTransformer.CardDetailedErrorException cardDetailedErrorException = new CardErrorTransformer.CardDetailedErrorException(cardId, e.getMessage(), e, null, null, groupId, metadata, 24, null);
                provider = this.errorTransformer;
                if (((CardErrorTransformer) provider.get()).tryTransformAndLog(cardDetailedErrorException)) {
                    return;
                }
                origin.logError(cardDetailedErrorException);
            }

            @Override // com.yandex.div.json.ParsingErrorLogger
            public void logTemplateError(@NotNull Exception e, @NotNull String templateId) {
                Provider provider;
                CardErrorTransformer.CardDetailedErrorException cardDetailedErrorException = new CardErrorTransformer.CardDetailedErrorException(cardId, e.getMessage(), e, templateId, null, groupId, metadata, 16, null);
                provider = this.errorTransformer;
                if (((CardErrorTransformer) provider.get()).tryTransformAndLog(cardDetailedErrorException)) {
                    return;
                }
                origin.logTemplateError(cardDetailedErrorException, templateId);
            }
        };
    }
}
