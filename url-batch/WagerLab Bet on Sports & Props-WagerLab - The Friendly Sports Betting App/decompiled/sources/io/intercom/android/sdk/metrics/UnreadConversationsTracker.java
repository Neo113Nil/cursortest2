package io.intercom.android.sdk.metrics;

import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.DeliveryOption;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnreadConversationsTracker.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u0006\u0010\u0015\u001a\u00020\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/metrics/UnreadConversationsTracker;", "", "trackerProvider", "Lio/intercom/android/sdk/Provider;", "Lio/intercom/android/sdk/metrics/MetricTracker;", "<init>", "(Lio/intercom/android/sdk/Provider;)V", "trackedPartIds", "", "", "tracker", "getTracker", "()Lio/intercom/android/sdk/metrics/MetricTracker;", "track", "", "response", "Lio/intercom/android/sdk/models/UsersResponse;", "trackReceivedPart", "part", "Lio/intercom/android/sdk/models/Part;", "conversationId", "clear", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnreadConversationsTracker {
    public static final int $stable = 8;
    private final Set<String> trackedPartIds;
    private final Provider<MetricTracker> trackerProvider;

    public UnreadConversationsTracker(Provider<MetricTracker> trackerProvider) {
        Intrinsics.checkNotNullParameter(trackerProvider, "trackerProvider");
        this.trackerProvider = trackerProvider;
        this.trackedPartIds = new LinkedHashSet();
    }

    private final MetricTracker getTracker() {
        MetricTracker metricTracker = this.trackerProvider.get();
        Intrinsics.checkNotNullExpressionValue(metricTracker, "get(...)");
        return metricTracker;
    }

    public final void track(UsersResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        List<Conversation> conversations = response.getUnreadConversations().getConversations();
        Intrinsics.checkNotNull(conversations);
        for (Conversation conversation : conversations) {
            Part lastPart = conversation.lastPart();
            if (!this.trackedPartIds.contains(lastPart.getId())) {
                Set<String> set = this.trackedPartIds;
                String id = lastPart.getId();
                Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
                set.add(id);
                trackReceivedPart(lastPart, conversation.getId());
            }
        }
    }

    private final void trackReceivedPart(Part part, String conversationId) {
        boolean hasAttachments = part.hasAttachments();
        boolean isLinkCard = PartExtensionsKt.isLinkCard(part);
        String id = part.getId();
        MessageStyle messageStyle = part.getMessageStyle();
        if (DeliveryOption.SUMMARY != part.getDeliveryOption()) {
            getTracker().receivedMessageFromFullWhenClosed(hasAttachments, isLinkCard, conversationId, id, messageStyle);
        } else if (part.isInitialMessage()) {
            getTracker().receivedMessageFromSnippetWhenClosed(hasAttachments, isLinkCard, conversationId, id, messageStyle);
        } else {
            getTracker().receivedReplyFromSnippetWhenClosed(hasAttachments, isLinkCard, conversationId, id);
        }
    }

    public final void clear() {
        this.trackedPartIds.clear();
    }
}
