package com.pubmatic.sdk.common.utility;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.log.POBLog;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes5.dex */
public class POBAdvertisingIdClient {
    private static volatile POBAdvertisingIdClient g;
    private final Context b;
    private Future c;
    private final SharedPreferences f;
    private volatile String d = null;
    private volatile Boolean e = null;
    private final ExecutorService a = Executors.newSingleThreadExecutor();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(POBAdvertisingIdClient.this.b);
                String id = advertisingIdInfo.getId();
                boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                if (id != null && !id.equals(POBAdvertisingIdClient.this.getAdvertisingId())) {
                    POBAdvertisingIdClient.this.saveAndroidAid(id);
                }
                if (isLimitAdTrackingEnabled != POBAdvertisingIdClient.this.getLMTState()) {
                    POBAdvertisingIdClient.this.saveLMTState(isLimitAdTrackingEnabled);
                }
            } catch (Exception e) {
                e = e;
                POBLog.error("POBAdvertisingIdClient", "Error while requesting AAID: ", e.getMessage());
            } catch (NoClassDefFoundError e2) {
                e = e2;
                POBLog.error("POBAdvertisingIdClient", "Error while requesting AAID: ", e.getMessage());
            }
        }
    }

    private POBAdvertisingIdClient(Context context) {
        this.b = context.getApplicationContext();
        this.f = context.getApplicationContext().getSharedPreferences(POBCommonConstants.POB_AID_STORAGE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.e = Boolean.valueOf(this.f.getBoolean(POBCommonConstants.POB_LIMITED_TRACKING_AD_KEY, false));
    }

    private void c() {
        try {
            this.c = this.a.submit(new a());
        } catch (OutOfMemoryError | RejectedExecutionException e) {
            POBLog.error("POBAdvertisingIdClient", "Unable to dispatch thread while requesting AAID: ", e.getMessage());
        }
    }

    public static POBAdvertisingIdClient getInstance(@NonNull Context context) {
        if (g == null) {
            synchronized (POBAdvertisingIdClient.class) {
                try {
                    if (g == null) {
                        g = new POBAdvertisingIdClient(context);
                    }
                } finally {
                }
            }
        }
        return g;
    }

    @Nullable
    public String getAdvertisingId() {
        if (this.d == null) {
            this.a.submit(new Runnable() { // from class: com.pubmatic.sdk.common.utility.POBAdvertisingIdClient$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    POBAdvertisingIdClient.this.a();
                }
            });
        }
        return this.d;
    }

    public boolean getLMTState() {
        if (this.e == null) {
            this.a.submit(new Runnable() { // from class: com.pubmatic.sdk.common.utility.POBAdvertisingIdClient$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    POBAdvertisingIdClient.this.b();
                }
            });
        }
        return Boolean.TRUE.equals(this.e);
    }

    protected boolean isReadyToRefresh() {
        Future future = this.c;
        if (future != null) {
            return future.isDone();
        }
        return true;
    }

    public boolean refreshAAID() {
        if (isReadyToRefresh()) {
            c();
            return true;
        }
        POBLog.debug("POBAdvertisingIdClient", "Skipping AAID update as last request is in progress", new Object[0]);
        return false;
    }

    protected void saveAndroidAid(@NonNull String str) {
        this.d = str;
        SharedPreferences.Editor edit = this.f.edit();
        if (edit != null) {
            edit.putString(POBCommonConstants.POB_AID_KEY, str);
            edit.apply();
        }
    }

    protected void saveLMTState(boolean z) {
        this.e = Boolean.valueOf(z);
        SharedPreferences.Editor edit = this.f.edit();
        if (edit != null) {
            edit.putBoolean(POBCommonConstants.POB_LIMITED_TRACKING_AD_KEY, z);
            edit.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.d = this.f.getString(POBCommonConstants.POB_AID_KEY, null);
    }
}
