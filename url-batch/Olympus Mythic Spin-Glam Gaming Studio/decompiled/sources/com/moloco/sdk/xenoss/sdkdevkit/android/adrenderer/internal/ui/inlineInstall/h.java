package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes14.dex */
public final class h implements g {

    @NotNull
    public static final a h = new a(null);
    public static final int i = 8;

    @NotNull
    public static final String j = "InlineInstallLauncher";

    @NotNull
    public final l a;

    @Nullable
    public final String b;

    @NotNull
    public final c c;

    @Nullable
    public final b d;

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a e;

    @Nullable
    public final MetricsRecorder f;

    @NotNull
    public final AtomicBoolean g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public h(@NotNull l installer, @Nullable String str, @NotNull c bundleExtractor, @Nullable b bVar, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar, @Nullable MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(installer, "installer");
        Intrinsics.checkNotNullParameter(bundleExtractor, "bundleExtractor");
        this.a = installer;
        this.b = str;
        this.c = bundleExtractor;
        this.d = bVar;
        this.e = aVar;
        this.f = metricsRecorder;
        this.g = new AtomicBoolean(false);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.g
    public void a(@Nullable String str, @NotNull r externalLinkHandler) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar = this.e;
        if (aVar == null || !aVar.g()) {
            return;
        }
        MetricsRecorder metricsRecorder = this.f;
        if (metricsRecorder != null) {
            metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.Q.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.g.c(), "auto_inline"));
        }
        String f = this.e.f();
        if (f != null) {
            str = f;
        }
        a(externalLinkHandler, str, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.h$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.a(h.this, (j) obj);
            }
        });
        String h2 = this.e.h();
        if (h2 != null) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, j, "auto_halfsheet_shown success", null, false, 12, null);
            a.i.a.c().a(h2);
            MolocoLogger.info$default(molocoLogger, j, "auto_inline_success fire this event once: " + h2, null, false, 12, null);
            MetricsRecorder metricsRecorder2 = this.f;
            if (metricsRecorder2 != null) {
                metricsRecorder2.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "auto_halfsheet_shown"));
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.g
    public void b(@Nullable String str, @NotNull r externalLinkHandler) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        b bVar = this.d;
        if (bVar == null || !bVar.c()) {
            if (str != null) {
                externalLinkHandler.a(str);
            }
        } else {
            MetricsRecorder metricsRecorder = this.f;
            if (metricsRecorder != null) {
                metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.Q.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.g.c(), "android_inline"));
            }
            a(externalLinkHandler, str, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.h$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h.b(h.this, (j) obj);
                }
            });
        }
    }

    public static final Unit a(h hVar, j outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        if (!Intrinsics.areEqual(outcome, j.c.b)) {
            if (Intrinsics.areEqual(outcome, j.a.b)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, j, "auto_fullsheet_shown", null, false, 12, null);
                MetricsRecorder metricsRecorder = hVar.f;
                if (metricsRecorder != null) {
                    metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "auto_fullsheet_shown"));
                }
            } else if (Intrinsics.areEqual(outcome, j.b.b)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, j, "auto_fallback_shown", null, false, 12, null);
                MetricsRecorder metricsRecorder2 = hVar.f;
                if (metricsRecorder2 != null) {
                    metricsRecorder2.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "auto_fallback_shown"));
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit b(h hVar, j outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        if (Intrinsics.areEqual(outcome, j.c.b)) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, j, "click_inline_halfsheet_shown", null, false, 12, null);
            MetricsRecorder metricsRecorder = hVar.f;
            if (metricsRecorder != null) {
                metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "click_inline_halfsheet_shown"));
            }
            if (hVar.g.compareAndSet(false, true)) {
                String d = hVar.d.d();
                if (d != null) {
                    a.i.a.c().a(d);
                    MolocoLogger.info$default(molocoLogger, j, "inline_install_success fire this event once: " + d, null, false, 12, null);
                }
            } else {
                MolocoLogger.info$default(molocoLogger, j, "inline_install_success already fired", null, false, 12, null);
            }
        } else if (Intrinsics.areEqual(outcome, j.a.b)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, j, "click_inline_fullsheet_shown", null, false, 12, null);
            MetricsRecorder metricsRecorder2 = hVar.f;
            if (metricsRecorder2 != null) {
                metricsRecorder2.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "click_inline_fullsheet_shown"));
            }
        } else if (Intrinsics.areEqual(outcome, j.b.b)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, j, "click_inline_fallback_shown", null, false, 12, null);
            MetricsRecorder metricsRecorder3 = hVar.f;
            if (metricsRecorder3 != null) {
                metricsRecorder3.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "click_inline_fallback_shown"));
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(r rVar, String str, Function1 function1) {
        String str2;
        String b;
        String str3 = this.b;
        if (str3 != null && this.c.a(str3)) {
            b = this.b;
        } else if (str != null) {
            b = this.c.b(str);
        } else {
            str2 = null;
            String d = str != null ? this.c.d(str) : null;
            if (str2 == null && this.c.a(str2)) {
                a(str2, d, str, rVar, function1);
                return;
            }
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, j, "Store URL found but bundle extraction/validation failed: " + str, null, false, 12, null);
            if (str != null || str.length() == 0) {
            }
            rVar.a(str);
            function1.invoke(j.b.b);
            return;
        }
        str2 = b;
        String d2 = str != null ? this.c.d(str) : null;
        if (str2 == null) {
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, j, "Store URL found but bundle extraction/validation failed: " + str, null, false, 12, null);
        if (str != null) {
        }
    }

    public final void a(String str, String str2, String str3, r rVar, final Function1 function1) {
        if (this.a.a(str, str2, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.h$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.a(Function1.this, (j) obj);
            }
        }) || str3 == null) {
            return;
        }
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, j, "Cannot resolve app install intent", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, j, "inline_install_fallback", null, false, 12, null);
        rVar.a(str3);
        function1.invoke(j.b.b);
    }

    public static final Unit a(Function1 function1, j outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        function1.invoke(outcome);
        return Unit.INSTANCE;
    }
}
