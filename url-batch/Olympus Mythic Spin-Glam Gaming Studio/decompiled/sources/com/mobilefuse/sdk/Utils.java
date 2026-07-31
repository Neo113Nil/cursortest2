package com.mobilefuse.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.applovin.impl.n7$$ExternalSyntheticBackport2;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes14.dex */
public class Utils {
    @NonNull
    public static Handler getHandler() {
        return new Handler(Looper.getMainLooper());
    }

    public static int[] getDeviceScreenSize() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    public static int[] getScreenSizeAsPixels(Context context) throws Throwable {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    public static int[] getScreenSizeAsDp(Activity activity) throws Throwable {
        int[] screenSizeAsPixels = getScreenSizeAsPixels(activity);
        convertFromPixelsToDp(activity, screenSizeAsPixels);
        return screenSizeAsPixels;
    }

    public static int convertDpToPx(Context context, int i) throws Throwable {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static int convertPxToDp(Context context, int i) throws Throwable {
        return (int) ((i / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void convertFromPixelsToDp(Activity activity, int[] iArr) throws Throwable {
        float f = activity.getResources().getDisplayMetrics().density;
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = (int) ((iArr[i] / f) + 0.5f);
        }
    }

    public static void convertFromDpToPixels(Activity activity, int[] iArr) throws Throwable {
        float f = activity.getResources().getDisplayMetrics().density;
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = (int) ((iArr[i] * f) + 0.5f);
        }
    }

    public static Activity getActivityForView(View view) throws Throwable {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static PackageInfo getPackageInfo(Context context) throws Throwable {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
    }

    public static boolean hasIntent(Context context, Intent intent) throws Throwable {
        return context.getPackageManager().queryIntentActivities(intent, 0).size() > 0;
    }

    public static void setActivityOrientation(Activity activity, int i) throws Throwable {
        String str = Build.MODEL;
        Locale locale = Locale.US;
        String upperCase = str.toUpperCase(locale);
        boolean z = Build.MANUFACTURER.toUpperCase(locale).equals("AMAZON") && (upperCase.equals("KFTT") || upperCase.equals("KFJWI") || upperCase.equals("KFJWA"));
        if (activity == null || activity.isFinishing()) {
            return;
        }
        int rotation = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 1) {
            if (rotation == 2) {
                activity.setRequestedOrientation(9);
                return;
            } else {
                activity.setRequestedOrientation(1);
                return;
            }
        }
        if (i == 2) {
            if (z) {
                if (rotation == 0 || rotation == 1) {
                    activity.setRequestedOrientation(8);
                    return;
                } else {
                    activity.setRequestedOrientation(0);
                    return;
                }
            }
            if (rotation == 0 || rotation == 1) {
                activity.setRequestedOrientation(0);
            } else {
                activity.setRequestedOrientation(8);
            }
        }
    }

    public static void lockOrientationFromExpand(Activity activity, boolean z, String str) throws Throwable {
        if (str == null) {
            return;
        }
        if (!str.equals("none")) {
            lockToMraidOrientation(activity, str);
        }
        if (z) {
            unlockOrientation(activity);
        } else if (str.equals("none")) {
            lockToCurrentOrientation(activity);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void lockToMraidOrientation(Activity activity, String str) throws Throwable {
        boolean z;
        int i = 2;
        int i2 = activity.getResources().getConfiguration().orientation;
        str.hashCode();
        switch (str.hashCode()) {
            case 3387192:
                if (str.equals("none")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case 729267099:
                if (str.equals("portrait")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case 1430647483:
                if (str.equals("landscape")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
                activity.setRequestedOrientation(-1);
                return;
            case true:
                i = 1;
                break;
            case true:
                break;
            default:
                i = i2;
                break;
        }
        setActivityOrientation(activity, i);
    }

    public static void unlockOrientation(Activity activity) throws Throwable {
        activity.setRequestedOrientation(-1);
    }

    protected static void lockToCurrentOrientation(Activity activity) throws Throwable {
        setActivityOrientation(activity, activity.getResources().getConfiguration().orientation);
    }

    public static String getApplicationName(Context context) throws Throwable {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i);
    }

    public static boolean isDeviceTypeTablet() throws Throwable {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        float f = displayMetrics.density;
        return Math.min(((float) min) / f, ((float) max) / f) >= 600.0f;
    }

    public static boolean isAttachedToWindow(@NonNull View view) {
        return view.isAttachedToWindow();
    }

    public static boolean hasManifestPermission(Context context, String str) throws Throwable {
        return context != null && context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public static String getAssetContent(Context context, String str) throws Throwable {
        try {
            InputStream open = context.getAssets().open(str);
            try {
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, "UTF-8"));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine + "\n");
                }
                String sb2 = sb.toString();
                if (open != null) {
                    open.close();
                }
                return sb2;
            } finally {
            }
        } catch (Throwable th) {
            StabilityHelper.logException((Class<?>) Utils.class, th);
            return "";
        }
    }

    public static boolean isJavaVersionSupported() {
        try {
            n7$$ExternalSyntheticBackport2.m(" ", new CharSequence[]{"java", POBConstants.TEST_MODE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int getCurrentYear() {
        return Calendar.getInstance().get(1);
    }

    public static String getCurrentOsVersion() {
        return Build.VERSION.RELEASE;
    }
}
