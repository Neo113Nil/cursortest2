package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdj;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.measurement.internal.zzlx;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* loaded from: classes13.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zza;
    private final zzff zzb;
    private ExecutorService zzc;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public FirebaseAnalytics(zzff zzffVar) {
        Preconditions.checkNotNull(zzffVar);
        this.zzb = zzffVar;
    }

    @NonNull
    @RequiresPermission
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (zza == null) {
                        zza = new FirebaseAnalytics(zzff.zzg(context, null, null, null, null));
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    @Nullable
    @Keep
    public static zzlx getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        zzff zzg = zzff.zzg(context, null, null, null, bundle);
        if (zzg == null) {
            return null;
        }
        return new zzd(zzg);
    }

    private final ExecutorService zzb() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.zzc == null) {
                    this.zzc = new zza(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                executorService = this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    @NonNull
    public Task<String> getAppInstanceId() {
        try {
            return Tasks.call(zzb(), new zzb(this));
        } catch (RuntimeException e) {
            this.zzb.zzB(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(e);
        }
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(FirebaseInstallations.getInstance().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @NonNull
    public Task<Long> getSessionId() {
        try {
            return Tasks.call(zzb(), new zzc(this));
        } catch (RuntimeException e) {
            this.zzb.zzB(5, "Failed to schedule task for getSessionId", null, null, null);
            return Tasks.forException(e);
        }
    }

    public void logEvent(@NonNull @Size String str, @Nullable Bundle bundle) {
        this.zzb.zzy(str, bundle);
    }

    public void resetAnalyticsData() {
        this.zzb.zzD();
    }

    public void setAnalyticsCollectionEnabled(boolean z) {
        this.zzb.zzL(Boolean.valueOf(z));
    }

    public void setConsent(@NonNull Map<ConsentType, ConsentStatus> map) {
        Bundle bundle = new Bundle();
        ConsentStatus consentStatus = map.get(ConsentType.AD_STORAGE);
        if (consentStatus != null) {
            int ordinal = consentStatus.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        ConsentStatus consentStatus2 = map.get(ConsentType.ANALYTICS_STORAGE);
        if (consentStatus2 != null) {
            int ordinal2 = consentStatus2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        ConsentStatus consentStatus3 = map.get(ConsentType.AD_USER_DATA);
        if (consentStatus3 != null) {
            int ordinal3 = consentStatus3.ordinal();
            if (ordinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (ordinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        ConsentStatus consentStatus4 = map.get(ConsentType.AD_PERSONALIZATION);
        if (consentStatus4 != null) {
            int ordinal4 = consentStatus4.ordinal();
            if (ordinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (ordinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.zzb.zzG(bundle);
    }

    @Keep
    @MainThread
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, @Nullable @Size String str, @Nullable @Size String str2) {
        this.zzb.zzH(zzdj.zza(activity), str, str2);
    }

    public void setDefaultEventParameters(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.zzb.zzJ(bundle);
    }

    public void setSessionTimeoutDuration(long j) {
        this.zzb.zzM(j);
    }

    public void setUserId(@Nullable String str) {
        this.zzb.zzO(str);
    }

    public void setUserProperty(@NonNull @Size String str, @Nullable @Size String str2) {
        this.zzb.zzP(null, str, str2, false);
    }
}
