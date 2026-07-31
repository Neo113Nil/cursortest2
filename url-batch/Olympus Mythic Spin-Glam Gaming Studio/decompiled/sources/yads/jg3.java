package yads;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final class jg3 {
    public static final /* synthetic */ KProperty[] k = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(jg3.class, "adParameterManager", "getAdParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$ResponseReportParameterManager;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(jg3.class, "requestParameterManager", "getRequestParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$RequestReportParameterManager;", 0))};
    public static final long l = TimeUnit.SECONDS.toMillis(10);
    public final i5 a;
    public final wj3 b;
    public final oc2 c;
    public final mg3 d;
    public final pi3 e;
    public final bg3 f;
    public final og3 g;
    public boolean h;
    public final hg3 i;
    public final ig3 j;

    public jg3(Context context, yu2 yu2Var, t8 t8Var, we3 we3Var, i5 i5Var, tg3 tg3Var, bk3 bk3Var, aj3 aj3Var, wj3 wj3Var) {
        oc2 a = lc2.a(false);
        mg3 mg3Var = new mg3(context, yu2Var, t8Var, i5Var);
        pi3 pi3Var = new pi3(we3Var, bk3Var);
        this.a = i5Var;
        this.b = wj3Var;
        this.c = a;
        this.d = mg3Var;
        this.e = pi3Var;
        this.f = new bg3(tg3Var, this);
        this.g = new og3(aj3Var, this);
        Delegates delegates = Delegates.INSTANCE;
        this.i = new hg3(this);
        this.j = new ig3(this);
    }

    public final void a() {
        og3 og3Var = this.g;
        og3Var.c.removeCallbacksAndMessages(null);
        og3Var.e = false;
        this.a.a(h5.y, null);
        this.b.a.i();
        bg3 bg3Var = this.f;
        if (!bg3Var.e && !bg3Var.d) {
            bg3Var.e = true;
            bg3Var.c.post(new ag3(bg3Var));
        }
        this.c.a(l, new pc2() { // from class: yads.jg3$$ExternalSyntheticLambda0
            @Override // yads.pc2
            public final void a() {
                jg3.a(jg3.this);
            }
        });
    }

    public final void b() {
        og3 og3Var = this.g;
        og3Var.c.removeCallbacksAndMessages(null);
        og3Var.e = false;
        bg3 bg3Var = this.f;
        bg3Var.c.removeCallbacksAndMessages(null);
        bg3Var.e = false;
        this.c.a();
    }

    public static final void a(jg3 jg3Var) {
        tf0 tf0Var = new tf0();
        vf3 vf3Var = vf3.b;
        jg3Var.b();
        if (jg3Var.h) {
            return;
        }
        jg3Var.h = true;
        String lowerCase = "TIMEOUT".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String message = tf0Var.getMessage();
        if (message == null) {
            message = "";
        }
        mg3 mg3Var = jg3Var.d;
        mg3Var.getClass();
        mg3Var.a(MapsKt.mutableMapOf(TuplesKt.to("status", "error"), TuplesKt.to("failure_reason", lowerCase), TuplesKt.to("error_message", message)));
    }

    public final void a(wf3 wf3Var) {
        b();
        if (this.h) {
            return;
        }
        this.h = true;
        String lowerCase = wf3Var.a.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String message = wf3Var.b.getMessage();
        if (message == null) {
            message = "";
        }
        mg3 mg3Var = this.d;
        mg3Var.getClass();
        mg3Var.a(MapsKt.mutableMapOf(TuplesKt.to("status", "error"), TuplesKt.to("failure_reason", lowerCase), TuplesKt.to("error_message", message)));
    }
}
