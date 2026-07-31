package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationHistoryCard.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"ConversationHistoryCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "cardTitle", "", "conversations", "", "Lio/intercom/android/sdk/models/Conversation;", "onConversationClick", "Lkotlin/Function1;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "RecentConversationsCardWithSimpleTicketHeaderPreview", "(Landroidx/compose/runtime/Composer;I)V", "RecentConversationsCardPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConversationHistoryCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationHistoryCard$lambda$1(Modifier modifier, String cardTitle, List conversations, Function1 function1, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(cardTitle, "$cardTitle");
        Intrinsics.checkNotNullParameter(conversations, "$conversations");
        ConversationHistoryCard(modifier, cardTitle, conversations, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecentConversationsCardPreview$lambda$3(int i, Composer composer, int i2) {
        RecentConversationsCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecentConversationsCardWithSimpleTicketHeaderPreview$lambda$2(int i, Composer composer, int i2) {
        RecentConversationsCardWithSimpleTicketHeaderPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationHistoryCard$lambda$0(Conversation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void ConversationHistoryCard(Modifier modifier, final String cardTitle, final List<Conversation> conversations, Function1<? super Conversation, Unit> function1, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
        Intrinsics.checkNotNullParameter(conversations, "conversations");
        Composer startRestartGroup = composer.startRestartGroup(-1629591433);
        final Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        Function1<? super Conversation, Unit> function12 = (i2 & 8) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.components.ConversationHistoryCardKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ConversationHistoryCard$lambda$0;
                ConversationHistoryCard$lambda$0 = ConversationHistoryCardKt.ConversationHistoryCard$lambda$0((Conversation) obj);
                return ConversationHistoryCard$lambda$0;
            }
        } : function1;
        HomeCardScaffoldKt.HomeCardScaffold(modifier2, cardTitle, ComposableLambdaKt.rememberComposableLambda(1614953259, true, new ConversationHistoryCardKt$ConversationHistoryCard$2(conversations, function12), startRestartGroup, 54), startRestartGroup, (i & 14) | 384 | (i & 112), 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Function1<? super Conversation, Unit> function13 = function12;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.ConversationHistoryCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ConversationHistoryCard$lambda$1;
                    ConversationHistoryCard$lambda$1 = ConversationHistoryCardKt.ConversationHistoryCard$lambda$1(Modifier.this, cardTitle, conversations, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ConversationHistoryCard$lambda$1;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void RecentConversationsCardWithSimpleTicketHeaderPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1823267221);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationHistoryCardKt.INSTANCE.m11099getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.ConversationHistoryCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RecentConversationsCardWithSimpleTicketHeaderPreview$lambda$2;
                    RecentConversationsCardWithSimpleTicketHeaderPreview$lambda$2 = ConversationHistoryCardKt.RecentConversationsCardWithSimpleTicketHeaderPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return RecentConversationsCardWithSimpleTicketHeaderPreview$lambda$2;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void RecentConversationsCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(593700998);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationHistoryCardKt.INSTANCE.m11100getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.ConversationHistoryCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RecentConversationsCardPreview$lambda$3;
                    RecentConversationsCardPreview$lambda$3 = ConversationHistoryCardKt.RecentConversationsCardPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return RecentConversationsCardPreview$lambda$3;
                }
            });
        }
    }
}
