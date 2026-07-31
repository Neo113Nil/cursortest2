package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationTopAppBar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class ConversationTopAppBarKt$ConversationTopAppBar$5$1 implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ State<Color> $contentColorState;
    final /* synthetic */ Function1<HeaderMenuItem, Unit> $onMenuClicked;
    final /* synthetic */ TopAppBarUiState $topAppBarUiState;
    final /* synthetic */ Function1<MetricData, Unit> $trackMetric;

    /* JADX WARN: Multi-variable type inference failed */
    ConversationTopAppBarKt$ConversationTopAppBar$5$1(TopAppBarUiState topAppBarUiState, Function1<? super HeaderMenuItem, Unit> function1, State<Color> state, Function1<? super MetricData, Unit> function12) {
        this.$topAppBarUiState = topAppBarUiState;
        this.$onMenuClicked = function1;
        this.$contentColorState = state;
        this.$trackMetric = function12;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope TopActionBar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(TopActionBar, "$this$TopActionBar");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            List<HeaderMenuItem> headerMenuItems = this.$topAppBarUiState.getHeaderMenuItems();
            composer.startReplaceGroup(-1166850860);
            boolean changed = composer.changed(this.$onMenuClicked);
            final Function1<HeaderMenuItem, Unit> function1 = this.$onMenuClicked;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ConversationTopAppBarKt$ConversationTopAppBar$5$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = ConversationTopAppBarKt$ConversationTopAppBar$5$1.invoke$lambda$1$lambda$0(Function1.this, (HeaderMenuItem) obj);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ConversationKebabKt.m11272ConversationKebabcf5BqRc(headerMenuItems, (Function1) rememberedValue, this.$contentColorState.getValue().m5667unboximpl(), this.$trackMetric, composer, 8, 0);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, HeaderMenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        function1.invoke(item);
        return Unit.INSTANCE;
    }
}
