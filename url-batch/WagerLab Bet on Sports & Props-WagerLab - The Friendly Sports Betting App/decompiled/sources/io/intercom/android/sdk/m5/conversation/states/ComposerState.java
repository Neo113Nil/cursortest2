package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationUiState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "", "TextInput", "ConversationEnded", "Reactions", "Hidden", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState$Hidden;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState$Reactions;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState$TextInput;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ComposerState {

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÇ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010 H×\u0003J\t\u0010!\u001a\u00020\"H×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerState$TextInput;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "initialMessage", "", "hintText", "Lio/intercom/android/sdk/ui/common/StringProvider;", "isDisabled", "", "buttons", "", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton;", "inputType", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/ui/common/StringProvider;ZLjava/util/List;Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType;)V", "getInitialMessage", "()Ljava/lang/String;", "getHintText", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "()Z", "getButtons", "()Ljava/util/List;", "getInputType", "()Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextInput implements ComposerState {
        public static final int $stable = 8;
        private final List<BottomBarUiState.BottomBarButton> buttons;
        private final StringProvider hintText;
        private final String initialMessage;
        private final ComposerInputType inputType;
        private final boolean isDisabled;

        public static /* synthetic */ TextInput copy$default(TextInput textInput, String str, StringProvider stringProvider, boolean z, List list, ComposerInputType composerInputType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textInput.initialMessage;
            }
            if ((i & 2) != 0) {
                stringProvider = textInput.hintText;
            }
            if ((i & 4) != 0) {
                z = textInput.isDisabled;
            }
            if ((i & 8) != 0) {
                list = textInput.buttons;
            }
            if ((i & 16) != 0) {
                composerInputType = textInput.inputType;
            }
            ComposerInputType composerInputType2 = composerInputType;
            boolean z2 = z;
            return textInput.copy(str, stringProvider, z2, list, composerInputType2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInitialMessage() {
            return this.initialMessage;
        }

        /* renamed from: component2, reason: from getter */
        public final StringProvider getHintText() {
            return this.hintText;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsDisabled() {
            return this.isDisabled;
        }

        public final List<BottomBarUiState.BottomBarButton> component4() {
            return this.buttons;
        }

        /* renamed from: component5, reason: from getter */
        public final ComposerInputType getInputType() {
            return this.inputType;
        }

        public final TextInput copy(String initialMessage, StringProvider hintText, boolean isDisabled, List<? extends BottomBarUiState.BottomBarButton> buttons, ComposerInputType inputType) {
            Intrinsics.checkNotNullParameter(initialMessage, "initialMessage");
            Intrinsics.checkNotNullParameter(hintText, "hintText");
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            Intrinsics.checkNotNullParameter(inputType, "inputType");
            return new TextInput(initialMessage, hintText, isDisabled, buttons, inputType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextInput)) {
                return false;
            }
            TextInput textInput = (TextInput) other;
            return Intrinsics.areEqual(this.initialMessage, textInput.initialMessage) && Intrinsics.areEqual(this.hintText, textInput.hintText) && this.isDisabled == textInput.isDisabled && Intrinsics.areEqual(this.buttons, textInput.buttons) && Intrinsics.areEqual(this.inputType, textInput.inputType);
        }

        public int hashCode() {
            return (((((((this.initialMessage.hashCode() * 31) + this.hintText.hashCode()) * 31) + Boolean.hashCode(this.isDisabled)) * 31) + this.buttons.hashCode()) * 31) + this.inputType.hashCode();
        }

        public String toString() {
            return "TextInput(initialMessage=" + this.initialMessage + ", hintText=" + this.hintText + ", isDisabled=" + this.isDisabled + ", buttons=" + this.buttons + ", inputType=" + this.inputType + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TextInput(String initialMessage, StringProvider hintText, boolean z, List<? extends BottomBarUiState.BottomBarButton> buttons, ComposerInputType inputType) {
            Intrinsics.checkNotNullParameter(initialMessage, "initialMessage");
            Intrinsics.checkNotNullParameter(hintText, "hintText");
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            Intrinsics.checkNotNullParameter(inputType, "inputType");
            this.initialMessage = initialMessage;
            this.hintText = hintText;
            this.isDisabled = z;
            this.buttons = buttons;
            this.inputType = inputType;
        }

        public final String getInitialMessage() {
            return this.initialMessage;
        }

        public final StringProvider getHintText() {
            return this.hintText;
        }

        public final boolean isDisabled() {
            return this.isDisabled;
        }

        public /* synthetic */ TextInput(String str, StringProvider stringProvider, boolean z, List list, ComposerInputType.Text text, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, stringProvider, (i & 4) != 0 ? false : z, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? ComposerInputType.Text.INSTANCE : text);
        }

        public final List<BottomBarUiState.BottomBarButton> getButtons() {
            return this.buttons;
        }

        public final ComposerInputType getInputType() {
            return this.inputType;
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "message", "Lio/intercom/android/sdk/ui/common/StringProvider;", SDKConstants.PARAM_GAME_REQUESTS_CTA, "Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded$ConversationEndedCta;", "<init>", "(Lio/intercom/android/sdk/ui/common/StringProvider;Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded$ConversationEndedCta;)V", "getMessage", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "getCta", "()Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded$ConversationEndedCta;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "ConversationEndedCta", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConversationEnded implements ComposerState {
        public static final int $stable = StringProvider.$stable | StringProvider.$stable;
        private final ConversationEndedCta cta;
        private final StringProvider message;

        public static /* synthetic */ ConversationEnded copy$default(ConversationEnded conversationEnded, StringProvider stringProvider, ConversationEndedCta conversationEndedCta, int i, Object obj) {
            if ((i & 1) != 0) {
                stringProvider = conversationEnded.message;
            }
            if ((i & 2) != 0) {
                conversationEndedCta = conversationEnded.cta;
            }
            return conversationEnded.copy(stringProvider, conversationEndedCta);
        }

        /* renamed from: component1, reason: from getter */
        public final StringProvider getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final ConversationEndedCta getCta() {
            return this.cta;
        }

        public final ConversationEnded copy(StringProvider message, ConversationEndedCta cta) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ConversationEnded(message, cta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationEnded)) {
                return false;
            }
            ConversationEnded conversationEnded = (ConversationEnded) other;
            return Intrinsics.areEqual(this.message, conversationEnded.message) && Intrinsics.areEqual(this.cta, conversationEnded.cta);
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            ConversationEndedCta conversationEndedCta = this.cta;
            return hashCode + (conversationEndedCta == null ? 0 : conversationEndedCta.hashCode());
        }

        public String toString() {
            return "ConversationEnded(message=" + this.message + ", cta=" + this.cta + ')';
        }

        public ConversationEnded(StringProvider message, ConversationEndedCta conversationEndedCta) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cta = conversationEndedCta;
        }

        public /* synthetic */ ConversationEnded(StringProvider stringProvider, ConversationEndedCta conversationEndedCta, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringProvider, (i & 2) != 0 ? null : conversationEndedCta);
        }

        public final StringProvider getMessage() {
            return this.message;
        }

        public final ConversationEndedCta getCta() {
            return this.cta;
        }

        /* compiled from: ConversationUiState.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0005H×\u0001J\t\u0010\u0018\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerState$ConversationEnded$ConversationEndedCta;", "", "title", "Lio/intercom/android/sdk/ui/common/StringProvider;", "trailingIcon", "", "linkedConversationId", "", "<init>", "(Lio/intercom/android/sdk/ui/common/StringProvider;ILjava/lang/String;)V", "getTitle", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "getTrailingIcon", "()I", "getLinkedConversationId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ConversationEndedCta {
            public static final int $stable = StringProvider.$stable;
            private final String linkedConversationId;
            private final StringProvider title;
            private final int trailingIcon;

            public static /* synthetic */ ConversationEndedCta copy$default(ConversationEndedCta conversationEndedCta, StringProvider stringProvider, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    stringProvider = conversationEndedCta.title;
                }
                if ((i2 & 2) != 0) {
                    i = conversationEndedCta.trailingIcon;
                }
                if ((i2 & 4) != 0) {
                    str = conversationEndedCta.linkedConversationId;
                }
                return conversationEndedCta.copy(stringProvider, i, str);
            }

            /* renamed from: component1, reason: from getter */
            public final StringProvider getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final int getTrailingIcon() {
                return this.trailingIcon;
            }

            /* renamed from: component3, reason: from getter */
            public final String getLinkedConversationId() {
                return this.linkedConversationId;
            }

            public final ConversationEndedCta copy(StringProvider title, int trailingIcon, String linkedConversationId) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new ConversationEndedCta(title, trailingIcon, linkedConversationId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ConversationEndedCta)) {
                    return false;
                }
                ConversationEndedCta conversationEndedCta = (ConversationEndedCta) other;
                return Intrinsics.areEqual(this.title, conversationEndedCta.title) && this.trailingIcon == conversationEndedCta.trailingIcon && Intrinsics.areEqual(this.linkedConversationId, conversationEndedCta.linkedConversationId);
            }

            public int hashCode() {
                int hashCode = ((this.title.hashCode() * 31) + Integer.hashCode(this.trailingIcon)) * 31;
                String str = this.linkedConversationId;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "ConversationEndedCta(title=" + this.title + ", trailingIcon=" + this.trailingIcon + ", linkedConversationId=" + this.linkedConversationId + ')';
            }

            public ConversationEndedCta(StringProvider title, int i, String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.trailingIcon = i;
                this.linkedConversationId = str;
            }

            public /* synthetic */ ConversationEndedCta(StringProvider stringProvider, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(stringProvider, i, (i2 & 4) != 0 ? null : str);
            }

            public final StringProvider getTitle() {
                return this.title;
            }

            public final int getTrailingIcon() {
                return this.trailingIcon;
            }

            public final String getLinkedConversationId() {
                return this.linkedConversationId;
            }
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerState$Reactions;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "reactionReply", "Lio/intercom/android/sdk/models/ReactionReply;", "lastPartId", "", "conversationId", "<init>", "(Lio/intercom/android/sdk/models/ReactionReply;Ljava/lang/String;Ljava/lang/String;)V", "getReactionReply", "()Lio/intercom/android/sdk/models/ReactionReply;", "getLastPartId", "()Ljava/lang/String;", "getConversationId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Reactions implements ComposerState {
        public static final int $stable = 8;
        private final String conversationId;
        private final String lastPartId;
        private final ReactionReply reactionReply;

        public static /* synthetic */ Reactions copy$default(Reactions reactions, ReactionReply reactionReply, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                reactionReply = reactions.reactionReply;
            }
            if ((i & 2) != 0) {
                str = reactions.lastPartId;
            }
            if ((i & 4) != 0) {
                str2 = reactions.conversationId;
            }
            return reactions.copy(reactionReply, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final ReactionReply getReactionReply() {
            return this.reactionReply;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLastPartId() {
            return this.lastPartId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        public final Reactions copy(ReactionReply reactionReply, String lastPartId, String conversationId) {
            Intrinsics.checkNotNullParameter(reactionReply, "reactionReply");
            Intrinsics.checkNotNullParameter(lastPartId, "lastPartId");
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            return new Reactions(reactionReply, lastPartId, conversationId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reactions)) {
                return false;
            }
            Reactions reactions = (Reactions) other;
            return Intrinsics.areEqual(this.reactionReply, reactions.reactionReply) && Intrinsics.areEqual(this.lastPartId, reactions.lastPartId) && Intrinsics.areEqual(this.conversationId, reactions.conversationId);
        }

        public int hashCode() {
            return (((this.reactionReply.hashCode() * 31) + this.lastPartId.hashCode()) * 31) + this.conversationId.hashCode();
        }

        public String toString() {
            return "Reactions(reactionReply=" + this.reactionReply + ", lastPartId=" + this.lastPartId + ", conversationId=" + this.conversationId + ')';
        }

        public Reactions(ReactionReply reactionReply, String lastPartId, String conversationId) {
            Intrinsics.checkNotNullParameter(reactionReply, "reactionReply");
            Intrinsics.checkNotNullParameter(lastPartId, "lastPartId");
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            this.reactionReply = reactionReply;
            this.lastPartId = lastPartId;
            this.conversationId = conversationId;
        }

        public final ReactionReply getReactionReply() {
            return this.reactionReply;
        }

        public final String getLastPartId() {
            return this.lastPartId;
        }

        public final String getConversationId() {
            return this.conversationId;
        }
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerState$Hidden;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "hideKeyboard", "", "<init>", "(Z)V", "getHideKeyboard", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Hidden implements ComposerState {
        public static final int $stable = 0;
        private final boolean hideKeyboard;

        public Hidden() {
            this(false, 1, null);
        }

        public static /* synthetic */ Hidden copy$default(Hidden hidden, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = hidden.hideKeyboard;
            }
            return hidden.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHideKeyboard() {
            return this.hideKeyboard;
        }

        public final Hidden copy(boolean hideKeyboard) {
            return new Hidden(hideKeyboard);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Hidden) && this.hideKeyboard == ((Hidden) other).hideKeyboard;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideKeyboard);
        }

        public String toString() {
            return "Hidden(hideKeyboard=" + this.hideKeyboard + ')';
        }

        public Hidden(boolean z) {
            this.hideKeyboard = z;
        }

        public /* synthetic */ Hidden(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public final boolean getHideKeyboard() {
            return this.hideKeyboard;
        }
    }
}
