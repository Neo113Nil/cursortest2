package io.intercom.android.sdk.ui.component;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: MediaPickerButton.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$MediaPickerButtonKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$MediaPickerButtonKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$MediaPickerButtonKt$lambda2$1 INSTANCE = new ComposableSingletons$MediaPickerButtonKt$lambda2$1();

    ComposableSingletons$MediaPickerButtonKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            ButtonKt.Button(new Function0() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$MediaPickerButtonKt$lambda-2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, null, false, null, null, null, null, null, null, ComposableSingletons$MediaPickerButtonKt.INSTANCE.m11957getLambda1$intercom_sdk_ui_release(), composer, 805306374, TypedValues.PositionType.TYPE_POSITION_TYPE);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
