package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class t {
    public static final float a = Dp.m2507constructorimpl(48);

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastIconKt$VastIcon$1$1", f = "VastIcon.kt", l = {26}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ Function0 b;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastIconKt$VastIcon$1$1$1", f = "VastIcon.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.t$a$a, reason: collision with other inner class name */
        public static final class C1657a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ Function0 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1657a(Function0 function0, Continuation continuation) {
                super(2, continuation);
                this.b = function0;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1657a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1657a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.mo4828invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext main = com.moloco.sdk.internal.scheduling.b.a().getMain();
                C1657a c1657a = new C1657a(this.b, null);
                this.a = 1;
                if (BuildersKt.withContext(main, c1657a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        a(jVar, function0, function02, modifier, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    @ComposableTarget
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j resource, @NotNull final Function0 onDisplayed, @NotNull final Function0 onClick, @Nullable Modifier modifier, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean changed;
        Object rememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(onDisplayed, "onDisplayed");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1900222419);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(resource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(onDisplayed) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1900222419, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastIcon (VastIcon.kt:23)");
                }
                Unit unit = Unit.INSTANCE;
                startRestartGroup.startReplaceableGroup(1568428746);
                changed = startRestartGroup.changed(onDisplayed);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new a(onDisplayed, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit, (Function2) rememberedValue, startRestartGroup, 6);
                float f = a;
                Modifier m361sizeInqDBjuR0$default = SizeKt.m361sizeInqDBjuR0$default(modifier4, 0.0f, 0.0f, f, f, 3, null);
                if (!(resource instanceof j.a)) {
                    startRestartGroup.startReplaceableGroup(1376897229);
                    z.a((j.a) resource, m361sizeInqDBjuR0$default, startRestartGroup, 0, 0);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    if (!(resource instanceof j.b)) {
                        startRestartGroup.startReplaceableGroup(1568435090);
                        startRestartGroup.endReplaceableGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceableGroup(1377073185);
                    A.a((j.b) resource, ClickableKt.m172clickableXHw0xAI$default(m361sizeInqDBjuR0$default, false, null, null, onClick, 7, null), startRestartGroup, 0, 0);
                    startRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.t$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.this, onDisplayed, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Unit unit2 = Unit.INSTANCE;
        startRestartGroup.startReplaceableGroup(1568428746);
        changed = startRestartGroup.changed(onDisplayed);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new a(onDisplayed, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(unit2, (Function2) rememberedValue, startRestartGroup, 6);
        float f2 = a;
        Modifier m361sizeInqDBjuR0$default2 = SizeKt.m361sizeInqDBjuR0$default(modifier4, 0.0f, 0.0f, f2, f2, 3, null);
        if (!(resource instanceof j.a)) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
