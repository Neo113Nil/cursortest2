package com.smaato.sdk.ng.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.applovin.impl.n7$$ExternalSyntheticBackport3;
import com.facebook.AuthenticationTokenClaims;
import com.ironsource.B5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.smaato.sdk.ng.models.NGSDKAdRequest;
import com.smaato.sdk.ng.models.Topic;
import com.smaato.sdk.ng.models.bidstream.BidParam;
import com.smaato.sdk.ng.models.bidstream.Signal;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public final class NGSDKApiUrlComposer {
    private static final String a = "NGSDKApiUrlComposer";
    private static final Map<Class<?>, Map<Field, BidParam>> b = new ConcurrentHashMap();

    private static Uri a(String str, NGSDKAdRequest nGSDKAdRequest) {
        String valueOf;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendPath("api");
        buildUpon.appendPath("v3");
        buildUpon.appendPath("native");
        if (!TextUtils.isEmpty(nGSDKAdRequest.appToken)) {
            buildUpon.appendQueryParameter("apptoken", nGSDKAdRequest.appToken);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.os)) {
            buildUpon.appendQueryParameter("os", nGSDKAdRequest.os);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.osver)) {
            buildUpon.appendQueryParameter("osver", nGSDKAdRequest.osver);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.devicemodel)) {
            buildUpon.appendQueryParameter(B5.n, nGSDKAdRequest.devicemodel);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.make)) {
            buildUpon.appendQueryParameter("make", nGSDKAdRequest.make);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.deviceHeight)) {
            buildUpon.appendQueryParameter("dh", nGSDKAdRequest.deviceHeight);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.deviceWidth)) {
            buildUpon.appendQueryParameter("dw", nGSDKAdRequest.deviceWidth);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.orientation)) {
            buildUpon.appendQueryParameter("scro", nGSDKAdRequest.orientation);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.ppi)) {
            buildUpon.appendQueryParameter("ppi", nGSDKAdRequest.ppi);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.pxratio)) {
            buildUpon.appendQueryParameter(POBConstants.KEY_PXRATIO, nGSDKAdRequest.pxratio);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.js)) {
            buildUpon.appendQueryParameter(POBConstants.KEY_JS, nGSDKAdRequest.js);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.soundSetting)) {
            buildUpon.appendQueryParameter(AuthenticationTokenClaims.JSON_KEY_AUD, nGSDKAdRequest.soundSetting);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.dnt)) {
            buildUpon.appendQueryParameter("dnt", nGSDKAdRequest.dnt);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.al)) {
            buildUpon.appendQueryParameter(CampaignEx.JSON_KEY_AD_AL, nGSDKAdRequest.al);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.width)) {
            buildUpon.appendQueryParameter("w", nGSDKAdRequest.width);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.height)) {
            buildUpon.appendQueryParameter("h", nGSDKAdRequest.height);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.mf)) {
            buildUpon.appendQueryParameter("mf", nGSDKAdRequest.mf);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.af)) {
            buildUpon.appendQueryParameter("af", nGSDKAdRequest.af);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.zoneId)) {
            buildUpon.appendQueryParameter("zoneid", nGSDKAdRequest.zoneId);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.testMode)) {
            buildUpon.appendQueryParameter(POBConstants.TEST_MODE, nGSDKAdRequest.testMode);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.locale)) {
            buildUpon.appendQueryParameter(CommonUrlParts.LOCALE, nGSDKAdRequest.locale);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.language)) {
            buildUpon.appendQueryParameter(POBConstants.KEY_LANGUAGE, nGSDKAdRequest.language);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.langb)) {
            buildUpon.appendQueryParameter("langb", nGSDKAdRequest.langb);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.latitude)) {
            buildUpon.appendQueryParameter("lat", nGSDKAdRequest.latitude);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.longitude)) {
            buildUpon.appendQueryParameter(Constants.LONG, nGSDKAdRequest.longitude);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.gender)) {
            buildUpon.appendQueryParameter("gender", nGSDKAdRequest.gender);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.age)) {
            buildUpon.appendQueryParameter("age", nGSDKAdRequest.age);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.bundleid)) {
            buildUpon.appendQueryParameter("bundleid", nGSDKAdRequest.bundleid);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.keywords)) {
            buildUpon.appendQueryParameter("keywords", nGSDKAdRequest.keywords);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.coppa)) {
            buildUpon.appendQueryParameter("coppa", nGSDKAdRequest.coppa);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.gid)) {
            buildUpon.appendQueryParameter("gid", nGSDKAdRequest.gid);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.gidmd5)) {
            buildUpon.appendQueryParameter("gidmd5", nGSDKAdRequest.gidmd5);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.gidsha1)) {
            buildUpon.appendQueryParameter("gidsha1", nGSDKAdRequest.gidsha1);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.displaymanager)) {
            buildUpon.appendQueryParameter(POBConstants.KEY_DISPLAY_MANAGER, nGSDKAdRequest.displaymanager);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.displaymanagerver)) {
            buildUpon.appendQueryParameter(POBConstants.KEY_DISPLAY_MANAGER_VERSION, nGSDKAdRequest.displaymanagerver);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.omidpn)) {
            buildUpon.appendQueryParameter("omidpn", nGSDKAdRequest.omidpn);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.omidpv)) {
            buildUpon.appendQueryParameter("omidpv", nGSDKAdRequest.omidpv);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.rv)) {
            buildUpon.appendQueryParameter(CampaignEx.JSON_KEY_REWARD_TEMPLATE, nGSDKAdRequest.rv);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.usprivacy)) {
            buildUpon.appendQueryParameter("usprivacy", nGSDKAdRequest.usprivacy);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.userconsent)) {
            buildUpon.appendQueryParameter("userconsent", nGSDKAdRequest.userconsent);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.gppstring)) {
            buildUpon.appendQueryParameter("gpp", nGSDKAdRequest.gppstring);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.gppsid)) {
            buildUpon.appendQueryParameter("gppsid", nGSDKAdRequest.gppsid);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.carrier)) {
            buildUpon.appendQueryParameter("carrier", nGSDKAdRequest.carrier);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.connectiontype)) {
            buildUpon.appendQueryParameter("connectiontype", nGSDKAdRequest.connectiontype);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.mccmnc)) {
            buildUpon.appendQueryParameter(POBConstants.KEY_MCCMNC, nGSDKAdRequest.mccmnc);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.mccmncsim)) {
            buildUpon.appendQueryParameter("mccmncsim", nGSDKAdRequest.mccmncsim);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.geofetch)) {
            buildUpon.appendQueryParameter("geofetch", nGSDKAdRequest.geofetch);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.sua)) {
            buildUpon.appendQueryParameter("sua", nGSDKAdRequest.sua);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.ae)) {
            buildUpon.appendQueryParameter("ae", nGSDKAdRequest.ae);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.protocol)) {
            buildUpon.appendQueryParameter("protocol", nGSDKAdRequest.protocol);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.api)) {
            buildUpon.appendQueryParameter("api", nGSDKAdRequest.api);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.impdepth)) {
            buildUpon.appendQueryParameter(POBConstants.KEY_IMP_DEPTH, nGSDKAdRequest.impdepth);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.ageofapp)) {
            buildUpon.appendQueryParameter("ageofapp", nGSDKAdRequest.ageofapp);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.sessionduration)) {
            buildUpon.appendQueryParameter(POBConstants.KEY_SESSION_DURATION, nGSDKAdRequest.sessionduration);
        }
        String str2 = "";
        if (!nGSDKAdRequest.getSignals().isEmpty()) {
            for (Signal signal : nGSDKAdRequest.getSignals()) {
                for (Map.Entry<Field, BidParam> entry : a(signal.getClass()).entrySet()) {
                    Field key = entry.getKey();
                    BidParam value = entry.getValue();
                    try {
                        if (Iterable.class.isAssignableFrom(key.getType())) {
                            String valueOf2 = String.valueOf(key.get(signal));
                            valueOf = valueOf2.substring(1, valueOf2.length() - 1).replaceAll("\\s+", "");
                        } else {
                            valueOf = String.valueOf(key.get(signal));
                        }
                        if (!TextUtils.isEmpty(valueOf) && !valueOf.equals(POBCommonConstants.NULL_VALUE) && !TextUtils.isEmpty(value.name())) {
                            buildUpon.appendQueryParameter(value.name(), valueOf);
                        }
                    } catch (IllegalAccessException unused) {
                    }
                }
            }
        }
        List<Topic> list = nGSDKAdRequest.topics;
        if (list != null && !list.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (Topic topic : nGSDKAdRequest.topics) {
                String concat = String.valueOf(topic.getTaxonomyVersion()).concat(StringUtils.COMMA).concat(topic.getTaxonomyVersionName().replaceAll("\\s", Marker.ANY_NON_NULL_MARKER));
                if (!hashMap.containsKey(concat)) {
                    hashMap.put(concat, new ArrayList());
                }
                ArrayList arrayList = (ArrayList) hashMap.get(concat);
                Objects.requireNonNull(arrayList);
                arrayList.add(String.valueOf(topic.getId()));
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                str2 = str2.concat((String) entry2.getKey()).concat(StringUtils.COMMA).concat(n7$$ExternalSyntheticBackport3.m(StringUtils.COMMA, (ArrayList) entry2.getValue())).concat("_");
            }
            buildUpon.appendQueryParameter("psut", str2.substring(0, str2.length() - 1));
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.vg)) {
            buildUpon.appendQueryParameter("vg", nGSDKAdRequest.vg);
        }
        if (!TextUtils.isEmpty(nGSDKAdRequest.hver)) {
            buildUpon.appendQueryParameter("hver", nGSDKAdRequest.hver);
        }
        return buildUpon.build();
    }

    public static String buildUrl(String str, NGSDKAdRequest nGSDKAdRequest) {
        return a(str, nGSDKAdRequest).toString();
    }

    public static String getUrlQuery(String str, NGSDKAdRequest nGSDKAdRequest) {
        return a(str, nGSDKAdRequest).getQuery();
    }

    private static Map<Field, BidParam> a(Class<?> cls) {
        Map<Field, BidParam> map;
        Map<Class<?>, Map<Field, BidParam>> map2 = b;
        Map<Field, BidParam> map3 = map2.get(cls);
        if (map3 != null) {
            return map3;
        }
        synchronized (map2) {
            try {
                map = map2.get(cls);
                if (map == null) {
                    map = new HashMap<>();
                    try {
                        try {
                            for (Field field : cls.getDeclaredFields()) {
                                BidParam bidParam = (BidParam) field.getAnnotation(BidParam.class);
                                if (bidParam != null) {
                                    field.setAccessible(true);
                                    map.put(field, bidParam);
                                }
                            }
                            b.put(cls, map);
                        } catch (SecurityException e) {
                            Logger.e(a, "Cannot reflect signal fields for " + cls.getSimpleName() + " - security exception: " + e.getMessage());
                        }
                    } catch (Exception e2) {
                        Logger.e(a, "Unexpected error reflecting signal fields for " + cls.getSimpleName(), e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }
}
