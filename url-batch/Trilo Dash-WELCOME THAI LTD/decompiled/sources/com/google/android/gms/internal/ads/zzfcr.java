package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfcr {
    private static zzfcr zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcj zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfcr(Context context, com.google.android.gms.ads.internal.client.zzcj zzcjVar) {
        this.zzb = context;
        this.zzc = zzcjVar;
    }

    static com.google.android.gms.ads.internal.client.zzcj zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzci.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            com.google.android.gms.ads.internal.util.zze.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzfcr zzd(Context context) {
        synchronized (zzfcr.class) {
            zzfcr zzfcrVar = zza;
            if (zzfcrVar != null) {
                return zzfcrVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbjq.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcj zzcjVar = null;
            if (longValue > 0 && longValue <= 221310600) {
                zzcjVar = zza(applicationContext);
            }
            zzfcr zzfcrVar2 = new zzfcr(applicationContext, zzcjVar);
            zza = zzfcrVar2;
            return zzfcrVar2;
        }
    }

    public final zzbtz zzb() {
        return (zzbtz) this.zzd.get();
    }

    public final zzcfo zzc(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.zzb);
        zzcfo zzcfoVar = new zzcfo(221310000, i2, true, zzA);
        if (!((Boolean) zzbjq.zzc.zze()).booleanValue()) {
            return zzcfoVar;
        }
        com.google.android.gms.ads.internal.client.zzcj zzcjVar = this.zzc;
        com.google.android.gms.ads.internal.client.zzei zzeiVar = null;
        if (zzcjVar != null) {
            try {
                zzeiVar = zzcjVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return zzeiVar == null ? zzcfoVar : new zzcfo(221310000, zzeiVar.zza(), true, zzA);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(zzbtz zzbtzVar) {
        zzbtz adapterCreator;
        if (!((Boolean) zzbjq.zza.zze()).booleanValue()) {
            zzfcq.zza(this.zzd, null, zzbtzVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcj zzcjVar = this.zzc;
        if (zzcjVar != null) {
            try {
                adapterCreator = zzcjVar.getAdapterCreator();
            } catch (RemoteException unused) {
            }
            AtomicReference atomicReference = this.zzd;
            if (adapterCreator != null) {
                zzbtzVar = adapterCreator;
            }
            zzfcq.zza(atomicReference, null, zzbtzVar);
        }
        adapterCreator = null;
        AtomicReference atomicReference2 = this.zzd;
        if (adapterCreator != null) {
        }
        zzfcq.zza(atomicReference2, null, zzbtzVar);
    }
}
