package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
class zzakg extends zzakd {
    protected final byte[] zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public byte zza(int i) {
        return this.zzb[i];
    }

    protected int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    protected final int zzb(int i, int i2, int i3) {
        return zzalh.zza(i, this.zzb, zze(), i3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final zzajv zza(int i, int i2) {
        int zza = zza(0, i2, zzb());
        if (zza == 0) {
            return zzajv.zza;
        }
        return new zzajz(this.zzb, zze(), zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final zzakh zzc() {
        return zzakh.zza(this.zzb, zze(), zzb(), true);
    }

    zzakg(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    protected void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, 0, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    final void zza(zzajw zzajwVar) throws IOException {
        zzajwVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajv
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzajv) || zzb() != ((zzajv) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (obj instanceof zzakg) {
            zzakg zzakgVar = (zzakg) obj;
            int zza = zza();
            int zza2 = zzakgVar.zza();
            if (zza == 0 || zza2 == 0 || zza == zza2) {
                return zza(zzakgVar, 0, zzb());
            }
            return false;
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakd
    final boolean zza(zzajv zzajvVar, int i, int i2) {
        if (i2 > zzajvVar.zzb()) {
            throw new IllegalArgumentException("Length too large: " + i2 + zzb());
        }
        if (i2 > zzajvVar.zzb()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i2 + ", " + zzajvVar.zzb());
        }
        if (zzajvVar instanceof zzakg) {
            zzakg zzakgVar = (zzakg) zzajvVar;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzakgVar.zzb;
            int zze = zze() + i2;
            int zze2 = zze();
            int zze3 = zzakgVar.zze();
            while (zze2 < zze) {
                if (bArr[zze2] != bArr2[zze3]) {
                    return false;
                }
                zze2++;
                zze3++;
            }
            return true;
        }
        return zzajvVar.zza(0, i2).equals(zza(0, i2));
    }
}
