package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdol extends zzcze {
    public static final zzfvn zzc = zzfvn.zzt("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzbbs zzA;
    private final Executor zzd;
    private final zzdoq zze;
    private final zzdoy zzf;
    private final zzdpq zzg;
    private final zzdov zzh;
    private final zzdpb zzi;
    private final zzgxc zzj;
    private final zzgxc zzk;
    private final zzgxc zzl;
    private final zzgxc zzm;
    private final zzgxc zzn;
    private zzdql zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzcec zzs;
    private final zzape zzt;
    private final zzcgv zzu;
    private final Context zzv;
    private final zzdon zzw;
    private final zzeoi zzx;
    private final Map zzy;
    private final List zzz;

    public zzdol(zzczd zzczdVar, Executor executor, zzdoq zzdoqVar, zzdoy zzdoyVar, zzdpq zzdpqVar, zzdov zzdovVar, zzdpb zzdpbVar, zzgxc zzgxcVar, zzgxc zzgxcVar2, zzgxc zzgxcVar3, zzgxc zzgxcVar4, zzgxc zzgxcVar5, zzcec zzcecVar, zzape zzapeVar, zzcgv zzcgvVar, Context context, zzdon zzdonVar, zzeoi zzeoiVar, zzbbs zzbbsVar) {
        super(zzczdVar);
        this.zzd = executor;
        this.zze = zzdoqVar;
        this.zzf = zzdoyVar;
        this.zzg = zzdpqVar;
        this.zzh = zzdovVar;
        this.zzi = zzdpbVar;
        this.zzj = zzgxcVar;
        this.zzk = zzgxcVar2;
        this.zzl = zzgxcVar3;
        this.zzm = zzgxcVar4;
        this.zzn = zzgxcVar5;
        this.zzs = zzcecVar;
        this.zzt = zzapeVar;
        this.zzu = zzcgvVar;
        this.zzv = context;
        this.zzw = zzdonVar;
        this.zzx = zzeoiVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
        this.zzA = zzbbsVar;
    }

    public static boolean zzP(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzio)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        long zzt = com.google.android.gms.ads.internal.util.zzs.zzt(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (zzt >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzip)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View zzR(Map map) {
        if (map == null) {
            return null;
        }
        zzfvn zzfvnVar = zzc;
        int size = zzfvnVar.size();
        int i = 0;
        while (i < size) {
            WeakReference weakReference = (WeakReference) map.get((String) zzfvnVar.get(i));
            i++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    private final synchronized void zzS(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzp(view, map, map2);
        this.zzq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzT, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzt(zzdql zzdqlVar) {
        Iterator<String> keys;
        View view;
        zzapa zzc2;
        if (this.zzp) {
            return;
        }
        this.zzo = zzdqlVar;
        this.zzg.zze(zzdqlVar);
        this.zzf.zzx(zzdqlVar.zzf(), zzdqlVar.zzm(), zzdqlVar.zzn(), zzdqlVar, zzdqlVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzch)).booleanValue() && (zzc2 = this.zzt.zzc()) != null) {
            zzc2.zzn(zzdqlVar.zzf());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzby)).booleanValue()) {
            zzfdk zzfdkVar = this.zzb;
            if (zzfdkVar.zzam && (keys = zzfdkVar.zzal.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                    this.zzy.put(next, false);
                    if (weakReference != null && (view = (View) weakReference.get()) != null) {
                        zzbbr zzbbrVar = new zzbbr(this.zzv, view);
                        this.zzz.add(zzbbrVar);
                        zzbbrVar.zzc(new zzdok(this, next));
                    }
                }
            }
        }
        if (zzdqlVar.zzi() != null) {
            zzdqlVar.zzi().zzc(this.zzs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public final void zzu(zzdql zzdqlVar) {
        this.zzf.zzy(zzdqlVar.zzf(), zzdqlVar.zzl());
        if (zzdqlVar.zzh() != null) {
            zzdqlVar.zzh().setClickable(false);
            zzdqlVar.zzh().removeAllViews();
        }
        if (zzdqlVar.zzi() != null) {
            zzdqlVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public final synchronized void zzA() {
        zzdql zzdqlVar = this.zzo;
        if (zzdqlVar == null) {
            com.google.android.gms.ads.internal.util.zze.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdqlVar instanceof zzdpk;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoh
                @Override // java.lang.Runnable
                public final void run() {
                    zzdol.this.zzs(z);
                }
            });
        }
    }

    public final synchronized void zzB() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzq();
    }

    public final void zzC(View view) {
        zzdoq zzdoqVar = this.zze;
        IObjectWrapper zzu = zzdoqVar.zzu();
        zzcmp zzq = zzdoqVar.zzq();
        if (!this.zzh.zzd() || zzu == null || zzq == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzc(zzu, view);
    }

    public final synchronized void zzD(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzr(view, motionEvent, view2);
    }

    public final synchronized void zzE(Bundle bundle) {
        this.zzf.zzs(bundle);
    }

    public final synchronized void zzF(View view) {
        this.zzf.zzt(view);
    }

    public final synchronized void zzG() {
        this.zzf.zzu();
    }

    public final synchronized void zzH(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        this.zzf.zzv(zzcqVar);
    }

    public final synchronized void zzI(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.zzx.zza(zzdeVar);
    }

    public final synchronized void zzJ(zzbny zzbnyVar) {
        this.zzf.zzw(zzbnyVar);
    }

    public final synchronized void zzK(final zzdql zzdqlVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbw)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoi
                @Override // java.lang.Runnable
                public final void run() {
                    zzdol.this.zzt(zzdqlVar);
                }
            });
        } else {
            zzt(zzdqlVar);
        }
    }

    public final synchronized void zzL(final zzdql zzdqlVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbw)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoe
                @Override // java.lang.Runnable
                public final void run() {
                    zzdol.this.zzu(zzdqlVar);
                }
            });
        } else {
            zzu(zzdqlVar);
        }
    }

    public final boolean zzM() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzN() {
        return this.zzf.zzz();
    }

    public final boolean zzO() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzQ(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzA = this.zzf.zzA(bundle);
        this.zzq = zzA;
        return zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcze
    public final synchronized void zzV() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoj
            @Override // java.lang.Runnable
            public final void run() {
                zzdol.this.zzr();
            }
        });
        super.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzcze
    public final void zzW() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdof
            @Override // java.lang.Runnable
            public final void run() {
                zzdol.zzh(zzdol.this);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdoy zzdoyVar = this.zzf;
            zzdoyVar.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdog
                @Override // java.lang.Runnable
                public final void run() {
                    zzdoy.this.zzo();
                }
            });
        }
        super.zzW();
    }

    public final zzdon zza() {
        return this.zzw;
    }

    public final String zzd() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzf(View view, Map map, Map map2) {
        return this.zzf.zzd(view, map, map2);
    }

    public final synchronized JSONObject zzg(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2);
    }

    public final void zzi(View view) {
        IObjectWrapper zzu = this.zze.zzu();
        if (!this.zzh.zzd() || zzu == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeg)).booleanValue() && zzfkp.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(zzu);
            if (unwrap instanceof zzfkr) {
                ((zzfkr) unwrap).zzb(view, zzfkx.NOT_VISIBLE, "Ad overlay");
            }
        }
    }

    public final synchronized void zzk() {
        this.zzf.zzg();
    }

    public final void zzq(String str, boolean z) {
        String str2;
        zzeha zzehaVar;
        zzehb zzehbVar;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return;
        }
        zzdoq zzdoqVar = this.zze;
        zzcmp zzq = zzdoqVar.zzq();
        zzcmp zzr = zzdoqVar.zzr();
        if (zzq == null && zzr == null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Omid display and video webview are null. Skipping initialization.");
            return;
        }
        boolean z2 = false;
        boolean z3 = zzq != null;
        boolean z4 = zzr != null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzek)).booleanValue()) {
            this.zzh.zza();
            int zzb = this.zzh.zza().zzb();
            int i = zzb - 1;
            if (i != 0) {
                if (i != 1) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Unknown omid media type: " + (zzb != 1 ? zzb != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                    return;
                }
                if (zzq == null) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Omid media type was display but there was no display webview.");
                    return;
                } else {
                    z4 = false;
                    z2 = true;
                }
            } else {
                if (zzr == null) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Omid media type was video but there was no video webview.");
                    return;
                }
                z4 = true;
            }
        } else {
            z2 = z3;
        }
        if (z2) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzq = zzr;
        }
        String str3 = str2;
        zzq.zzI();
        if (!com.google.android.gms.ads.internal.zzt.zzA().zze(this.zzv)) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to initialize omid in InternalNativeAd");
            return;
        }
        zzcgv zzcgvVar = this.zzu;
        String str4 = zzcgvVar.zzb + "." + zzcgvVar.zzc;
        if (z4) {
            zzehaVar = zzeha.VIDEO;
            zzehbVar = zzehb.DEFINED_BY_JAVASCRIPT;
        } else {
            zzehaVar = zzeha.NATIVE_DISPLAY;
            zzehbVar = this.zze.zzc() == 3 ? zzehb.UNSPECIFIED : zzehb.ONE_PIXEL;
        }
        IObjectWrapper zzb2 = com.google.android.gms.ads.internal.zzt.zzA().zzb(str4, zzq.zzI(), "", "javascript", str3, str, zzehbVar, zzehaVar, this.zzb.zzan);
        if (zzb2 == null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to create omid session in InternalNativeAd");
            return;
        }
        this.zze.zzaa(zzb2);
        zzq.zzar(zzb2);
        if (z4) {
            com.google.android.gms.ads.internal.zzt.zzA().zzc(zzb2, zzr.zzH());
            this.zzr = true;
        }
        if (z) {
            com.google.android.gms.ads.internal.zzt.zzA().zzd(zzb2);
            zzq.zzd("onSdkLoaded", new ArrayMap());
        }
    }

    final /* synthetic */ void zzr() {
        this.zzf.zzh();
        this.zze.zzG();
    }

    final /* synthetic */ void zzs(boolean z) {
        this.zzf.zzn(this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z);
    }

    public final synchronized void zzv(View view, Map map, Map map2, boolean z) {
        if (this.zzq) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzby)).booleanValue() && this.zzb.zzam) {
            Iterator it = this.zzy.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) this.zzy.get((String) it.next())).booleanValue()) {
                    return;
                }
            }
        }
        if (!z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcZ)).booleanValue() && map != null) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                    if (view2 != null && zzP(view2)) {
                        zzS(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        View zzR = zzR(map);
        if (zzR == null) {
            zzS(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzda)).booleanValue()) {
            if (zzP(zzR)) {
                zzS(view, map, map2);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdb)).booleanValue()) {
            zzS(view, map, map2);
            return;
        }
        Rect rect = new Rect();
        if (zzR.getGlobalVisibleRect(rect, null) && zzR.getHeight() == rect.height() && zzR.getWidth() == rect.width()) {
            zzS(view, map, map2);
        }
    }

    public final synchronized void zzw(com.google.android.gms.ads.internal.client.zzcu zzcuVar) {
        this.zzf.zzi(zzcuVar);
    }

    public final synchronized void zzx(View view, View view2, Map map, Map map2, boolean z) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzj(view, view2, map, map2, z);
        if (this.zzr) {
            zzdoq zzdoqVar = this.zze;
            if (zzdoqVar.zzr() != null) {
                zzdoqVar.zzr().zzd("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    public final synchronized void zzy(String str) {
        this.zzf.zzk(str);
    }

    public final synchronized void zzz(Bundle bundle) {
        this.zzf.zzl(bundle);
    }

    public static /* synthetic */ void zzh(zzdol zzdolVar) {
        try {
            zzdoq zzdoqVar = zzdolVar.zze;
            int zzc2 = zzdoqVar.zzc();
            if (zzc2 == 1) {
                if (zzdolVar.zzi.zzb() != null) {
                    zzdolVar.zzq("Google", true);
                    zzdolVar.zzi.zzb().zze((zzbmv) zzdolVar.zzj.zzb());
                    return;
                }
                return;
            }
            if (zzc2 == 2) {
                if (zzdolVar.zzi.zza() != null) {
                    zzdolVar.zzq("Google", true);
                    zzdolVar.zzi.zza().zze((zzbmt) zzdolVar.zzk.zzb());
                    return;
                }
                return;
            }
            if (zzc2 == 3) {
                if (zzdolVar.zzi.zzd(zzdoqVar.zzy()) != null) {
                    if (zzdolVar.zze.zzr() != null) {
                        zzdolVar.zzq("Google", true);
                    }
                    zzdolVar.zzi.zzd(zzdolVar.zze.zzy()).zze((zzbmy) zzdolVar.zzn.zzb());
                    return;
                }
                return;
            }
            if (zzc2 == 6) {
                if (zzdolVar.zzi.zzf() != null) {
                    zzdolVar.zzq("Google", true);
                    zzdolVar.zzi.zzf().zze((zzbob) zzdolVar.zzl.zzb());
                    return;
                }
                return;
            }
            if (zzc2 != 7) {
                com.google.android.gms.ads.internal.util.zze.zzg("Wrong native template id!");
                return;
            }
            zzdpb zzdpbVar = zzdolVar.zzi;
            if (zzdpbVar.zzg() != null) {
                zzdpbVar.zzg().zzg((zzbsf) zzdolVar.zzm.zzb());
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }
}
