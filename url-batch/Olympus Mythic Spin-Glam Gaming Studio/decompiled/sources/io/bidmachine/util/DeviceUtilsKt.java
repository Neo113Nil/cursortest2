package io.bidmachine.util;

import android.app.UiModeManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Point;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.X3;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeviceUtils.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0007\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\bH\u0007\u001a\u0011\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\b¢\u0006\u0002\u0010\r\u001a\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\bH\u0007\u001a\n\u0010\u0010\u001a\u00020\u0011*\u00020\b\u001a\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\bH\u0007\u001a\n\u0010\u0014\u001a\u00020\u0015*\u00020\b\u001a\n\u0010\u0016\u001a\u00020\u0002*\u00020\b\u001a\n\u0010\u0017\u001a\u00020\u0004*\u00020\b\u001a\f\u0010\u0018\u001a\u0004\u0018\u00010\u0013*\u00020\b\u001a\f\u0010\u0019\u001a\u0004\u0018\u00010\u0013*\u00020\b\u001a\f\u0010\u001a\u001a\u0004\u0018\u00010\u0013*\u00020\b\u001a\f\u0010\u001b\u001a\u0004\u0018\u00010\u0013*\u00020\b\u001a\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0004*\u00020\b¢\u0006\u0002\u0010\u001d\u001a\u0011\u0010\u001e\u001a\u0004\u0018\u00010\f*\u00020\b¢\u0006\u0002\u0010\r\u001a\n\u0010\u001f\u001a\u00020\u0001*\u00020\b\u001a\n\u0010 \u001a\u00020\u0004*\u00020\b\u001a\n\u0010!\u001a\u00020\"*\u00020\b\u001a\u0011\u0010#\u001a\u0004\u0018\u00010$*\u00020\b¢\u0006\u0002\u0010%\u001a\u0011\u0010&\u001a\u0004\u0018\u00010$*\u00020\b¢\u0006\u0002\u0010%\u001a\u0011\u0010'\u001a\u0004\u0018\u00010$*\u00020\b¢\u0006\u0002\u0010%\u001a\n\u0010(\u001a\u00020$*\u00020\b\u001a\u0011\u0010)\u001a\u0004\u0018\u00010$*\u00020\b¢\u0006\u0002\u0010%\u001a\n\u0010*\u001a\u00020$*\u00020\b\u001a\f\u0010+\u001a\u00020$*\u00020\bH\u0007\u001a\u0011\u0010,\u001a\u0004\u0018\u00010$*\u00020\b¢\u0006\u0002\u0010%\u001a\u0011\u0010-\u001a\u0004\u0018\u00010$*\u00020\b¢\u0006\u0002\u0010%\u001a\n\u0010.\u001a\u00020$*\u00020\b\u001a\n\u0010/\u001a\u00020$*\u00020\b¨\u00060"}, d2 = {"applyDimension", "", "Landroid/util/DisplayMetrics;", "unit", "", "value", "getActiveNetworkCapabilities", "Landroid/net/NetworkCapabilities;", "Landroid/content/Context;", "getActiveNetworkInfo", "Landroid/net/NetworkInfo;", "getBatteryLevel", "", "(Landroid/content/Context;)Ljava/lang/Double;", "getBluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "getConfiguration", "Landroid/content/res/Configuration;", "getDeviceName", "", "getDeviceType", "Lio/bidmachine/util/DeviceType;", "getDisplayMetrics", "getOrientation", "getPhoneMCCMNC", "getPhoneNetworkOperatorName", "getPhoneSimCountryIso", "getPhoneSimOperatorName", "getScreenBrightness", "(Landroid/content/Context;)Ljava/lang/Integer;", "getScreenBrightnessRatio", "getScreenDensity", "getScreenOrientation", "getScreenSize", "Landroid/graphics/Point;", "isAirplaneModeOn", "", "(Landroid/content/Context;)Ljava/lang/Boolean;", "isBatterySaverEnabled", X3.j.k0, "isDarkModeEnabled", "isDoNotDisturbOn", "isLandscapeOrientation", "isNetworkAvailable", "isNetworkRoaming", "isRingMuted", "isTablet", "isTv", "bidmachine-android-sdk_bd_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceUtilsKt {
    @NotNull
    public static final DisplayMetrics getDisplayMetrics(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        return displayMetrics;
    }

    @NotNull
    public static final Configuration getConfiguration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "resources.configuration");
        return configuration;
    }

    @RequiresPermission
    public static final boolean isNetworkAvailable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int i = Build.VERSION.SDK_INT;
        NetworkCapabilities activeNetworkCapabilities = getActiveNetworkCapabilities(context);
        boolean z = false;
        if (activeNetworkCapabilities == null) {
            return false;
        }
        boolean z2 = activeNetworkCapabilities.hasCapability(12) && activeNetworkCapabilities.hasCapability(16);
        if (i < 28) {
            return z2;
        }
        if (z2 && activeNetworkCapabilities.hasCapability(21) && activeNetworkCapabilities.hasCapability(19)) {
            z = true;
        }
        return z;
    }

    @Deprecated
    @RequiresPermission
    @Nullable
    public static final NetworkInfo getActiveNetworkInfo(@NotNull Context context) {
        ConnectivityManager connectivityManager;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (!UtilsKt.isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = UtilsKt.getConnectivityManager(context)) == null) {
            return null;
        }
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    @RequiresPermission
    @RequiresApi
    @Nullable
    public static final NetworkCapabilities getActiveNetworkCapabilities(@NotNull Context context) {
        ConnectivityManager connectivityManager;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (!UtilsKt.isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = UtilsKt.getConnectivityManager(context)) == null) {
            return null;
        }
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(activeNetwork, "it.activeNetwork ?: return null");
            return connectivityManager.getNetworkCapabilities(activeNetwork);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final int getOrientation(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return getConfiguration(context).orientation;
    }

    public static final boolean isLandscapeOrientation(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int screenOrientation = getScreenOrientation(context);
        return screenOrientation == 0 || screenOrientation == 8 || screenOrientation == 6 || screenOrientation == 11;
    }

    public static final int getScreenOrientation(@NotNull Context context) {
        Display defaultDisplay;
        Intrinsics.checkNotNullParameter(context, "<this>");
        WindowManager windowManager = UtilsKt.getWindowManager(context);
        Integer valueOf = (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? null : Integer.valueOf(defaultDisplay.getRotation());
        int orientation = getOrientation(context);
        if (orientation == 1) {
            if (valueOf != null && valueOf.intValue() == 2) {
                return 9;
            }
            if (valueOf != null && valueOf.intValue() == 3) {
                return 9;
            }
            if (valueOf != null) {
                valueOf.intValue();
            }
            return 1;
        }
        if (orientation != 2) {
            return 9;
        }
        if ((valueOf != null && valueOf.intValue() == 2) || (valueOf != null && valueOf.intValue() == 3)) {
            return 8;
        }
        if (valueOf == null) {
            return 0;
        }
        valueOf.intValue();
        return 0;
    }

    public static final float getScreenDensity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return getDisplayMetrics(context).density;
    }

    @NotNull
    public static final Point getScreenSize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = getDisplayMetrics(context);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Nullable
    public static final Boolean isRingMuted(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        AudioManager audioManager = UtilsKt.getAudioManager(context);
        if (audioManager == null) {
            return null;
        }
        int ringerMode = audioManager.getRingerMode();
        boolean z = true;
        if (ringerMode != 0 && ringerMode != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Nullable
    public static final Boolean isCharging(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Intent registerSystemReceiver = UtilsKt.registerSystemReceiver(context, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerSystemReceiver == null) {
                return null;
            }
            int intExtra = registerSystemReceiver.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1 && intExtra != 2 && intExtra != 4) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static final Double getBatteryLevel(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Intent registerSystemReceiver = UtilsKt.registerSystemReceiver(context, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerSystemReceiver == null) {
                return null;
            }
            int intExtra = registerSystemReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            int intExtra2 = registerSystemReceiver.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 <= 0) {
                return null;
            }
            return Double.valueOf(UtilsKt.toRatio$default(Integer.valueOf(intExtra), intExtra2, 0.0d, 2, (Object) null));
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static final Boolean isBatterySaverEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        PowerManager powerManager = UtilsKt.getPowerManager(context);
        if (powerManager != null) {
            return Boolean.valueOf(powerManager.isPowerSaveMode());
        }
        return null;
    }

    public static final boolean isDarkModeEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (getConfiguration(context).uiMode & 48) == 32;
    }

    @Nullable
    public static final Boolean isAirplaneModeOn(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            return Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on") != 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final Boolean isDoNotDisturbOn(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            return Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "zen_mode") != 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    @RequiresPermission
    @Nullable
    public static final String getDeviceName(@NotNull Context context) {
        String string;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            string = Settings.Global.getString(context.getContentResolver(), "device_name");
        } catch (Exception unused) {
        }
        if (string != null && string.length() > 0) {
            return string;
        }
        String string2 = Settings.Secure.getString(context.getContentResolver(), "bluetooth_name");
        if (string2 != null && string2.length() > 0) {
            return string2;
        }
        BluetoothAdapter bluetoothAdapter = getBluetoothAdapter(context);
        String name = bluetoothAdapter != null ? bluetoothAdapter.getName() : null;
        if (name != null) {
            if (name.length() > 0) {
                return name;
            }
        }
        return null;
    }

    @RequiresPermission
    @Nullable
    public static final BluetoothAdapter getBluetoothAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        BluetoothAdapter bluetoothAdapter = null;
        if (!UtilsKt.isPermissionGranted(context, "android.permission.BLUETOOTH_CONNECT")) {
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                BluetoothManager bluetoothManager = UtilsKt.getBluetoothManager(context);
                if (bluetoothManager != null) {
                    bluetoothAdapter = bluetoothManager.getAdapter();
                }
            } else {
                bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
            }
        } catch (Throwable unused) {
        }
        return bluetoothAdapter;
    }

    @Nullable
    public static final Integer getScreenBrightness(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            return Integer.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_brightness"));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final Double getScreenBrightnessRatio(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Integer screenBrightness = getScreenBrightness(context);
        if (screenBrightness != null) {
            return Double.valueOf(UtilsKt.toRatio$default((Number) screenBrightness, 255.0d, 0.0d, 2, (Object) null));
        }
        return null;
    }

    @Nullable
    public static final String getPhoneMCCMNC(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            TelephonyManager telephonyManager = UtilsKt.getTelephonyManager(context);
            String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
            if (networkOperator != null && networkOperator.length() >= 3) {
                StringBuilder sb = new StringBuilder();
                String substring = networkOperator.substring(0, 3);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append('-');
                String substring2 = networkOperator.substring(3);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                sb.append(substring2);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Nullable
    public static final String getPhoneNetworkOperatorName(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TelephonyManager telephonyManager = UtilsKt.getTelephonyManager(context);
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        return null;
    }

    @Nullable
    public static final String getPhoneSimOperatorName(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TelephonyManager telephonyManager = UtilsKt.getTelephonyManager(context);
        if (telephonyManager != null) {
            return telephonyManager.getSimOperatorName();
        }
        return null;
    }

    @Nullable
    public static final String getPhoneSimCountryIso(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TelephonyManager telephonyManager = UtilsKt.getTelephonyManager(context);
        if (telephonyManager != null) {
            return telephonyManager.getSimCountryIso();
        }
        return null;
    }

    @Nullable
    public static final Boolean isNetworkRoaming(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TelephonyManager telephonyManager = UtilsKt.getTelephonyManager(context);
        if (telephonyManager != null) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }

    public static final boolean isTablet(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return DeviceUtils.isTablet(context);
    }

    public static final boolean isTv(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        UiModeManager uiModeManager = UtilsKt.getUiModeManager(context);
        return (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) || context.getPackageManager().hasSystemFeature("android.software.leanback");
    }

    @NotNull
    public static final DeviceType getDeviceType(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return isTv(context) ? DeviceType.CTV : isTablet(context) ? DeviceType.TABLET : DeviceType.PHONE_DEVICE;
    }

    public static final float applyDimension(@NotNull DisplayMetrics displayMetrics, int i, float f) {
        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
        return TypedValue.applyDimension(i, f, displayMetrics);
    }
}
