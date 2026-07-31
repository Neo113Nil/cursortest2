package com.smaato.sdk.ng.vpaid.macros;

import android.text.TextUtils;

/* loaded from: classes15.dex */
public class ErrorMacros {
    public String processUrl(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : str.replace("[ERRORCODE]", str2);
    }
}
