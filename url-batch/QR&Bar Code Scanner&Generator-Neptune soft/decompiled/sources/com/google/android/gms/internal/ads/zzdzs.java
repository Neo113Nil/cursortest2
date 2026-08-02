package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdzs {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdvl zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdxz zzl;
    private final zzcgv zzm;
    private final zzdjr zzo;
    private final zzfjw zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzchh zze = new zzchh();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();

    public zzdzs(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdvl zzdvlVar, ScheduledExecutorService scheduledExecutorService, zzdxz zzdxzVar, zzcgv zzcgvVar, zzdjr zzdjrVar, zzfjw zzfjwVar) {
        this.zzh = zzdvlVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdxzVar;
        this.zzm = zzcgvVar;
        this.zzo = zzdjrVar;
        this.zzp = zzfjwVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void zzj(final zzdzs zzdzsVar, String str) {
        int i = 5;
        final zzfjj zza = zzfji.zza(zzdzsVar.zzf, 5);
        zza.zzf();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzfjj zza2 = zzfji.zza(zzdzsVar.zzf, i);
                zza2.zzf();
                zza2.zzc(next);
                final Object obj = new Object();
                final zzchh zzchhVar = new zzchh();
                zzfzp zzo = zzfzg.zzo(zzchhVar, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbB)).longValue(), TimeUnit.SECONDS, zzdzsVar.zzk);
                zzdzsVar.zzl.zzc(next);
                zzdzsVar.zzo.zzc(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                zzo.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdzs.this.zzq(obj, zzchhVar, next, elapsedRealtime, zza2);
                    }
                }, zzdzsVar.zzi);
                arrayList.add(zzo);
                final zzdzr zzdzrVar = new zzdzr(zzdzsVar, obj, next, elapsedRealtime, zza2, zzchhVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbsa(optString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdzsVar.zzv(next, false, "", 0);
                try {
                    try {
                        final zzffa zzc = zzdzsVar.zzh.zzc(next, new JSONObject());
                        zzdzsVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzn
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdzs.this.zzn(zzc, zzdzrVar, arrayList2, next);
                            }
                        });
                    } catch (RemoteException e) {
                        zzcgp.zzh("", e);
                    }
                } catch (zzfek unused2) {
                    zzdzrVar.zze("Failed to create Adapter.");
                }
                i = 5;
            }
            zzfzg.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdzs.this.zzf(zza);
                    return null;
                }
            }, zzdzsVar.zzi);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e2);
            zzdzsVar.zzo.zza("MalformedJson");
            zzdzsVar.zzl.zza("MalformedJson");
            zzdzsVar.zze.zze(e2);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "AdapterInitializer.updateAdapterStatus");
            zzfjw zzfjwVar = zzdzsVar.zzp;
            zza.zze(false);
            zzfjwVar.zzb(zza.zzj());
        }
    }

    private final synchronized zzfzp zzu() {
        String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            return zzfzg.zzi(zzc);
        }
        final zzchh zzchhVar = new zzchh();
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzo
            @Override // java.lang.Runnable
            public final void run() {
                zzdzs.this.zzo(zzchhVar);
            }
        });
        return zzchhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbrq(str, z, i, str2));
    }

    final /* synthetic */ Object zzf(zzfjj zzfjjVar) throws Exception {
        this.zze.zzd(true);
        zzfjw zzfjwVar = this.zzp;
        zzfjjVar.zze(true);
        zzfjwVar.zzb(zzfjjVar.zzj());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbrq zzbrqVar = (zzbrq) this.zzn.get(str);
            arrayList.add(new zzbrq(str, zzbrqVar.zzb, zzbrqVar.zzc, zzbrqVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    final /* synthetic */ void zzm() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zze(new Exception());
        }
    }

    final /* synthetic */ void zzn(zzffa zzffaVar, zzbru zzbruVar, List list, String str) {
        try {
            try {
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzffaVar.zzi(context, zzbruVar, list);
            } catch (RemoteException e) {
                zzcgp.zzh("", e);
            }
        } catch (zzfek unused) {
            zzbruVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    final /* synthetic */ void zzo(final zzchh zzchhVar) {
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzh
            @Override // java.lang.Runnable
            public final void run() {
                zzchh zzchhVar2 = zzchhVar;
                String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
                if (TextUtils.isEmpty(zzc)) {
                    zzchhVar2.zze(new Exception());
                } else {
                    zzchhVar2.zzd(zzc);
                }
            }
        });
    }

    final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    final /* synthetic */ void zzq(Object obj, zzchh zzchhVar, String str, long j, zzfjj zzfjjVar) {
        synchronized (obj) {
            if (!zzchhVar.isDone()) {
                zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - j));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfjw zzfjwVar = this.zzp;
                zzfjjVar.zze(false);
                zzfjwVar.zzb(zzfjjVar.zzj());
                zzchhVar.zzd(false);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbkx.zza.zze()).booleanValue()) {
            if (this.zzm.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbA)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    this.zze.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdzs.this.zzp();
                        }
                    }, this.zzi);
                    this.zza = true;
                    zzfzp zzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzl
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdzs.this.zzm();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbC)).longValue(), TimeUnit.SECONDS);
                    zzfzg.zzr(zzu, new zzdzq(this), this.zzi);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzd(false);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzbrx zzbrxVar) {
        this.zze.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzm
            @Override // java.lang.Runnable
            public final void run() {
                zzdzs zzdzsVar = zzdzs.this;
                try {
                    zzbrxVar.zzb(zzdzsVar.zzg());
                } catch (RemoteException e) {
                    zzcgp.zzh("", e);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
