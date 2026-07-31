package yads;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.reflect.KProperty;

/* loaded from: classes15.dex */
public final class fq1 implements xw0 {
    public final r7 a;
    public final wn1 b;
    public final hq1 c;
    public final or2 d;
    public final so1 e;
    public final fo1 f;

    public fq1(r7 r7Var, wn1 wn1Var, hq1 hq1Var, or2 or2Var, so1 so1Var, fo1 fo1Var) {
        this.a = r7Var;
        this.b = wn1Var;
        this.c = hq1Var;
        this.d = or2Var;
        this.e = so1Var;
        this.f = fo1Var;
    }

    @Override // yads.xw0
    public final /* bridge */ String a() {
        return null;
    }

    @Override // yads.xw0
    public final List b() {
        return CollectionsKt.emptyList();
    }

    @Override // yads.xw0
    public final /* bridge */ String getAdInfo() {
        return null;
    }

    @Override // yads.xw0
    public final Object a(mx0 mx0Var, Activity activity) {
        Object m8023constructorimpl;
        tn1 tn1Var;
        br2 br2Var = (br2) mx0Var;
        try {
            Result.Companion companion = Result.INSTANCE;
            MediatedRewardedAdapter mediatedRewardedAdapter = this.c.a;
            if (mediatedRewardedAdapter != null) {
                qm2 qm2Var = this.d.d;
                KProperty kProperty = or2.g[0];
                qm2Var.getClass();
                qm2Var.a = new WeakReference(br2Var);
                r7 r7Var = this.a;
                if (r7Var.b()) {
                    ((y7) r7Var.h.getValue()).onAdDisplayed();
                }
                this.f.a(activity);
                try {
                    mediatedRewardedAdapter.showRewardedAd(activity);
                } catch (Exception e) {
                    this.f.a();
                    throw e;
                }
            }
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null && (tn1Var = this.b.o) != null) {
            Context applicationContext = activity.getApplicationContext();
            boolean z = ob1.a;
            this.e.a(applicationContext, fo2.e, tn1Var.b, tn1Var.c.b().getNetworkName(), MapsKt.mapOf(TuplesKt.to("reason", MapsKt.mapOf(TuplesKt.to("exception_in_adapter", m8026exceptionOrNullimpl.toString())))));
        }
        return m8023constructorimpl;
    }

    @Override // yads.xw0
    public final void a(Context context) {
        this.f.a();
        this.a.a();
        this.b.a(context);
    }

    @Override // yads.xw0
    public final void a(Context context, t8 t8Var) {
        this.b.a(context, this.d);
    }
}
