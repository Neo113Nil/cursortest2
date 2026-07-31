package com.google.android.gms.internal.ads;

import android.content.Context;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public abstract class zzcgv implements zzckv {

    @Nullable
    private static zzcgv zza;

    private static synchronized zzcgv zzF(Context context, @Nullable zzbox zzboxVar, int i, boolean z, int i2, zzcid zzcidVar) {
        synchronized (zzcgv.class) {
            zzcgv zzcgvVar = zza;
            if (zzcgvVar != null) {
                return zzcgvVar;
            }
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzbci.zza(context);
            if (((Boolean) zzbea.zze.zze()).booleanValue()) {
                zzbbt.zza(context);
            }
            zzfdy zza2 = zzfdy.zza(context);
            VersionInfoParcel zzb = zza2.zzb(ModuleDescriptor.MODULE_VERSION, false, i2);
            zza2.zzc(zzboxVar);
            zzcis zzcisVar = new zzcis(null);
            zzcgw zzcgwVar = new zzcgw();
            zzcgwVar.zza(zzb);
            zzcgwVar.zzb(context);
            zzcgwVar.zzc(currentTimeMillis);
            zzcisVar.zza(new zzcgx(zzcgwVar, null));
            zzcisVar.zzb(new zzcjl(zzcidVar));
            zzcgv zzc = zzcisVar.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzot)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zze().zza(zzfgc.zzc(), zzc.zzB());
                com.google.android.gms.ads.internal.zzt.zze().zzb();
            }
            ((zzdwx) ((zzcih) zzc).zzo.zzb()).zza();
            ((zzcgr) ((zzcih) zzc).zzn.zzb()).zza();
            com.google.android.gms.ads.internal.zzt.zzh().zze(context, zzb, zzc.zzB());
            com.google.android.gms.ads.internal.zzt.zzj().zza(context);
            com.google.android.gms.ads.internal.zzt.zzc().zzc(context);
            com.google.android.gms.ads.internal.zzt.zzc().zzd(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzt.zzg().zza(context);
            com.google.android.gms.ads.internal.zzt.zzA().zza(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoJ)).booleanValue()) {
                String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoK);
                if (!str.isEmpty()) {
                    if (Arrays.asList(str.split(f.f598a)).contains(context.getPackageName())) {
                        zzc.zzC().zza(com.google.android.gms.ads.internal.zzt.zzg());
                    }
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoI)).booleanValue()) {
                    zzc.zzC().zza(com.google.android.gms.ads.internal.zzt.zzg());
                }
            }
            ((com.google.android.gms.ads.internal.util.zzbz) ((zzcih) zzc).zzan.zzb()).zza();
            zzbxs.zzb(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgF)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaN)).booleanValue()) {
                    new zzecb(context, zzb, new zzbbh(new zzbbm(context)), new zzebg(new zzebc(context), (zzgpd) ((zzcih) zzc).zzd.zzb())).zza(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                }
            }
            zza = zzc;
            return zzc;
        }
    }

    public static zzcgv zza(Context context, @Nullable zzbox zzboxVar, int i) {
        return zzF(context, zzboxVar, ModuleDescriptor.MODULE_VERSION, false, i, new zzcid());
    }

    public abstract zzdwp zzA();

    public abstract zzdsm zzB();

    abstract zzdpu zzC();

    @Override // com.google.android.gms.internal.ads.zzckv
    public final zzbyl zzD() {
        return zzE();
    }

    public abstract zzbyl zzE();

    public abstract Executor zzb();

    public abstract ScheduledExecutorService zzc();

    public abstract zzcyt zzd();

    public abstract zzcjw zze();

    public abstract zzfki zzf();

    public abstract zzcpo zzg();

    public abstract zzeyz zzh();

    public abstract zzcnx zzi();

    public abstract zzexm zzj();

    public abstract zzdgg zzk();

    public abstract zzfap zzl();

    public abstract zzdhc zzm();

    public abstract zzdoq zzn();

    public abstract zzfcc zzo();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzab zzp();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzau zzq();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzv zzr();

    public abstract zzecy zzs();

    public abstract zzfeb zzt();

    public abstract zzdvs zzu();

    public abstract zzfie zzv();

    @Override // com.google.android.gms.internal.ads.zzckv
    public final zzevr zzw(zzbuv zzbuvVar, int i) {
        return zzx(new zzewu(zzbuvVar, i));
    }

    protected abstract zzevr zzx(zzewu zzewuVar);

    public abstract zzdud zzy();

    public abstract zzfds zzz();
}
