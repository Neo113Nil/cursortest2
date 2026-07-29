package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzedx implements zzfuw {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzedy zzb;

    zzedx(zzedy zzedyVar, boolean z) {
        this.zzb = zzedyVar;
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.zze.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // com.google.android.gms.internal.ads.zzfuw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        com.google.android.gms.ads.internal.util.zzg zzgVar;
        List<String> emptyList;
        List asList;
        zzedn zzednVar;
        char c;
        Bundle bundle = (Bundle) obj;
        zzgVar = this.zzb.zzg;
        if (zzgVar.zzP()) {
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
                    arrayList.add(c != 0 ? c != 1 ? c != 2 ? c != 3 ? zzbej.AD_FORMAT_TYPE_UNSPECIFIED : zzbej.REWARD_BASED_VIDEO_AD : zzbej.NATIVE_APP_INSTALL : zzbej.INTERSTITIAL : zzbej.BANNER);
                }
                final zzbfy zzb = zzedy.zzb(this.zzb, bundle);
                final zzbfp zza = zzedy.zza(this.zzb, bundle);
                zzednVar = this.zzb.zzf;
                final boolean z = this.zza;
                zzednVar.zza(new zzffh() { // from class: com.google.android.gms.internal.ads.zzedw
                    @Override // com.google.android.gms.internal.ads.zzffh
                    public final Object zza(Object obj3) {
                        com.google.android.gms.ads.internal.util.zzg zzgVar2;
                        zzedx zzedxVar = zzedx.this;
                        boolean z2 = z;
                        ArrayList arrayList2 = arrayList;
                        zzbfp zzbfpVar = zza;
                        zzbfy zzbfyVar = zzb;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                        zzgVar2 = zzedxVar.zzb.zzg;
                        if (!zzgVar2.zzP()) {
                            byte[] zzf = zzedy.zzf(zzedxVar.zzb, z2, arrayList2, zzbfpVar, zzbfyVar);
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("timestamp", Long.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
                            contentValues.put("serialized_proto_data", zzf);
                            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
                            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
                            if (!z2) {
                                sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
                            }
                        }
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
        final zzbfy zzb2 = zzedy.zzb(this.zzb, bundle);
        final zzbfp zza2 = zzedy.zza(this.zzb, bundle);
        zzednVar = this.zzb.zzf;
        final boolean z2 = this.zza;
        zzednVar.zza(new zzffh() { // from class: com.google.android.gms.internal.ads.zzedw
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj32) {
                com.google.android.gms.ads.internal.util.zzg zzgVar2;
                zzedx zzedxVar = zzedx.this;
                boolean z22 = z2;
                ArrayList arrayList22 = arrayList3;
                zzbfp zzbfpVar = zza2;
                zzbfy zzbfyVar = zzb2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj32;
                zzgVar2 = zzedxVar.zzb.zzg;
                if (!zzgVar2.zzP()) {
                    byte[] zzf = zzedy.zzf(zzedxVar.zzb, z22, arrayList22, zzbfpVar, zzbfyVar);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("timestamp", Long.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
                    contentValues.put("serialized_proto_data", zzf);
                    sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
                    sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
                    if (!z22) {
                        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
                    }
                }
                return null;
            }
        });
    }
}
