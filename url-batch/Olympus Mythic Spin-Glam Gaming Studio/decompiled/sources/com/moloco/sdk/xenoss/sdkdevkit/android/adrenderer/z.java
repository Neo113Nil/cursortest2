package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class z implements y {

    @NotNull
    public static final b b = new b(null);
    public static final int c = 8;

    @Deprecated
    @NotNull
    public static final String d = "Watermark Overlay";

    @Nullable
    public String a;

    public static final class a implements Function2 {
        public final /* synthetic */ Function2 a;

        public a(Function2 function2) {
            this.a = function2;
        }

        @ComposableTarget
        @Composable
        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(586795374, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.WatermarkImpl.ApplyWatermark.<anonymous> (Watermark.kt:47)");
            }
            this.a.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final Unit a(z zVar, Function2 function2, int i, Composer composer, int i2) {
        zVar.a(function2, composer, i | 1);
        return Unit.INSTANCE;
    }

    public z(@Nullable String str) {
        this.a = str;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y
    @Composable
    @ComposableInferredTarget
    public void a(@NotNull final Function2 content, @Nullable Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(412679763);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(412679763, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.WatermarkImpl.ApplyWatermark (Watermark.kt:45)");
            }
            A.a(this.a, ComposableLambdaKt.composableLambda(startRestartGroup, 586795374, true, new a(content)), startRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return z.a(z.this, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public /* synthetic */ z(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y
    public void a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Bitmap a2 = A.a(this.a);
        if (a2 == null) {
            return;
        }
        com.moloco.sdk.service_locator.a aVar = com.moloco.sdk.service_locator.a.a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(aVar.a().getResources(), a2);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(aVar.a().getResources().getDisplayMetrics());
        view.setForeground(bitmapDrawable);
        view.setClickable(false);
        view.setFocusable(false);
        view.setContentDescription(d);
        view.setTag(d);
    }
}
