package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
final class zzhhd extends zzhhg {
    private final Iterable zza;
    private final Iterator zzg;
    private ByteBuffer zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;

    /* synthetic */ zzhhd(Iterable iterable, int i, boolean z, byte[] bArr) {
        super(null);
        this.zzk = Integer.MAX_VALUE;
        this.zzi = i;
        this.zza = iterable;
        this.zzg = iterable.iterator();
        this.zzm = 0;
        if (i != 0) {
            zzO();
            return;
        }
        this.zzh = zzhiu.zzc;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = 0L;
    }

    private final void zzN() throws zzhiw {
        if (!this.zzg.hasNext()) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        zzO();
    }

    private final void zzO() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzg.next();
        this.zzh = byteBuffer;
        this.zzm += (int) (this.zzn - this.zzo);
        long position = byteBuffer.position();
        this.zzn = position;
        this.zzo = position;
        this.zzp = this.zzh.limit();
        long zzs = zzhlc.zzs(this.zzh);
        this.zzn += zzs;
        this.zzo += zzs;
        this.zzp += zzs;
    }

    private final void zzP() {
        int i = this.zzi + this.zzj;
        this.zzi = i;
        int i2 = this.zzk;
        if (i <= i2) {
            this.zzj = 0;
            return;
        }
        int i3 = i - i2;
        this.zzj = i3;
        this.zzi = i - i3;
    }

    private final void zzQ(byte[] bArr, int i, int i2) throws IOException {
        if (i2 > zzR()) {
            if (i2 > 0) {
                throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (this.zzp - this.zzn == 0) {
                zzN();
            }
            int min = Math.min(i3, (int) (this.zzp - this.zzn));
            long j = min;
            zzhlc.zzq(this.zzn, bArr, i2 - i3, j);
            i3 -= min;
            this.zzn += j;
        }
    }

    private final int zzR() {
        return (int) (((this.zzi - this.zzm) - this.zzn) + this.zzo);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzA(int i) {
        this.zzk = i;
        zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzB() throws IOException {
        return (((long) this.zzm) + this.zzn) - this.zzo == ((long) this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzC() {
        return (int) ((this.zzm + this.zzn) - this.zzo);
    }

    public final byte zzD() throws IOException {
        if (this.zzp - this.zzn == 0) {
            zzN();
        }
        long j = this.zzn;
        this.zzn = 1 + j;
        return zzhlc.zzr(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzl = 0;
            return 0;
        }
        int zzu = zzu();
        this.zzl = zzu;
        if ((zzu >>> 3) != 0) {
            return zzu;
        }
        throw new zzhiw("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzb(int i) throws zzhiw {
        if (this.zzl != i) {
            throw new zzhiw("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzf() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzg() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzh() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzi() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzk() throws IOException {
        return zzv() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final String zzl() throws IOException {
        int zzu = zzu();
        if (zzu > 0) {
            long j = this.zzp;
            long j2 = this.zzn;
            long j3 = zzu;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[zzu];
                zzhlc.zzq(j2, bArr, 0L, j3);
                String str = new String(bArr, zzhiu.zza);
                this.zzn += j3;
                return str;
            }
        }
        if (zzu > 0 && zzu <= zzR()) {
            byte[] bArr2 = new byte[zzu];
            zzQ(bArr2, 0, zzu);
            return new String(bArr2, zzhiu.zza);
        }
        if (zzu == 0) {
            return "";
        }
        if (zzu < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final String zzm() throws IOException {
        int zzu = zzu();
        if (zzu > 0) {
            long j = this.zzp;
            long j2 = this.zzn;
            long j3 = zzu;
            if (j3 <= j - j2) {
                String zze = zzhlh.zze(this.zzh, (int) (j2 - this.zzo), zzu);
                this.zzn += j3;
                return zze;
            }
        }
        if (zzu >= 0 && zzu <= zzR()) {
            byte[] bArr = new byte[zzu];
            zzQ(bArr, 0, zzu);
            return zzhlh.zzf(bArr, 0, zzu);
        }
        if (zzu == 0) {
            return "";
        }
        if (zzu <= 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final zzhhb zzn() throws IOException {
        int zzu = zzu();
        if (zzu > 0) {
            long j = this.zzp;
            long j2 = this.zzn;
            long j3 = zzu;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[zzu];
                zzhlc.zzq(j2, bArr, 0L, j3);
                this.zzn += j3;
                zzhhb zzhhbVar = zzhhb.zzb;
                return new zzhgz(bArr);
            }
        }
        if (zzu > 0 && zzu <= zzR()) {
            byte[] bArr2 = new byte[zzu];
            zzQ(bArr2, 0, zzu);
            zzhhb zzhhbVar2 = zzhhb.zzb;
            return new zzhgz(bArr2);
        }
        if (zzu == 0) {
            return zzhhb.zzb;
        }
        if (zzu < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzo() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzp() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzq() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzr() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzs() throws IOException {
        return zzK(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzt() throws IOException {
        return zzL(zzv());
    }

    final long zzw() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzD() & 128) == 0) {
                return j;
            }
        }
        throw new zzhiw("CodedInputStream encountered a malformed varint.");
    }

    public final int zzx() throws IOException {
        long j = this.zzp;
        long j2 = this.zzn;
        if (j - j2 < 4) {
            int zzD = zzD() & 255;
            int zzD2 = (zzD() & 255) << 8;
            return zzD | zzD2 | ((zzD() & 255) << 16) | ((zzD() & 255) << 24);
        }
        this.zzn = 4 + j2;
        int zzr = zzhlc.zzr(j2) & 255;
        int zzr2 = (zzhlc.zzr(1 + j2) & 255) << 8;
        return zzr | zzr2 | ((zzhlc.zzr(2 + j2) & 255) << 16) | ((zzhlc.zzr(j2 + 3) & 255) << 24);
    }

    public final long zzy() throws IOException {
        long j = this.zzp;
        long j2 = this.zzn;
        if (j - j2 < 8) {
            return ((zzD() & 255) << 56) | (zzD() & 255) | ((zzD() & 255) << 8) | ((zzD() & 255) << 16) | ((zzD() & 255) << 24) | ((zzD() & 255) << 32) | ((zzD() & 255) << 40) | ((zzD() & 255) << 48);
        }
        this.zzn = 8 + j2;
        long zzr = zzhlc.zzr(j2) & 255;
        long zzr2 = (zzhlc.zzr(1 + j2) & 255) << 8;
        return zzr | zzr2 | ((zzhlc.zzr(j2 + 2) & 255) << 16) | ((zzhlc.zzr(3 + j2) & 255) << 24) | ((zzhlc.zzr(j2 + 4) & 255) << 32) | ((zzhlc.zzr(j2 + 5) & 255) << 40) | ((zzhlc.zzr(j2 + 6) & 255) << 48) | ((zzhlc.zzr(j2 + 7) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzz(int i) throws zzhiw {
        if (i < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int zzC = i + zzC();
        int i2 = this.zzk;
        if (zzC > i2) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = zzC;
        zzP();
        return i2;
    }

    public final void zzE(int i) throws IOException {
        if (i >= 0) {
            if (i <= ((this.zzi - this.zzm) - this.zzn) + this.zzo) {
                while (i > 0) {
                    if (this.zzp - this.zzn == 0) {
                        zzN();
                    }
                    int min = Math.min(i, (int) (this.zzp - this.zzn));
                    i -= min;
                    this.zzn += min;
                }
                return;
            }
        }
        if (i >= 0) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzc(int i) throws IOException {
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (zzD() >= 0) {
                    return true;
                }
            }
            throw new zzhiw("CodedInputStream encountered a malformed varint.");
        }
        if (i2 == 1) {
            zzE(8);
            return true;
        }
        if (i2 == 2) {
            zzE(zzu());
            return true;
        }
        if (i2 == 3) {
            zzJ();
            zzb(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            zzI();
            return false;
        }
        if (i2 != 5) {
            throw new zzhiv("Protocol message tag had invalid wire type.");
        }
        zzE(4);
        return true;
    }

    public final int zzu() throws IOException {
        int i;
        long j = this.zzn;
        if (this.zzp != j) {
            long j2 = j + 1;
            byte zzr = zzhlc.zzr(j);
            if (zzr >= 0) {
                this.zzn++;
                return zzr;
            }
            if (this.zzp - this.zzn >= 10) {
                long j3 = 2 + j;
                int zzr2 = (zzhlc.zzr(j2) << 7) ^ zzr;
                if (zzr2 < 0) {
                    i = zzr2 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int zzr3 = (zzhlc.zzr(j3) << Ascii.SO) ^ zzr2;
                    if (zzr3 >= 0) {
                        i = zzr3 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int zzr4 = zzr3 ^ (zzhlc.zzr(j4) << Ascii.NAK);
                        if (zzr4 < 0) {
                            i = (-2080896) ^ zzr4;
                        } else {
                            j4 = 5 + j;
                            byte zzr5 = zzhlc.zzr(j5);
                            int i2 = (zzr4 ^ (zzr5 << Ascii.FS)) ^ 266354560;
                            if (zzr5 < 0) {
                                j5 = 6 + j;
                                if (zzhlc.zzr(j4) < 0) {
                                    j4 = 7 + j;
                                    if (zzhlc.zzr(j5) < 0) {
                                        j5 = 8 + j;
                                        if (zzhlc.zzr(j4) < 0) {
                                            j4 = 9 + j;
                                            if (zzhlc.zzr(j5) < 0) {
                                                long j6 = j + 10;
                                                if (zzhlc.zzr(j4) >= 0) {
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
                this.zzn = j3;
                return i;
            }
        }
        return (int) zzw();
    }

    public final long zzv() throws IOException {
        long j;
        long j2;
        long j3 = this.zzn;
        if (this.zzp != j3) {
            long j4 = j3 + 1;
            byte zzr = zzhlc.zzr(j3);
            if (zzr >= 0) {
                this.zzn++;
                return zzr;
            }
            if (this.zzp - this.zzn >= 10) {
                long j5 = 2 + j3;
                int zzr2 = (zzhlc.zzr(j4) << 7) ^ zzr;
                if (zzr2 < 0) {
                    j = zzr2 ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int zzr3 = (zzhlc.zzr(j5) << Ascii.SO) ^ zzr2;
                    if (zzr3 >= 0) {
                        j = zzr3 ^ 16256;
                    } else {
                        long j7 = 4 + j3;
                        int zzr4 = zzr3 ^ (zzhlc.zzr(j6) << Ascii.NAK);
                        if (zzr4 < 0) {
                            j = (-2080896) ^ zzr4;
                            j5 = j7;
                        } else {
                            j6 = 5 + j3;
                            long zzr5 = (zzhlc.zzr(j7) << 28) ^ zzr4;
                            if (zzr5 >= 0) {
                                j = 266354560 ^ zzr5;
                            } else {
                                long j8 = 6 + j3;
                                long zzr6 = zzr5 ^ (zzhlc.zzr(j6) << 35);
                                if (zzr6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    long j9 = 7 + j3;
                                    long zzr7 = zzr6 ^ (zzhlc.zzr(j8) << 42);
                                    if (zzr7 >= 0) {
                                        j = 4363953127296L ^ zzr7;
                                    } else {
                                        j8 = 8 + j3;
                                        zzr6 = zzr7 ^ (zzhlc.zzr(j9) << 49);
                                        if (zzr6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j3;
                                            long zzr8 = (zzr6 ^ (zzhlc.zzr(j8) << 56)) ^ 71499008037633920L;
                                            if (zzr8 < 0) {
                                                long j10 = j3 + 10;
                                                if (zzhlc.zzr(j9) >= 0) {
                                                    j5 = j10;
                                                    j = zzr8;
                                                }
                                            } else {
                                                j = zzr8;
                                            }
                                        }
                                    }
                                    j5 = j9;
                                }
                                j = j2 ^ zzr6;
                                j5 = j8;
                            }
                        }
                    }
                    j5 = j6;
                }
                this.zzn = j5;
                return j;
            }
        }
        return zzw();
    }
}
