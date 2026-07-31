package io.intercom.android.sdk.tickets;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketDetailState.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0005H×\u0001J\t\u0010\u0019\u001a\u00020\u001aH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/tickets/ConversationButtonState;", "", "showButton", "", "iconRes", "", "text", "Lio/intercom/android/sdk/ui/common/StringProvider;", "<init>", "(ZLjava/lang/Integer;Lio/intercom/android/sdk/ui/common/StringProvider;)V", "getShowButton", "()Z", "getIconRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getText", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "component1", "component2", "component3", "copy", "(ZLjava/lang/Integer;Lio/intercom/android/sdk/ui/common/StringProvider;)Lio/intercom/android/sdk/tickets/ConversationButtonState;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ConversationButtonState {
    public static final int $stable = StringProvider.$stable;
    private final Integer iconRes;
    private final boolean showButton;
    private final StringProvider text;

    public static /* synthetic */ ConversationButtonState copy$default(ConversationButtonState conversationButtonState, boolean z, Integer num, StringProvider stringProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            z = conversationButtonState.showButton;
        }
        if ((i & 2) != 0) {
            num = conversationButtonState.iconRes;
        }
        if ((i & 4) != 0) {
            stringProvider = conversationButtonState.text;
        }
        return conversationButtonState.copy(z, num, stringProvider);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowButton() {
        return this.showButton;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getIconRes() {
        return this.iconRes;
    }

    /* renamed from: component3, reason: from getter */
    public final StringProvider getText() {
        return this.text;
    }

    public final ConversationButtonState copy(boolean showButton, Integer iconRes, StringProvider text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new ConversationButtonState(showButton, iconRes, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationButtonState)) {
            return false;
        }
        ConversationButtonState conversationButtonState = (ConversationButtonState) other;
        return this.showButton == conversationButtonState.showButton && Intrinsics.areEqual(this.iconRes, conversationButtonState.iconRes) && Intrinsics.areEqual(this.text, conversationButtonState.text);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.showButton) * 31;
        Integer num = this.iconRes;
        return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "ConversationButtonState(showButton=" + this.showButton + ", iconRes=" + this.iconRes + ", text=" + this.text + ')';
    }

    public ConversationButtonState(boolean z, Integer num, StringProvider text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.showButton = z;
        this.iconRes = num;
        this.text = text;
    }

    public final boolean getShowButton() {
        return this.showButton;
    }

    public final Integer getIconRes() {
        return this.iconRes;
    }

    public final StringProvider getText() {
        return this.text;
    }
}
