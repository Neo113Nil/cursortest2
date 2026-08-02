package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
class zzgps extends zzgpr {
    protected final byte[] zza;

    zzgps(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgpw) || zzd() != ((zzgpw) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgps)) {
            return obj.equals(this);
        }
        zzgps zzgpsVar = (zzgps) obj;
        int zzr = zzr();
        int zzr2 = zzgpsVar.zzr();
        if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
            return zzg(zzgpsVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    protected void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    final boolean zzg(zzgpw zzgpwVar, int i, int i2) {
        if (i2 > zzgpwVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i2 + zzd());
        }
        int i3 = i + i2;
        if (i3 > zzgpwVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + zzgpwVar.zzd());
        }
        if (!(zzgpwVar instanceof zzgps)) {
            return zzgpwVar.zzk(i, i3).equals(zzk(0, i2));
        }
        zzgps zzgpsVar = (zzgps) zzgpwVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgpsVar.zza;
        int zzc = zzc() + i2;
        int zzc2 = zzc();
        int zzc3 = zzgpsVar.zzc() + i;
        while (zzc2 < zzc) {
            if (bArr[zzc2] != bArr2[zzc3]) {
                return false;
            }
            zzc2++;
            zzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    protected final int zzi(int i, int i2, int i3) {
        return zzgro.zzd(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    protected final int zzj(int i, int i2, int i3) {
        int zzc = zzc() + i2;
        return zzgun.zzf(i, this.zza, zzc, i3 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    public final zzgpw zzk(int i, int i2) {
        int zzq = zzq(i, i2, zzd());
        return zzq == 0 ? zzgpw.zzb : new zzgpp(this.zza, zzc() + i, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    public final zzgqe zzl() {
        return zzgqe.zzI(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    protected final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    final void zzo(zzgpl zzgplVar) throws IOException {
        zzgplVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgpw
    public final boolean zzp() {
        int zzc = zzc();
        return zzgun.zzj(this.zza, zzc, zzd() + zzc);
    }
}
