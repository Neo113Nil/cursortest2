package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuickReplies.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class QuickRepliesKt$QuickReplies$1 implements Function3<FlowRowScope, Composer, Integer, Unit> {
    final /* synthetic */ Function1<QuickReply, Unit> $onQuickReplyClick;
    final /* synthetic */ List<QuickReply> $quickReplies;

    /* JADX WARN: Multi-variable type inference failed */
    QuickRepliesKt$QuickReplies$1(List<QuickReply> list, Function1<? super QuickReply, Unit> function1) {
        this.$quickReplies = list;
        this.$onQuickReplyClick = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer, Integer num) {
        invoke(flowRowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(FlowRowScope FlowRow, Composer composer, int i) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i & 81) != 16 || !composer2.getSkipping()) {
            List<QuickReply> list = this.$quickReplies;
            final Function1<QuickReply, Unit> function1 = this.$onQuickReplyClick;
            for (final QuickReply quickReply : list) {
                composer2.startReplaceGroup(373518625);
                boolean changed = composer2.changed(function1) | composer2.changed(quickReply);
                Object rememberedValue = composer2.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$QuickReplies$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$2$lambda$1$lambda$0;
                            invoke$lambda$2$lambda$1$lambda$0 = QuickRepliesKt$QuickReplies$1.invoke$lambda$2$lambda$1$lambda$0(Function1.this, quickReply);
                            return invoke$lambda$2$lambda$1$lambda$0;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                composer2.endReplaceGroup();
                IntercomCardKt.IntercomCard((Function0) rememberedValue, null, false, IntercomCardStyle.INSTANCE.m11976defaultStyleqUnfpCA(RoundedCornerShapeKt.m1202RoundedCornerShape0680j_4(Dp.m8401constructorimpl(20)), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12152getBackground0d7_KjU(), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), Dp.m8401constructorimpl(0), BorderStrokeKt.m292BorderStrokecXLIe8U(Dp.m8401constructorimpl(1), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12154getBorder0d7_KjU()), 0L, composer, (IntercomCardStyle.$stable << 18) | 3072, 32), null, ComposableLambdaKt.rememberComposableLambda(-1399332631, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$QuickReplies$1$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                        invoke(columnScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope IntercomCard, Composer composer3, int i2) {
                        Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
                        if ((i2 & 81) != 16 || !composer3.getSkipping()) {
                            TextKt.m3581TextNvy7gAk(QuickReply.this.getText(), PaddingKt.m838paddingVpY3zN4(Modifier.INSTANCE, Dp.m8401constructorimpl(16), Dp.m8401constructorimpl(12)), IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m8250boximpl(TextAlign.INSTANCE.m8257getCentere0LSkKk()), 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04Point5(), composer3, 0, 0, 130040);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composer, 54), composer, (IntercomCardStyle.Style.$stable << 9) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 22);
                composer2 = composer;
                function1 = function1;
            }
            return;
        }
        composer2.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 onQuickReplyClick, QuickReply it) {
        Intrinsics.checkNotNullParameter(onQuickReplyClick, "$onQuickReplyClick");
        Intrinsics.checkNotNullParameter(it, "$it");
        onQuickReplyClick.invoke(it);
        return Unit.INSTANCE;
    }
}
