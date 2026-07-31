package com.smaato.sdk.ng.vpaid.macros;

import android.text.TextUtils;
import com.smaato.sdk.ng.utils.EncodingUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes4.dex */
public class GenericMacros {
    private String a() {
        return String.valueOf(new Random().nextInt(90000000) + 10000000);
    }

    private String b() {
        String urlEncode = EncodingUtils.urlEncode(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.ENGLISH).format(new Date()));
        return TextUtils.isEmpty(urlEncode) ? String.valueOf(-1) : urlEncode;
    }

    public String processUrl(String str) {
        return str.replace("[TIMESTAMP]", b()).replace("[CACHEBUSTING]", a());
    }
}
