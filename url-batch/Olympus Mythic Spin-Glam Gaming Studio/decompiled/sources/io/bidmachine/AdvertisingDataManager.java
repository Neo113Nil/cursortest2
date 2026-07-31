package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import com.mobilefuse.sdk.MobileFuseDefaults;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.core.Logger;
import io.bidmachine.util.SharedPreferenceUtilsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
abstract class AdvertisingDataManager {
    private static final String a = UUID.randomUUID().toString();
    private static final List b;
    private static b c;
    private static AdvertisingData d;
    private static String e;

    public static class AdvertisingData {

        @Nullable
        private final String id;
        private final boolean limitAdTrackingEnabled;

        public AdvertisingData(@Nullable String str, boolean z) {
            this.id = str;
            this.limitAdTrackingEnabled = z;
        }

        @Nullable
        public String getId() {
            return this.id;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }
    }

    private static abstract class b {
        private final AtomicBoolean a = new AtomicBoolean(true);

        protected abstract AdvertisingData a(Context context);

        protected void a(boolean z) {
            this.a.set(z);
        }

        public AdvertisingData b(Context context) {
            if (!a()) {
                return null;
            }
            try {
                return a(context);
            } catch (NoClassDefFoundError e) {
                a(false);
                Logger.w(e);
                return null;
            } catch (Throwable th) {
                Logger.w(th);
                return null;
            }
        }

        private boolean a() {
            return this.a.get();
        }
    }

    private static class c extends b {
        private c() {
        }

        @Override // io.bidmachine.AdvertisingDataManager.b
        protected AdvertisingData a(Context context) {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                if (advertisingIdInfo != null) {
                    return new AdvertisingData(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
                }
                return null;
            } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException unused) {
                a(false);
                return null;
            }
        }
    }

    private static class d extends b {
        private d() {
        }

        @Override // io.bidmachine.AdvertisingDataManager.b
        protected AdvertisingData a(Context context) {
            AdvertisingIdClient.Info advertisingIdInfo = com.huawei.hms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                return new AdvertisingData(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
            }
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        b = arrayList;
        arrayList.add(new c());
        arrayList.add(new d());
    }

    static boolean a() {
        AdvertisingData advertisingData = d;
        return advertisingData != null && advertisingData.isLimitAdTrackingEnabled();
    }

    private static String b(Context context) {
        if (!TextUtils.isEmpty(e)) {
            return e;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("ad_core_preferences", 0);
        String optStringOrNull = SharedPreferenceUtilsKt.optStringOrNull(sharedPreferences, CommonUrlParts.UUID, null);
        e = optStringOrNull;
        if (!TextUtils.isEmpty(optStringOrNull)) {
            return e;
        }
        e = a;
        sharedPreferences.edit().putString(CommonUrlParts.UUID, e).apply();
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Context context) {
        b bVar = c;
        if (bVar != null) {
            AdvertisingData b2 = bVar.b(context);
            if (b2 != null) {
                d = b2;
                return;
            }
            return;
        }
        for (b bVar2 : b) {
            AdvertisingData b3 = bVar2.b(context);
            if (b3 != null) {
                c = bVar2;
                d = b3;
                return;
            }
        }
    }

    static String a(Context context) {
        AdvertisingData advertisingData = d;
        String id = advertisingData != null ? advertisingData.getId() : null;
        return (TextUtils.isEmpty(id) || MobileFuseDefaults.ADVERTISING_ID_ZEROS.equals(id)) ? b(context) : id;
    }
}
