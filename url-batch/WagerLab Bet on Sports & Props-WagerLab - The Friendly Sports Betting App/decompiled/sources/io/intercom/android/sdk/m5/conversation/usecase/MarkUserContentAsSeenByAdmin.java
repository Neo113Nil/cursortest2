package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.annotations.SeenState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: MarkUserContentAsSeenByAdmin.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\u0002¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/MarkUserContentAsSeenByAdmin;", "", "<init>", "()V", "invoke", "", "clientStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MarkUserContentAsSeenByAdmin {
    public static final int $stable = 0;

    public final void invoke(MutableStateFlow<ConversationClientState> clientStateFlow) {
        ConversationClientState value;
        ConversationClientState conversationClientState;
        Conversation conversation;
        Intrinsics.checkNotNullParameter(clientStateFlow, "clientStateFlow");
        do {
            value = clientStateFlow.getValue();
            conversationClientState = value;
            Conversation conversation2 = conversationClientState.getConversation();
            if (conversation2 != null) {
                List list = CollectionsKt.toList(conversationClientState.getConversation().getPartBuilderList());
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Part.Builder builder = (Part.Builder) obj;
                    Part build = builder.build();
                    if (!build.isAdmin()) {
                        if (i == CollectionsKt.getLastIndex(conversationClientState.getConversation().parts())) {
                            builder = builder.withSeenByAdmin(SeenState.SEEN);
                        } else if (!Intrinsics.areEqual(build.getSeenByAdmin(), SeenState.HIDE)) {
                            builder = builder.withSeenByAdmin(SeenState.HIDE);
                        }
                    }
                    arrayList.add(builder);
                    i = i2;
                }
                conversation = Conversation.copy$default(conversation2, null, false, null, arrayList, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048567, null);
            } else {
                conversation = null;
            }
        } while (!clientStateFlow.compareAndSet(value, ConversationClientState.copy$default(conversationClientState, null, conversation, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194301, null)));
    }
}
