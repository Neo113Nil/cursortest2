package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.pubmatic.sdk.common.POBCommonConstants;

/* compiled from: StringUtils.java */
/* loaded from: classes3.dex */
public class a1 {
    public static boolean a(String str) {
        return str == null || TextUtils.isEmpty(str.trim()) || POBCommonConstants.NULL_VALUE.equals(str);
    }

    public static boolean b(String str) {
        return (str == null || TextUtils.isEmpty(str.trim()) || POBCommonConstants.NULL_VALUE.equals(str)) ? false : true;
    }
}
