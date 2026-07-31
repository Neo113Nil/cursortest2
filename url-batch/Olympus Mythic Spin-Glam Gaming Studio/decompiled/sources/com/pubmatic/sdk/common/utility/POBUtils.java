package com.pubmatic.sdk.common.utility;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.models.POBLocation;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class POBUtils {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsetsCompat a(View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
        return windowInsetsCompat.consumeSystemWindowInsets();
    }

    public static void assertMainThread(@NonNull String str) {
        if (isMainThread()) {
            return;
        }
        POBLog.error("POBUtils", POBCommonConstants.MAIN_THREAD_EXCEPTION_MSG, str);
    }

    @NonNull
    public static String buildConfigURL(@NonNull String str, int i) {
        return String.format(Locale.ENGLISH, POBCommonConstants.CONFIG_URL, str, Integer.valueOf(i));
    }

    @NonNull
    public static String buildUriWithQueryParams(@NonNull Uri uri, @NonNull Map<String, String> map) {
        Uri.Builder buildUpon = uri.buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }

    @NonNull
    public static String buildUrlWithQueryParam(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter(str2, str3);
        return buildUpon.build().toString();
    }

    public static int convertDpToPixel(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static float convertDpToPixelWithFloatPrecession(int i) {
        return i * Resources.getSystem().getDisplayMetrics().density;
    }

    public static int convertPixelToDp(int i) {
        return (int) (i / Resources.getSystem().getDisplayMetrics().density);
    }

    @Nullable
    public static List<String> convertStringJsonArrayToList(@Nullable JSONArray jSONArray) {
        if (isJsonArrayNullOrEmpty(jSONArray)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            if (!jSONArray.isNull(i)) {
                arrayList.add(jSONArray.optString(i));
            }
        }
        return arrayList;
    }

    public static double convertToSeconds(@Nullable String str, @Nullable String str2) {
        if (str2 == null || str2.isEmpty()) {
            return 0.0d;
        }
        if (!str2.contains("%")) {
            return getSeconds(str2);
        }
        try {
            return (getSeconds(str) * Double.parseDouble(str2.replace("%", ""))) / 100.0d;
        } catch (NumberFormatException unused) {
            POBLog.error("POBUtils", "Invalid time value", new Object[0]);
            return 0.0d;
        }
    }

    @Nullable
    public static String decodeUrl(@NonNull String str) {
        try {
            POBLog.debug("POBUtils", "encoded URL: " + str, new Object[0]);
            String decode = URLDecoder.decode(str, StandardCharsets.UTF_8.name());
            POBLog.debug("POBUtils", "Decoded URL: " + decode, new Object[0]);
            return decode;
        } catch (UnsupportedEncodingException | IllegalArgumentException e) {
            POBLog.debug("POBUtils", "Failed to decode url due to " + e.getMessage(), new Object[0]);
            return null;
        }
    }

    public static boolean getBooleanValue(@Nullable String str) {
        if (str == null) {
            return false;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            POBLog.error("POBUtils", "Cannot convert string %s to boolean", str);
            return false;
        }
    }

    public static int getDeviceOrientation(@NonNull Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            return 0;
        }
        return configuration.orientation;
    }

    public static int getIntegerValue(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            POBLog.error("POBUtils", "Cannot convert string %s to integer", str);
            return 0;
        }
    }

    public static POBAdSize getInterstitialAdSize(@NonNull Context context) {
        int deviceOrientation = getDeviceOrientation(context);
        return isTablet(context) ? deviceOrientation == 2 ? POBAdSize.INTERSTITIAL_1024x768 : POBAdSize.INTERSTITIAL_768x1024 : deviceOrientation == 2 ? POBAdSize.INTERSTITIAL_480x320 : POBAdSize.INTERSTITIAL_320x480;
    }

    @Nullable
    public static POBLocation getLocation(@Nullable POBLocationDetector pOBLocationDetector) {
        Location location;
        POBLocation pOBLocation = (!POBInstanceProvider.getSdkConfig().isLocationAccessAllowed() || pOBLocationDetector == null || (location = pOBLocationDetector.getLocation()) == null) ? null : new POBLocation(location);
        return pOBLocation == null ? POBInstanceProvider.getSdkConfig().getLocation() : pOBLocation;
    }

    public static int getRandomNumber(int i, int i2) {
        return i + ((int) (Math.random() * ((i2 - i) + 1)));
    }

    public static int getScreenHeight() {
        return convertPixelToDp(Resources.getSystem().getDisplayMetrics().heightPixels);
    }

    public static int getScreenWidth() {
        return convertPixelToDp(Resources.getSystem().getDisplayMetrics().widthPixels);
    }

    public static double getSeconds(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return 0.0d;
        }
        String[] split = str.split(":", -1);
        double d = 0.0d;
        for (int length = split.length - 1; length >= 0; length--) {
            try {
                d += Double.parseDouble(split[length]) * Math.pow(60.0d, (split.length - 1) - length);
            } catch (NumberFormatException unused) {
                POBLog.error("POBUtils", "Invalid time value", new Object[0]);
                return 0.0d;
            }
        }
        return d;
    }

    public static int getTimeOffsetInMinutes() {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        return (calendar.get(15) + calendar.get(16)) / 60000;
    }

    public static int getValidRefreshInterval(int i, int i2) {
        if (i <= 0) {
            return 0;
        }
        return i <= i2 ? i2 : i;
    }

    @Nullable
    public static <K, V> V getValueFromMap(@Nullable Map<K, V> map, @NonNull K k) {
        if (map == null || !map.containsKey(k)) {
            return null;
        }
        try {
            return map.get(k);
        } catch (ClassCastException | NullPointerException e) {
            POBLog.error("POBUtils", "Unable to get the %s key from passed map because of: %s", k, e.getMessage());
            return null;
        }
    }

    public static int getViewVisiblePixel(@Nullable View view) {
        if (view == null) {
            return 0;
        }
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            return rect.height() * rect.width();
        }
        return 0;
    }

    public static int[] getViewXYPosition(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = convertPixelToDp(iArr[0]);
        iArr[1] = convertPixelToDp(iArr[1]);
        return iArr;
    }

    public static float getVisiblePercent(@Nullable View view) {
        if (view == null) {
            return 0.0f;
        }
        if (view.getGlobalVisibleRect(new Rect())) {
            return ((r0.height() * r0.width()) * 100) / (view.getHeight() * view.getWidth());
        }
        return 0.0f;
    }

    public static boolean hasPermission(@NonNull Context context, @NonNull String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception e) {
            POBLog.warn("POBUtils", "Error while checking permission %s", e.getMessage());
            return false;
        }
    }

    public static boolean isDebugBuild(@NonNull Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean isExpired(long j, long j2) {
        return j <= 0 || System.currentTimeMillis() - j > j2;
    }

    public static boolean isJsonArrayNullOrEmpty(@Nullable JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() <= 0;
    }

    public static boolean isJsonObjectNullOrEmpty(@Nullable JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() <= 0;
    }

    public static boolean isListNullOrEmpty(@Nullable List<?> list) {
        return list == null || list.isEmpty();
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean isNull(@Nullable Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNullOrEmpty(@Nullable String str) {
        if (str != null) {
            return str.isEmpty();
        }
        return true;
    }

    public static boolean isStringValueNullOrEmpty(@Nullable String str) {
        return str == null || str.isEmpty() || str.equals(POBCommonConstants.NULL_VALUE);
    }

    public static boolean isTablet(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static boolean isValidPlayStoreUrl(@Nullable String str) {
        if (str == null) {
            return false;
        }
        if (str.contains(POBCommonConstants.PLAY_STORE_DOMAIN) || str.contains(POBCommonConstants.MARKET_LAUNCH_URL) || str.contains(POBCommonConstants.MARKET_DETAILS_URL)) {
            return str.contains("id=");
        }
        return false;
    }

    public static boolean isViewVisible(@Nullable View view, int i) {
        return getViewVisiblePixel(view) >= i;
    }

    public static void logBidWinningStatus(boolean z, @Nullable String str) {
        if (z) {
            POBLog.debug("POBUtils", "Bid win for partner - %s", str);
        } else {
            POBLog.debug("POBUtils", "AdServerWin", new Object[0]);
        }
    }

    public static boolean openExternalBrowser(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return true;
        } catch (Exception unused) {
            POBLog.error("POBUtils", "Open external browser %s", "Not able to parse url");
            return false;
        }
    }

    @NonNull
    public static String parseJsTracker(@NonNull List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (str.startsWith("http")) {
                sb.append(String.format("<script src=\"%s\"></script>", str));
            } else {
                sb.append(str);
            }
        }
        return String.format("<!DOCTYPE HTML><html><head>%s</head></html>", sb);
    }

    @NonNull
    public static Set<String> parseJsonArrayToSet(@Nullable JSONArray jSONArray) throws JSONException {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.getString(i));
            }
        }
        return hashSet;
    }

    @Nullable
    @WorkerThread
    public static String readFromAssets(@NonNull Context context, @NonNull String str) {
        IOException e;
        String str2;
        try {
            InputStream open = context.getAssets().open(str);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            str2 = new String(bArr);
        } catch (IOException e2) {
            e = e2;
            str2 = null;
        }
        try {
            POBLog.debug("POBUtils", POBLogConstants.READ_FROM_ASSET, str);
            return str2;
        } catch (IOException e3) {
            e = e3;
            POBLog.error("POBUtils", "Failed to read file %s from bundle with error: %s", str, e);
            return str2;
        }
    }

    @NonNull
    public static Context resolveWebViewContext(@NonNull Context context) {
        return context;
    }

    public static void runOnBackgroundThread(Runnable runnable) {
        POBTaskHandler.getInstance().runOnBackgroundThread(runnable);
    }

    public static void runOnMainThread(Runnable runnable) {
        POBTaskHandler.getInstance().runOnMainThread(runnable);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.F);
        p0.startActivity(p1);
    }

    @RequiresApi
    public static void setSystemFitWindowsForEdgeToEdge(@NonNull final View view) {
        ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: com.pubmatic.sdk.common.utility.POBUtils$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat a;
                a = POBUtils.a(view, view2, windowInsetsCompat);
                return a;
            }
        });
    }

    public static void startActivity(@NonNull Context context, @NonNull Intent intent) throws Exception {
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context.getApplicationContext(), intent);
        } catch (ActivityNotFoundException e) {
            POBLog.warn("POBUtils", "Activity not found %s", e.getMessage());
            throw new ActivityNotFoundException();
        } catch (Exception e2) {
            POBLog.warn("POBUtils", "Error while starting activity %s", e2.getMessage());
            throw new Exception(e2);
        }
    }
}
