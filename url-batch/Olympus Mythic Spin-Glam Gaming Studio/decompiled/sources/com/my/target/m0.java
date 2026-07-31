package com.my.target;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class m0 {
    public static String a(String[] strArr) {
        return strArr == null ? "" : TextUtils.join(StringUtils.COMMA, strArr);
    }

    public static String a(List list) {
        return TextUtils.join(StringUtils.COMMA, list);
    }

    public static int[] a(int... iArr) {
        Arrays.sort(iArr);
        return iArr;
    }

    public static boolean a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
