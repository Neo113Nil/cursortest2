package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfrl extends zzfra {

    @CheckForNull
    Object[] zzd;
    private int zze;

    public zzfrl() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfra, com.google.android.gms.internal.ads.zzfrb
    public final /* bridge */ /* synthetic */ zzfrb zzb(Object obj) {
        zze(obj);
        return this;
    }

    public final zzfrl zzf(Iterable iterable) {
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

    zzfrl(int i) {
        super(i);
        this.zzd = new Object[zzfrm.zzh(i)];
    }

    public final zzfrm zzg() {
        zzfrm zzp;
        boolean zzq;
        int i = this.zzb;
        if (i == 0) {
            return zzfsw.zza;
        }
        if (i == 1) {
            Object obj = this.zza[0];
            obj.getClass();
            return new zzftd(obj);
        }
        if (this.zzd == null || zzfrm.zzh(i) != this.zzd.length) {
            zzp = zzfrm.zzp(this.zzb, this.zza);
            this.zzb = zzp.size();
        } else {
            int i2 = this.zzb;
            Object[] objArr = this.zza;
            zzq = zzfrm.zzq(i2, objArr.length);
            if (zzq) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            zzp = new zzfsw(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzp;
    }

    public final zzfrl zze(Object obj) {
        Objects.requireNonNull(obj);
        if (this.zzd != null) {
            int zzh = zzfrm.zzh(this.zzb);
            Object[] objArr = this.zzd;
            int length = objArr.length;
            if (zzh <= length) {
                objArr.getClass();
                int i = length - 1;
                int hashCode = obj.hashCode();
                int zza = zzfqz.zza(hashCode);
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
