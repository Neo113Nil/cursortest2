package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzefw extends zzefx {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzdcg zzd;
    private final TelephonyManager zze;
    private final zzefo zzf;
    private int zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbhc.CONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzbhc.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbhc.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbhc.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbhc.DISCONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzbhc.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbhc.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbhc.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbhc.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbhc.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbhc.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbhc.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbhc.CONNECTING);
    }

    zzefw(Context context, zzdcg zzdcgVar, zzefo zzefoVar, zzefk zzefkVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzefkVar, zzgVar);
        this.zzc = context;
        this.zzd = zzdcgVar;
        this.zzf = zzefoVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ zzbgt zza(zzefw zzefwVar, Bundle bundle) {
        zzbgm zza = zzbgt.zza();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            zzefwVar.zzg = 2;
        } else {
            zzefwVar.zzg = 1;
            if (i == 0) {
                zza.zzb(2);
            } else if (i != 1) {
                zza.zzb(1);
            } else {
                zza.zzb(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            zza.zza(i3);
        }
        return (zzbgt) zza.zzam();
    }

    static /* bridge */ /* synthetic */ zzbhc zzb(zzefw zzefwVar, Bundle bundle) {
        return (zzbhc) zzb.get(zzfeq.zza(zzfeq.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbhc.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] zze(zzefw zzefwVar, boolean z, ArrayList arrayList, zzbgt zzbgtVar, zzbhc zzbhcVar) {
        zzbgx zzg = zzbgy.zzg();
        zzg.zza(arrayList);
        zzg.zzi(zzg(Settings.Global.getInt(zzefwVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzg.zzj(com.google.android.gms.ads.internal.zzt.zzq().zzh(zzefwVar.zzc, zzefwVar.zze));
        zzg.zzf(zzefwVar.zzf.zze());
        zzg.zze(zzefwVar.zzf.zzb());
        zzg.zzb(zzefwVar.zzf.zza());
        zzg.zzc(zzbhcVar);
        zzg.zzd(zzbgtVar);
        zzg.zzk(zzefwVar.zzg);
        zzg.zzl(zzg(z));
        zzg.zzh(zzefwVar.zzf.zzd());
        zzg.zzg(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
        zzg.zzm(zzg(Settings.Global.getInt(zzefwVar.zzc.getContentResolver(), "wifi_on", 0) != 0));
        return ((zzbgy) zzg.zzam()).zzax();
    }

    private static final int zzg(boolean z) {
        return z ? 2 : 1;
    }

    public final void zzd(boolean z) {
        zzfzg.zzr(this.zzd.zzb(), new zzefv(this, z), zzchc.zzf);
    }
}
