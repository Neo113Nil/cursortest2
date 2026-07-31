package com.my.target.common;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.my.target.u4;
import com.my.target.wh;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes15.dex */
public class MyTargetUtils {
    @NonNull
    @WorkerThread
    public static Map<String, String> collectInfo(@NonNull Context context) {
        return u4.b().a(MyTargetManager.getSdkConfig(), MyTargetPrivacy.currentPrivacy(), null, context);
    }

    public static void sendStat(@NonNull String str, @NonNull Context context) {
        wh.a(str);
    }
}
