package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsq;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzgvb;
import com.ironsource.mediationsdk.metadata.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzeu {
    public static final Set zza = new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));
    private static zzeu zze;

    @Nullable
    private zzem zzb;

    @Nullable
    private zzey zzc;

    @Nullable
    private zzel zzd;

    @Nullable
    private zzcy zzl;
    private final Object zzf = new Object();
    private final Object zzg = new Object();
    private boolean zzi = false;
    private boolean zzj = false;
    private final Object zzk = new Object();

    @Nullable
    private OnAdInspectorClosedListener zzm = null;

    @NonNull
    private RequestConfiguration zzn = new RequestConfiguration.Builder().build();
    private final ArrayList zzh = new ArrayList();

    private zzeu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzB(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbsh zzbshVar = (zzbsh) it.next();
            hashMap.put(zzbshVar.zza, new zzbsp(zzbshVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbshVar.zzd, zzbshVar.zzc));
        }
        return new zzbsq(hashMap);
    }

    private final void zzC(@NonNull RequestConfiguration requestConfiguration) {
        zzcy zzcyVar = this.zzl;
        if (zzcyVar == null) {
            return;
        }
        try {
            zzcyVar.zzr(new zzfr(requestConfiguration));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set request configuration parcel.", e);
        }
    }

    private final void zzD(Context context) {
        if (this.zzl == null) {
            this.zzl = (zzcy) new zzat(zzay.zzb(), context).zzd(context, false);
        }
    }

    private final void zzE(@Nullable String str) {
        zzcy zzcyVar = this.zzl;
        if (zzcyVar == null) {
            return;
        }
        try {
            zzcyVar.zze();
            this.zzl.zzj(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("MobileAdsSettingManager initialization failed", e);
        }
    }

    public static zzeu zzb() {
        zzeu zzeuVar;
        synchronized (zzeu.class) {
            try {
                if (zze == null) {
                    zze = new zzeu();
                }
                zzeuVar = zze;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzeuVar;
    }

    final /* synthetic */ OnAdInspectorClosedListener zzA() {
        return this.zzm;
    }

    @Nullable
    public final com.google.android.gms.ads.preload.zzb zza(AdFormat adFormat) {
        AdFormat adFormat2 = AdFormat.BANNER;
        int ordinal = adFormat.ordinal();
        if (ordinal == 1) {
            return this.zzb;
        }
        if (ordinal == 2) {
            return this.zzc;
        }
        if (ordinal != 5) {
            return null;
        }
        return this.zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(Context context, @Nullable String str, @Nullable OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzf) {
            try {
                if (this.zzi) {
                    if (onInitializationCompleteListener != null) {
                        this.zzh.add(onInitializationCompleteListener);
                    }
                    return;
                }
                if (this.zzj) {
                    if (onInitializationCompleteListener != null) {
                        onInitializationCompleteListener.onInitializationComplete(zzl());
                    }
                    return;
                }
                this.zzi = true;
                if (onInitializationCompleteListener != null) {
                    this.zzh.add(onInitializationCompleteListener);
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                synchronized (this.zzk) {
                    byte[] bArr = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    try {
                        zzD(context);
                        zzcy zzcyVar = this.zzl;
                        if (zzcyVar != null) {
                            zzcyVar.zzp(new zzet(this, bArr));
                            this.zzl.zzo(new zzbvq());
                        }
                        if (this.zzn.getTagForChildDirectedTreatment() != -1 || this.zzn.getTagForUnderAgeOfConsent() != -1) {
                            zzC(this.zzn);
                        }
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("MobileAdsSettingManager initialization failed", e);
                    } finally {
                    }
                    zzbjg.zza(context);
                    if (((Boolean) zzblf.zza.zze()).booleanValue()) {
                        if (((Boolean) zzba.zzc().zzd(zzbjg.zzmN)).booleanValue()) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on bg thread");
                            ThreadPoolExecutor threadPoolExecutor = com.google.android.gms.ads.internal.util.client.zzb.zza;
                            final Object[] objArr3 = objArr2 == true ? 1 : 0;
                            threadPoolExecutor.execute(new Runnable(objArr3) { // from class: com.google.android.gms.ads.internal.client.zzer
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzeu.this.zzt(null);
                                }
                            });
                            this.zzb = new zzem(context);
                            this.zzc = new zzey(context);
                            this.zzd = new zzel(context);
                        }
                    }
                    if (((Boolean) zzblf.zzb.zze()).booleanValue()) {
                        if (((Boolean) zzba.zzc().zzd(zzbjg.zzmN)).booleanValue()) {
                            ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                            final Object[] objArr4 = objArr == true ? 1 : 0;
                            executorService.execute(new Runnable(objArr4) { // from class: com.google.android.gms.ads.internal.client.zzep
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzeu.this.zzu(null);
                                }
                            });
                            this.zzb = new zzem(context);
                            this.zzc = new zzey(context);
                            this.zzd = new zzel(context);
                        }
                    }
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on calling thread");
                    zzE(null);
                    this.zzb = new zzem(context);
                    this.zzc = new zzey(context);
                    this.zzd = new zzel(context);
                }
            } finally {
            }
        }
    }

    public final void zzd() {
        synchronized (this.zzf) {
            this.zzj = false;
            this.zzi = false;
            this.zzh.clear();
        }
        synchronized (this.zzk) {
            try {
                zzcy zzcyVar = this.zzl;
                if (zzcyVar != null) {
                    zzcyVar.zzw();
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to stop the SDK.", e);
            }
            this.zzl = null;
            zzem zzemVar = this.zzb;
            if (zzemVar != null) {
                zzemVar.zzg();
                this.zzb = null;
            }
            zzey zzeyVar = this.zzc;
            if (zzeyVar != null) {
                zzeyVar.zzg();
                this.zzc = null;
            }
            zzel zzelVar = this.zzd;
            if (zzelVar != null) {
                zzelVar.zzg();
                this.zzd = null;
            }
        }
    }

    public final Status zze(@NonNull Context context, @NonNull List list, @NonNull PreloadCallback preloadCallback) {
        boolean z;
        Status status;
        zzbjg.zza(context);
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String valueOf = String.valueOf(preloadConfiguration.getAdFormat());
            String adUnitId = preloadConfiguration.getAdUnitId();
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(adUnitId).length());
            sb.append(valueOf);
            sb.append("#");
            sb.append(adUnitId);
            String sb2 = sb.toString();
            hashMap.put(sb2, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(hashMap, sb2, 0)).intValue() + 1));
        }
        Iterator it2 = hashMap.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                z = true;
                break;
            }
        }
        HashMap hashMap2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (zza.contains(preloadConfiguration2.getAdFormat())) {
                hashMap2.put(adFormat, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(hashMap2, adFormat, 0)).intValue() + 1));
                if (preloadConfiguration2.getBufferSize() > 15) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size exceeds the maximum limit %d for %s", 15, adFormat.name()));
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size less than 0 for %s", adFormat.name()));
                }
            } else {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(preloadConfiguration2.getAdFormat())));
            }
            z = true;
        }
        EnumMap enumMap = new EnumMap(AdFormat.class);
        enumMap.put((EnumMap) AdFormat.APP_OPEN_AD, (AdFormat) zzba.zzc().zzd(zzbjg.zzfD));
        enumMap.put((EnumMap) AdFormat.INTERSTITIAL, (AdFormat) zzba.zzc().zzd(zzbjg.zzfB));
        enumMap.put((EnumMap) AdFormat.REWARDED, (AdFormat) zzba.zzc().zzd(zzbjg.zzfC));
        for (Map.Entry entry : hashMap2.entrySet()) {
            AdFormat adFormat2 = (AdFormat) entry.getKey();
            int intValue = ((Integer) entry.getValue()).intValue();
            Integer num = (Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat2, 0);
            if (intValue > num.intValue()) {
                hashSet.add(String.format(Locale.US, "Preload configurations' size exceeds the maximum limit %d for %s", num, adFormat2.name()));
                z = true;
            }
        }
        if (z) {
            StringBuilder sb3 = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb3.append((String) it4.next());
                if (it4.hasNext()) {
                    sb3.append(", ");
                }
            }
            String sb4 = sb3.toString();
            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb4);
            status = new Status(13, sb4);
        } else {
            status = Status.RESULT_SUCCESS;
        }
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        Preconditions.checkArgument(status.isSuccess(), statusMessage);
        synchronized (this.zzg) {
            ArrayList arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList.add(com.google.android.gms.ads.internal.util.client.zzf.zzv(context, (PreloadConfiguration) it5.next(), 1));
            }
            try {
                com.google.android.gms.ads.zzb.zza(context).zze(arrayList, new zzen(this, preloadCallback));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to start preload.", e);
                return Status.RESULT_INTERNAL_ERROR;
            }
        }
        return Status.RESULT_SUCCESS;
    }

    public final void zzf(float f) {
        boolean z = true;
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzk) {
            if (this.zzl == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzf(f);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app volume.", e);
            }
        }
    }

    public final void zzh(boolean z) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzh(z);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzj(Context context, String str) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzi(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to open debug menu.", e);
            }
        }
    }

    public final InitializationStatus zzl() {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeq
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final /* synthetic */ Map getAdapterStatusMap() {
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new zzeo(zzeu.this));
                        return hashMap;
                    }
                };
            }
            try {
                return zzB(zzcyVar.zzq());
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeq
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final /* synthetic */ Map getAdapterStatusMap() {
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new zzeo(zzeu.this));
                        return hashMap;
                    }
                };
            }
        }
    }

    public final void zzm(Context context) {
        synchronized (this.zzk) {
            zzD(context);
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzs();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzn(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzk) {
            try {
                zzD(context);
                zzcy zzcyVar = this.zzl;
                if (zzcyVar == null) {
                    return;
                }
                this.zzm = onAdInspectorClosedListener;
                try {
                    zzcyVar.zzt(new zzes(null));
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to open the ad inspector.");
                    if (onAdInspectorClosedListener != null) {
                        onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String zzo() {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to getting version string.");
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return "";
            }
            try {
                return zzgvb.zza(zzcyVar.zzm());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get internal version.", e);
                return "";
            }
        }
    }

    @NonNull
    public final RequestConfiguration zzp() {
        return this.zzn;
    }

    public final void zzq(@NonNull RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzk) {
            try {
                RequestConfiguration requestConfiguration2 = this.zzn;
                this.zzn = requestConfiguration;
                if (this.zzl == null) {
                    return;
                }
                if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                    zzC(requestConfiguration);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzr(boolean z) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return false;
            }
            try {
                zzcyVar.zzu(z);
                return true;
            } catch (RemoteException e) {
                String str = z ? a.k : "disable";
                StringBuilder sb = new StringBuilder(str.length() + 40);
                sb.append("Unable to ");
                sb.append(str);
                sb.append(" the publisher first-party ID.");
                com.google.android.gms.ads.internal.util.client.zzo.zzg(sb.toString(), e);
                return false;
            }
        }
    }

    public final void zzs(String str) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzv(str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set plugin.", e);
            }
        }
    }

    final /* synthetic */ void zzt(String str) {
        synchronized (this.zzk) {
            zzE(null);
        }
    }

    final /* synthetic */ void zzu(String str) {
        synchronized (this.zzk) {
            zzE(null);
        }
    }

    final /* synthetic */ Object zzw() {
        return this.zzf;
    }

    final /* synthetic */ ArrayList zzx() {
        return this.zzh;
    }

    final /* synthetic */ void zzy(boolean z) {
        this.zzi = false;
    }

    final /* synthetic */ void zzz(boolean z) {
        this.zzj = true;
    }

    public final float zzg() {
        synchronized (this.zzk) {
            zzcy zzcyVar = this.zzl;
            float f = 1.0f;
            if (zzcyVar == null) {
                return 1.0f;
            }
            try {
                f = zzcyVar.zzk();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app volume.", e);
            }
            return f;
        }
    }

    public final boolean zzi() {
        synchronized (this.zzk) {
            zzcy zzcyVar = this.zzl;
            boolean z = false;
            if (zzcyVar == null) {
                return false;
            }
            try {
                z = zzcyVar.zzl();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app mute state.", e);
            }
            return z;
        }
    }

    public final void zzk(Class cls) {
        synchronized (this.zzk) {
            zzcy zzcyVar = this.zzl;
            if (zzcyVar == null) {
                return;
            }
            try {
                zzcyVar.zzn(cls.getCanonicalName());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to register RtbAdapter", e);
            }
        }
    }
}
