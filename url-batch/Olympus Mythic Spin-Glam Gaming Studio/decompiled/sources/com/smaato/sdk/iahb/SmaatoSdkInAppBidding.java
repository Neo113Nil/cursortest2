package com.smaato.sdk.iahb;

import android.text.TextUtils;
import com.smaato.sdk.iahb.InAppBiddingException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes15.dex */
public final class SmaatoSdkInAppBidding {
    private static final Map<String, String> BID_CACHE = new HashMap();

    public static String saveBid(InAppBid inAppBid) throws InAppBiddingException {
        if (inAppBid != null && !TextUtils.isEmpty(inAppBid.getJson())) {
            String uuid = UUID.randomUUID().toString();
            BID_CACHE.put(uuid, inAppBid.getJson());
            return uuid;
        }
        throw new InAppBiddingException(InAppBiddingException.InApBiddingError.INVALID_JSON);
    }

    public static String getBid(String str) {
        return BID_CACHE.remove(str);
    }
}
