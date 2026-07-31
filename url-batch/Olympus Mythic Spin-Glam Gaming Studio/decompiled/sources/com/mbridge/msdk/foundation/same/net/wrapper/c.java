package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.CustomInfoManager;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.setting.m;
import com.mbridge.msdk.tracker.network.k;
import com.mbridge.msdk.tracker.network.l;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CommonAsyncHttpRequest.java */
/* loaded from: classes3.dex */
public class c {
    private static final String TAG = "c";
    protected Context mContext;

    public c(Context context) {
        if (context == null) {
            this.mContext = com.mbridge.msdk.foundation.controller.c.n().d();
        } else {
            this.mContext = context.getApplicationContext();
        }
    }

    private String asUrlParams(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = map.get(str);
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "";
                        }
                        sb.append(X3.j.c);
                        sb.append(str);
                        sb.append("=");
                        sb.append(str2);
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b(TAG, e.getMessage());
                }
                sb = null;
            }
            if (sb != null && sb.length() > 0) {
                return (map.containsKey("rk") && map.containsKey("erk") && "1".equals(map.get("erk"))) ? v0.b(sb.toString(), "ebmclXzZOhtU2sRlZxGL8A") : sb.toString();
            }
        }
        return null;
    }

    private static com.mbridge.msdk.tracker.network.h<?> createRequest(int i, int i2, String str, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j) {
        if (i == 0) {
            return new k(i2, str, str2, j, new i(bVar));
        }
        if (i != 1) {
            return null;
        }
        return new com.mbridge.msdk.tracker.network.i(i2, str, str2, j, new i(bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5 A[Catch: Exception -> 0x0102, TRY_ENTER, TryCatch #4 {Exception -> 0x0102, blocks: (B:33:0x00d5, B:35:0x00db, B:55:0x00e6, B:62:0x010c, B:66:0x012a), top: B:31:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void post(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z, boolean z2, String str2, long j) {
        e eVar2;
        String str3;
        String str4;
        com.mbridge.msdk.setting.a j2;
        com.mbridge.msdk.tracker.network.h<?> createRequest;
        int i2;
        String str5;
        int i3;
        String str6;
        if (eVar == null) {
            try {
                eVar2 = new e();
            } catch (Exception e) {
                e = e;
                eVar2 = eVar;
                q0.a(TAG, e.getMessage());
                e eVar3 = eVar2;
                q0.c(TAG, "post url = " + str);
                if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().d)) {
                }
                str4 = str;
                createRequest = createRequest(i, 1, str4, bVar, str2, j);
                if (createRequest != null) {
                }
            }
        } else {
            eVar2 = eVar;
        }
        try {
            if (bVar instanceof com.mbridge.msdk.foundation.same.net.c) {
                String key = ((com.mbridge.msdk.foundation.same.net.c) bVar).getKey();
                String isRKE = ((com.mbridge.msdk.foundation.same.net.c) bVar).isRKE();
                if (!TextUtils.isEmpty(key)) {
                    eVar2.a("rk", key);
                    eVar2.a("erk", isRKE);
                }
            }
            try {
                addExtraParams(str, eVar2);
                f.k(eVar2);
                com.mbridge.msdk.foundation.same.net.e a = com.mbridge.msdk.foundation.same.net.utils.c.b().a(eVar2);
                if (a != null && bVar != null) {
                    bVar.onSuccess(a);
                    return;
                }
            } catch (Exception e2) {
                e = e2;
                q0.a(TAG, e.getMessage());
                e eVar32 = eVar2;
                q0.c(TAG, "post url = " + str);
                if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().d)) {
                }
                str4 = str;
                createRequest = createRequest(i, 1, str4, bVar, str2, j);
                if (createRequest != null) {
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
        e eVar322 = eVar2;
        q0.c(TAG, "post url = " + str);
        if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().d)) {
            com.mbridge.msdk.setting.g f = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (f != null) {
                i3 = f.M();
                try {
                    str6 = eVar322.a().get("data");
                    if (!z2) {
                        try {
                            if (!com.mbridge.msdk.foundation.same.report.b.a(f, str6)) {
                                return;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            e.printStackTrace();
                            str5 = f.k();
                            i2 = f.E0();
                            eVar322.a("a_stid", f.a());
                            eVar322.a("country_code", str5);
                            if (i3 != 2) {
                            }
                            str4 = str;
                            createRequest = createRequest(i, 1, str4, bVar, str2, j);
                            if (createRequest != null) {
                            }
                        }
                    }
                } catch (Exception e5) {
                    e = e5;
                    str6 = "";
                }
                str5 = f.k();
                i2 = f.E0();
                eVar322.a("a_stid", f.a());
            } else {
                i2 = 0;
                str5 = "UNKNOWN";
                i3 = 1;
                str6 = "";
            }
            eVar322.a("country_code", str5);
            try {
                if (i3 != 2) {
                    if (TextUtils.isEmpty(str6)) {
                        return;
                    }
                    if (com.mbridge.msdk.foundation.same.report.b.a(f, str6)) {
                        if (i2 == 1 || i2 == 3) {
                            com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().j, com.mbridge.msdk.foundation.same.net.utils.d.h().n, eVar322.toString(), false, bVar, false);
                            return;
                        }
                    } else if (z2) {
                        if (i2 != 1 && i2 != 3) {
                            return;
                        }
                        com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().j, com.mbridge.msdk.foundation.same.net.utils.d.h().n, eVar322.toString(), false, bVar, false);
                        return;
                    }
                } else if (i3 == 1) {
                    com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().j, com.mbridge.msdk.foundation.same.net.utils.d.h().n, eVar322.toString(), false, bVar, false);
                    return;
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        } else if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().h)) {
            com.mbridge.msdk.setting.g f2 = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (f2 != null && (j2 = f2.j()) != null && j2.h() == 1) {
                com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().l, com.mbridge.msdk.foundation.same.net.utils.d.h().p, eVar322.toString(), false, bVar, false);
                return;
            }
        } else if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().d0)) {
            if (eVar322 != null) {
                str3 = str + "?" + eVar322.toString();
            } else {
                str3 = str;
            }
            JSONArray b = com.mbridge.msdk.foundation.db.middle.b.a().b();
            if (b != null) {
                String jSONArray = b.toString();
                eVar322 = new e();
                eVar322.a(e.k, jSONArray);
            }
            str4 = str3;
            createRequest = createRequest(i, 1, str4, bVar, str2, j);
            if (createRequest != null) {
                if (eVar322 != null && eVar322.a() != null) {
                    String str7 = eVar322.a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                    if (TextUtils.isEmpty(str7)) {
                        str7 = "";
                    }
                    createRequest.a("local_id", str7);
                    String str8 = eVar322.a().get("ad_type");
                    createRequest.a("ad_type", TextUtils.isEmpty(str8) ? "" : str8);
                    createRequest.a(eVar322.a());
                }
                createRequest.d(canTrack());
                createRequest.b("Content-Type", "application/x-www-form-urlencoded");
                l.a().b().a(createRequest);
                return;
            }
            return;
        }
        str4 = str;
        createRequest = createRequest(i, 1, str4, bVar, str2, j);
        if (createRequest != null) {
        }
    }

    public void addExtraParams(String str, e eVar) {
        if (eVar == null) {
            q0.b(TAG, "addExtraParams error, params is null,frame work error");
            return;
        }
        String a = Aa.a();
        if (a == null) {
            a = "";
        }
        eVar.a("channel", a);
        eVar.a("band_width", com.mbridge.msdk.foundation.same.net.a.b().a() + "");
        eVar.a("open", com.mbridge.msdk.foundation.same.a.S);
        if (com.mbridge.msdk.util.b.a() && !TextUtils.isEmpty(str) && str.contains("setting")) {
            String b = Aa.b();
            if (!TextUtils.isEmpty(b)) {
                eVar.a("keyword", b);
            }
        }
        String str2 = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (str2 != null) {
            String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(str2, str);
            if (!TextUtils.isEmpty(customInfoByUnitId)) {
                eVar.a("ch_info", customInfoByUnitId);
            }
            m e = com.mbridge.msdk.setting.i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), str2);
            if (e != null && !TextUtils.isEmpty(e.a())) {
                eVar.a("u_stid", e.a());
            }
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            eVar.a("dev_source", "2");
        }
        if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
            eVar.a("re_domain", "1");
        }
    }

    protected boolean canTrack() {
        return true;
    }

    public void choiceV3OrV5BySetting(int i, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str, long j) {
        e eVar2;
        com.mbridge.msdk.setting.g d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        int v0 = TextUtils.isEmpty(str) ? d.v0() : d.D();
        String a = com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, v0);
        if (v0 < 2) {
            postV5(i, a, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j);
            return;
        }
        if (v0 % 2 == 0) {
            eVar2 = eVar == null ? new e() : eVar;
            JSONArray b = com.mbridge.msdk.foundation.db.middle.b.a().b();
            if (b != null) {
                String jSONArray = b.toString();
                int i2 = com.mbridge.msdk.foundation.same.net.utils.d.h().i();
                if (i2 > 0 && jSONArray.length() > i2) {
                    post(i, a, eVar2, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j);
                    return;
                }
                eVar2.a(e.k, jSONArray);
            }
        } else {
            eVar2 = eVar;
        }
        getLoadOrSetting(i, a, eVar2, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j);
    }

    public void get(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j) {
        get(i, str, eVar, bVar, false, false, str2, j);
    }

    public void getCampaign(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, long j) {
        e eVar2;
        try {
            com.mbridge.msdk.setting.g d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            int v0 = TextUtils.isEmpty(str) ? d.v0() : d.D();
            String a = com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, v0);
            if (v0 < 2) {
                postV5(i, a, eVar, bVar, true, MBInterstitialActivity.INTENT_CAMAPIGN, j);
                return;
            }
            if (v0 % 2 == 0) {
                eVar2 = eVar == null ? new e() : eVar;
                JSONArray b = com.mbridge.msdk.foundation.db.middle.b.a().b();
                if (b != null) {
                    String jSONArray = b.toString();
                    int i2 = com.mbridge.msdk.foundation.same.net.utils.d.h().i();
                    if (i2 > 0 && jSONArray.length() > i2) {
                        post(i, a, eVar2, bVar, true, false, MBInterstitialActivity.INTENT_CAMAPIGN, j);
                        return;
                    }
                    eVar2.a(e.k, jSONArray);
                }
            } else {
                eVar2 = eVar;
            }
            get(i, a, eVar2, bVar, true, true, MBInterstitialActivity.INTENT_CAMAPIGN, j);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e.getMessage());
            }
        }
    }

    public void getLoadOrSetting(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j) {
        getLoadOrSetting(i, str, eVar, bVar, true, str2, j);
    }

    public void postFocusReport(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j) {
        post(i, str, eVar, bVar, false, true, str2, j);
    }

    public void postV5(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j) {
        String str3 = eVar.a().get("sign");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        eVar.a("ts", currentTimeMillis + "");
        eVar.a("st", SameMD5.getMD5(currentTimeMillis + str3));
        post(i, str, eVar, bVar, false, false, str2, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0202 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void get(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z, boolean z2, String str2, long j) {
        e eVar2;
        e eVar3;
        String str3;
        com.mbridge.msdk.setting.g d;
        com.mbridge.msdk.tracker.network.h<?> createRequest;
        if (eVar == null) {
            try {
                eVar2 = new e();
            } catch (Exception e) {
                e = e;
                eVar2 = eVar;
                q0.a(TAG, e.getMessage());
                eVar3 = eVar2;
                if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().i)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(ShareConstants.MEDIA_URI, com.mbridge.msdk.foundation.same.net.utils.d.h().m + Uri.parse(str).getPath());
                            jSONObject.put("data", eVar3.b());
                        } catch (Throwable th) {
                            q0.b(TAG, th.getMessage());
                        }
                        com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().m, com.mbridge.msdk.foundation.same.net.utils.d.h().q, jSONObject.toString(), true, bVar, eVar3 == null && !TextUtils.isEmpty(eVar3.c().optString("rk")) && eVar3.c().optString("erk").equals("1"));
                        return;
                    } catch (Throwable th2) {
                        q0.b(TAG, th2.getMessage());
                    }
                }
                if (eVar3 != null) {
                }
                str3 = str;
                d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (str3.length() < d.s0()) {
                }
                if (str3.length() < d.N()) {
                }
                createRequest = createRequest(i, 0, str, bVar, str2, j);
                if (createRequest == null) {
                }
            }
        } else {
            eVar2 = eVar;
        }
        try {
            if (bVar instanceof com.mbridge.msdk.foundation.same.net.c) {
                String key = ((com.mbridge.msdk.foundation.same.net.c) bVar).getKey();
                String isRKE = ((com.mbridge.msdk.foundation.same.net.c) bVar).isRKE();
                if (!TextUtils.isEmpty(key)) {
                    eVar2.a("rk", key);
                    eVar2.a("erk", isRKE);
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            addExtraParams(str, eVar2);
            f.k(eVar2);
            String str4 = eVar2.a().get("sign");
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            long currentTimeMillis = System.currentTimeMillis();
            eVar2.a("ts", currentTimeMillis + "");
            if (com.mbridge.msdk.util.b.a()) {
                eVar2.a("st", SameMD5.getMD5(str4 + currentTimeMillis));
            } else {
                eVar2.a("st", SameMD5.getMD5(currentTimeMillis + str4));
            }
            com.mbridge.msdk.foundation.same.net.e a = com.mbridge.msdk.foundation.same.net.utils.c.b().a(eVar2);
            if (a != null && bVar != null) {
                bVar.onSuccess(a);
                return;
            }
        } catch (Exception e3) {
            e = e3;
            q0.a(TAG, e.getMessage());
            eVar3 = eVar2;
            if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().i)) {
            }
            if (eVar3 != null) {
            }
            str3 = str;
            d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (str3.length() < d.s0()) {
            }
            if (str3.length() < d.N()) {
            }
            createRequest = createRequest(i, 0, str, bVar, str2, j);
            if (createRequest == null) {
            }
        }
        eVar3 = eVar2;
        if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().i) && com.mbridge.msdk.foundation.same.net.utils.d.h().s) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ShareConstants.MEDIA_URI, com.mbridge.msdk.foundation.same.net.utils.d.h().m + Uri.parse(str).getPath());
            jSONObject2.put("data", eVar3.b());
            com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().m, com.mbridge.msdk.foundation.same.net.utils.d.h().q, jSONObject2.toString(), true, bVar, eVar3 == null && !TextUtils.isEmpty(eVar3.c().optString("rk")) && eVar3.c().optString("erk").equals("1"));
            return;
        }
        if (eVar3 != null) {
            if (TextUtils.isEmpty(eVar3.c().optString("rk")) || !eVar3.c().optString("erk").equals("1")) {
                str3 = str + "?" + eVar3.toString();
            } else {
                try {
                    str3 = str + "?p=" + URLEncoder.encode(v0.b(eVar3.toString(), "ebmclXzZOhtU2sRlZxGL8A"), "UTF-8");
                } catch (Exception unused) {
                }
            }
            d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (str3.length() < d.s0() && str3.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().i)) {
                post(i, str, eVar3, bVar, z2, false, str2, j);
                return;
            }
            if (str3.length() < d.N() && z) {
                post(i, str, eVar3, bVar, z2, false, str2, j);
                return;
            }
            createRequest = createRequest(i, 0, str, bVar, str2, j);
            if (createRequest == null) {
                if (eVar3 != null && eVar3.a() != null) {
                    String str5 = eVar3.a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                    if (TextUtils.isEmpty(str5)) {
                        str5 = "";
                    }
                    createRequest.a("local_id", str5);
                    String str6 = eVar3.a().get("ad_type");
                    createRequest.a("ad_type", TextUtils.isEmpty(str6) ? "" : str6);
                    createRequest.a(eVar3.a());
                }
                createRequest.d(canTrack());
                l.a().b().a(createRequest);
                return;
            }
            return;
        }
        str3 = str;
        d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (str3.length() < d.s0()) {
        }
        if (str3.length() < d.N()) {
        }
        createRequest = createRequest(i, 0, str, bVar, str2, j);
        if (createRequest == null) {
        }
    }

    public void getLoadOrSetting(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z, String str2, long j) {
        get(i, str, eVar, bVar, z, false, str2, j);
    }

    public void postV5(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z, String str2, long j) {
        String str3 = eVar.a().get("sign");
        if (str3 == null) {
            str3 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        eVar.a("ts", currentTimeMillis + "");
        eVar.a("st", SameMD5.getMD5(currentTimeMillis + str3));
        post(i, str, eVar, bVar, z, false, str2, j);
    }

    public void get(int i, String str, Map<String, String> map, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("app_id", com.mbridge.msdk.foundation.controller.c.n().b());
        map.put("sdk_version", MBConfiguration.SDK_VERSION);
        map.put("platform", "1");
        String asUrlParams = asUrlParams(map);
        if (!TextUtils.isEmpty(asUrlParams)) {
            str = str + "?" + asUrlParams;
        }
        String str3 = str;
        if (MBridgeConstans.DEBUG) {
            q0.a("AppletsModel", "get wx scheme url = " + str3);
        }
        com.mbridge.msdk.tracker.network.h<?> createRequest = createRequest(i, 0, str3, bVar, str2, j);
        if (createRequest != null) {
            String str4 = map.get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            createRequest.a("local_id", str4);
            String str5 = map.get("ad_type");
            createRequest.a("ad_type", TextUtils.isEmpty(str5) ? "" : str5);
            createRequest.a(map);
            createRequest.d(canTrack());
            l.a().b().a(createRequest);
        }
    }

    public void post(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j) {
        post(i, str, eVar, bVar, false, false, str2, j);
    }
}
