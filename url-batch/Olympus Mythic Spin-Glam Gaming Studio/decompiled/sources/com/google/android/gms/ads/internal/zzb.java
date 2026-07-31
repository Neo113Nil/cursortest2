package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzcef;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;

    @Nullable
    private final zzcef zzc;
    private final zzcbc zzd = new zzcbc(false, Collections.emptyList());

    public zzb(Context context, @Nullable zzcef zzcefVar, @Nullable zzcbc zzcbcVar) {
        this.zza = context;
        this.zzc = zzcefVar;
    }

    private final boolean zzd() {
        zzcef zzcefVar = this.zzc;
        return (zzcefVar != null && zzcefVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final boolean zzb() {
        return !zzd() || this.zzb;
    }

    public final void zzc(@Nullable String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzcef zzcefVar = this.zzc;
            if (zzcefVar != null) {
                zzcefVar.zze(str, null, 3);
                return;
            }
            zzcbc zzcbcVar = this.zzd;
            if (!zzcbcVar.zza || (list = zzcbcVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.zza;
                    zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzO(context, "", replace);
                }
            }
        }
    }
}
