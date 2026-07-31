package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.yandex.mobile.ads.common.AdActivity;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;

/* loaded from: classes5.dex */
public final class j2 implements e2 {
    public final AdActivity a;
    public final w1 b;
    public final o1 c;

    public j2(AdActivity adActivity, w1 w1Var, yu2 yu2Var) {
        Context context = ((nt3) yu2Var).a;
        o1 o1Var = new o1(pr.a(context, context));
        this.a = adActivity;
        this.b = w1Var;
        this.c = o1Var;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.y);
        p0.startActivityForResult(p1, p2);
    }

    @Override // yads.e2
    public final void a() {
    }

    @Override // yads.e2
    public final void b() {
    }

    @Override // yads.e2
    public final void c() {
        Object m8023constructorimpl;
        o1 o1Var = this.c;
        AdActivity adActivity = this.a;
        w1 w1Var = this.b;
        o1Var.getClass();
        yf0 yf0Var = w1Var.g;
        if (yf0Var == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(adActivity, yf0Var.a, 0);
            Unit unit = Unit.INSTANCE;
            p1 p1Var = o1Var.a;
            io2 a = p1Var.b.a(w1Var.b, w1Var.a);
            fo2 fo2Var = fo2.c;
            Map map = a.a;
            p1Var.a.a(new ho2("activity_result_opened", MapsKt.toMutableMap(map), a.b));
            yf0Var.b.mo4828invoke();
            adActivity.finish();
            m8023constructorimpl = Result.m8023constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            adActivity.finish();
            o1Var.a.a.reportError("Failed to register ActivityResult", m8026exceptionOrNullimpl);
            yf0Var.c.invoke(m8026exceptionOrNullimpl);
        }
    }

    @Override // yads.e2
    public final boolean d() {
        return true;
    }

    @Override // yads.e2
    public final void f() {
    }

    @Override // yads.e2
    public final void g() {
    }

    @Override // yads.e2
    public final void onAdClosed() {
    }
}
