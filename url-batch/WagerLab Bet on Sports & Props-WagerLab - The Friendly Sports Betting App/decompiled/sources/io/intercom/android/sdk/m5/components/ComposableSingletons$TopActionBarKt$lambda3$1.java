package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TopActionBar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$TopActionBarKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$TopActionBarKt$lambda3$1 INSTANCE = new ComposableSingletons$TopActionBarKt$lambda3$1();

    ComposableSingletons$TopActionBarKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            Avatar create = Avatar.create("", "HC");
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            Avatar create2 = Avatar.create("", "AA");
            Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
            Avatar create3 = Avatar.create("", "SS");
            Intrinsics.checkNotNullExpressionValue(create3, "create(...)");
            TopActionBarKt.m11189TopActionBarNpQZenA(null, "Team", "Back in 3 hours", Integer.valueOf(R.drawable.intercom_clock), CollectionsKt.listOf((Object[]) new AvatarWrapper[]{new AvatarWrapper(create, false, 2, null), new AvatarWrapper(create2, false, 2, null), new AvatarWrapper(create3, false, 2, null)}), new Function0() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, null, true, 0L, 0L, 0L, null, null, composer, 12812720, 0, 8001);
            return;
        }
        composer.skipToGroupEnd();
    }
}
