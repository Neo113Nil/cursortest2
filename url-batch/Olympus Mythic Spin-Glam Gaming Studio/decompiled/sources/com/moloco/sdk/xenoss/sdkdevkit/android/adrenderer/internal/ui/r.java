package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.exoplayer2.C;
import com.ironsource.C4701ic;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5061j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5062k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5063l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5067p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5068q;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes14.dex */
public final class r {
    public static final long a = ColorKt.Color$default(71, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 238, 0, 8, null);
    public static final long b = Color.INSTANCE.m1462getWhite0d7_KjU();

    public static final class a implements Function3 {
        public final /* synthetic */ String a;
        public final /* synthetic */ Integer b;
        public final /* synthetic */ long c;

        public a(String str, Integer num, long j) {
            this.a = str;
            this.b = num;
            this.c = j;
        }

        @ComposableTarget
        @Composable
        public final void a(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-469621531, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.RotatingGradientButton.<anonymous> (DEC.kt:230)");
            }
            String str = this.a;
            if (str == null) {
                str = "";
            }
            Integer num = this.b;
            TextUnit m2573boximpl = num != null ? TextUnit.m2573boximpl(TextUnitKt.getSp(num.intValue())) : null;
            composer.startReplaceableGroup(-1245056940);
            long m2261getFontSizeXSAIIZE = m2573boximpl == null ? MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getButton().m2261getFontSizeXSAIIZE() : m2573boximpl.getPackedValue();
            composer.endReplaceableGroup();
            TextKt.m1056TextfLXpl1I(str, null, this.c, m2261getFontSizeXSAIIZE, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, TextOverflow.INSTANCE.m2474getEllipsisgIe3tQ8(), false, 1, null, null, composer, 196608, 3120, 55250);
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

    public static final Unit a(Modifier modifier, String str, Function0 function0, C5068q c5068q, int i, int i2, Composer composer, int i3) {
        a(modifier, str, function0, c5068q, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    public static final Unit a(int i, Composer composer, int i2) {
        a(composer, i | 1);
        return Unit.INSTANCE;
    }

    public static final Unit a(String str, Function0 function0, Integer num, Integer num2, List list, boolean z, long j, long j2, int i, boolean z2, int i2, int i3, Composer composer, int i4) {
        a(str, function0, num, num2, list, z, j, j2, i, z2, composer, i2 | 1, i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x02c0, code lost:
    
        if (r14 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02c3, code lost:
    
        if (r14 == null) goto L97;
     */
    @ComposableTarget
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@Nullable Modifier modifier, @Nullable final String str, @NotNull final Function0 onClick, @NotNull final C5068q decRenderingData, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composer2;
        Modifier.Companion companion;
        boolean z;
        Float f;
        int i4;
        float m2507constructorimpl;
        Modifier.Companion companion2;
        String str2;
        Composer composer3;
        final Modifier modifier4;
        Integer c;
        String h;
        String m;
        Integer n;
        String f2;
        String h2;
        Integer c2;
        List<String> d;
        Integer f3;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(decRenderingData, "decRenderingData");
        Composer startRestartGroup = composer.startRestartGroup(-264197625);
        int i5 = i2 & 1;
        int i6 = 2;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(decRenderingData) ? 2048 : 1024;
        }
        int i7 = i3;
        if ((i7 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            composer3 = startRestartGroup;
        } else {
            Modifier modifier5 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-264197625, i7, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.DEC (DEC.kt:58)");
            }
            Modifier modifier6 = modifier5;
            Modifier m172clickableXHw0xAI$default = ClickableKt.m172clickableXHw0xAI$default(SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), false, null, null, onClick, 7, null);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0 constructor = companion4.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(m172clickableXHw0xAI$default);
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl, density, companion4.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion4.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion4.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor2 = companion4.getConstructor();
            Function3 materializerOf2 = LayoutKt.materializerOf(fillMaxSize$default);
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl2, columnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl2, density2, companion4.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion4.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion4.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-1163856341);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            C5061j f4 = decRenderingData.f();
            float m2507constructorimpl2 = (f4 == null || (f3 = f4.f()) == null) ? Dp.m2507constructorimpl(128) : Dp.m2507constructorimpl(f3.intValue());
            C5061j f5 = decRenderingData.f();
            String d2 = f5 != null ? f5.d() : null;
            C5061j f6 = decRenderingData.f();
            C5062k e = f6 != null ? f6.e() : null;
            float m2507constructorimpl3 = Dp.m2507constructorimpl(28);
            Modifier zIndex = ZIndexModifierKt.zIndex(SizeKt.m357size3ABfNKs(companion5, m2507constructorimpl2), 1.0f);
            if (e != null && (d = e.d()) != null) {
                List listOf = !d.isEmpty() ? CollectionsKt.listOf((Object[]) new Color[]{Color.m1441boximpl(ColorKt.Color(android.graphics.Color.parseColor((String) CollectionsKt.first((List) d)))), Color.m1441boximpl(ColorKt.Color(android.graphics.Color.parseColor((String) CollectionsKt.last((List) d))))}) : null;
                if (listOf != null) {
                    Brush.Companion companion6 = Brush.INSTANCE;
                    Offset.Companion companion7 = Offset.INSTANCE;
                    modifier3 = BackgroundKt.background$default(companion5, Brush.Companion.m1426linearGradientmHitzGk$default(companion6, listOf, companion7.m1308getZeroF1C5BW0(), companion7.m1306getInfiniteF1C5BW0(), 0, 8, null), RoundedCornerShapeKt.m510RoundedCornerShape0680j_4(m2507constructorimpl3), 0.0f, 4, null);
                }
                modifier3 = companion5;
            }
            modifier3 = companion5;
            Modifier clip = ClipKt.clip(PaddingKt.m334padding3ABfNKs(zIndex.then(modifier3), (e == null || (c2 = e.c()) == null) ? Dp.m2507constructorimpl(4) : Dp.m2507constructorimpl(c2.intValue())), (e != null ? e.d() : null) != null ? RoundedCornerShapeKt.m510RoundedCornerShape0680j_4(m2507constructorimpl3) : RoundedCornerShapeKt.m510RoundedCornerShape0680j_4(Dp.m2507constructorimpl(0)));
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor3 = companion4.getConstructor();
            Function3 materializerOf3 = LayoutKt.materializerOf(clip);
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl3 = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl3, rememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl3, density3, companion4.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion4.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            k.a(d2, ContentScale.INSTANCE.getCrop(), SizeKt.m357size3ABfNKs(companion5, m2507constructorimpl2), startRestartGroup, 48);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1049067275);
            if (str != null) {
                SpacerKt.Spacer(SizeKt.m347height3ABfNKs(companion5, Dp.m2507constructorimpl(12)), startRestartGroup, 6);
                long m1462getWhite0d7_KjU = Color.INSTANCE.m1462getWhite0d7_KjU();
                Integer e2 = decRenderingData.e();
                TextUnit m2573boximpl = e2 != null ? TextUnit.m2573boximpl(TextUnitKt.getSp(e2.intValue())) : null;
                startRestartGroup.startReplaceableGroup(1049073645);
                long m2261getFontSizeXSAIIZE = m2573boximpl == null ? MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getButton().m2261getFontSizeXSAIIZE() : m2573boximpl.getPackedValue();
                startRestartGroup.endReplaceableGroup();
                z = true;
                composer2 = startRestartGroup;
                companion = companion5;
                f = null;
                TextKt.m1056TextfLXpl1I(str, null, m1462getWhite0d7_KjU, m2261getFontSizeXSAIIZE, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, TextOverflow.INSTANCE.m2474getEllipsisgIe3tQ8(), false, 2, null, null, composer2, ((i7 >> 3) & 14) | 196992, 3120, 55250);
            } else {
                composer2 = startRestartGroup;
                companion = companion5;
                z = true;
                f = null;
            }
            composer2.endReplaceableGroup();
            if (decRenderingData.h() != null) {
                m2507constructorimpl = Dp.m2507constructorimpl(r0.i());
                i4 = 12;
            } else {
                i4 = 12;
                m2507constructorimpl = Dp.m2507constructorimpl(12);
            }
            C5067p h3 = decRenderingData.h();
            long m1463getYellow0d7_KjU = (h3 == null || (h2 = h3.h()) == null) ? Color.INSTANCE.m1463getYellow0d7_KjU() : ColorKt.Color(android.graphics.Color.parseColor(h2));
            C5067p h4 = decRenderingData.h();
            long m1458getGray0d7_KjU = (h4 == null || (f2 = h4.f()) == null) ? Color.INSTANCE.m1458getGray0d7_KjU() : ColorKt.Color(android.graphics.Color.parseColor(f2));
            C5067p h5 = decRenderingData.h();
            int g = h5 != null ? h5.g() : 9;
            C5067p h6 = decRenderingData.h();
            Float j = h6 != null ? h6.j() : f;
            Composer composer4 = composer2;
            composer4.startReplaceableGroup(1049096610);
            if (j == null) {
                companion2 = companion;
            } else {
                float floatValue = j.floatValue();
                companion2 = companion;
                SpacerKt.Spacer(SizeKt.m347height3ABfNKs(companion2, Dp.m2507constructorimpl(i4)), composer4, 6);
                x.a(floatValue, 5, m2507constructorimpl, m1463getYellow0d7_KjU, m1458getGray0d7_KjU, g, null, composer4, 48, 64);
                Unit unit = Unit.INSTANCE;
            }
            composer4.endReplaceableGroup();
            C5063l g2 = decRenderingData.g();
            SpacerKt.Spacer(SizeKt.m347height3ABfNKs(companion2, (g2 == null || (n = g2.n()) == null) ? Dp.m2507constructorimpl(8) : Dp.m2507constructorimpl(n.intValue())), composer4, 0);
            C5063l g3 = decRenderingData.g();
            if (g3 == null || (str2 = g3.k()) == null) {
                str2 = C4701ic.a;
            }
            C5063l g4 = decRenderingData.g();
            Integer j2 = g4 != null ? g4.j() : f;
            C5063l g5 = decRenderingData.g();
            Integer l = g5 != null ? g5.l() : f;
            C5063l g6 = decRenderingData.g();
            C5062k i8 = g6 != null ? g6.i() : f;
            C5063l g7 = decRenderingData.g();
            long Color = (g7 == null || (m = g7.m()) == null) ? b : ColorKt.Color(android.graphics.Color.parseColor(m));
            C5063l g8 = decRenderingData.g();
            long Color2 = (g8 == null || (h = g8.h()) == null) ? a : ColorKt.Color(android.graphics.Color.parseColor(h));
            List<String> d3 = i8 != null ? i8.d() : f;
            boolean z2 = i8 != null ? z : false;
            if (i8 != null && (c = i8.c()) != null) {
                i6 = c.intValue();
            }
            composer3 = composer4;
            a(str2, onClick, j2, l, d3, z2, Color, Color2, i6, false, composer4, (i7 >> 3) & 112, 512);
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
            modifier4 = modifier6;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.a(Modifier.this, str, onClick, decRenderingData, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0292, code lost:
    
        if (r2 == null) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ee  */
    @ComposableTarget
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@Nullable final String str, @NotNull final Function0 onClick, @Nullable final Integer num, @Nullable final Integer num2, @Nullable final List<String> list, final boolean z, final long j, final long j2, final int i, boolean z2, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        State state;
        List listOf;
        Modifier modifier;
        Composer composer2;
        final boolean z4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1721864917);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(num) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(num2) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(list) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changed(j) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i4 |= startRestartGroup.changed(j2) ? 8388608 : 4194304;
            if ((i3 & 256) == 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i4 |= startRestartGroup.changed(i) ? 67108864 : 33554432;
            }
            i5 = i3 & 512;
            if (i5 == 0) {
                i4 |= C.ENCODING_PCM_32BIT;
            } else if ((i2 & C.ENCODING_PCM_32BIT) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
            }
            if ((306783379 & i4) != 306783378 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
                z4 = z2;
                composer2 = startRestartGroup;
            } else {
                z3 = i5 == 0 ? false : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1721864917, i4, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.RotatingGradientButton (DEC.kt:176)");
                }
                if (!z3) {
                    startRestartGroup.startReplaceableGroup(-1672286657);
                    state = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0), 0.0f, 360.0f, AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(4000, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(-1671934187);
                    startRestartGroup.startReplaceableGroup(2024277948);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    state = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                }
                double radians = Math.toRadians(a(state));
                int i6 = i4;
                long Offset = OffsetKt.Offset(((float) Math.cos(radians)) * 300.0f, ((float) Math.sin(radians)) * 300.0f);
                double d = radians + 3.141592653589793d;
                long Offset2 = OffsetKt.Offset(((float) Math.cos(d)) * 300.0f, ((float) Math.sin(d)) * 300.0f);
                if (list == null && !list.isEmpty()) {
                    listOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m1441boximpl(ColorKt.Color(android.graphics.Color.parseColor((String) CollectionsKt.first((List) list)))), Color.m1441boximpl(ColorKt.Color(android.graphics.Color.parseColor((String) CollectionsKt.last((List) list))))});
                } else {
                    long j3 = a;
                    listOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m1441boximpl(j3), Color.m1441boximpl(j3)});
                }
                Brush m1426linearGradientmHitzGk$default = Brush.Companion.m1426linearGradientmHitzGk$default(Brush.INSTANCE, listOf, Offset, Offset2, 0, 8, null);
                RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
                ButtonColors m756buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m756buttonColorsro_MJ88(j2, j, 0L, 0L, startRestartGroup, ((i6 >> 21) & 14) | ((i6 >> 15) & 112) | (ButtonDefaults.$stable << 12), 12);
                BorderStroke borderStroke = !z ? new BorderStroke(Dp.m2507constructorimpl(i), m1426linearGradientmHitzGk$default, null) : null;
                if (num != null) {
                    modifier = SizeKt.m359sizeVpY3zN4(Modifier.INSTANCE, Dp.m2507constructorimpl(num.intValue()), Dp.m2507constructorimpl(num.intValue() * 0.33f));
                }
                modifier = Modifier.INSTANCE;
                composer2 = startRestartGroup;
                ButtonKt.Button(onClick, modifier, false, null, null, circleShape, borderStroke, m756buttonColorsro_MJ88, null, ComposableLambdaKt.composableLambda(startRestartGroup, -469621531, true, new a(str, num2, j)), composer2, ((i6 >> 3) & 14) | C.ENCODING_PCM_32BIT, 284);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r.a(str, onClick, num, num2, list, z, j, j2, i, z4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        if ((i3 & 256) == 0) {
        }
        i5 = i3 & 512;
        if (i5 == 0) {
        }
        if ((306783379 & i4) != 306783378) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!z3) {
        }
        double radians2 = Math.toRadians(a(state));
        int i62 = i4;
        long Offset3 = OffsetKt.Offset(((float) Math.cos(radians2)) * 300.0f, ((float) Math.sin(radians2)) * 300.0f);
        double d2 = radians2 + 3.141592653589793d;
        long Offset22 = OffsetKt.Offset(((float) Math.cos(d2)) * 300.0f, ((float) Math.sin(d2)) * 300.0f);
        if (list == null) {
        }
        long j32 = a;
        listOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m1441boximpl(j32), Color.m1441boximpl(j32)});
        Brush m1426linearGradientmHitzGk$default2 = Brush.Companion.m1426linearGradientmHitzGk$default(Brush.INSTANCE, listOf, Offset3, Offset22, 0, 8, null);
        RoundedCornerShape circleShape2 = RoundedCornerShapeKt.getCircleShape();
        ButtonColors m756buttonColorsro_MJ882 = ButtonDefaults.INSTANCE.m756buttonColorsro_MJ88(j2, j, 0L, 0L, startRestartGroup, ((i62 >> 21) & 14) | ((i62 >> 15) & 112) | (ButtonDefaults.$stable << 12), 12);
        if (!z) {
        }
        if (num != null) {
        }
        modifier = Modifier.INSTANCE;
        composer2 = startRestartGroup;
        ButtonKt.Button(onClick, modifier, false, null, null, circleShape2, borderStroke, m756buttonColorsro_MJ882, null, ComposableLambdaKt.composableLambda(startRestartGroup, -469621531, true, new a(str, num2, j)), composer2, ((i62 >> 3) & 14) | C.ENCODING_PCM_32BIT, 284);
        if (ComposerKt.isTraceInProgress()) {
        }
        z4 = z3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @ComposableTarget
    @Composable
    public static final void a(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-227963495);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-227963495, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.DECPreview (DEC.kt:246)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, m.a.a(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.a(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final float a(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }
}
