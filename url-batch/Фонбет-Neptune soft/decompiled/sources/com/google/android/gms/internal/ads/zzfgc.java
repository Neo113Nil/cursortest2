package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfgc {
    private static zzfgc zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcl zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfgc(Context context, com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzb = context;
        this.zzc = zzclVar;
    }

    static com.google.android.gms.ads.internal.client.zzcl zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzfgc zzd(Context context) {
        synchronized (zzfgc.class) {
            zzfgc zzfgcVar = zza;
            if (zzfgcVar != null) {
                return zzfgcVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbdt.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcl zzclVar = null;
            if (longValue > 0 && longValue <= 242402501) {
                zzclVar = zza(applicationContext);
            }
            zzfgc zzfgcVar2 = new zzfgc(applicationContext, zzclVar);
            zza = zzfgcVar2;
            return zzfgcVar2;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzen zzg() {
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        if (zzclVar != null) {
            try {
                return zzclVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbom zzb() {
        return (zzbom) this.zzd.get();
    }

    public final VersionInfoParcel zzc(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.client.zzen zzg;
        com.google.android.gms.ads.internal.zzu.zzp();
        boolean zzE = com.google.android.gms.ads.internal.util.zzt.zzE(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(242402000, i2, true, zzE);
        return (((Boolean) zzbdt.zzc.zze()).booleanValue() && (zzg = zzg()) != null) ? new VersionInfoParcel(242402000, zzg.zza(), true, zzE) : versionInfoParcel;
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzen zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(zzbom zzbomVar) {
        zzbom adapterCreator;
        if (!((Boolean) zzbdt.zza.zze()).booleanValue()) {
            zzfgb.zza(this.zzd, null, zzbomVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        if (zzclVar != null) {
            try {
                adapterCreator = zzclVar.getAdapterCreator();
            } catch (RemoteException unused) {
            }
            AtomicReference atomicReference = this.zzd;
            if (adapterCreator != null) {
                zzbomVar = adapterCreator;
            }
            zzfgb.zza(atomicReference, null, zzbomVar);
        }
        adapterCreator = null;
        AtomicReference atomicReference2 = this.zzd;
        if (adapterCreator != null) {
        }
        zzfgb.zza(atomicReference2, null, zzbomVar);
    }
}
