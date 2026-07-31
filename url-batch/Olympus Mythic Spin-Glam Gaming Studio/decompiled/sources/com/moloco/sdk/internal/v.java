package com.moloco.sdk.internal;

import android.content.Context;
import androidx.annotation.ColorInt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.content.ContextCompat;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class v {
    public static final long a = ColorKt.Color(4278354171L);

    public static final class a implements Function7 {
        public final /* synthetic */ Alignment a;
        public final /* synthetic */ PaddingValues b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;

        /* renamed from: com.moloco.sdk.internal.v$a$a, reason: collision with other inner class name */
        public static final class C1561a implements Function3 {
            public final /* synthetic */ Function1 a;
            public final /* synthetic */ State<i.a> b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ long e;
            public final /* synthetic */ long f;
            public final /* synthetic */ Function0 g;

            /* renamed from: com.moloco.sdk.internal.v$a$a$a, reason: collision with other inner class name */
            public static final class C1562a implements Function3 {
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ Function0 e;

                public C1562a(String str, String str2, long j, long j2, Function0 function0) {
                    this.a = str;
                    this.b = str2;
                    this.c = j;
                    this.d = j2;
                    this.e = function0;
                }

                @ComposableTarget
                @Composable
                public final void a(Modifier it, Composer composer, int i) {
                    int i2;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i & 6) == 0) {
                        i2 = i | (composer.changed(it) ? 4 : 2);
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1938502477, i2, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous>.<anonymous> (MolocoVastCTA.kt:103)");
                    }
                    v.a(it, this.a, this.b, this.c, this.d, this.e, composer, i2 & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }
            }

            /* renamed from: com.moloco.sdk.internal.v$a$a$b */
            public static final class b implements Function3 {
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ Function0 e;

                public b(String str, String str2, long j, long j2, Function0 function0) {
                    this.a = str;
                    this.b = str2;
                    this.c = j;
                    this.d = j2;
                    this.e = function0;
                }

                @ComposableTarget
                @Composable
                public final void a(Modifier it, Composer composer, int i) {
                    int i2;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i & 6) == 0) {
                        i2 = i | (composer.changed(it) ? 4 : 2);
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-868048676, i2, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous>.<anonymous> (MolocoVastCTA.kt:118)");
                    }
                    v.a(it, this.a, this.b, this.c, this.d, this.e, composer, i2 & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C1561a(Function1 function1, State<? extends i.a> state, String str, String str2, long j, long j2, Function0 function0) {
                this.a = function1;
                this.b = state;
                this.c = str;
                this.d = str2;
                this.e = j;
                this.f = j2;
                this.g = function0;
            }

            @ComposableTarget
            @Composable
            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-657845797, i, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous> (MolocoVastCTA.kt:97)");
                }
                i.a b2 = a.b(this.b);
                if (b2 instanceof i.a.C1646a) {
                    composer.startReplaceableGroup(-387247913);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.B.a(null, a.AbstractC1677a.c.EnumC1679a.g, this.a, ComposableLambdaKt.composableLambda(composer, -1938502477, true, new C1562a(this.c, this.d, this.e, this.f, this.g)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.c) {
                    composer.startReplaceableGroup(-386686441);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.B.a(null, a.AbstractC1677a.c.EnumC1679a.g, this.a, ComposableLambdaKt.composableLambda(composer, -868048676, true, new b(this.c, this.d, this.e, this.f, this.g)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.b) {
                    composer.startReplaceableGroup(-386143662);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.d) {
                    composer.startReplaceableGroup(-386086126);
                    composer.endReplaceableGroup();
                } else {
                    if (b2 != null) {
                        composer.startReplaceableGroup(-843777307);
                        composer.endReplaceableGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceableGroup(-386051437);
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }
        }

        public a(Alignment alignment, PaddingValues paddingValues, String str, String str2, long j, long j2) {
            this.a = alignment;
            this.b = paddingValues;
            this.c = str;
            this.d = str2;
            this.e = j;
            this.f = j2;
        }

        public static final i.a b(State<? extends i.a> state) {
            return (i.a) state.getValue();
        }

        @Override // kotlin.jvm.functions.Function7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            a((BoxScope) obj, ((Boolean) obj2).booleanValue(), (StateFlow) obj3, (Function1) obj4, (Function0) obj5, (Composer) obj6, ((Number) obj7).intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget
        @Composable
        public final void a(BoxScope boxScope, boolean z, StateFlow currentAdPartFlow, Function1 onButtonRendered, Function0 onCTA, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(currentAdPartFlow, "currentAdPartFlow");
            Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            Intrinsics.checkNotNullParameter(onCTA, "onCTA");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-927135997, i, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous> (MolocoVastCTA.kt:79)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.a)), this.b), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -657845797, true, new C1561a(onButtonRendered, SnapshotStateKt.collectAsState(currentAdPartFlow, null, composer, (i >> 6) & 14, 1), this.c, this.d, this.e, this.f, onCTA)), composer, ((i >> 3) & 14) | 196608, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final Unit a(Modifier modifier, String str, String str2, long j, long j2, Function0 function0, int i, int i2, Composer composer, int i3) {
        a(modifier, str, str2, j, j2, function0, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    @Composable
    @NotNull
    public static final Function7 a(@Nullable Alignment alignment, @Nullable PaddingValues paddingValues, @Nullable String str, long j, long j2, @Nullable String str2, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(959702933);
        Alignment bottomEnd = (i2 & 1) != 0 ? Alignment.INSTANCE.getBottomEnd() : alignment;
        PaddingValues m329PaddingValues0680j_4 = (i2 & 2) != 0 ? PaddingKt.m329PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        String stringResource = (i2 & 4) != 0 ? StringResources_androidKt.stringResource(R.string.com_moloco_sdk_xenoss_player_learn_more, composer, 0) : str;
        long m1462getWhite0d7_KjU = (i2 & 8) != 0 ? Color.INSTANCE.m1462getWhite0d7_KjU() : j;
        long j3 = (i2 & 16) != 0 ? a : j2;
        String str3 = (i2 & 32) != 0 ? null : str2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(959702933, i, -1, "com.moloco.sdk.internal.molocoCTAButton (MolocoVastCTA.kt:78)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -927135997, true, new a(bottomEnd, m329PaddingValues0680j_4, str3, stringResource, m1462getWhite0d7_KjU, j3));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0054  */
    @ComposableTarget
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Modifier modifier, String str, final String str2, final long j, final long j2, final Function0 function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str3;
        String str4;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(2035340272);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str3 = str;
            i3 |= startRestartGroup.changed(str3) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(str2) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(j) ? 2048 : 1024;
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changed(j2) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= startRestartGroup.changed(function0) ? 131072 : 65536;
                    }
                    if ((74899 & i3) != 74898 && startRestartGroup.getSkipping()) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                    } else {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        str4 = i5 == 0 ? null : str3;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2035340272, i3, -1, "com.moloco.sdk.internal.MolocoVastCTA (MolocoVastCTA.kt:144)");
                        }
                        float f = 4;
                        RoundedCornerShape m510RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m510RoundedCornerShape0680j_4(Dp.m2507constructorimpl(f));
                        Modifier m172clickableXHw0xAI$default = ClickableKt.m172clickableXHw0xAI$default(AnimationModifierKt.animateContentSize$default(BackgroundKt.m158backgroundbw27NRU$default(ClipKt.clip(SizeKt.m364widthInVpY3zN4$default(modifier4, 0.0f, Dp.m2507constructorimpl(164), 1, null), m510RoundedCornerShape0680j_4), j2, null, 2, null), null, null, 3, null), false, "CTA", Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), function0, 1, null);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        startRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(m172clickableXHw0xAI$default);
                        if (startRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        startRestartGroup.disableReusing();
                        Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
                        Modifier modifier5 = modifier4;
                        Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                        startRestartGroup.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        startRestartGroup.startReplaceableGroup(-678309503);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceableGroup(-118836883);
                        if (str4 != null) {
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion2, Dp.m2507constructorimpl(f)), startRestartGroup, 6);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k.a(str4, ContentScale.INSTANCE.getFit(), ClipKt.clip(SizeKt.m357size3ABfNKs(companion2, Dp.m2507constructorimpl(36)), m510RoundedCornerShape0680j_4), startRestartGroup, ((i3 >> 3) & 14) | 48);
                        }
                        startRestartGroup.endReplaceableGroup();
                        TextKt.m1056TextfLXpl1I(str2, PaddingKt.m335paddingVpY3zN4(Modifier.INSTANCE, Dp.m2507constructorimpl(15), Dp.m2507constructorimpl(12)), j, 0L, null, FontWeight.INSTANCE.getBold(), FontFamily.INSTANCE.getDefault(), 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, ((i3 >> 6) & 14) | 196656 | ((i3 >> 3) & 896), 3072, 57240);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        str3 = str4;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final String str5 = str3;
                        endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.internal.v$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return v.a(Modifier.this, str5, str2, j, j2, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((74899 & i3) != 74898) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                float f2 = 4;
                RoundedCornerShape m510RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m510RoundedCornerShape0680j_4(Dp.m2507constructorimpl(f2));
                Modifier m172clickableXHw0xAI$default2 = ClickableKt.m172clickableXHw0xAI$default(AnimationModifierKt.animateContentSize$default(BackgroundKt.m158backgroundbw27NRU$default(ClipKt.clip(SizeKt.m364widthInVpY3zN4$default(modifier4, 0.0f, Dp.m2507constructorimpl(164), 1, null), m510RoundedCornerShape0680j_42), j2, null, 2, null), null, null, 3, null), false, "CTA", Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), function0, 1, null);
                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                startRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, startRestartGroup, 54);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0 constructor2 = companion3.getConstructor();
                Function3 materializerOf2 = LayoutKt.materializerOf(m172clickableXHw0xAI$default2);
                if (startRestartGroup.getApplier() == null) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
                Modifier modifier52 = modifier4;
                Updater.m1153setimpl(m1149constructorimpl2, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl2, density2, companion3.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-678309503);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-118836883);
                if (str4 != null) {
                }
                startRestartGroup.endReplaceableGroup();
                TextKt.m1056TextfLXpl1I(str2, PaddingKt.m335paddingVpY3zN4(Modifier.INSTANCE, Dp.m2507constructorimpl(15), Dp.m2507constructorimpl(12)), j, 0L, null, FontWeight.INSTANCE.getBold(), FontFamily.INSTANCE.getDefault(), 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, ((i3 >> 6) & 14) | 196656 | ((i3 >> 3) & 896), 3072, 57240);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                str3 = str4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((74899 & i3) != 74898) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float f22 = 4;
            RoundedCornerShape m510RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m510RoundedCornerShape0680j_4(Dp.m2507constructorimpl(f22));
            Modifier m172clickableXHw0xAI$default22 = ClickableKt.m172clickableXHw0xAI$default(AnimationModifierKt.animateContentSize$default(BackgroundKt.m158backgroundbw27NRU$default(ClipKt.clip(SizeKt.m364widthInVpY3zN4$default(modifier4, 0.0f, Dp.m2507constructorimpl(164), 1, null), m510RoundedCornerShape0680j_422), j2, null, 2, null), null, null, 3, null), false, "CTA", Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), function0, 1, null);
            Arrangement.HorizontalOrVertical center22 = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(center22, centerVertically22, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration22 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0 constructor22 = companion32.getConstructor();
            Function3 materializerOf22 = LayoutKt.materializerOf(m172clickableXHw0xAI$default22);
            if (startRestartGroup.getApplier() == null) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl22 = Updater.m1149constructorimpl(startRestartGroup);
            Modifier modifier522 = modifier4;
            Updater.m1153setimpl(m1149constructorimpl22, rowMeasurePolicy22, companion32.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl22, density22, companion32.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl22, layoutDirection22, companion32.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl22, viewConfiguration22, companion32.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf22.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-678309503);
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-118836883);
            if (str4 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            TextKt.m1056TextfLXpl1I(str2, PaddingKt.m335paddingVpY3zN4(Modifier.INSTANCE, Dp.m2507constructorimpl(15), Dp.m2507constructorimpl(12)), j, 0L, null, FontWeight.INSTANCE.getBold(), FontFamily.INSTANCE.getDefault(), 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, ((i3 >> 6) & 14) | 196656 | ((i3 >> 3) & 896), 3072, 57240);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier522;
            str3 = str4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        str3 = str;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) != 74898) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        float f222 = 4;
        RoundedCornerShape m510RoundedCornerShape0680j_4222 = RoundedCornerShapeKt.m510RoundedCornerShape0680j_4(Dp.m2507constructorimpl(f222));
        Modifier m172clickableXHw0xAI$default222 = ClickableKt.m172clickableXHw0xAI$default(AnimationModifierKt.animateContentSize$default(BackgroundKt.m158backgroundbw27NRU$default(ClipKt.clip(SizeKt.m364widthInVpY3zN4$default(modifier4, 0.0f, Dp.m2507constructorimpl(164), 1, null), m510RoundedCornerShape0680j_4222), j2, null, 2, null), null, null, 3, null), false, "CTA", Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), function0, 1, null);
        Arrangement.HorizontalOrVertical center222 = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(center222, centerVertically222, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion322 = ComposeUiNode.INSTANCE;
        Function0 constructor222 = companion322.getConstructor();
        Function3 materializerOf222 = LayoutKt.materializerOf(m172clickableXHw0xAI$default222);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl222 = Updater.m1149constructorimpl(startRestartGroup);
        Modifier modifier5222 = modifier4;
        Updater.m1153setimpl(m1149constructorimpl222, rowMeasurePolicy222, companion322.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl222, density222, companion322.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl222, layoutDirection222, companion322.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl222, viewConfiguration222, companion322.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf222.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-678309503);
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-118836883);
        if (str4 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        TextKt.m1056TextfLXpl1I(str2, PaddingKt.m335paddingVpY3zN4(Modifier.INSTANCE, Dp.m2507constructorimpl(15), Dp.m2507constructorimpl(12)), j, 0L, null, FontWeight.INSTANCE.getBold(), FontFamily.INSTANCE.getDefault(), 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, ((i3 >> 6) & 14) | 196656 | ((i3 >> 3) & 896), 3072, 57240);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier5222;
        str3 = str4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final long a() {
        return a;
    }

    @NotNull
    public static final Function1 a(@NotNull final Flow ctaAvailable, @NotNull final StateFlow currentAdPart, @NotNull final Function1 onButtonRendered, @NotNull final Function0 onCTA, final int i, @Nullable final Integer num, @Nullable final String str, @ColorInt @Nullable final Integer num2, @ColorInt @Nullable final Integer num3, @Nullable final String str2) {
        Intrinsics.checkNotNullParameter(ctaAvailable, "ctaAvailable");
        Intrinsics.checkNotNullParameter(currentAdPart, "currentAdPart");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(onCTA, "onCTA");
        return new Function1() { // from class: com.moloco.sdk.internal.v$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.a(str, num, num2, num3, i, str2, ctaAvailable, currentAdPart, onButtonRendered, onCTA, (Context) obj);
            }
        };
    }

    public static final s a(String str, Integer num, Integer num2, Integer num3, int i, String str2, Flow flow, StateFlow stateFlow, Function1 function1, Function0 function0, Context context) {
        String str3;
        int dimensionPixelSize;
        int color;
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null) {
            String string = context.getString(R.string.com_moloco_sdk_xenoss_player_learn_more);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            str3 = string;
        } else {
            str3 = str;
        }
        if (num != null) {
            dimensionPixelSize = num.intValue();
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.moloco_default_ad_button_padding);
        }
        int i2 = dimensionPixelSize;
        int intValue = num2 != null ? num2.intValue() : -1;
        if (num3 != null) {
            color = num3.intValue();
        } else {
            color = ContextCompat.getColor(context, R.color.moloco_cta_background_blue);
        }
        return new s(context, i, i2, str3, intValue, color, str2, flow, stateFlow, function1, function0);
    }
}
