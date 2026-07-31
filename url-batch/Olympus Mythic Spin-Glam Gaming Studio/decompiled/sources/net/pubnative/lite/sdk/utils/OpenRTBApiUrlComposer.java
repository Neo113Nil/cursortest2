package net.pubnative.lite.sdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.moloco.sdk.internal.services.init.i;
import net.pubnative.lite.sdk.models.request.OpenRTBAdRequest;

/* loaded from: classes6.dex */
public final class OpenRTBApiUrlComposer {
    public static String buildUrl(String str, OpenRTBAdRequest openRTBAdRequest) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendPath("bid");
        buildUpon.appendPath(i.a);
        buildUpon.appendPath("request");
        if (!TextUtils.isEmpty(openRTBAdRequest.appToken)) {
            buildUpon.appendQueryParameter("apptoken", openRTBAdRequest.appToken);
        }
        if (!TextUtils.isEmpty(openRTBAdRequest.zoneId)) {
            buildUpon.appendQueryParameter("zoneid", openRTBAdRequest.zoneId);
        }
        return buildUpon.build().toString();
    }
}
