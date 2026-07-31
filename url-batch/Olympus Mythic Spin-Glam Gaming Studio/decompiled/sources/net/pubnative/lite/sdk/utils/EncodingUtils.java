package net.pubnative.lite.sdk.utils;

import android.text.TextUtils;
import com.ironsource.B5;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import net.pubnative.lite.sdk.HyBid;

/* loaded from: classes10.dex */
public class EncodingUtils {
    private static final String TAG = "EncodingUtils";

    public static String urlEncode(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, B5.O);
        } catch (UnsupportedEncodingException e) {
            HyBid.reportException((Exception) e);
            Logger.e(TAG, "Error url encoding string: ", e);
            return "";
        }
    }
}
