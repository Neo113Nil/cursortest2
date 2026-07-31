package yads;

import android.content.Context;
import com.ironsource.X3;
import com.mobilefuse.sdk.MobileFuseDefaults;
import io.appmetrica.analytics.AppMetrica;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes3.dex */
public final class gu2 {
    public final ic a;
    public final pm0 b;
    public final i5 c;
    public final qu2 d;
    public final lu2 e;
    public final zo2 f;
    public final nu2 g;
    public final b43 h;
    public final Context i;

    public gu2(Context context, i5 i5Var, ic icVar, pm0 pm0Var, mt1 mt1Var) {
        lu2 lu2Var;
        qu2 qu2Var = new qu2(context, mt1Var);
        lu2 lu2Var2 = lu2.c;
        if (lu2Var2 == null) {
            synchronized (lu2.b) {
                lu2Var = lu2.c;
                if (lu2Var == null) {
                    lu2Var = new lu2();
                    lu2.c = lu2Var;
                }
            }
            lu2Var2 = lu2Var;
        }
        zo2 a = yo2.a();
        nu2 nu2Var = new nu2();
        b43 b43Var = new b43(mt1Var);
        this.a = icVar;
        this.b = pm0Var;
        this.c = i5Var;
        this.d = qu2Var;
        this.e = lu2Var2;
        this.f = a;
        this.g = nu2Var;
        this.h = b43Var;
        this.i = context.getApplicationContext();
    }

    public final void a(fy2 fy2Var, k51 k51Var, iu2 iu2Var) {
        String str;
        String str2;
        gh0 gh0Var;
        bu2 a = uw2.a().a(this.i);
        if (a != null && !this.d.a()) {
            uy uyVar = uy.d;
            if (iu2Var.a.isActive()) {
                CancellableContinuationImpl cancellableContinuationImpl = iu2Var.a;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(new vu2(a, uyVar)));
                return;
            }
            return;
        }
        ru2 ru2Var = new ru2(this.i, this.e, iu2Var, this.c);
        mt1 mt1Var = this.h.a;
        fo2 fo2Var = fo2.c;
        mt1Var.a(new ho2("sdk_configuration_request", MapsKt.toMutableMap(MapsKt.mapOf(TuplesKt.to("call_source", k51Var.b))), (c) null));
        om0 om0Var = this.b.a;
        Context context = this.i;
        String str3 = om0Var.e;
        if (str3 == null || str3.length() == 0) {
            str = null;
        } else {
            nu2 nu2Var = this.g;
            ic icVar = this.a;
            nu2Var.getClass();
            boolean b = fy2Var.b(context);
            st0 st0Var = new st0(b);
            st0Var.z = om0Var.b();
            st0Var.r = om0Var.d;
            mc mcVar = icVar.a;
            boolean z = icVar.c;
            if (mcVar != null) {
                st0Var.S = Boolean.valueOf(mcVar.b);
                st0Var.T = Boolean.valueOf(z);
                String str4 = mcVar.a;
                st0Var.e.getClass();
                boolean z2 = (str4 == null || str4.length() == 0 || Intrinsics.areEqual(MobileFuseDefaults.ADVERTISING_ID_ZEROS, str4)) ? false : true;
                if (!b && Intrinsics.areEqual(st0Var.S, Boolean.FALSE) && z2) {
                    st0Var.U = str4;
                }
            }
            mc mcVar2 = icVar.b;
            if (mcVar2 != null) {
                st0Var.V = Boolean.valueOf(mcVar2.b);
                String str5 = mcVar2.a;
                st0Var.e.getClass();
                boolean z3 = (str5 == null || str5.length() == 0 || Intrinsics.areEqual(MobileFuseDefaults.ADVERTISING_ID_ZEROS, str5)) ? false : true;
                if (!b && Intrinsics.areEqual(st0Var.V, Boolean.FALSE) && z3) {
                    st0Var.W = str5;
                }
            }
            st0Var.c.getClass();
            try {
                gf.a(context).b.getClass();
                str2 = AppMetrica.getLibraryVersion();
            } catch (Throwable unused) {
                boolean z4 = ob1.a;
                str2 = null;
            }
            st0Var.G0 = str2;
            st0Var.H = Integer.valueOf(hl3.d(context));
            st0Var.I = Integer.valueOf(hl3.b(context));
            st0Var.J = Float.valueOf(context.getResources().getDisplayMetrics().density);
            st0Var.v0 = hl3.a(context);
            try {
                gh0Var = wo3.a(context);
            } catch (Throwable unused2) {
                boolean z5 = ob1.a;
                gh0Var = gh0.g;
            }
            st0Var.w0 = gh0Var.a;
            st0Var.x0 = gh0Var.b;
            st0Var.y0 = gh0Var.c;
            st0Var.z0 = gh0Var.d;
            st0Var.A0 = gh0Var.e;
            st0Var.B0 = gh0Var.f;
            st0 b2 = st0Var.b();
            b2.l = fy2.a(context);
            st0 a2 = b2.a(context, om0Var.a);
            a2.r0 = context.getPackageName();
            a2.s0 = ff.a(context);
            a2.t0 = ff.b(context);
            a2.E0 = a2.d.a("%d.%d%d");
            a2.F0 = a2.d.a("%d.%d.%d");
            st0 c = a2.c();
            c.k = true;
            String[] strArr = {new wt0(c.a()).toString(), CollectionsKt.joinToString$default(om0Var.b, X3.j.c, null, null, 0, null, mu2.b, 30, null)};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str6 = strArr[i];
                if (!StringsKt.isBlank(str6)) {
                    arrayList.add(str6);
                }
            }
            String a3 = nu2Var.a.a(context, CollectionsKt.joinToString$default(arrayList, X3.j.c, null, null, 0, null, null, 62, null));
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            if (!Intrinsics.areEqual(String.valueOf(StringsKt.last(sb)), "/")) {
                sb.append("/");
            }
            sb.append("v1/startup");
            sb.append("?");
            sb.append(a3);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            str = sb2;
        }
        if (str == null || str.length() == 0) {
            ru2Var.a((hm3) new z3(f4.j));
            return;
        }
        pu2 pu2Var = new pu2(this.i, str, this.d, om0Var.c, ru2Var, ru2Var);
        pu2Var.q = this;
        this.c.a(h5.l, null);
        zo2 zo2Var = this.f;
        Context context2 = this.i;
        synchronized (zo2Var) {
            g92.a(context2).a(pu2Var);
        }
    }
}
