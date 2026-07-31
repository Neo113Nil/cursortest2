package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.app.Activity;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@VisibleForTesting
/* loaded from: classes13.dex */
public final class b {

    @Nullable
    public static Function10 d;

    @Nullable
    public static Function0 f;

    @Nullable
    public static c g;

    @Nullable
    public static y h;

    @Nullable
    public static Function0 i;

    @Nullable
    public static Function1 l;

    @Nullable
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b m;

    @Nullable
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a n;

    @Nullable
    public static MetricsRecorder o;

    @NotNull
    public static final b a = new b();

    @NotNull
    public static WeakReference<j> b = new WeakReference<>(null);

    @NotNull
    public static WeakReference<Activity> c = new WeakReference<>(null);

    @NotNull
    public static Function2 e = a.a;

    @NotNull
    public static Function0 j = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return b.p();
        }
    };

    @NotNull
    public static Function0 k = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return b.o();
        }
    };
    public static final int p = 8;

    public static final class a implements Function2 {
        public static final a a = new a();

        @Composable
        public final Function11 a(Composer composer, int i) {
            composer.startReplaceableGroup(-1525839088);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1525839088, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivityDataHolder.closeButton.<anonymous> (MraidActivity.kt:354)");
            }
            Function11 a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s.a(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
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

    public static final Unit o() {
        return Unit.INSTANCE;
    }

    public static final Unit p() {
        return Unit.INSTANCE;
    }

    public final void a(@Nullable j jVar) {
        b = new WeakReference<>(jVar);
    }

    public final void b(@NotNull Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        k = function0;
    }

    public final void c(@Nullable Function0 function0) {
        i = function0;
    }

    @NotNull
    public final Function2 d() {
        return e;
    }

    @Nullable
    public final MetricsRecorder e() {
        return o;
    }

    @Nullable
    public final Function10 f() {
        return d;
    }

    @Nullable
    public final Function0 g() {
        return f;
    }

    @NotNull
    public final Function0 h() {
        return k;
    }

    @Nullable
    public final Function0 i() {
        return i;
    }

    @Nullable
    public final Function1 j() {
        return l;
    }

    @NotNull
    public final Function0 k() {
        return j;
    }

    @Nullable
    public final y l() {
        return h;
    }

    @Nullable
    public final Activity m() {
        return c.get();
    }

    @Nullable
    public final j n() {
        return b.get();
    }

    public final void a(@Nullable Activity activity) {
        c = new WeakReference<>(activity);
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a b() {
        return n;
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b c() {
        return m;
    }

    public final void d(@NotNull Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        j = function0;
    }

    public final void a(@Nullable Function10 function10) {
        d = function10;
    }

    public final void a(@NotNull Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        e = function2;
    }

    public final void a(@Nullable Function0 function0) {
        f = function0;
    }

    @Nullable
    public final c a() {
        return g;
    }

    public final void a(@Nullable c cVar) {
        g = cVar;
    }

    public final void a(@Nullable y yVar) {
        h = yVar;
    }

    public final void a(@Nullable Function1 function1) {
        l = function1;
    }

    public final void a(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar) {
        m = bVar;
    }

    public final void a(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar) {
        n = aVar;
    }

    public final void a(@Nullable MetricsRecorder metricsRecorder) {
        o = metricsRecorder;
    }
}
