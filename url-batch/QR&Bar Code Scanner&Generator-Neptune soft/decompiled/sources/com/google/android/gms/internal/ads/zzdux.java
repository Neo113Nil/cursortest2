package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdux {
    private final zzdcy zza;
    private final zzdkl zzb;
    private final zzdeh zzc;
    private final zzdeu zzd;
    private final zzdfg zze;
    private final zzdht zzf;
    private final Executor zzg;
    private final zzdki zzh;
    private final zzcvk zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzcdq zzk;
    private final zzape zzl;
    private final zzdhk zzm;
    private final zzego zzn;
    private final zzfkm zzo;
    private final zzdxq zzp;
    private final zzfir zzq;

    public zzdux(zzdcy zzdcyVar, zzdeh zzdehVar, zzdeu zzdeuVar, zzdfg zzdfgVar, zzdht zzdhtVar, Executor executor, zzdki zzdkiVar, zzcvk zzcvkVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdq zzcdqVar, zzape zzapeVar, zzdhk zzdhkVar, zzego zzegoVar, zzfkm zzfkmVar, zzdxq zzdxqVar, zzfir zzfirVar, zzdkl zzdklVar) {
        this.zza = zzdcyVar;
        this.zzc = zzdehVar;
        this.zzd = zzdeuVar;
        this.zze = zzdfgVar;
        this.zzf = zzdhtVar;
        this.zzg = executor;
        this.zzh = zzdkiVar;
        this.zzi = zzcvkVar;
        this.zzj = zzbVar;
        this.zzk = zzcdqVar;
        this.zzl = zzapeVar;
        this.zzm = zzdhkVar;
        this.zzn = zzegoVar;
        this.zzo = zzfkmVar;
        this.zzp = zzdxqVar;
        this.zzq = zzfirVar;
        this.zzb = zzdklVar;
    }

    public static final zzfzp zzj(zzcmp zzcmpVar, String str, String str2) {
        final zzchh zzchhVar = new zzchh();
        zzcmpVar.zzP().zzz(new zzcoa() { // from class: com.google.android.gms.internal.ads.zzduv
            @Override // com.google.android.gms.internal.ads.zzcoa
            public final void zza(boolean z) {
                zzchh zzchhVar2 = zzchh.this;
                if (z) {
                    zzchhVar2.zzd(null);
                } else {
                    zzchhVar2.zze(new Exception("Ad Web View failed to load."));
                }
            }
        });
        zzcmpVar.zzad(str, str2, null);
        return zzchhVar;
    }

    final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzbD(str, str2);
    }

    final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    final /* synthetic */ void zzg(zzcmp zzcmpVar, zzcmp zzcmpVar2, Map map) {
        this.zzi.zzh(zzcmpVar);
    }

    final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi(final zzcmp zzcmpVar, boolean z, zzbpx zzbpxVar) {
        zzapa zzc;
        zzcmpVar.zzP().zzL(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzduo
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                zzdux.this.zzc();
            }
        }, this.zzd, this.zze, new zzbor() { // from class: com.google.android.gms.internal.ads.zzdup
            @Override // com.google.android.gms.internal.ads.zzbor
            public final void zzbD(String str, String str2) {
                zzdux.this.zzd(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzduq
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzdux.this.zze();
            }
        }, z, zzbpxVar, this.zzj, new zzduw(this), this.zzk, this.zzn, this.zzo, this.zzp, this.zzq, null, this.zzb, null, null);
        zzcmpVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdur
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zzdux.this.zzh(view, motionEvent);
                return false;
            }
        });
        zzcmpVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdus
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzdux.this.zzf(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzch)).booleanValue() && (zzc = this.zzl.zzc()) != null) {
            zzc.zzn((View) zzcmpVar);
        }
        this.zzh.zzj(zzcmpVar, this.zzg);
        this.zzh.zzj(new zzbbq() { // from class: com.google.android.gms.internal.ads.zzdut
            @Override // com.google.android.gms.internal.ads.zzbbq
            public final void zzc(zzbbp zzbbpVar) {
                zzcmp.this.zzP().zzo(zzbbpVar.zzd.left, zzbbpVar.zzd.top, false);
            }
        }, this.zzg);
        this.zzh.zza((View) zzcmpVar);
        zzcmpVar.zzaf("/trackActiveViewUnit", new zzbpu() { // from class: com.google.android.gms.internal.ads.zzduu
            @Override // com.google.android.gms.internal.ads.zzbpu
            public final void zza(Object obj, Map map) {
                zzdux.this.zzg(zzcmpVar, (zzcmp) obj, map);
            }
        });
        this.zzi.zzi(zzcmpVar);
    }
}
