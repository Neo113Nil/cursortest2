package com.moloco.sdk.internal.publisher.nativead.ui;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x;
import com.yandex.div.internal.widget.DivLayoutParams;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class f {
    @NotNull
    public static final Function3 a() {
        return new Function3() { // from class: com.moloco.sdk.internal.publisher.nativead.ui.f$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return f.a((Context) obj, (Flow) obj2, (Flow) obj3);
            }
        };
    }

    @Composable
    @NotNull
    public static final Function7 a(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1062465295);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1062465295, i, -1, "com.moloco.sdk.internal.publisher.nativead.ui.nativeVideoMuteButton (NativeVideoMuteButton.kt:14)");
        }
        Function7 a = x.a(0L, 0L, null, 0L, Alignment.INSTANCE.getTopStart(), null, Color.INSTANCE.m1462getWhite0d7_KjU(), PainterResources_androidKt.painterResource(R.drawable.moloco_twotone_volume_off_24, composer, 0), PainterResources_androidKt.painterResource(R.drawable.moloco_twotone_volume_up_24, composer, 0), null, composer, 1597440, 559);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return a;
    }

    public static final n a(Context context, Flow isPlayerPlaying, Flow mute) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isPlayerPlaying, "isPlayerPlaying");
        Intrinsics.checkNotNullParameter(mute, "mute");
        return new n(context, isPlayerPlaying, mute, -1, R.drawable.moloco_twotone_volume_off_24, R.drawable.moloco_twotone_volume_up_24, 0, 0, DivLayoutParams.DEFAULT_GRAVITY, 0, 0, 1728, null);
    }
}
