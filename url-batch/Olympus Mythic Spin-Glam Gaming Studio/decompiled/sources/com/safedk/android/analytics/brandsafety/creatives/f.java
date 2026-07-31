package com.safedk.android.analytics.brandsafety.creatives;

import android.text.TextUtils;
import com.safedk.android.utils.Logger;
import java.util.Arrays;

/* loaded from: classes14.dex */
public class f extends i {
    private static final String b = "PrefetchVastAdTagUri";
    private static final String c = "\\[[\\s\\S].*?\\]";
    private final String[] d;

    public f(String str) {
        super(str);
        String[] a = a(str);
        this.d = a;
        Logger.d(b, "Prefetch URI, unique parts: ", Arrays.toString(a));
    }

    private String[] a(String str) {
        if (str != null) {
            return str.split(c);
        }
        return new String[0];
    }

    private boolean b(String str) {
        for (String str2 : this.d) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            int indexOf = str.indexOf(str2);
            if (indexOf < 0) {
                return a(str2, str);
            }
            str = str.substring(indexOf + str2.length());
        }
        return true;
    }

    private static boolean a(String str, String str2) {
        int indexOf = str2.indexOf(38);
        if (indexOf > 0) {
            str2 = str2.substring(indexOf);
        }
        if (!str.contains(str2)) {
            return false;
        }
        Logger.d(b, "Prefetch URI, VastAdTagUri in the prefetch has a tail that is not included in the loaded URL");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.i
    public boolean equals(Object obj) {
        return b(obj.toString());
    }
}
