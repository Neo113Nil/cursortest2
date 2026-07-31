package com.pubmatic.sdk.common.models;

import android.content.Context;
import android.location.Address;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.service.POBDeviceIpUpdaterService;
import com.pubmatic.sdk.common.utility.POBAdvertisingIdClient;
import com.pubmatic.sdk.common.utility.POBLocationDetector;
import com.pubmatic.sdk.common.utility.POBUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public class POBDeviceInfo {
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private final Context m;
    private float n;
    private String o;
    POBAdvertisingIdClient q;
    private String r;
    private String s;
    public int screenHeight;
    public int screenWidth;
    private final String a = "POBDeviceInfo";
    private final AtomicReference p = new AtomicReference();

    public enum DEVICE_ID_TYPE {
        ANDROID_ID("3"),
        ADVERTISING_ID("9");

        private final String a;

        DEVICE_ID_TYPE(String str) {
            this.a = str;
        }

        public String getValue() {
            return this.a;
        }
    }

    public POBDeviceInfo(@NonNull Context context) {
        this.d = null;
        this.k = null;
        this.m = context;
        this.q = POBAdvertisingIdClient.getInstance(context);
        refreshAdvertisingIdInfo();
        this.c = a(context);
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                if (telephonyManager.getPhoneType() != 2) {
                    String networkOperator = telephonyManager.getNetworkOperator();
                    if (!TextUtils.isEmpty(networkOperator)) {
                        this.o = "" + Integer.parseInt(networkOperator.substring(0, 3)) + "-" + Integer.parseInt(networkOperator.substring(3));
                    }
                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                    this.r = networkCountryIso != null ? networkCountryIso.toUpperCase(Locale.ENGLISH) : null;
                }
                a();
                this.d = telephonyManager.getNetworkOperatorName();
            } catch (Exception e) {
                POBLog.warn("POBDeviceInfo", "Unable to fetch carrier name from TelephonyManager or ISO3 or ISO2 country code. Error: %s", e.getMessage());
            }
        }
        this.e = Locale.getDefault().getLanguage();
        this.f = Build.MANUFACTURER;
        this.g = Build.MODEL;
        this.h = Build.DEVICE;
        this.i = "Android";
        this.j = Build.VERSION.RELEASE;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                this.screenWidth = displayMetrics.widthPixels;
                this.screenHeight = displayMetrics.heightPixels;
                this.k = this.screenWidth + VastAttributes.HORIZONTAL_POSITION + this.screenHeight;
            }
        } catch (Exception e2) {
            POBLog.warn("POBDeviceInfo", "Unable to fetch screen resolution. Error: %s", e2.getMessage());
        }
        this.l = new SimpleDateFormat("ZZZZZ", Locale.getDefault()).format(Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.getDefault()).getTime());
        this.n = this.m.getResources().getDisplayMetrics().density;
        this.b = POBUtils.getTimeOffsetInMinutes();
    }

    private String a(Context context) {
        String str;
        try {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e) {
            POBLog.warn("POBDeviceInfo", "Unable to fetch Device ID. Error: %s", e.getMessage());
            str = null;
        }
        return str == null ? "" : str;
    }

    @Nullable
    public String getAcceptLanguage() {
        return this.e;
    }

    @Nullable
    public String getAdvertisingID() {
        return this.q.getAdvertisingId();
    }

    @Nullable
    public String getAndroidId() {
        return this.c;
    }

    public DEVICE_ID_TYPE getAndroidIdType(boolean z) {
        return z ? DEVICE_ID_TYPE.ADVERTISING_ID : DEVICE_ID_TYPE.ANDROID_ID;
    }

    @Nullable
    public String getCarrierName() {
        return this.d;
    }

    public String getCurrentTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(Calendar.getInstance().getTime());
    }

    @Nullable
    public String getCurrentTimeZone() {
        return this.l;
    }

    @Nullable
    public String getDeviceIp() {
        return (String) this.p.get();
    }

    @Nullable
    public String getHardwareVersion() {
        return this.h;
    }

    @Nullable
    public String getISOAlpha2CountryCode() {
        return this.r;
    }

    @Nullable
    public String getISOAlpha3CountryCode() {
        return this.s;
    }

    @Nullable
    public Boolean getLmtEnabled() {
        return Boolean.valueOf(this.q.getLMTState());
    }

    @Nullable
    public String getMake() {
        return this.f;
    }

    @Nullable
    public String getMccmnc() {
        return this.o;
    }

    @Nullable
    public String getModel() {
        return this.g;
    }

    public int getOrientation() {
        return this.m.getResources().getConfiguration().orientation;
    }

    @Nullable
    public String getOsName() {
        return this.i;
    }

    @Nullable
    public String getOsVersion() {
        return this.j;
    }

    public float getPxratio() {
        return this.n;
    }

    public int getScreenHeight() {
        return this.screenHeight;
    }

    @Nullable
    public String getScreenResolution() {
        return this.k;
    }

    public int getScreenWidth() {
        return this.screenWidth;
    }

    public int getTimeZoneOffsetInMinutes() {
        return this.b;
    }

    @WorkerThread
    public String getUserAgent() {
        return POBInstanceProvider.getCacheManager(this.m).fetchUserAgent();
    }

    public void refreshAdvertisingIdInfo() {
        this.q.refreshAAID();
    }

    public void registerIpUpdateService(@NonNull POBDeviceIpUpdaterService pOBDeviceIpUpdaterService) {
        final AtomicReference atomicReference = this.p;
        Objects.requireNonNull(atomicReference);
        pOBDeviceIpUpdaterService.registerListener(new POBDeviceIpUpdaterService.POBIpUpdateListener() { // from class: com.pubmatic.sdk.common.models.POBDeviceInfo$$ExternalSyntheticLambda0
            @Override // com.pubmatic.sdk.common.service.POBDeviceIpUpdaterService.POBIpUpdateListener
            public final void onIpAddressFetched(String str) {
                atomicReference.set(str);
            }
        });
    }

    private void a() {
        Address address;
        String str = this.r;
        if (str != null) {
            this.s = a(str);
        }
        if (!TextUtils.isEmpty(this.s) || (address = new POBLocationDetector(this.m).getAddress()) == null) {
            return;
        }
        String countryCode = address.getCountryCode();
        if (TextUtils.isEmpty(countryCode)) {
            return;
        }
        this.s = a(countryCode);
    }

    private String a(String str) {
        try {
            return new Locale(Locale.ENGLISH.getLanguage(), str).getISO3Country();
        } catch (MissingResourceException unused) {
            POBLog.warn("POBDeviceInfo", "Unable to get ISO 3 country code from ISO2 for input value as %s", str);
            return null;
        }
    }
}
