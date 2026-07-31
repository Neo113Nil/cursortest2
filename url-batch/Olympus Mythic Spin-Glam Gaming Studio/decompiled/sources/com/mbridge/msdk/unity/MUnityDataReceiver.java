package com.mbridge.msdk.unity;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Ac;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.out.reveue.MBridgeRevenueManager;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntityForCustom;
import com.mbridge.msdk.system.a;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class MUnityDataReceiver {
    private static final String MEDIA_ADMOB = "Admob";
    private static final String MEDIA_IRONSOURCE = "IronSource";
    private static final String MEDIA_MAX = "Max";
    private static final String MEDIA_TRADPLUS = "TradPlus";
    private static boolean debug;

    public static void initialize(Context context, String str, String str2) {
        try {
            MLogUtil.i("initialize appID:" + str + " appKey:" + str2);
            a mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
            mBridgeSDK.init(mBridgeSDK.getMBConfigurationMap(str, str2), context, new SDKInitStatusListener() { // from class: com.mbridge.msdk.unity.MUnityDataReceiver.1
                @Override // com.mbridge.msdk.out.SDKInitStatusListener
                public void onInitSuccess() {
                    MLogUtil.i("onInitSuccess");
                }

                @Override // com.mbridge.msdk.out.SDKInitStatusListener
                public void onInitFail(String str3) {
                    MLogUtil.i("onInitFail:" + str3);
                }
            });
        } catch (Throwable th) {
            th.getStackTrace();
        }
    }

    public static void trackAdRevenue(Context context, String str, String str2) {
        try {
            MLogUtil.e("trackAdJsonStr:" + str);
            MLogUtil.e("extraJsonStr:" + str2);
            if (TextUtils.isEmpty(str)) {
                MLogUtil.e("trackAdJsonStr 是空 return");
                return;
            }
            JSONObject jsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str);
            String optString = jsonObjectInit.optString("attributionPlatformName");
            String optString2 = jsonObjectInit.optString("attributionUserID");
            String optString3 = jsonObjectInit.optString("mBridge_Version");
            String optString4 = jsonObjectInit.optString("mediationName");
            MLogUtil.i("setEntityData attributtionPlatformName:" + optString + " attributionPlatformUserId:" + optString2 + " mediationName:" + optString4);
            MBridgeRevenueParamsEntityForCustom mBridgeRevenueParamsEntityForCustom = new MBridgeRevenueParamsEntityForCustom(optString, optString2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u_p_v", optString3);
            mBridgeRevenueParamsEntityForCustom.setExtData(jSONObject);
            MLogUtil.i("setEntityData extDataJsonObj :" + jSONObject);
            if (MEDIA_MAX.equals(optString4)) {
                trackMac(context, jsonObjectInit, mBridgeRevenueParamsEntityForCustom);
                return;
            }
            if (MEDIA_ADMOB.equals(optString4)) {
                trackAdmob(context, jsonObjectInit, str2, mBridgeRevenueParamsEntityForCustom);
            } else if ("IronSource".equals(optString4)) {
                trackIronSource(context, jsonObjectInit, mBridgeRevenueParamsEntityForCustom);
            } else if ("Tradeplus".equals(optString4)) {
                trackTradPlus(context, jsonObjectInit, mBridgeRevenueParamsEntityForCustom);
            }
        } catch (Throwable th) {
            MLogUtil.e(th);
        }
    }

    private static void trackMac(Context context, JSONObject jSONObject, MBridgeRevenueParamsEntityForCustom mBridgeRevenueParamsEntityForCustom) {
        try {
            MLogUtil.i("trackAdJsonObj:" + jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("adInfo");
            if (optJSONObject == null) {
                MLogUtil.i("adInfoJsonObje is null return");
                return;
            }
            String optString = optJSONObject.optString("AdUnitIdentifier");
            String optString2 = optJSONObject.optString("AdFormat");
            String optString3 = optJSONObject.optString("NetworkName");
            String optString4 = optJSONObject.optString("Revenue");
            String optString5 = optJSONObject.optString("RevenuePrecision");
            String optString6 = optJSONObject.optString("DspName");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("WaterfallInfo");
            MLogUtil.i("setEntityData adUnitIdentifier :" + optString + " adFormat:" + optString2 + " networkName:" + optString3 + " revenue:" + optString4 + " revenuePrecision:" + optString5 + " dspName:" + optString6 + " waterfallInfoJsonObject:" + optJSONObject2);
            mBridgeRevenueParamsEntityForCustom.setSourceData(optJSONObject.toString(), optJSONObject2.toString());
            mBridgeRevenueParamsEntityForCustom.setMediationName(MEDIA_MAX);
            mBridgeRevenueParamsEntityForCustom.setRevenue(optString4);
            mBridgeRevenueParamsEntityForCustom.setPrecision(optString5);
            mBridgeRevenueParamsEntityForCustom.setAdType(optString2);
            mBridgeRevenueParamsEntityForCustom.setMediationUnitId(optString);
            mBridgeRevenueParamsEntityForCustom.setNetworkName(optString3);
            mBridgeRevenueParamsEntityForCustom.setDspInfo(optString6, "");
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("NetworkResponses");
            if (optJSONObject3 != null && "1".equals(optJSONObject3.optString("AdLoadState"))) {
                boolean optBoolean = optJSONObject3.optBoolean("IsBidding");
                MLogUtil.i("setEntityData isBidding:" + optBoolean);
                mBridgeRevenueParamsEntityForCustom.setBidType(Boolean.valueOf(optBoolean));
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("Credentials");
                if (optJSONObject4 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    Iterator<String> keys = optJSONObject4.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, optJSONObject4.get(next) + "");
                    }
                    MLogUtil.i("setEntityData setNetworkInfo :" + jSONObject2);
                    mBridgeRevenueParamsEntityForCustom.setNetworkInfo(jSONObject2);
                }
            }
            MBridgeRevenueManager.track(context, mBridgeRevenueParamsEntityForCustom);
            MLogUtil.i("end");
        } catch (Throwable th) {
            MLogUtil.e(th);
        }
    }

    private static void trackAdmob(Context context, JSONObject jSONObject, String str, MBridgeRevenueParamsEntityForCustom mBridgeRevenueParamsEntityForCustom) {
        try {
            MLogUtil.i("trackAdmob start adjsonObject:" + jSONObject);
            MLogUtil.i("trackAdmob start extraJsonStr:" + str);
            String optString = jSONObject.optString("adType");
            mBridgeRevenueParamsEntityForCustom.setMediationName(MEDIA_ADMOB);
            mBridgeRevenueParamsEntityForCustom.setAdType(optString);
            MLogUtil.i("setEntityData setMediationName:Admob setAdType:" + optString);
            JSONObject optJSONObject = jSONObject.optJSONObject("adValue");
            if (optJSONObject != null) {
                String optString2 = optJSONObject.optString("Value");
                String optString3 = optJSONObject.optString("Precision");
                String optString4 = optJSONObject.optString("CurrencyCode");
                mBridgeRevenueParamsEntityForCustom.setRevenue(optString2);
                mBridgeRevenueParamsEntityForCustom.setPrecision(optString3);
                mBridgeRevenueParamsEntityForCustom.setCurrency(optString4);
                MLogUtil.i("setEntityData  setRevenue:" + optString2 + " setPrecision:" + optString3 + " setCurrency:" + optString4);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("loadedadapterResponseInfo");
            mBridgeRevenueParamsEntityForCustom.setSourceData(str, str);
            MLogUtil.i("setEntityData  setSourceData:" + str);
            if (optJSONObject2 != null) {
                String optString5 = optJSONObject2.optString("AdSourceName");
                MLogUtil.i("setEntityData  setNetworkName:" + optString5);
                mBridgeRevenueParamsEntityForCustom.setNetworkName(optString5);
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("AdUnitMapping");
                if (optJSONObject3 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    Iterator<String> keys = optJSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, optJSONObject3.get(next) + "");
                    }
                    MLogUtil.i("setEntityData  setNetworkInfo:" + jSONObject2);
                    mBridgeRevenueParamsEntityForCustom.setNetworkInfo(jSONObject2);
                }
            }
            MBridgeRevenueManager.track(context, mBridgeRevenueParamsEntityForCustom);
            MLogUtil.i("trackAdmob end");
        } catch (Throwable th) {
            MLogUtil.e(th);
        }
    }

    private static void trackIronSource(Context context, JSONObject jSONObject, MBridgeRevenueParamsEntityForCustom mBridgeRevenueParamsEntityForCustom) {
        try {
            MLogUtil.i("trackAdJsonObj:" + jSONObject.toString());
            String optString = jSONObject.optString("irinstanceid");
            JSONObject optJSONObject = jSONObject.optJSONObject("ironSourceImpressionData");
            String optString2 = optJSONObject.optString("adNetwork");
            String optString3 = optJSONObject.optString("adUnit");
            String optString4 = optJSONObject.optString("revenue");
            String optString5 = optJSONObject.optString("precision");
            String optString6 = optJSONObject.optString("instanceName");
            String optString7 = optJSONObject.optString("instanceId");
            MLogUtil.i("setEntityData mediationUnitId:" + optString + " adUnit:" + optString3 + " adNetwork:" + optString2 + " precision:" + optString5 + " instanceName:" + optString6 + " instanceId:" + optString7 + " revenue:" + optString4);
            mBridgeRevenueParamsEntityForCustom.setSourceData(optJSONObject.toString(), optJSONObject.toString());
            mBridgeRevenueParamsEntityForCustom.setMediationName("IronSource");
            mBridgeRevenueParamsEntityForCustom.setMediationUnitId(optString);
            mBridgeRevenueParamsEntityForCustom.setNetworkName(optString2);
            mBridgeRevenueParamsEntityForCustom.setAdType(optString3);
            mBridgeRevenueParamsEntityForCustom.setRevenue(optString4);
            mBridgeRevenueParamsEntityForCustom.setPrecision(optString5);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceName", optString6);
            jSONObject2.put("instanceId", optString7);
            mBridgeRevenueParamsEntityForCustom.setNetworkInfo(jSONObject2);
            StringBuilder sb = new StringBuilder();
            sb.append("setEntityData setNetworkInfo:");
            sb.append(jSONObject2);
            MLogUtil.i(sb.toString());
            MBridgeRevenueManager.track(context, mBridgeRevenueParamsEntityForCustom);
            MLogUtil.i("end");
        } catch (Throwable th) {
            MLogUtil.e(th);
        }
    }

    private static void trackTradPlus(Context context, JSONObject jSONObject, MBridgeRevenueParamsEntityForCustom mBridgeRevenueParamsEntityForCustom) {
        try {
            MLogUtil.i("trackTradPlus:" + jSONObject.toString());
            JSONObject optJSONObject = jSONObject.optJSONObject("adInfo");
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("placementAdType");
                String optString2 = optJSONObject.optString("tpAdUnitId");
                String optString3 = optJSONObject.optString(Ac.a);
                boolean optBoolean = optJSONObject.optBoolean("isBiddingNetwork", false);
                String optString4 = optJSONObject.optString("ecpm");
                String optString5 = optJSONObject.optString("ecpmPrecision");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("instanceName", optJSONObject.optString(Ac.a, ""));
                jSONObject2.put("instanceId", optJSONObject.optString("adSourceId", ""));
                mBridgeRevenueParamsEntityForCustom.setMediationName(MEDIA_TRADPLUS);
                mBridgeRevenueParamsEntityForCustom.setAdType(optString);
                mBridgeRevenueParamsEntityForCustom.setMediationUnitId(optString2);
                mBridgeRevenueParamsEntityForCustom.setNetworkName(optString3);
                mBridgeRevenueParamsEntityForCustom.setBidType(Boolean.valueOf(optBoolean));
                mBridgeRevenueParamsEntityForCustom.setRevenue(optString4);
                mBridgeRevenueParamsEntityForCustom.setPrecision(optString5);
                mBridgeRevenueParamsEntityForCustom.setNetworkInfo(jSONObject2);
                MLogUtil.i("placementAdType:" + optString + " tpAdUnitId:" + optString2 + " adSourceName:" + optString3 + " isBiddingNetwork:" + optBoolean + " ecpm:" + optString4 + " ecpmPrecision:" + optString5 + " networkInfojson:" + jSONObject2);
            }
            mBridgeRevenueParamsEntityForCustom.setSourceData(optJSONObject.toString(), optJSONObject.toString());
            MBridgeRevenueManager.track(context, mBridgeRevenueParamsEntityForCustom);
            MLogUtil.i("end");
        } catch (Throwable th) {
            MLogUtil.e(th);
        }
    }

    public static void trackAdCustom(Context context, String str) {
        JSONObject jSONObject;
        try {
            MLogUtil.i("trackAdJsonStr:" + str);
            if (TextUtils.isEmpty(str)) {
                MLogUtil.e("trackAdJsonStr 是空 return");
                return;
            }
            JSONObject jsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str);
            String optString = jsonObjectInit.optString("mBridge_Version");
            String optString2 = jsonObjectInit.optString("AttributionPlatformName");
            String optString3 = jsonObjectInit.optString("AttributionPlatformUserId");
            String optString4 = jsonObjectInit.optString("MediationName");
            String optString5 = jsonObjectInit.optString("MediationUnitId");
            String optString6 = jsonObjectInit.optString("AdNetworkName");
            String optString7 = jsonObjectInit.optString("Precision");
            String optString8 = jsonObjectInit.optString("Currency");
            String optString9 = jsonObjectInit.optString("Revenue");
            try {
                jSONObject = jsonObjectInit.optJSONObject("AdNetworkUnitInfo");
            } catch (Throwable th) {
                MLogUtil.e(th);
                jSONObject = null;
            }
            boolean optBoolean = jsonObjectInit.optBoolean("IsBidding");
            String optString10 = jsonObjectInit.optString("AdType");
            String optString11 = jsonObjectInit.optString("DspId");
            String optString12 = jsonObjectInit.optString("DspName");
            String optString13 = jsonObjectInit.optString("AllInfo");
            MBridgeRevenueParamsEntityForCustom mBridgeRevenueParamsEntityForCustom = new MBridgeRevenueParamsEntityForCustom(optString2, optString3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("u_p_v", optString);
            mBridgeRevenueParamsEntityForCustom.setExtData(jSONObject2);
            mBridgeRevenueParamsEntityForCustom.setMediationName(optString4);
            mBridgeRevenueParamsEntityForCustom.setMediationUnitId(optString5);
            mBridgeRevenueParamsEntityForCustom.setNetworkName(optString6);
            mBridgeRevenueParamsEntityForCustom.setPrecision(optString7);
            mBridgeRevenueParamsEntityForCustom.setCurrency(optString8);
            mBridgeRevenueParamsEntityForCustom.setRevenue(optString9);
            mBridgeRevenueParamsEntityForCustom.setNetworkInfo(jSONObject);
            mBridgeRevenueParamsEntityForCustom.setBidType(Boolean.valueOf(optBoolean));
            mBridgeRevenueParamsEntityForCustom.setAdType(optString10);
            mBridgeRevenueParamsEntityForCustom.setDspInfo(optString12, optString11);
            mBridgeRevenueParamsEntityForCustom.setSourceData(optString13, "");
            MBridgeRevenueManager.track(context, mBridgeRevenueParamsEntityForCustom);
            MLogUtil.i("end mbridgeVersion:" + optString + " attributtionPlatformName:" + optString2 + " attributionPlatformUserId:" + optString3 + " mediationName:" + optString4 + " mediationUnitId:" + optString5 + " adNetworkName:" + optString6 + " precision:" + optString7 + " currency:" + optString8 + " revenue:" + optString9 + " adNetworkUnitInfoObj:" + jSONObject + " isBidding:" + optBoolean + " adType:" + optString10 + " dspId:" + optString11 + " dspName:" + optString12 + " allInfo:" + optString13);
        } catch (Throwable th2) {
            MLogUtil.e(th2);
        }
    }

    public static void setDebug(boolean z) {
        debug = z;
    }

    public static boolean getDebug() {
        return debug;
    }
}
