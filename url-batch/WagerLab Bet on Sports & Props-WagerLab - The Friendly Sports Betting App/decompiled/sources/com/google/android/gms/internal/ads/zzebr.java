package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzebr implements zzgoq {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzebs zzb;

    zzebr(zzebs zzebsVar, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzebsVar);
        this.zzb = zzebsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzgoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<String> emptyList;
        List asList;
        char c;
        zzebs zzebsVar = this.zzb;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (zzebsVar.zzf()) {
            return;
        }
        Bundle bundle = zzcuuVar.zza;
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            asList = (List) obj2;
        } else {
            if (!(obj2 instanceof String[])) {
                emptyList = Collections.emptyList();
                final ArrayList arrayList = new ArrayList();
                for (String str : emptyList) {
                    switch (str.hashCode()) {
                        case -1396342996:
                            if (str.equals("banner")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1052618729:
                            if (str.equals(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -239580146:
                            if (str.equals("rewarded")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 604727084:
                            if (str.equals("interstitial")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    arrayList.add(c != 0 ? c != 1 ? c != 2 ? c != 3 ? zzbbn.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzbbn.zzd.zza.REWARD_BASED_VIDEO_AD : zzbbn.zzd.zza.NATIVE_APP_INSTALL : zzbbn.zzd.zza.INTERSTITIAL : zzbbn.zzd.zza.BANNER);
                }
                final zzbbn.zzaf.zzd zze = zzebs.zze(bundle);
                final zzbbn.zzab zzb = zzebsVar.zzb(bundle);
                final boolean z = this.zza;
                zzebsVar.zza.zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzebq
                    @Override // com.google.android.gms.internal.ads.zzfgm
                    public final /* synthetic */ Object zza(Object obj3) {
                        zzebs zzebsVar2 = zzebr.this.zzb;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                        if (zzebsVar2.zzf()) {
                            return null;
                        }
                        zzbbn.zzaf.zzd zzdVar = zze;
                        zzbbn.zzab zzabVar = zzb;
                        ArrayList arrayList2 = arrayList;
                        boolean z2 = z;
                        byte[] zzc = zzebsVar2.zzc(z2, arrayList2, zzabVar, zzdVar);
                        zzebv.zzf(sQLiteDatabase, z2, true);
                        zzebv.zze(sQLiteDatabase, zzebsVar2.zzd().zzb(), zzc);
                        return null;
                    }
                });
            }
            asList = Arrays.asList((String[]) obj2);
        }
        ArrayList arrayList2 = new ArrayList(asList.size());
        for (Object obj3 : asList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        emptyList = Collections.unmodifiableList(arrayList2);
        final ArrayList arrayList3 = new ArrayList();
        while (r1.hasNext()) {
        }
        final zzbbn.zzaf.zzd zze2 = zzebs.zze(bundle);
        final zzbbn.zzab zzb2 = zzebsVar.zzb(bundle);
        final boolean z2 = this.zza;
        zzebsVar.zza.zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzebq
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj32) {
                zzebs zzebsVar2 = zzebr.this.zzb;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj32;
                if (zzebsVar2.zzf()) {
                    return null;
                }
                zzbbn.zzaf.zzd zzdVar = zze2;
                zzbbn.zzab zzabVar = zzb2;
                ArrayList arrayList22 = arrayList3;
                boolean z22 = z2;
                byte[] zzc = zzebsVar2.zzc(z22, arrayList22, zzabVar, zzdVar);
                zzebv.zzf(sQLiteDatabase, z22, true);
                zzebv.zze(sQLiteDatabase, zzebsVar2.zzd().zzb(), zzc);
                return null;
            }
        });
    }
}
