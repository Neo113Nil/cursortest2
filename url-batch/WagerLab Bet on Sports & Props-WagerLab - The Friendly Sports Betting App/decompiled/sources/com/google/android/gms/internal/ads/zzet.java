package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzet extends zzev {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzet(int i, long j) {
        super(i, null);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final String toString() {
        List list = this.zzb;
        String zze = zze(this.zzd);
        String arrays = Arrays.toString(list.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        int length = zze.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(arrays).length() + 13 + String.valueOf(arrays2).length());
        sb.append(zze);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }

    public final void zza(zzeu zzeuVar) {
        this.zzb.add(zzeuVar);
    }

    public final void zzb(zzet zzetVar) {
        this.zzc.add(zzetVar);
    }

    public final zzeu zzc(int i) {
        List list = this.zzb;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzeu zzeuVar = (zzeu) list.get(i2);
            if (zzeuVar.zzd == i) {
                return zzeuVar;
            }
        }
        return null;
    }

    public final zzet zzd(int i) {
        List list = this.zzc;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzet zzetVar = (zzet) list.get(i2);
            if (zzetVar.zzd == i) {
                return zzetVar;
            }
        }
        return null;
    }
}
