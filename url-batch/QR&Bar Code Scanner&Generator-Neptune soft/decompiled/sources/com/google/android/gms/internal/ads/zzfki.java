package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfki {
    private final zzeko zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfdx zzf;
    private final zzfdy zzg;
    private final Clock zzh;
    private final zzape zzi;

    public zzfki(zzeko zzekoVar, zzcgv zzcgvVar, String str, String str2, Context context, zzfdx zzfdxVar, zzfdy zzfdyVar, Clock clock, zzape zzapeVar) {
        this.zza = zzekoVar;
        this.zzb = zzcgvVar.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfdxVar;
        this.zzg = zzfdyVar;
        this.zzh = clock;
        this.zzi = zzapeVar;
    }

    public static final List zzf(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzh((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzg(String str) {
        return TextUtils.isEmpty(str) ? "" : zzcgo.zzl() ? "fakeForAdDebugLog" : str;
    }

    private static String zzh(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzfdw zzfdwVar, zzfdk zzfdkVar, List list) {
        return zzd(zzfdwVar, zzfdkVar, false, "", "", list);
    }

    public final List zzd(zzfdw zzfdwVar, zzfdk zzfdkVar, boolean z, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? "0" : "1";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String zzh = zzh(zzh(zzh((String) it.next(), "@gw_adlocid@", zzfdwVar.zza.zza.zzf), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.zzb);
            if (zzfdkVar != null) {
                zzh = zzcew.zzc(zzh(zzh(zzh(zzh, "@gw_qdata@", zzfdkVar.zzz), "@gw_adnetid@", zzfdkVar.zzy), "@gw_allocid@", zzfdkVar.zzx), this.zze, zzfdkVar.zzX);
            }
            String zzh2 = zzh(zzh(zzh(zzh, "@gw_adnetstatus@", this.zza.zzf()), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z2 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcI)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (!z2) {
                if (z3) {
                    z3 = true;
                } else {
                    arrayList.add(zzh2);
                }
            }
            if (this.zzi.zzf(Uri.parse(zzh2))) {
                Uri.Builder buildUpon = Uri.parse(zzh2).buildUpon();
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzh2 = buildUpon.build().toString();
            }
            arrayList.add(zzh2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[LOOP:0: B:10:0x0059->B:12:0x005f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zze(zzfdk zzfdkVar, List list, zzcbs zzcbsVar) {
        zzfdx zzfdxVar;
        zzfst zzd;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = this.zzh.currentTimeMillis();
        try {
            String zzc = zzcbsVar.zzc();
            String num = Integer.toString(zzcbsVar.zzb());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcJ)).booleanValue()) {
                zzfdy zzfdyVar = this.zzg;
                if (zzfdyVar == null) {
                    zzd = zzfst.zzc();
                    String str = (String) zzd.zza(new zzfsm() { // from class: com.google.android.gms.internal.ads.zzfkg
                        @Override // com.google.android.gms.internal.ads.zzfsm
                        public final Object apply(Object obj) {
                            String zzg;
                            zzg = zzfki.zzg(((zzfdx) obj).zza);
                            return zzg;
                        }
                    }).zzb("");
                    String str2 = (String) zzd.zza(new zzfsm() { // from class: com.google.android.gms.internal.ads.zzfkh
                        @Override // com.google.android.gms.internal.ads.zzfsm
                        public final Object apply(Object obj) {
                            String zzg;
                            zzg = zzfki.zzg(((zzfdx) obj).zzb);
                            return zzg;
                        }
                    }).zzb("");
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzcew.zzc(zzh(zzh(zzh(zzh(zzh(zzh((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(zzc)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzb), this.zze, zzfdkVar.zzX));
                    }
                    return arrayList;
                }
                zzfdxVar = zzfdyVar.zza;
            } else {
                zzfdxVar = this.zzf;
            }
            zzd = zzfst.zzd(zzfdxVar);
            String str3 = (String) zzd.zza(new zzfsm() { // from class: com.google.android.gms.internal.ads.zzfkg
                @Override // com.google.android.gms.internal.ads.zzfsm
                public final Object apply(Object obj) {
                    String zzg;
                    zzg = zzfki.zzg(((zzfdx) obj).zza);
                    return zzg;
                }
            }).zzb("");
            String str22 = (String) zzd.zza(new zzfsm() { // from class: com.google.android.gms.internal.ads.zzfkh
                @Override // com.google.android.gms.internal.ads.zzfsm
                public final Object apply(Object obj) {
                    String zzg;
                    zzg = zzfki.zzg(((zzfdx) obj).zzb);
                    return zzg;
                }
            }).zzb("");
            it = list.iterator();
            while (it.hasNext()) {
            }
            return arrayList;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzh("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
