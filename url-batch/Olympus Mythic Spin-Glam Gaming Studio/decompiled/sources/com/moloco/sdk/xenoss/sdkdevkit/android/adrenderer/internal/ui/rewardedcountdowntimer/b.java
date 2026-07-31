package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class b {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerCustomKt$RewardedCountDownTimerCustom$1$1", f = "RewardedCountDownTimerCustom.kt", l = {96, 104}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> e;
        public final /* synthetic */ Function0 f;
        public final /* synthetic */ MutableState<Integer> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, Animatable<Float, AnimationVector1D> animatable, Function0 function0, MutableState<Integer> mutableState, Continuation continuation) {
            super(2, continuation);
            this.c = i;
            this.d = i2;
            this.e = animatable;
            this.f = function0;
            this.g = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0083, code lost:
        
            if (r14.c != 0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00a2, code lost:
        
            r14.f.mo4828invoke();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
        
            if (r14.c != 0) goto L42;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ?? r1;
            ?? r12;
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int c = b.c(this.g);
                    r12 = this.c;
                    float a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a((int) r12, this.d);
                    try {
                        if (r12 < c) {
                            int coerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtLeast(c - r12, 0) * 1000, 0);
                            Animatable<Float, AnimationVector1D> animatable = this.e;
                            Float boxFloat = Boxing.boxFloat(a);
                            TweenSpec tween$default = AnimationSpecKt.tween$default(coerceAtLeast, 0, EasingKt.getLinearEasing(), 2, null);
                            this.a = r12;
                            this.b = 1;
                            if (Animatable.animateTo$default(animatable, boxFloat, tween$default, null, null, this, 12, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i = r12;
                            b.a(this.g, i);
                        } else {
                            Animatable<Float, AnimationVector1D> animatable2 = this.e;
                            Float boxFloat2 = Boxing.boxFloat(a);
                            this.a = r12;
                            this.b = 2;
                            if (animatable2.snapTo(boxFloat2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i = r12;
                            Unit unit = Unit.INSTANCE;
                            b.a(this.g, i);
                        }
                    } catch (CancellationException unused) {
                        b.a(this.g, (int) r12);
                    } catch (Throwable th) {
                        th = th;
                        r1 = r12;
                        b.a(this.g, (int) r1);
                        if (this.c == 0) {
                            this.f.mo4828invoke();
                        }
                        throw th;
                    }
                } else if (i2 == 1) {
                    i = this.a;
                    ResultKt.throwOnFailure(obj);
                    b.a(this.g, i);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.a;
                    ResultKt.throwOnFailure(obj);
                    Unit unit2 = Unit.INSTANCE;
                    b.a(this.g, i);
                }
            } catch (CancellationException unused2) {
                r12 = coroutine_suspended;
            } catch (Throwable th2) {
                th = th2;
                r1 = coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerCustomKt$RewardedCountDownTimerCustom$2$1", f = "RewardedCountDownTimerCustom.kt", l = {Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$b, reason: collision with other inner class name */
    public static final class C1624b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> b;
        public final /* synthetic */ MutableState<Boolean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1624b(Animatable<Float, AnimationVector1D> animatable, MutableState<Boolean> mutableState, Continuation continuation) {
            super(2, continuation);
            this.b = animatable;
            this.c = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1624b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C1624b(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!b.b(this.c)) {
                    Animatable<Float, AnimationVector1D> animatable = this.b;
                    this.a = 1;
                    if (animatable.stop(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final class c implements DisposableEffectResult {
        public final /* synthetic */ LifecycleOwner a;
        public final /* synthetic */ LifecycleEventObserver b;

        public c(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver) {
            this.a = lifecycleOwner;
            this.b = lifecycleEventObserver;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.a.getLifecycle().removeObserver(this.b);
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final Unit a(long j, long j2, Modifier modifier, float f, float f2, Function0 function0, String str, LifecycleOwner lifecycleOwner, int i, int i2, int i3, int i4, Composer composer, int i5) {
        a(j, j2, modifier, f, f2, function0, str, lifecycleOwner, i, i2, composer, i3 | 1, i4);
        return Unit.INSTANCE;
    }

    public static final int c(MutableState<Integer> mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0432  */
    @ComposableTarget
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final long j, final long j2, @Nullable Modifier modifier, float f, float f2, @NotNull final Function0 onTimerFinish, @NotNull final String customTimerString, @Nullable LifecycleOwner lifecycleOwner, final int i, final int i2, @Nullable Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        float m2507constructorimpl;
        float f3;
        Modifier modifier3;
        LifecycleOwner lifecycleOwner2;
        int i8;
        Object rememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        boolean changed;
        Object rememberedValue2;
        boolean changed2;
        int i9;
        Object rememberedValue3;
        Object rememberedValue4;
        UInt m8054boximpl;
        boolean changed3;
        Object rememberedValue5;
        UInt uInt;
        int i10;
        LifecycleOwner lifecycleOwner3;
        float f4;
        MutableState mutableState2;
        Composer composer2;
        int i11;
        float f5;
        boolean changed4;
        Object rememberedValue6;
        final LifecycleOwner lifecycleOwner4;
        boolean changed5;
        Object rememberedValue7;
        boolean changed6;
        Object rememberedValue8;
        float f6;
        boolean changed7;
        Object rememberedValue9;
        boolean changed8;
        Object rememberedValue10;
        boolean changed9;
        Object rememberedValue11;
        LifecycleOwner lifecycleOwner5;
        Composer composer3;
        float f7;
        int i12;
        final float f8;
        final Modifier modifier4;
        final float f9;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        Intrinsics.checkNotNullParameter(customTimerString, "customTimerString");
        Composer startRestartGroup = composer.startRestartGroup(1415937460);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changed(j) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        int i13 = i5;
        int i14 = i4 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i3 & 384) == 0) {
            modifier2 = modifier;
            i13 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i13 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i13 |= startRestartGroup.changed(f) ? 2048 : 1024;
                i7 = 16 & i4;
                if (i7 != 0) {
                    i13 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    i13 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                    if ((i4 & 32) == 0) {
                        i13 |= 196608;
                    } else if ((i3 & 196608) == 0) {
                        i13 |= startRestartGroup.changed(onTimerFinish) ? 131072 : 65536;
                    }
                    if ((i4 & 64) == 0) {
                        i13 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i13 |= startRestartGroup.changed(customTimerString) ? 1048576 : 524288;
                    }
                    if ((i3 & 12582912) == 0) {
                        i13 |= ((i4 & 128) == 0 && startRestartGroup.changed(lifecycleOwner)) ? 8388608 : 4194304;
                    }
                    if ((256 & i4) == 0) {
                        i13 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i13 |= startRestartGroup.changed(i) ? 67108864 : 33554432;
                    }
                    if ((i4 & 512) == 0) {
                        i13 |= C.ENCODING_PCM_32BIT;
                    } else if ((i3 & C.ENCODING_PCM_32BIT) == 0) {
                        i13 |= startRestartGroup.changed(i2) ? 536870912 : 268435456;
                    }
                    if ((306783379 & i13) == 306783378 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i14 == 0 ? Modifier.INSTANCE : modifier2;
                            m2507constructorimpl = i6 == 0 ? Dp.m2507constructorimpl(5) : f;
                            float m2507constructorimpl2 = i7 == 0 ? Dp.m2507constructorimpl(30) : f2;
                            if ((128 & i4) == 0) {
                                i13 &= -29360129;
                                modifier3 = modifier5;
                                lifecycleOwner2 = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                                f3 = m2507constructorimpl2;
                            } else {
                                f3 = m2507constructorimpl2;
                                modifier3 = modifier5;
                                lifecycleOwner2 = lifecycleOwner;
                            }
                            i8 = i13;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((128 & i4) != 0) {
                                i13 &= -29360129;
                            }
                            f3 = f2;
                            lifecycleOwner2 = lifecycleOwner;
                            i8 = i13;
                            modifier3 = modifier2;
                            m2507constructorimpl = f;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1415937460, i8, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerCustom (RewardedCountDownTimerCustom.kt:72)");
                        }
                        startRestartGroup.startReplaceableGroup(-1077278555);
                        rememberedValue = startRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (rememberedValue == companion.getEmpty()) {
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m2562boximpl(IntSize.INSTANCE.m2571getZeroYbymL2g()), null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        mutableState = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.startReplaceableGroup(-1077276327);
                        changed = startRestartGroup.changed(lifecycleOwner2);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue2 == companion.getEmpty()) {
                            MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                            startRestartGroup.updateRememberedValue(mutableStateOf$default);
                            rememberedValue2 = mutableStateOf$default;
                        }
                        final MutableState mutableState3 = (MutableState) rememberedValue2;
                        startRestartGroup.endReplaceableGroup();
                        Object[] objArr = new Object[0];
                        startRestartGroup.startReplaceableGroup(-1077272712);
                        changed2 = startRestartGroup.changed(i2);
                        i9 = i8;
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed2 || rememberedValue3 == companion.getEmpty()) {
                            rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                /* renamed from: invoke */
                                public final Object mo4828invoke() {
                                    return b.a(i2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceableGroup();
                        MutableState mutableState4 = (MutableState) RememberSaveableKt.rememberSaveable(objArr, null, null, (Function0) rememberedValue3, startRestartGroup, 0, 6);
                        startRestartGroup.startReplaceableGroup(-1077269958);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 != companion.getEmpty()) {
                            Animatable Animatable$default = AnimatableKt.Animatable$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(i2, i), 0.0f, 2, null);
                            startRestartGroup.updateRememberedValue(Animatable$default);
                            rememberedValue4 = Animatable$default;
                        }
                        final Animatable animatable = (Animatable) rememberedValue4;
                        startRestartGroup.endReplaceableGroup();
                        m8054boximpl = UInt.m8054boximpl(i2);
                        startRestartGroup.startReplaceableGroup(-1077264621);
                        changed3 = startRestartGroup.changed(mutableState4) | startRestartGroup.changed(i2) | startRestartGroup.changed(i) | startRestartGroup.changed(animatable) | startRestartGroup.changed(onTimerFinish);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changed3 || rememberedValue5 == companion.getEmpty()) {
                            uInt = m8054boximpl;
                            i10 = i9;
                            lifecycleOwner3 = lifecycleOwner2;
                            f4 = f3;
                            mutableState2 = mutableState;
                            composer2 = startRestartGroup;
                            i11 = -1323940314;
                            f5 = m2507constructorimpl;
                            rememberedValue5 = new a(i2, i, animatable, onTimerFinish, mutableState4, null);
                            composer2.updateRememberedValue(rememberedValue5);
                        } else {
                            mutableState2 = mutableState;
                            uInt = m8054boximpl;
                            lifecycleOwner3 = lifecycleOwner2;
                            f4 = f3;
                            composer2 = startRestartGroup;
                            f5 = m2507constructorimpl;
                            i10 = i9;
                            i11 = -1323940314;
                        }
                        composer2.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(uInt, (Function2) rememberedValue5, composer2, (i10 >> 27) & 14);
                        Boolean valueOf = Boolean.valueOf(b(mutableState3));
                        composer2.startReplaceableGroup(-1077230899);
                        changed4 = composer2.changed(mutableState3) | composer2.changed(animatable);
                        rememberedValue6 = composer2.rememberedValue();
                        if (!changed4 || rememberedValue6 == companion.getEmpty()) {
                            rememberedValue6 = new C1624b(animatable, mutableState3, null);
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        composer2.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(valueOf, (Function2) rememberedValue6, composer2, 0);
                        composer2.startReplaceableGroup(-1077226486);
                        lifecycleOwner4 = lifecycleOwner3;
                        changed5 = composer2.changed(mutableState3) | composer2.changed(animatable) | composer2.changed(lifecycleOwner4);
                        rememberedValue7 = composer2.rememberedValue();
                        if (!changed5 || rememberedValue7 == companion.getEmpty()) {
                            rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return b.a(LifecycleOwner.this, animatable, mutableState3, (DisposableEffectScope) obj);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue7);
                        }
                        composer2.endReplaceableGroup();
                        EffectsKt.DisposableEffect(lifecycleOwner4, (Function1) rememberedValue7, composer2, (i10 >> 21) & 14);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        Arrangement.HorizontalOrVertical m306spacedBy0680j_4 = Arrangement.INSTANCE.m306spacedBy0680j_4(Dp.m2507constructorimpl(8));
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m306spacedBy0680j_4, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(i11);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion3.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(modifier3);
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.useNode();
                        } else {
                            composer2.createNode(constructor);
                        }
                        composer2.disableReusing();
                        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                        Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion3.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-678309503);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        String a2 = com.moloco.sdk.internal.utils.b.a(customTimerString, i2);
                        long d2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                        int m2451getStarte0LSkKk = TextAlign.INSTANCE.m2451getStarte0LSkKk();
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        composer2.startReplaceableGroup(-447505287);
                        final String str = "custom_countdown_timer_text";
                        changed6 = composer2.changed("custom_countdown_timer_text");
                        rememberedValue8 = composer2.rememberedValue();
                        if (!changed6 || rememberedValue8 == companion.getEmpty()) {
                            rememberedValue8 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return b.a(str, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue8);
                        }
                        composer2.endReplaceableGroup();
                        TextKt.m1056TextfLXpl1I(a2, SemanticsModifierKt.semantics$default(companion4, false, (Function1) rememberedValue8, 1, null), j2, d2, null, null, null, 0L, null, TextAlign.m2439boximpl(m2451getStarte0LSkKk), 0L, 0, false, 2, null, null, composer2, ((i10 << 3) & 896) | 3072, 3072, 56816);
                        Alignment center = companion2.getCenter();
                        f6 = f4;
                        Modifier m334padding3ABfNKs = PaddingKt.m334padding3ABfNKs(SizeKt.m357size3ABfNKs(companion4, f6), Dp.m2507constructorimpl(2));
                        composer2.startReplaceableGroup(-447492116);
                        final MutableState mutableState5 = mutableState2;
                        changed7 = composer2.changed(mutableState5);
                        rememberedValue9 = composer2.rememberedValue();
                        if (!changed7 || rememberedValue9 == companion.getEmpty()) {
                            rememberedValue9 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return b.a(MutableState.this, (IntSize) obj);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue9);
                        }
                        composer2.endReplaceableGroup();
                        Modifier m157backgroundbw27NRU = BackgroundKt.m157backgroundbw27NRU(OnRemeasuredModifierKt.onSizeChanged(m334padding3ABfNKs, (Function1) rememberedValue9), Color.m1445copywmQWz5c$default(Color.INSTANCE.m1462getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                        composer2.startReplaceableGroup(-447486932);
                        final String str2 = "custom_timer_container";
                        changed8 = composer2.changed("custom_timer_container");
                        rememberedValue10 = composer2.rememberedValue();
                        if (!changed8 || rememberedValue10 == companion.getEmpty()) {
                            rememberedValue10 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return b.b(str2, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue10);
                        }
                        composer2.endReplaceableGroup();
                        Modifier semantics$default = SemanticsModifierKt.semantics$default(m157backgroundbw27NRU, false, (Function1) rememberedValue10, 1, null);
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        Function0 constructor2 = companion3.getConstructor();
                        Function3 materializerOf2 = LayoutKt.materializerOf(semantics$default);
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.useNode();
                        } else {
                            composer2.createNode(constructor2);
                        }
                        composer2.disableReusing();
                        Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer2);
                        Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl2, density2, companion3.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-2137368960);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                        composer2.startReplaceableGroup(-1178257690);
                        final float f10 = f5;
                        changed9 = composer2.changed(j) | composer2.changed(mutableState5) | composer2.changed(f10) | composer2.changed(animatable) | composer2.changed(j2);
                        rememberedValue11 = composer2.rememberedValue();
                        if (!changed9 || rememberedValue11 == companion.getEmpty()) {
                            lifecycleOwner5 = lifecycleOwner4;
                            composer3 = composer2;
                            f7 = f6;
                            i12 = 6;
                            Function1 function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return b.a(j, f10, animatable, j2, mutableState5, (DrawScope) obj);
                                }
                            };
                            composer3.updateRememberedValue(function1);
                            rememberedValue11 = function1;
                        } else {
                            composer3 = composer2;
                            lifecycleOwner5 = lifecycleOwner4;
                            f7 = f6;
                            i12 = 6;
                        }
                        composer3.endReplaceableGroup();
                        CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue11, composer3, i12);
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f8 = f10;
                        modifier4 = modifier3;
                        f9 = f7;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        f8 = f;
                        f9 = f2;
                        lifecycleOwner5 = lifecycleOwner;
                        composer3 = startRestartGroup;
                        modifier4 = modifier2;
                    }
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup == null) {
                        final LifecycleOwner lifecycleOwner6 = lifecycleOwner5;
                        endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return b.a(j, j2, modifier4, f8, f9, onTimerFinish, customTimerString, lifecycleOwner6, i, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i4 & 32) == 0) {
                }
                if ((i4 & 64) == 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if ((256 & i4) == 0) {
                }
                if ((i4 & 512) == 0) {
                }
                if ((306783379 & i13) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i14 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if ((128 & i4) == 0) {
                }
                i8 = i13;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-1077278555);
                rememberedValue = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                }
                mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(-1077276327);
                changed = startRestartGroup.changed(lifecycleOwner2);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                MutableState mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default2);
                rememberedValue2 = mutableStateOf$default2;
                final MutableState mutableState32 = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceableGroup();
                Object[] objArr2 = new Object[0];
                startRestartGroup.startReplaceableGroup(-1077272712);
                changed2 = startRestartGroup.changed(i2);
                i9 = i8;
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        return b.a(i2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState42 = (MutableState) RememberSaveableKt.rememberSaveable(objArr2, null, null, (Function0) rememberedValue3, startRestartGroup, 0, 6);
                startRestartGroup.startReplaceableGroup(-1077269958);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 != companion.getEmpty()) {
                }
                final Animatable animatable2 = (Animatable) rememberedValue4;
                startRestartGroup.endReplaceableGroup();
                m8054boximpl = UInt.m8054boximpl(i2);
                startRestartGroup.startReplaceableGroup(-1077264621);
                changed3 = startRestartGroup.changed(mutableState42) | startRestartGroup.changed(i2) | startRestartGroup.changed(i) | startRestartGroup.changed(animatable2) | startRestartGroup.changed(onTimerFinish);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (changed3) {
                }
                uInt = m8054boximpl;
                i10 = i9;
                lifecycleOwner3 = lifecycleOwner2;
                f4 = f3;
                mutableState2 = mutableState;
                composer2 = startRestartGroup;
                i11 = -1323940314;
                f5 = m2507constructorimpl;
                rememberedValue5 = new a(i2, i, animatable2, onTimerFinish, mutableState42, null);
                composer2.updateRememberedValue(rememberedValue5);
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(uInt, (Function2) rememberedValue5, composer2, (i10 >> 27) & 14);
                Boolean valueOf2 = Boolean.valueOf(b(mutableState32));
                composer2.startReplaceableGroup(-1077230899);
                changed4 = composer2.changed(mutableState32) | composer2.changed(animatable2);
                rememberedValue6 = composer2.rememberedValue();
                if (!changed4) {
                }
                rememberedValue6 = new C1624b(animatable2, mutableState32, null);
                composer2.updateRememberedValue(rememberedValue6);
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(valueOf2, (Function2) rememberedValue6, composer2, 0);
                composer2.startReplaceableGroup(-1077226486);
                lifecycleOwner4 = lifecycleOwner3;
                changed5 = composer2.changed(mutableState32) | composer2.changed(animatable2) | composer2.changed(lifecycleOwner4);
                rememberedValue7 = composer2.rememberedValue();
                if (!changed5) {
                }
                rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.a(LifecycleOwner.this, animatable2, mutableState32, (DisposableEffectScope) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue7);
                composer2.endReplaceableGroup();
                EffectsKt.DisposableEffect(lifecycleOwner4, (Function1) rememberedValue7, composer2, (i10 >> 21) & 14);
                Alignment.Companion companion22 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
                Arrangement.HorizontalOrVertical m306spacedBy0680j_42 = Arrangement.INSTANCE.m306spacedBy0680j_4(Dp.m2507constructorimpl(8));
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m306spacedBy0680j_42, centerVertically2, composer2, 54);
                composer2.startReplaceableGroup(i11);
                Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0 constructor3 = companion32.getConstructor();
                Function3 materializerOf3 = LayoutKt.materializerOf(modifier3);
                if (composer2.getApplier() == null) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                composer2.disableReusing();
                Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer2);
                Updater.m1153setimpl(m1149constructorimpl3, rowMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl3, density3, companion32.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion32.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion32.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-678309503);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                String a22 = com.moloco.sdk.internal.utils.b.a(customTimerString, i2);
                long d22 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                int m2451getStarte0LSkKk2 = TextAlign.INSTANCE.m2451getStarte0LSkKk();
                Modifier.Companion companion42 = Modifier.INSTANCE;
                composer2.startReplaceableGroup(-447505287);
                final String str3 = "custom_countdown_timer_text";
                changed6 = composer2.changed("custom_countdown_timer_text");
                rememberedValue8 = composer2.rememberedValue();
                if (!changed6) {
                }
                rememberedValue8 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.a(str3, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue8);
                composer2.endReplaceableGroup();
                TextKt.m1056TextfLXpl1I(a22, SemanticsModifierKt.semantics$default(companion42, false, (Function1) rememberedValue8, 1, null), j2, d22, null, null, null, 0L, null, TextAlign.m2439boximpl(m2451getStarte0LSkKk2), 0L, 0, false, 2, null, null, composer2, ((i10 << 3) & 896) | 3072, 3072, 56816);
                Alignment center2 = companion22.getCenter();
                f6 = f4;
                Modifier m334padding3ABfNKs2 = PaddingKt.m334padding3ABfNKs(SizeKt.m357size3ABfNKs(companion42, f6), Dp.m2507constructorimpl(2));
                composer2.startReplaceableGroup(-447492116);
                final MutableState mutableState52 = mutableState2;
                changed7 = composer2.changed(mutableState52);
                rememberedValue9 = composer2.rememberedValue();
                if (!changed7) {
                }
                rememberedValue9 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.a(MutableState.this, (IntSize) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue9);
                composer2.endReplaceableGroup();
                Modifier m157backgroundbw27NRU2 = BackgroundKt.m157backgroundbw27NRU(OnRemeasuredModifierKt.onSizeChanged(m334padding3ABfNKs2, (Function1) rememberedValue9), Color.m1445copywmQWz5c$default(Color.INSTANCE.m1462getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                composer2.startReplaceableGroup(-447486932);
                final String str22 = "custom_timer_container";
                changed8 = composer2.changed("custom_timer_container");
                rememberedValue10 = composer2.rememberedValue();
                if (!changed8) {
                }
                rememberedValue10 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.b(str22, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue10);
                composer2.endReplaceableGroup();
                Modifier semantics$default2 = SemanticsModifierKt.semantics$default(m157backgroundbw27NRU2, false, (Function1) rememberedValue10, 1, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                Density density22 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection22 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration22 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor22 = companion32.getConstructor();
                Function3 materializerOf22 = LayoutKt.materializerOf(semantics$default2);
                if (composer2.getApplier() == null) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                composer2.disableReusing();
                Composer m1149constructorimpl22 = Updater.m1149constructorimpl(composer2);
                Updater.m1153setimpl(m1149constructorimpl22, rememberBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl22, density22, companion32.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl22, layoutDirection22, companion32.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl22, viewConfiguration22, companion32.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf22.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion42, 0.0f, 1, null);
                composer2.startReplaceableGroup(-1178257690);
                final float f102 = f5;
                changed9 = composer2.changed(j) | composer2.changed(mutableState52) | composer2.changed(f102) | composer2.changed(animatable2) | composer2.changed(j2);
                rememberedValue11 = composer2.rememberedValue();
                if (changed9) {
                }
                lifecycleOwner5 = lifecycleOwner4;
                composer3 = composer2;
                f7 = f6;
                i12 = 6;
                Function1 function12 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.a(j, f102, animatable2, j2, mutableState52, (DrawScope) obj);
                    }
                };
                composer3.updateRememberedValue(function12);
                rememberedValue11 = function12;
                composer3.endReplaceableGroup();
                CanvasKt.Canvas(fillMaxSize$default2, (Function1) rememberedValue11, composer3, i12);
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                f8 = f102;
                modifier4 = modifier3;
                f9 = f7;
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = 16 & i4;
            if (i7 != 0) {
            }
            if ((i4 & 32) == 0) {
            }
            if ((i4 & 64) == 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if ((256 & i4) == 0) {
            }
            if ((i4 & 512) == 0) {
            }
            if ((306783379 & i13) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i14 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if ((128 & i4) == 0) {
            }
            i8 = i13;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-1077278555);
            rememberedValue = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1077276327);
            changed = startRestartGroup.changed(lifecycleOwner2);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            MutableState mutableStateOf$default22 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            startRestartGroup.updateRememberedValue(mutableStateOf$default22);
            rememberedValue2 = mutableStateOf$default22;
            final MutableState mutableState322 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceableGroup();
            Object[] objArr22 = new Object[0];
            startRestartGroup.startReplaceableGroup(-1077272712);
            changed2 = startRestartGroup.changed(i2);
            i9 = i8;
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return b.a(i2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState422 = (MutableState) RememberSaveableKt.rememberSaveable(objArr22, null, null, (Function0) rememberedValue3, startRestartGroup, 0, 6);
            startRestartGroup.startReplaceableGroup(-1077269958);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 != companion.getEmpty()) {
            }
            final Animatable animatable22 = (Animatable) rememberedValue4;
            startRestartGroup.endReplaceableGroup();
            m8054boximpl = UInt.m8054boximpl(i2);
            startRestartGroup.startReplaceableGroup(-1077264621);
            changed3 = startRestartGroup.changed(mutableState422) | startRestartGroup.changed(i2) | startRestartGroup.changed(i) | startRestartGroup.changed(animatable22) | startRestartGroup.changed(onTimerFinish);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed3) {
            }
            uInt = m8054boximpl;
            i10 = i9;
            lifecycleOwner3 = lifecycleOwner2;
            f4 = f3;
            mutableState2 = mutableState;
            composer2 = startRestartGroup;
            i11 = -1323940314;
            f5 = m2507constructorimpl;
            rememberedValue5 = new a(i2, i, animatable22, onTimerFinish, mutableState422, null);
            composer2.updateRememberedValue(rememberedValue5);
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(uInt, (Function2) rememberedValue5, composer2, (i10 >> 27) & 14);
            Boolean valueOf22 = Boolean.valueOf(b(mutableState322));
            composer2.startReplaceableGroup(-1077230899);
            changed4 = composer2.changed(mutableState322) | composer2.changed(animatable22);
            rememberedValue6 = composer2.rememberedValue();
            if (!changed4) {
            }
            rememberedValue6 = new C1624b(animatable22, mutableState322, null);
            composer2.updateRememberedValue(rememberedValue6);
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(valueOf22, (Function2) rememberedValue6, composer2, 0);
            composer2.startReplaceableGroup(-1077226486);
            lifecycleOwner4 = lifecycleOwner3;
            changed5 = composer2.changed(mutableState322) | composer2.changed(animatable22) | composer2.changed(lifecycleOwner4);
            rememberedValue7 = composer2.rememberedValue();
            if (!changed5) {
            }
            rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b.a(LifecycleOwner.this, animatable22, mutableState322, (DisposableEffectScope) obj);
                }
            };
            composer2.updateRememberedValue(rememberedValue7);
            composer2.endReplaceableGroup();
            EffectsKt.DisposableEffect(lifecycleOwner4, (Function1) rememberedValue7, composer2, (i10 >> 21) & 14);
            Alignment.Companion companion222 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically22 = companion222.getCenterVertically();
            Arrangement.HorizontalOrVertical m306spacedBy0680j_422 = Arrangement.INSTANCE.m306spacedBy0680j_4(Dp.m2507constructorimpl(8));
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m306spacedBy0680j_422, centerVertically22, composer2, 54);
            composer2.startReplaceableGroup(i11);
            Density density32 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection32 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration32 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion322 = ComposeUiNode.INSTANCE;
            Function0 constructor32 = companion322.getConstructor();
            Function3 materializerOf32 = LayoutKt.materializerOf(modifier3);
            if (composer2.getApplier() == null) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            composer2.disableReusing();
            Composer m1149constructorimpl32 = Updater.m1149constructorimpl(composer2);
            Updater.m1153setimpl(m1149constructorimpl32, rowMeasurePolicy22, companion322.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl32, density32, companion322.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl32, layoutDirection32, companion322.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl32, viewConfiguration32, companion322.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf32.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-678309503);
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            String a222 = com.moloco.sdk.internal.utils.b.a(customTimerString, i2);
            long d222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
            int m2451getStarte0LSkKk22 = TextAlign.INSTANCE.m2451getStarte0LSkKk();
            Modifier.Companion companion422 = Modifier.INSTANCE;
            composer2.startReplaceableGroup(-447505287);
            final String str32 = "custom_countdown_timer_text";
            changed6 = composer2.changed("custom_countdown_timer_text");
            rememberedValue8 = composer2.rememberedValue();
            if (!changed6) {
            }
            rememberedValue8 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b.a(str32, (SemanticsPropertyReceiver) obj);
                }
            };
            composer2.updateRememberedValue(rememberedValue8);
            composer2.endReplaceableGroup();
            TextKt.m1056TextfLXpl1I(a222, SemanticsModifierKt.semantics$default(companion422, false, (Function1) rememberedValue8, 1, null), j2, d222, null, null, null, 0L, null, TextAlign.m2439boximpl(m2451getStarte0LSkKk22), 0L, 0, false, 2, null, null, composer2, ((i10 << 3) & 896) | 3072, 3072, 56816);
            Alignment center22 = companion222.getCenter();
            f6 = f4;
            Modifier m334padding3ABfNKs22 = PaddingKt.m334padding3ABfNKs(SizeKt.m357size3ABfNKs(companion422, f6), Dp.m2507constructorimpl(2));
            composer2.startReplaceableGroup(-447492116);
            final MutableState mutableState522 = mutableState2;
            changed7 = composer2.changed(mutableState522);
            rememberedValue9 = composer2.rememberedValue();
            if (!changed7) {
            }
            rememberedValue9 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b.a(MutableState.this, (IntSize) obj);
                }
            };
            composer2.updateRememberedValue(rememberedValue9);
            composer2.endReplaceableGroup();
            Modifier m157backgroundbw27NRU22 = BackgroundKt.m157backgroundbw27NRU(OnRemeasuredModifierKt.onSizeChanged(m334padding3ABfNKs22, (Function1) rememberedValue9), Color.m1445copywmQWz5c$default(Color.INSTANCE.m1462getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            composer2.startReplaceableGroup(-447486932);
            final String str222 = "custom_timer_container";
            changed8 = composer2.changed("custom_timer_container");
            rememberedValue10 = composer2.rememberedValue();
            if (!changed8) {
            }
            rememberedValue10 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b.b(str222, (SemanticsPropertyReceiver) obj);
                }
            };
            composer2.updateRememberedValue(rememberedValue10);
            composer2.endReplaceableGroup();
            Modifier semantics$default22 = SemanticsModifierKt.semantics$default(m157backgroundbw27NRU22, false, (Function1) rememberedValue10, 1, null);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            Density density222 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection222 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration222 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor222 = companion322.getConstructor();
            Function3 materializerOf222 = LayoutKt.materializerOf(semantics$default22);
            if (composer2.getApplier() == null) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            composer2.disableReusing();
            Composer m1149constructorimpl222 = Updater.m1149constructorimpl(composer2);
            Updater.m1153setimpl(m1149constructorimpl222, rememberBoxMeasurePolicy22, companion322.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl222, density222, companion322.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl222, layoutDirection222, companion322.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl222, viewConfiguration222, companion322.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf222.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(companion422, 0.0f, 1, null);
            composer2.startReplaceableGroup(-1178257690);
            final float f1022 = f5;
            changed9 = composer2.changed(j) | composer2.changed(mutableState522) | composer2.changed(f1022) | composer2.changed(animatable22) | composer2.changed(j2);
            rememberedValue11 = composer2.rememberedValue();
            if (changed9) {
            }
            lifecycleOwner5 = lifecycleOwner4;
            composer3 = composer2;
            f7 = f6;
            i12 = 6;
            Function1 function122 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b.a(j, f1022, animatable22, j2, mutableState522, (DrawScope) obj);
                }
            };
            composer3.updateRememberedValue(function122);
            rememberedValue11 = function122;
            composer3.endReplaceableGroup();
            CanvasKt.Canvas(fillMaxSize$default22, (Function1) rememberedValue11, composer3, i12);
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            f8 = f1022;
            modifier4 = modifier3;
            f9 = f7;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = 16 & i4;
        if (i7 != 0) {
        }
        if ((i4 & 32) == 0) {
        }
        if ((i4 & 64) == 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if ((256 & i4) == 0) {
        }
        if ((i4 & 512) == 0) {
        }
        if ((306783379 & i13) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i14 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((128 & i4) == 0) {
        }
        i8 = i13;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-1077278555);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-1077276327);
        changed = startRestartGroup.changed(lifecycleOwner2);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        MutableState mutableStateOf$default222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        startRestartGroup.updateRememberedValue(mutableStateOf$default222);
        rememberedValue2 = mutableStateOf$default222;
        final MutableState mutableState3222 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        Object[] objArr222 = new Object[0];
        startRestartGroup.startReplaceableGroup(-1077272712);
        changed2 = startRestartGroup.changed(i2);
        i9 = i8;
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return b.a(i2);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState4222 = (MutableState) RememberSaveableKt.rememberSaveable(objArr222, null, null, (Function0) rememberedValue3, startRestartGroup, 0, 6);
        startRestartGroup.startReplaceableGroup(-1077269958);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 != companion.getEmpty()) {
        }
        final Animatable animatable222 = (Animatable) rememberedValue4;
        startRestartGroup.endReplaceableGroup();
        m8054boximpl = UInt.m8054boximpl(i2);
        startRestartGroup.startReplaceableGroup(-1077264621);
        changed3 = startRestartGroup.changed(mutableState4222) | startRestartGroup.changed(i2) | startRestartGroup.changed(i) | startRestartGroup.changed(animatable222) | startRestartGroup.changed(onTimerFinish);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (changed3) {
        }
        uInt = m8054boximpl;
        i10 = i9;
        lifecycleOwner3 = lifecycleOwner2;
        f4 = f3;
        mutableState2 = mutableState;
        composer2 = startRestartGroup;
        i11 = -1323940314;
        f5 = m2507constructorimpl;
        rememberedValue5 = new a(i2, i, animatable222, onTimerFinish, mutableState4222, null);
        composer2.updateRememberedValue(rememberedValue5);
        composer2.endReplaceableGroup();
        EffectsKt.LaunchedEffect(uInt, (Function2) rememberedValue5, composer2, (i10 >> 27) & 14);
        Boolean valueOf222 = Boolean.valueOf(b(mutableState3222));
        composer2.startReplaceableGroup(-1077230899);
        changed4 = composer2.changed(mutableState3222) | composer2.changed(animatable222);
        rememberedValue6 = composer2.rememberedValue();
        if (!changed4) {
        }
        rememberedValue6 = new C1624b(animatable222, mutableState3222, null);
        composer2.updateRememberedValue(rememberedValue6);
        composer2.endReplaceableGroup();
        EffectsKt.LaunchedEffect(valueOf222, (Function2) rememberedValue6, composer2, 0);
        composer2.startReplaceableGroup(-1077226486);
        lifecycleOwner4 = lifecycleOwner3;
        changed5 = composer2.changed(mutableState3222) | composer2.changed(animatable222) | composer2.changed(lifecycleOwner4);
        rememberedValue7 = composer2.rememberedValue();
        if (!changed5) {
        }
        rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.a(LifecycleOwner.this, animatable222, mutableState3222, (DisposableEffectScope) obj);
            }
        };
        composer2.updateRememberedValue(rememberedValue7);
        composer2.endReplaceableGroup();
        EffectsKt.DisposableEffect(lifecycleOwner4, (Function1) rememberedValue7, composer2, (i10 >> 21) & 14);
        Alignment.Companion companion2222 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically222 = companion2222.getCenterVertically();
        Arrangement.HorizontalOrVertical m306spacedBy0680j_4222 = Arrangement.INSTANCE.m306spacedBy0680j_4(Dp.m2507constructorimpl(8));
        composer2.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(m306spacedBy0680j_4222, centerVertically222, composer2, 54);
        composer2.startReplaceableGroup(i11);
        Density density322 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection322 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration322 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3222 = ComposeUiNode.INSTANCE;
        Function0 constructor322 = companion3222.getConstructor();
        Function3 materializerOf322 = LayoutKt.materializerOf(modifier3);
        if (composer2.getApplier() == null) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        composer2.disableReusing();
        Composer m1149constructorimpl322 = Updater.m1149constructorimpl(composer2);
        Updater.m1153setimpl(m1149constructorimpl322, rowMeasurePolicy222, companion3222.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl322, density322, companion3222.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl322, layoutDirection322, companion3222.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl322, viewConfiguration322, companion3222.getSetViewConfiguration());
        composer2.enableReusing();
        materializerOf322.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        composer2.startReplaceableGroup(-678309503);
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        String a2222 = com.moloco.sdk.internal.utils.b.a(customTimerString, i2);
        long d2222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
        int m2451getStarte0LSkKk222 = TextAlign.INSTANCE.m2451getStarte0LSkKk();
        Modifier.Companion companion4222 = Modifier.INSTANCE;
        composer2.startReplaceableGroup(-447505287);
        final String str322 = "custom_countdown_timer_text";
        changed6 = composer2.changed("custom_countdown_timer_text");
        rememberedValue8 = composer2.rememberedValue();
        if (!changed6) {
        }
        rememberedValue8 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.a(str322, (SemanticsPropertyReceiver) obj);
            }
        };
        composer2.updateRememberedValue(rememberedValue8);
        composer2.endReplaceableGroup();
        TextKt.m1056TextfLXpl1I(a2222, SemanticsModifierKt.semantics$default(companion4222, false, (Function1) rememberedValue8, 1, null), j2, d2222, null, null, null, 0L, null, TextAlign.m2439boximpl(m2451getStarte0LSkKk222), 0L, 0, false, 2, null, null, composer2, ((i10 << 3) & 896) | 3072, 3072, 56816);
        Alignment center222 = companion2222.getCenter();
        f6 = f4;
        Modifier m334padding3ABfNKs222 = PaddingKt.m334padding3ABfNKs(SizeKt.m357size3ABfNKs(companion4222, f6), Dp.m2507constructorimpl(2));
        composer2.startReplaceableGroup(-447492116);
        final MutableState mutableState5222 = mutableState2;
        changed7 = composer2.changed(mutableState5222);
        rememberedValue9 = composer2.rememberedValue();
        if (!changed7) {
        }
        rememberedValue9 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.a(MutableState.this, (IntSize) obj);
            }
        };
        composer2.updateRememberedValue(rememberedValue9);
        composer2.endReplaceableGroup();
        Modifier m157backgroundbw27NRU222 = BackgroundKt.m157backgroundbw27NRU(OnRemeasuredModifierKt.onSizeChanged(m334padding3ABfNKs222, (Function1) rememberedValue9), Color.m1445copywmQWz5c$default(Color.INSTANCE.m1462getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
        composer2.startReplaceableGroup(-447486932);
        final String str2222 = "custom_timer_container";
        changed8 = composer2.changed("custom_timer_container");
        rememberedValue10 = composer2.rememberedValue();
        if (!changed8) {
        }
        rememberedValue10 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.b(str2222, (SemanticsPropertyReceiver) obj);
            }
        };
        composer2.updateRememberedValue(rememberedValue10);
        composer2.endReplaceableGroup();
        Modifier semantics$default222 = SemanticsModifierKt.semantics$default(m157backgroundbw27NRU222, false, (Function1) rememberedValue10, 1, null);
        composer2.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, composer2, 6);
        composer2.startReplaceableGroup(-1323940314);
        Density density2222 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2222 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2222 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0 constructor2222 = companion3222.getConstructor();
        Function3 materializerOf2222 = LayoutKt.materializerOf(semantics$default222);
        if (composer2.getApplier() == null) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        composer2.disableReusing();
        Composer m1149constructorimpl2222 = Updater.m1149constructorimpl(composer2);
        Updater.m1153setimpl(m1149constructorimpl2222, rememberBoxMeasurePolicy222, companion3222.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl2222, density2222, companion3222.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl2222, layoutDirection2222, companion3222.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl2222, viewConfiguration2222, companion3222.getSetViewConfiguration());
        composer2.enableReusing();
        materializerOf2222.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        composer2.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(companion4222, 0.0f, 1, null);
        composer2.startReplaceableGroup(-1178257690);
        final float f10222 = f5;
        changed9 = composer2.changed(j) | composer2.changed(mutableState5222) | composer2.changed(f10222) | composer2.changed(animatable222) | composer2.changed(j2);
        rememberedValue11 = composer2.rememberedValue();
        if (changed9) {
        }
        lifecycleOwner5 = lifecycleOwner4;
        composer3 = composer2;
        f7 = f6;
        i12 = 6;
        Function1 function1222 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.a(j, f10222, animatable222, j2, mutableState5222, (DrawScope) obj);
            }
        };
        composer3.updateRememberedValue(function1222);
        rememberedValue11 = function1222;
        composer3.endReplaceableGroup();
        CanvasKt.Canvas(fillMaxSize$default222, (Function1) rememberedValue11, composer3, i12);
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        f8 = f10222;
        modifier4 = modifier3;
        f9 = f7;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final Unit b(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.INSTANCE;
    }

    public static final boolean b(MutableState<Boolean> mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void a(MutableState<IntSize> mutableState, long j) {
        mutableState.setValue(IntSize.m2562boximpl(j));
    }

    public static final void a(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void a(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    public static final MutableState a(int i) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
    }

    public static final DisposableEffectResult a(LifecycleOwner lifecycleOwner, final Animatable animatable, final MutableState mutableState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda7
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                b.a(Animatable.this, mutableState, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new c(lifecycleOwner, lifecycleEventObserver);
    }

    public static final void a(Animatable animatable, MutableState mutableState, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = d.a[event.ordinal()];
        if (i == 1) {
            a((MutableState<Boolean>) mutableState, false);
        } else if (i == 2 && ((Number) animatable.getValue()).floatValue() > 0.0f) {
            a((MutableState<Boolean>) mutableState, true);
        }
    }

    public static final Unit a(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.INSTANCE;
    }

    public static final Unit a(MutableState mutableState, IntSize intSize) {
        a((MutableState<IntSize>) mutableState, intSize.getPackedValue());
        return Unit.INSTANCE;
    }

    public static final Unit a(long j, float f, Animatable animatable, long j2, MutableState mutableState, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long Size = androidx.compose.ui.geometry.SizeKt.Size(IntSize.m2567getWidthimpl(a((MutableState<IntSize>) mutableState)), IntSize.m2566getHeightimpl(a((MutableState<IntSize>) mutableState)));
        float mo271toPx0680j_4 = Canvas.mo271toPx0680j_4(f);
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        DrawScope.m1693drawArcyD3GUKo$default(Canvas, j, 360.0f, 360.0f, false, 0L, Size, 0.0f, new Stroke(mo271toPx0680j_4, 0.0f, companion.m1595getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        if (((Number) animatable.getValue()).floatValue() > 0.0f) {
            DrawScope.m1693drawArcyD3GUKo$default(Canvas, j2, 270.0f, RangesKt.coerceAtLeast(((Number) animatable.getValue()).floatValue(), 0.0f) * (-360.0f), false, 0L, androidx.compose.ui.geometry.SizeKt.Size(IntSize.m2567getWidthimpl(a((MutableState<IntSize>) mutableState)), IntSize.m2566getHeightimpl(a((MutableState<IntSize>) mutableState))), 0.0f, new Stroke(Canvas.mo271toPx0680j_4(f), 0.0f, companion.m1595getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        }
        return Unit.INSTANCE;
    }

    public static final long a(MutableState<IntSize> mutableState) {
        return ((IntSize) mutableState.getValue()).getPackedValue();
    }
}
