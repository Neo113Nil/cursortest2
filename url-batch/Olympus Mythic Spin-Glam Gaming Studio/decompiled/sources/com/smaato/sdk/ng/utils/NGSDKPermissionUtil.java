package com.smaato.sdk.ng.utils;

import android.content.Context;
import android.os.Process;

/* loaded from: classes3.dex */
public class NGSDKPermissionUtil {
    public static int checkSelfPermission(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static boolean hasPermission(Context context, String str) {
        return checkSelfPermission(context, str) == 0;
    }
}
