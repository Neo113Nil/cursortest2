package yads;

import com.yandex.mobile.ads.common.AdRequest;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aq3 {
    public final d8 a(AdRequest adRequest) {
        vw2 vw2Var;
        String adUnitId = adRequest.getAdUnitId();
        adRequest.getTargeting();
        adRequest.getTargeting();
        adRequest.getTargeting();
        adRequest.getTargeting();
        adRequest.getTargeting();
        Map<String, String> parameters = adRequest.getParameters() != null ? adRequest.getParameters() : null;
        String biddingData = adRequest.getBiddingData() != null ? adRequest.getBiddingData() : null;
        ip2 a = adRequest.getPreferredTheme() != null ? kp2.a(adRequest.getPreferredTheme()) : null;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        ua a2 = vw2Var2.a();
        f00 f00Var = a2 != null ? new f00(a2.a, a2.b, a2.c) : null;
        return new d8(adUnitId, null, null, null, null, null, parameters, biddingData, a, false, null, f00Var != null ? f00Var : null);
    }
}
