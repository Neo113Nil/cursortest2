package io.intercom.android.sdk.ui.component;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: IntercomButton.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomButtonKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$IntercomButtonKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$IntercomButtonKt$lambda1$1 INSTANCE = new ComposableSingletons$IntercomButtonKt$lambda1$1();

    ComposableSingletons$IntercomButtonKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m11965primaryStyleKlgxPg(0L, 0L, null, composer, 3072, 7), "Button", null, new Function0() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomButtonKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, composer, 24960, 9);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
