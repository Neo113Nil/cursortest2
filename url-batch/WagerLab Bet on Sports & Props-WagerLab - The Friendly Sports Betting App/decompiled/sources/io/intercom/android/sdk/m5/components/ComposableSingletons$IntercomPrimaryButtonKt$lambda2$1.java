package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: IntercomPrimaryButton.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$IntercomPrimaryButtonKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$IntercomPrimaryButtonKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$IntercomPrimaryButtonKt$lambda2$1 INSTANCE = new ComposableSingletons$IntercomPrimaryButtonKt$lambda2$1();

    ComposableSingletons$IntercomPrimaryButtonKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            IntercomPrimaryButtonKt.IntercomPrimaryButton("Button", null, Integer.valueOf(R.drawable.intercom_send_message_icon), new Function0() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$IntercomPrimaryButtonKt$lambda-2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, composer, 3078, 2);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
