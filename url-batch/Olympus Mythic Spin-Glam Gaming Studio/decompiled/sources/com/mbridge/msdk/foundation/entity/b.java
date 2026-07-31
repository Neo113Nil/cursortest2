package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: BaseCampaignUnit.java */
/* loaded from: classes9.dex */
public abstract class b {
    public static final String JSON_KEY_ADS = "ads";
    public static final String JSON_KEY_AD_HTML = "cam_html";
    public static final String JSON_KEY_AD_TYPE = "ad_type";
    public static final String JSON_KEY_AD_ZIP = "cam_tpl_url";
    public static final String JSON_KEY_BANNER_HTML = "cam_html";
    public static final String JSON_KEY_BANNER_URL = "cam_tpl_url";
    public static final String JSON_KEY_CSP = "csp";
    public static final String JSON_KEY_C_I = "c_i";
    public static final String JSON_KEY_DO = "do";
    public static final String JSON_KEY_ENCRYPT_PRICE = "encrypt_p";
    public static final String JSON_KEY_END_SCREEN_URL = "end_screen_url";
    public static final String JSON_KEY_FRAME_ADS = "frames";
    public static final String JSON_KEY_HTML_URL = "html_url";
    public static final String JSON_KEY_IA_EXT1 = "ia_all_ext1";
    public static final String JSON_KEY_IA_EXT2 = "ia_all_ext2";
    public static final String JSON_KEY_IA_ICON = "ia_icon";
    public static final String JSON_KEY_IA_ORI = "ia_ori";
    public static final String JSON_KEY_IA_RST = "ia_rst";
    public static final String JSON_KEY_IA_URL = "ia_url";
    public static final String JSON_KEY_JM_DO = "jm_do";
    public static final String JSON_KEY_MOF_TEMPLATE_URL = "mof_template_url";
    public static final String JSON_KEY_MOF_TPLID = "mof_tplid";
    public static final String JSON_KEY_NSCPT = "nscpt";
    public static final String JSON_KEY_ONLY_IMPRESSION_URL = "only_impression_url";
    public static final String JSON_KEY_PARENT_SESSION_ID = "parent_session_id";
    public static final String JSON_KEY_PV_URLS = "pv_urls";
    public static final String JSON_KEY_REPLACE_TMP = "replace_tmp";
    public static final String JSON_KEY_REQ_EXT_DATA = "req_ext_data";
    public static final String JSON_KEY_RKS = "rks";
    public static final String JSON_KEY_SECOND_REQUEST_INDEX = "r_index";
    public static final String JSON_KEY_SECOND_SHOW_INDEX = "s_show_index";
    public static final String JSON_KEY_SESSION_ID = "a";
    public static final String JSON_KEY_SH = "sh";
    public static final String JSON_KEY_TEMPLATE = "template";
    public static final String JSON_KEY_TK_TCP_PORT = "tk_tcp_port";
    public static final String JSON_KEY_TOKEN_RULE = "token_r";
    public static final String JSON_KEY_UNIT_SIZE = "unit_size";
    public static final String JSON_KEY_VCN = "vcn";
    public static final String KEY_IRLFA = "irlfa";
    private static final String TAG = "b";
    private String adHtml;
    private int adType;
    private String adZip;
    public ArrayList<CampaignEx> ads;
    private String bannerHtml;
    private String bannerUrl;
    private String csp;
    private String domain;
    private double ecppv;
    private HashMap<String, String> epMap;
    private String htmlUrl;
    private String ia_all_ext1;
    private String ia_all_ext2;
    private String ia_icon;
    private int ia_ori;
    private int ia_rst;
    private String ia_url;
    private int jmDo;
    private List<Frame> listFrames;
    private String localRequestId;
    private com.mbridge.msdk.foundation.same.report.metrics.c metricsData;
    private String onlyImpressionUrl;
    private String parentSessionId;
    private String requestId;
    private HashMap<String, String> rks;
    private String sessionId;
    private String sh;
    private int template;
    private int tokenRule;
    private String unitSize;
    private int vcn;
    protected StringBuffer cParams = new StringBuffer();
    private String encryptPrice = "";
    private String msg = "";
    private int activitySwitch = 1;
    private int secondRequestIndex = 0;
    private int secondShowIndex = 0;

    private static void getSysIDAndBKUPID(JSONObject jSONObject) {
        FastKV fastKV = null;
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            try {
                fastKV = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), k0.a("H+tU+FeXHM==")).build();
            } catch (Exception unused) {
            }
        }
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("b");
        String optString2 = jSONObject.optString("c");
        if (fastKV != null) {
            try {
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    if (!TextUtils.isEmpty(optString) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.V, optString)) {
                        com.mbridge.msdk.foundation.same.a.V = optString;
                        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b", com.mbridge.msdk.foundation.same.a.V);
                        try {
                            fastKV.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                        } catch (Exception unused2) {
                        }
                    }
                    if (!TextUtils.isEmpty(optString2) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.g, optString2)) {
                        com.mbridge.msdk.foundation.same.a.g = optString2;
                        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.g);
                        try {
                            fastKV.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.g);
                        } catch (Exception unused3) {
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                Context d = com.mbridge.msdk.foundation.controller.c.n().d();
                if (d != null) {
                    if (!TextUtils.isEmpty(optString) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.V, optString)) {
                        com.mbridge.msdk.foundation.same.a.V = optString;
                        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b", com.mbridge.msdk.foundation.same.a.V);
                        SharedPreferences sharedPreferences = d.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
                        if (sharedPreferences != null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                            edit.apply();
                        }
                    }
                    if (!TextUtils.isEmpty(optString2) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.g, optString2)) {
                        com.mbridge.msdk.foundation.same.a.g = optString2;
                        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.g);
                        SharedPreferences sharedPreferences2 = d.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
                        if (sharedPreferences2 != null) {
                            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                            edit2.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.g);
                            edit2.apply();
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try {
            if (TextUtils.isEmpty(optString) && TextUtils.isEmpty(optString2)) {
                return;
            }
            new com.mbridge.msdk.config.component.common.util.d().a(optString, optString2);
        } catch (Throwable th) {
            q0.b(TAG, th.getMessage());
        }
    }

    public static CampaignUnit parseCampaignUnit(JSONObject jSONObject) {
        return parseCampaignUnit(jSONObject, "");
    }

    public static CampaignUnit parseV5CampaignUnit(JSONObject jSONObject) {
        return parseV5CampaignUnit(jSONObject, "");
    }

    public abstract String assembCParams();

    public int getActivitySwitch() {
        return this.activitySwitch;
    }

    public String getAdHtml() {
        return this.adHtml;
    }

    public int getAdType() {
        return this.adType;
    }

    public String getAdZip() {
        return this.adZip;
    }

    public ArrayList<CampaignEx> getAds() {
        return this.ads;
    }

    public String getBannerHtml() {
        return this.bannerHtml;
    }

    public String getBannerUrl() {
        return this.bannerUrl;
    }

    public String getCsp() {
        return this.csp;
    }

    public String getDomain() {
        return this.domain;
    }

    public double getEcppv() {
        return this.ecppv;
    }

    public String getEncryptPrice() {
        return this.encryptPrice;
    }

    public HashMap<String, String> getEpMap() {
        return this.epMap;
    }

    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public String getIa_all_ext1() {
        return this.ia_all_ext1;
    }

    public String getIa_all_ext2() {
        return this.ia_all_ext2;
    }

    public String getIa_icon() {
        return this.ia_icon;
    }

    public int getIa_ori() {
        return this.ia_ori;
    }

    public int getIa_rst() {
        return this.ia_rst;
    }

    public String getIa_url() {
        return this.ia_url;
    }

    public int getJmDo() {
        return this.jmDo;
    }

    public List<Frame> getListFrames() {
        return this.listFrames;
    }

    public String getLocalRequestId() {
        return this.localRequestId;
    }

    public com.mbridge.msdk.foundation.same.report.metrics.c getMetricsData() {
        return this.metricsData;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getOnlyImpressionUrl() {
        return this.onlyImpressionUrl;
    }

    public String getParentSessionId() {
        return this.parentSessionId;
    }

    public String getRequestId() {
        try {
            if (!TextUtils.isEmpty(this.requestId)) {
                return this.requestId;
            }
            if (TextUtils.isEmpty(this.onlyImpressionUrl)) {
                return "";
            }
            Uri parse = Uri.parse(this.onlyImpressionUrl);
            if (parse != null) {
                this.requestId = parse.getQueryParameter(CampaignEx.JSON_KEY_AD_K);
            }
            return this.requestId;
        } catch (Exception unused) {
            return "";
        }
    }

    public HashMap<String, String> getRks() {
        return this.rks;
    }

    public int getSecondRequestIndex() {
        return this.secondRequestIndex;
    }

    public int getSecondShowIndex() {
        return this.secondShowIndex;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getSh() {
        return this.sh;
    }

    public int getTemplate() {
        return this.template;
    }

    public int getTokenRule() {
        int i = this.tokenRule;
        if (i == 1) {
            return i;
        }
        return 0;
    }

    public String getUnitSize() {
        return this.unitSize;
    }

    public int getVcn() {
        int i = this.vcn;
        if (i > 1) {
            return i;
        }
        return 1;
    }

    protected Object nullToEmpty(Object obj) {
        return obj == null ? "" : obj;
    }

    public void setActivitySwitch(int i) {
        this.activitySwitch = i;
    }

    public void setAdHtml(String str) {
        this.adHtml = str;
    }

    public void setAdType(int i) {
        this.adType = i;
    }

    public void setAdZip(String str) {
        this.adZip = str;
    }

    public void setAds(ArrayList<CampaignEx> arrayList) {
        this.ads = arrayList;
    }

    public void setBannerHtml(String str) {
        this.bannerHtml = str;
    }

    public void setBannerUrl(String str) {
        this.bannerUrl = str;
    }

    public void setCsp(String str) {
        this.csp = str;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setEcppv(double d) {
        this.ecppv = d;
    }

    public void setEncryptPrice(String str) {
        this.encryptPrice = str;
    }

    public void setEpMap(HashMap<String, String> hashMap) {
        this.epMap = hashMap;
    }

    public void setHtmlUrl(String str) {
        this.htmlUrl = str;
    }

    public void setIa_all_ext1(String str) {
        this.ia_all_ext1 = str;
    }

    public void setIa_all_ext2(String str) {
        this.ia_all_ext2 = str;
    }

    public void setIa_icon(String str) {
        this.ia_icon = str;
    }

    public void setIa_ori(int i) {
        this.ia_ori = i;
    }

    public void setIa_rst(int i) {
        this.ia_rst = i;
    }

    public void setIa_url(String str) {
        this.ia_url = str;
    }

    public void setJmDo(int i) {
        this.jmDo = i;
    }

    public void setListFrames(List<Frame> list) {
        this.listFrames = list;
    }

    public void setLocalRequestId(String str) {
        this.localRequestId = str;
        Iterator<CampaignEx> it = getAds().iterator();
        while (it.hasNext()) {
            it.next().setLocalRequestId(str);
        }
    }

    public void setMetricsData(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        this.metricsData = cVar;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setOnlyImpressionUrl(String str) {
        this.onlyImpressionUrl = str;
    }

    public void setParentSessionId(String str) {
        this.parentSessionId = str;
    }

    public void setRks(HashMap<String, String> hashMap) {
        this.rks = hashMap;
    }

    public void setSecondRequestIndex(int i) {
        this.secondRequestIndex = i;
    }

    public void setSecondShowIndex(int i) {
        this.secondShowIndex = i;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setSh(String str) {
        this.sh = str;
    }

    public void setTemplate(int i) {
        this.template = i;
    }

    public void setTokenRule(int i) {
        this.tokenRule = i;
    }

    public void setUnitSize(String str) {
        this.unitSize = str;
    }

    public void setVcn(int i) {
        this.vcn = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 29, insn: 0x0295: MOVE (r11 I:??[OBJECT, ARRAY]) = (r29 I:??[OBJECT, ARRAY]), block:B:88:0x0295 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v15, types: [com.mbridge.msdk.foundation.entity.b] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25, types: [com.mbridge.msdk.foundation.entity.b] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    public static CampaignUnit parseCampaignUnit(JSONObject jSONObject, String str) {
        CampaignUnit campaignUnit;
        int optInt;
        String optString;
        String str2;
        String str3;
        int i;
        ArrayList arrayList;
        JSONArray optJSONArray;
        String optString2;
        String str4;
        CampaignUnit campaignUnit2;
        String str5;
        Object obj;
        String str6;
        CampaignUnit campaignUnit3;
        int i2;
        String str7;
        String str8;
        CampaignUnit campaignUnit4;
        int i3;
        String str9 = "ads";
        String str10 = "ad_type";
        String str11 = JSON_KEY_PARENT_SESSION_ID;
        String str12 = "a";
        String str13 = CampaignEx.JSON_KEY_ECPPV;
        String str14 = JSON_KEY_ONLY_IMPRESSION_URL;
        if (jSONObject != null) {
            try {
                CampaignUnit campaignUnit5 = new CampaignUnit();
                try {
                    String optString3 = jSONObject.optString(JSON_KEY_RKS);
                    if (!TextUtils.isEmpty(optString3)) {
                        JSONObject jsonObjectInit = MintegralNetworkBridge.jsonObjectInit(optString3);
                        Iterator<String> keys = jsonObjectInit.keys();
                        HashMap<String, String> hashMap = new HashMap<>();
                        while (keys != null && keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(next, jsonObjectInit.optString(next));
                        }
                        campaignUnit5.setRks(hashMap);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        HashMap<String, String> hashMap2 = new HashMap<>();
                        hashMap2.put("encrypt_p", "");
                        hashMap2.put(KEY_IRLFA, "");
                        campaignUnit5.setEpMap(hashMap2);
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject(JSON_KEY_REQ_EXT_DATA);
                    optInt = jSONObject.optInt(JSON_KEY_NSCPT, 1);
                    optString = jSONObject.optString(JSON_KEY_MOF_TEMPLATE_URL, "");
                    int optInt2 = jSONObject.optInt(JSON_KEY_MOF_TPLID, 0);
                    String jSONObject2 = optJSONObject != null ? optJSONObject.toString() : "";
                    new JSONArray();
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("pv_urls");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        str2 = jSONObject2;
                        str3 = "";
                        i = optInt2;
                        arrayList = null;
                    } else {
                        i = optInt2;
                        str2 = jSONObject2;
                        ArrayList arrayList2 = new ArrayList(optJSONArray2.length());
                        str3 = "";
                        for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                            arrayList2.add(optJSONArray2.getString(i4));
                        }
                        arrayList = arrayList2;
                    }
                    com.mbridge.msdk.foundation.db.middle.b.a().a(jSONObject.optJSONObject(JSON_KEY_REPLACE_TMP), true);
                    getSysIDAndBKUPID(jSONObject);
                    campaignUnit5.setSessionId(jSONObject.optString("a"));
                    campaignUnit5.setParentSessionId(jSONObject.optString(JSON_KEY_PARENT_SESSION_ID));
                    campaignUnit5.setAdType(jSONObject.optInt("ad_type"));
                    campaignUnit5.setUnitSize(jSONObject.optString(JSON_KEY_UNIT_SIZE));
                    campaignUnit5.setHtmlUrl(jSONObject.optString(JSON_KEY_HTML_URL));
                    campaignUnit5.setOnlyImpressionUrl(jSONObject.optString(JSON_KEY_ONLY_IMPRESSION_URL));
                    campaignUnit5.setActivitySwitch(jSONObject.optInt(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH));
                    campaignUnit5.setEcppv(jSONObject.optDouble(CampaignEx.JSON_KEY_ECPPV));
                    campaignUnit5.setTemplate(jSONObject.optInt("template"));
                    campaignUnit5.setJmDo(jSONObject.optInt(JSON_KEY_JM_DO));
                    campaignUnit5.setIa_icon(jSONObject.optString("ia_icon"));
                    campaignUnit5.setIa_rst(jSONObject.optInt("ia_rst"));
                    campaignUnit5.setIa_url(jSONObject.optString("ia_url"));
                    campaignUnit5.setIa_ori(jSONObject.optInt("ia_ori"));
                    campaignUnit5.setIa_all_ext1(jSONObject.optString(JSON_KEY_IA_EXT1));
                    campaignUnit5.setIa_all_ext2(jSONObject.optString(JSON_KEY_IA_EXT2));
                    campaignUnit5.setVcn(jSONObject.optInt("vcn"));
                    campaignUnit5.setTokenRule(jSONObject.optInt("token_r"));
                    campaignUnit5.setEncryptPrice(jSONObject.optString("encrypt_p"));
                    campaignUnit5.setSecondRequestIndex(jSONObject.optInt("r_index", 0));
                    campaignUnit5.setSecondShowIndex(jSONObject.optInt("s_show_index", 0));
                    optJSONArray = jSONObject.optJSONArray("ads");
                    campaignUnit = jSONObject.optJSONArray(JSON_KEY_FRAME_ADS);
                    optString2 = jSONObject.optString(JSON_KEY_C_I, str3);
                    g0.a().a(optString2);
                    str4 = "web env is not support";
                    campaignUnit2 = campaignUnit5;
                    str5 = JSON_KEY_END_SCREEN_URL;
                    try {
                    } catch (Exception unused) {
                        campaignUnit = obj;
                    }
                } catch (Exception unused2) {
                    campaignUnit = campaignUnit5;
                }
                if (campaignUnit != 0) {
                    try {
                    } catch (Exception unused3) {
                        campaignUnit = campaignUnit2;
                    }
                    if (campaignUnit.length() > 0) {
                        String str15 = "template";
                        ArrayList arrayList3 = new ArrayList();
                        int i5 = 0;
                        JSONArray jSONArray = campaignUnit;
                        while (i5 < jSONArray.length()) {
                            JSONObject optJSONObject2 = jSONArray.optJSONObject(i5);
                            int i6 = i5;
                            JSONArray jSONArray2 = optJSONObject2.getJSONArray(str9);
                            String str16 = str9;
                            ArrayList arrayList4 = new ArrayList();
                            String str17 = str12;
                            JSONArray jSONArray3 = jSONArray;
                            int i7 = 0;
                            while (i7 < jSONArray2.length()) {
                                JSONObject optJSONObject3 = jSONArray2.optJSONObject(i7);
                                String optString4 = jSONObject.optString(JSON_KEY_ONLY_IMPRESSION_URL);
                                String optString5 = jSONObject.optString(JSON_KEY_HTML_URL);
                                String optString6 = jSONObject.optString(str5);
                                String optString7 = jSONObject.optString(str13);
                                JSONObject jSONObject3 = optJSONObject2;
                                ArrayList arrayList5 = arrayList3;
                                String str18 = str4;
                                int i8 = optInt;
                                int i9 = i;
                                JSONArray jSONArray4 = jSONArray2;
                                String str19 = optString2;
                                String str20 = optString;
                                CampaignUnit campaignUnit6 = campaignUnit2;
                                String str21 = str13;
                                String str22 = str5;
                                CampaignEx parseCampaign = CampaignEx.parseCampaign(optJSONObject3, optString4, optString5, optString6, false, campaignUnit6, str, optString7);
                                if (parseCampaign != null) {
                                    parseCampaign.setNetAddress(str19);
                                    parseCampaign.setKeyIaUrl(campaignUnit6.getIa_url());
                                    parseCampaign.setKeyIaOri(campaignUnit6.getIa_ori());
                                    parseCampaign.setKeyIaRst(campaignUnit6.getIa_rst());
                                    parseCampaign.setKeyIaIcon(campaignUnit6.getIa_icon());
                                    parseCampaign.setAdType(jSONObject.optInt(str10));
                                    parseCampaign.setIa_ext1(jSONObject.optString(CampaignEx.KEY_IA_EXT1));
                                    parseCampaign.setIa_ext2(jSONObject.optString(CampaignEx.KEY_IA_EXT2));
                                    parseCampaign.setAc_s(jSONObject.optInt(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH, 1));
                                    parseCampaign.setVcn(campaignUnit6.getVcn());
                                    parseCampaign.setTokenRule(campaignUnit6.getTokenRule());
                                    parseCampaign.setEncryptPrice(campaignUnit6.getEncryptPrice());
                                    parseCampaign.setMof_tplid(i9);
                                    str8 = str20;
                                    parseCampaign.setMof_template_url(str8);
                                    i2 = i8;
                                    parseCampaign.setNscpt(i2);
                                    parseCampaign.setPv_urls(arrayList);
                                    str6 = str2;
                                    parseCampaign.setReq_ext_data(str6);
                                    arrayList4.add(parseCampaign);
                                    i9 = i9;
                                    campaignUnit3 = campaignUnit6;
                                    str7 = str18;
                                } else {
                                    str6 = str2;
                                    campaignUnit3 = campaignUnit6;
                                    i2 = i8;
                                    str7 = str18;
                                    str8 = str20;
                                    campaignUnit3.setMsg(str7);
                                }
                                i7++;
                                str2 = str6;
                                optInt = i2;
                                optString = str8;
                                str4 = str7;
                                arrayList3 = arrayList5;
                                optJSONObject2 = jSONObject3;
                                i = i9;
                                optString2 = str19;
                                str5 = str22;
                                jSONArray2 = jSONArray4;
                                str13 = str21;
                                campaignUnit2 = campaignUnit3;
                            }
                            ArrayList arrayList6 = arrayList3;
                            CampaignUnit campaignUnit7 = campaignUnit2;
                            String str23 = str13;
                            String str24 = str5;
                            Frame frame = new Frame();
                            frame.setParentSessionId(jSONObject.optString(str11));
                            frame.setSessionId(jSONObject.optString(str17));
                            frame.setCampaigns(arrayList4);
                            String str25 = str15;
                            frame.setTemplate(optJSONObject2.optInt(str25));
                            arrayList6.add(frame);
                            str15 = str25;
                            arrayList3 = arrayList6;
                            str2 = str2;
                            optString = optString;
                            str11 = str11;
                            str9 = str16;
                            i = i;
                            optString2 = optString2;
                            i5 = i6 + 1;
                            optInt = optInt;
                            str4 = str4;
                            str12 = str17;
                            str5 = str24;
                            str10 = str10;
                            str13 = str23;
                            campaignUnit2 = campaignUnit7;
                            jSONArray = jSONArray3;
                        }
                        campaignUnit = campaignUnit2;
                        campaignUnit.setListFrames(arrayList3);
                        return campaignUnit;
                    }
                }
                String str26 = optString;
                int i10 = i;
                String str27 = str2;
                campaignUnit = campaignUnit2;
                String str28 = CampaignEx.JSON_KEY_ECPPV;
                String str29 = JSON_KEY_END_SCREEN_URL;
                String str30 = "web env is not support";
                int i11 = optInt;
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList7 = new ArrayList();
                    int i12 = 0;
                    campaignUnit = campaignUnit;
                    while (i12 < optJSONArray.length()) {
                        JSONObject optJSONObject4 = optJSONArray.optJSONObject(i12);
                        String optString8 = jSONObject.optString(str14);
                        String optString9 = jSONObject.optString(JSON_KEY_HTML_URL);
                        String optString10 = jSONObject.optString(str29);
                        String str31 = str30;
                        String str32 = str28;
                        CampaignUnit campaignUnit8 = campaignUnit;
                        JSONArray jSONArray5 = optJSONArray;
                        int i13 = i11;
                        String str33 = str26;
                        String str34 = str29;
                        String str35 = str14;
                        str28 = str32;
                        int i14 = i10;
                        CampaignEx parseCampaign2 = CampaignEx.parseCampaign(optJSONObject4, optString8, optString9, optString10, false, campaignUnit8, str, jSONObject.optString(str32));
                        if (parseCampaign2 != null) {
                            parseCampaign2.setNetAddress(optString2);
                            parseCampaign2.setMof_tplid(i14);
                            parseCampaign2.setMof_template_url(str33);
                            i3 = i13;
                            parseCampaign2.setNscpt(i3);
                            parseCampaign2.setPv_urls(arrayList);
                            parseCampaign2.setReq_ext_data(str27);
                            parseCampaign2.setVcn(campaignUnit8.getVcn());
                            parseCampaign2.setTokenRule(campaignUnit8.getTokenRule());
                            parseCampaign2.setEncryptPrice(campaignUnit8.getEncryptPrice());
                            parseCampaign2.setAc_s(jSONObject.optInt(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH, 1));
                            arrayList7.add(parseCampaign2);
                            campaignUnit4 = campaignUnit8;
                        } else {
                            campaignUnit4 = campaignUnit8;
                            i3 = i13;
                            campaignUnit4.setMsg(str31);
                        }
                        i12++;
                        str26 = str33;
                        i10 = i14;
                        str30 = str31;
                        i11 = i3;
                        optJSONArray = jSONArray5;
                        str29 = str34;
                        str14 = str35;
                        campaignUnit = campaignUnit4;
                    }
                    campaignUnit.setAds(arrayList7);
                }
                return campaignUnit;
            } catch (Exception unused4) {
            }
        }
        return null;
    }

    public static CampaignUnit parseV5CampaignUnit(JSONObject jSONObject, String str) {
        return parseCampaignUnit(jSONObject, str);
    }
}
