package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
final class zzgve implements zzgvc {
    private final zzgvi zza = new zzgvi();
    private volatile zzgvc zzb;
    private Object zzc;

    zzgve(zzgvc zzgvcVar) {
        this.zzb = zzgvcVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == null) {
            String valueOf = String.valueOf(this.zzc);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String obj2 = obj.toString();
        StringBuilder sb2 = new StringBuilder(obj2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(obj2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final Object zza() {
        if (this.zzb != null) {
            synchronized (this.zza) {
                try {
                    if (this.zzb != null) {
                        Object zza = this.zzb.zza();
                        this.zzc = zza;
                        this.zzb = null;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
