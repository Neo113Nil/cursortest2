package com.yandex.div.storage.util;

import com.sglib.easymobile.androidnative.notification.NotificationCategory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: CardErrorTransformer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/util/CardErrorTransformer;", "", "tryTransformAndLog", "", "cardError", "Lcom/yandex/div/storage/util/CardErrorTransformer$CardDetailedErrorException;", "CardDetailedErrorException", "Composite", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CardErrorTransformer {
    boolean tryTransformAndLog(@NotNull CardDetailedErrorException cardError);

    /* compiled from: CardErrorTransformer.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002BW\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/storage/util/CardErrorTransformer$CardDetailedErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cardId", "", "message", "cause", "", "templateId", "details", "", NotificationCategory.GROUP_ID_KEY, "metadata", "Lorg/json/JSONObject;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lorg/json/JSONObject;)V", "getCardId", "()Ljava/lang/String;", "getDetails", "()Ljava/util/Map;", "getGroupId$div_storage_release", "getMetadata", "()Lorg/json/JSONObject;", "getTemplateId", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CardDetailedErrorException extends Exception {

        @NotNull
        private final String cardId;

        @NotNull
        private final Map<String, String> details;

        @NotNull
        private final String groupId;

        @Nullable
        private final JSONObject metadata;

        @Nullable
        private final String templateId;

        @NotNull
        public final String getCardId() {
            return this.cardId;
        }

        @Nullable
        public final String getTemplateId() {
            return this.templateId;
        }

        public /* synthetic */ CardDetailedErrorException(String str, String str2, Throwable th, String str3, Map map, String str4, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? MapsKt.emptyMap() : map, str4, jSONObject);
        }

        @NotNull
        public final Map<String, String> getDetails() {
            return this.details;
        }

        @NotNull
        /* renamed from: getGroupId$div_storage_release, reason: from getter */
        public final String getGroupId() {
            return this.groupId;
        }

        @Nullable
        public final JSONObject getMetadata() {
            return this.metadata;
        }

        public CardDetailedErrorException(@NotNull String str, @Nullable String str2, @Nullable Throwable th, @Nullable String str3, @NotNull Map<String, String> map, @NotNull String str4, @Nullable JSONObject jSONObject) {
            super(str2, th);
            this.cardId = str;
            this.templateId = str3;
            this.details = map;
            this.groupId = str4;
            this.metadata = jSONObject;
        }
    }

    /* compiled from: CardErrorTransformer.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003\"\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0018\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/yandex/div/storage/util/CardErrorTransformer$Composite;", "Lcom/yandex/div/storage/util/CardErrorTransformer;", "transformers", "", "([Lcom/yandex/div/storage/util/CardErrorTransformer;)V", "[Lcom/yandex/div/storage/util/CardErrorTransformer;", "tryTransformAndLog", "", "cardError", "Lcom/yandex/div/storage/util/CardErrorTransformer$CardDetailedErrorException;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Composite implements CardErrorTransformer {

        @NotNull
        private final CardErrorTransformer[] transformers;

        public Composite(@NotNull CardErrorTransformer... cardErrorTransformerArr) {
            this.transformers = cardErrorTransformerArr;
        }

        @Override // com.yandex.div.storage.util.CardErrorTransformer
        public boolean tryTransformAndLog(@NotNull CardDetailedErrorException cardError) {
            for (CardErrorTransformer cardErrorTransformer : this.transformers) {
                if (cardErrorTransformer.tryTransformAndLog(cardError)) {
                    return true;
                }
            }
            return false;
        }
    }
}
