package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeko {
    private final Clock zza;
    private final zzekp zzb;
    private final zzfkm zzc;
    private final List zzd = Collections.synchronizedList(new ArrayList());
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfV)).booleanValue();
    private final zzehh zzf;

    public zzeko(Clock clock, zzekp zzekpVar, zzehh zzehhVar, zzfkm zzfkmVar) {
        this.zza = clock;
        this.zzb = zzekpVar;
        this.zzf = zzehhVar;
        this.zzc = zzfkmVar;
    }

    static /* bridge */ /* synthetic */ void zzg(zzeko zzekoVar, String str, int i, long j, String str2, Integer num) {
        String str3 = str + "." + i + "." + j;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + str2;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbu)).booleanValue() && num != null && !TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + num;
        }
        zzekoVar.zzd.add(str3);
    }

    final zzfzp zze(zzfdw zzfdwVar, zzfdk zzfdkVar, zzfzp zzfzpVar, zzfki zzfkiVar) {
        zzfdn zzfdnVar = zzfdwVar.zzb.zzb;
        long elapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfdkVar.zzx;
        if (str != null) {
            zzfzg.zzr(zzfzpVar, new zzekn(this, elapsedRealtime, str, zzfdkVar, zzfdnVar, zzfkiVar, zzfdwVar), zzchc.zzf);
        }
        return zzfzpVar;
    }

    public final String zzf() {
        return TextUtils.join("_", this.zzd);
    }
}
