package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.app.Activity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5051a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes14.dex */
public final class v {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.HideSystemUIKt$HideSystemUI$1$1", f = "HideSystemUI.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Activity c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, Activity activity, Continuation continuation) {
            super(2, continuation);
            this.b = z;
            this.c = activity;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.b) {
                C5051a.a(this.c);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit a(Activity activity, int i, Composer composer, int i2) {
        a(activity, composer, i | 1);
        return Unit.INSTANCE;
    }

    @Composable
    public static final void a(@NotNull final Activity activity, @Nullable Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Composer startRestartGroup = composer.startRestartGroup(-726701488);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(activity) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-726701488, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.HideSystemUI (HideSystemUI.kt:9)");
            }
            boolean isWindowFocused = ((WindowInfo) startRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused();
            Boolean valueOf = Boolean.valueOf(isWindowFocused);
            startRestartGroup.startReplaceableGroup(-1598620045);
            boolean changed = startRestartGroup.changed(isWindowFocused) | startRestartGroup.changed(activity);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new a(isWindowFocused, activity, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v.a(activity, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void a(@NotNull Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (z) {
            C5051a.a(activity);
        }
    }
}
