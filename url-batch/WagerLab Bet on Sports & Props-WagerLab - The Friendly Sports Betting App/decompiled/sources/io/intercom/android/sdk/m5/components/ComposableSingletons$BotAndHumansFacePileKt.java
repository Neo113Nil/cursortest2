package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BotAndHumansFacePile.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$BotAndHumansFacePileKt {
    public static final ComposableSingletons$BotAndHumansFacePileKt INSTANCE = new ComposableSingletons$BotAndHumansFacePileKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f107lambda1 = ComposableLambdaKt.composableLambdaInstance(1717496869, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$BotAndHumansFacePileKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Avatar create = Avatar.create("", "VR");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                BotAndHumansFacePileKt.m11086BotAndHumansFacePilehGBTI10(null, create, new Pair(Avatar.create("", "SK"), Avatar.create("", "RS")), Dp.m8401constructorimpl(64), "Fin", composer, 28224, 1);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f108lambda2 = ComposableLambdaKt.composableLambdaInstance(-1080506615, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$BotAndHumansFacePileKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Avatar create = Avatar.create("", "VR");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                BotAndHumansFacePileKt.m11086BotAndHumansFacePilehGBTI10(null, create, new Pair(null, Avatar.create("", "SK")), Dp.m8401constructorimpl(32), "Fin", composer, 28224, 1);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11092getLambda1$intercom_sdk_base_release() {
        return f107lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11093getLambda2$intercom_sdk_base_release() {
        return f108lambda2;
    }
}
