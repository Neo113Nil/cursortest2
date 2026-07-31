package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.ui.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: IntercomButton.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomButtonKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$IntercomButtonKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$IntercomButtonKt$lambda3$1 INSTANCE = new ComposableSingletons$IntercomButtonKt$lambda3$1();

    ComposableSingletons$IntercomButtonKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m11964outlinedStyleKlgxPg(Color.INSTANCE.m5694getWhite0d7_KjU(), Color.INSTANCE.m5683getBlack0d7_KjU(), BorderStrokeKt.m292BorderStrokecXLIe8U(Dp.m8401constructorimpl(1), Color.INSTANCE.m5687getGray0d7_KjU()), composer, 3510, 0), "Button", Integer.valueOf(R.drawable.intercom_send), new Function0() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomButtonKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, composer, 24960, 1);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
