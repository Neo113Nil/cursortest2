package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.models.PoweredBy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationUiState.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002 !B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u001fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;", "", "composerState", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "currentlyTypingState", "Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;", "inputTypeState", "Lio/intercom/android/sdk/m5/conversation/states/InputTypeState;", "bottomBadge", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/ComposerState;Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;Lio/intercom/android/sdk/m5/conversation/states/InputTypeState;Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState;)V", "getComposerState", "()Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "getCurrentlyTypingState", "()Lio/intercom/android/sdk/m5/conversation/states/CurrentlyTypingState;", "getInputTypeState", "()Lio/intercom/android/sdk/m5/conversation/states/InputTypeState;", "getBottomBadge", "()Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "BottomBarButton", "BottomBadgeState", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BottomBarUiState {
    public static final int $stable = 8;
    private final BottomBadgeState bottomBadge;
    private final ComposerState composerState;
    private final CurrentlyTypingState currentlyTypingState;
    private final InputTypeState inputTypeState;

    public static /* synthetic */ BottomBarUiState copy$default(BottomBarUiState bottomBarUiState, ComposerState composerState, CurrentlyTypingState currentlyTypingState, InputTypeState inputTypeState, BottomBadgeState bottomBadgeState, int i, Object obj) {
        if ((i & 1) != 0) {
            composerState = bottomBarUiState.composerState;
        }
        if ((i & 2) != 0) {
            currentlyTypingState = bottomBarUiState.currentlyTypingState;
        }
        if ((i & 4) != 0) {
            inputTypeState = bottomBarUiState.inputTypeState;
        }
        if ((i & 8) != 0) {
            bottomBadgeState = bottomBarUiState.bottomBadge;
        }
        return bottomBarUiState.copy(composerState, currentlyTypingState, inputTypeState, bottomBadgeState);
    }

    /* renamed from: component1, reason: from getter */
    public final ComposerState getComposerState() {
        return this.composerState;
    }

    /* renamed from: component2, reason: from getter */
    public final CurrentlyTypingState getCurrentlyTypingState() {
        return this.currentlyTypingState;
    }

    /* renamed from: component3, reason: from getter */
    public final InputTypeState getInputTypeState() {
        return this.inputTypeState;
    }

    /* renamed from: component4, reason: from getter */
    public final BottomBadgeState getBottomBadge() {
        return this.bottomBadge;
    }

    public final BottomBarUiState copy(ComposerState composerState, CurrentlyTypingState currentlyTypingState, InputTypeState inputTypeState, BottomBadgeState bottomBadge) {
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(currentlyTypingState, "currentlyTypingState");
        Intrinsics.checkNotNullParameter(inputTypeState, "inputTypeState");
        Intrinsics.checkNotNullParameter(bottomBadge, "bottomBadge");
        return new BottomBarUiState(composerState, currentlyTypingState, inputTypeState, bottomBadge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomBarUiState)) {
            return false;
        }
        BottomBarUiState bottomBarUiState = (BottomBarUiState) other;
        return Intrinsics.areEqual(this.composerState, bottomBarUiState.composerState) && Intrinsics.areEqual(this.currentlyTypingState, bottomBarUiState.currentlyTypingState) && Intrinsics.areEqual(this.inputTypeState, bottomBarUiState.inputTypeState) && Intrinsics.areEqual(this.bottomBadge, bottomBarUiState.bottomBadge);
    }

    public int hashCode() {
        return (((((this.composerState.hashCode() * 31) + this.currentlyTypingState.hashCode()) * 31) + this.inputTypeState.hashCode()) * 31) + this.bottomBadge.hashCode();
    }

    public String toString() {
        return "BottomBarUiState(composerState=" + this.composerState + ", currentlyTypingState=" + this.currentlyTypingState + ", inputTypeState=" + this.inputTypeState + ", bottomBadge=" + this.bottomBadge + ')';
    }

    public BottomBarUiState(ComposerState composerState, CurrentlyTypingState currentlyTypingState, InputTypeState inputTypeState, BottomBadgeState bottomBadge) {
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(currentlyTypingState, "currentlyTypingState");
        Intrinsics.checkNotNullParameter(inputTypeState, "inputTypeState");
        Intrinsics.checkNotNullParameter(bottomBadge, "bottomBadge");
        this.composerState = composerState;
        this.currentlyTypingState = currentlyTypingState;
        this.inputTypeState = inputTypeState;
        this.bottomBadge = bottomBadge;
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public final CurrentlyTypingState getCurrentlyTypingState() {
        return this.currentlyTypingState;
    }

    public final InputTypeState getInputTypeState() {
        return this.inputTypeState;
    }

    public /* synthetic */ BottomBarUiState(ComposerState composerState, CurrentlyTypingState currentlyTypingState, InputTypeState inputTypeState, BottomBadgeState.None none, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(composerState, currentlyTypingState, inputTypeState, (i & 8) != 0 ? BottomBadgeState.None.INSTANCE : none);
    }

    public final BottomBadgeState getBottomBadge() {
        return this.bottomBadge;
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton;", "", "<init>", "()V", "GifInsert", "MediaInsert", "VoiceNotesInsert", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton$GifInsert;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton$MediaInsert;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton$VoiceNotesInsert;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class BottomBarButton {
        public static final int $stable = 0;

        public /* synthetic */ BottomBarButton(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: ConversationUiState.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton$GifInsert;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class GifInsert extends BottomBarButton {
            public static final int $stable = 0;
            public static final GifInsert INSTANCE = new GifInsert();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GifInsert)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 806342211;
            }

            public String toString() {
                return "GifInsert";
            }

            private GifInsert() {
                super(null);
            }
        }

        private BottomBarButton() {
        }

        /* compiled from: ConversationUiState.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton$MediaInsert;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MediaInsert extends BottomBarButton {
            public static final int $stable = 0;
            public static final MediaInsert INSTANCE = new MediaInsert();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MediaInsert)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -196410141;
            }

            public String toString() {
                return "MediaInsert";
            }

            private MediaInsert() {
                super(null);
            }
        }

        /* compiled from: ConversationUiState.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton$VoiceNotesInsert;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class VoiceNotesInsert extends BottomBarButton {
            public static final int $stable = 0;
            public static final VoiceNotesInsert INSTANCE = new VoiceNotesInsert();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VoiceNotesInsert)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 501154530;
            }

            public String toString() {
                return "VoiceNotesInsert";
            }

            private VoiceNotesInsert() {
                super(null);
            }
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState;", "", "PoweredByBadgeState", "PrivacyNoticeBadgeState", "None", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState$None;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState$PoweredByBadgeState;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState$PrivacyNoticeBadgeState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface BottomBadgeState {

        /* compiled from: ConversationUiState.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState$PoweredByBadgeState;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState;", "poweredBy", "Lio/intercom/android/sdk/models/PoweredBy;", "<init>", "(Lio/intercom/android/sdk/models/PoweredBy;)V", "getPoweredBy", "()Lio/intercom/android/sdk/models/PoweredBy;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PoweredByBadgeState implements BottomBadgeState {
            public static final int $stable = 0;
            private final PoweredBy poweredBy;

            public static /* synthetic */ PoweredByBadgeState copy$default(PoweredByBadgeState poweredByBadgeState, PoweredBy poweredBy, int i, Object obj) {
                if ((i & 1) != 0) {
                    poweredBy = poweredByBadgeState.poweredBy;
                }
                return poweredByBadgeState.copy(poweredBy);
            }

            /* renamed from: component1, reason: from getter */
            public final PoweredBy getPoweredBy() {
                return this.poweredBy;
            }

            public final PoweredByBadgeState copy(PoweredBy poweredBy) {
                Intrinsics.checkNotNullParameter(poweredBy, "poweredBy");
                return new PoweredByBadgeState(poweredBy);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PoweredByBadgeState) && Intrinsics.areEqual(this.poweredBy, ((PoweredByBadgeState) other).poweredBy);
            }

            public int hashCode() {
                return this.poweredBy.hashCode();
            }

            public String toString() {
                return "PoweredByBadgeState(poweredBy=" + this.poweredBy + ')';
            }

            public PoweredByBadgeState(PoweredBy poweredBy) {
                Intrinsics.checkNotNullParameter(poweredBy, "poweredBy");
                this.poweredBy = poweredBy;
            }

            public final PoweredBy getPoweredBy() {
                return this.poweredBy;
            }
        }

        /* compiled from: ConversationUiState.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState$PrivacyNoticeBadgeState;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PrivacyNoticeBadgeState implements BottomBadgeState {
            public static final int $stable = 0;
            private final String text;

            public static /* synthetic */ PrivacyNoticeBadgeState copy$default(PrivacyNoticeBadgeState privacyNoticeBadgeState, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = privacyNoticeBadgeState.text;
                }
                return privacyNoticeBadgeState.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final PrivacyNoticeBadgeState copy(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new PrivacyNoticeBadgeState(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PrivacyNoticeBadgeState) && Intrinsics.areEqual(this.text, ((PrivacyNoticeBadgeState) other).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "PrivacyNoticeBadgeState(text=" + this.text + ')';
            }

            public PrivacyNoticeBadgeState(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public final String getText() {
                return this.text;
            }
        }

        /* compiled from: ConversationUiState.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState$None;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class None implements BottomBadgeState {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof None)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -495368601;
            }

            public String toString() {
                return "None";
            }

            private None() {
            }
        }
    }
}
