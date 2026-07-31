package com.moloco.sdk.internal;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.content.ContextCompat;
import com.moloco.sdk.R;
import com.moloco.sdk.internal.ortb.model.C5019a;
import com.moloco.sdk.internal.ortb.model.C5020b;
import com.moloco.sdk.internal.ortb.model.C5021c;
import com.moloco.sdk.internal.ortb.model.E;
import com.moloco.sdk.internal.ortb.model.F;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UInt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5017d {

    @NotNull
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.d$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return C5017d.d();
        }
    });
    public static final long b = Color.INSTANCE.m1462getWhite0d7_KjU();
    public static final long c = v.a();
    public static final int d = 30;
    public static final long e;
    public static final float f = 0.6f;

    /* renamed from: com.moloco.sdk.internal.d$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.moloco.sdk.internal.ortb.model.u.values().length];
            try {
                iArr[com.moloco.sdk.internal.ortb.model.u.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.internal.ortb.model.u.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.internal.ortb.model.u.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.moloco.sdk.internal.ortb.model.u.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.moloco.sdk.internal.ortb.model.u.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
            int[] iArr2 = new int[F.values().length];
            try {
                iArr2[F.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[F.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[F.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$b */
    public static final class b implements Function2 {
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.D a;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.v b;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k c;

        public b(com.moloco.sdk.internal.ortb.model.D d, com.moloco.sdk.internal.ortb.model.v vVar, com.moloco.sdk.internal.ortb.model.k kVar) {
            this.a = d;
            this.b = vVar;
            this.c = kVar;
        }

        @Composable
        public final Function11 a(Composer composer, int i) {
            Color foregroundColor;
            composer.startReplaceableGroup(-1625076729);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1625076729, i, -1, "com.moloco.sdk.internal.determineSkipCloseBehaviorFromDec.<anonymous> (AggregatedOptions.kt:247)");
            }
            float m2507constructorimpl = Dp.m2507constructorimpl(this.a.getControlSize());
            long m2517DpSizeYgX7TsA = DpKt.m2517DpSizeYgX7TsA(m2507constructorimpl, m2507constructorimpl);
            com.moloco.sdk.internal.ortb.model.v vVar = this.b;
            long foregroundColor2 = (vVar == null || (foregroundColor = vVar.getForegroundColor()) == null) ? this.a.getForegroundColor() : foregroundColor.getValue();
            Alignment a = C5017d.a(this.a.getHorizontalAlignment(), this.a.getVerticalAlignment());
            PaddingValues m329PaddingValues0680j_4 = PaddingKt.m329PaddingValues0680j_4(Dp.m2507constructorimpl(this.a.getIo.bidmachine.iab.vast.tags.VastAttributes.PADDING java.lang.String()));
            long sp = TextUnitKt.getSp(this.a.getControlSize());
            TextUnitKt.m2585checkArithmeticR2X_6o(sp);
            long pack = TextUnitKt.pack(TextUnit.m2577getRawTypeimpl(sp), TextUnit.m2579getValueimpl(sp) / 2);
            long m2540timesGh9hcWk = DpSize.m2540timesGh9hcWk(m2517DpSizeYgX7TsA, 0.4f);
            Color backgroundColor = this.a.getBackgroundColor();
            Function11 a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(a, m329PaddingValues0680j_4, foregroundColor2, m2517DpSizeYgX7TsA, pack, C5017d.b(m2540timesGh9hcWk, backgroundColor != null ? backgroundColor.getValue() : C5017d.b, foregroundColor2, this.b, composer, 0), null, this.c, composer, 0, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$c */
    public static final class c implements Function2 {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.D b;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k c;

        public c(boolean z, com.moloco.sdk.internal.ortb.model.D d, com.moloco.sdk.internal.ortb.model.k kVar) {
            this.a = z;
            this.b = d;
            this.c = kVar;
        }

        @Composable
        public final Function11 a(Composer composer, int i) {
            Function11 a;
            composer.startReplaceableGroup(1846302992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1846302992, i, -1, "com.moloco.sdk.internal.toCloseButton.<anonymous> (AggregatedOptions.kt:268)");
            }
            if (this.a) {
                a = null;
            } else {
                float m2507constructorimpl = Dp.m2507constructorimpl(this.b.getControlSize());
                long m2517DpSizeYgX7TsA = DpKt.m2517DpSizeYgX7TsA(m2507constructorimpl, m2507constructorimpl);
                Alignment a2 = C5017d.a(this.b.getHorizontalAlignment(), this.b.getVerticalAlignment());
                PaddingValues m329PaddingValues0680j_4 = PaddingKt.m329PaddingValues0680j_4(Dp.m2507constructorimpl(this.b.getIo.bidmachine.iab.vast.tags.VastAttributes.PADDING java.lang.String()));
                long foregroundColor = this.b.getForegroundColor();
                long sp = TextUnitKt.getSp(this.b.getControlSize());
                TextUnitKt.m2585checkArithmeticR2X_6o(sp);
                long pack = TextUnitKt.pack(TextUnit.m2577getRawTypeimpl(sp), TextUnit.m2579getValueimpl(sp) / 2);
                Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.moloco_close, composer, 0);
                long m2540timesGh9hcWk = DpSize.m2540timesGh9hcWk(m2517DpSizeYgX7TsA, 0.45f);
                Color backgroundColor = this.b.getBackgroundColor();
                a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s.a(a2, m329PaddingValues0680j_4, foregroundColor, m2517DpSizeYgX7TsA, pack, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s.a(painterResource, m2540timesGh9hcWk, null, backgroundColor != null ? backgroundColor.getValue() : C5017d.b, composer, 0, 4), null, this.c, composer, 0, 64);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$d, reason: collision with other inner class name */
    public static final class C1527d implements Function2 {
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z a;

        public C1527d(com.moloco.sdk.internal.ortb.model.z zVar) {
            this.a = zVar;
        }

        @Composable
        public final Function7 a(Composer composer, int i) {
            long j;
            composer.startReplaceableGroup(1012987991);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1012987991, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:90)");
            }
            if (this.a.getMute().getControlSize() != null) {
                float m2507constructorimpl = Dp.m2507constructorimpl(r1.m8059unboximpl());
                j = DpKt.m2517DpSizeYgX7TsA(m2507constructorimpl, m2507constructorimpl);
            } else {
                j = C5017d.e;
            }
            Alignment a = C5017d.a(this.a.getMute().getHorizontalAlignment(), this.a.getMute().getVerticalAlignment());
            PaddingValues m329PaddingValues0680j_4 = PaddingKt.m329PaddingValues0680j_4(Dp.m2507constructorimpl(this.a.getMute().getIo.bidmachine.iab.vast.tags.VastAttributes.PADDING java.lang.String()));
            long m2540timesGh9hcWk = DpSize.m2540timesGh9hcWk(j, 0.6f);
            long foregroundColor = this.a.getMute().getForegroundColor();
            Color backgroundColor = this.a.getMute().getBackgroundColor();
            Function7 a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(j, m2540timesGh9hcWk, null, backgroundColor != null ? backgroundColor.getValue() : C5017d.b, a, m329PaddingValues0680j_4, foregroundColor, PainterResources_androidKt.painterResource(R.drawable.moloco_volume_off, composer, 0), PainterResources_androidKt.painterResource(R.drawable.moloco_volume_on, composer, 0), null, composer, 0, 516);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$e */
    public static final class e implements Function2 {
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z a;

        public e(com.moloco.sdk.internal.ortb.model.z zVar) {
            this.a = zVar;
        }

        @Composable
        public final Function11 a(Composer composer, int i) {
            Function11 a;
            Color foregroundColor;
            composer.startReplaceableGroup(-474197615);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-474197615, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:105)");
            }
            com.moloco.sdk.internal.ortb.model.D skip = this.a.getSkip();
            if (skip == null) {
                a = null;
            } else {
                com.moloco.sdk.internal.ortb.model.z zVar = this.a;
                float m2507constructorimpl = Dp.m2507constructorimpl(skip.getControlSize());
                long m2517DpSizeYgX7TsA = DpKt.m2517DpSizeYgX7TsA(m2507constructorimpl, m2507constructorimpl);
                com.moloco.sdk.internal.ortb.model.v inlineTextButton = zVar.getInlineTextButton();
                long foregroundColor2 = (inlineTextButton == null || (foregroundColor = inlineTextButton.getForegroundColor()) == null) ? skip.getForegroundColor() : foregroundColor.getValue();
                Alignment a2 = C5017d.a(skip.getHorizontalAlignment(), skip.getVerticalAlignment());
                PaddingValues m329PaddingValues0680j_4 = PaddingKt.m329PaddingValues0680j_4(Dp.m2507constructorimpl(skip.getIo.bidmachine.iab.vast.tags.VastAttributes.PADDING java.lang.String()));
                long sp = TextUnitKt.getSp(skip.getControlSize());
                TextUnitKt.m2585checkArithmeticR2X_6o(sp);
                long pack = TextUnitKt.pack(TextUnit.m2577getRawTypeimpl(sp), TextUnit.m2579getValueimpl(sp) / 2);
                long m2540timesGh9hcWk = DpSize.m2540timesGh9hcWk(m2517DpSizeYgX7TsA, 0.4f);
                Color backgroundColor = skip.getBackgroundColor();
                a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(a2, m329PaddingValues0680j_4, foregroundColor2, m2517DpSizeYgX7TsA, pack, C5017d.b(m2540timesGh9hcWk, backgroundColor != null ? backgroundColor.getValue() : C5017d.b, foregroundColor2, zVar.getInlineTextButton(), composer, 0), null, zVar.getCountDownTimer(), composer, 0, 64);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$f */
    public static final class f implements Function2 {
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z a;

        public f(com.moloco.sdk.internal.ortb.model.z zVar) {
            this.a = zVar;
        }

        @Composable
        public final Function11 a(Composer composer, int i) {
            Function11 a;
            composer.startReplaceableGroup(-606521360);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-606521360, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:126)");
            }
            com.moloco.sdk.internal.ortb.model.D skip = this.a.getSkip();
            if (skip == null) {
                a = null;
            } else {
                com.moloco.sdk.internal.ortb.model.z zVar = this.a;
                float m2507constructorimpl = Dp.m2507constructorimpl(skip.getControlSize());
                long m2517DpSizeYgX7TsA = DpKt.m2517DpSizeYgX7TsA(m2507constructorimpl, m2507constructorimpl);
                Alignment a2 = C5017d.a(skip.getHorizontalAlignment(), skip.getVerticalAlignment());
                PaddingValues m329PaddingValues0680j_4 = PaddingKt.m329PaddingValues0680j_4(Dp.m2507constructorimpl(skip.getIo.bidmachine.iab.vast.tags.VastAttributes.PADDING java.lang.String()));
                long foregroundColor = skip.getForegroundColor();
                long sp = TextUnitKt.getSp(skip.getControlSize());
                TextUnitKt.m2585checkArithmeticR2X_6o(sp);
                long pack = TextUnitKt.pack(TextUnit.m2577getRawTypeimpl(sp), TextUnit.m2579getValueimpl(sp) / 2);
                Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.moloco_skip, composer, 0);
                long m2540timesGh9hcWk = DpSize.m2540timesGh9hcWk(m2517DpSizeYgX7TsA, 0.4f);
                Color backgroundColor = skip.getBackgroundColor();
                a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(a2, m329PaddingValues0680j_4, foregroundColor, m2517DpSizeYgX7TsA, pack, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(painterResource, m2540timesGh9hcWk, null, backgroundColor != null ? backgroundColor.getValue() : C5017d.b, composer, 0, 4), null, zVar.getCountDownTimer(), composer, 0, 64);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$g */
    public static final class g implements Function2 {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z b;

        public g(boolean z, com.moloco.sdk.internal.ortb.model.z zVar) {
            this.a = z;
            this.b = zVar;
        }

        @Composable
        public final Function7 a(Composer composer, int i) {
            Function7 function7;
            com.moloco.sdk.internal.ortb.model.i cta;
            composer.startReplaceableGroup(483693011);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(483693011, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:144)");
            }
            if (this.a || (cta = this.b.getCta()) == null) {
                function7 = null;
            } else {
                Alignment a = C5017d.a(cta.getHorizontalAlignment(), cta.getVerticalAlignment());
                PaddingValues m329PaddingValues0680j_4 = PaddingKt.m329PaddingValues0680j_4(Dp.m2507constructorimpl(cta.getIo.bidmachine.iab.vast.tags.VastAttributes.PADDING java.lang.String()));
                String text = cta.getText();
                long foregroundColor = cta.getForegroundColor();
                Color backgroundColor = cta.getBackgroundColor();
                function7 = v.a(a, m329PaddingValues0680j_4, text, foregroundColor, backgroundColor != null ? backgroundColor.getValue() : v.a(), cta.getIo.bidmachine.unified.UnifiedMediationParams.KEY_IMAGE_URL java.lang.String(), composer, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return function7;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$h */
    public static final class h implements Function2 {
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z a;

        public h(com.moloco.sdk.internal.ortb.model.z zVar) {
            this.a = zVar;
        }

        @Composable
        public final Function5 a(Composer composer, int i) {
            composer.startReplaceableGroup(830314579);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(830314579, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:162)");
            }
            com.moloco.sdk.internal.ortb.model.A progressBar = this.a.getProgressBar();
            Function5 a = progressBar == null ? null : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(C5017d.a(progressBar.getHorizontalAlignment(), progressBar.getVerticalAlignment()), PaddingKt.m329PaddingValues0680j_4(Dp.m2507constructorimpl(progressBar.getIo.bidmachine.iab.vast.tags.VastAttributes.PADDING java.lang.String())), progressBar.getForegroundColor(), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$i */
    public static final class i implements Function2 {
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z a;

        public i(com.moloco.sdk.internal.ortb.model.z zVar) {
            this.a = zVar;
        }

        @Composable
        public final Function6 a(Composer composer, int i) {
            composer.startReplaceableGroup(392356305);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(392356305, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:171)");
            }
            E vastPrivacyIcon = this.a.getVastPrivacyIcon();
            composer.startReplaceableGroup(-1135687823);
            Function6 a = vastPrivacyIcon == null ? null : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.a(C5017d.a(vastPrivacyIcon.getHorizontalAlignment(), vastPrivacyIcon.getVerticalAlignment()), PaddingKt.m329PaddingValues0680j_4(Dp.m2507constructorimpl(vastPrivacyIcon.getIo.bidmachine.iab.vast.tags.VastAttributes.PADDING java.lang.String())), composer, 0, 0);
            composer.endReplaceableGroup();
            if (a == null) {
                a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.a(null, null, composer, 0, 3);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$j */
    public /* synthetic */ class j extends FunctionReferenceImpl implements Function3 {
        public static final j a = new j();

        public j() {
            super(3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.class, "defaultProgressBarView", "defaultProgressBarView(Landroid/content/Context;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/VastProgressBarView;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w invoke(Context p0, Flow p1, Flow p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.c(p0, p1, p2);
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$k */
    public /* synthetic */ class k extends FunctionReferenceImpl implements Function2 {
        public static final k a = new k();

        public k() {
            super(2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.class, "defaultVastIconView", "defaultVastIconView(Landroid/content/Context;Lkotlinx/coroutines/flow/Flow;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/LinearVastIconView;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k invoke(Context p0, Flow p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(p0, p1);
        }
    }

    static {
        float f2 = 30;
        e = DpKt.m2517DpSizeYgX7TsA(Dp.m2507constructorimpl(f2), Dp.m2507constructorimpl(f2));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x b(com.moloco.sdk.internal.ortb.model.z zVar, boolean z) {
        com.moloco.sdk.internal.ortb.model.r close;
        UInt delaySeconds;
        boolean mute = zVar.getMute().getMute();
        Boolean bool = zVar.getSkip() == null ? null : Boolean.TRUE;
        com.moloco.sdk.internal.ortb.model.D skip = zVar.getSkip();
        int i2 = 0;
        int delaySeconds2 = skip != null ? skip.getDelaySeconds() : 0;
        C5021c autoStore = zVar.getAutoStore();
        boolean z2 = autoStore != null && autoStore.getEnabled() && zVar.getAutoStore().getOnSkip();
        C5021c autoStore2 = zVar.getAutoStore();
        boolean z3 = autoStore2 != null && autoStore2.getEnabled();
        int delaySeconds3 = zVar.getClose().getDelaySeconds();
        com.moloco.sdk.internal.ortb.model.l lVar = zVar.getCom.safedk.android.analytics.brandsafety.m.Q java.lang.String();
        if (lVar != null && (close = lVar.getClose()) != null && (delaySeconds = close.getDelaySeconds()) != null) {
            i2 = delaySeconds.m8059unboximpl();
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x(mute, bool, delaySeconds2, delaySeconds3, i2, z2, z3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(0L, new C1527d(zVar), a(zVar.getClose(), z, zVar.getCountDownTimer()), new e(zVar), new f(zVar), new g(z, zVar), p.a(zVar.getIsAllAreaClickable()), new h(zVar), new i(zVar), (Function2) null, (Q) null, !z, 1537, (Object) null), zVar.getAndroidInline(), zVar.getAutoInline());
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h c(@NotNull com.moloco.sdk.internal.ortb.model.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f a2 = a(zVar, false);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h(b(zVar, false), a2, a2);
    }

    public static final com.moloco.sdk.internal.ortb.model.z d() {
        long j2 = c;
        int m8055constructorimpl = UInt.m8055constructorimpl(30);
        com.moloco.sdk.internal.ortb.model.u uVar = com.moloco.sdk.internal.ortb.model.u.d;
        F f2 = F.b;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Color color = null;
        com.moloco.sdk.internal.ortb.model.D d2 = new com.moloco.sdk.internal.ortb.model.D(5, 10, m8055constructorimpl, uVar, f2, j2, color, 64, defaultConstructorMarker);
        int i2 = 10;
        UInt uInt = null;
        E e2 = null;
        return new com.moloco.sdk.internal.ortb.model.z(d2, d2, new com.moloco.sdk.internal.ortb.model.A(0, com.moloco.sdk.internal.ortb.model.u.c, F.d, j2, null), new com.moloco.sdk.internal.ortb.model.y(false, i2, com.moloco.sdk.internal.ortb.model.u.b, f2, j2, uInt, color, 96, defaultConstructorMarker), (com.moloco.sdk.internal.ortb.model.i) null, true, new C5021c(false, false, (String) null, 6, (DefaultConstructorMarker) null), e2, (com.moloco.sdk.internal.ortb.model.l) null, (com.moloco.sdk.internal.ortb.model.k) null, (C5019a) null, (C5020b) null, (com.moloco.sdk.internal.ortb.model.v) null, 7552, (DefaultConstructorMarker) null);
    }

    public static final com.moloco.sdk.internal.ortb.model.z g() {
        return (com.moloco.sdk.internal.ortb.model.z) a.getValue();
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h a(@NotNull com.moloco.sdk.internal.ortb.model.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f a2 = a(zVar, true);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h(b(zVar, true), a2, a2);
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h c() {
        return c(g());
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h a() {
        return a(g());
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x c(com.moloco.sdk.internal.ortb.model.z zVar, final boolean z) {
        com.moloco.sdk.internal.ortb.model.r close;
        UInt delaySeconds;
        com.moloco.sdk.internal.ortb.model.y mute = zVar.getMute();
        final com.moloco.sdk.internal.ortb.model.A progressBar = zVar.getProgressBar();
        final E vastPrivacyIcon = zVar.getVastPrivacyIcon();
        final boolean isAllAreaClickable = zVar.getIsAllAreaClickable();
        final int m1471toArgb8_81llA = ColorKt.m1471toArgb8_81llA(mute.getForegroundColor());
        Color backgroundColor = mute.getBackgroundColor();
        final Integer valueOf = backgroundColor != null ? Integer.valueOf(ColorKt.m1471toArgb8_81llA(backgroundColor.getValue())) : null;
        final int b2 = b(mute.getHorizontalAlignment(), mute.getVerticalAlignment());
        final int i2 = mute.getIo.bidmachine.iab.vast.tags.VastAttributes.PADDING java.lang.String();
        UInt controlSize = mute.getControlSize();
        Integer valueOf2 = controlSize != null ? Integer.valueOf(controlSize.m8059unboximpl()) : null;
        final Integer valueOf3 = progressBar != null ? Integer.valueOf(ColorKt.m1471toArgb8_81llA(progressBar.getForegroundColor())) : null;
        final Integer valueOf4 = progressBar != null ? Integer.valueOf(b(progressBar.getHorizontalAlignment(), progressBar.getVerticalAlignment())) : null;
        final Integer valueOf5 = progressBar != null ? Integer.valueOf(progressBar.getIo.bidmachine.iab.vast.tags.VastAttributes.PADDING java.lang.String()) : null;
        final Integer valueOf6 = vastPrivacyIcon != null ? Integer.valueOf(b(vastPrivacyIcon.getHorizontalAlignment(), vastPrivacyIcon.getVerticalAlignment())) : null;
        final Integer valueOf7 = vastPrivacyIcon != null ? Integer.valueOf(vastPrivacyIcon.getIo.bidmachine.iab.vast.tags.VastAttributes.PADDING java.lang.String()) : null;
        boolean mute2 = mute.getMute();
        Boolean bool = zVar.getSkip() != null ? Boolean.TRUE : null;
        com.moloco.sdk.internal.ortb.model.D skip = zVar.getSkip();
        int delaySeconds2 = skip != null ? skip.getDelaySeconds() : 0;
        C5021c autoStore = zVar.getAutoStore();
        boolean z2 = autoStore != null && autoStore.getEnabled() && zVar.getAutoStore().getOnSkip();
        C5021c autoStore2 = zVar.getAutoStore();
        boolean z3 = autoStore2 != null && autoStore2.getEnabled();
        int delaySeconds3 = zVar.getClose().getDelaySeconds();
        com.moloco.sdk.internal.ortb.model.l lVar = zVar.getCom.safedk.android.analytics.brandsafety.m.Q java.lang.String();
        final Integer num = valueOf2;
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x(mute2, bool, delaySeconds2, delaySeconds3, (lVar == null || (close = lVar.getClose()) == null || (delaySeconds = close.getDelaySeconds()) == null) ? 0 : delaySeconds.m8059unboximpl(), z2, z3, new Function2() { // from class: com.moloco.sdk.internal.d$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C5017d.a(i2, num, progressBar, vastPrivacyIcon, z, isAllAreaClickable, m1471toArgb8_81llA, b2, valueOf, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, (Context) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) obj2);
            }
        }, zVar.getAndroidInline(), zVar.getAutoInline());
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f a(com.moloco.sdk.internal.ortb.model.z zVar, boolean z) {
        com.moloco.sdk.internal.ortb.model.r close;
        UInt delaySeconds;
        int delaySeconds2 = zVar.getClose().getDelaySeconds();
        Function10 a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b.a(0L, a(z, zVar.getClose(), zVar.getCom.safedk.android.analytics.brandsafety.m.Q java.lang.String(), zVar.getCountDownTimer(), zVar.getInlineTextButton()), 1, null);
        com.moloco.sdk.internal.ortb.model.l lVar = zVar.getCom.safedk.android.analytics.brandsafety.m.Q java.lang.String();
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f(delaySeconds2, a2, (lVar == null || (close = lVar.getClose()) == null || (delaySeconds = close.getDelaySeconds()) == null) ? 0 : delaySeconds.m8059unboximpl(), a(zVar.getClose(), z, (com.moloco.sdk.internal.ortb.model.k) null, 2, (Object) null), zVar.getAndroidInline(), zVar.getAutoInline());
    }

    @NotNull
    public static final Function2 a(boolean z, @NotNull com.moloco.sdk.internal.ortb.model.D close, @Nullable com.moloco.sdk.internal.ortb.model.l lVar, @Nullable com.moloco.sdk.internal.ortb.model.k kVar, @Nullable com.moloco.sdk.internal.ortb.model.v vVar) {
        Intrinsics.checkNotNullParameter(close, "close");
        if (lVar == null) {
            return a(close, z, kVar);
        }
        return new b(close, vVar, kVar);
    }

    public static final Function2 a(com.moloco.sdk.internal.ortb.model.D d2, boolean z, com.moloco.sdk.internal.ortb.model.k kVar) {
        return new c(z, d2, kVar);
    }

    public static /* synthetic */ Function2 a(com.moloco.sdk.internal.ortb.model.D d2, boolean z, com.moloco.sdk.internal.ortb.model.k kVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            kVar = null;
        }
        return a(d2, z, kVar);
    }

    @NotNull
    public static final Alignment a(@NotNull com.moloco.sdk.internal.ortb.model.u horizontalAlignment, @NotNull F verticalAlignment) {
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        F f2 = F.b;
        if (verticalAlignment == f2 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.b || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.e)) {
            return Alignment.INSTANCE.getTopStart();
        }
        if (verticalAlignment == f2 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.c) {
            return Alignment.INSTANCE.getTopCenter();
        }
        if (verticalAlignment == f2 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.d || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.f)) {
            return Alignment.INSTANCE.getTopEnd();
        }
        F f3 = F.c;
        if (verticalAlignment == f3 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.b || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.e)) {
            return Alignment.INSTANCE.getCenterStart();
        }
        if (verticalAlignment == f3 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.c) {
            return Alignment.INSTANCE.getCenter();
        }
        if (verticalAlignment == f3 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.d || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.f)) {
            return Alignment.INSTANCE.getCenterEnd();
        }
        F f4 = F.d;
        return (verticalAlignment == f4 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.b || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.e)) ? Alignment.INSTANCE.getBottomStart() : (verticalAlignment == f4 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.c) ? Alignment.INSTANCE.getBottomCenter() : (verticalAlignment == f4 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.d || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.f)) ? Alignment.INSTANCE.getBottomEnd() : Alignment.INSTANCE.getTopStart();
    }

    public static final View a(int i2, Integer num, com.moloco.sdk.internal.ortb.model.A a2, E e2, boolean z, boolean z2, final int i3, final int i4, final Integer num2, final Integer num3, final Integer num4, final Integer num5, final Integer num6, final Integer num7, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel) {
        int dimensionPixelSize;
        Function3 function3;
        Function2 function2;
        Function2 a3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        float f2 = context.getResources().getDisplayMetrics().density;
        final int i5 = (int) (i2 * f2);
        if (num != null) {
            dimensionPixelSize = (int) (num.intValue() * f2);
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.moloco_banner_mute_button_size);
        }
        final int i6 = dimensionPixelSize;
        Function3 function32 = new Function3() { // from class: com.moloco.sdk.internal.d$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C5017d.a(i3, i6, i4, i5, num2, (Context) obj, (Flow) obj2, (Flow) obj3);
            }
        };
        if (a2 != null) {
            function3 = new Function3() { // from class: com.moloco.sdk.internal.d$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return C5017d.a(num3, num4, num5, (Context) obj, (Flow) obj2, (Flow) obj3);
                }
            };
        } else {
            function3 = j.a;
        }
        if (e2 != null) {
            function2 = new Function2() { // from class: com.moloco.sdk.internal.d$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5017d.a(num6, num7, (Context) obj, (Flow) obj2);
                }
            };
        } else {
            function2 = k.a;
        }
        a3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a((r26 & 1) != 0 ? null : null, (r26 & 2) != 0 ? -16777216 : -16777216, (r26 & 4) != 0 ? x.p.a : function32, (r26 & 8) != 0 ? x.q.a : function3, (r26 & 16) != 0 ? null : null, (r26 & 32) != 0 ? x.r.a : function2, (r26 & 64) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a((String) null, (String) null, (Integer) null, (Integer) null, 15, (Object) null) : z ? null : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a((String) null, (String) null, (Integer) null, (Integer) null, 15, (Object) null), (r26 & 128) == 0 ? p.a(z2) : null, (r26 & 256) != 0 ? a.h.a.k() : null, (r26 & 512) != 0 ? true : !z, (r26 & 1024) != 0 ? a.h.a.f() : null, (r26 & 2048) != 0 ? new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return x.a();
            }
        } : null);
        return (View) a3.invoke(context, adViewModel);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n a(int i2, int i3, int i4, int i5, Integer num, Context ctx, Flow isPlayerPlaying, Flow muteFlow) {
        int color;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(isPlayerPlaying, "isPlayerPlaying");
        Intrinsics.checkNotNullParameter(muteFlow, "muteFlow");
        int i6 = R.drawable.moloco_volume_off;
        int i7 = R.drawable.moloco_volume_on;
        int roundToInt = MathKt.roundToInt(i3 * 0.6f);
        if (num != null) {
            color = num.intValue();
        } else {
            color = ContextCompat.getColor(ctx, R.color.moloco_button_background);
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n(ctx, isPlayerPlaying, muteFlow, i2, i6, i7, i3, roundToInt, i4, i5, color);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w a(Integer num, Integer num2, Integer num3, Context ctx, Flow isP, Flow prog) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(isP, "isP");
        Intrinsics.checkNotNullParameter(prog, "prog");
        Intrinsics.checkNotNull(num);
        int intValue = num.intValue();
        Intrinsics.checkNotNull(num2);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.w(ctx, isP, prog, intValue, num2.intValue(), (int) ((num3 != null ? num3.intValue() : 0) * ctx.getResources().getDisplayMetrics().density));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k a(Integer num, Integer num2, Context ctx, Flow flow) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNull(num);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k(ctx, flow, num.intValue(), (int) ((num2 != null ? num2.intValue() : 0) * ctx.getResources().getDisplayMetrics().density));
    }

    @Composable
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q b(long j2, long j3, long j4, com.moloco.sdk.internal.ortb.model.v vVar, Composer composer, int i2) {
        long j5;
        composer.startReplaceableGroup(129538364);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(129538364, i2, -1, "com.moloco.sdk.internal.defaultMolocoSkipAfterCountdownButtonPart (AggregatedOptions.kt:194)");
        }
        composer.startReplaceableGroup(-1579272619);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q qVar = null;
        String str = null;
        if (vVar != null) {
            String textPosition = vVar.getTextPosition();
            if (textPosition != null) {
                str = textPosition.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            }
            boolean z = !Intrinsics.areEqual(str, "right");
            Boolean useIcon = vVar.getUseIcon();
            boolean booleanValue = useIcon != null ? useIcon.booleanValue() : true;
            String text = vVar.getText();
            if (text == null) {
                text = "play store";
            }
            Color foregroundColor = vVar.getForegroundColor();
            long value = foregroundColor != null ? foregroundColor.getValue() : j4;
            Color backgroundColor = vVar.getBackgroundColor();
            long value2 = backgroundColor != null ? backgroundColor.getValue() : j3;
            Integer fontSize = vVar.getFontSize();
            long sp = fontSize != null ? TextUnitKt.getSp(fontSize.intValue()) : TextUnit.INSTANCE.m2583getUnspecifiedXSAIIZE();
            if (vVar.getIconSize() != null) {
                float m2507constructorimpl = Dp.m2507constructorimpl(r1.intValue());
                j5 = DpKt.m2517DpSizeYgX7TsA(m2507constructorimpl, m2507constructorimpl);
            } else {
                j5 = j2;
            }
            qVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(text, null, j5, null, value2, z, booleanValue, value, sp, composer, 0, 10);
        }
        composer.endReplaceableGroup();
        if (qVar == null) {
            qVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(PainterResources_androidKt.painterResource(R.drawable.moloco_skip, composer, 0), j2, null, j3, composer, ((i2 << 3) & 112) | ((i2 << 6) & 7168), 4);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return qVar;
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h b(@NotNull com.moloco.sdk.internal.ortb.model.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f a2 = a(zVar, true);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h(c(zVar, true), a2, a2);
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h b() {
        return b(g());
    }

    public static final int b(@NotNull com.moloco.sdk.internal.ortb.model.u horizontalAlignment, @NotNull F verticalAlignment) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        int i4 = a.a[horizontalAlignment.ordinal()];
        if (i4 == 1 || i4 == 2) {
            i2 = 8388611;
        } else if (i4 == 3) {
            i2 = 1;
        } else {
            if (i4 != 4 && i4 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 8388613;
        }
        int i5 = a.b[verticalAlignment.ordinal()];
        if (i5 == 1) {
            i3 = 48;
        } else if (i5 == 2) {
            i3 = 16;
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 80;
        }
        return i2 | i3;
    }
}
