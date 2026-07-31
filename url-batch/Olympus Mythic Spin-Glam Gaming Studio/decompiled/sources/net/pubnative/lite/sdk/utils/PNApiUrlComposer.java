package net.pubnative.lite.sdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.applovin.impl.n7$$ExternalSyntheticBackport3;
import com.facebook.AuthenticationTokenClaims;
import com.ironsource.B5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import net.pubnative.lite.sdk.models.PNAdRequest;
import net.pubnative.lite.sdk.models.Topic;
import net.pubnative.lite.sdk.models.bidstream.BidParam;
import net.pubnative.lite.sdk.models.bidstream.Signal;
import org.slf4j.Marker;

/* loaded from: classes14.dex */
public final class PNApiUrlComposer {
    private static final Map<Class<?>, Map<Field, BidParam>> SIGNAL_FIELD_CACHE = new ConcurrentHashMap();
    private static final String TAG = "PNApiUrlComposer";

    private static Uri buildUri(String str, PNAdRequest pNAdRequest) {
        String valueOf;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendPath("api");
        buildUpon.appendPath("v3");
        buildUpon.appendPath("native");
        if (!TextUtils.isEmpty(pNAdRequest.appToken)) {
            buildUpon.appendQueryParameter("apptoken", pNAdRequest.appToken);
        }
        if (!TextUtils.isEmpty(pNAdRequest.os)) {
            buildUpon.appendQueryParameter("os", pNAdRequest.os);
        }
        if (!TextUtils.isEmpty(pNAdRequest.osver)) {
            buildUpon.appendQueryParameter("osver", pNAdRequest.osver);
        }
        if (!TextUtils.isEmpty(pNAdRequest.devicemodel)) {
            buildUpon.appendQueryParameter(B5.n, pNAdRequest.devicemodel);
        }
        if (!TextUtils.isEmpty(pNAdRequest.make)) {
            buildUpon.appendQueryParameter("make", pNAdRequest.make);
        }
        if (!TextUtils.isEmpty(pNAdRequest.deviceHeight)) {
            buildUpon.appendQueryParameter("dh", pNAdRequest.deviceHeight);
        }
        if (!TextUtils.isEmpty(pNAdRequest.deviceWidth)) {
            buildUpon.appendQueryParameter("dw", pNAdRequest.deviceWidth);
        }
        if (!TextUtils.isEmpty(pNAdRequest.orientation)) {
            buildUpon.appendQueryParameter("scro", pNAdRequest.orientation);
        }
        if (!TextUtils.isEmpty(pNAdRequest.ppi)) {
            buildUpon.appendQueryParameter("ppi", pNAdRequest.ppi);
        }
        if (!TextUtils.isEmpty(pNAdRequest.pxratio)) {
            buildUpon.appendQueryParameter(POBConstants.KEY_PXRATIO, pNAdRequest.pxratio);
        }
        if (!TextUtils.isEmpty(pNAdRequest.js)) {
            buildUpon.appendQueryParameter(POBConstants.KEY_JS, pNAdRequest.js);
        }
        if (!TextUtils.isEmpty(pNAdRequest.soundSetting)) {
            buildUpon.appendQueryParameter(AuthenticationTokenClaims.JSON_KEY_AUD, pNAdRequest.soundSetting);
        }
        if (!TextUtils.isEmpty(pNAdRequest.dnt)) {
            buildUpon.appendQueryParameter("dnt", pNAdRequest.dnt);
        }
        if (!TextUtils.isEmpty(pNAdRequest.al)) {
            buildUpon.appendQueryParameter(CampaignEx.JSON_KEY_AD_AL, pNAdRequest.al);
        }
        if (!TextUtils.isEmpty(pNAdRequest.width)) {
            buildUpon.appendQueryParameter("w", pNAdRequest.width);
        }
        if (!TextUtils.isEmpty(pNAdRequest.height)) {
            buildUpon.appendQueryParameter("h", pNAdRequest.height);
        }
        if (!TextUtils.isEmpty(pNAdRequest.mf)) {
            buildUpon.appendQueryParameter("mf", pNAdRequest.mf);
        }
        if (!TextUtils.isEmpty(pNAdRequest.af)) {
            buildUpon.appendQueryParameter("af", pNAdRequest.af);
        }
        if (!TextUtils.isEmpty(pNAdRequest.zoneId)) {
            buildUpon.appendQueryParameter("zoneid", pNAdRequest.zoneId);
        }
        if (!TextUtils.isEmpty(pNAdRequest.testMode)) {
            buildUpon.appendQueryParameter(POBConstants.TEST_MODE, pNAdRequest.testMode);
        }
        if (!TextUtils.isEmpty(pNAdRequest.locale)) {
            buildUpon.appendQueryParameter(CommonUrlParts.LOCALE, pNAdRequest.locale);
        }
        if (!TextUtils.isEmpty(pNAdRequest.language)) {
            buildUpon.appendQueryParameter(POBConstants.KEY_LANGUAGE, pNAdRequest.language);
        }
        if (!TextUtils.isEmpty(pNAdRequest.langb)) {
            buildUpon.appendQueryParameter("langb", pNAdRequest.langb);
        }
        if (!TextUtils.isEmpty(pNAdRequest.latitude)) {
            buildUpon.appendQueryParameter("lat", pNAdRequest.latitude);
        }
        if (!TextUtils.isEmpty(pNAdRequest.longitude)) {
            buildUpon.appendQueryParameter(Constants.LONG, pNAdRequest.longitude);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gender)) {
            buildUpon.appendQueryParameter("gender", pNAdRequest.gender);
        }
        if (!TextUtils.isEmpty(pNAdRequest.age)) {
            buildUpon.appendQueryParameter("age", pNAdRequest.age);
        }
        if (!TextUtils.isEmpty(pNAdRequest.bundleid)) {
            buildUpon.appendQueryParameter("bundleid", pNAdRequest.bundleid);
        }
        if (!TextUtils.isEmpty(pNAdRequest.keywords)) {
            buildUpon.appendQueryParameter("keywords", pNAdRequest.keywords);
        }
        if (!TextUtils.isEmpty(pNAdRequest.coppa)) {
            buildUpon.appendQueryParameter("coppa", pNAdRequest.coppa);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gid)) {
            buildUpon.appendQueryParameter("gid", pNAdRequest.gid);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gidmd5)) {
            buildUpon.appendQueryParameter("gidmd5", pNAdRequest.gidmd5);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gidsha1)) {
            buildUpon.appendQueryParameter("gidsha1", pNAdRequest.gidsha1);
        }
        if (!TextUtils.isEmpty(pNAdRequest.displaymanager)) {
            buildUpon.appendQueryParameter(POBConstants.KEY_DISPLAY_MANAGER, pNAdRequest.displaymanager);
        }
        if (!TextUtils.isEmpty(pNAdRequest.displaymanagerver)) {
            buildUpon.appendQueryParameter(POBConstants.KEY_DISPLAY_MANAGER_VERSION, pNAdRequest.displaymanagerver);
        }
        if (!TextUtils.isEmpty(pNAdRequest.omidpn)) {
            buildUpon.appendQueryParameter("omidpn", pNAdRequest.omidpn);
        }
        if (!TextUtils.isEmpty(pNAdRequest.omidpv)) {
            buildUpon.appendQueryParameter("omidpv", pNAdRequest.omidpv);
        }
        if (!TextUtils.isEmpty(pNAdRequest.rv)) {
            buildUpon.appendQueryParameter(CampaignEx.JSON_KEY_REWARD_TEMPLATE, pNAdRequest.rv);
        }
        if (!TextUtils.isEmpty(pNAdRequest.usprivacy)) {
            buildUpon.appendQueryParameter("usprivacy", pNAdRequest.usprivacy);
        }
        if (!TextUtils.isEmpty(pNAdRequest.userconsent)) {
            buildUpon.appendQueryParameter("userconsent", pNAdRequest.userconsent);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gppstring)) {
            buildUpon.appendQueryParameter("gpp", pNAdRequest.gppstring);
        }
        if (!TextUtils.isEmpty(pNAdRequest.gppsid)) {
            buildUpon.appendQueryParameter("gppsid", pNAdRequest.gppsid);
        }
        if (!TextUtils.isEmpty(pNAdRequest.carrier)) {
            buildUpon.appendQueryParameter("carrier", pNAdRequest.carrier);
        }
        if (!TextUtils.isEmpty(pNAdRequest.connectiontype)) {
            buildUpon.appendQueryParameter("connectiontype", pNAdRequest.connectiontype);
        }
        if (!TextUtils.isEmpty(pNAdRequest.mccmnc)) {
            buildUpon.appendQueryParameter(POBConstants.KEY_MCCMNC, pNAdRequest.mccmnc);
        }
        if (!TextUtils.isEmpty(pNAdRequest.mccmncsim)) {
            buildUpon.appendQueryParameter("mccmncsim", pNAdRequest.mccmncsim);
        }
        if (!TextUtils.isEmpty(pNAdRequest.geofetch)) {
            buildUpon.appendQueryParameter("geofetch", pNAdRequest.geofetch);
        }
        if (!TextUtils.isEmpty(pNAdRequest.sua)) {
            buildUpon.appendQueryParameter("sua", pNAdRequest.sua);
        }
        if (!TextUtils.isEmpty(pNAdRequest.ae)) {
            buildUpon.appendQueryParameter("ae", pNAdRequest.ae);
        }
        if (!TextUtils.isEmpty(pNAdRequest.protocol)) {
            buildUpon.appendQueryParameter("protocol", pNAdRequest.protocol);
        }
        if (!TextUtils.isEmpty(pNAdRequest.api)) {
            buildUpon.appendQueryParameter("api", pNAdRequest.api);
        }
        if (!TextUtils.isEmpty(pNAdRequest.impdepth)) {
            buildUpon.appendQueryParameter(POBConstants.KEY_IMP_DEPTH, pNAdRequest.impdepth);
        }
        if (!TextUtils.isEmpty(pNAdRequest.ageofapp)) {
            buildUpon.appendQueryParameter("ageofapp", pNAdRequest.ageofapp);
        }
        if (!TextUtils.isEmpty(pNAdRequest.sessionduration)) {
            buildUpon.appendQueryParameter(POBConstants.KEY_SESSION_DURATION, pNAdRequest.sessionduration);
        }
        String str2 = "";
        if (!pNAdRequest.getSignals().isEmpty()) {
            for (Signal signal : pNAdRequest.getSignals()) {
                for (Map.Entry<Field, BidParam> entry : getSignalFieldCache(signal.getClass()).entrySet()) {
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
        List<Topic> list = pNAdRequest.topics;
        if (list != null && !list.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (Topic topic : pNAdRequest.topics) {
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
        if (!TextUtils.isEmpty(pNAdRequest.vg)) {
            buildUpon.appendQueryParameter("vg", pNAdRequest.vg);
        }
        if (!TextUtils.isEmpty(pNAdRequest.hver)) {
            buildUpon.appendQueryParameter("hver", pNAdRequest.hver);
        }
        return buildUpon.build();
    }

    public static String buildUrl(String str, PNAdRequest pNAdRequest) {
        return buildUri(str, pNAdRequest).toString();
    }

    private static Map<Field, BidParam> getSignalFieldCache(Class<?> cls) {
        Map<Field, BidParam> map;
        Map<Class<?>, Map<Field, BidParam>> map2 = SIGNAL_FIELD_CACHE;
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
                            SIGNAL_FIELD_CACHE.put(cls, map);
                        } catch (SecurityException e) {
                            Logger.e(TAG, "Cannot reflect signal fields for " + cls.getSimpleName() + " - security exception: " + e.getMessage());
                        }
                    } catch (Exception e2) {
                        Logger.e(TAG, "Unexpected error reflecting signal fields for " + cls.getSimpleName(), e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public static String getUrlQuery(String str, PNAdRequest pNAdRequest) {
        return buildUri(str, pNAdRequest).getQuery();
    }
}
