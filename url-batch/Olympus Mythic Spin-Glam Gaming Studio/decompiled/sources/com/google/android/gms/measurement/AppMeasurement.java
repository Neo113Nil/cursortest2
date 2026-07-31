package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.android.gms.measurement.internal.zzio;
import com.google.android.gms.measurement.internal.zzjt;
import com.google.android.gms.measurement.internal.zzkb;
import com.google.android.gms.measurement.internal.zzkc;
import com.google.android.gms.measurement.internal.zzlx;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: classes10.dex */
public class AppMeasurement {
    private static volatile AppMeasurement zza;
    private final zzc zzb;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
    @ShowFirstParty
    @KeepForSdk
    public static class ConditionalUserProperty {

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public boolean mActive;

        @NonNull
        @Keep
        @ShowFirstParty
        @KeepForSdk
        public String mAppId;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mCreationTimestamp;

        @NonNull
        @Keep
        public String mExpiredEventName;

        @NonNull
        @Keep
        public Bundle mExpiredEventParams;

        @NonNull
        @Keep
        @ShowFirstParty
        @KeepForSdk
        public String mName;

        @NonNull
        @Keep
        @ShowFirstParty
        @KeepForSdk
        public String mOrigin;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTimeToLive;

        @NonNull
        @Keep
        public String mTimedOutEventName;

        @NonNull
        @Keep
        public Bundle mTimedOutEventParams;

        @NonNull
        @Keep
        @ShowFirstParty
        @KeepForSdk
        public String mTriggerEventName;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggerTimeout;

        @NonNull
        @Keep
        public String mTriggeredEventName;

        @NonNull
        @Keep
        public Bundle mTriggeredEventParams;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggeredTimestamp;

        @NonNull
        @Keep
        @ShowFirstParty
        @KeepForSdk
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            Preconditions.checkNotNull(bundle);
            this.mAppId = (String) zzjt.zza(bundle, "app_id", String.class, null);
            this.mOrigin = (String) zzjt.zza(bundle, "origin", String.class, null);
            this.mName = (String) zzjt.zza(bundle, "name", String.class, null);
            this.mValue = zzjt.zza(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) zzjt.zza(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) zzjt.zza(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) zzjt.zza(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) zzjt.zza(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) zzjt.zza(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) zzjt.zza(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) zzjt.zza(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) zzjt.zza(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) zzjt.zza(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) zzjt.zza(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) zzjt.zza(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) zzjt.zza(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
    @ShowFirstParty
    @KeepForSdk
    public interface EventInterceptor extends zzkb {
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
    @ShowFirstParty
    @KeepForSdk
    public interface OnEventListener extends zzkc {
    }

    public AppMeasurement(zzio zzioVar) {
        this.zzb = new zza(zzioVar);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @NonNull
    @Keep
    @Deprecated
    @RequiresPermission
    @ShowFirstParty
    @KeepForSdk
    public static AppMeasurement getInstance(@NonNull Context context) {
        if (zza == null) {
            synchronized (AppMeasurement.class) {
                if (zza == null) {
                    zzlx zzlxVar = (zzlx) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (zzlxVar != null) {
                        zza = new AppMeasurement(zzlxVar);
                    } else {
                        zza = new AppMeasurement(zzio.zzp(context, new zzdh(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return zza;
    }

    @Keep
    public void beginAdUnitExposure(@NonNull @Size String str) {
        this.zzb.zzp(str);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void clearConditionalUserProperty(@NonNull @Size String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.zzb.zzq(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@NonNull @Size String str) {
        this.zzb.zzr(str);
    }

    @Keep
    public long generateEventId() {
        return this.zzb.zzb();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.zzb.zzh();
    }

    @NonNull
    @Keep
    @ShowFirstParty
    @KeepForSdk
    @WorkerThread
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull @Size String str2) {
        List zzm = this.zzb.zzm(str, str2);
        ArrayList arrayList = new ArrayList(zzm == null ? 0 : zzm.size());
        Iterator it = zzm.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.zzb.zzi();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.zzb.zzj();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.zzb.zzk();
    }

    @Keep
    @ShowFirstParty
    @KeepForSdk
    @WorkerThread
    public int getMaxUserProperties(@NonNull @Size String str) {
        return this.zzb.zza(str);
    }

    @NonNull
    @Keep
    @VisibleForTesting
    @WorkerThread
    protected Map<String, Object> getUserProperties(@NonNull String str, @NonNull @Size String str2, boolean z) {
        return this.zzb.zzo(str, str2, z);
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.zzb.zzs(str, str2, bundle);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            zzjt.zzb(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        zzc zzcVar = this.zzb;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        zzcVar.zzv(bundle);
    }

    public AppMeasurement(zzlx zzlxVar) {
        this.zzb = new zzb(zzlxVar);
    }
}
