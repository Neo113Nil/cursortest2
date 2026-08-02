package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfey {
    private static zzfey zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcj zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfey(Context context, com.google.android.gms.ads.internal.client.zzcj zzcjVar) {
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

    public static zzfey zzd(Context context) {
        synchronized (zzfey.class) {
            zzfey zzfeyVar = zza;
            if (zzfeyVar != null) {
                return zzfeyVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbku.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcj zzcjVar = null;
            if (longValue > 0 && longValue <= 223104600) {
                zzcjVar = zza(applicationContext);
            }
            zzfey zzfeyVar2 = new zzfey(applicationContext, zzcjVar);
            zza = zzfeyVar2;
            return zzfeyVar2;
        }
    }

    public final zzbvk zzb() {
        return (zzbvk) this.zzd.get();
    }

    public final zzcgv zzc(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.zzb);
        zzcgv zzcgvVar = new zzcgv(223104000, i2, true, zzA);
        if (!((Boolean) zzbku.zzc.zze()).booleanValue()) {
            return zzcgvVar;
        }
        com.google.android.gms.ads.internal.client.zzcj zzcjVar = this.zzc;
        com.google.android.gms.ads.internal.client.zzeh zzehVar = null;
        if (zzcjVar != null) {
            try {
                zzehVar = zzcjVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return zzehVar == null ? zzcgvVar : new zzcgv(223104000, zzehVar.zza(), true, zzA);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(zzbvk zzbvkVar) {
        zzbvk adapterCreator;
        if (!((Boolean) zzbku.zza.zze()).booleanValue()) {
            zzfex.zza(this.zzd, null, zzbvkVar);
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
                zzbvkVar = adapterCreator;
            }
            zzfex.zza(atomicReference, null, zzbvkVar);
        }
        adapterCreator = null;
        AtomicReference atomicReference2 = this.zzd;
        if (adapterCreator != null) {
        }
        zzfex.zza(atomicReference2, null, zzbvkVar);
    }
}
