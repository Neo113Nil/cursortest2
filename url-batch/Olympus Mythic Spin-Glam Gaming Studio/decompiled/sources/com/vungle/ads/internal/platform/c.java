package com.vungle.ads.internal.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import androidx.core.util.Consumer;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.network.w;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class c implements f {
    public final Context a;
    public final j b;
    public final PowerManager c;
    public final AudioManager d;
    public Long e;
    public String f;
    public Integer g;
    public i0 h;
    public String i;

    public c(Context context, j uaExecutor, PowerManager powerManager, AudioManager audioManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uaExecutor, "uaExecutor");
        Intrinsics.checkNotNullParameter(powerManager, "powerManager");
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        this.a = context;
        this.b = uaExecutor;
        this.c = powerManager;
        this.d = audioManager;
        q();
    }

    public final void a(final w consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.b.execute(new Runnable() { // from class: com.vungle.ads.internal.platform.c$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                c.a(c.this, consumer);
            }
        });
    }

    public final String b() {
        return this.f;
    }

    public final Integer c() {
        return this.g;
    }

    public final long d() {
        return Build.TIME;
    }

    public final String e() {
        String a = a.a(this.a);
        Intrinsics.checkNotNullExpressionValue(a, "getCarrierName(context)");
        return a;
    }

    public final String f() {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        String str = this.i;
        if (str != null) {
            return str;
        }
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.a.getPackageManager();
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo("com.android.vending", of);
            } else {
                packageInfo = this.a.getPackageManager().getPackageInfo("com.android.vending", 0);
            }
            String str2 = packageInfo.versionName;
            this.i = str2;
            return str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final long g() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public final long h() {
        Object m8023constructorimpl;
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.a.getPackageManager();
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo("android", of);
            } else {
                packageInfo = this.a.getPackageManager().getPackageInfo("android", 0);
            }
            m8023constructorimpl = Result.m8023constructorimpl(Long.valueOf(packageInfo.firstInstallTime));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            if (m8026exceptionOrNullimpl instanceof PackageManager.NameNotFoundException) {
                boolean z = u.a;
                StringBuilder a = l.a("Error getting OS installation time: ");
                a.append(((PackageManager.NameNotFoundException) m8026exceptionOrNullimpl).getLocalizedMessage());
                t.b("AndroidPlatform", a.toString());
            }
            m8023constructorimpl = -1L;
        }
        return ((Number) m8023constructorimpl).longValue();
    }

    public final long i() {
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new b(this.a));
        Long l = this.e;
        if (l != null) {
            return l.longValue();
        }
        long a = ((FilePreferences) lazy.getValue()).a("sit", 0L);
        if (a == 0) {
            a = System.currentTimeMillis();
            ((FilePreferences) lazy.getValue()).b("sit", a).b();
        }
        this.e = Long.valueOf(a);
        return a;
    }

    public final String j() {
        return System.getProperty("http.agent");
    }

    public final float k() {
        try {
            float streamVolume = this.d.getStreamVolume(3) / this.d.getStreamMaxVolume(3);
            if (Float.isNaN(streamVolume)) {
                return 0.0f;
            }
            if (Float.isInfinite(streamVolume) || streamVolume < 0.0f) {
                return 0.0f;
            }
            if (streamVolume > 1.0f) {
                return 1.0f;
            }
            return streamVolume;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public final boolean l() {
        return this.c.isPowerSaveMode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (kotlin.text.StringsKt.contains((java.lang.CharSequence) r1, (java.lang.CharSequence) com.adjust.sdk.Constants.REFERRER_API_SAMSUNG, true) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m() {
        String str;
        boolean z;
        String SOC_MANUFACTURER;
        String str2 = Build.HARDWARE;
        if (str2 != null) {
            str = str2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str = "";
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "exynos", false, 2, (Object) null)) {
            if (Build.VERSION.SDK_INT >= 31) {
                SOC_MANUFACTURER = Build.SOC_MANUFACTURER;
                Intrinsics.checkNotNullExpressionValue(SOC_MANUFACTURER, "SOC_MANUFACTURER");
            }
            z = true;
            boolean z2 = !StringsKt.contains$default((CharSequence) str, (CharSequence) "mali", false, 2, (Object) null) || z;
            int i = Build.VERSION.SDK_INT;
            return z2 && (29 > i && i < 34);
        }
        z = false;
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "mali", false, 2, (Object) null)) {
        }
        int i2 = Build.VERSION.SDK_INT;
        if (z2) {
            return false;
        }
    }

    public final boolean n() {
        try {
            return Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted");
        } catch (Exception e) {
            boolean z = u.a;
            t.a("AndroidPlatform", "Acquiring external storage state failed", e);
            return false;
        }
    }

    public final boolean o() {
        if (this.d.getRingerMode() != 0) {
            return this.d.getRingerMode() == 1;
        }
        return true;
    }

    public final boolean p() {
        return this.d.getStreamVolume(3) > 0;
    }

    public final void q() {
        String str = this.f;
        if (str == null || str.length() == 0) {
            try {
                AppSetIdClient client = AppSet.getClient(this.a);
                Intrinsics.checkNotNullExpressionValue(client, "getClient(context)");
                Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
                Intrinsics.checkNotNullExpressionValue(appSetIdInfo, "client.appSetIdInfo");
                appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.vungle.ads.internal.platform.c$$ExternalSyntheticLambda2
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        c.a(c.this, (AppSetIdInfo) obj);
                    }
                });
            } catch (Exception e) {
                boolean z = u.a;
                StringBuilder a = l.a("Error getting AppSetID: ");
                a.append(e.getLocalizedMessage());
                t.b("AndroidPlatform", a.toString());
            } catch (NoClassDefFoundError e2) {
                boolean z2 = u.a;
                StringBuilder a2 = l.a("Required libs to get AppSetID Not available: ");
                a2.append(e2.getLocalizedMessage());
                t.b("AndroidPlatform", a2.toString());
            }
        }
    }

    public static final void a(c this$0, Consumer consumer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(consumer, "$consumer");
        g.a(this$0.a, consumer);
    }

    public final i0 a() {
        i0 i0Var;
        String a;
        i0 i0Var2 = this.h;
        if (i0Var2 != null && (a = i0Var2.a()) != null && a.length() != 0) {
            return i0Var2;
        }
        boolean z = true;
        if (StringsKt.equals(Build.MANUFACTURER, "Amazon", true)) {
            i0Var = new i0();
            try {
                ContentResolver contentResolver = this.a.getContentResolver();
                if (Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) != 1) {
                    z = false;
                }
                i0Var.b = z;
                i0Var.a = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Settings.SettingNotFoundException e) {
                boolean z2 = u.a;
                t.a("AndroidPlatform", "Error getting Amazon advertising info: Setting not found.", e);
            } catch (Exception e2) {
                boolean z3 = u.a;
                t.a("AndroidPlatform", "Error getting Amazon advertising info", e2);
            }
        } else {
            i0 i0Var3 = new i0();
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a);
                Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(context)");
                i0Var3.a(advertisingIdInfo.getId());
                i0Var3.a(advertisingIdInfo.isLimitAdTrackingEnabled());
            } catch (GooglePlayServicesNotAvailableException e3) {
                boolean z4 = u.a;
                StringBuilder a2 = l.a("Play services Not available: ");
                a2.append(e3.getLocalizedMessage());
                t.b("AndroidPlatform", a2.toString());
            } catch (Exception e4) {
                boolean z5 = u.a;
                StringBuilder a3 = l.a("Error getting Google advertising info: ");
                a3.append(e4.getLocalizedMessage());
                t.b("AndroidPlatform", a3.toString());
            } catch (NoClassDefFoundError e5) {
                boolean z6 = u.a;
                StringBuilder a4 = l.a("Play services Not available: ");
                a4.append(e5.getLocalizedMessage());
                t.b("AndroidPlatform", a4.toString());
                i0Var3.a(Settings.Secure.getString(this.a.getContentResolver(), "advertising_id"));
            }
            i0Var = i0Var3;
        }
        this.h = i0Var;
        return i0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ c(Context context, j jVar) {
        this(context, jVar, (PowerManager) r0, (AudioManager) r1);
        Object systemService = context.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        Object systemService2 = context.getSystemService("audio");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
    }

    public static final void a(c this$0, AppSetIdInfo appSetIdInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (appSetIdInfo != null) {
            this$0.f = appSetIdInfo.getId();
            this$0.g = Integer.valueOf(appSetIdInfo.getScope());
        }
    }
}
