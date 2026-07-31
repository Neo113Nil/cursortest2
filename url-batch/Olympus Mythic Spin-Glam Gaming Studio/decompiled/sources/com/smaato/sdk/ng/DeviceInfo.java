package com.smaato.sdk.ng;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.ironsource.T3;
import com.smaato.sdk.ng.DeviceInfo;
import com.smaato.sdk.ng.models.request.UserAgent;
import com.smaato.sdk.ng.utils.BatteryUtils;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.NGSDKCrypto;
import com.smaato.sdk.ng.utils.NextGenAdvertisingId;
import com.smaato.sdk.ng.utils.ScreenDimensionsUtils;
import com.smaato.sdk.ng.utils.SoundUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes12.dex */
public class DeviceInfo {
    private static final String o = "DeviceInfo";
    private final Context a;
    private String c;
    private String d;
    private String e;
    private Listener j;
    private String k;
    private String l;
    private float m;
    private boolean f = false;
    private boolean g = false;
    private final Object h = new Object();
    private boolean i = false;
    private final BroadcastReceiver n = new a();
    private final UserAgentProvider b = new UserAgentProvider();

    public enum Connectivity {
        ETHERNET(T3.e),
        WIFI(T3.b),
        WWAN("wwan"),
        NONE("none");

        private final String a;

        Connectivity(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    public interface Listener {
        void onInfoLoaded();
    }

    public enum Orientation {
        PORTRAIT("portrait"),
        LANDSCAPE("landscape"),
        NONE("none");

        private final String a;

        Orientation(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    class a extends BroadcastReceiver {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Context context) {
            DeviceInfo deviceInfo;
            synchronized (DeviceInfo.this.h) {
                try {
                    try {
                        try {
                            context.unregisterReceiver(DeviceInfo.this.n);
                            deviceInfo = DeviceInfo.this;
                        } catch (Throwable th) {
                            DeviceInfo.this.i = false;
                            throw th;
                        }
                    } catch (IllegalArgumentException unused) {
                        deviceInfo = DeviceInfo.this;
                    }
                    deviceInfo.i = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("status", -1);
            DeviceInfo deviceInfo = DeviceInfo.this;
            deviceInfo.g = intExtra == 2 || intExtra == 5;
            synchronized (deviceInfo.h) {
                try {
                    DeviceInfo deviceInfo2 = DeviceInfo.this;
                    final Context context2 = deviceInfo2.a;
                    if (context2 != null && deviceInfo2.i) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.smaato.sdk.ng.DeviceInfo$a$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                DeviceInfo.a.this.a(context2);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public DeviceInfo(Context context) {
        this.a = context.getApplicationContext();
        getDeviceScreenDimensions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Boolean bool) {
        this.f = bool.booleanValue();
        if (TextUtils.isEmpty(str)) {
            c();
        } else {
            this.c = str;
            this.d = NGSDKCrypto.md5(str);
            this.e = NGSDKCrypto.sha1(this.c);
        }
        Listener listener = this.j;
        if (listener != null) {
            listener.onInfoLoaded();
        }
    }

    private void b() {
        try {
            new NextGenAdvertisingId(this.a).execute(new NextGenAdvertisingId.Listener() { // from class: com.smaato.sdk.ng.DeviceInfo$$ExternalSyntheticLambda0
                @Override // com.smaato.sdk.ng.utils.NextGenAdvertisingId.Listener
                public final void onNextGenAdvertisingIdFinish(String str, Boolean bool) {
                    DeviceInfo.this.a(str, bool);
                }
            });
        } catch (RejectedExecutionException e) {
            Logger.e(o, "fetchAdvertisingId", e);
            Listener listener = this.j;
            if (listener != null) {
                listener.onInfoLoaded();
            }
            NextGen.reportException((Exception) e);
        } catch (Exception e2) {
            Logger.e(o, "Error executing NextGenAdvertisingId Executor");
            Listener listener2 = this.j;
            if (listener2 != null) {
                listener2.onInfoLoaded();
            }
            NextGen.reportException(e2);
        }
    }

    private void c() {
        ContentResolver contentResolver;
        String string;
        try {
            Context context = this.a;
            if (context == null || (contentResolver = context.getContentResolver()) == null || Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) != 0 || (string = Settings.Secure.getString(contentResolver, "advertising_id")) == null || string.isEmpty()) {
                return;
            }
            this.c = string;
            this.d = NGSDKCrypto.md5(string);
            this.e = NGSDKCrypto.sha1(this.c);
        } catch (Settings.SettingNotFoundException unused) {
        }
    }

    private Long d() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
    }

    private TelephonyManager e() {
        Context context = this.a;
        if (context != null) {
            return (TelephonyManager) context.getSystemService("phone");
        }
        return null;
    }

    private Long f() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
    }

    private boolean g() {
        Context context = this.a;
        return (context == null || context.getContentResolver() == null || Settings.System.getInt(this.a.getContentResolver(), "airplane_mode_on", 0) == 0) ? false : true;
    }

    public void fetchUserAgent() {
        this.b.initialise(this.a);
    }

    @SuppressLint({"HardwareIds"})
    public String getAdvertisingId() {
        return this.c;
    }

    public String getAdvertisingIdMd5() {
        return this.d;
    }

    public String getAdvertisingIdSha1() {
        return this.e;
    }

    public Integer getBatteryLevel() {
        Context context = this.a;
        if (context == null) {
            return null;
        }
        int batteryPercentageSync = BatteryUtils.getBatteryPercentageSync(context);
        if (batteryPercentageSync >= 85) {
            return 8;
        }
        if (batteryPercentageSync >= 70) {
            return 7;
        }
        if (batteryPercentageSync >= 55) {
            return 6;
        }
        if (batteryPercentageSync >= 40) {
            return 5;
        }
        if (batteryPercentageSync >= 25) {
            return 4;
        }
        if (batteryPercentageSync >= 10) {
            return 3;
        }
        if (batteryPercentageSync >= 5) {
            return 2;
        }
        return batteryPercentageSync >= 0 ? 1 : null;
    }

    public String getCarrier() {
        TelephonyManager e = e();
        return e != null ? e.getNetworkOperatorName() : "";
    }

    @SuppressLint({"MissingPermission"})
    public Integer getConnectionType() {
        NetworkCapabilities networkCapabilities;
        if (a("android.permission.ACCESS_NETWORK_STATE")) {
            boolean a2 = a("android.permission.READ_PHONE_STATE");
            Context context = this.a;
            if (context != null && context.getSystemService("connectivity") != null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
                if (a2) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                        if (networkCapabilities.hasTransport(1)) {
                            return 2;
                        }
                        if (networkCapabilities.hasTransport(3)) {
                            return 1;
                        }
                        if (networkCapabilities.hasTransport(0)) {
                            TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
                            if (telephonyManager == null) {
                                return 3;
                            }
                            switch (telephonyManager.getDataNetworkType()) {
                                case 1:
                                case 2:
                                case 4:
                                case 7:
                                case 11:
                                case 16:
                                    return 4;
                                case 3:
                                case 5:
                                case 6:
                                case 8:
                                case 9:
                                case 10:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    return 5;
                                case 13:
                                case 18:
                                case 19:
                                    return 6;
                                case 20:
                                    return 7;
                                default:
                                    return 3;
                            }
                        }
                    }
                    return null;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            return type != 9 ? null : 1;
                        }
                        return 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 0:
                            return 3;
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
                            return 4;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            return 5;
                        case 13:
                        case 18:
                        case 19:
                            return 6;
                        case 20:
                            return 7;
                        default:
                            return null;
                    }
                }
            }
        }
        return null;
    }

    public Context getContext() {
        return this.a;
    }

    public String getDeviceHeight() {
        return this.k;
    }

    public void getDeviceScreenDimensions() {
        Point screenDimensionsToPoint = new ScreenDimensionsUtils().getScreenDimensionsToPoint(this.a);
        this.l = Integer.toString(screenDimensionsToPoint.x);
        this.k = Integer.toString(screenDimensionsToPoint.y);
        Context context = this.a;
        if (context != null) {
            this.m = context.getResources().getDisplayMetrics().density;
        }
    }

    public int getDeviceType() {
        Context context = this.a;
        if (context != null) {
            return context.getResources().getBoolean(R.bool.is_tablet) ? 5 : 4;
        }
        return 1;
    }

    public String getDeviceWidth() {
        return this.l;
    }

    public Integer getFreeMemoryMb() {
        return Integer.valueOf((int) ((d().longValue() / 1024) / 1024));
    }

    public List<String> getInputLanguages() {
        List<InputMethodInfo> enabledInputMethodList;
        List<InputMethodSubtype> enabledInputMethodSubtypeList;
        String mode;
        String locale;
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        if (context != null) {
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                if (inputMethodManager != null && (enabledInputMethodList = inputMethodManager.getEnabledInputMethodList()) != null && !enabledInputMethodList.isEmpty()) {
                    for (InputMethodInfo inputMethodInfo : enabledInputMethodList) {
                        if (inputMethodInfo != null && (enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) != null) {
                            for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                                if (inputMethodSubtype != null && (mode = inputMethodSubtype.getMode()) != null && mode.equals("keyboard") && (locale = inputMethodSubtype.getLocale()) != null && !locale.isEmpty()) {
                                    arrayList.add(locale);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Logger.e(o, "Error getting input languages", e);
            }
        }
        return arrayList;
    }

    public String getLangb() {
        Locale locale = getLocale();
        if (locale != null) {
            return locale.toLanguageTag();
        }
        return null;
    }

    public Locale getLocale() {
        Context context = this.a;
        if (context != null) {
            return context.getResources().getConfiguration().locale;
        }
        return null;
    }

    public String getMake() {
        return Build.MANUFACTURER;
    }

    public String getMccmnc() {
        TelephonyManager e = e();
        return e != null ? e.getNetworkOperator() : "";
    }

    public String getMccmncsim() {
        TelephonyManager e = e();
        return e != null ? e.getSimOperator() : "";
    }

    public String getModel() {
        return Build.MODEL;
    }

    public String getOSVersion() {
        return Build.VERSION.RELEASE;
    }

    public Orientation getOrientation() {
        Context context = this.a;
        if (context == null) {
            return Orientation.NONE;
        }
        int i = context.getResources().getConfiguration().orientation;
        return i != 1 ? i != 2 ? Orientation.NONE : Orientation.LANDSCAPE : Orientation.PORTRAIT;
    }

    public String getPpi() {
        Context context = this.a;
        return context != null ? String.valueOf((int) context.getResources().getDisplayMetrics().xdpi) : "";
    }

    public String getPxratio() {
        return String.valueOf(this.m);
    }

    public String getSoundSetting() {
        return SoundUtils.isSoundMuted(this.a) ? "0" : "1";
    }

    public UserAgent getStructuredUserAgent() {
        UserAgentProvider userAgentProvider = this.b;
        if (userAgentProvider != null) {
            return userAgentProvider.getStructuredUserAgent();
        }
        return null;
    }

    public Integer getTotalMemoryMb() {
        return Integer.valueOf((int) ((f().longValue() / 1024) / 1024));
    }

    public String getUserAgent() {
        UserAgentProvider userAgentProvider = this.b;
        return userAgentProvider != null ? userAgentProvider.getUserAgent() : "";
    }

    public boolean hasTrackingPermissions() {
        return a("android.permission.ACCESS_COARSE_LOCATION") || a("android.permission.ACCESS_FINE_LOCATION");
    }

    public void initialize(Listener listener) {
        this.j = listener;
        fetchUserAgent();
        b();
        updateChargingStatus();
    }

    public Integer isAirplaneModeEnabled() {
        return a();
    }

    public Integer isBatteryCharging() {
        updateChargingStatus();
        return Integer.valueOf(this.g ? 1 : 0);
    }

    public Integer isDarkMode() {
        Context context = this.a;
        if (context == null || context.getResources() == null || this.a.getResources().getConfiguration() == null) {
            return null;
        }
        int i = this.a.getResources().getConfiguration().uiMode & 48;
        if (i != 16) {
            return i != 32 ? null : 1;
        }
        return 0;
    }

    public Integer isDndEnabled() {
        try {
            Context context = this.a;
            if (context != null && context.getContentResolver() != null) {
                int i = Settings.Global.getInt(this.a.getContentResolver(), "zen_mode");
                if (i == 0) {
                    Logger.d(o, "DnD : OFF");
                    return 0;
                }
                if (i == 1) {
                    Logger.d(o, "DnD : ON - Priority Only");
                    return 1;
                }
                if (i == 2) {
                    Logger.d(o, "DnD : ON - Total Silence");
                    return 1;
                }
                if (i != 3) {
                    return null;
                }
                Logger.d(o, "DnD : ON - Alarms Only");
                return 1;
            }
            return null;
        } catch (Settings.SettingNotFoundException unused) {
            return null;
        }
    }

    public Integer isHeadsetOn() {
        AudioManager audioManager;
        AudioDeviceInfo[] devices;
        if (!a("android.permission.READ_PHONE_STATE") || (audioManager = (AudioManager) this.a.getSystemService("audio")) == null || (devices = audioManager.getDevices(2)) == null) {
            return null;
        }
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            int type = audioDeviceInfo.getType();
            if (type == 3 || type == 4) {
                return 1;
            }
        }
        return 0;
    }

    public boolean limitTracking() {
        return this.f;
    }

    public void updateChargingStatus() {
        synchronized (this.h) {
            if (!this.i && this.a != null) {
                try {
                    this.a.registerReceiver(this.n, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    this.i = true;
                } catch (IllegalArgumentException | SecurityException e) {
                    Logger.e(o, "Failed to register battery receiver", e);
                }
            }
        }
    }

    public Integer isPowerSaveMode() {
        PowerManager powerManager = (PowerManager) this.a.getSystemService("power");
        if (powerManager != null) {
            return powerManager.isPowerSaveMode() ? 1 : 0;
        }
        return null;
    }

    private boolean a(String str) {
        Context context = this.a;
        return context != null && context.checkCallingOrSelfPermission(str) == 0;
    }

    private Integer a() {
        if (g()) {
            return 1;
        }
        return 0;
    }
}
