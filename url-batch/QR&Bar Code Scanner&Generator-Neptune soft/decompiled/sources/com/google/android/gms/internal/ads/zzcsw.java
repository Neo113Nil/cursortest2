package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcsw extends com.google.android.gms.ads.internal.client.zzcl {
    private final Context zza;
    private final zzcgv zzb;
    private final zzdvl zzc;
    private final zzehe zzd;
    private final zzenc zze;
    private final zzdzs zzf;
    private final zzceu zzg;
    private final zzdvq zzh;
    private final zzeak zzi;
    private final zzbll zzj;
    private final zzfjw zzk;
    private final zzfey zzl;
    private boolean zzm = false;

    zzcsw(Context context, zzcgv zzcgvVar, zzdvl zzdvlVar, zzehe zzeheVar, zzenc zzencVar, zzdzs zzdzsVar, zzceu zzceuVar, zzdvq zzdvqVar, zzeak zzeakVar, zzbll zzbllVar, zzfjw zzfjwVar, zzfey zzfeyVar) {
        this.zza = context;
        this.zzb = zzcgvVar;
        this.zzc = zzdvlVar;
        this.zzd = zzeheVar;
        this.zze = zzencVar;
        this.zzf = zzdzsVar;
        this.zzg = zzceuVar;
        this.zzh = zzdvqVar;
        this.zzi = zzeakVar;
        this.zzj = zzbllVar;
        this.zzk = zzfjwVar;
        this.zzl = zzfeyVar;
    }

    final void zzb() {
        if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO()) {
            if (com.google.android.gms.ads.internal.zzt.zzs().zzj(this.zza, com.google.android.gms.ads.internal.zzt.zzo().zzh().zzl(), this.zzb.zza)) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzB(false);
            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzA("");
        }
    }

    final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zze = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zze();
        if (zze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.zze.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzd()) {
            HashMap hashMap = new HashMap();
            Iterator it = zze.values().iterator();
            while (it.hasNext()) {
                for (zzbve zzbveVar : ((zzbvf) it.next()).zza) {
                    String str = zzbveVar.zzk;
                    for (String str2 : zzbveVar.zzc) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzehf zza = this.zzd.zza(str3, jSONObject);
                    if (zza != null) {
                        zzffa zzffaVar = (zzffa) zza.zzb;
                        if (!zzffaVar.zzA() && zzffaVar.zzz()) {
                            zzffaVar.zzj(this.zza, (zzeiy) zza.zzc, (List) entry.getValue());
                            com.google.android.gms.ads.internal.util.zze.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfek e) {
                    com.google.android.gms.ads.internal.util.zze.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                }
            }
        }
    }

    final /* synthetic */ void zzd() {
        zzffh.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzt.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final String zzf() {
        return this.zzb.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzh(String str) {
        this.zze.zzf(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzj() {
        if (this.zzm) {
            com.google.android.gms.ads.internal.util.zze.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbjc.zzc(this.zza);
        com.google.android.gms.ads.internal.zzt.zzo().zzr(this.zza, this.zzb);
        com.google.android.gms.ads.internal.zzt.zzc().zzi(this.zza);
        this.zzm = true;
        this.zzf.zzr();
        this.zze.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdf)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhT)).booleanValue()) {
            zzchc.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcss
                @Override // java.lang.Runnable
                public final void run() {
                    zzcsw.this.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziB)).booleanValue()) {
            zzchc.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsr
                @Override // java.lang.Runnable
                public final void run() {
                    zzcsw.this.zzu();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcq)).booleanValue()) {
            zzchc.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcst
                @Override // java.lang.Runnable
                public final void run() {
                    zzcsw.this.zzd();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzk(String str, IObjectWrapper iObjectWrapper) {
        String str2;
        Runnable runnable;
        zzbjc.zzc(this.zza);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdh)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            str2 = com.google.android.gms.ads.internal.util.zzs.zzo(this.zza);
        } else {
            str2 = "";
        }
        boolean z = true;
        String str3 = true != TextUtils.isEmpty(str2) ? str2 : str;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzde)).booleanValue() | ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaK)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaK)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsu
                @Override // java.lang.Runnable
                public final void run() {
                    final zzcsw zzcswVar = zzcsw.this;
                    final Runnable runnable3 = runnable2;
                    zzchc.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsv
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcsw.this.zzc(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z = booleanValue;
        }
        Runnable runnable3 = runnable;
        if (z) {
            com.google.android.gms.ads.internal.zzt.zza().zza(this.zza, this.zzb, str3, runnable3, this.zzk);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzl(com.google.android.gms.ads.internal.client.zzcy zzcyVar) throws RemoteException {
        this.zzi.zzh(zzcyVar, zzeaj.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzm(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            com.google.android.gms.ads.internal.util.zze.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            com.google.android.gms.ads.internal.util.zze.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzas zzasVar = new com.google.android.gms.ads.internal.util.zzas(context);
        zzasVar.zzn(str);
        zzasVar.zzo(this.zzb.zza);
        zzasVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzn(zzbvk zzbvkVar) throws RemoteException {
        this.zzl.zze(zzbvkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzo(boolean z) {
        com.google.android.gms.ads.internal.zzt.zzr().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzp(float f) {
        com.google.android.gms.ads.internal.zzt.zzr().zzd(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzq(String str) {
        zzbjc.zzc(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzde)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zza().zza(this.zza, this.zzb, str, null, this.zzk);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzr(zzbrx zzbrxVar) throws RemoteException {
        this.zzf.zzs(zzbrxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzs(com.google.android.gms.ads.internal.client.zzez zzezVar) throws RemoteException {
        this.zzg.zzq(this.zza, zzezVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized boolean zzt() {
        return com.google.android.gms.ads.internal.zzt.zzr().zze();
    }

    final /* synthetic */ void zzu() {
        this.zzj.zza(new zzcak());
    }
}
