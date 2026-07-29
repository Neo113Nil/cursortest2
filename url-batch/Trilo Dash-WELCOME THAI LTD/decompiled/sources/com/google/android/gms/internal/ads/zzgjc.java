package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
class zzgjc extends zzgjb {
    protected final byte[] zza;

    zzgjc(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgjg) || zzd() != ((zzgjg) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgjc)) {
            return obj.equals(this);
        }
        zzgjc zzgjcVar = (zzgjc) obj;
        int zzr = zzr();
        int zzr2 = zzgjcVar.zzr();
        if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
            return zzg(zzgjcVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    protected void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgjb
    final boolean zzg(zzgjg zzgjgVar, int i, int i2) {
        if (i2 > zzgjgVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i2 + zzd());
        }
        int i3 = i + i2;
        if (i3 > zzgjgVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + zzgjgVar.zzd());
        }
        if (!(zzgjgVar instanceof zzgjc)) {
            return zzgjgVar.zzk(i, i3).equals(zzk(0, i2));
        }
        zzgjc zzgjcVar = (zzgjc) zzgjgVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgjcVar.zza;
        int zzc = zzc() + i2;
        int zzc2 = zzc();
        int zzc3 = zzgjcVar.zzc() + i;
        while (zzc2 < zzc) {
            if (bArr[zzc2] != bArr2[zzc3]) {
                return false;
            }
            zzc2++;
            zzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    protected final int zzi(int i, int i2, int i3) {
        return zzgky.zzd(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    protected final int zzj(int i, int i2, int i3) {
        int zzc = zzc() + i2;
        return zzgnx.zzf(i, this.zza, zzc, i3 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final zzgjg zzk(int i, int i2) {
        int zzq = zzq(i, i2, zzd());
        return zzq == 0 ? zzgjg.zzb : new zzgiz(this.zza, zzc() + i, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final zzgjo zzl() {
        return zzgjo.zzI(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    protected final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    final void zzo(zzgiv zzgivVar) throws IOException {
        zzgivVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final boolean zzp() {
        int zzc = zzc();
        return zzgnx.zzj(this.zza, zzc, zzd() + zzc);
    }
}
