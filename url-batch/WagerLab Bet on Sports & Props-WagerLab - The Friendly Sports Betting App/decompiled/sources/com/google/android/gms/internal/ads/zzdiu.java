package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdiu {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzed zzb;
    private zzbfp zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzez zzg;
    private Bundle zzh;
    private zzcek zzi;
    private zzcek zzj;
    private zzcek zzk;
    private zzedu zzl;
    private ListenableFuture zzm;
    private zzbzm zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbfw zzs;
    private zzbfw zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private final SimpleArrayMap zzw = new SimpleArrayMap();
    private List zzf = Collections.emptyList();

    public static zzdiu zzaf(zzbpm zzbpmVar) {
        try {
            return zzak(zzam(zzbpmVar.zzn(), zzbpmVar), zzbpmVar.zzo(), (View) zzal(zzbpmVar.zzp()), zzbpmVar.zze(), zzbpmVar.zzf(), zzbpmVar.zzg(), zzbpmVar.zzs(), zzbpmVar.zzi(), (View) zzal(zzbpmVar.zzq()), zzbpmVar.zzr(), zzbpmVar.zzl(), zzbpmVar.zzm(), zzbpmVar.zzk(), zzbpmVar.zzh(), zzbpmVar.zzj(), zzbpmVar.zzz());
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public static zzdiu zzag(zzbpj zzbpjVar) {
        try {
            zzdit zzam = zzam(zzbpjVar.zzs(), null);
            zzbfp zzt = zzbpjVar.zzt();
            View view = (View) zzal(zzbpjVar.zzr());
            String zze = zzbpjVar.zze();
            List zzf = zzbpjVar.zzf();
            String zzg = zzbpjVar.zzg();
            Bundle zzp = zzbpjVar.zzp();
            String zzi = zzbpjVar.zzi();
            View view2 = (View) zzal(zzbpjVar.zzu());
            IObjectWrapper zzv = zzbpjVar.zzv();
            String zzj = zzbpjVar.zzj();
            zzbfw zzh = zzbpjVar.zzh();
            zzdiu zzdiuVar = new zzdiu();
            zzdiuVar.zza = 1;
            zzdiuVar.zzb = zzam;
            zzdiuVar.zzc = zzt;
            zzdiuVar.zzd = view;
            zzdiuVar.zzs("headline", zze);
            zzdiuVar.zze = zzf;
            zzdiuVar.zzs("body", zzg);
            zzdiuVar.zzh = zzp;
            zzdiuVar.zzs("call_to_action", zzi);
            zzdiuVar.zzo = view2;
            zzdiuVar.zzq = zzv;
            zzdiuVar.zzs("advertiser", zzj);
            zzdiuVar.zzt = zzh;
            return zzdiuVar;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdiu zzah(zzbpi zzbpiVar) {
        zzdiu zzdiuVar;
        try {
            zzdit zzam = zzam(zzbpiVar.zzt(), null);
            zzbfp zzv = zzbpiVar.zzv();
            View view = (View) zzal(zzbpiVar.zzu());
            String zze = zzbpiVar.zze();
            List zzf = zzbpiVar.zzf();
            String zzg = zzbpiVar.zzg();
            Bundle zzr = zzbpiVar.zzr();
            String zzi = zzbpiVar.zzi();
            View view2 = (View) zzal(zzbpiVar.zzw());
            IObjectWrapper zzx = zzbpiVar.zzx();
            String zzk = zzbpiVar.zzk();
            String zzl = zzbpiVar.zzl();
            double zzj = zzbpiVar.zzj();
            zzbfw zzh = zzbpiVar.zzh();
            zzdiuVar = null;
            try {
                zzdiu zzdiuVar2 = new zzdiu();
                zzdiuVar2.zza = 2;
                zzdiuVar2.zzb = zzam;
                zzdiuVar2.zzc = zzv;
                zzdiuVar2.zzd = view;
                zzdiuVar2.zzs("headline", zze);
                zzdiuVar2.zze = zzf;
                zzdiuVar2.zzs("body", zzg);
                zzdiuVar2.zzh = zzr;
                zzdiuVar2.zzs("call_to_action", zzi);
                zzdiuVar2.zzo = view2;
                zzdiuVar2.zzq = zzx;
                zzdiuVar2.zzs(ProductResponseJsonKeys.STORE, zzk);
                zzdiuVar2.zzs("price", zzl);
                zzdiuVar2.zzr = zzj;
                zzdiuVar2.zzs = zzh;
                return zzdiuVar2;
            } catch (RemoteException e) {
                e = e;
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from app install ad mapper", e);
                return zzdiuVar;
            }
        } catch (RemoteException e2) {
            e = e2;
            zzdiuVar = null;
        }
    }

    public static zzdiu zzai(zzbpi zzbpiVar) {
        try {
            return zzak(zzam(zzbpiVar.zzt(), null), zzbpiVar.zzv(), (View) zzal(zzbpiVar.zzu()), zzbpiVar.zze(), zzbpiVar.zzf(), zzbpiVar.zzg(), zzbpiVar.zzr(), zzbpiVar.zzi(), (View) zzal(zzbpiVar.zzw()), zzbpiVar.zzx(), zzbpiVar.zzk(), zzbpiVar.zzl(), zzbpiVar.zzj(), zzbpiVar.zzh(), null, 0.0f);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdiu zzaj(zzbpj zzbpjVar) {
        try {
            return zzak(zzam(zzbpjVar.zzs(), null), zzbpjVar.zzt(), (View) zzal(zzbpjVar.zzr()), zzbpjVar.zze(), zzbpjVar.zzf(), zzbpjVar.zzg(), zzbpjVar.zzp(), zzbpjVar.zzi(), (View) zzal(zzbpjVar.zzu()), zzbpjVar.zzv(), null, null, -1.0d, zzbpjVar.zzh(), zzbpjVar.zzj(), 0.0f);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdiu zzak(com.google.android.gms.ads.internal.client.zzed zzedVar, zzbfp zzbfpVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbfw zzbfwVar, String str6, float f) {
        zzdiu zzdiuVar = new zzdiu();
        zzdiuVar.zza = 6;
        zzdiuVar.zzb = zzedVar;
        zzdiuVar.zzc = zzbfpVar;
        zzdiuVar.zzd = view;
        zzdiuVar.zzs("headline", str);
        zzdiuVar.zze = list;
        zzdiuVar.zzs("body", str2);
        zzdiuVar.zzh = bundle;
        zzdiuVar.zzs("call_to_action", str3);
        zzdiuVar.zzo = view2;
        zzdiuVar.zzq = iObjectWrapper;
        zzdiuVar.zzs(ProductResponseJsonKeys.STORE, str4);
        zzdiuVar.zzs("price", str5);
        zzdiuVar.zzr = d;
        zzdiuVar.zzs = zzbfwVar;
        zzdiuVar.zzs("advertiser", str6);
        zzdiuVar.zzu(f);
        return zzdiuVar;
    }

    private static Object zzal(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    private static zzdit zzam(com.google.android.gms.ads.internal.client.zzed zzedVar, zzbpm zzbpmVar) {
        if (zzedVar == null) {
            return null;
        }
        return new zzdit(zzedVar, zzbpmVar);
    }

    public final synchronized View zzA() {
        return this.zzd;
    }

    public final synchronized String zzB() {
        return zzw("headline");
    }

    public final synchronized List zzC() {
        return this.zze;
    }

    public final zzbfw zzD() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbfv.zzh((IBinder) obj);
        }
        return null;
    }

    public final synchronized List zzE() {
        return this.zzf;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzez zzF() {
        return this.zzg;
    }

    public final synchronized String zzG() {
        return zzw("body");
    }

    public final synchronized Bundle zzH() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized String zzI() {
        return zzw("call_to_action");
    }

    public final synchronized View zzJ() {
        return this.zzo;
    }

    public final synchronized View zzK() {
        return this.zzp;
    }

    public final synchronized IObjectWrapper zzL() {
        return this.zzq;
    }

    public final synchronized String zzM() {
        return zzw(ProductResponseJsonKeys.STORE);
    }

    public final synchronized String zzN() {
        return zzw("price");
    }

    public final synchronized double zzO() {
        return this.zzr;
    }

    public final synchronized zzbfw zzP() {
        return this.zzs;
    }

    public final synchronized String zzQ() {
        return zzw("advertiser");
    }

    public final synchronized zzbfw zzR() {
        return this.zzt;
    }

    public final synchronized String zzS() {
        return this.zzu;
    }

    public final synchronized zzcek zzT() {
        return this.zzi;
    }

    public final synchronized zzcek zzU() {
        return this.zzj;
    }

    public final synchronized boolean zzV() {
        return this.zzj != null;
    }

    public final synchronized zzcek zzW() {
        return this.zzk;
    }

    public final synchronized ListenableFuture zzX() {
        return this.zzm;
    }

    public final synchronized zzbzm zzY() {
        return this.zzn;
    }

    public final synchronized zzedu zzZ() {
        return this.zzl;
    }

    public final synchronized void zza(int i) {
        this.zza = i;
    }

    public final synchronized SimpleArrayMap zzaa() {
        return this.zzv;
    }

    public final synchronized float zzab() {
        return this.zzx;
    }

    public final synchronized String zzac() {
        return this.zzy;
    }

    public final synchronized SimpleArrayMap zzad() {
        return this.zzw;
    }

    public final synchronized void zzae() {
        zzcek zzcekVar = this.zzi;
        if (zzcekVar != null) {
            zzcekVar.destroy();
            this.zzi = null;
        }
        zzcek zzcekVar2 = this.zzj;
        if (zzcekVar2 != null) {
            zzcekVar2.destroy();
            this.zzj = null;
        }
        zzcek zzcekVar3 = this.zzk;
        if (zzcekVar3 != null) {
            zzcekVar3.destroy();
            this.zzk = null;
        }
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.zzm = null;
        }
        zzbzm zzbzmVar = this.zzn;
        if (zzbzmVar != null) {
            zzbzmVar.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzed zzedVar) {
        this.zzb = zzedVar;
    }

    public final synchronized void zzc(zzbfp zzbfpVar) {
        this.zzc = zzbfpVar;
    }

    public final synchronized void zzd(List list) {
        this.zze = list;
    }

    public final synchronized void zze(List list) {
        this.zzf = list;
    }

    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzez zzezVar) {
        this.zzg = zzezVar;
    }

    public final synchronized void zzg(View view) {
        this.zzo = view;
    }

    public final synchronized void zzh(View view) {
        this.zzp = view;
    }

    public final synchronized void zzi(double d) {
        this.zzr = d;
    }

    public final synchronized void zzj(zzbfw zzbfwVar) {
        this.zzs = zzbfwVar;
    }

    public final synchronized void zzk(zzbfw zzbfwVar) {
        this.zzt = zzbfwVar;
    }

    public final synchronized void zzl(String str) {
        this.zzu = str;
    }

    public final synchronized void zzm(zzcek zzcekVar) {
        this.zzi = zzcekVar;
    }

    public final synchronized void zzn(zzcek zzcekVar) {
        this.zzj = zzcekVar;
    }

    public final synchronized void zzo(zzcek zzcekVar) {
        this.zzk = zzcekVar;
    }

    public final synchronized void zzp(ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzq(zzedu zzeduVar) {
        this.zzl = zzeduVar;
    }

    public final synchronized void zzr(zzbzm zzbzmVar) {
        this.zzn = zzbzmVar;
    }

    public final synchronized void zzs(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized void zzt(String str, zzbfh zzbfhVar) {
        if (zzbfhVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbfhVar);
        }
    }

    public final synchronized void zzu(float f) {
        this.zzx = f;
    }

    public final synchronized void zzv(String str) {
        this.zzy = str;
    }

    public final synchronized String zzw(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized int zzx() {
        return this.zza;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzed zzy() {
        return this.zzb;
    }

    public final synchronized zzbfp zzz() {
        return this.zzc;
    }
}
