package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.unity3d.ads.core.data.datasource.AndroidGoogleAppIdDataSource;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.4.0 */
@DynamiteApi
/* loaded from: classes14.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcu {
    zzio zza = null;
    private final Map zzb = new ArrayMap();

    public static /* synthetic */ void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzdb zzdbVar) {
        try {
            zzdbVar.zze();
        } catch (RemoteException e) {
            ((zzio) Preconditions.checkNotNull(appMeasurementDynamiteService.zza)).zzaW().zzk().zzb("Failed to call IDynamiteUploadBatchesCallback", e);
        }
    }

    private final void zzb() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zzc(com.google.android.gms.internal.measurement.zzcy zzcyVar, String str) {
        zzb();
        this.zza.zzw().zzZ(zzcyVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void beginAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        zzb();
        this.zza.zzd().zzd(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        zzb();
        this.zza.zzq().zzJ(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzai(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void endAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        zzb();
        this.zza.zzd().zze(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void generateEventId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        long zzs = this.zza.zzw().zzs();
        zzb();
        this.zza.zzw().zzY(zzcyVar, zzs);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        this.zza.zzaX().zzq(new zzj(this, zzcyVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        zzc(zzcyVar, this.zza.zzq().zzr());
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        this.zza.zzaX().zzq(new zzn(this, zzcyVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        zzc(zzcyVar, this.zza.zzq().zzs());
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        zzc(zzcyVar, this.zza.zzq().zzt());
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        zzlw zzq = this.zza.zzq();
        zzio zzioVar = zzq.zzu;
        String str = null;
        if (zzioVar.zzf().zzx(null, zzgi.zzbp) || zzq.zzu.zzx() == null) {
            try {
                str = zzmg.zzc(zzioVar.zzaT(), AndroidGoogleAppIdDataSource.GOOGLE_APP_ID_RESOURCE_NAME, zzq.zzu.zzA());
            } catch (IllegalStateException e) {
                zzq.zzu.zzaW().zze().zzb("getGoogleAppId failed with exception", e);
            }
        } else {
            str = zzq.zzu.zzx();
        }
        zzc(zzcyVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        this.zza.zzq().zzi(str);
        zzb();
        this.zza.zzw().zzX(zzcyVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getSessionId(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        zzlw zzq = this.zza.zzq();
        zzq.zzu.zzaX().zzq(new zzlj(zzq, zzcyVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcy zzcyVar, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            this.zza.zzw().zzZ(zzcyVar, this.zza.zzq().zzu());
            return;
        }
        if (i == 1) {
            this.zza.zzw().zzY(zzcyVar, this.zza.zzq().zzq().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.zza.zzw().zzX(zzcyVar, this.zza.zzq().zzp().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.zza.zzw().zzT(zzcyVar, this.zza.zzq().zzl().booleanValue());
                return;
            }
        }
        zzqf zzw = this.zza.zzw();
        double doubleValue = this.zza.zzq().zzm().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", doubleValue);
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e) {
            zzw.zzu.zzaW().zzk().zzb("Error returning double value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void getUserProperties(String str, String str2, boolean z, com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        this.zza.zzaX().zzq(new zzl(this, zzcyVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void initForTests(@NonNull Map map) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdh zzdhVar, long j) throws RemoteException {
        zzio zzioVar = this.zza;
        if (zzioVar == null) {
            this.zza = zzio.zzp((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzdhVar, Long.valueOf(j));
        } else {
            zzioVar.zzaW().zzk().zza("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcy zzcyVar) throws RemoteException {
        zzb();
        this.zza.zzaX().zzq(new zzo(this, zzcyVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzP(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcy zzcyVar, long j) throws RemoteException {
        zzb();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.zza.zzaX().zzq(new zzk(this, zzcyVar, new zzbh(str2, new zzbf(bundle), "app", j), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void logHealthData(int i, @NonNull String str, @NonNull IObjectWrapper iObjectWrapper, @NonNull IObjectWrapper iObjectWrapper2, @NonNull IObjectWrapper iObjectWrapper3) throws RemoteException {
        zzb();
        this.zza.zzaW().zzu(i, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityCreated(@NonNull IObjectWrapper iObjectWrapper, @NonNull Bundle bundle, long j) throws RemoteException {
        zzb();
        onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, Bundle bundle, long j) {
        zzb();
        zzlv zzlvVar = this.zza.zzq().zza;
        if (zzlvVar != null) {
            this.zza.zzq().zzK();
            zzlvVar.zza(zzdjVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityDestroyed(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j) throws RemoteException {
        zzb();
        zzlv zzlvVar = this.zza.zzq().zza;
        if (zzlvVar != null) {
            this.zza.zzq().zzK();
            zzlvVar.zzb(zzdjVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityPaused(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j) throws RemoteException {
        zzb();
        zzlv zzlvVar = this.zza.zzq().zza;
        if (zzlvVar != null) {
            this.zza.zzq().zzK();
            zzlvVar.zzc(zzdjVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityResumed(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j) throws RemoteException {
        zzb();
        zzlv zzlvVar = this.zza.zzq().zza;
        if (zzlvVar != null) {
            this.zza.zzq().zzK();
            zzlvVar.zzd(zzdjVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcy zzcyVar, long j) throws RemoteException {
        zzb();
        onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), zzcyVar, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, com.google.android.gms.internal.measurement.zzcy zzcyVar, long j) throws RemoteException {
        zzb();
        zzlv zzlvVar = this.zza.zzq().zza;
        Bundle bundle = new Bundle();
        if (zzlvVar != null) {
            this.zza.zzq().zzK();
            zzlvVar.zze(zzdjVar, bundle);
        }
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e) {
            this.zza.zzaW().zzk().zzb("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStarted(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j) throws RemoteException {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzK();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStopped(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, long j) throws RemoteException {
        zzb();
        if (this.zza.zzq().zza != null) {
            this.zza.zzq().zzK();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcy zzcyVar, long j) throws RemoteException {
        zzb();
        zzcyVar.zze(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzde zzdeVar) throws RemoteException {
        zzkc zzkcVar;
        zzb();
        Map map = this.zzb;
        synchronized (map) {
            try {
                zzkcVar = (zzkc) map.get(Integer.valueOf(zzdeVar.zze()));
                if (zzkcVar == null) {
                    zzkcVar = new zzq(this, zzdeVar);
                    map.put(Integer.valueOf(zzdeVar.zze()), zzkcVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zza.zzq().zzV(zzkcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzX(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void retrieveAndUploadBatches(final com.google.android.gms.internal.measurement.zzdb zzdbVar) {
        zzb();
        if (this.zza.zzf().zzx(null, zzgi.zzaR)) {
            this.zza.zzq().zzY(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzi
                @Override // java.lang.Runnable
                public final void run() {
                    AppMeasurementDynamiteService.$r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService.this, zzdbVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) throws RemoteException {
        zzb();
        if (bundle == null) {
            this.zza.zzaW().zze().zza("Conditional user property must not be null");
        } else {
            this.zza.zzq().zzae(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setConsent(@NonNull final Bundle bundle, final long j) throws RemoteException {
        zzb();
        final zzlw zzq = this.zza.zzq();
        zzq.zzu.zzaX().zzr(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkm
            @Override // java.lang.Runnable
            public final void run() {
                zzlw zzlwVar = zzlw.this;
                if (!TextUtils.isEmpty(zzlwVar.zzu.zzh().zzo())) {
                    zzlwVar.zzu.zzaW().zzl().zza("Using developer consent only; google app id found");
                } else {
                    zzlwVar.zzaf(bundle, 0, j);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setConsentThirdParty(@NonNull Bundle bundle, long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzaf(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setCurrentScreen(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, long j) throws RemoteException {
        zzb();
        setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), str, str2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj zzdjVar, String str, String str2, long j) throws RemoteException {
        zzb();
        this.zza.zzt().zzx(zzdjVar, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        zzlw zzq = this.zza.zzq();
        zzq.zza();
        zzq.zzu.zzaX().zzq(new zzkv(zzq, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        zzb();
        final zzlw zzq = this.zza.zzq();
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzq.zzu.zzaX().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkk
            @Override // java.lang.Runnable
            public final void run() {
                zzlw.zzz(zzlw.this, bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzde zzdeVar) throws RemoteException {
        zzb();
        zzp zzpVar = new zzp(this, zzdeVar);
        if (this.zza.zzaX().zzu()) {
            this.zza.zzq().zzah(zzpVar);
        } else {
            this.zza.zzaX().zzq(new zzm(this, zzpVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdg zzdgVar) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzai(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        zzlw zzq = this.zza.zzq();
        zzq.zzu.zzaX().zzq(new zzkx(zzq, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        zzb();
        zzlw zzq = this.zza.zzq();
        Uri data = intent.getData();
        if (data == null) {
            zzq.zzu.zzaW().zzi().zza("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            zzio zzioVar = zzq.zzu;
            zzioVar.zzaW().zzi().zza("[sgtm] Preview Mode was not enabled.");
            zzioVar.zzf().zzv(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            zzio zzioVar2 = zzq.zzu;
            zzioVar2.zzaW().zzi().zzb("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            zzioVar2.zzf().zzv(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setUserId(@NonNull final String str, long j) throws RemoteException {
        zzb();
        final zzlw zzq = this.zza.zzq();
        if (str != null && TextUtils.isEmpty(str)) {
            zzq.zzu.zzaW().zzk().zza("User ID must be non-empty or null");
        } else {
            zzq.zzu.zzaX().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkg
                @Override // java.lang.Runnable
                public final void run() {
                    zzio zzioVar = zzlw.this.zzu;
                    if (zzioVar.zzh().zzr(str)) {
                        zzioVar.zzh().zzq();
                    }
                }
            });
            zzq.zzam(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        zzb();
        this.zza.zzq().zzam(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzde zzdeVar) throws RemoteException {
        zzkc zzkcVar;
        zzb();
        Map map = this.zzb;
        synchronized (map) {
            zzkcVar = (zzkc) map.remove(Integer.valueOf(zzdeVar.zze()));
        }
        if (zzkcVar == null) {
            zzkcVar = new zzq(this, zzdeVar);
        }
        this.zza.zzq().zzao(zzkcVar);
    }
}
