package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.paging.PagingData;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: InboxContentScreenItems.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0007H\u0000\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"inboxContentScreenItems", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "inboxConversations", "Landroidx/paging/compose/LazyPagingItems;", "Lio/intercom/android/sdk/models/Conversation;", "onConversationClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "conversation", "InboxContentScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InboxContentScreenItemsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InboxContentScreenPreview$lambda$0(int i, Composer composer, int i2) {
        InboxContentScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void inboxContentScreenItems(LazyListScope lazyListScope, LazyPagingItems<Conversation> inboxConversations, Function1<? super Conversation, Unit> onConversationClick) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(inboxConversations, "inboxConversations");
        Intrinsics.checkNotNullParameter(onConversationClick, "onConversationClick");
        LazyListScope.items$default(lazyListScope, inboxConversations.getItemCount(), null, null, ComposableLambdaKt.composableLambdaInstance(-1371545107, true, new InboxContentScreenItemsKt$inboxContentScreenItems$1(inboxConversations, onConversationClick)), 6, null);
    }

    @IntercomPreviews
    private static final void InboxContentScreenPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1634106166);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            LastParticipatingAdmin.Builder withAvatar = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
            Intrinsics.checkNotNullExpressionValue(withAvatar, "withAvatar(...)");
            InboxContentScreenPreview$DisplayPaging(StateFlowKt.MutableStateFlow(PagingData.INSTANCE.from(CollectionsKt.listOf(new Conversation("123", false, null, CollectionsKt.listOf(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)), null, withAvatar, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048534, null)))), startRestartGroup, 8);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxContentScreenItemsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InboxContentScreenPreview$lambda$0;
                    InboxContentScreenPreview$lambda$0 = InboxContentScreenItemsKt.InboxContentScreenPreview$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                    return InboxContentScreenPreview$lambda$0;
                }
            });
        }
    }

    private static final void InboxContentScreenPreview$DisplayPaging(Flow<PagingData<Conversation>> flow, Composer composer, int i) {
        composer.startReplaceGroup(1509694910);
        IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(853574228, true, new InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1(LazyPagingItemsKt.collectAsLazyPagingItems(flow, null, composer, 8, 1)), composer, 54), composer, 3072, 7);
        composer.endReplaceGroup();
    }
}
