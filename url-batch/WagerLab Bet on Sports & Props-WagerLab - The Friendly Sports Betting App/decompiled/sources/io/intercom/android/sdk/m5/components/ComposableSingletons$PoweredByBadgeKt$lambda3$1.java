package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import io.intercom.android.sdk.models.PoweredBy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: PoweredByBadge.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$PoweredByBadgeKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$PoweredByBadgeKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$PoweredByBadgeKt$lambda3$1 INSTANCE = new ComposableSingletons$PoweredByBadgeKt$lambda3$1();

    ComposableSingletons$PoweredByBadgeKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            PoweredByBadgeKt.m11179PoweredByBadgewBJOh4Y("Powered by Fin Ai Agent", PoweredBy.PoweredByIconType.FIN, new Function0() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$PoweredByBadgeKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, null, Color.INSTANCE.m5692getTransparent0d7_KjU(), 0L, composer, 25014, 40);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
