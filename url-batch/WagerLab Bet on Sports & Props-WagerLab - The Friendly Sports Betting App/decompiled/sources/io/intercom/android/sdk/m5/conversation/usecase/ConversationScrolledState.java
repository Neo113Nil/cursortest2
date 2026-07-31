package io.intercom.android.sdk.m5.conversation.usecase;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: UpdateFloatingIndicatorUseCase.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0005H×\u0001J\t\u0010\u0019\u001a\u00020\u001aH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/ConversationScrolledState;", "", "scrolled", "", "scrollToPosition", "", "isLandscape", "isLargeFont", "lastSeenItemIndex", "<init>", "(ZIZZI)V", "getScrolled", "()Z", "getScrollToPosition", "()I", "getLastSeenItemIndex", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ConversationScrolledState {
    public static final int $stable = 0;
    private final boolean isLandscape;
    private final boolean isLargeFont;
    private final int lastSeenItemIndex;
    private final int scrollToPosition;
    private final boolean scrolled;

    public static /* synthetic */ ConversationScrolledState copy$default(ConversationScrolledState conversationScrolledState, boolean z, int i, boolean z2, boolean z3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = conversationScrolledState.scrolled;
        }
        if ((i3 & 2) != 0) {
            i = conversationScrolledState.scrollToPosition;
        }
        if ((i3 & 4) != 0) {
            z2 = conversationScrolledState.isLandscape;
        }
        if ((i3 & 8) != 0) {
            z3 = conversationScrolledState.isLargeFont;
        }
        if ((i3 & 16) != 0) {
            i2 = conversationScrolledState.lastSeenItemIndex;
        }
        int i4 = i2;
        boolean z4 = z2;
        return conversationScrolledState.copy(z, i, z4, z3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getScrolled() {
        return this.scrolled;
    }

    /* renamed from: component2, reason: from getter */
    public final int getScrollToPosition() {
        return this.scrollToPosition;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLandscape() {
        return this.isLandscape;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLargeFont() {
        return this.isLargeFont;
    }

    /* renamed from: component5, reason: from getter */
    public final int getLastSeenItemIndex() {
        return this.lastSeenItemIndex;
    }

    public final ConversationScrolledState copy(boolean scrolled, int scrollToPosition, boolean isLandscape, boolean isLargeFont, int lastSeenItemIndex) {
        return new ConversationScrolledState(scrolled, scrollToPosition, isLandscape, isLargeFont, lastSeenItemIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationScrolledState)) {
            return false;
        }
        ConversationScrolledState conversationScrolledState = (ConversationScrolledState) other;
        return this.scrolled == conversationScrolledState.scrolled && this.scrollToPosition == conversationScrolledState.scrollToPosition && this.isLandscape == conversationScrolledState.isLandscape && this.isLargeFont == conversationScrolledState.isLargeFont && this.lastSeenItemIndex == conversationScrolledState.lastSeenItemIndex;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.scrolled) * 31) + Integer.hashCode(this.scrollToPosition)) * 31) + Boolean.hashCode(this.isLandscape)) * 31) + Boolean.hashCode(this.isLargeFont)) * 31) + Integer.hashCode(this.lastSeenItemIndex);
    }

    public String toString() {
        return "ConversationScrolledState(scrolled=" + this.scrolled + ", scrollToPosition=" + this.scrollToPosition + ", isLandscape=" + this.isLandscape + ", isLargeFont=" + this.isLargeFont + ", lastSeenItemIndex=" + this.lastSeenItemIndex + ')';
    }

    public ConversationScrolledState(boolean z, int i, boolean z2, boolean z3, int i2) {
        this.scrolled = z;
        this.scrollToPosition = i;
        this.isLandscape = z2;
        this.isLargeFont = z3;
        this.lastSeenItemIndex = i2;
    }

    public /* synthetic */ ConversationScrolledState(boolean z, int i, boolean z2, boolean z3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, z2, z3, (i3 & 16) != 0 ? 0 : i2);
    }

    public final boolean getScrolled() {
        return this.scrolled;
    }

    public final int getScrollToPosition() {
        return this.scrollToPosition;
    }

    public final boolean isLandscape() {
        return this.isLandscape;
    }

    public final boolean isLargeFont() {
        return this.isLargeFont;
    }

    public final int getLastSeenItemIndex() {
        return this.lastSeenItemIndex;
    }
}
