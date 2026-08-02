package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgqj extends zzgqg {
    private final OutputStream zzf;

    zzgqj(OutputStream outputStream, int i) {
        super(i);
        this.zzf = outputStream;
    }

    private final void zzL() throws IOException {
        this.zzf.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzM(int i) throws IOException {
        if (this.zzb - this.zzc < i) {
            zzL();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    public final void zzN() throws IOException {
        if (this.zzc > 0) {
            zzL();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    public final void zzO(byte b) throws IOException {
        if (this.zzc == this.zzb) {
            zzL();
        }
        zzc(b);
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    public final void zzP(int i, boolean z) throws IOException {
        zzM(11);
        zzf(i << 3);
        zzc(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    public final void zzQ(int i, zzgpw zzgpwVar) throws IOException {
        zzs((i << 3) | 2);
        zzs(zzgpwVar.zzd());
        zzgpwVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgql, com.google.android.gms.internal.ads.zzgpl
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzp(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    public final void zzh(int i, int i2) throws IOException {
        zzM(14);
        zzf((i << 3) | 5);
        zzd(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    public final void zzi(int i) throws IOException {
        zzM(4);
        zzd(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    public final void zzj(int i, long j) throws IOException {
        zzM(18);
        zzf((i << 3) | 1);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    public final void zzk(long j) throws IOException {
        zzM(8);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    public final void zzl(int i, int i2) throws IOException {
        zzM(20);
        zzf(i << 3);
        if (i2 >= 0) {
            zzf(i2);
        } else {
            zzg(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    final void zzn(int i, zzgso zzgsoVar, zzgth zzgthVar) throws IOException {
        zzs((i << 3) | 2);
        zzgpf zzgpfVar = (zzgpf) zzgsoVar;
        int zzas = zzgpfVar.zzas();
        if (zzas == -1) {
            zzas = zzgthVar.zza(zzgpfVar);
            zzgpfVar.zzav(zzas);
        }
        zzs(zzas);
        zzgthVar.zzn(zzgsoVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    public final void zzo(int i, String str) throws IOException {
        zzs((i << 3) | 2);
        zzv(str);
    }

    public final void zzp(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.zza, i4, i2);
            this.zzc += i2;
            this.zzd += i2;
            return;
        }
        System.arraycopy(bArr, i, this.zza, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.zzc = this.zzb;
        this.zzd += i5;
        zzL();
        if (i7 <= this.zzb) {
            System.arraycopy(bArr, i6, this.zza, 0, i7);
            this.zzc = i7;
        } else {
            this.zzf.write(bArr, i6, i7);
        }
        this.zzd += i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    public final void zzq(int i, int i2) throws IOException {
        zzs((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    public final void zzr(int i, int i2) throws IOException {
        zzM(20);
        zzf(i << 3);
        zzf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    public final void zzs(int i) throws IOException {
        zzM(5);
        zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    public final void zzt(int i, long j) throws IOException {
        zzM(20);
        zzf(i << 3);
        zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgql
    public final void zzu(long j) throws IOException {
        zzM(10);
        zzg(j);
    }

    public final void zzv(String str) throws IOException {
        int zze;
        try {
            int length = str.length() * 3;
            int zzE = zzE(length);
            int i = zzE + length;
            int i2 = this.zzb;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int zzd = zzgun.zzd(str, bArr, 0, length);
                zzs(zzd);
                zzp(bArr, 0, zzd);
                return;
            }
            if (i > i2 - this.zzc) {
                zzL();
            }
            int zzE2 = zzE(str.length());
            int i3 = this.zzc;
            try {
                if (zzE2 == zzE) {
                    int i4 = i3 + zzE2;
                    this.zzc = i4;
                    int zzd2 = zzgun.zzd(str, this.zza, i4, this.zzb - i4);
                    this.zzc = i3;
                    zze = (zzd2 - i3) - zzE2;
                    zzf(zze);
                    this.zzc = zzd2;
                } else {
                    zze = zzgun.zze(str);
                    zzf(zze);
                    this.zzc = zzgun.zzd(str, this.zza, this.zzc, zze);
                }
                this.zzd += zze;
            } catch (zzgum e) {
                this.zzd -= this.zzc - i3;
                this.zzc = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new zzgqi(e2);
            }
        } catch (zzgum e3) {
            zzJ(str, e3);
        }
    }
}
