package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.ui.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: EmptyState.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$EmptyStateKt$lambda-4$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$EmptyStateKt$lambda4$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$EmptyStateKt$lambda4$1 INSTANCE = new ComposableSingletons$EmptyStateKt$lambda4$1();

    ComposableSingletons$EmptyStateKt$lambda4$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            IntercomPrimaryButtonKt.IntercomPrimaryButton("Send us a message", null, Integer.valueOf(R.drawable.intercom_send), new Function0() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$EmptyStateKt$lambda-4$1$$ExternalSyntheticLambda0
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
