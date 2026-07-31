package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PulsatingBox.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$PulsatingBoxKt {
    public static final ComposableSingletons$PulsatingBoxKt INSTANCE = new ComposableSingletons$PulsatingBoxKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<BoxScope, Composer, Integer, Unit> f437lambda1 = ComposableLambdaKt.composableLambdaInstance(-188171614, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$PulsatingBoxKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope PulsatingBox, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(PulsatingBox, "$this$PulsatingBox");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                BoxKt.Box(BackgroundKt.m262backgroundbw27NRU$default(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(100)), Color.INSTANCE.m5694getWhite0d7_KjU(), null, 2, null), composer, 6);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f438lambda2 = ComposableLambdaKt.composableLambdaInstance(-579145229, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$PulsatingBoxKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                PulsatingBoxKt.m11999PulsatingBoxFU0evQE(null, 1.5f, 0L, null, true, ComposableSingletons$PulsatingBoxKt.INSTANCE.m11962getLambda1$intercom_sdk_ui_release(), composer, 221232, 13);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_ui_release, reason: not valid java name */
    public final Function3<BoxScope, Composer, Integer, Unit> m11962getLambda1$intercom_sdk_ui_release() {
        return f437lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11963getLambda2$intercom_sdk_ui_release() {
        return f438lambda2;
    }
}
