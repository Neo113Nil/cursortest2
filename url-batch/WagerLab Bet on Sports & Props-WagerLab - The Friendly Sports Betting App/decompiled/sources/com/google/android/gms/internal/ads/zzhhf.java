package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
final class zzhhf extends zzhhg {
    public static final /* synthetic */ int zza = 0;
    private final ByteBuffer zzg;
    private final long zzh;
    private long zzi;
    private long zzj;
    private final long zzk;
    private int zzl;
    private int zzm;
    private int zzn;

    /* synthetic */ zzhhf(ByteBuffer byteBuffer, boolean z, byte[] bArr) {
        super(null);
        this.zzn = Integer.MAX_VALUE;
        this.zzg = byteBuffer.duplicate();
        long zzs = zzhlc.zzs(byteBuffer);
        this.zzh = zzs;
        this.zzi = byteBuffer.limit() + zzs;
        long position = zzs + byteBuffer.position();
        this.zzj = position;
        this.zzk = position;
    }

    private final void zzN() {
        long j = this.zzi + this.zzl;
        this.zzi = j;
        int i = (int) (j - this.zzk);
        int i2 = this.zzn;
        if (i <= i2) {
            this.zzl = 0;
            return;
        }
        int i3 = i - i2;
        this.zzl = i3;
        this.zzi = j - i3;
    }

    private final int zzO() {
        return (int) (this.zzi - this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzA(int i) {
        this.zzn = i;
        zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzB() throws IOException {
        return this.zzj == this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzC() {
        return (int) (this.zzj - this.zzk);
    }

    public final byte zzD() throws IOException {
        long j = this.zzj;
        if (j == this.zzi) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = 1 + j;
        return zzhlc.zzr(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzm = 0;
            return 0;
        }
        int zzu = zzu();
        this.zzm = zzu;
        if ((zzu >>> 3) != 0) {
            return zzu;
        }
        throw new zzhiw("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzb(int i) throws zzhiw {
        if (this.zzm != i) {
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
        if (zzu <= 0 || zzu > zzO()) {
            if (zzu == 0) {
                return "";
            }
            if (zzu < 0) {
                throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[zzu];
        long j = zzu;
        zzhlc.zzq(this.zzj, bArr, 0L, j);
        String str = new String(bArr, zzhiu.zza);
        this.zzj += j;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final String zzm() throws IOException {
        int zzu = zzu();
        if (zzu > 0 && zzu <= zzO()) {
            String zze = zzhlh.zze(this.zzg, (int) (this.zzj - this.zzh), zzu);
            this.zzj += zzu;
            return zze;
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
        if (zzu <= 0 || zzu > zzO()) {
            if (zzu == 0) {
                return zzhhb.zzb;
            }
            if (zzu < 0) {
                throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[zzu];
        long j = zzu;
        zzhlc.zzq(this.zzj, bArr, 0L, j);
        this.zzj += j;
        zzhhb zzhhbVar = zzhhb.zzb;
        return new zzhgz(bArr);
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
        long j = this.zzj;
        if (this.zzi - j < 4) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = 4 + j;
        int zzr = zzhlc.zzr(j) & 255;
        int zzr2 = zzhlc.zzr(1 + j) & 255;
        int zzr3 = zzhlc.zzr(2 + j) & 255;
        return ((zzhlc.zzr(j + 3) & 255) << 24) | (zzr2 << 8) | zzr | (zzr3 << 16);
    }

    public final long zzy() throws IOException {
        long j = this.zzj;
        if (this.zzi - j < 8) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = 8 + j;
        long zzr = zzhlc.zzr(j);
        long zzr2 = zzhlc.zzr(1 + j);
        long zzr3 = zzhlc.zzr(2 + j);
        long zzr4 = zzhlc.zzr(3 + j);
        long zzr5 = zzhlc.zzr(4 + j);
        return ((zzhlc.zzr(j + 7) & 255) << 56) | (zzr & 255) | ((zzr2 & 255) << 8) | ((zzr3 & 255) << 16) | ((zzr4 & 255) << 24) | ((zzr5 & 255) << 32) | ((zzhlc.zzr(5 + j) & 255) << 40) | ((zzhlc.zzr(6 + j) & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzz(int i) throws zzhiw {
        if (i < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int zzC = i + zzC();
        int i2 = this.zzn;
        if (zzC > i2) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzn = zzC;
        zzN();
        return i2;
    }

    public final void zzE(int i) throws IOException {
        if (i >= 0 && i <= zzO()) {
            this.zzj += i;
        } else {
            if (i >= 0) {
                throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzc(int i) throws IOException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (zzO() < 10) {
                while (i3 < 10) {
                    if (zzD() < 0) {
                        i3++;
                    }
                }
                throw new zzhiw("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                long j = this.zzj;
                this.zzj = 1 + j;
                if (zzhlc.zzr(j) < 0) {
                    i3++;
                }
            }
            throw new zzhiw("CodedInputStream encountered a malformed varint.");
            return true;
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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (com.google.android.gms.internal.ads.zzhlc.zzr(r3) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzu() throws IOException {
        int i;
        long j = this.zzj;
        if (this.zzi != j) {
            long j2 = 1 + j;
            byte zzr = zzhlc.zzr(j);
            if (zzr >= 0) {
                this.zzj = j2;
                return zzr;
            }
            if (this.zzi - j2 >= 9) {
                long j3 = 2 + j;
                int zzr2 = (zzhlc.zzr(j2) << 7) ^ zzr;
                if (zzr2 < 0) {
                    i = zzr2 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int zzr3 = zzr2 ^ (zzhlc.zzr(j3) << Ascii.SO);
                    if (zzr3 >= 0) {
                        i = zzr3 ^ 16256;
                    } else {
                        j3 = 4 + j;
                        int zzr4 = zzr3 ^ (zzhlc.zzr(j4) << Ascii.NAK);
                        if (zzr4 < 0) {
                            i = (-2080896) ^ zzr4;
                        } else {
                            j4 = 5 + j;
                            byte zzr5 = zzhlc.zzr(j3);
                            int i2 = (zzr4 ^ (zzr5 << Ascii.FS)) ^ 266354560;
                            if (zzr5 < 0) {
                                j3 = 6 + j;
                                if (zzhlc.zzr(j4) < 0) {
                                    j4 = 7 + j;
                                    if (zzhlc.zzr(j3) < 0) {
                                        j3 = 8 + j;
                                        if (zzhlc.zzr(j4) < 0) {
                                            j4 = j + 9;
                                            if (zzhlc.zzr(j3) < 0) {
                                                j3 = 10 + j;
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                    }
                    j3 = j4;
                }
                this.zzj = j3;
                return i;
            }
        }
        return (int) zzw();
    }

    public final long zzv() throws IOException {
        long j;
        long j2;
        int i;
        long j3 = this.zzj;
        if (this.zzi != j3) {
            long j4 = 1 + j3;
            byte zzr = zzhlc.zzr(j3);
            if (zzr >= 0) {
                this.zzj = j4;
                return zzr;
            }
            if (this.zzi - j4 >= 9) {
                long j5 = 2 + j3;
                int zzr2 = (zzhlc.zzr(j4) << 7) ^ zzr;
                if (zzr2 >= 0) {
                    long j6 = 3 + j3;
                    int zzr3 = zzr2 ^ (zzhlc.zzr(j5) << Ascii.SO);
                    if (zzr3 >= 0) {
                        j = zzr3 ^ 16256;
                    } else {
                        j5 = 4 + j3;
                        int zzr4 = zzr3 ^ (zzhlc.zzr(j6) << Ascii.NAK);
                        if (zzr4 < 0) {
                            i = (-2080896) ^ zzr4;
                        } else {
                            j6 = 5 + j3;
                            long zzr5 = (zzhlc.zzr(j5) << 28) ^ zzr4;
                            if (zzr5 < 0) {
                                long j7 = 6 + j3;
                                long zzr6 = (zzhlc.zzr(j6) << 35) ^ zzr5;
                                if (zzr6 >= 0) {
                                    j5 = j3 + 7;
                                    long zzr7 = zzr6 ^ (zzhlc.zzr(j7) << 42);
                                    if (zzr7 >= 0) {
                                        j = 4363953127296L ^ zzr7;
                                    } else {
                                        j7 = 8 + j3;
                                        zzr6 = zzr7 ^ (zzhlc.zzr(j5) << 49);
                                        if (zzr6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j5 = j3 + 9;
                                            long zzr8 = (zzr6 ^ (zzhlc.zzr(j7) << 56)) ^ 71499008037633920L;
                                            if (zzr8 < 0) {
                                                long j8 = j3 + 10;
                                                if (zzhlc.zzr(j5) >= 0) {
                                                    j5 = j8;
                                                }
                                            }
                                            j = zzr8;
                                        }
                                    }
                                    this.zzj = j5;
                                    return j;
                                }
                                j2 = -34093383808L;
                                j = j2 ^ zzr6;
                                j5 = j7;
                                this.zzj = j5;
                                return j;
                            }
                            j = 266354560 ^ zzr5;
                        }
                    }
                    j5 = j6;
                    this.zzj = j5;
                    return j;
                }
                i = zzr2 ^ (-128);
                j = i;
                this.zzj = j5;
                return j;
            }
        }
        return zzw();
    }
}
