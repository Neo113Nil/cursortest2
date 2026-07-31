package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzeao;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzk extends QueryInfoGenerationCallback {
    private final zzj zza;
    private final zzeao zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();

    @Nullable
    private final Boolean zzf;

    public zzk(zzj zzjVar, boolean z, int i, @Nullable Boolean bool, zzeao zzeaoVar) {
        this.zza = zzjVar;
        this.zzc = z;
        this.zzd = i;
        this.zzf = bool;
        this.zzb = zzeaoVar;
    }

    private static long zza() {
        return com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + ((Long) zzblm.zzh.zze()).longValue();
    }

    private final long zzb() {
        return com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zze;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        Pair pair6 = new Pair("lat_ms", Long.toString(zzb()));
        int i = this.zzd;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        boolean z = this.zzc;
        zzv.zze(this.zzb, null, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z ? "0" : "1"));
        this.zza.zzc(z, new zzl(null, str, zza(), i));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        Pair pair5 = new Pair("lat_ms", Long.toString(zzb()));
        int i = this.zzd;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        boolean z = this.zzc;
        zzv.zze(this.zzb, null, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z ? "0" : "1"));
        this.zza.zzc(z, new zzl(queryInfo, "", zza(), i));
    }
}
