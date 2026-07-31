package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: ChangeInputUseCase.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0086\u0002¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/ChangeInputUseCase;", "", "<init>", "()V", "invoke", "", "clientState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "inputType", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChangeInputUseCase {
    public static final int $stable = 0;

    public final void invoke(MutableStateFlow<ConversationClientState> clientState, ComposerInputType inputType) {
        Intrinsics.checkNotNullParameter(clientState, "clientState");
        ComposerInputType inputType2 = inputType;
        Intrinsics.checkNotNullParameter(inputType2, "inputType");
        while (true) {
            ConversationClientState value = clientState.getValue();
            if (clientState.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_reply_to_conversation, null, 2, null), false, null, inputType2, 12, null), null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194287, null))) {
                return;
            } else {
                inputType2 = inputType;
            }
        }
    }
}
