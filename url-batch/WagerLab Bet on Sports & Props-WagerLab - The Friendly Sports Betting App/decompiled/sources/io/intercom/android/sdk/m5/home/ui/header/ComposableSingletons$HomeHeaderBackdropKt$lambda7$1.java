package io.intercom.android.sdk.m5.home.ui.header;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.utilities.ColorUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: HomeHeaderBackdrop.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderBackdropKt$lambda-7$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$HomeHeaderBackdropKt$lambda7$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$HomeHeaderBackdropKt$lambda7$1 INSTANCE = new ComposableSingletons$HomeHeaderBackdropKt$lambda7$1();

    ComposableSingletons$HomeHeaderBackdropKt$lambda7$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            HomeHeaderBackdropKt.m11581HomeHeaderBackdropAjpBEmI(Dp.m8401constructorimpl(200), new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(ColorKt.Color(ColorUtils.parseColor("#FF6B35")), true, null), new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(ColorKt.Color(ColorUtils.parseColor("#8B0000")), true, null), new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderBackdropKt$lambda-7$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, composer, 3078, 0);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
