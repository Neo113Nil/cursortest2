package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzghp {

    @Nullable
    private ArrayList zza = new ArrayList();
    private zzghm zzb = zzghm.zza;

    @Nullable
    private Integer zzc = null;

    public final zzghp zza(zzgbc zzgbcVar, int i, zzgbl zzgblVar) {
        ArrayList arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zzghr(zzgbcVar, i, zzgblVar, null));
        return this;
    }

    public final zzghp zzb(zzghm zzghmVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzghmVar;
        return this;
    }

    public final zzghp zzc(int i) {
        if (this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = Integer.valueOf(i);
        return this;
    }

    public final zzght zzd() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.zzc;
        if (num != null) {
            int intValue = num.intValue();
            ArrayList arrayList = this.zza;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (((zzghr) arrayList.get(i)).zza() != intValue) {
                    i = i2;
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        zzght zzghtVar = new zzght(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
        this.zza = null;
        return zzghtVar;
    }
}
