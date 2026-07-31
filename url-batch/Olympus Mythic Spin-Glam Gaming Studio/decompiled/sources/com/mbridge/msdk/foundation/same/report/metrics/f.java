package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.tracker.network.toolbox.i;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.ads.networks.nast.NastAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SameMetricsReport.java */
/* loaded from: classes8.dex */
public class f {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r25.n().getAdType() == 295) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00db A[Catch: Exception -> 0x002e, TryCatch #1 {Exception -> 0x002e, blocks: (B:3:0x001d, B:5:0x0029, B:9:0x0034, B:11:0x0040, B:19:0x00b3, B:21:0x00b9, B:22:0x00d5, B:24:0x00db, B:26:0x00e0, B:29:0x00ff, B:31:0x0105, B:41:0x0133, B:43:0x0137, B:44:0x013a, B:45:0x013e, B:47:0x0144, B:50:0x014d, B:52:0x0194, B:53:0x01f3, B:55:0x01fd, B:57:0x0210, B:58:0x0219, B:59:0x022c, B:61:0x023b, B:62:0x0248, B:65:0x0254, B:67:0x027f, B:69:0x0285, B:71:0x028b, B:72:0x02a9, B:73:0x02b4, B:75:0x02be, B:77:0x02c4, B:78:0x02f4, B:80:0x02fc, B:82:0x0302, B:83:0x0320, B:84:0x032b, B:86:0x0333, B:88:0x0339, B:89:0x0357, B:90:0x0362, B:92:0x036a, B:94:0x0370, B:95:0x038e, B:96:0x0399, B:99:0x03ae, B:101:0x03b8, B:102:0x03be, B:103:0x03c3, B:105:0x03c9, B:107:0x03d7, B:110:0x03e7, B:112:0x03ed, B:113:0x0435, B:115:0x043f, B:118:0x044b, B:120:0x0451, B:121:0x046a, B:122:0x046e, B:124:0x0474, B:125:0x048d, B:126:0x0490, B:128:0x049a, B:130:0x04a8, B:131:0x04c8, B:132:0x04d1, B:135:0x04da, B:137:0x04e0, B:138:0x051f, B:141:0x052b, B:143:0x0541, B:145:0x0569, B:147:0x056f, B:148:0x0594, B:150:0x0598, B:152:0x05a8, B:153:0x05ad, B:155:0x05b7, B:156:0x05c0, B:158:0x05c6, B:159:0x05d3, B:161:0x05f4, B:163:0x05fb, B:164:0x0608, B:166:0x0612, B:167:0x061b, B:169:0x0623, B:171:0x062a, B:172:0x0637, B:174:0x0641, B:175:0x064a, B:176:0x0657, B:178:0x065f, B:182:0x0672, B:185:0x0680, B:187:0x06a6, B:189:0x06ac, B:190:0x06b1, B:191:0x06af, B:192:0x06b8, B:194:0x06c0, B:196:0x06c6, B:197:0x06cb, B:198:0x06c9, B:199:0x06d2, B:202:0x06dc, B:204:0x06e4, B:205:0x06ec, B:207:0x06fc, B:209:0x0702, B:210:0x0707, B:212:0x0716, B:214:0x071c, B:215:0x0721, B:218:0x0732, B:221:0x0752, B:223:0x075b, B:224:0x077a, B:226:0x0786, B:231:0x0794, B:233:0x07a0, B:235:0x07aa, B:237:0x07c1, B:238:0x07d4, B:240:0x07da, B:241:0x07df, B:242:0x07dd, B:243:0x07cb, B:244:0x07b3, B:246:0x07b9, B:248:0x081a, B:249:0x07e7, B:251:0x07f5, B:252:0x0808, B:254:0x080e, B:255:0x0813, B:256:0x0811, B:257:0x07ff, B:261:0x0766, B:262:0x074e, B:264:0x071f, B:265:0x0705, B:271:0x058d, B:272:0x0561, B:274:0x04f9, B:275:0x04fd, B:277:0x0503, B:278:0x051c, B:279:0x0408, B:280:0x040e, B:282:0x0416, B:283:0x042f, B:285:0x02e4, B:287:0x0272, B:288:0x0223, B:289:0x01d5, B:296:0x00c1, B:298:0x00c7, B:300:0x00d2, B:301:0x00cc, B:302:0x006d, B:307:0x0081, B:309:0x008c, B:311:0x0092, B:313:0x009d, B:315:0x00a3, B:317:0x0097, B:319:0x00a9, B:331:0x0064, B:13:0x0045, B:15:0x004b, B:34:0x0111, B:36:0x012c), top: B:2:0x001d, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e0 A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #1 {Exception -> 0x002e, blocks: (B:3:0x001d, B:5:0x0029, B:9:0x0034, B:11:0x0040, B:19:0x00b3, B:21:0x00b9, B:22:0x00d5, B:24:0x00db, B:26:0x00e0, B:29:0x00ff, B:31:0x0105, B:41:0x0133, B:43:0x0137, B:44:0x013a, B:45:0x013e, B:47:0x0144, B:50:0x014d, B:52:0x0194, B:53:0x01f3, B:55:0x01fd, B:57:0x0210, B:58:0x0219, B:59:0x022c, B:61:0x023b, B:62:0x0248, B:65:0x0254, B:67:0x027f, B:69:0x0285, B:71:0x028b, B:72:0x02a9, B:73:0x02b4, B:75:0x02be, B:77:0x02c4, B:78:0x02f4, B:80:0x02fc, B:82:0x0302, B:83:0x0320, B:84:0x032b, B:86:0x0333, B:88:0x0339, B:89:0x0357, B:90:0x0362, B:92:0x036a, B:94:0x0370, B:95:0x038e, B:96:0x0399, B:99:0x03ae, B:101:0x03b8, B:102:0x03be, B:103:0x03c3, B:105:0x03c9, B:107:0x03d7, B:110:0x03e7, B:112:0x03ed, B:113:0x0435, B:115:0x043f, B:118:0x044b, B:120:0x0451, B:121:0x046a, B:122:0x046e, B:124:0x0474, B:125:0x048d, B:126:0x0490, B:128:0x049a, B:130:0x04a8, B:131:0x04c8, B:132:0x04d1, B:135:0x04da, B:137:0x04e0, B:138:0x051f, B:141:0x052b, B:143:0x0541, B:145:0x0569, B:147:0x056f, B:148:0x0594, B:150:0x0598, B:152:0x05a8, B:153:0x05ad, B:155:0x05b7, B:156:0x05c0, B:158:0x05c6, B:159:0x05d3, B:161:0x05f4, B:163:0x05fb, B:164:0x0608, B:166:0x0612, B:167:0x061b, B:169:0x0623, B:171:0x062a, B:172:0x0637, B:174:0x0641, B:175:0x064a, B:176:0x0657, B:178:0x065f, B:182:0x0672, B:185:0x0680, B:187:0x06a6, B:189:0x06ac, B:190:0x06b1, B:191:0x06af, B:192:0x06b8, B:194:0x06c0, B:196:0x06c6, B:197:0x06cb, B:198:0x06c9, B:199:0x06d2, B:202:0x06dc, B:204:0x06e4, B:205:0x06ec, B:207:0x06fc, B:209:0x0702, B:210:0x0707, B:212:0x0716, B:214:0x071c, B:215:0x0721, B:218:0x0732, B:221:0x0752, B:223:0x075b, B:224:0x077a, B:226:0x0786, B:231:0x0794, B:233:0x07a0, B:235:0x07aa, B:237:0x07c1, B:238:0x07d4, B:240:0x07da, B:241:0x07df, B:242:0x07dd, B:243:0x07cb, B:244:0x07b3, B:246:0x07b9, B:248:0x081a, B:249:0x07e7, B:251:0x07f5, B:252:0x0808, B:254:0x080e, B:255:0x0813, B:256:0x0811, B:257:0x07ff, B:261:0x0766, B:262:0x074e, B:264:0x071f, B:265:0x0705, B:271:0x058d, B:272:0x0561, B:274:0x04f9, B:275:0x04fd, B:277:0x0503, B:278:0x051c, B:279:0x0408, B:280:0x040e, B:282:0x0416, B:283:0x042f, B:285:0x02e4, B:287:0x0272, B:288:0x0223, B:289:0x01d5, B:296:0x00c1, B:298:0x00c7, B:300:0x00d2, B:301:0x00cc, B:302:0x006d, B:307:0x0081, B:309:0x008c, B:311:0x0092, B:313:0x009d, B:315:0x00a3, B:317:0x0097, B:319:0x00a9, B:331:0x0064, B:13:0x0045, B:15:0x004b, B:34:0x0111, B:36:0x012c), top: B:2:0x001d, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Map<String, String> c(String str, c cVar) {
        String str2;
        Iterator it;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = "cid";
        String str9 = "dspid";
        String str10 = "vtid";
        String str11 = CampaignEx.KEY_LOCAL_CHECK_STATE;
        e eVar = new e();
        try {
        } catch (Exception e) {
            e = e;
        }
        if (Arrays.asList(b.g).contains(str)) {
            return eVar.a();
        }
        if (cVar == null) {
            eVar.a("metrics_data_reason", "metrics 上报时意外为空");
            return eVar.a();
        }
        List arrayList = new ArrayList();
        try {
            if (cVar.n() != null) {
                str2 = "rid_n";
            } else {
                str2 = "rid_n";
            }
        } catch (Throwable th) {
            str2 = "rid_n";
            q0.b("SameMetricsReport", th.getMessage());
        }
        if (Arrays.asList(b.f).contains(str)) {
            try {
                if ("m_download_start".equals(str) || "m_download_end".equals(str)) {
                    arrayList = a(cVar, str);
                } else {
                    List<CampaignEx> o = cVar.o() != null ? cVar.o() : cVar.m();
                    if (o != null && o.size() > 0) {
                        arrayList.addAll(o);
                    }
                }
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                if (MBridgeConstans.DEBUG) {
                    exc.printStackTrace();
                }
                return eVar.a();
            }
            if (!arrayList.isEmpty()) {
                return eVar.a();
            }
            Map<String, Map<String, String>> w = cVar.w();
            String str12 = cVar.t() + str;
            Object obj = "1";
            if (w.containsKey(str12) && w.get(str12) != null && w.get(str12).containsKey("126_exclude")) {
                try {
                    String str13 = w.get(str12).get("126_exclude");
                    w.get(str12).remove("126_exclude");
                    if ("1".equals(str13)) {
                        return eVar.a();
                    }
                } catch (Exception e3) {
                    if (MBridgeConstans.DEBUG) {
                        e3.printStackTrace();
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                CampaignEx campaignEx = (CampaignEx) it2.next();
                if (campaignEx != null) {
                    eVar.a(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(campaignEx.getFilterCallBackState()));
                    eVar.a("r_index", Integer.valueOf(campaignEx.getSecondRequestIndex()));
                    eVar.a("s_show_index", Integer.valueOf(campaignEx.getSecondShowIndex()));
                    eVar.a(CampaignEx.KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsVideoCallState()));
                    eVar.a(CampaignEx.KEY_SECOND_FILTER_AD_SHOW_CALL_STATE, Integer.valueOf(campaignEx.getFilterAdsShowCallState()));
                    ArrayList<Integer> rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
                    if (rsIgnoreCheckRule != null) {
                        eVar.a("ignore_video", Integer.valueOf(!rsIgnoreCheckRule.contains(0) ? 1 : 0));
                        eVar.a("ignore_template", Integer.valueOf(!rsIgnoreCheckRule.contains(1) ? 1 : 0));
                        it = it2;
                        eVar.a("ignore_ec", Integer.valueOf(!rsIgnoreCheckRule.contains(2) ? 1 : 0));
                    } else {
                        it = it2;
                        eVar.a("ignore_video", 1);
                        eVar.a("ignore_template", 1);
                        eVar.a("ignore_ec", 1);
                    }
                    if (TextUtils.isEmpty(campaignEx.getNLRid())) {
                        eVar.a("lrid", campaignEx.getLocalRequestId());
                    } else {
                        eVar.a("n_lrid", campaignEx.getNLRid());
                        if (!TextUtils.isEmpty(campaignEx.getNRid())) {
                            eVar.a("n_rid", campaignEx.getNRid());
                        }
                        eVar.a("lrid", campaignEx.getLocalRequestId());
                    }
                    eVar.a(m.x, campaignEx.getRequestId());
                    if (campaignEx.getMof_tplid() != 0) {
                        eVar.a("stid", Integer.valueOf(campaignEx.getMof_tplid()));
                    }
                    CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                    if (eVar.a(str11)) {
                        eVar.a(str11, eVar.b(str11) + StringUtils.COMMA + campaignEx.getLocalCheckShow());
                    } else {
                        eVar.a(str11, Integer.valueOf(campaignEx.getLocalCheckShow()));
                    }
                    if (rewardTemplateMode != null && rewardTemplateMode.k() != 0) {
                        if (eVar.a(str10)) {
                            eVar.a(str10, eVar.b(str10) + StringUtils.COMMA + rewardTemplateMode.k());
                        } else {
                            eVar.a(str10, Integer.valueOf(rewardTemplateMode.k()));
                        }
                    }
                    if (campaignEx.getCreativeId() == 0) {
                        str3 = str10;
                        str4 = str11;
                    } else if (eVar.a("crid")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(eVar.b("crid"));
                        sb.append(StringUtils.COMMA);
                        str3 = str10;
                        str4 = str11;
                        sb.append(campaignEx.getCreativeId());
                        eVar.a("crid", sb.toString());
                    } else {
                        str3 = str10;
                        str4 = str11;
                        eVar.a("crid", Long.valueOf(campaignEx.getCreativeId()));
                    }
                    if (campaignEx.getVidCrtvId() != 0) {
                        if (eVar.a("video_crid")) {
                            eVar.a("video_crid", eVar.b("video_crid") + StringUtils.COMMA + campaignEx.getVidCrtvId());
                        } else {
                            eVar.a("video_crid", Long.valueOf(campaignEx.getVidCrtvId()));
                        }
                    }
                    if (campaignEx.getEcCrtvId() != 0) {
                        if (eVar.a("endcard_crid")) {
                            eVar.a("endcard_crid", eVar.b("endcard_crid") + StringUtils.COMMA + campaignEx.getEcCrtvId());
                        } else {
                            eVar.a("endcard_crid", Long.valueOf(campaignEx.getEcCrtvId()));
                        }
                    }
                    if (campaignEx.getEcTemplateId() != 0) {
                        if (eVar.a(CampaignEx.JSON_KEY_EC_TEMP_ID)) {
                            eVar.a(CampaignEx.JSON_KEY_EC_TEMP_ID, eVar.b(CampaignEx.JSON_KEY_EC_TEMP_ID) + StringUtils.COMMA + campaignEx.getEcTemplateId());
                        } else {
                            eVar.a(CampaignEx.JSON_KEY_EC_TEMP_ID, Long.valueOf(campaignEx.getEcTemplateId()));
                        }
                    }
                    eVar.a("bid_tk", campaignEx.getBidToken());
                    if (!TextUtils.isEmpty(campaignEx.getMof_template_url())) {
                        if (v0.i(campaignEx.getMof_template_url())) {
                            eVar.a("sdyv", obj);
                        } else {
                            eVar.a("sdyv", "2");
                        }
                    }
                    if (campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        str5 = str3;
                    } else if (!v0.i(campaignEx.getRewardTemplateMode().j())) {
                        str5 = str3;
                        if (eVar.a("vdyv")) {
                            eVar.a("vdyv", eVar.b("vdyv") + ",2");
                        } else {
                            eVar.a("vdyv", "2");
                        }
                    } else if (eVar.a("vdyv")) {
                        StringBuilder sb2 = new StringBuilder();
                        str5 = str3;
                        sb2.append(eVar.b("vdyv"));
                        sb2.append(",1");
                        eVar.a("vdyv", sb2.toString());
                    } else {
                        str5 = str3;
                        eVar.a("vdyv", obj);
                    }
                    if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                        if (v0.i(campaignEx.getendcard_url())) {
                            if (eVar.a("edyv")) {
                                eVar.a("edyv", eVar.b("edyv") + ",1");
                            } else {
                                eVar.a("edyv", obj);
                            }
                        } else if (eVar.a("edyv")) {
                            eVar.a("edyv", eVar.b("edyv") + ",2");
                        } else {
                            eVar.a("edyv", "2");
                        }
                    }
                    if (!TextUtils.isEmpty(campaignEx.getExt_data())) {
                        JSONObject jsonObjectInit = MintegralNetworkBridge.jsonObjectInit(campaignEx.getExt_data());
                        if (eVar.a(str9)) {
                            eVar.a(str9, eVar.b(str9) + StringUtils.COMMA + jsonObjectInit.optString("par_dspid"));
                        } else {
                            eVar.a(str9, jsonObjectInit.optString("par_dspid"));
                        }
                    }
                    if (campaignEx.getPlayable_ads_without_video() == 2) {
                        if (eVar.a("only_ec")) {
                            eVar.a("only_ec", eVar.b("only_ec") + ",2");
                        } else {
                            eVar.a("only_ec", "2");
                        }
                    } else if (eVar.a("only_ec")) {
                        eVar.a("only_ec", eVar.b("only_ec") + ",1");
                    } else {
                        eVar.a("only_ec", obj);
                    }
                    eVar.a(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? obj : "0");
                    eVar.a(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
                    if (eVar.a(str8)) {
                        eVar.a(str8, eVar.b(str8) + StringUtils.COMMA + campaignEx.getId());
                    } else {
                        eVar.a(str8, campaignEx.getId());
                    }
                    String str14 = str2;
                    if (eVar.a(str14)) {
                        eVar.a(str14, eVar.b(str14) + StringUtils.COMMA + campaignEx.getRequestIdNotice());
                    } else {
                        eVar.a(str14, campaignEx.getRequestIdNotice());
                    }
                    HashMap<String, String> hashMap = com.mbridge.msdk.foundation.controller.a.r;
                    if (hashMap != null) {
                        String str15 = hashMap.get(campaignEx.getCampaignUnitId());
                        if (!TextUtils.isEmpty(str15)) {
                            eVar.a("u_stid", str15);
                        }
                    }
                    if (!TextUtils.isEmpty(campaignEx.getCampaignUnitId())) {
                        eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
                    }
                    if (campaignEx.getAdType() != 0) {
                        eVar.a("adtp", Integer.valueOf(campaignEx.getAdType()));
                    }
                    eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(campaignEx.isBidCampaign() ? 1 : 0));
                    eVar.a(CampaignEx.URL_KEY_EXP_IDS, campaignEx.getExpIds());
                    Object obj2 = obj;
                    if ("2000047".contains(str)) {
                        if (campaignEx.getTyped() != -1) {
                            eVar.a("type_d", Integer.valueOf(campaignEx.getTyped()));
                        }
                        if (!TextUtils.isEmpty(campaignEx.getReasond())) {
                            eVar.a("reason_d", campaignEx.getReasond());
                        }
                    }
                    if ("2000048".contains(str)) {
                        if (campaignEx.getTyped() != -1) {
                            eVar.a("type", Integer.valueOf(campaignEx.getTyped()));
                        }
                        if (!TextUtils.isEmpty(campaignEx.getReasond())) {
                            eVar.a("reason", campaignEx.getReasond());
                        }
                        eVar.a(CampaignEx.JSON_KEY_RETARGET_TYPE, Integer.valueOf(campaignEx.getRtinsType()));
                    }
                    if (campaignEx.getAdType() != 94 && campaignEx.getAdType() != 287) {
                        str2 = str14;
                        obj = obj2;
                        str11 = str4;
                        str10 = str5;
                        it2 = it;
                    }
                    if (Arrays.asList(b.j).contains(str)) {
                        eVar.a(CampaignEx.KEY_SHOW_INDEX, Integer.valueOf(campaignEx.getShowIndex()));
                        eVar.a("trigger_show_type", Integer.valueOf(campaignEx.getShowType()));
                        if (Arrays.asList(b.l).contains(str)) {
                            eVar.a("temp_display_type", Integer.valueOf(campaignEx.isTemplateRenderSucc() ? a.e : a.f));
                        }
                        if (str.equals("2000147")) {
                            eVar.a("temp_display_type", Integer.valueOf(campaignEx.isECTemplateRenderSucc() ? a.e : a.f));
                        }
                    }
                    if (TextUtils.equals(str, "2000130")) {
                        String j = campaignEx.getRewardTemplateMode() != null ? campaignEx.getRewardTemplateMode().j() : "";
                        str2 = str14;
                        String str16 = campaignEx.getendcard_url();
                        str6 = str8;
                        eVar.a("ec_full_screen_click", Integer.valueOf((TextUtils.isEmpty(str16) || !str16.contains("alecfc=1")) ? a.h : a.g));
                        eVar.a("temp_full_screen_click", Integer.valueOf((TextUtils.isEmpty(j) || !j.contains("alecfc=1")) ? a.h : a.g));
                        boolean z = campaignEx.getPlayable_ads_without_video() == 2;
                        str7 = str9;
                        com.mbridge.msdk.videocommon.setting.c c = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), cVar.B());
                        eVar.a("video_skip_result", Integer.valueOf(c == null ? 2 : c.E()));
                        if (z) {
                            eVar.a(CampaignEx.VIDEO_END_TYPE, 2);
                        } else {
                            eVar.a(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
                        }
                    } else {
                        str2 = str14;
                        str6 = str8;
                        str7 = str9;
                    }
                    if (Arrays.asList(b.k).contains(str)) {
                        int clickTempSource = campaignEx.getClickTempSource();
                        if (clickTempSource == 1) {
                            if (campaignEx.getRewardTemplateMode().j().contains("alecfc=1")) {
                                eVar.a("full_screen_click", Integer.valueOf(a.g));
                            } else {
                                eVar.a("full_screen_click", Integer.valueOf(a.h));
                            }
                            eVar.a("temp_display_type", Integer.valueOf(campaignEx.isTemplateRenderSucc() ? a.e : a.f));
                        } else if (clickTempSource == 2) {
                            String str17 = campaignEx.getendcard_url();
                            if ((campaignEx.getMof_tplid() != 501 || TextUtils.isEmpty(campaignEx.getMof_template_url())) ? !TextUtils.isEmpty(str17) ? str17.contains("alecfc=1") : false : campaignEx.getMof_template_url().contains("alecfc=1")) {
                                eVar.a("full_screen_click", Integer.valueOf(a.g));
                            } else {
                                eVar.a("full_screen_click", Integer.valueOf(a.h));
                            }
                            eVar.a("temp_display_type", Integer.valueOf(campaignEx.isECTemplateRenderSucc() ? a.e : a.f));
                        }
                        eVar.a(CampaignEx.KEY_CLICK_TEMP_SOURCE, Integer.valueOf(campaignEx.getClickTempSource()));
                        eVar.a("trigger_click_type", Integer.valueOf(campaignEx.getClickType()));
                        eVar.a(CampaignEx.KEY_TRIGGER_CLICK_SOURCE, Integer.valueOf(campaignEx.getTriggerClickSource()));
                    }
                    obj = obj2;
                    str11 = str4;
                    str10 = str5;
                    it2 = it;
                    str8 = str6;
                    str9 = str7;
                }
            }
            return eVar.a();
        }
        if (cVar.n() != null) {
            arrayList.add(cVar.n());
        } else {
            List<CampaignEx> o2 = cVar.o() != null ? cVar.o() : cVar.m();
            if (o2 != null) {
                arrayList.addAll(o2);
            }
        }
        if (!arrayList.isEmpty()) {
        }
    }

    private Map<String, String> d(String str, c cVar) {
        return (cVar == null || TextUtils.isEmpty(str)) ? new HashMap() : cVar.c(str);
    }

    private Map<String, String> e(String str, c cVar) {
        e eVar = new e();
        try {
            if (str.equals("2000125")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000126")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000125")));
            } else if (str.equals("2000127")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000154")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000126")));
            } else if (str.equals("2000047")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000048")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000155")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000154")));
            } else if (str.equals("2000146")) {
                eVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(cVar.b("2000130")));
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar.a();
    }

    public void a(String str, com.mbridge.msdk.tracker.m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        Map<String, String> e;
        HashMap hashMap = new HashMap();
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            cVar.j(str);
            Map<String, String> c = c(str, cVar);
            if (c != null) {
                hashMap.putAll(c);
            }
            Map<String, String> a = a(str, cVar.B(), mVar);
            if (a != null) {
                hashMap.putAll(a);
            }
            if (Arrays.asList(b.d).contains(str) && (e = e(str, cVar)) != null) {
                hashMap.putAll(e);
            }
            Map<String, String> a2 = a(str, cVar);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
            Map<String, String> b = b(str, cVar);
            if (b != null) {
                hashMap.putAll(b);
            }
            if (!hashMap.containsKey("lrid") || TextUtils.isEmpty(hashMap.get("lrid"))) {
                hashMap.put("lrid", cVar.t());
            }
            if (hashMap.containsKey("lrid")) {
                String str2 = hashMap.get("lrid");
                if (!TextUtils.isEmpty(str2) && str2.contains("label_second")) {
                    hashMap.put("lrid", str2.replace("label_second", ""));
                }
            }
            if (hashMap.containsKey("n_lrid")) {
                String str3 = hashMap.get("n_lrid");
                if (!TextUtils.isEmpty(str3) && str3.contains("label_second")) {
                    hashMap.put("n_lrid", str3.replace("n_lrid", ""));
                }
            }
            Map<String, String> d = d(str, cVar);
            if (d != null) {
                hashMap.putAll(d);
            }
            String str4 = "1";
            if (cVar.j() == null || !cVar.j().equals("1") || !Arrays.asList(b.b).contains(str) || cVar.g() == 296) {
                if (Arrays.asList(b.m).contains(str)) {
                    hashMap.put("use_local_dns", i.b().e() ? "1" : "0");
                    if (!i.b().d()) {
                        str4 = "0";
                    }
                    hashMap.put("local_dns_available", str4);
                }
                com.mbridge.msdk.tracker.e a3 = a(str, hashMap);
                if (mVar != null && a3 != null) {
                    mVar.d(a3);
                }
                if (aVar != null) {
                    aVar.a();
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public void b(String str, com.mbridge.msdk.tracker.m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            cVar.j(str);
            Map<String, String> a = a(str, cVar.B(), mVar);
            if (a != null) {
                hashMap.putAll(a);
            }
            Map<String, String> a2 = a(str, cVar);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
            Map<String, String> b = b(str, cVar);
            if (b != null) {
                hashMap.putAll(b);
            }
            Map<String, String> d = d(str, cVar);
            if (d != null) {
                hashMap.putAll(d);
            }
            com.mbridge.msdk.tracker.e a3 = a(str, hashMap);
            if (mVar != null && a3 != null) {
                mVar.d(a3);
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public Map<String, String> b(String str, c cVar) {
        HashMap hashMap = new HashMap();
        if (cVar == null) {
            return hashMap;
        }
        return cVar.a(cVar.t() + str);
    }

    private com.mbridge.msdk.tracker.e a(String str, Map<String, String> map) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(str);
        try {
            JSONObject jSONObject = new JSONObject(map);
            Boolean a = com.mbridge.msdk.foundation.same.b.b().a();
            if (a != null) {
                jSONObject.put("r_v_r", a.booleanValue() ? 1 : 0);
            }
            eVar.a(jSONObject);
            eVar.b(0);
            eVar.a(0);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar;
    }

    private Map<String, String> a(String str, String str2, com.mbridge.msdk.tracker.m mVar) {
        e eVar = new e();
        try {
            g f = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (f == null) {
                f = com.mbridge.msdk.setting.i.b().a();
            }
            if (!TextUtils.isEmpty(f.q0())) {
                eVar.a("as_rid", f.q0());
            }
            String L = f.L();
            JSONArray K = f.K();
            if (K != null) {
                int i = 0;
                while (true) {
                    if (i >= K.length()) {
                        break;
                    }
                    if (str.equals(K.getString(i))) {
                        L = NastAdapter.ADAPTER_SDK_VERSION_NAME;
                        break;
                    }
                    i++;
                }
            }
            if (!TextUtils.isEmpty(L)) {
                eVar.a("log_rate", L);
            } else {
                eVar.a("log_rate", -1);
            }
            if (!TextUtils.isEmpty(str2)) {
                com.mbridge.msdk.setting.m d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), str2);
                if (d != null && !TextUtils.isEmpty(d.I())) {
                    eVar.a("us_rid", d.I());
                }
                if (d != null && !TextUtils.isEmpty(d.a())) {
                    eVar.a("u_stid", d.a());
                }
                e c = d.b().c(str2);
                if (c != null) {
                    if (mVar != null && mVar.c() != null) {
                        try {
                            mVar.c().put("r_stid", c.b("r_stid"));
                            c.c("r_stid");
                        } catch (JSONException unused) {
                        }
                    }
                    eVar.a(c);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:6:0x0007, B:8:0x0020, B:11:0x0026, B:13:0x0036, B:16:0x0057, B:18:0x005d, B:20:0x0068, B:22:0x006e, B:23:0x0062, B:24:0x0072, B:26:0x0078, B:27:0x0080, B:29:0x0086, B:31:0x0091, B:33:0x0097, B:34:0x008b, B:36:0x0041, B:38:0x0045, B:41:0x004c, B:43:0x0050), top: B:5:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:6:0x0007, B:8:0x0020, B:11:0x0026, B:13:0x0036, B:16:0x0057, B:18:0x005d, B:20:0x0068, B:22:0x006e, B:23:0x0062, B:24:0x0072, B:26:0x0078, B:27:0x0080, B:29:0x0086, B:31:0x0091, B:33:0x0097, B:34:0x008b, B:36:0x0041, B:38:0x0045, B:41:0x004c, B:43:0x0050), top: B:5:0x0007, inners: #1 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x004e -> B:44:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0050 -> B:44:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<CampaignEx> a(c cVar, String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (cVar != null) {
            try {
                String str2 = cVar.t() + str;
                Map<String, Map<String, String>> w = cVar.w();
                if (w != null && w.containsKey(str2)) {
                    try {
                        Object obj = w.get(str2).get("resource_type");
                        if (obj instanceof String) {
                            i = Integer.parseInt((String) obj);
                        } else if (obj instanceof Integer) {
                            i = ((Integer) obj).intValue();
                        }
                    } catch (NumberFormatException e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                    if (i != 1) {
                        List<CampaignEx> o = cVar.o() != null ? cVar.o() : cVar.m();
                        if (o != null && o.size() > 0) {
                            arrayList.addAll(o);
                        }
                    } else if (cVar.n() != null) {
                        arrayList.add(cVar.n());
                    } else {
                        List<CampaignEx> o2 = cVar.o() != null ? cVar.o() : cVar.m();
                        if (o2 != null && o2.size() > 0) {
                            arrayList.addAll(o2);
                        }
                    }
                }
                i = -1;
                if (i != 1) {
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public Map<String, String> a(String str, c cVar) {
        HashMap hashMap = new HashMap();
        try {
            if (Arrays.asList(b.e).contains(str)) {
                String str2 = "";
                if (cVar != null) {
                    str2 = cVar.j();
                }
                hashMap.put("auto_load", str2);
            }
            if (cVar != null) {
                Map<String, Map<String, String>> w = cVar.w();
                String str3 = cVar.t() + str;
                if (w.containsKey(str3) && w.get(str3) != null) {
                    hashMap.putAll(w.get(str3));
                }
                try {
                    Map<String, Map<String, String>> v = cVar.v();
                    String str4 = cVar.t() + "_" + cVar.q() + "_" + str;
                    if (v.containsKey(str4) && v.get(str4) != null) {
                        hashMap.putAll(v.get(str4));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return hashMap;
    }
}
