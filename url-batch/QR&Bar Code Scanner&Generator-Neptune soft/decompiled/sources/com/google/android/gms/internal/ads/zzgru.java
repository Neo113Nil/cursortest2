package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzgru {
    private static final zzgqq zzb = zzgqq.zza();
    protected volatile zzgso zza;
    private volatile zzgpw zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgru)) {
            return false;
        }
        zzgru zzgruVar = (zzgru) obj;
        zzgso zzgsoVar = this.zza;
        zzgso zzgsoVar2 = zzgruVar.zza;
        if (zzgsoVar == null && zzgsoVar2 == null) {
            return zzb().equals(zzgruVar.zzb());
        }
        if (zzgsoVar != null && zzgsoVar2 != null) {
            return zzgsoVar.equals(zzgsoVar2);
        }
        if (zzgsoVar != null) {
            zzgruVar.zzc(zzgsoVar.zzbh());
            return zzgsoVar.equals(zzgruVar.zza);
        }
        zzc(zzgsoVar2.zzbh());
        return this.zza.equals(zzgsoVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgps) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzay();
        }
        return 0;
    }

    public final zzgpw zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzgpw.zzb;
            } else {
                this.zzc = this.zza.zzat();
            }
            return this.zzc;
        }
    }

    protected final void zzc(zzgso zzgsoVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzgsoVar;
                    this.zzc = zzgpw.zzb;
                } catch (zzgrq unused) {
                    this.zza = zzgsoVar;
                    this.zzc = zzgpw.zzb;
                }
            }
        }
    }
}
