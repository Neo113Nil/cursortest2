package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfsq {
    private final String zza;
    private final zzfsp zzb;
    private zzfsp zzc;

    /* synthetic */ zzfsq(String str, zzfso zzfsoVar) {
        zzfsp zzfspVar = new zzfsp(null);
        this.zzb = zzfspVar;
        this.zzc = zzfspVar;
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfsp zzfspVar = this.zzb.zzb;
        String str = "";
        while (zzfspVar != null) {
            Object obj = zzfspVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            zzfspVar = zzfspVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfsq zza(@CheckForNull Object obj) {
        zzfsp zzfspVar = new zzfsp(null);
        this.zzc.zzb = zzfspVar;
        this.zzc = zzfspVar;
        zzfspVar.zza = obj;
        return this;
    }
}
