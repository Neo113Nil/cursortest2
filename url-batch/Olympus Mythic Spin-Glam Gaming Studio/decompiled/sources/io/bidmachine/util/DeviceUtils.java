package io.bidmachine.util;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import com.ironsource.X3;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.bidmachine.util.file.FileUtilsKt;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeviceUtils.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u0015\u001a\u00020\u0006H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\rH\u0007J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0007J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010 \u001a\u00020\u0006H\u0007J\b\u0010!\u001a\u00020\u0006H\u0007J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010#\u001a\u00020\u0006H\u0007J\u0012\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010%\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010&\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010'\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0017\u0010(\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010)J\u0017\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0012J\u0010\u0010+\u001a\u00020,2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010.\u001a\u00020/2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0017\u00100\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u00101J\u0017\u00102\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u00101J\u0017\u00103\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u00101J\u0010\u00104\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0017\u00105\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u00101J\u0010\u00106\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u00107\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0017\u00108\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u00101J\u0017\u00109\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u00101J\u0010\u0010:\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010;\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006<"}, d2 = {"Lio/bidmachine/util/DeviceUtils;", "", "()V", "MIN_TABLET_DP", "", POBConstants.KEY_HWV, "", "isDeviceRooted", "", "Ljava/lang/Boolean;", "getActiveNetworkCapabilities", "Landroid/net/NetworkCapabilities;", "context", "Landroid/content/Context;", "getActiveNetworkInfo", "Landroid/net/NetworkInfo;", "getBatteryLevel", "", "(Landroid/content/Context;)Ljava/lang/Double;", "getBluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "getBuildId", "getConfiguration", "Landroid/content/res/Configuration;", "getDeviceName", "getDeviceType", "Lio/bidmachine/util/DeviceType;", "getDisplayMetrics", "Landroid/util/DisplayMetrics;", "getHWV", "getKernelVersionThroughProcVersion", "getKernelVersionThroughUName", "getManufacturer", "getModel", "getOrientation", "getOsVersion", "getPhoneMCCMNC", "getPhoneNetworkOperatorName", "getPhoneSimCountryIso", "getPhoneSimOperatorName", "getScreenBrightness", "(Landroid/content/Context;)Ljava/lang/Integer;", "getScreenBrightnessRatio", "getScreenDensity", "", "getScreenOrientation", "getScreenSize", "Landroid/graphics/Point;", "isAirplaneModeOn", "(Landroid/content/Context;)Ljava/lang/Boolean;", "isBatterySaverEnabled", X3.j.k0, "isDarkModeEnabled", "isDoNotDisturbOn", "isLandscapeOrientation", "isNetworkAvailable", "isNetworkRoaming", "isRingMuted", "isTablet", "isTv", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class DeviceUtils {

    @NotNull
    public static final DeviceUtils INSTANCE = new DeviceUtils();
    private static final int MIN_TABLET_DP = 600;

    @Nullable
    private static String hwv;

    @Nullable
    private static Boolean isDeviceRooted;

    private DeviceUtils() {
    }

    @NotNull
    public static final String getOsVersion() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }

    @NotNull
    public static final String getBuildId() {
        String ID = Build.ID;
        Intrinsics.checkNotNullExpressionValue(ID, "ID");
        return ID;
    }

    @NotNull
    public static final String getModel() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    @NotNull
    public static final String getManufacturer() {
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        return MANUFACTURER;
    }

    @NotNull
    public static final DisplayMetrics getDisplayMetrics(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getDisplayMetrics(context);
    }

    @NotNull
    public static final Configuration getConfiguration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getConfiguration(context);
    }

    @RequiresPermission
    public static final boolean isNetworkAvailable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.isNetworkAvailable(context);
    }

    @Deprecated
    @RequiresPermission
    @Nullable
    public static final NetworkInfo getActiveNetworkInfo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getActiveNetworkInfo(context);
    }

    @RequiresPermission
    @RequiresApi
    @Nullable
    public static final NetworkCapabilities getActiveNetworkCapabilities(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getActiveNetworkCapabilities(context);
    }

    public static final int getOrientation(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getOrientation(context);
    }

    public static final boolean isLandscapeOrientation(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.isLandscapeOrientation(context);
    }

    public static final int getScreenOrientation(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getScreenOrientation(context);
    }

    public static final float getScreenDensity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getScreenDensity(context);
    }

    @NotNull
    public static final Point getScreenSize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getScreenSize(context);
    }

    @Nullable
    public static final Boolean isRingMuted(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.isRingMuted(context);
    }

    @Nullable
    public static final Boolean isCharging(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.isCharging(context);
    }

    @Nullable
    public static final Double getBatteryLevel(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getBatteryLevel(context);
    }

    @Nullable
    public static final Boolean isBatterySaverEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.isBatterySaverEnabled(context);
    }

    public static final boolean isDarkModeEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.isDarkModeEnabled(context);
    }

    @Nullable
    public static final Boolean isAirplaneModeOn(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.isAirplaneModeOn(context);
    }

    @Nullable
    public static final Boolean isDoNotDisturbOn(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.isDoNotDisturbOn(context);
    }

    @RequiresPermission
    @Nullable
    public static final String getDeviceName(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getDeviceName(context);
    }

    @RequiresPermission
    @Nullable
    public static final BluetoothAdapter getBluetoothAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getBluetoothAdapter(context);
    }

    @Nullable
    public static final Integer getScreenBrightness(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getScreenBrightness(context);
    }

    @Nullable
    public static final Double getScreenBrightnessRatio(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getScreenBrightnessRatio(context);
    }

    @Nullable
    public static final String getPhoneMCCMNC(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getPhoneMCCMNC(context);
    }

    @Nullable
    public static final String getPhoneNetworkOperatorName(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getPhoneNetworkOperatorName(context);
    }

    @Nullable
    public static final String getPhoneSimOperatorName(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getPhoneSimOperatorName(context);
    }

    @Nullable
    public static final String getPhoneSimCountryIso(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getPhoneSimCountryIso(context);
    }

    @Nullable
    public static final Boolean isNetworkRoaming(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.isNetworkRoaming(context);
    }

    public static final boolean isDeviceRooted() {
        Boolean bool = isDeviceRooted;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = true;
        try {
            String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
            for (int i = 0; i < 8; i++) {
                if (FileUtilsKt.existsSafely(new File(strArr[i]))) {
                    isDeviceRooted = Boolean.TRUE;
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() == null) {
                z = false;
            }
            isDeviceRooted = Boolean.valueOf(z);
            process.destroy();
            return z;
        } catch (Exception unused2) {
            if (process != null) {
                process.destroy();
            }
            isDeviceRooted = Boolean.FALSE;
            return false;
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    @Nullable
    public static final String getHWV() {
        String str = hwv;
        if (str != null) {
            return str;
        }
        DeviceUtils deviceUtils = INSTANCE;
        String kernelVersionThroughProcVersion = deviceUtils.getKernelVersionThroughProcVersion();
        if (kernelVersionThroughProcVersion == null || kernelVersionThroughProcVersion.length() <= 0) {
            kernelVersionThroughProcVersion = deviceUtils.getKernelVersionThroughUName();
        }
        hwv = kernelVersionThroughProcVersion;
        return kernelVersionThroughProcVersion;
    }

    public static final boolean isTablet(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getConfiguration(context).smallestScreenWidthDp >= 600;
    }

    public static final boolean isTv(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.isTv(context);
    }

    @NotNull
    public static final DeviceType getDeviceType(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DeviceUtilsKt.getDeviceType(context);
    }

    private final String getKernelVersionThroughProcVersion() {
        RandomAccessFile randomAccessFile;
        Throwable th;
        try {
            randomAccessFile = new RandomAccessFile("/proc/version", "r");
            try {
                String readLine = randomAccessFile.readLine();
                UtilsKt.closeSafely(randomAccessFile);
                return readLine;
            } catch (Exception unused) {
                UtilsKt.closeSafely(randomAccessFile);
                return null;
            } catch (Throwable th2) {
                th = th2;
                UtilsKt.closeSafely(randomAccessFile);
                throw th;
            }
        } catch (Exception unused2) {
            randomAccessFile = null;
        } catch (Throwable th3) {
            randomAccessFile = null;
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.BufferedReader, java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String getKernelVersionThroughUName() {
        InputStreamReader inputStreamReader;
        ?? r3;
        Throwable th;
        Process process;
        try {
            process = Runtime.getRuntime().exec("uname -a");
            try {
                inputStreamReader = new InputStreamReader(process.getInputStream());
                try {
                    r3 = new BufferedReader(inputStreamReader);
                } catch (Exception unused) {
                    r3 = 0;
                } catch (Throwable th2) {
                    r3 = 0;
                    th = th2;
                }
            } catch (Exception unused2) {
                inputStreamReader = null;
                r3 = inputStreamReader;
                UtilsKt.closeSafely(r3);
                UtilsKt.closeSafely(inputStreamReader);
                if (process != null) {
                    process.destroy();
                }
                return null;
            } catch (Throwable th3) {
                r3 = 0;
                th = th3;
                inputStreamReader = null;
            }
        } catch (Exception unused3) {
            process = null;
            inputStreamReader = null;
        } catch (Throwable th4) {
            inputStreamReader = null;
            r3 = 0;
            th = th4;
            process = null;
        }
        try {
            String readLine = r3.readLine();
            UtilsKt.closeSafely(r3);
            UtilsKt.closeSafely(inputStreamReader);
            process.destroy();
            return readLine;
        } catch (Exception unused4) {
            UtilsKt.closeSafely(r3);
            UtilsKt.closeSafely(inputStreamReader);
            if (process != null) {
            }
            return null;
        } catch (Throwable th5) {
            th = th5;
            UtilsKt.closeSafely(r3);
            UtilsKt.closeSafely(inputStreamReader);
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }
}
