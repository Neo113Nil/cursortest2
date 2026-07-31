package io.intercom.android.sdk.m5.push;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.intercom.twig.Twig;
import expo.modules.notifications.service.NotificationsService;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.ui.common.ActualStringOrResKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* compiled from: IntercomPushData.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010(\u001a\u00020\u0003J\u000e\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020-J\b\u0010!\u001a\u0004\u0018\u00010.J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u0095\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010>\u001a\u00020-2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010$\u001a\n &*\u0004\u0018\u00010%0%X\u0082\u0004¢\u0006\u0004\n\u0002\u0010'¨\u0006C"}, d2 = {"Lio/intercom/android/sdk/m5/push/SimplePushData;", "", "intercomPushType", "", "conversationId", "title", "message", "body", NotificationsService.RECEIVER_KEY, "authorName", "appName", "contentImageUrl", "imageUrl", "uri", "instanceId", "conversationPartType", "messageData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIntercomPushType", "()Ljava/lang/String;", "getConversationId", "getTitle", "getMessage", "getBody", "getReceiver", "getAuthorName", "getAppName", "getContentImageUrl", "getImageUrl", "getUri", "getInstanceId", "getConversationPartType", "getMessageData", "json", "Lkotlinx/serialization/json/Json;", "twig", "Lcom/intercom/twig/Twig;", "kotlin.jvm.PlatformType", "Lcom/intercom/twig/Twig;", "getContentText", "getContentTitle", "context", "Landroid/content/Context;", "isIntercomPush", "", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class SimplePushData {
    private final String appName;
    private final String authorName;
    private final String body;
    private final String contentImageUrl;
    private final String conversationId;
    private final String conversationPartType;
    private final String imageUrl;
    private final String instanceId;
    private final String intercomPushType;
    private final Json json;
    private final String message;
    private final String messageData;
    private final String receiver;
    private final String title;
    private final Twig twig;
    private final String uri;

    /* renamed from: component1, reason: from getter */
    public final String getIntercomPushType() {
        return this.intercomPushType;
    }

    /* renamed from: component10, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: component12, reason: from getter */
    public final String getInstanceId() {
        return this.instanceId;
    }

    /* renamed from: component13, reason: from getter */
    public final String getConversationPartType() {
        return this.conversationPartType;
    }

    /* renamed from: component14, reason: from getter */
    public final String getMessageData() {
        return this.messageData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: component6, reason: from getter */
    public final String getReceiver() {
        return this.receiver;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: component9, reason: from getter */
    public final String getContentImageUrl() {
        return this.contentImageUrl;
    }

    public final SimplePushData copy(String intercomPushType, String conversationId, String title, String message, String body, String receiver, String authorName, String appName, String contentImageUrl, String imageUrl, String uri, String instanceId, String conversationPartType, String messageData) {
        Intrinsics.checkNotNullParameter(intercomPushType, "intercomPushType");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(authorName, "authorName");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(contentImageUrl, "contentImageUrl");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(conversationPartType, "conversationPartType");
        Intrinsics.checkNotNullParameter(messageData, "messageData");
        return new SimplePushData(intercomPushType, conversationId, title, message, body, receiver, authorName, appName, contentImageUrl, imageUrl, uri, instanceId, conversationPartType, messageData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimplePushData)) {
            return false;
        }
        SimplePushData simplePushData = (SimplePushData) other;
        return Intrinsics.areEqual(this.intercomPushType, simplePushData.intercomPushType) && Intrinsics.areEqual(this.conversationId, simplePushData.conversationId) && Intrinsics.areEqual(this.title, simplePushData.title) && Intrinsics.areEqual(this.message, simplePushData.message) && Intrinsics.areEqual(this.body, simplePushData.body) && Intrinsics.areEqual(this.receiver, simplePushData.receiver) && Intrinsics.areEqual(this.authorName, simplePushData.authorName) && Intrinsics.areEqual(this.appName, simplePushData.appName) && Intrinsics.areEqual(this.contentImageUrl, simplePushData.contentImageUrl) && Intrinsics.areEqual(this.imageUrl, simplePushData.imageUrl) && Intrinsics.areEqual(this.uri, simplePushData.uri) && Intrinsics.areEqual(this.instanceId, simplePushData.instanceId) && Intrinsics.areEqual(this.conversationPartType, simplePushData.conversationPartType) && Intrinsics.areEqual(this.messageData, simplePushData.messageData);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.intercomPushType.hashCode() * 31) + this.conversationId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + this.body.hashCode()) * 31) + this.receiver.hashCode()) * 31) + this.authorName.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.contentImageUrl.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.instanceId.hashCode()) * 31) + this.conversationPartType.hashCode()) * 31) + this.messageData.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SimplePushData(intercomPushType=");
        sb.append(this.intercomPushType).append(", conversationId=").append(this.conversationId).append(", title=").append(this.title).append(", message=").append(this.message).append(", body=").append(this.body).append(", receiver=").append(this.receiver).append(", authorName=").append(this.authorName).append(", appName=").append(this.appName).append(", contentImageUrl=").append(this.contentImageUrl).append(", imageUrl=").append(this.imageUrl).append(", uri=").append(this.uri).append(", instanceId=");
        sb.append(this.instanceId).append(", conversationPartType=").append(this.conversationPartType).append(", messageData=").append(this.messageData).append(')');
        return sb.toString();
    }

    public SimplePushData(String intercomPushType, String conversationId, String title, String message, String body, String receiver, String authorName, String appName, String contentImageUrl, String imageUrl, String uri, String instanceId, String conversationPartType, String messageData) {
        Intrinsics.checkNotNullParameter(intercomPushType, "intercomPushType");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(authorName, "authorName");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(contentImageUrl, "contentImageUrl");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(conversationPartType, "conversationPartType");
        Intrinsics.checkNotNullParameter(messageData, "messageData");
        this.intercomPushType = intercomPushType;
        this.conversationId = conversationId;
        this.title = title;
        this.message = message;
        this.body = body;
        this.receiver = receiver;
        this.authorName = authorName;
        this.appName = appName;
        this.contentImageUrl = contentImageUrl;
        this.imageUrl = imageUrl;
        this.uri = uri;
        this.instanceId = instanceId;
        this.conversationPartType = conversationPartType;
        this.messageData = messageData;
        this.json = JsonKt.Json$default(null, new Function1() { // from class: io.intercom.android.sdk.m5.push.SimplePushData$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit json$lambda$0;
                json$lambda$0 = SimplePushData.json$lambda$0((JsonBuilder) obj);
                return json$lambda$0;
            }
        }, 1, null);
        this.twig = LumberMill.getLogger();
    }

    public final String getIntercomPushType() {
        return this.intercomPushType;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getReceiver() {
        return this.receiver;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getContentImageUrl() {
        return this.contentImageUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final String getConversationPartType() {
        return this.conversationPartType;
    }

    /* renamed from: getMessageData, reason: collision with other method in class */
    public final String m11660getMessageData() {
        return this.messageData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    public final String getContentText() {
        String str = this.message;
        if (StringsKt.isBlank(str)) {
            str = this.body;
        }
        return str;
    }

    public final String getContentTitle(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!StringsKt.isBlank(this.title)) {
            return this.title;
        }
        if (StringsKt.isBlank(this.authorName) || StringsKt.isBlank(this.appName)) {
            return !StringsKt.isBlank(this.authorName) ? this.authorName : this.appName;
        }
        return ActualStringOrResKt.parseString(context, R.string.intercom_teammate_from_company, CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("name", this.authorName), TuplesKt.to("company", this.appName)}));
    }

    public final boolean isIntercomPush() {
        return !StringsKt.isBlank(this.intercomPushType) && Intrinsics.areEqual(Intercom.PUSH_RECEIVER, this.receiver);
    }

    public final IntercomPushData.ConversationPushData.MessageData getMessageData() {
        if (!StringsKt.isBlank(this.body)) {
            return new IntercomPushData.ConversationPushData.MessageData.Text(this.body);
        }
        if (StringsKt.isBlank(this.messageData)) {
            return null;
        }
        try {
            Json json = this.json;
            String str = this.messageData;
            json.getSerializersModule();
            return (IntercomPushData.ConversationPushData.MessageData) json.decodeFromString(BuiltinSerializersKt.getNullable(IntercomPushData.ConversationPushData.MessageData.INSTANCE.serializer()), str);
        } catch (IllegalArgumentException e) {
            this.twig.e(e);
            return null;
        }
    }
}
