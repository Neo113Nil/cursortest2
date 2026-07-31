package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationErrorScreen.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"ConversationErrorScreen", "", "state", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Error;", "onRetryClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState$Error;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ConversationErrorScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConversationErrorScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationErrorScreen$lambda$0(ConversationUiState.Error state, Function0 onRetryClick, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(onRetryClick, "$onRetryClick");
        ConversationErrorScreen(state, onRetryClick, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationErrorScreenPreview$lambda$1(int i, Composer composer, int i2) {
        ConversationErrorScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ConversationErrorScreen(final ConversationUiState.Error state, final Function0<Unit> onRetryClick, Modifier modifier, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onRetryClick, "onRetryClick");
        Composer startRestartGroup = composer.startRestartGroup(-1804211412);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        IntercomErrorScreenKt.IntercomErrorScreen(state.getShowCta() ? new ErrorState.WithCTA(0, 0, null, 0, onRetryClick, 15, null) : new ErrorState.WithoutCTA(0, 0, null, 7, null), companion, startRestartGroup, (i >> 3) & 112, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier2 = companion;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationErrorScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ConversationErrorScreen$lambda$0;
                    ConversationErrorScreen$lambda$0 = ConversationErrorScreenKt.ConversationErrorScreen$lambda$0(ConversationUiState.Error.this, onRetryClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ConversationErrorScreen$lambda$0;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void ConversationErrorScreenPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1551706949);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationErrorScreenKt.INSTANCE.m11214getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationErrorScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ConversationErrorScreenPreview$lambda$1;
                    ConversationErrorScreenPreview$lambda$1 = ConversationErrorScreenKt.ConversationErrorScreenPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ConversationErrorScreenPreview$lambda$1;
                }
            });
        }
    }
}
