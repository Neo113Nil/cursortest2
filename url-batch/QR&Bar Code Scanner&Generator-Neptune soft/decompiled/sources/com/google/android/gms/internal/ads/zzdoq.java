package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdoq {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzdk zzb;
    private zzblw zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzef zzg;
    private Bundle zzh;
    private zzcmp zzi;
    private zzcmp zzj;
    private zzcmp zzk;
    private IObjectWrapper zzl;
    private View zzm;
    private View zzn;
    private IObjectWrapper zzo;
    private double zzp;
    private zzbme zzq;
    private zzbme zzr;
    private String zzs;
    private float zzv;
    private String zzw;
    private final SimpleArrayMap zzt = new SimpleArrayMap();
    private final SimpleArrayMap zzu = new SimpleArrayMap();
    private List zzf = Collections.emptyList();

    public static zzdoq zzab(zzbvv zzbvvVar) {
        try {
            zzdop zzaf = zzaf(zzbvvVar.zzg(), null);
            zzblw zzh = zzbvvVar.zzh();
            View view = (View) zzah(zzbvvVar.zzj());
            String zzo = zzbvvVar.zzo();
            List zzr = zzbvvVar.zzr();
            String zzm = zzbvvVar.zzm();
            Bundle zzf = zzbvvVar.zzf();
            String zzn = zzbvvVar.zzn();
            View view2 = (View) zzah(zzbvvVar.zzk());
            IObjectWrapper zzl = zzbvvVar.zzl();
            String zzq = zzbvvVar.zzq();
            String zzp = zzbvvVar.zzp();
            double zze = zzbvvVar.zze();
            zzbme zzi = zzbvvVar.zzi();
            zzdoq zzdoqVar = new zzdoq();
            zzdoqVar.zza = 2;
            zzdoqVar.zzb = zzaf;
            zzdoqVar.zzc = zzh;
            zzdoqVar.zzd = view;
            zzdoqVar.zzU("headline", zzo);
            zzdoqVar.zze = zzr;
            zzdoqVar.zzU("body", zzm);
            zzdoqVar.zzh = zzf;
            zzdoqVar.zzU("call_to_action", zzn);
            zzdoqVar.zzm = view2;
            zzdoqVar.zzo = zzl;
            zzdoqVar.zzU("store", zzq);
            zzdoqVar.zzU("price", zzp);
            zzdoqVar.zzp = zze;
            zzdoqVar.zzq = zzi;
            return zzdoqVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdoq zzac(zzbvw zzbvwVar) {
        try {
            zzdop zzaf = zzaf(zzbvwVar.zzf(), null);
            zzblw zzg = zzbvwVar.zzg();
            View view = (View) zzah(zzbvwVar.zzi());
            String zzo = zzbvwVar.zzo();
            List zzp = zzbvwVar.zzp();
            String zzm = zzbvwVar.zzm();
            Bundle zze = zzbvwVar.zze();
            String zzn = zzbvwVar.zzn();
            View view2 = (View) zzah(zzbvwVar.zzj());
            IObjectWrapper zzk = zzbvwVar.zzk();
            String zzl = zzbvwVar.zzl();
            zzbme zzh = zzbvwVar.zzh();
            zzdoq zzdoqVar = new zzdoq();
            zzdoqVar.zza = 1;
            zzdoqVar.zzb = zzaf;
            zzdoqVar.zzc = zzg;
            zzdoqVar.zzd = view;
            zzdoqVar.zzU("headline", zzo);
            zzdoqVar.zze = zzp;
            zzdoqVar.zzU("body", zzm);
            zzdoqVar.zzh = zze;
            zzdoqVar.zzU("call_to_action", zzn);
            zzdoqVar.zzm = view2;
            zzdoqVar.zzo = zzk;
            zzdoqVar.zzU("advertiser", zzl);
            zzdoqVar.zzr = zzh;
            return zzdoqVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdoq zzad(zzbvv zzbvvVar) {
        try {
            return zzag(zzaf(zzbvvVar.zzg(), null), zzbvvVar.zzh(), (View) zzah(zzbvvVar.zzj()), zzbvvVar.zzo(), zzbvvVar.zzr(), zzbvvVar.zzm(), zzbvvVar.zzf(), zzbvvVar.zzn(), (View) zzah(zzbvvVar.zzk()), zzbvvVar.zzl(), zzbvvVar.zzq(), zzbvvVar.zzp(), zzbvvVar.zze(), zzbvvVar.zzi(), null, 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdoq zzae(zzbvw zzbvwVar) {
        try {
            return zzag(zzaf(zzbvwVar.zzf(), null), zzbvwVar.zzg(), (View) zzah(zzbvwVar.zzi()), zzbvwVar.zzo(), zzbvwVar.zzp(), zzbvwVar.zzm(), zzbvwVar.zze(), zzbvwVar.zzn(), (View) zzah(zzbvwVar.zzj()), zzbvwVar.zzk(), null, null, -1.0d, zzbvwVar.zzh(), zzbvwVar.zzl(), 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdop zzaf(com.google.android.gms.ads.internal.client.zzdk zzdkVar, zzbvz zzbvzVar) {
        if (zzdkVar == null) {
            return null;
        }
        return new zzdop(zzdkVar, zzbvzVar);
    }

    private static zzdoq zzag(com.google.android.gms.ads.internal.client.zzdk zzdkVar, zzblw zzblwVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbme zzbmeVar, String str6, float f) {
        zzdoq zzdoqVar = new zzdoq();
        zzdoqVar.zza = 6;
        zzdoqVar.zzb = zzdkVar;
        zzdoqVar.zzc = zzblwVar;
        zzdoqVar.zzd = view;
        zzdoqVar.zzU("headline", str);
        zzdoqVar.zze = list;
        zzdoqVar.zzU("body", str2);
        zzdoqVar.zzh = bundle;
        zzdoqVar.zzU("call_to_action", str3);
        zzdoqVar.zzm = view2;
        zzdoqVar.zzo = iObjectWrapper;
        zzdoqVar.zzU("store", str4);
        zzdoqVar.zzU("price", str5);
        zzdoqVar.zzp = d;
        zzdoqVar.zzq = zzbmeVar;
        zzdoqVar.zzU("advertiser", str6);
        zzdoqVar.zzP(f);
        return zzdoqVar;
    }

    private static Object zzah(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdoq zzs(zzbvz zzbvzVar) {
        try {
            return zzag(zzaf(zzbvzVar.zzj(), zzbvzVar), zzbvzVar.zzk(), (View) zzah(zzbvzVar.zzm()), zzbvzVar.zzs(), zzbvzVar.zzv(), zzbvzVar.zzq(), zzbvzVar.zzi(), zzbvzVar.zzr(), (View) zzah(zzbvzVar.zzn()), zzbvzVar.zzo(), zzbvzVar.zzu(), zzbvzVar.zzt(), zzbvzVar.zze(), zzbvzVar.zzl(), zzbvzVar.zzp(), zzbvzVar.zzf());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzw;
    }

    public final synchronized String zzB() {
        return zzD("price");
    }

    public final synchronized String zzC() {
        return zzD("store");
    }

    public final synchronized String zzD(String str) {
        return (String) this.zzu.get(str);
    }

    public final synchronized List zzE() {
        return this.zze;
    }

    public final synchronized List zzF() {
        return this.zzf;
    }

    public final synchronized void zzG() {
        zzcmp zzcmpVar = this.zzi;
        if (zzcmpVar != null) {
            zzcmpVar.destroy();
            this.zzi = null;
        }
        zzcmp zzcmpVar2 = this.zzj;
        if (zzcmpVar2 != null) {
            zzcmpVar2.destroy();
            this.zzj = null;
        }
        zzcmp zzcmpVar3 = this.zzk;
        if (zzcmpVar3 != null) {
            zzcmpVar3.destroy();
            this.zzk = null;
        }
        this.zzl = null;
        this.zzt.clear();
        this.zzu.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzm = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
    }

    public final synchronized void zzH(zzblw zzblwVar) {
        this.zzc = zzblwVar;
    }

    public final synchronized void zzI(String str) {
        this.zzs = str;
    }

    public final synchronized void zzJ(com.google.android.gms.ads.internal.client.zzef zzefVar) {
        this.zzg = zzefVar;
    }

    public final synchronized void zzK(zzbme zzbmeVar) {
        this.zzq = zzbmeVar;
    }

    public final synchronized void zzL(String str, zzblq zzblqVar) {
        if (zzblqVar == null) {
            this.zzt.remove(str);
        } else {
            this.zzt.put(str, zzblqVar);
        }
    }

    public final synchronized void zzM(zzcmp zzcmpVar) {
        this.zzj = zzcmpVar;
    }

    public final synchronized void zzN(List list) {
        this.zze = list;
    }

    public final synchronized void zzO(zzbme zzbmeVar) {
        this.zzr = zzbmeVar;
    }

    public final synchronized void zzP(float f) {
        this.zzv = f;
    }

    public final synchronized void zzQ(List list) {
        this.zzf = list;
    }

    public final synchronized void zzR(zzcmp zzcmpVar) {
        this.zzk = zzcmpVar;
    }

    public final synchronized void zzS(String str) {
        this.zzw = str;
    }

    public final synchronized void zzT(double d) {
        this.zzp = d;
    }

    public final synchronized void zzU(String str, String str2) {
        if (str2 == null) {
            this.zzu.remove(str);
        } else {
            this.zzu.put(str, str2);
        }
    }

    public final synchronized void zzV(int i) {
        this.zza = i;
    }

    public final synchronized void zzW(com.google.android.gms.ads.internal.client.zzdk zzdkVar) {
        this.zzb = zzdkVar;
    }

    public final synchronized void zzX(View view) {
        this.zzm = view;
    }

    public final synchronized void zzY(zzcmp zzcmpVar) {
        this.zzi = zzcmpVar;
    }

    public final synchronized void zzZ(View view) {
        this.zzn = view;
    }

    public final synchronized double zza() {
        return this.zzp;
    }

    public final synchronized void zzaa(IObjectWrapper iObjectWrapper) {
        this.zzl = iObjectWrapper;
    }

    public final synchronized float zzb() {
        return this.zzv;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzm;
    }

    public final synchronized View zzg() {
        return this.zzn;
    }

    public final synchronized SimpleArrayMap zzh() {
        return this.zzt;
    }

    public final synchronized SimpleArrayMap zzi() {
        return this.zzu;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzdk zzj() {
        return this.zzb;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzef zzk() {
        return this.zzg;
    }

    public final synchronized zzblw zzl() {
        return this.zzc;
    }

    public final zzbme zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbmd.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized zzbme zzn() {
        return this.zzq;
    }

    public final synchronized zzbme zzo() {
        return this.zzr;
    }

    public final synchronized zzcmp zzp() {
        return this.zzj;
    }

    public final synchronized zzcmp zzq() {
        return this.zzk;
    }

    public final synchronized zzcmp zzr() {
        return this.zzi;
    }

    public final synchronized IObjectWrapper zzt() {
        return this.zzo;
    }

    public final synchronized IObjectWrapper zzu() {
        return this.zzl;
    }

    public final synchronized String zzv() {
        return zzD("advertiser");
    }

    public final synchronized String zzw() {
        return zzD("body");
    }

    public final synchronized String zzx() {
        return zzD("call_to_action");
    }

    public final synchronized String zzy() {
        return this.zzs;
    }

    public final synchronized String zzz() {
        return zzD("headline");
    }
}
