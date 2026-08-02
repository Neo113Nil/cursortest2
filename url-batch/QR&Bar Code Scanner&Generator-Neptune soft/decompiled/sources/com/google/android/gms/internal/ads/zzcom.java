package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzcom implements zzctt {

    @Nullable
    private static zzcom zza;

    private static synchronized zzcom zzC(Context context, @Nullable zzbvk zzbvkVar, int i, boolean z, int i2, zzcpo zzcpoVar) {
        synchronized (zzcom.class) {
            zzcom zzcomVar = zza;
            if (zzcomVar != null) {
                return zzcomVar;
            }
            zzbjc.zzc(context);
            zzfey zzd = zzfey.zzd(context);
            zzcgv zzc = zzd.zzc(223104000, false, i2);
            zzd.zze(zzbvkVar);
            zzcqy zzcqyVar = new zzcqy(null);
            zzcon zzconVar = new zzcon();
            zzconVar.zzd(zzc);
            zzconVar.zzc(context);
            zzcqyVar.zzb(new zzcop(zzconVar, null));
            zzcqyVar.zzc(new zzcsl(zzcpoVar, null));
            zzcom zza2 = zzcqyVar.zza();
            com.google.android.gms.ads.internal.zzt.zzo().zzr(context, zzc);
            com.google.android.gms.ads.internal.zzt.zzc().zzi(context);
            com.google.android.gms.ads.internal.zzt.zzp().zzj(context);
            com.google.android.gms.ads.internal.zzt.zzp().zzi(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzt.zzb().zzd(context);
            com.google.android.gms.ads.internal.zzt.zzv().zzb(context);
            zzcev.zzd(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfm)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzas)).booleanValue()) {
                    zzbep zzbepVar = new zzbep(new zzbev(context));
                    zzefk zzefkVar = new zzefk(new zzefg(context), zza2.zzz());
                    com.google.android.gms.ads.internal.zzt.zzp();
                    new zzegg(context, zzc, zzbepVar, zzefkVar, UUID.randomUUID().toString(), zza2.zzx()).zzb(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzcom zza(Context context, @Nullable zzbvk zzbvkVar, int i) {
        return zzC(context, zzbvkVar, 223104000, false, i, new zzcpo());
    }

    public abstract Executor zzA();

    public abstract ScheduledExecutorService zzB();

    public abstract zzcsw zzb();

    public abstract zzcwe zzc();

    public abstract zzcwp zzd();

    public abstract zzcxy zze();

    public abstract zzdfp zzf();

    public abstract zzdmg zzg();

    public abstract zzdnc zzh();

    public abstract zzdug zzi();

    public abstract zzdyy zzj();

    public abstract zzeak zzk();

    public abstract zzegw zzl();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzc zzm();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzg zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzaa zzo();

    @Override // com.google.android.gms.internal.ads.zzctt
    public final zzevw zzp(zzcbc zzcbcVar, int i) {
        return zzq(new zzexi(zzcbcVar, i));
    }

    protected abstract zzevw zzq(zzexi zzexiVar);

    public abstract zzeyi zzr();

    public abstract zzezw zzs();

    public abstract zzfbp zzt();

    public abstract zzfdd zzu();

    public abstract zzfer zzv();

    public abstract zzffb zzw();

    public abstract zzfir zzx();

    public abstract zzfjw zzy();

    public abstract zzfzq zzz();
}
