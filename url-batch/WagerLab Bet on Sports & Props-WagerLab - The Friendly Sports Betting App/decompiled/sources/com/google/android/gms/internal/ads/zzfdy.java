package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfdy {
    private static zzfdy zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcy zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfdy(Context context, com.google.android.gms.ads.internal.client.zzcy zzcyVar) {
        this.zzb = context;
        this.zzc = zzcyVar;
    }

    public static zzfdy zza(Context context) {
        synchronized (zzfdy.class) {
            zzfdy zzfdyVar = zza;
            if (zzfdyVar != null) {
                return zzfdyVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbej.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = null;
            if (longValue > 0 && longValue <= 253410000) {
                zzcyVar = zzf(applicationContext);
            }
            zzfdy zzfdyVar2 = new zzfdy(applicationContext, zzcyVar);
            zza = zzfdyVar2;
            return zzfdyVar2;
        }
    }

    static com.google.android.gms.ads.internal.client.zzcy zzf(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzcx.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzfc zzg() {
        com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzc;
        if (zzcyVar != null) {
            try {
                return zzcyVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final VersionInfoParcel zzb(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.client.zzfc zzg;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzI = com.google.android.gms.ads.internal.util.zzs.zzI(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i2, true, zzI);
        return (((Boolean) zzbej.zzc.zze()).booleanValue() && (zzg = zzg()) != null) ? new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, zzg.zza(), true, zzI) : versionInfoParcel;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(zzbox zzboxVar) {
        zzbox adapterCreator;
        if (!((Boolean) zzbej.zza.zze()).booleanValue()) {
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.zzd, null, zzboxVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzc;
        if (zzcyVar != null) {
            try {
                adapterCreator = zzcyVar.getAdapterCreator();
            } catch (RemoteException unused) {
            }
            AtomicReference atomicReference = this.zzd;
            if (adapterCreator != null) {
                zzboxVar = adapterCreator;
            }
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, zzboxVar);
        }
        adapterCreator = null;
        AtomicReference atomicReference2 = this.zzd;
        if (adapterCreator != null) {
        }
        MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, null, zzboxVar);
    }

    public final zzbox zzd() {
        return (zzbox) this.zzd.get();
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzfc zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }
}
