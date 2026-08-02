package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfvr extends zzfvg {

    @CheckForNull
    Object[] zzd;
    private int zze;

    public zzfvr() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfvg, com.google.android.gms.internal.ads.zzfvh
    public final /* bridge */ /* synthetic */ zzfvh zzb(Object obj) {
        zze(obj);
        return this;
    }

    public final zzfvr zzf(Iterable iterable) {
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zze(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    zzfvr(int i) {
        super(i);
        this.zzd = new Object[zzfvs.zzh(i)];
    }

    public final zzfvs zzg() {
        zzfvs zzp;
        boolean zzq;
        int i = this.zzb;
        if (i == 0) {
            return zzfxc.zza;
        }
        if (i == 1) {
            Object obj = this.zza[0];
            obj.getClass();
            return new zzfxj(obj);
        }
        if (this.zzd == null || zzfvs.zzh(i) != this.zzd.length) {
            zzp = zzfvs.zzp(this.zzb, this.zza);
            this.zzb = zzp.size();
        } else {
            int i2 = this.zzb;
            Object[] objArr = this.zza;
            zzq = zzfvs.zzq(i2, objArr.length);
            if (zzq) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            zzp = new zzfxc(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzp;
    }

    public final zzfvr zze(Object obj) {
        Objects.requireNonNull(obj);
        if (this.zzd != null) {
            int zzh = zzfvs.zzh(this.zzb);
            Object[] objArr = this.zzd;
            int length = objArr.length;
            if (zzh <= length) {
                objArr.getClass();
                int i = length - 1;
                int hashCode = obj.hashCode();
                int zza = zzfvf.zza(hashCode);
                while (true) {
                    int i2 = zza & i;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i2];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zza = i2 + 1;
                    } else {
                        objArr2[i2] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }
}
