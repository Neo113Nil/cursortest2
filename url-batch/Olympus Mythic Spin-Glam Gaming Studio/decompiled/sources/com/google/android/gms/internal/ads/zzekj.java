package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbil;
import com.safedk.android.analytics.brandsafety.m;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
public final class zzekj extends zzekk {
    private static final SparseArray zzg;
    private final Context zzb;
    private final zzdcu zzc;
    private final TelephonyManager zzd;
    private final zzekb zze;
    private zzbil.zzq zzf;

    static {
        SparseArray sparseArray = new SparseArray();
        zzg = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbil.zzaf.zzd.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbil.zzaf.zzd zzdVar = zzbil.zzaf.zzd.CONNECTING;
        sparseArray.put(ordinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbil.zzaf.zzd.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbil.zzaf.zzd zzdVar2 = zzbil.zzaf.zzd.DISCONNECTED;
        sparseArray.put(ordinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbil.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    zzekj(Context context, zzdcu zzdcuVar, zzekb zzekbVar, zzejx zzejxVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzejxVar, zzgVar);
        this.zzb = context;
        this.zzc = zzdcuVar;
        this.zze = zzekbVar;
        this.zzd = (TelephonyManager) context.getSystemService("phone");
    }

    static final /* synthetic */ zzbil.zzaf.zzd zze(Bundle bundle) {
        return (zzbil.zzaf.zzd) zzg.get(zzfml.zza(zzfml.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbil.zzaf.zzd.UNSPECIFIED);
    }

    private static final zzbil.zzq zzg(boolean z) {
        return z ? zzbil.zzq.ENUM_TRUE : zzbil.zzq.ENUM_FALSE;
    }

    public final void zza(boolean z) {
        zzhcy.zzr(this.zzc.zza(new Bundle()), new zzeki(this, z), zzcgj.zzh);
    }

    final /* synthetic */ zzbil.zzab zzb(Bundle bundle) {
        zzbil.zzab.zzb zzbVar;
        zzbil.zzab.zza zzq = zzbil.zzab.zzq();
        int i = bundle.getInt(m.R, -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.zzf = zzbil.zzq.ENUM_TRUE;
        } else {
            this.zzf = zzbil.zzq.ENUM_FALSE;
            if (i == 0) {
                zzq.zzc(zzbil.zzab.zzc.CELL);
            } else if (i != 1) {
                zzq.zzc(zzbil.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzq.zzc(zzbil.zzab.zzc.WIFI);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbil.zzab.zzb.TWO_G;
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
                    zzbVar = zzbil.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbil.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbil.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzq.zzg(zzbVar);
        }
        return zzq.zzbu();
    }

    final /* synthetic */ byte[] zzc(boolean z, ArrayList arrayList, zzbil.zzab zzabVar, zzbil.zzaf.zzd zzdVar) {
        zzbil.zzaf.zza.C0242zza zzz = zzbil.zzaf.zza.zzz();
        zzz.zzv(arrayList);
        Context context = this.zzb;
        zzz.zzJ(zzg(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzz.zzN(com.google.android.gms.ads.internal.zzt.zzf().zzd(context, this.zzd));
        zzekb zzekbVar = this.zze;
        zzz.zzk(zzekbVar.zzf());
        zzz.zzo(zzekbVar.zzj());
        zzz.zzR(zzekbVar.zzd());
        zzz.zzZ(zzdVar);
        zzz.zzz(zzabVar);
        zzz.zzV(this.zzf);
        zzz.zzg(zzg(z));
        zzz.zzad(zzekbVar.zzb());
        zzz.zzc(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        zzz.zzF(zzg(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0));
        return zzz.zzbu().zzaN();
    }

    final /* synthetic */ zzekb zzd() {
        return this.zze;
    }
}
