package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzefv implements zzfzc {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzefw zzb;

    zzefv(zzefw zzefwVar, boolean z) {
        this.zzb = zzefwVar;
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.zze.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    @Override // com.google.android.gms.internal.ads.zzfzc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<String> emptyList;
        List asList;
        char c;
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzf()) {
            return;
        }
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
                            if (str.equals("native")) {
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
                    arrayList.add(c != 0 ? c != 1 ? c != 2 ? c != 3 ? zzbfn.AD_FORMAT_TYPE_UNSPECIFIED : zzbfn.REWARD_BASED_VIDEO_AD : zzbfn.NATIVE_APP_INSTALL : zzbfn.INTERSTITIAL : zzbfn.BANNER);
                }
                final zzbhc zzb = zzefw.zzb(this.zzb, bundle);
                final zzbgt zza = zzefw.zza(this.zzb, bundle);
                zzefk zzefkVar = this.zzb.zza;
                final boolean z = this.zza;
                zzefkVar.zza(new zzfhk() { // from class: com.google.android.gms.internal.ads.zzefu
                    @Override // com.google.android.gms.internal.ads.zzfhk
                    public final Object zza(Object obj3) {
                        zzefo zzefoVar;
                        zzefv zzefvVar = zzefv.this;
                        boolean z2 = z;
                        ArrayList arrayList2 = arrayList;
                        zzbgt zzbgtVar = zza;
                        zzbhc zzbhcVar = zzb;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                        if (zzefvVar.zzb.zzf()) {
                            return null;
                        }
                        byte[] zze = zzefw.zze(zzefvVar.zzb, z2, arrayList2, zzbgtVar, zzbhcVar);
                        zzefz.zzg(sQLiteDatabase, z2, true);
                        zzefoVar = zzefvVar.zzb.zzf;
                        zzefz.zzd(sQLiteDatabase, zzefoVar.zzd(), zze);
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
        while (r0.hasNext()) {
        }
        final zzbhc zzb2 = zzefw.zzb(this.zzb, bundle);
        final zzbgt zza2 = zzefw.zza(this.zzb, bundle);
        zzefk zzefkVar2 = this.zzb.zza;
        final boolean z2 = this.zza;
        zzefkVar2.zza(new zzfhk() { // from class: com.google.android.gms.internal.ads.zzefu
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final Object zza(Object obj32) {
                zzefo zzefoVar;
                zzefv zzefvVar = zzefv.this;
                boolean z22 = z2;
                ArrayList arrayList22 = arrayList3;
                zzbgt zzbgtVar = zza2;
                zzbhc zzbhcVar = zzb2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj32;
                if (zzefvVar.zzb.zzf()) {
                    return null;
                }
                byte[] zze = zzefw.zze(zzefvVar.zzb, z22, arrayList22, zzbgtVar, zzbhcVar);
                zzefz.zzg(sQLiteDatabase, z22, true);
                zzefoVar = zzefvVar.zzb.zzf;
                zzefz.zzd(sQLiteDatabase, zzefoVar.zzd(), zze);
                return null;
            }
        });
    }
}
