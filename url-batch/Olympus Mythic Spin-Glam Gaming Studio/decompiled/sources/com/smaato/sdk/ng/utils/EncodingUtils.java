package com.smaato.sdk.ng.utils;

import android.text.TextUtils;
import com.ironsource.B5;
import com.smaato.sdk.ng.NextGen;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* loaded from: classes4.dex */
public class EncodingUtils {
    private static final String a = "EncodingUtils";

    public static String urlEncode(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, B5.O);
        } catch (UnsupportedEncodingException e) {
            NextGen.reportException((Exception) e);
            Logger.e(a, "Error url encoding string: ", e);
            return "";
        }
    }
}
