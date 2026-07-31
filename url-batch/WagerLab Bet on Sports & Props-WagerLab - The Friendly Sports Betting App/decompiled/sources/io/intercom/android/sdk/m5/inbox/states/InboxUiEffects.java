package io.intercom.android.sdk.m5.inbox.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.models.Conversation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InboxUiEffects.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects;", "", "<init>", "()V", "NavigateToConversation", "RefreshInbox", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects$NavigateToConversation;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects$RefreshInbox;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class InboxUiEffects {
    public static final int $stable = 0;

    public /* synthetic */ InboxUiEffects(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InboxUiEffects() {
    }

    /* compiled from: InboxUiEffects.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects$NavigateToConversation;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects;", "conversation", "Lio/intercom/android/sdk/models/Conversation;", "<init>", "(Lio/intercom/android/sdk/models/Conversation;)V", "getConversation", "()Lio/intercom/android/sdk/models/Conversation;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateToConversation extends InboxUiEffects {
        public static final int $stable = 8;
        private final Conversation conversation;

        public static /* synthetic */ NavigateToConversation copy$default(NavigateToConversation navigateToConversation, Conversation conversation, int i, Object obj) {
            if ((i & 1) != 0) {
                conversation = navigateToConversation.conversation;
            }
            return navigateToConversation.copy(conversation);
        }

        /* renamed from: component1, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        public final NavigateToConversation copy(Conversation conversation) {
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            return new NavigateToConversation(conversation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToConversation) && Intrinsics.areEqual(this.conversation, ((NavigateToConversation) other).conversation);
        }

        public int hashCode() {
            return this.conversation.hashCode();
        }

        public String toString() {
            return "NavigateToConversation(conversation=" + this.conversation + ')';
        }

        public final Conversation getConversation() {
            return this.conversation;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToConversation(Conversation conversation) {
            super(null);
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            this.conversation = conversation;
        }
    }

    /* compiled from: InboxUiEffects.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects$RefreshInbox;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RefreshInbox extends InboxUiEffects {
        public static final int $stable = 0;
        public static final RefreshInbox INSTANCE = new RefreshInbox();

        private RefreshInbox() {
            super(null);
        }
    }
}
