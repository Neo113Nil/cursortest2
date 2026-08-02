package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgwq extends zzgww {
    private final Iterable zze;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    /* synthetic */ zzgwq(Iterable iterable, int i, boolean z, zzgwp zzgwpVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zzh = i;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i != 0) {
            zzM();
            return;
        }
        this.zzg = zzgyl.zzc;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = 0L;
    }

    private final int zzI() {
        return (int) (((this.zzh - this.zzl) - this.zzm) + this.zzn);
    }

    private final void zzJ() throws zzgyn {
        if (!this.zzf.hasNext()) {
            throw zzgyn.zzi();
        }
        zzM();
    }

    private final void zzK(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > zzI()) {
            if (i2 > 0) {
                throw zzgyn.zzi();
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzJ();
            }
            int min = Math.min(i3, (int) (this.zzo - this.zzm));
            long j = min;
            zzhaz.zzo(this.zzm, bArr, i2 - i3, j);
            i3 -= min;
            this.zzm += j;
        }
    }

    private final void zzL() {
        int i = this.zzh + this.zzi;
        this.zzh = i;
        int i2 = this.zzj;
        if (i <= i2) {
            this.zzi = 0;
            return;
        }
        int i3 = i - i2;
        this.zzi = i3;
        this.zzh = i - i3;
    }

    private final void zzM() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long position = byteBuffer.position();
        this.zzm = position;
        this.zzn = position;
        this.zzo = this.zzg.limit();
        long zze = zzhaz.zze(this.zzg);
        this.zzm += zze;
        this.zzn += zze;
        this.zzo += zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final boolean zzA() throws IOException {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final boolean zzB() throws IOException {
        return zzr() != 0;
    }

    final long zzC() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzh() & 128) == 0) {
                return j;
            }
        }
        throw zzgyn.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzc() {
        return (int) ((this.zzl + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzd(int i) throws zzgyn {
        if (i < 0) {
            throw zzgyn.zzf();
        }
        int zzc = i + zzc();
        int i2 = this.zzj;
        if (zzc > i2) {
            throw zzgyn.zzi();
        }
        this.zzj = zzc;
        zzL();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zze() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzf() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzg() throws IOException {
        return zzp();
    }

    public final byte zzh() throws IOException {
        if (this.zzo - this.zzm == 0) {
            zzJ();
        }
        long j = this.zzm;
        this.zzm = 1 + j;
        return zzhaz.zza(j);
    }

    public final int zzi() throws IOException {
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 < 4) {
            int zzh = zzh() & 255;
            int zzh2 = (zzh() & 255) << 8;
            return zzh | zzh2 | ((zzh() & 255) << 16) | ((zzh() & 255) << 24);
        }
        this.zzm = 4 + j2;
        int zza = zzhaz.zza(j2) & 255;
        int zza2 = (zzhaz.zza(1 + j2) & 255) << 8;
        return zza | zza2 | ((zzhaz.zza(2 + j2) & 255) << 16) | ((zzhaz.zza(j2 + 3) & 255) << 24);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzj() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzk() throws IOException {
        return zzD(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzl() throws IOException {
        if (zzA()) {
            this.zzk = 0;
            return 0;
        }
        int zzp = zzp();
        this.zzk = zzp;
        if ((zzp >>> 3) != 0) {
            return zzp;
        }
        throw zzgyn.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzm() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzn() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzo() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 < 8) {
            return (zzh() & 255) | ((zzh() & 255) << 8) | ((zzh() & 255) << 16) | ((zzh() & 255) << 24) | ((zzh() & 255) << 32) | ((zzh() & 255) << 40) | ((zzh() & 255) << 48) | ((zzh() & 255) << 56);
        }
        this.zzm = 8 + j2;
        return (zzhaz.zza(j2) & 255) | ((zzhaz.zza(1 + j2) & 255) << 8) | ((zzhaz.zza(j2 + 2) & 255) << 16) | ((zzhaz.zza(3 + j2) & 255) << 24) | ((zzhaz.zza(j2 + 4) & 255) << 32) | ((zzhaz.zza(5 + j2) & 255) << 40) | ((zzhaz.zza(j2 + 6) & 255) << 48) | ((zzhaz.zza(j2 + 7) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzs() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzt() throws IOException {
        return zzF(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final long zzu() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final zzgwm zzv() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = zzp;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[zzp];
                zzhaz.zzo(j2, bArr, 0L, j3);
                this.zzm += j3;
                return new zzgwk(bArr);
            }
        }
        if (zzp > 0 && zzp <= zzI()) {
            byte[] bArr2 = new byte[zzp];
            zzK(bArr2, 0, zzp);
            return new zzgwk(bArr2);
        }
        if (zzp == 0) {
            return zzgwm.zzb;
        }
        if (zzp < 0) {
            throw zzgyn.zzf();
        }
        throw zzgyn.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final String zzw() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = zzp;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[zzp];
                zzhaz.zzo(j2, bArr, 0L, j3);
                String str = new String(bArr, zzgyl.zza);
                this.zzm += j3;
                return str;
            }
        }
        if (zzp > 0 && zzp <= zzI()) {
            byte[] bArr2 = new byte[zzp];
            zzK(bArr2, 0, zzp);
            return new String(bArr2, zzgyl.zza);
        }
        if (zzp == 0) {
            return "";
        }
        if (zzp < 0) {
            throw zzgyn.zzf();
        }
        throw zzgyn.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final String zzx() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = zzp;
            if (j3 <= j - j2) {
                String zzg = zzhbe.zzg(this.zzg, (int) (j2 - this.zzn), zzp);
                this.zzm += j3;
                return zzg;
            }
        }
        if (zzp >= 0 && zzp <= zzI()) {
            byte[] bArr = new byte[zzp];
            zzK(bArr, 0, zzp);
            return zzhbe.zzh(bArr, 0, zzp);
        }
        if (zzp == 0) {
            return "";
        }
        if (zzp <= 0) {
            throw zzgyn.zzf();
        }
        throw zzgyn.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzy(int i) throws zzgyn {
        if (this.zzk != i) {
            throw zzgyn.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzz(int i) {
        this.zzj = i;
        zzL();
    }

    public final int zzp() throws IOException {
        int i;
        long j = this.zzm;
        if (this.zzo != j) {
            long j2 = j + 1;
            byte zza = zzhaz.zza(j);
            if (zza >= 0) {
                this.zzm++;
                return zza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j3 = 2 + j;
                int zza2 = (zzhaz.zza(j2) << 7) ^ zza;
                if (zza2 < 0) {
                    i = zza2 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int zza3 = (zzhaz.zza(j3) << Ascii.SO) ^ zza2;
                    if (zza3 >= 0) {
                        i = zza3 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int zza4 = zza3 ^ (zzhaz.zza(j4) << Ascii.NAK);
                        if (zza4 < 0) {
                            i = (-2080896) ^ zza4;
                        } else {
                            j4 = 5 + j;
                            byte zza5 = zzhaz.zza(j5);
                            int i2 = (zza4 ^ (zza5 << Ascii.FS)) ^ 266354560;
                            if (zza5 < 0) {
                                j5 = 6 + j;
                                if (zzhaz.zza(j4) < 0) {
                                    j4 = 7 + j;
                                    if (zzhaz.zza(j5) < 0) {
                                        j5 = 8 + j;
                                        if (zzhaz.zza(j4) < 0) {
                                            j4 = 9 + j;
                                            if (zzhaz.zza(j5) < 0) {
                                                long j6 = j + 10;
                                                if (zzhaz.zza(j4) >= 0) {
                                                    i = i2;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.zzm = j3;
                return i;
            }
        }
        return (int) zzC();
    }

    public final long zzr() throws IOException {
        long j;
        long j2;
        long j3 = this.zzm;
        if (this.zzo != j3) {
            long j4 = j3 + 1;
            byte zza = zzhaz.zza(j3);
            if (zza >= 0) {
                this.zzm++;
                return zza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j5 = 2 + j3;
                int zza2 = (zzhaz.zza(j4) << 7) ^ zza;
                if (zza2 < 0) {
                    j = zza2 ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int zza3 = (zzhaz.zza(j5) << Ascii.SO) ^ zza2;
                    if (zza3 >= 0) {
                        j = zza3 ^ 16256;
                    } else {
                        long j7 = 4 + j3;
                        int zza4 = zza3 ^ (zzhaz.zza(j6) << Ascii.NAK);
                        if (zza4 < 0) {
                            j = (-2080896) ^ zza4;
                            j5 = j7;
                        } else {
                            j6 = 5 + j3;
                            long zza5 = (zzhaz.zza(j7) << 28) ^ zza4;
                            if (zza5 >= 0) {
                                j = 266354560 ^ zza5;
                            } else {
                                long j8 = 6 + j3;
                                long zza6 = zza5 ^ (zzhaz.zza(j6) << 35);
                                if (zza6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    long j9 = 7 + j3;
                                    long zza7 = zza6 ^ (zzhaz.zza(j8) << 42);
                                    if (zza7 >= 0) {
                                        j = 4363953127296L ^ zza7;
                                    } else {
                                        j8 = 8 + j3;
                                        zza6 = zza7 ^ (zzhaz.zza(j9) << 49);
                                        if (zza6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j3;
                                            long zza8 = (zza6 ^ (zzhaz.zza(j8) << 56)) ^ 71499008037633920L;
                                            if (zza8 < 0) {
                                                long j10 = j3 + 10;
                                                if (zzhaz.zza(j9) >= 0) {
                                                    j = zza8;
                                                    j5 = j10;
                                                }
                                            } else {
                                                j = zza8;
                                            }
                                        }
                                    }
                                    j5 = j9;
                                }
                                j = j2 ^ zza6;
                                j5 = j8;
                            }
                        }
                    }
                    j5 = j6;
                }
                this.zzm = j5;
                return j;
            }
        }
        return zzC();
    }
}
