package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcxf extends zzcxc {
    private final Context zzc;
    private final View zzd;
    private final zzcmp zze;
    private final zzfdl zzf;
    private final zzczc zzg;
    private final zzdpb zzh;
    private final zzdkp zzi;
    private final zzgxc zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzq zzl;

    zzcxf(zzczd zzczdVar, Context context, zzfdl zzfdlVar, View view, zzcmp zzcmpVar, zzczc zzczcVar, zzdpb zzdpbVar, zzdkp zzdkpVar, zzgxc zzgxcVar, Executor executor) {
        super(zzczdVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcmpVar;
        this.zzf = zzfdlVar;
        this.zzg = zzczcVar;
        this.zzh = zzdpbVar;
        this.zzi = zzdkpVar;
        this.zzj = zzgxcVar;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcxf zzcxfVar) {
        zzdpb zzdpbVar = zzcxfVar.zzh;
        if (zzdpbVar.zze() == null) {
            return;
        }
        try {
            zzdpbVar.zze().zze((com.google.android.gms.ads.internal.client.zzbs) zzcxfVar.zzj.zzb(), ObjectWrapper.wrap(zzcxfVar.zzc));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcze
    public final void zzW() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxe
            @Override // java.lang.Runnable
            public final void run() {
                zzcxf.zzi(zzcxf.this);
            }
        });
        super.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final int zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgJ)).booleanValue() && this.zzb.zzai) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgK)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final View zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final com.google.android.gms.ads.internal.client.zzdk zzd() {
        try {
            return this.zzg.zza();
        } catch (zzfek unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final zzfdl zze() {
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzl;
        if (zzqVar != null) {
            return zzfej.zzc(zzqVar);
        }
        zzfdk zzfdkVar = this.zzb;
        if (zzfdkVar.zzad) {
            for (String str : zzfdkVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new zzfdl(this.zzd.getWidth(), this.zzd.getHeight(), false);
        }
        return zzfej.zzb(this.zzb.zzs, this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final zzfdl zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzg() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzcmp zzcmpVar;
        if (viewGroup == null || (zzcmpVar = this.zze) == null) {
            return;
        }
        zzcmpVar.zzai(zzcoe.zzc(zzqVar));
        viewGroup.setMinimumHeight(zzqVar.zzc);
        viewGroup.setMinimumWidth(zzqVar.zzf);
        this.zzl = zzqVar;
    }
}
