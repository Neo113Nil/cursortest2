package com.yandex.div.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.yandex.div.core.annotations.InternalApi;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@InternalApi
/* loaded from: classes13.dex */
public class PermissionUtils {
    private static final String PREFS_KEY_ANSWERED_PERMISSION_SET = "prefs_key_answered_permission_set";
    private static final String PREFS_NAME = "PermissionUtils.Prefs";

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.y);
        p0.startActivity(p1);
    }

    private PermissionUtils() {
    }

    public static boolean hasPermission(@NonNull Context context, @NonNull String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }

    public static void requestPermissions(@NonNull Activity activity, int i, @NonNull String[] strArr) {
        ActivityCompat.requestPermissions(activity, strArr, i);
    }

    @NonNull
    public static GrantResults parseGrantResults(@NonNull String[] strArr, @NonNull int[] iArr) {
        ArrayMap arrayMap = new ArrayMap();
        if (iArr.length == 0 || strArr.length != iArr.length) {
            return new GrantResults(arrayMap);
        }
        for (int i = 0; i < strArr.length; i++) {
            arrayMap.put(strArr[i], Boolean.valueOf(iArr[i] == 0));
        }
        return new GrantResults(arrayMap);
    }

    public static boolean isDeniedWithDontAsk(@NonNull Activity activity, @NonNull String str) {
        return (hasPermission(activity, str) || shouldShowRequestPermissionRationale(activity, Collections.singleton(str)) || !userEverAnswered(activity, str)) ? false : true;
    }

    public static void markUserAnswered(@NonNull Context context, @NonNull String[] strArr) {
        HashSet hashSet = new HashSet(getAnsweredPermissions(context));
        for (String str : strArr) {
            if (!hashSet.contains(str)) {
                hashSet.add(str);
            }
        }
        context.getSharedPreferences(PREFS_NAME, 0).edit().putStringSet(PREFS_KEY_ANSWERED_PERMISSION_SET, hashSet).apply();
    }

    public static boolean userEverAnswered(@NonNull Context context, @NonNull String str) {
        return getAnsweredPermissions(context).contains(str);
    }

    private static Set<String> getAnsweredPermissions(@NonNull Context context) {
        return context.getSharedPreferences(PREFS_NAME, 0).getStringSet(PREFS_KEY_ANSWERED_PERMISSION_SET, Collections.EMPTY_SET);
    }

    public static class GrantResults {

        @NonNull
        private final Map<String, Boolean> mResultMap;

        GrantResults(@NonNull Map<String, Boolean> map) {
            this.mResultMap = map;
        }

        public boolean contains(@NonNull String str) {
            return this.mResultMap.containsKey(str);
        }

        public boolean isPermissionGranted(@NonNull String str) {
            if (this.mResultMap.containsKey(str)) {
                return this.mResultMap.get(str).booleanValue();
            }
            return false;
        }

        public boolean isDeniedWithDontAsk(@NonNull Activity activity, @NonNull String str) {
            return (isPermissionGranted(str) || PermissionUtils.shouldShowRequestPermissionRationale(activity, Collections.singleton(str)) || !PermissionUtils.userEverAnswered(activity, str)) ? false : true;
        }

        public boolean areAllPermissionsGranted() {
            if (this.mResultMap.isEmpty()) {
                return false;
            }
            Iterator<Boolean> it = this.mResultMap.values().iterator();
            while (it.hasNext()) {
                if (!it.next().booleanValue()) {
                    return false;
                }
            }
            return true;
        }

        public boolean isAnyPermissionDeniedWithDontAsk(@NonNull Activity activity) {
            for (Map.Entry<String, Boolean> entry : this.mResultMap.entrySet()) {
                if (!entry.getValue().booleanValue() && !PermissionUtils.shouldShowRequestPermissionRationale(activity, Collections.singleton(entry.getKey()))) {
                    return true;
                }
            }
            return false;
        }

        public Collection<String> allPermissions() {
            return this.mResultMap.keySet();
        }
    }

    public static boolean shouldShowRequestPermissionRationale(@NonNull Activity activity, @NonNull Iterable<String> iterable) {
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void openSettings(@NonNull Context context) {
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", context.getPackageName(), null)).addFlags(268435456));
    }
}
