package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import com.google.android.exoplayer2.C;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes14.dex */
public final class p {

    public static final class a implements Function3 {
        public final /* synthetic */ Function0 a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p$a$a, reason: collision with other inner class name */
        public static final class C1623a implements Function3 {
            public final /* synthetic */ q a;
            public final /* synthetic */ long b;
            public final /* synthetic */ TextStyle c;

            public C1623a(q qVar, long j, TextStyle textStyle) {
                this.a = qVar;
                this.b = j;
                this.c = textStyle;
            }

            @ComposableTarget
            @Composable
            public final void a(RowScope TextButton, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(412998526, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton.<anonymous>.<anonymous>.<anonymous> (CountdownButton.kt:87)");
                }
                TextKt.m1056TextfLXpl1I(((q.c) this.a).a(), null, 0L, this.b, null, null, null, 0L, null, TextAlign.m2439boximpl(TextAlign.INSTANCE.m2446getCentere0LSkKk()), 0L, 0, false, 1, null, this.c, composer, 0, 3072, 24054);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }
        }

        public a(Function0 function0, boolean z, long j, long j2, long j3) {
            this.a = function0;
            this.b = z;
            this.c = j;
            this.d = j2;
            this.e = j3;
        }

        @ComposableTarget
        @Composable
        public final void a(q buttonPart, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(buttonPart, "buttonPart");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(buttonPart) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2052010049, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton.<anonymous>.<anonymous> (CountdownButton.kt:59)");
            }
            TextStyle h6 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH6();
            if (buttonPart instanceof q.a) {
                composer.startReplaceableGroup(1000266506);
                composer.endReplaceableGroup();
            } else if (buttonPart instanceof q.b) {
                composer.startReplaceableGroup(1000608622);
                q.b bVar = (q.b) buttonPart;
                u.a(bVar.e(), this.a, null, this.b, bVar.c(), this.c, this.d, bVar.d(), bVar.b(), bVar.a(), composer, 0, 4);
                composer.endReplaceableGroup();
            } else if (buttonPart instanceof q.c) {
                composer.startReplaceableGroup(-1491723097);
                Function0 function0 = this.a;
                boolean z = this.b;
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                long j = this.c;
                ButtonKt.TextButton(function0, null, z, null, null, null, null, buttonDefaults.m761textButtonColorsRGew2ao(0L, j, j, composer, ButtonDefaults.$stable << 9, 1), null, ComposableLambdaKt.composableLambda(composer, 412998526, true, new C1623a(buttonPart, this.e, h6)), composer, C.ENCODING_PCM_32BIT, 378);
                composer.endReplaceableGroup();
            } else {
                if (!(buttonPart instanceof q.d)) {
                    composer.startReplaceableGroup(-1491754012);
                    composer.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceableGroup(1001871283);
                q.d dVar = (q.d) buttonPart;
                long d = TextUnit.m2576equalsimpl0(dVar.d(), TextUnit.INSTANCE.m2583getUnspecifiedXSAIIZE()) ? this.e : dVar.d();
                z.a(dVar.h(), dVar.g(), dVar.c(), dVar.f(), dVar.b(), dVar.a(), DpKt.m2517DpSizeYgX7TsA(Dp.m2507constructorimpl(120), Dp.m2507constructorimpl(20)), dVar.e(), dVar.i(), dVar.j(), d, this.a, composer, 1572864, 0, 0);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((q) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }
    }

    public static final Unit a(q qVar, Modifier modifier, Function0 function0, boolean z, long j, long j2, long j3, com.moloco.sdk.internal.ortb.model.k kVar, Function0 function02, int i, int i2, Composer composer, int i3) {
        a(qVar, modifier, function0, z, j, j2, j3, kVar, function02, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00fd  */
    @ComposableTarget
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull final q countdownButtonPart, @Nullable Modifier modifier, @NotNull final Function0 onClick, final boolean z, long j, long j2, long j3, @Nullable final com.moloco.sdk.internal.ortb.model.k kVar, @NotNull final Function0 onTimerFinish, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        long j4;
        int i6;
        long j5;
        Modifier modifier3;
        int i7;
        long d;
        long j6;
        Composer composer2;
        final Modifier modifier4;
        final long j7;
        final long j8;
        q.a aVar;
        Intrinsics.checkNotNullParameter(countdownButtonPart, "countdownButtonPart");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        Composer startRestartGroup = composer.startRestartGroup(1730954989);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (startRestartGroup.changed(countdownButtonPart) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i8 = 2 & i2;
        if (i8 != 0) {
            i3 |= 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            }
        }
        int i9 = i3;
        if ((4 & i2) != 0) {
            i9 |= 384;
        } else if ((i & 384) == 0) {
            i9 |= startRestartGroup.changed(onClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i9 |= 3072;
        } else if ((i & 3072) == 0) {
            i9 |= startRestartGroup.changed(z) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i9 |= ((i2 & 16) == 0 && startRestartGroup.changed(j)) ? 16384 : 8192;
            }
            i4 = 32 & i2;
            if (i4 == 0) {
                i5 = i9 | 196608;
                j4 = j2;
            } else {
                i5 = i9;
                j4 = j2;
                if ((i & 196608) == 0) {
                    i5 |= startRestartGroup.changed(j4) ? 131072 : 65536;
                }
            }
            i6 = i2 & 64;
            if (i6 == 0) {
                i5 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i5 |= startRestartGroup.changed(j3) ? 1048576 : 524288;
            }
            if ((128 & i2) == 0) {
                i5 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i5 |= startRestartGroup.changed(kVar) ? 8388608 : 4194304;
            }
            if ((256 & i2) == 0) {
                i5 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i5 |= startRestartGroup.changed(onTimerFinish) ? 67108864 : 33554432;
            }
            if ((i5 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((16 & i2) == 0) {
                        j5 = MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m796getPrimary0d7_KjU();
                        i5 &= -57345;
                    } else {
                        j5 = j;
                    }
                    if (i4 != 0) {
                        j4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b();
                    }
                    if (i6 == 0) {
                        modifier3 = modifier5;
                        i7 = i5;
                        d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                        j6 = j4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1730954989, i7, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton (CountdownButton.kt:38)");
                        }
                        Modifier m358size6HolHcs = SizeKt.m358size6HolHcs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), j6);
                        Alignment topEnd = Alignment.INSTANCE.getTopEnd();
                        startRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topEnd, false, startRestartGroup, 6);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(m358size6HolHcs);
                        if (startRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.useNode();
                        } else {
                            startRestartGroup.createNode(constructor);
                        }
                        startRestartGroup.disableReusing();
                        Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
                        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                        startRestartGroup.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        startRestartGroup.startReplaceableGroup(-2137368960);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceableGroup(523924163);
                        if ((countdownButtonPart instanceof q.a) && kVar != null) {
                            aVar = (q.a) countdownButtonPart;
                            if (aVar.b()) {
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(kVar, aVar.c(), aVar.a(), onTimerFinish, startRestartGroup, ((i7 >> 21) & 14) | ((i7 >> 15) & 7168));
                            }
                        }
                        startRestartGroup.endReplaceableGroup();
                        int i10 = i7;
                        j4 = j6;
                        composer2 = startRestartGroup;
                        CrossfadeKt.Crossfade(countdownButtonPart, modifier3, null, ComposableLambdaKt.composableLambda(startRestartGroup, 2052010049, true, new a(onClick, z, j5, j6, d)), startRestartGroup, (i10 & 112) | (i10 & 14) | 3072, 4);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        j7 = d;
                        j8 = j5;
                    } else {
                        modifier3 = modifier5;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((16 & i2) != 0) {
                        i5 &= -57345;
                    }
                    j5 = j;
                    modifier3 = modifier2;
                }
                j6 = j4;
                i7 = i5;
                d = j3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier m358size6HolHcs2 = SizeKt.m358size6HolHcs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), j6);
                Alignment topEnd2 = Alignment.INSTANCE.getTopEnd();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(topEnd2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 constructor2 = companion2.getConstructor();
                Function3 materializerOf2 = LayoutKt.materializerOf(m358size6HolHcs2);
                if (startRestartGroup.getApplier() == null) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
                Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(523924163);
                if (countdownButtonPart instanceof q.a) {
                    aVar = (q.a) countdownButtonPart;
                    if (aVar.b()) {
                    }
                }
                startRestartGroup.endReplaceableGroup();
                int i102 = i7;
                j4 = j6;
                composer2 = startRestartGroup;
                CrossfadeKt.Crossfade(countdownButtonPart, modifier3, null, ComposableLambdaKt.composableLambda(startRestartGroup, 2052010049, true, new a(onClick, z, j5, j6, d)), startRestartGroup, (i102 & 112) | (i102 & 14) | 3072, 4);
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                j7 = d;
                j8 = j5;
            } else {
                startRestartGroup.skipToGroupEnd();
                j8 = j;
                j7 = j3;
                modifier4 = modifier2;
                composer2 = startRestartGroup;
            }
            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                final long j9 = j4;
                endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return p.a(q.this, modifier4, onClick, z, j8, j9, j7, kVar, onTimerFinish, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        if ((i & 24576) == 0) {
        }
        i4 = 32 & i2;
        if (i4 == 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((128 & i2) == 0) {
        }
        if ((256 & i2) == 0) {
        }
        if ((i5 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if ((16 & i2) == 0) {
        }
        if (i4 != 0) {
        }
        if (i6 == 0) {
        }
    }
}
