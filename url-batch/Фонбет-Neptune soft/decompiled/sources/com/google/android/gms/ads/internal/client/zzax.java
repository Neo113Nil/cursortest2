package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdn;
import com.google.android.gms.internal.ads.zzbeb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
abstract class zzax {
    private static final zzce zza;

    static {
        zzce zzceVar = null;
        try {
            Object newInstance = zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzceVar = queryLocalInterface instanceof zzce ? (zzce) queryLocalInterface : new zzcc(iBinder);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to instantiate ClientApi class.");
        }
        zza = zzceVar;
    }

    zzax() {
    }

    private final Object zze() {
        zzce zzceVar = zza;
        if (zzceVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zzb(zzceVar);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final Object zzf() {
        try {
            return zzc();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke remote loader.", e);
            return null;
        }
    }

    protected abstract Object zza();

    protected abstract Object zzb(zzce zzceVar) throws RemoteException;

    protected abstract Object zzc() throws RemoteException;

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd(Context context, boolean z) {
        boolean z2;
        Object zze;
        if (!z) {
            zzay.zzb();
            if (!com.google.android.gms.ads.internal.util.client.zzf.zzt(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = !(DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
        zzbbw.zza(context);
        if (!((Boolean) zzbdn.zza.zze()).booleanValue()) {
            if (((Boolean) zzbdn.zzb.zze()).booleanValue()) {
                z2 = true;
                z3 = true;
                if (z3) {
                    Object zzf = zzf();
                    if (zzf == null) {
                        if (zzay.zze().nextInt(((Long) zzbeb.zza.zze()).intValue()) == 0) {
                            Bundle bundle = new Bundle();
                            bundle.putString("action", "dynamite_load");
                            bundle.putInt("is_missing", 1);
                            zzay.zzb().zzo(context, zzay.zzc().afmaVersion, "gmob-apps", bundle, true);
                        }
                    }
                    zze = zzf == null ? zze() : zzf;
                } else {
                    zze = zze();
                    if (zze == null && !z2) {
                        zze = zzf();
                    }
                }
                return zze != null ? zza() : zze;
            }
            z3 = z | z4;
        }
        z2 = false;
        if (z3) {
        }
        if (zze != null) {
        }
    }
}
