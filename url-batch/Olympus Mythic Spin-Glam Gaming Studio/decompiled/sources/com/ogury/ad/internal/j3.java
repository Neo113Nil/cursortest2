package com.ogury.ad.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.ogury.ad.async.Single;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes8.dex */
public final class j3 extends p1 {
    public final Context c;
    public final w6 d;
    public final t6 e;
    public final s3 f;
    public final s7 g;
    public final ne h;
    public final r0 i;
    public final q0 j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j3(Context context, w6 mraidCommandExecutor, t6 mraidViewCommands, ne profigHandler, r0 app, q0 androidDevice) {
        super(mraidCommandExecutor, monitoringEventLogger);
        s7 mraidEventBus = s7.a;
        s3 intentHandler = s3.a;
        r5 r5Var = u5.e;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        u5 monitoringEventLogger = r5Var.a(applicationContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mraidCommandExecutor, "mraidCommandExecutor");
        Intrinsics.checkNotNullParameter(mraidViewCommands, "mraidViewCommands");
        Intrinsics.checkNotNullParameter(intentHandler, "intentHandler");
        Intrinsics.checkNotNullParameter(mraidEventBus, "mraidEventBus");
        Intrinsics.checkNotNullParameter(profigHandler, "profigHandler");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(androidDevice, "androidDevice");
        Intrinsics.checkNotNullParameter(monitoringEventLogger, "monitoringEventLogger");
        this.c = context;
        this.d = mraidCommandExecutor;
        this.e = mraidViewCommands;
        this.f = intentHandler;
        this.g = mraidEventBus;
        this.h = profigHandler;
        this.i = app;
        this.j = androidDevice;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "io.presage");
        p0.startActivity(p1);
    }

    @Override // com.ogury.ad.internal.p1
    public final void a(b ad) {
        String str;
        Intrinsics.checkNotNullParameter(ad, "ad");
        u5 u5Var = this.b;
        ob obVar = ob.x;
        Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(ad.H));
        b5 b5Var = ad.A.a;
        Intrinsics.checkNotNullParameter(b5Var, "<this>");
        int ordinal = b5Var.ordinal();
        if (ordinal == 0) {
            str = POBConstants.KEY_FORMAT;
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "sdk";
        }
        Pair pair2 = TuplesKt.to("loaded_source", str);
        Pair pair3 = TuplesKt.to("reload", Boolean.valueOf(ad.J));
        int i = ad.K;
        u5Var.a(obVar, ad, pb.a(pair, pair2, pair3, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)));
        s7 s7Var = this.g;
        i6 i6Var = new i6(ad.n.b);
        s7Var.getClass();
        s7.a(i6Var);
    }

    @Override // com.ogury.ad.internal.p1
    public final void b(b ad) {
        String str;
        Intrinsics.checkNotNullParameter(ad, "ad");
        u5 u5Var = this.b;
        ob obVar = ob.E;
        Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(ad.H));
        b5 b5Var = ad.A.a;
        Intrinsics.checkNotNullParameter(b5Var, "<this>");
        int ordinal = b5Var.ordinal();
        if (ordinal == 0) {
            str = POBConstants.KEY_FORMAT;
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "sdk";
        }
        Pair pair2 = TuplesKt.to("loaded_source", str);
        Pair pair3 = TuplesKt.to("reload", Boolean.valueOf(ad.J));
        int i = ad.K;
        u5Var.a(obVar, ad, pb.a(pair, pair2, pair3, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)));
        t6 t6Var = this.e;
        t6Var.B.a(t6Var.f, t6Var);
        t6Var.f();
    }

    @Override // com.ogury.ad.internal.p1
    public final void c(boolean z) {
        if (z) {
            a2 a2Var = this.e.v;
            if (a2Var != null) {
                a2Var.e.setVisibility(0);
                return;
            }
            return;
        }
        a2 a2Var2 = this.e.v;
        if (a2Var2 != null) {
            a2Var2.f.removeCallbacksAndMessages(null);
            a2Var2.e.setVisibility(8);
        }
    }

    @Override // com.ogury.ad.internal.p1
    public final void c() {
        t6 t6Var = this.e;
        rg resizeProps = t6Var.f.getResizeProps();
        if (resizeProps != null) {
            if (t6Var.h.a(t6Var.f, resizeProps)) {
                w6 w6Var = t6Var.p;
                if (w6Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mraidCommandExecutor");
                    w6Var = null;
                }
                w6Var.getClass();
                Intrinsics.checkNotNullParameter("resized", "state");
                b8.a(w6Var.a, x6.c("resized"));
                w6Var.a.setAdState("resized");
                t6Var.z.a(t6Var.f, t6Var);
                return;
            }
            throw new IllegalArgumentException("Invalid resize command");
        }
        throw new IllegalStateException("setResizeProperties must be called first");
    }

    @Override // com.ogury.ad.internal.p1
    public final void a(String str, String callbackId, b ad) {
        String str2;
        Intent a;
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        Intrinsics.checkNotNullParameter(ad, "ad");
        u5 u5Var = this.b;
        ob obVar = ob.D;
        Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(ad.H));
        b5 b5Var = ad.A.a;
        Intrinsics.checkNotNullParameter(b5Var, "<this>");
        int ordinal = b5Var.ordinal();
        if (ordinal == 0) {
            str2 = POBConstants.KEY_FORMAT;
        } else if (ordinal == 1) {
            str2 = "sdk";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Pair pair2 = TuplesKt.to("loaded_source", str2);
        Pair pair3 = TuplesKt.to("reload", Boolean.valueOf(ad.J));
        int i = ad.K;
        u5Var.a(obVar, ad, pb.a(pair, pair2, pair3, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)));
        s3 s3Var = this.f;
        Context context = this.c;
        s3Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            a = s3.a(str);
        } catch (Exception e) {
            com.ogury.core.internal.Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, e);
        }
        if (a != null) {
            a.addFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a);
            w6 w6Var = this.d;
            w6Var.getClass();
            Intrinsics.checkNotNullParameter(callbackId, "callbackId");
            Intrinsics.checkNotNullParameter("{isStarted: true}", "result");
            b8.a(w6Var.a, x6.b(callbackId, "{isStarted: true}"));
            return;
        }
        w6 w6Var2 = this.d;
        w6Var2.getClass();
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        Intrinsics.checkNotNullParameter("{isStarted: false}", "result");
        b8.a(w6Var2.a, x6.b(callbackId, "{isStarted: false}"));
    }

    @Override // com.ogury.ad.internal.p1
    public final void b(String str, String callbackId) {
        boolean z;
        Intent a;
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        s3 s3Var = this.f;
        Context context = this.c;
        s3Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            a = s3.a(str);
        } catch (Exception e) {
            com.ogury.core.internal.Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, e);
        }
        if (a != null) {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(a, 65536);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
            z = !queryIntentActivities.isEmpty();
            this.j.getClass();
            boolean z2 = Build.VERSION.SDK_INT < 30 && this.i.d() >= 30;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String result = String.format("{isResolved: %s, hasLimitedPackageVisibility: %s}", Arrays.copyOf(new Object[]{Boolean.valueOf(z), Boolean.valueOf(z2)}, 2));
            Intrinsics.checkNotNullExpressionValue(result, "format(...)");
            w6 w6Var = this.d;
            w6Var.getClass();
            Intrinsics.checkNotNullParameter(callbackId, "callbackId");
            Intrinsics.checkNotNullParameter(result, "result");
            b8.a(w6Var.a, x6.b(callbackId, result));
        }
        z = false;
        this.j.getClass();
        if (Build.VERSION.SDK_INT < 30) {
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String result2 = String.format("{isResolved: %s, hasLimitedPackageVisibility: %s}", Arrays.copyOf(new Object[]{Boolean.valueOf(z), Boolean.valueOf(z2)}, 2));
        Intrinsics.checkNotNullExpressionValue(result2, "format(...)");
        w6 w6Var2 = this.d;
        w6Var2.getClass();
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        Intrinsics.checkNotNullParameter(result2, "result");
        b8.a(w6Var2.a, x6.b(callbackId, result2));
    }

    @Override // com.ogury.ad.internal.p1
    public final void b() {
        Single.INSTANCE.fromCallable(new h3(this)).subscribe(i3.a);
    }

    @Override // com.ogury.ad.internal.p1
    public final void b(String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        t6 t6Var = this.e;
        t6Var.getClass();
        Intrinsics.checkNotNullParameter(adId, "adId");
        if (!t6Var.i) {
            y7 y7Var = t6Var.o;
            if (y7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                y7Var = null;
            }
            if (!Intrinsics.areEqual(y7Var.getAdState(), "hidden")) {
                return;
            }
        }
        dh dhVar = t6Var.A;
        if (dhVar == null || !dhVar.a(t6Var.a, t6Var.u, adId)) {
            t6Var.f();
        }
    }

    @Override // com.ogury.ad.internal.p1
    public final void a(boolean z) {
        this.e.a(z);
    }

    @Override // com.ogury.ad.internal.p1
    public final void a(String str, String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        s3 s3Var = this.f;
        Context context = this.c;
        s3Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            Uri parse = Uri.parse(str);
            Intrinsics.checkNotNull(parse);
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.addFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        } catch (Exception e) {
            com.ogury.core.internal.Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, e);
        }
    }

    @Override // com.ogury.ad.internal.p1
    public final void a(y adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        s7 s7Var = this.g;
        w7 w7Var = new w7(adUnit.b, adUnit.e);
        s7Var.getClass();
        s7.a(w7Var);
    }

    @Override // com.ogury.ad.internal.p1
    public final void a(rg rgVar) {
        this.e.f.setResizeProps(rgVar);
    }

    @Override // com.ogury.ad.internal.p1
    public final void a() {
        String state;
        t6 t6Var = this.e;
        if (t6Var.a()) {
            return;
        }
        t6Var.g.a(t6Var.f, t6Var);
        if (t6Var.i) {
            state = "default";
        } else {
            state = "expanded";
        }
        w6 w6Var = t6Var.p;
        if (w6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mraidCommandExecutor");
            w6Var = null;
        }
        w6Var.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        b8.a(w6Var.a, x6.c(state));
        w6Var.a.setAdState(state);
    }

    @Override // com.ogury.ad.internal.p1
    public final void a(String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        s7 s7Var = this.g;
        r7 r7Var = new r7(adId, "adImpression");
        s7Var.getClass();
        s7.a(r7Var);
    }

    @Override // com.ogury.ad.internal.p1
    public final void b(boolean z) {
        t6 t6Var = this.e;
        t6Var.B.a(t6Var.f, t6Var);
        if (z) {
            return;
        }
        t6Var.f();
    }
}
