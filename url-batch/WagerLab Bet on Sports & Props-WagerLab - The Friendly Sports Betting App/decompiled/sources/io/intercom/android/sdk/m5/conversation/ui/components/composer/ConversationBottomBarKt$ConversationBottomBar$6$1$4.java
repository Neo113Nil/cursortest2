package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.components.PoweredByBadgeKt;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationBottomBar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class ConversationBottomBarKt$ConversationBottomBar$6$1$4 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ BottomBarUiState $bottomBarUiState;
    final /* synthetic */ Context $context;
    final /* synthetic */ Function0<Unit> $onPrivacyNoticeDismissed;
    final /* synthetic */ ColumnScope $this_Column;
    final /* synthetic */ Function1<MetricData, Unit> $trackMetric;

    /* JADX WARN: Multi-variable type inference failed */
    ConversationBottomBarKt$ConversationBottomBar$6$1$4(BottomBarUiState bottomBarUiState, Function0<Unit> function0, ColumnScope columnScope, Function1<? super MetricData, Unit> function1, Context context) {
        this.$bottomBarUiState = bottomBarUiState;
        this.$onPrivacyNoticeDismissed = function0;
        this.$this_Column = columnScope;
        this.$trackMetric = function1;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        BottomBarUiState.BottomBadgeState bottomBadge = this.$bottomBarUiState.getBottomBadge();
        if (bottomBadge instanceof BottomBarUiState.BottomBadgeState.PoweredByBadgeState) {
            composer.startReplaceGroup(-248826298);
            final PoweredBy poweredBy = ((BottomBarUiState.BottomBadgeState.PoweredByBadgeState) this.$bottomBarUiState.getBottomBadge()).getPoweredBy();
            ColumnScope columnScope = this.$this_Column;
            final Function1<MetricData, Unit> function1 = this.$trackMetric;
            final Context context = this.$context;
            PoweredByBadgeKt.m11179PoweredByBadgewBJOh4Y(poweredBy.getText(), poweredBy.getIcon(), new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt$ConversationBottomBar$6$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = ConversationBottomBarKt$ConversationBottomBar$6$1$4.invoke$lambda$1$lambda$0(Function1.this, poweredBy, context);
                    return invoke$lambda$1$lambda$0;
                }
            }, columnScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), Color.INSTANCE.m5692getTransparent0d7_KjU(), IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU(), composer, 24576, 0);
            composer.endReplaceGroup();
            return;
        }
        if (bottomBadge instanceof BottomBarUiState.BottomBadgeState.PrivacyNoticeBadgeState) {
            composer.startReplaceGroup(-247756612);
            PrivacyPolicyKt.PrivacyPolicy(((BottomBarUiState.BottomBadgeState.PrivacyNoticeBadgeState) this.$bottomBarUiState.getBottomBadge()).getText(), PaddingKt.m838paddingVpY3zN4(Modifier.INSTANCE, Dp.m8401constructorimpl(16), Dp.m8401constructorimpl(4)), this.$onPrivacyNoticeDismissed, composer, 48, 0);
            composer.endReplaceGroup();
        } else if (bottomBadge instanceof BottomBarUiState.BottomBadgeState.None) {
            composer.startReplaceGroup(-247352651);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1254955894);
            composer.endReplaceGroup();
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, PoweredBy this_with, Context context) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(context, "$context");
        function1.invoke(MetricData.PoweredByClicked.INSTANCE);
        LinkOpener.handleUrl(this_with.getLinkUrl(), context, Injector.get().getApi());
        return Unit.INSTANCE;
    }
}
