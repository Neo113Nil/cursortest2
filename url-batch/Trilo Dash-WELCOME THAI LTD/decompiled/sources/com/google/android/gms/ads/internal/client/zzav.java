package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbjw;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
abstract class zzav {
    private static final zzcc zza;

    static {
        zzcc zzccVar = null;
        try {
            Object newInstance = zzau.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzccVar = queryLocalInterface instanceof zzcc ? (zzcc) queryLocalInterface : new zzca(iBinder);
                }
            } else {
                zzcfi.zzj("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            zzcfi.zzj("Failed to instantiate ClientApi class.");
        }
        zza = zzccVar;
    }

    zzav() {
    }

    private final Object zze() {
        zzcc zzccVar = zza;
        if (zzccVar == null) {
            zzcfi.zzj("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zzb(zzccVar);
        } catch (RemoteException e) {
            zzcfi.zzk("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final Object zzf() {
        try {
            return zzc();
        } catch (RemoteException e) {
            zzcfi.zzk("Cannot invoke remote loader.", e);
            return null;
        }
    }

    protected abstract Object zza();

    protected abstract Object zzb(zzcc zzccVar) throws RemoteException;

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
            zzaw.zzb();
            if (!zzcfb.zzq(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzcfi.zze("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = z | (!(DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID)));
        zzbhy.zzc(context);
        if (!((Boolean) zzbjj.zza.zze()).booleanValue()) {
            if (((Boolean) zzbjj.zzb.zze()).booleanValue()) {
                z2 = true;
                z3 = true;
                if (z3) {
                    Object zzf = zzf();
                    if (zzf == null) {
                        if (zzaw.zze().nextInt(((Long) zzbjw.zza.zze()).intValue()) == 0) {
                            Bundle bundle = new Bundle();
                            bundle.putString("action", "dynamite_load");
                            bundle.putInt("is_missing", 1);
                            zzaw.zzb().zzl(context, zzaw.zzc().zza, "gmob-apps", bundle, true);
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
            z3 = z4;
        }
        z2 = false;
        if (z3) {
        }
        if (zze != null) {
        }
    }
}
