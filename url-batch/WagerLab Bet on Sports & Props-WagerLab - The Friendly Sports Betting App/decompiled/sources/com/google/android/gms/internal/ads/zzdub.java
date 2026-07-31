package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdub extends zzbkn {
    private final zzdue zza;
    private final zzdtz zzb;
    private final Map zzc = new HashMap();

    zzdub(zzdue zzdueVar, zzdtz zzdtzVar) {
        this.zza = zzdueVar;
        this.zzb = zzdtzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static com.google.android.gms.ads.internal.client.zzm zzc(Map map) {
        char c;
        com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zznVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (nextName.equals("extras")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zznVar.zzb(bundle);
                        break;
                    case 1:
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zznVar.zzc(arrayList);
                        break;
                    case 2:
                        zznVar.zzd(jsonReader.nextBoolean());
                        break;
                    case 3:
                        if (!jsonReader.nextBoolean()) {
                            zznVar.zze(0);
                            break;
                        } else {
                            zznVar.zze(1);
                            break;
                        }
                    case 4:
                        if (!jsonReader.nextBoolean()) {
                            zznVar.zzf(0);
                            break;
                        } else {
                            zznVar.zzf(1);
                            break;
                        }
                    case 5:
                        String nextString = jsonReader.nextString();
                        if (!RequestConfiguration.zza.contains(nextString)) {
                            break;
                        } else {
                            zznVar.zzg(nextString);
                            break;
                        }
                    case 6:
                        zznVar.zzh(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzm zza = zznVar.zza();
        Bundle bundle2 = zza.zzm;
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle3 == null) {
            bundle3 = zza.zzc;
            bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
        }
        return new com.google.android.gms.ads.internal.client.zzm(zza.zza, zza.zzb, bundle3, zza.zzd, zza.zze, zza.zzf, zza.zzg, zza.zzh, zza.zzi, zza.zzj, zza.zzk, zza.zzl, bundle2, zza.zzn, zza.zzo, zza.zzp, zza.zzq, zza.zzr, zza.zzs, zza.zzt, zza.zzu, zza.zzv, zza.zzw, zza.zzx, zza.zzy, zza.zzz, zza.zzA);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00ab, code lost:
    
        if (r0.equals("create_interstitial_ad") != false) goto L50;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbko
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(String str) throws RemoteException {
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkK)).booleanValue()) {
            String.valueOf(str);
            com.google.android.gms.ads.internal.util.zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri parse = Uri.parse(str);
            com.google.android.gms.ads.internal.zzt.zzc();
            Map zzU = com.google.android.gms.ads.internal.util.zzs.zzU(parse);
            String str2 = (String) zzU.get("action");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg did not contain an action");
                return;
            }
            int hashCode = str2.hashCode();
            char c = 0;
            if (hashCode != 579053441) {
                if (hashCode == 871091088 && str2.equals("initialize")) {
                    z = false;
                }
                z = -1;
            } else {
                if (str2.equals("dispose_all")) {
                    z = true;
                }
                z = -1;
            }
            if (!z) {
                this.zzc.clear();
                this.zzb.zza();
                return;
            }
            if (z) {
                Map map = this.zzc;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzdtv) it.next()).zzc();
                }
                map.clear();
                return;
            }
            String str3 = (String) zzU.get("obj_id");
            try {
                long parseLong = Long.parseLong((String) Objects.requireNonNull(str3));
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 393881811:
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        Map map2 = this.zzc;
                        if (map2.size() < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkL)).intValue()) {
                            Long valueOf = Long.valueOf(parseLong);
                            if (!map2.containsKey(valueOf)) {
                                String str4 = (String) zzU.get("ad_unit");
                                if (!TextUtils.isEmpty(str4)) {
                                    zzdtw zzc = this.zza.zzc();
                                    zzc.zzc(parseLong);
                                    zzc.zzb(str4);
                                    map2.put(valueOf, zzc.zza().zza());
                                    this.zzb.zzb(parseLong);
                                    StringBuilder sb = new StringBuilder(String.valueOf(parseLong).length() + 39 + String.valueOf(str4).length());
                                    sb.append("Created H5 interstitial #");
                                    sb.append(parseLong);
                                    sb.append(" with ad unit ");
                                    sb.append(str4);
                                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                                    break;
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzc(parseLong);
                                    break;
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(parseLong);
                                break;
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, too many existing objects");
                            this.zzb.zzc(parseLong);
                            break;
                        }
                    case 1:
                        zzdtv zzdtvVar = (zzdtv) this.zzc.get(Long.valueOf(parseLong));
                        if (zzdtvVar != null) {
                            zzdtvVar.zza(zzc(zzU));
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzd(parseLong);
                            break;
                        }
                    case 2:
                        zzdtv zzdtvVar2 = (zzdtv) this.zzc.get(Long.valueOf(parseLong));
                        if (zzdtvVar2 != null) {
                            zzdtvVar2.zzb();
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzd(parseLong);
                            break;
                        }
                    case 3:
                        Map map3 = this.zzc;
                        if (map3.size() < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkL)).intValue()) {
                            Long valueOf2 = Long.valueOf(parseLong);
                            if (!map3.containsKey(valueOf2)) {
                                String str5 = (String) zzU.get("ad_unit");
                                if (!TextUtils.isEmpty(str5)) {
                                    zzdtw zzc2 = this.zza.zzc();
                                    zzc2.zzc(parseLong);
                                    zzc2.zzb(str5);
                                    map3.put(valueOf2, zzc2.zza().zzb());
                                    this.zzb.zzb(parseLong);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(parseLong).length() + 35 + String.valueOf(str5).length());
                                    sb2.append("Created H5 rewarded #");
                                    sb2.append(parseLong);
                                    sb2.append(" with ad unit ");
                                    sb2.append(str5);
                                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                                    break;
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzc(parseLong);
                                    break;
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(parseLong);
                                break;
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, too many existing objects");
                            this.zzb.zzc(parseLong);
                            break;
                        }
                    case 4:
                        zzdtv zzdtvVar3 = (zzdtv) this.zzc.get(Long.valueOf(parseLong));
                        if (zzdtvVar3 != null) {
                            zzdtvVar3.zza(zzc(zzU));
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzj(parseLong);
                            break;
                        }
                    case 5:
                        zzdtv zzdtvVar4 = (zzdtv) this.zzc.get(Long.valueOf(parseLong));
                        if (zzdtvVar4 != null) {
                            zzdtvVar4.zzb();
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzj(parseLong);
                            break;
                        }
                    case 6:
                        Map map4 = this.zzc;
                        Long valueOf3 = Long.valueOf(parseLong);
                        zzdtv zzdtvVar5 = (zzdtv) map4.get(valueOf3);
                        if (zzdtvVar5 != null) {
                            zzdtvVar5.zzc();
                            map4.remove(valueOf3);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(parseLong).length() + 16);
                            sb3.append("Disposed H5 ad #");
                            sb3.append(parseLong);
                            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not dispose H5 ad, object ID does not exist");
                            break;
                        }
                    default:
                        String.valueOf(str2);
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg contained invalid action: ".concat(String.valueOf(str2)));
                        break;
                }
            } catch (NullPointerException | NumberFormatException unused) {
                String.valueOf(str3);
                com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final void zzf() {
        this.zzc.clear();
    }
}
