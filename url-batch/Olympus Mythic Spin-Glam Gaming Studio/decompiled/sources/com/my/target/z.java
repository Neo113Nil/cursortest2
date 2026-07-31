package com.my.target;

import android.content.Context;
import com.ironsource.O6;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetConfig;
import com.my.target.common.MyTargetManager;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.MyTargetVersion;
import com.my.target.mediation.AdNetworkConfig;
import com.my.target.mediation.AdNetworkLoader;
import com.my.target.pb;
import com.my.target.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes12.dex */
public abstract class z {
    public static z a() {
        return new a();
    }

    public abstract String a(n nVar, Map map, tb tbVar, jg jgVar);

    public abstract void a(String str, n nVar, tb tbVar, jg jgVar, d1 d1Var);

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class a extends z {
        private pb a;

        protected a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str, n nVar, Map map, tb tbVar, jg jgVar, d1 d1Var) {
            mi.a("DefaultAdServiceBuilder: mediation params is loaded");
            a(str, nVar, map, tbVar, jgVar, d1Var);
        }

        @Override // com.my.target.z
        public void a(final String str, final n nVar, final tb tbVar, final jg jgVar, final d1 d1Var) {
            nVar.a().b(0, 1000);
            int g = nVar.g();
            kg.b(g == 0 || g == 1);
            kg.c(g == 0 || g == 2);
            kg.a(g == 0 || g == 4);
            ArrayList arrayList = new ArrayList();
            Iterator it = nVar.b().iterator();
            while (it.hasNext()) {
                AdNetworkLoader loader = ((AdNetworkConfig) it.next()).getLoader();
                if (loader != null) {
                    arrayList.add(loader);
                }
            }
            if (arrayList.isEmpty()) {
                mi.a("DefaultAdServiceBuilder: no AdNetworkLoaders, direct call result");
                a(str, nVar, new HashMap(), tbVar, jgVar, d1Var);
            } else {
                mi.a("DefaultAdServiceBuilder: loading mediation params");
                pb pbVar = new pb(nVar.i(), arrayList, jgVar, new pb.a() { // from class: com.my.target.z$a$$ExternalSyntheticLambda1
                    @Override // com.my.target.pb.a
                    public final void a(Map map) {
                        z.a.this.a(str, nVar, tbVar, jgVar, d1Var, map);
                    }
                });
                this.a = pbVar;
                pbVar.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(final String str, final n nVar, final tb tbVar, final jg jgVar, final d1 d1Var, final Map map) {
            o0.a(new Runnable() { // from class: com.my.target.z$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    z.a.this.b(str, nVar, map, tbVar, jgVar, d1Var);
                }
            });
        }

        final void a(String str, n nVar, Map map, tb tbVar, jg jgVar, d1 d1Var) {
            this.a = null;
            d1Var.accept(str + nVar.j() + "/", a(nVar, map, tbVar, jgVar));
        }

        @Override // com.my.target.z
        public String a(n nVar, Map map, tb tbVar, jg jgVar) {
            HashMap hashMap = new HashMap(map);
            hashMap.putAll(a(nVar, tbVar, jgVar.a));
            return p4.a(hashMap, nVar.a());
        }

        protected int a(n nVar, Context context) {
            return kg.a();
        }

        protected Map a(n nVar, tb tbVar, Context context) {
            HashMap hashMap = new HashMap();
            hashMap.put("formats", nVar.i());
            hashMap.put("adman_ver", MyTargetVersion.VERSION);
            hashMap.put("sdk_ver_int", MyTargetVersion.VERSION_INT);
            MyTargetPrivacy currentPrivacy = MyTargetPrivacy.currentPrivacy();
            Boolean bool = currentPrivacy.userConsent;
            if (bool != null) {
                hashMap.put("user_consent", bool.booleanValue() ? "1" : "0");
            }
            Boolean bool2 = currentPrivacy.ccpaUserConsent;
            if (bool2 != null) {
                hashMap.put("ccpa_user_consent", bool2.booleanValue() ? "1" : "0");
            }
            Boolean bool3 = currentPrivacy.iabUserConsent;
            if (bool3 != null) {
                hashMap.put("iab_user_consent", bool3.booleanValue() ? "1" : "0");
            }
            if (currentPrivacy.userAgeRestricted) {
                hashMap.put("user_age_restricted", "1");
            }
            if (nVar.g() == 0 || nVar.g() == 2) {
                hashMap.put("preloadvideo", "1");
            }
            int d = nVar.d();
            if (d > 0) {
                hashMap.put("count", Integer.toString(d));
            }
            String e = nVar.e();
            if (e != null) {
                hashMap.put("bid_id", e);
            }
            CustomParams h = nVar.h();
            if (currentPrivacy.isConsent()) {
                h.putDataTo(hashMap);
            } else {
                h.putCustomDataToMap(hashMap);
            }
            MyTargetConfig sdkConfig = MyTargetManager.getSdkConfig();
            try {
                hashMap.putAll(u4.b().a(sdkConfig, currentPrivacy, tbVar, context));
            } catch (Throwable th) {
                mi.a("AdServiceBuilder: Error collecting data - " + th);
            }
            String lang = h.getLang();
            if (lang != null) {
                hashMap.put(O6.q, lang);
            }
            int a = a(nVar, context);
            if (a >= 0) {
                hashMap.put("sdk_flags", String.valueOf(a));
            }
            String[] strArr = sdkConfig.testDevices;
            String str = hashMap.get("instance_id");
            if (str != null) {
                if (strArr != null && m0.a(strArr, str)) {
                    hashMap.put("test_mode", "1");
                    mi.a("DefaultAdServiceBuilder: Test mode is enabled on current device");
                } else {
                    mi.a("AdServiceBuilder: Device instanceId is " + str + ". Use this value in adInstance.withTestDevices() to enable test mode on this device.");
                }
            }
            return hashMap;
        }
    }
}
