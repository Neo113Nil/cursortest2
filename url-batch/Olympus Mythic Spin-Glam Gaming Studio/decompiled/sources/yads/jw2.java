package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes14.dex */
public final class jw2 implements l32 {
    public static final /* synthetic */ KProperty[] h = {ra.a(jw2.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", 0), ra.a(jw2.class, "adQualityVerifierController", "getAdQualityVerifierController()Lcom/monetization/ads/base/quality/AdQualityVerifierController;", 0)};
    public final km a;
    public final v3 b;
    public final dw2 c;
    public final mt2 d;
    public final s22 e;
    public final qm2 f;
    public final qm2 g;

    public jw2(yu2 yu2Var, x02 x02Var, km kmVar, v3 v3Var) {
        dw2 dw2Var = new dw2(yu2Var);
        mt2 mt2Var = new mt2(kmVar.b, kmVar.c);
        s22 s22Var = new s22(v3Var);
        this.a = kmVar;
        this.b = v3Var;
        this.c = dw2Var;
        this.d = mt2Var;
        this.e = s22Var;
        this.f = new qm2(x02Var);
        this.g = new qm2(kmVar.d);
    }

    @Override // yads.l32
    public final void a(Context context, t8 t8Var) {
        qm2 qm2Var = this.f;
        KProperty[] kPropertyArr = h;
        KProperty kProperty = kPropertyArr[0];
        x02 x02Var = (x02) qm2Var.a.get();
        qm2 qm2Var2 = this.g;
        KProperty kProperty2 = kPropertyArr[1];
        r7 r7Var = (r7) qm2Var2.a.get();
        if (x02Var == null || r7Var == null) {
            return;
        }
        this.a.a.a(h5.c, null);
        s12 s12Var = (s12) t8Var.t;
        v3 v3Var = this.b;
        u22 u22Var = new u22();
        this.d.a(context, t8Var, this.e);
        mt2 mt2Var = this.d;
        mt2Var.getClass();
        Map emptyMap = MapsKt.emptyMap();
        if ((TypeIntrinsics.isMutableMap(emptyMap) ? emptyMap : null) == null) {
            new LinkedHashMap();
        }
        io2 a = u22Var.a(v3Var, t8Var, s12Var);
        go2 go2Var = go2.c;
        a.b("success", "status");
        mt2Var.a(context, t8Var, fo2.g, a);
        dw2 dw2Var = this.c;
        hx2 hx2Var = new hx2();
        yu2 yu2Var = dw2Var.a;
        l02 l02Var = new l02(new jt2(t8Var), new it2(yu2Var), hx2Var, new tv2(yu2Var, t8Var), new yw2());
        if (x02Var.r == l5.b) {
            return;
        }
        s12 s12Var2 = (s12) t8Var.t;
        zz1 zz1Var = x02Var.D;
        BuildersKt__Builders_commonKt.launch$default(zz1Var.d, null, null, new yz1(zz1Var, t8Var, s12Var2, l02Var, x02Var.E, null), 3, null);
    }
}
