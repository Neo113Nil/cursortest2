package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzflh {
    private final zzein zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfey zzf;
    private final zzfez zzg;
    private final Clock zzh;
    private final zzauo zzi;

    public zzflh(zzein zzeinVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, zzfey zzfeyVar, zzfez zzfezVar, Clock clock, zzauo zzauoVar) {
        this.zza = zzeinVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfeyVar;
        this.zzg = zzfezVar;
        this.zzh = clock;
        this.zzi = zzauoVar;
    }

    public static final List zzf(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final List zzh(List list, long j) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_ttr@", Long.toString(j, 10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzi(String str) {
        return TextUtils.isEmpty(str) ? "" : com.google.android.gms.ads.internal.util.client.zzl.zzk() ? "fakeForAdDebugLog" : str;
    }

    private static String zzj(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzfex zzfexVar, zzfel zzfelVar, List list) {
        return zzd(zzfexVar, zzfelVar, false, "", "", list);
    }

    public final List zzd(zzfex zzfexVar, zzfel zzfelVar, boolean z, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            String zzj = zzj(zzj(zzj((String) it.next(), "@gw_adlocid@", zzfexVar.zza.zza.zzf), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfelVar != null) {
                zzj = zzbyc.zzc(zzj(zzj(zzj(zzj, "@gw_qdata@", zzfelVar.zzy), "@gw_adnetid@", zzfelVar.zzx), "@gw_allocid@", zzfelVar.zzw), this.zze, zzfelVar.zzW, zzfelVar.zzaw);
            }
            String zzj2 = zzj(zzj(zzj(zzj(zzj, "@gw_adnetstatus@", this.zza.zzg()), "@gw_ttr@", Long.toString(this.zza.zza(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z3 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdf)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean z4 = !TextUtils.isEmpty(str2);
            if (z3) {
                z2 = z4;
            } else if (!z4) {
                arrayList.add(zzj2);
            }
            if (this.zzi.zzf(Uri.parse(zzj2))) {
                Uri.Builder buildUpon = Uri.parse(zzj2).buildUpon();
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzj2 = buildUpon.build().toString();
            }
            arrayList.add(zzj2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065 A[LOOP:0: B:10:0x005f->B:12:0x0065, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zze(zzfel zzfelVar, List list, zzbvn zzbvnVar) {
        zzfey zzfeyVar;
        zzfus zzd;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = this.zzh.currentTimeMillis();
        try {
            String zzc = zzbvnVar.zzc();
            String num = Integer.toString(zzbvnVar.zzb());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdg)).booleanValue()) {
                zzfez zzfezVar = this.zzg;
                if (zzfezVar == null) {
                    zzd = zzfus.zzc();
                    String str = (String) zzd.zza(new zzful() { // from class: com.google.android.gms.internal.ads.zzflf
                        @Override // com.google.android.gms.internal.ads.zzful
                        public final Object apply(Object obj) {
                            String zzi;
                            zzi = zzflh.zzi(((zzfey) obj).zza);
                            return zzi;
                        }
                    }).zzb("");
                    String str2 = (String) zzd.zza(new zzful() { // from class: com.google.android.gms.internal.ads.zzflg
                        @Override // com.google.android.gms.internal.ads.zzful
                        public final Object apply(Object obj) {
                            String zzi;
                            zzi = zzflh.zzi(((zzfey) obj).zzb);
                            return zzi;
                        }
                    }).zzb("");
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzbyc.zzc(zzj(zzj(zzj(zzj(zzj(zzj((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(zzc)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzb), this.zze, zzfelVar.zzW, zzfelVar.zzaw));
                    }
                    return arrayList;
                }
                zzfeyVar = zzfezVar.zza;
            } else {
                zzfeyVar = this.zzf;
            }
            zzd = zzfus.zzd(zzfeyVar);
            String str3 = (String) zzd.zza(new zzful() { // from class: com.google.android.gms.internal.ads.zzflf
                @Override // com.google.android.gms.internal.ads.zzful
                public final Object apply(Object obj) {
                    String zzi;
                    zzi = zzflh.zzi(((zzfey) obj).zza);
                    return zzi;
                }
            }).zzb("");
            String str22 = (String) zzd.zza(new zzful() { // from class: com.google.android.gms.internal.ads.zzflg
                @Override // com.google.android.gms.internal.ads.zzful
                public final Object apply(Object obj) {
                    String zzi;
                    zzi = zzflh.zzi(((zzfey) obj).zzb);
                    return zzi;
                }
            }).zzb("");
            it = list.iterator();
            while (it.hasNext()) {
            }
            return arrayList;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
