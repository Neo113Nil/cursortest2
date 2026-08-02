package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbrq;
import com.google.android.gms.internal.ads.zzbry;
import com.google.android.gms.internal.ads.zzbrz;
import com.google.android.gms.internal.ads.zzbvd;
import com.google.android.gms.internal.ads.zzbvh;
import com.google.android.gms.internal.ads.zzcge;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzftm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes.dex */
public final class zzed {
    private static zzed zza;
    private zzcm zzg;
    private final Object zzb = new Object();
    private boolean zzd = false;
    private boolean zze = false;
    private final Object zzf = new Object();

    @Nullable
    private OnAdInspectorClosedListener zzh = null;
    private RequestConfiguration zzi = new RequestConfiguration.Builder().build();
    private final ArrayList zzc = new ArrayList();

    private zzed() {
    }

    public static zzed zzf() {
        zzed zzedVar;
        synchronized (zzed.class) {
            if (zza == null) {
                zza = new zzed();
            }
            zzedVar = zza;
        }
        return zzedVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzw(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbrq zzbrqVar = (zzbrq) it.next();
            hashMap.put(zzbrqVar.zza, new zzbry(zzbrqVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbrqVar.zzd, zzbrqVar.zzc));
        }
        return new zzbrz(hashMap);
    }

    private final void zzx(Context context, @Nullable String str, @Nullable OnInitializationCompleteListener onInitializationCompleteListener) {
        try {
            zzbvd.zza().zzb(context, null);
            this.zzg.zzj();
            this.zzg.zzk(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zzcgp.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    private final void zzy(Context context) {
        if (this.zzg == null) {
            this.zzg = (zzcm) new zzao(zzaw.zza(), context).zzd(context, false);
        }
    }

    private final void zzz(RequestConfiguration requestConfiguration) {
        try {
            this.zzg.zzs(new zzez(requestConfiguration));
        } catch (RemoteException e) {
            zzcgp.zzh("Unable to set request configuration parcel.", e);
        }
    }

    public final RequestConfiguration zzc() {
        return this.zzi;
    }

    public final InitializationStatus zze() {
        InitializationStatus zzw;
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                zzw = zzw(this.zzg.zzg());
            } catch (RemoteException unused) {
                zzcgp.zzg("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzdv
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        zzed zzedVar = zzed.this;
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new zzdy(zzedVar));
                        return hashMap;
                    }
                };
            }
        }
        return zzw;
    }

    @Deprecated
    public final String zzh() {
        String zzc;
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                zzc = zzftm.zzc(this.zzg.zzf());
            } catch (RemoteException e) {
                zzcgp.zzh("Unable to get version string.", e);
                return "";
            }
        }
        return zzc;
    }

    public final void zzl(Context context) {
        synchronized (this.zzf) {
            zzy(context);
            try {
                this.zzg.zzi();
            } catch (RemoteException unused) {
                zzcgp.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzm(final Context context, @Nullable String str, @Nullable final OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzb) {
            if (this.zzd) {
                if (onInitializationCompleteListener != null) {
                    this.zzc.add(onInitializationCompleteListener);
                }
                return;
            }
            if (this.zze) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zze());
                }
                return;
            }
            this.zzd = true;
            if (onInitializationCompleteListener != null) {
                this.zzc.add(onInitializationCompleteListener);
            }
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            synchronized (this.zzf) {
                zzeb zzebVar = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                try {
                    zzy(context);
                    this.zzg.zzr(new zzec(this, zzebVar));
                    this.zzg.zzn(new zzbvh());
                    if (this.zzi.getTagForChildDirectedTreatment() != -1 || this.zzi.getTagForUnderAgeOfConsent() != -1) {
                        zzz(this.zzi);
                    }
                } catch (RemoteException e) {
                    zzcgp.zzk("MobileAdsSettingManager initialization failed", e);
                }
                zzbjc.zzc(context);
                if (((Boolean) zzbkq.zza.zze()).booleanValue()) {
                    if (((Boolean) zzay.zzc().zzb(zzbjc.zziL)).booleanValue()) {
                        zzcgp.zze("Initializing on bg thread");
                        ThreadPoolExecutor threadPoolExecutor = zzcge.zza;
                        final Object[] objArr3 = objArr2 == true ? 1 : 0;
                        threadPoolExecutor.execute(new Runnable(context, objArr3, onInitializationCompleteListener) { // from class: com.google.android.gms.ads.internal.client.zzdw
                            public final /* synthetic */ Context zzb;
                            public final /* synthetic */ OnInitializationCompleteListener zzc;

                            {
                                this.zzc = onInitializationCompleteListener;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                zzed.this.zzn(this.zzb, null, this.zzc);
                            }
                        });
                    }
                }
                if (((Boolean) zzbkq.zzb.zze()).booleanValue()) {
                    if (((Boolean) zzay.zzc().zzb(zzbjc.zziL)).booleanValue()) {
                        ExecutorService executorService = zzcge.zzb;
                        final Object[] objArr4 = objArr == true ? 1 : 0;
                        executorService.execute(new Runnable(context, objArr4, onInitializationCompleteListener) { // from class: com.google.android.gms.ads.internal.client.zzdx
                            public final /* synthetic */ Context zzb;
                            public final /* synthetic */ OnInitializationCompleteListener zzc;

                            {
                                this.zzc = onInitializationCompleteListener;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                zzed.this.zzo(this.zzb, null, this.zzc);
                            }
                        });
                    }
                }
                zzcgp.zze("Initializing on calling thread");
                zzx(context, null, onInitializationCompleteListener);
            }
        }
    }

    final /* synthetic */ void zzn(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzf) {
            zzx(context, null, onInitializationCompleteListener);
        }
    }

    final /* synthetic */ void zzo(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzf) {
            zzx(context, null, onInitializationCompleteListener);
        }
    }

    public final void zzp(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzf) {
            zzy(context);
            this.zzh = onAdInspectorClosedListener;
            try {
                this.zzg.zzl(new zzea(null));
            } catch (RemoteException unused) {
                zzcgp.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzq(Context context, String str) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzg.zzm(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                zzcgp.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzr(Class cls) {
        synchronized (this.zzf) {
            try {
                this.zzg.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                zzcgp.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzs(boolean z) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzg.zzo(z);
            } catch (RemoteException e) {
                zzcgp.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzt(float f) {
        boolean z = true;
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzf) {
            if (this.zzg == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzg.zzp(f);
            } catch (RemoteException e) {
                zzcgp.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzu(RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzf) {
            RequestConfiguration requestConfiguration2 = this.zzi;
            this.zzi = requestConfiguration;
            if (this.zzg == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzz(requestConfiguration);
            }
        }
    }

    public final float zza() {
        synchronized (this.zzf) {
            zzcm zzcmVar = this.zzg;
            float f = 1.0f;
            if (zzcmVar == null) {
                return 1.0f;
            }
            try {
                f = zzcmVar.zze();
            } catch (RemoteException e) {
                zzcgp.zzh("Unable to get app volume.", e);
            }
            return f;
        }
    }

    public final boolean zzv() {
        synchronized (this.zzf) {
            zzcm zzcmVar = this.zzg;
            boolean z = false;
            if (zzcmVar == null) {
                return false;
            }
            try {
                z = zzcmVar.zzt();
            } catch (RemoteException e) {
                zzcgp.zzh("Unable to get app mute state.", e);
            }
            return z;
        }
    }
}
