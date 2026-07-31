package io.intercom.android.sdk.helpcenter.articles;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: Article.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\tH×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/Article;", "", "relatedConversationId", "", "card", "Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRelatedConversationId$annotations", "()V", "getRelatedConversationId", "()Ljava/lang/String;", "getCard$annotations", "getCard", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleCard;", "component1", "component2", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$intercom_sdk_base_release", "$serializer", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes8.dex */
public final /* data */ class Article {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ArticleCard card;
    private final String relatedConversationId;

    public static /* synthetic */ Article copy$default(Article article, String str, ArticleCard articleCard, int i, Object obj) {
        if ((i & 1) != 0) {
            str = article.relatedConversationId;
        }
        if ((i & 2) != 0) {
            articleCard = article.card;
        }
        return article.copy(str, articleCard);
    }

    @SerialName("card")
    public static /* synthetic */ void getCard$annotations() {
    }

    @SerialName("related_conversation_id")
    public static /* synthetic */ void getRelatedConversationId$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getRelatedConversationId() {
        return this.relatedConversationId;
    }

    /* renamed from: component2, reason: from getter */
    public final ArticleCard getCard() {
        return this.card;
    }

    public final Article copy(String relatedConversationId, ArticleCard card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return new Article(relatedConversationId, card);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Article)) {
            return false;
        }
        Article article = (Article) other;
        return Intrinsics.areEqual(this.relatedConversationId, article.relatedConversationId) && Intrinsics.areEqual(this.card, article.card);
    }

    public int hashCode() {
        String str = this.relatedConversationId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.card.hashCode();
    }

    public String toString() {
        return "Article(relatedConversationId=" + this.relatedConversationId + ", card=" + this.card + ')';
    }

    /* compiled from: Article.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/Article$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/articles/Article;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Article> serializer() {
            return Article$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Article(int i, String str, ArticleCard articleCard, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, Article$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.relatedConversationId = null;
        } else {
            this.relatedConversationId = str;
        }
        this.card = articleCard;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Article self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.relatedConversationId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.relatedConversationId);
        }
        output.encodeSerializableElement(serialDesc, 1, ArticleCard$$serializer.INSTANCE, self.card);
    }

    public Article(String str, ArticleCard card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.relatedConversationId = str;
        this.card = card;
    }

    public /* synthetic */ Article(String str, ArticleCard articleCard, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, articleCard);
    }

    public final String getRelatedConversationId() {
        return this.relatedConversationId;
    }

    public final ArticleCard getCard() {
        return this.card;
    }
}
