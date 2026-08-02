package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzahj implements zzack {
    private static final byte[] zza = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final UUID zze;
    private static final Map zzf;
    private long zzA;
    private long zzB;
    private zzahi zzC;
    private boolean zzD;
    private int zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private long zzJ;
    private zzeb zzK;
    private zzeb zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private long zzP;
    private long zzQ;
    private int zzR;
    private int zzS;
    private int[] zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private long zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private int zzag;
    private byte zzah;
    private boolean zzai;
    private zzacn zzaj;
    private final zzahf zzg;
    private final zzahl zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzajy zzl;
    private final zzek zzm;
    private final zzek zzn;
    private final zzek zzo;
    private final zzek zzp;
    private final zzek zzq;
    private final zzek zzr;
    private final zzek zzs;
    private final zzek zzt;
    private final zzek zzu;
    private final zzek zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i = zzet.zza;
        zzb = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(zzfuj.zzc);
        zzc = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zzd = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zze = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", Integer.valueOf(Opcodes.GETFIELD));
        hashMap.put("htc_video_rotA-270", 270);
        zzf = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public zzahj() {
        this(new zzahd(), 2, zzajy.zza);
    }

    private static int[] zzA(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @RequiresNonNull({"#2.output"})
    private final int zzq(zzacl zzaclVar, zzahi zzahiVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzahiVar.zzb)) {
            zzy(zzaclVar, zza, i);
            int i3 = this.zzab;
            zzx();
            return i3;
        }
        if ("S_TEXT/ASS".equals(zzahiVar.zzb)) {
            zzy(zzaclVar, zzc, i);
            int i4 = this.zzab;
            zzx();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(zzahiVar.zzb)) {
            zzy(zzaclVar, zzd, i);
            int i5 = this.zzab;
            zzx();
            return i5;
        }
        zzadp zzadpVar = zzahiVar.zzW;
        if (!this.zzad) {
            if (zzahiVar.zzg) {
                this.zzW &= -1073741825;
                if (!this.zzae) {
                    ((zzaby) zzaclVar).zzn(this.zzo.zzM(), 0, 1, false);
                    this.zzaa++;
                    if ((this.zzo.zzM()[0] & 128) == 128) {
                        throw zzbo.zza("Extension bit is set in signal byte", null);
                    }
                    this.zzah = this.zzo.zzM()[0];
                    this.zzae = true;
                }
                byte b = this.zzah;
                if ((b & 1) == 1) {
                    int i6 = b & 2;
                    this.zzW |= 1073741824;
                    if (!this.zzai) {
                        ((zzaby) zzaclVar).zzn(this.zzt.zzM(), 0, 8, false);
                        this.zzaa += 8;
                        this.zzai = true;
                        this.zzo.zzM()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                        this.zzo.zzK(0);
                        zzadpVar.zzr(this.zzo, 1, 1);
                        this.zzab++;
                        this.zzt.zzK(0);
                        zzadpVar.zzr(this.zzt, 8, 1);
                        this.zzab += 8;
                    }
                    if (i6 == 2) {
                        if (!this.zzaf) {
                            ((zzaby) zzaclVar).zzn(this.zzo.zzM(), 0, 1, false);
                            this.zzaa++;
                            this.zzo.zzK(0);
                            this.zzag = this.zzo.zzm();
                            this.zzaf = true;
                        }
                        int i7 = this.zzag * 4;
                        this.zzo.zzH(i7);
                        ((zzaby) zzaclVar).zzn(this.zzo.zzM(), 0, i7, false);
                        this.zzaa += i7;
                        int i8 = (this.zzag >> 1) + 1;
                        int i9 = (i8 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.zzw = ByteBuffer.allocate(i9);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i8);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i2 = this.zzag;
                            if (i10 >= i2) {
                                break;
                            }
                            int zzp = this.zzo.zzp();
                            int i12 = zzp - i11;
                            if (i10 % 2 == 0) {
                                this.zzw.putShort((short) i12);
                            } else {
                                this.zzw.putInt(i12);
                            }
                            i10++;
                            i11 = zzp;
                        }
                        int i13 = (i - this.zzaa) - i11;
                        if ((i2 & 1) == 1) {
                            this.zzw.putInt(i13);
                        } else {
                            this.zzw.putShort((short) i13);
                            this.zzw.putInt(0);
                        }
                        this.zzu.zzI(this.zzw.array(), i9);
                        zzadpVar.zzr(this.zzu, i9, 1);
                        this.zzab += i9;
                    }
                }
            } else {
                byte[] bArr = zzahiVar.zzh;
                if (bArr != null) {
                    this.zzr.zzI(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzahiVar.zzb) ? zzahiVar.zzf > 0 : z) {
                this.zzW |= 268435456;
                this.zzv.zzH(0);
                int zze2 = (this.zzr.zze() + i) - this.zzaa;
                this.zzo.zzH(4);
                this.zzo.zzM()[0] = (byte) ((zze2 >> 24) & 255);
                this.zzo.zzM()[1] = (byte) ((zze2 >> 16) & 255);
                this.zzo.zzM()[2] = (byte) ((zze2 >> 8) & 255);
                this.zzo.zzM()[3] = (byte) (zze2 & 255);
                zzadpVar.zzr(this.zzo, 4, 2);
                this.zzab += 4;
            }
            this.zzad = true;
        }
        int zze3 = i + this.zzr.zze();
        if (!"V_MPEG4/ISO/AVC".equals(zzahiVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzahiVar.zzb)) {
            if (zzahiVar.zzT != null) {
                zzdi.zzf(this.zzr.zze() == 0);
                zzahiVar.zzT.zzd(zzaclVar);
            }
            while (true) {
                int i14 = this.zzaa;
                if (i14 >= zze3) {
                    break;
                }
                int zzr = zzr(zzaclVar, zzadpVar, zze3 - i14);
                this.zzaa += zzr;
                this.zzab += zzr;
            }
        } else {
            byte[] zzM = this.zzn.zzM();
            zzM[0] = 0;
            zzM[1] = 0;
            zzM[2] = 0;
            int i15 = zzahiVar.zzX;
            int i16 = 4 - i15;
            while (this.zzaa < zze3) {
                int i17 = this.zzac;
                if (i17 == 0) {
                    int min = Math.min(i15, this.zzr.zzb());
                    ((zzaby) zzaclVar).zzn(zzM, i16 + min, i15 - min, false);
                    if (min > 0) {
                        this.zzr.zzG(zzM, i16, min);
                    }
                    this.zzaa += i15;
                    this.zzn.zzK(0);
                    this.zzac = this.zzn.zzp();
                    this.zzm.zzK(0);
                    zzadpVar.zzq(this.zzm, 4);
                    this.zzab += 4;
                } else {
                    int zzr2 = zzr(zzaclVar, zzadpVar, i17);
                    this.zzaa += zzr2;
                    this.zzab += zzr2;
                    this.zzac -= zzr2;
                }
            }
        }
        if ("A_VORBIS".equals(zzahiVar.zzb)) {
            this.zzp.zzK(0);
            zzadpVar.zzq(this.zzp, 4);
            this.zzab += 4;
        }
        int i18 = this.zzab;
        zzx();
        return i18;
    }

    private final int zzr(zzacl zzaclVar, zzadp zzadpVar, int i) throws IOException {
        int zzb2 = this.zzr.zzb();
        if (zzb2 <= 0) {
            return zzadpVar.zzf(zzaclVar, i, false);
        }
        int min = Math.min(i, zzb2);
        zzadpVar.zzq(this.zzr, min);
        return min;
    }

    private final long zzs(long j) throws zzbo {
        long j2 = this.zzz;
        if (j2 != -9223372036854775807L) {
            return zzet.zzt(j, j2, 1000L, RoundingMode.FLOOR);
        }
        throw zzbo.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzt(int i) throws zzbo {
        if (this.zzK == null || this.zzL == null) {
            throw zzbo.zza("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzu(int i) throws zzbo {
        if (this.zzC != null) {
            return;
        }
        throw zzbo.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0 A[EDGE_INSN: B:50:0x00e0->B:49:0x00e0 BREAK  A[LOOP:0: B:42:0x00c5->B:46:0x00dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    @RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzv(zzahi zzahiVar, long j, int i, int i2, int i3) {
        char c;
        byte[] zzz;
        int i4;
        int zzd2;
        int zze2;
        zzadq zzadqVar = zzahiVar.zzT;
        if (zzadqVar != null) {
            zzadqVar.zzc(zzahiVar.zzW, j, i, i2, i3, zzahiVar.zzi);
        } else {
            if ("S_TEXT/UTF8".equals(zzahiVar.zzb) || "S_TEXT/ASS".equals(zzahiVar.zzb) || "S_TEXT/WEBVTT".equals(zzahiVar.zzb)) {
                if (this.zzS > 1) {
                    zzea.zzf("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.zzQ;
                    if (j2 == -9223372036854775807L) {
                        zzea.zzf("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = zzahiVar.zzb;
                        byte[] zzM = this.zzs.zzM();
                        int hashCode = str.hashCode();
                        if (hashCode == 738597099) {
                            if (str.equals("S_TEXT/ASS")) {
                                c = 1;
                                if (c != 0) {
                                }
                                System.arraycopy(zzz, 0, zzM, i4, zzz.length);
                                zzd2 = this.zzs.zzd();
                                while (true) {
                                    if (zzd2 >= this.zzs.zze()) {
                                    }
                                    zzd2++;
                                }
                                zzadp zzadpVar = zzahiVar.zzW;
                                zzek zzekVar = this.zzs;
                                zzadpVar.zzq(zzekVar, zzekVar.zze());
                                zze2 = i2 + this.zzs.zze();
                                if ((i & 268435456) != 0) {
                                }
                                zzahiVar.zzW.zzs(j, i, zze2, i3, zzahiVar.zzi);
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            System.arraycopy(zzz, 0, zzM, i4, zzz.length);
                            zzd2 = this.zzs.zzd();
                            while (true) {
                                if (zzd2 >= this.zzs.zze()) {
                                }
                                zzd2++;
                            }
                            zzadp zzadpVar2 = zzahiVar.zzW;
                            zzek zzekVar2 = this.zzs;
                            zzadpVar2.zzq(zzekVar2, zzekVar2.zze());
                            zze2 = i2 + this.zzs.zze();
                            if ((i & 268435456) != 0) {
                            }
                            zzahiVar.zzW.zzs(j, i, zze2, i3, zzahiVar.zzi);
                        } else if (hashCode != 1045209816) {
                            if (hashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                                c = 0;
                                if (c != 0) {
                                    zzz = zzz(j2, "%02d:%02d:%02d,%03d", 1000L);
                                    i4 = 19;
                                } else if (c == 1) {
                                    zzz = zzz(j2, "%01d:%02d:%02d:%02d", WorkRequest.MIN_BACKOFF_MILLIS);
                                    i4 = 21;
                                } else {
                                    if (c != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    zzz = zzz(j2, "%02d:%02d:%02d.%03d", 1000L);
                                    i4 = 25;
                                }
                                System.arraycopy(zzz, 0, zzM, i4, zzz.length);
                                zzd2 = this.zzs.zzd();
                                while (true) {
                                    if (zzd2 >= this.zzs.zze()) {
                                        break;
                                    }
                                    if (this.zzs.zzM()[zzd2] == 0) {
                                        this.zzs.zzJ(zzd2);
                                        break;
                                    }
                                    zzd2++;
                                }
                                zzadp zzadpVar22 = zzahiVar.zzW;
                                zzek zzekVar22 = this.zzs;
                                zzadpVar22.zzq(zzekVar22, zzekVar22.zze());
                                zze2 = i2 + this.zzs.zze();
                                if ((i & 268435456) != 0) {
                                    if (this.zzS > 1) {
                                        this.zzv.zzH(0);
                                    } else {
                                        int zze3 = this.zzv.zze();
                                        zzahiVar.zzW.zzr(this.zzv, zze3, 2);
                                        zze2 += zze3;
                                    }
                                }
                                zzahiVar.zzW.zzs(j, i, zze2, i3, zzahiVar.zzi);
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            System.arraycopy(zzz, 0, zzM, i4, zzz.length);
                            zzd2 = this.zzs.zzd();
                            while (true) {
                                if (zzd2 >= this.zzs.zze()) {
                                }
                                zzd2++;
                            }
                            zzadp zzadpVar222 = zzahiVar.zzW;
                            zzek zzekVar222 = this.zzs;
                            zzadpVar222.zzq(zzekVar222, zzekVar222.zze());
                            zze2 = i2 + this.zzs.zze();
                            if ((i & 268435456) != 0) {
                            }
                            zzahiVar.zzW.zzs(j, i, zze2, i3, zzahiVar.zzi);
                        } else {
                            if (str.equals("S_TEXT/WEBVTT")) {
                                c = 2;
                                if (c != 0) {
                                }
                                System.arraycopy(zzz, 0, zzM, i4, zzz.length);
                                zzd2 = this.zzs.zzd();
                                while (true) {
                                    if (zzd2 >= this.zzs.zze()) {
                                    }
                                    zzd2++;
                                }
                                zzadp zzadpVar2222 = zzahiVar.zzW;
                                zzek zzekVar2222 = this.zzs;
                                zzadpVar2222.zzq(zzekVar2222, zzekVar2222.zze());
                                zze2 = i2 + this.zzs.zze();
                                if ((i & 268435456) != 0) {
                                }
                                zzahiVar.zzW.zzs(j, i, zze2, i3, zzahiVar.zzi);
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            System.arraycopy(zzz, 0, zzM, i4, zzz.length);
                            zzd2 = this.zzs.zzd();
                            while (true) {
                                if (zzd2 >= this.zzs.zze()) {
                                }
                                zzd2++;
                            }
                            zzadp zzadpVar22222 = zzahiVar.zzW;
                            zzek zzekVar22222 = this.zzs;
                            zzadpVar22222.zzq(zzekVar22222, zzekVar22222.zze());
                            zze2 = i2 + this.zzs.zze();
                            if ((i & 268435456) != 0) {
                            }
                            zzahiVar.zzW.zzs(j, i, zze2, i3, zzahiVar.zzi);
                        }
                    }
                }
            }
            zze2 = i2;
            if ((i & 268435456) != 0) {
            }
            zzahiVar.zzW.zzs(j, i, zze2, i3, zzahiVar.zzi);
        }
        this.zzN = true;
    }

    private final void zzw(zzacl zzaclVar, int i) throws IOException {
        if (this.zzo.zze() >= i) {
            return;
        }
        if (this.zzo.zzc() < i) {
            zzek zzekVar = this.zzo;
            int zzc2 = zzekVar.zzc();
            zzekVar.zzE(Math.max(zzc2 + zzc2, i));
        }
        zzek zzekVar2 = this.zzo;
        ((zzaby) zzaclVar).zzn(zzekVar2.zzM(), zzekVar2.zze(), i - zzekVar2.zze(), false);
        this.zzo.zzJ(i);
    }

    private final void zzx() {
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = 0;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = false;
        this.zzag = 0;
        this.zzah = (byte) 0;
        this.zzai = false;
        this.zzr.zzH(0);
    }

    private final void zzy(zzacl zzaclVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.zzs.zzc() < i2) {
            zzek zzekVar = this.zzs;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzekVar.zzI(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzs.zzM(), 0, length);
        }
        ((zzaby) zzaclVar).zzn(this.zzs.zzM(), length, i, false);
        this.zzs.zzK(0);
        this.zzs.zzJ(i2);
    }

    private static byte[] zzz(long j, String str, long j2) {
        zzdi.zzd(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer valueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = zzet.zza;
        return format.getBytes(zzfuj.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        this.zzN = false;
        while (!this.zzN) {
            if (!this.zzg.zzc(zzaclVar)) {
                for (int i = 0; i < this.zzi.size(); i++) {
                    zzahi zzahiVar = (zzahi) this.zzi.valueAt(i);
                    zzahiVar.zzW.getClass();
                    zzadq zzadqVar = zzahiVar.zzT;
                    if (zzadqVar != null) {
                        zzadqVar.zza(zzahiVar.zzW, zzahiVar.zzi);
                    }
                }
                return -1;
            }
            long zzf2 = zzaclVar.zzf();
            if (this.zzG) {
                this.zzI = zzf2;
                zzadfVar.zza = this.zzH;
                this.zzG = false;
                return 1;
            }
            if (this.zzD) {
                long j = this.zzI;
                if (j != -1) {
                    zzadfVar.zza = j;
                    this.zzI = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zzaj = zzacnVar;
        if (this.zzk) {
            zzacnVar = new zzakc(zzacnVar, this.zzl);
        }
        this.zzaj = zzacnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j, long j2) {
        this.zzJ = -9223372036854775807L;
        this.zzO = 0;
        this.zzg.zzb();
        this.zzh.zze();
        zzx();
        for (int i = 0; i < this.zzi.size(); i++) {
            zzadq zzadqVar = ((zzahi) this.zzi.valueAt(i)).zzT;
            if (zzadqVar != null) {
                zzadqVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        return new zzahk().zza(zzaclVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01e6, code lost:
    
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L188;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzk(int i) throws zzbo {
        int i2;
        int i3;
        zzadi zzadhVar;
        int i4;
        zzdi.zzb(this.zzaj);
        char c = '\b';
        if (i == 160) {
            if (this.zzO == 2) {
                zzahi zzahiVar = (zzahi) this.zzi.get(this.zzU);
                zzahiVar.zzW.getClass();
                if (this.zzZ > 0 && "A_OPUS".equals(zzahiVar.zzb)) {
                    zzek zzekVar = this.zzv;
                    byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzZ).array();
                    zzekVar.zzI(array, array.length);
                }
                int i5 = 0;
                for (int i6 = 0; i6 < this.zzS; i6++) {
                    i5 += this.zzT[i6];
                }
                int i7 = 0;
                while (i7 < this.zzS) {
                    long j = this.zzP + ((zzahiVar.zze * i7) / 1000);
                    int i8 = this.zzW;
                    if (i7 == 0) {
                        if (!this.zzY) {
                            i8 |= 1;
                        }
                        i3 = i8;
                        i2 = 0;
                    } else {
                        i2 = i7;
                        i3 = i8;
                    }
                    int i9 = this.zzT[i2];
                    int i10 = i5 - i9;
                    zzv(zzahiVar, j, i3, i9, i10);
                    i7 = i2 + 1;
                    i5 = i10;
                }
                this.zzO = 0;
                return;
            }
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i11 = this.zzE;
                if (i11 != -1) {
                    long j2 = this.zzF;
                    if (j2 != -1) {
                        if (i11 == 475249515) {
                            this.zzH = j2;
                            return;
                        }
                        return;
                    }
                }
                throw zzbo.zza("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i == 25152) {
                zzu(i);
                zzahi zzahiVar2 = this.zzC;
                if (zzahiVar2.zzg) {
                    if (zzahiVar2.zzi == null) {
                        throw zzbo.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzahiVar2.zzk = new zzy(null, new zzx(zzk.zza, null, "video/webm", this.zzC.zzi.zzb));
                    return;
                }
                return;
            }
            if (i == 28032) {
                zzu(i);
                zzahi zzahiVar3 = this.zzC;
                if (zzahiVar3.zzg && zzahiVar3.zzh != null) {
                    throw zzbo.zza("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.zzz == -9223372036854775807L) {
                    this.zzz = 1000000L;
                }
                long j3 = this.zzA;
                if (j3 != -9223372036854775807L) {
                    this.zzB = zzs(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.zzi.size() == 0) {
                    throw zzbo.zza("No valid tracks were found", null);
                }
                this.zzaj.zzD();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.zzD) {
                zzacn zzacnVar = this.zzaj;
                zzeb zzebVar = this.zzK;
                zzeb zzebVar2 = this.zzL;
                if (this.zzy == -1 || this.zzB == -9223372036854775807L || zzebVar == null || zzebVar.zza() == 0 || zzebVar2 == null || zzebVar2.zza() != zzebVar.zza()) {
                    zzadhVar = new zzadh(this.zzB, 0L);
                } else {
                    int zza2 = zzebVar.zza();
                    int[] iArr = new int[zza2];
                    long[] jArr = new long[zza2];
                    long[] jArr2 = new long[zza2];
                    long[] jArr3 = new long[zza2];
                    for (int i12 = 0; i12 < zza2; i12++) {
                        jArr3[i12] = zzebVar.zzb(i12);
                        jArr[i12] = this.zzy + zzebVar2.zzb(i12);
                    }
                    int i13 = 0;
                    while (true) {
                        i4 = zza2 - 1;
                        if (i13 >= i4) {
                            break;
                        }
                        int i14 = i13 + 1;
                        iArr[i13] = (int) (jArr[i14] - jArr[i13]);
                        jArr2[i13] = jArr3[i14] - jArr3[i13];
                        i13 = i14;
                    }
                    iArr[i4] = (int) ((this.zzy + this.zzx) - jArr[i4]);
                    long j4 = this.zzB - jArr3[i4];
                    jArr2[i4] = j4;
                    if (j4 <= 0) {
                        zzea.zzf("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j4);
                        iArr = Arrays.copyOf(iArr, i4);
                        jArr = Arrays.copyOf(jArr, i4);
                        jArr2 = Arrays.copyOf(jArr2, i4);
                        jArr3 = Arrays.copyOf(jArr3, i4);
                    }
                    zzadhVar = new zzabw(iArr, jArr, jArr2, jArr3);
                }
                zzacnVar.zzO(zzadhVar);
                this.zzD = true;
            }
            this.zzK = null;
            this.zzL = null;
            return;
        }
        zzahi zzahiVar4 = this.zzC;
        zzdi.zzb(zzahiVar4);
        String str = zzahiVar4.zzb;
        if (str == null) {
            throw zzbo.zza("CodecId is missing in TrackEntry element", null);
        }
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                zzahiVar4.zze(this.zzaj, zzahiVar4.zzc);
                this.zzi.put(zzahiVar4.zzc, zzahiVar4);
                break;
        }
        this.zzC = null;
    }

    protected final void zzn(int i, long j, long j2) throws zzbo {
        zzdi.zzb(this.zzaj);
        if (i == 160) {
            this.zzY = false;
            this.zzZ = 0L;
            return;
        }
        if (i == 174) {
            this.zzC = new zzahi();
            return;
        }
        if (i == 187) {
            this.zzM = false;
            return;
        }
        if (i == 19899) {
            this.zzE = -1;
            this.zzF = -1L;
            return;
        }
        if (i == 20533) {
            zzu(i);
            this.zzC.zzg = true;
            return;
        }
        if (i == 21968) {
            zzu(i);
            this.zzC.zzx = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzy;
            if (j3 != -1 && j3 != j) {
                throw zzbo.zza("Multiple Segment elements not supported", null);
            }
            this.zzy = j;
            this.zzx = j2;
            return;
        }
        if (i == 475249515) {
            this.zzK = new zzeb(32);
            this.zzL = new zzeb(32);
        } else if (i == 524531317 && !this.zzD) {
            if (this.zzj && this.zzH != -1) {
                this.zzG = true;
            } else {
                this.zzaj.zzO(new zzadh(this.zzB, 0L));
                this.zzD = true;
            }
        }
    }

    zzahj(zzahf zzahfVar, int i, zzajy zzajyVar) {
        this.zzy = -1L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzH = -1L;
        this.zzI = -1L;
        this.zzJ = -9223372036854775807L;
        this.zzg = zzahfVar;
        zzahfVar.zza(new zzahh(this, null));
        this.zzl = zzajyVar;
        this.zzj = 1 == ((i & 1) ^ 1);
        this.zzk = (i & 2) == 0;
        this.zzh = new zzahl();
        this.zzi = new SparseArray();
        this.zzo = new zzek(4);
        this.zzp = new zzek(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzek(4);
        this.zzm = new zzek(zzfh.zza);
        this.zzn = new zzek(4);
        this.zzr = new zzek();
        this.zzs = new zzek();
        this.zzt = new zzek(8);
        this.zzu = new zzek();
        this.zzv = new zzek();
        this.zzT = new int[1];
    }

    protected final void zzo(int i, String str) throws zzbo {
        if (i == 134) {
            zzu(i);
            this.zzC.zzb = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzbo.zza("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            zzu(i);
            this.zzC.zza = str;
        } else {
            if (i != 2274716) {
                return;
            }
            zzu(i);
            this.zzC.zzZ = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x028d, code lost:
    
        throw com.google.android.gms.internal.ads.zzbo.zza("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzh(int i, int i2, zzacl zzaclVar) throws IOException {
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        Throwable th = null;
        int i11 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.zzO != 2) {
                    return;
                }
                zzahi zzahiVar = (zzahi) this.zzi.get(this.zzU);
                if (this.zzX != 4 || !"V_VP9".equals(zzahiVar.zzb)) {
                    ((zzaby) zzaclVar).zzo(i2, false);
                    return;
                }
                this.zzv.zzH(i2);
                ((zzaby) zzaclVar).zzn(this.zzv.zzM(), 0, i2, false);
                return;
            }
            if (i10 == 16877) {
                zzu(i);
                zzahi zzahiVar2 = this.zzC;
                i8 = zzahiVar2.zzY;
                if (i8 != 1685485123) {
                    i9 = zzahiVar2.zzY;
                    if (i9 != 1685480259) {
                        ((zzaby) zzaclVar).zzo(i2, false);
                        return;
                    }
                }
                zzahiVar2.zzN = new byte[i2];
                ((zzaby) zzaclVar).zzn(zzahiVar2.zzN, 0, i2, false);
                return;
            }
            if (i10 == 16981) {
                zzu(i);
                zzahi zzahiVar3 = this.zzC;
                zzahiVar3.zzh = new byte[i2];
                ((zzaby) zzaclVar).zzn(zzahiVar3.zzh, 0, i2, false);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr = new byte[i2];
                ((zzaby) zzaclVar).zzn(bArr, 0, i2, false);
                zzu(i);
                this.zzC.zzi = new zzado(1, bArr, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(this.zzq.zzM(), (byte) 0);
                ((zzaby) zzaclVar).zzn(this.zzq.zzM(), 4 - i2, i2, false);
                this.zzq.zzK(0);
                this.zzE = (int) this.zzq.zzu();
                return;
            }
            if (i10 == 25506) {
                zzu(i);
                zzahi zzahiVar4 = this.zzC;
                zzahiVar4.zzj = new byte[i2];
                ((zzaby) zzaclVar).zzn(zzahiVar4.zzj, 0, i2, false);
                return;
            }
            if (i10 != 30322) {
                throw zzbo.zza("Unexpected id: " + i10, null);
            }
            zzu(i);
            zzahi zzahiVar5 = this.zzC;
            zzahiVar5.zzv = new byte[i2];
            ((zzaby) zzaclVar).zzn(zzahiVar5.zzv, 0, i2, false);
            return;
        }
        if (this.zzO == 0) {
            this.zzU = (int) this.zzh.zzd(zzaclVar, false, true, 8);
            this.zzV = this.zzh.zza();
            this.zzQ = -9223372036854775807L;
            this.zzO = 1;
            this.zzo.zzH(0);
        }
        zzahi zzahiVar6 = (zzahi) this.zzi.get(this.zzU);
        if (zzahiVar6 == null) {
            ((zzaby) zzaclVar).zzo(i2 - this.zzV, false);
            this.zzO = 0;
            return;
        }
        zzahiVar6.zzW.getClass();
        if (this.zzO == 1) {
            zzw(zzaclVar, 3);
            int i12 = (this.zzo.zzM()[2] & 6) >> 1;
            byte b = 255;
            if (i12 == 0) {
                this.zzS = 1;
                int[] zzA = zzA(this.zzT, 1);
                this.zzT = zzA;
                zzA[0] = (i2 - this.zzV) - 3;
            } else {
                zzw(zzaclVar, 4);
                int i13 = (this.zzo.zzM()[3] & 255) + 1;
                this.zzS = i13;
                int[] zzA2 = zzA(this.zzT, i13);
                this.zzT = zzA2;
                if (i12 == 2) {
                    int i14 = (i2 - this.zzV) - 4;
                    int i15 = this.zzS;
                    Arrays.fill(zzA2, 0, i15, i14 / i15);
                } else if (i12 == 1) {
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 4;
                    while (true) {
                        i4 = this.zzS - 1;
                        if (i16 >= i4) {
                            break;
                        }
                        this.zzT[i16] = 0;
                        while (true) {
                            i5 = i18 + 1;
                            zzw(zzaclVar, i5);
                            int i19 = this.zzo.zzM()[i18] & 255;
                            int[] iArr = this.zzT;
                            i6 = iArr[i16] + i19;
                            iArr[i16] = i6;
                            if (i19 != 255) {
                                break;
                            } else {
                                i18 = i5;
                            }
                        }
                        i17 += i6;
                        i16++;
                        i18 = i5;
                    }
                    this.zzT[i4] = ((i2 - this.zzV) - i18) - i17;
                } else {
                    if (i12 != 3) {
                        throw zzbo.zza("Unexpected lacing value: 2", null);
                    }
                    int i20 = 0;
                    int i21 = 4;
                    int i22 = 0;
                    while (true) {
                        int i23 = this.zzS - 1;
                        if (i20 >= i23) {
                            this.zzT[i23] = ((i2 - this.zzV) - i21) - i22;
                            break;
                        }
                        this.zzT[i20] = 0;
                        int i24 = i21 + 1;
                        zzw(zzaclVar, i24);
                        if (this.zzo.zzM()[i21] == 0) {
                            throw zzbo.zza("No valid varint length mask found", th);
                        }
                        int i25 = 0;
                        while (true) {
                            if (i25 >= 8) {
                                j = 0;
                                i3 = i24;
                                break;
                            }
                            int i26 = i11 << (7 - i25);
                            if ((this.zzo.zzM()[i21] & i26) != 0) {
                                int i27 = i24 + i25;
                                zzw(zzaclVar, i27);
                                j = this.zzo.zzM()[i21] & b & (~i26);
                                int i28 = i21 + 1;
                                while (i28 < i27) {
                                    j = (j << 8) | (this.zzo.zzM()[i28] & b);
                                    i28++;
                                    i27 = i27;
                                    b = 255;
                                }
                                i3 = i27;
                                if (i20 > 0) {
                                    j -= (1 << ((i25 * 7) + 6)) - 1;
                                }
                            } else {
                                i25++;
                                i11 = 1;
                                b = 255;
                            }
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            break;
                        }
                        int[] iArr2 = this.zzT;
                        int i29 = (int) j;
                        if (i20 != 0) {
                            i29 += iArr2[i20 - 1];
                        }
                        iArr2[i20] = i29;
                        i22 += i29;
                        i20++;
                        i21 = i3;
                        th = null;
                        i11 = 1;
                        b = 255;
                    }
                }
            }
            this.zzP = this.zzJ + zzs((this.zzo.zzM()[0] << 8) | (this.zzo.zzM()[1] & 255));
            if (zzahiVar6.zzd != 2) {
                if (i10 == 163) {
                    if ((this.zzo.zzM()[2] & 128) == 128) {
                        i10 = Opcodes.IF_ICMPGT;
                    } else {
                        i10 = Opcodes.IF_ICMPGT;
                    }
                }
                i7 = 0;
                this.zzW = i7;
                this.zzO = 2;
                this.zzR = 0;
            }
            i7 = 1;
            this.zzW = i7;
            this.zzO = 2;
            this.zzR = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i30 = this.zzR;
                if (i30 >= this.zzS) {
                    this.zzO = 0;
                    return;
                }
                zzv(zzahiVar6, ((this.zzR * zzahiVar6.zze) / 1000) + this.zzP, this.zzW, zzq(zzaclVar, zzahiVar6, this.zzT[i30], false), 0);
                this.zzR++;
            }
        } else {
            while (true) {
                int i31 = this.zzR;
                if (i31 >= this.zzS) {
                    return;
                }
                int[] iArr3 = this.zzT;
                iArr3[i31] = zzq(zzaclVar, zzahiVar6, iArr3[i31], true);
                this.zzR++;
            }
        }
    }

    public zzahj(zzajy zzajyVar, int i) {
        this(new zzahd(), 0, zzajyVar);
    }

    protected final void zzl(int i, double d) throws zzbo {
        if (i == 181) {
            zzu(i);
            this.zzC.zzQ = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzA = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzu(i);
                this.zzC.zzD = (float) d;
                break;
            case 21970:
                zzu(i);
                this.zzC.zzE = (float) d;
                break;
            case 21971:
                zzu(i);
                this.zzC.zzF = (float) d;
                break;
            case 21972:
                zzu(i);
                this.zzC.zzG = (float) d;
                break;
            case 21973:
                zzu(i);
                this.zzC.zzH = (float) d;
                break;
            case 21974:
                zzu(i);
                this.zzC.zzI = (float) d;
                break;
            case 21975:
                zzu(i);
                this.zzC.zzJ = (float) d;
                break;
            case 21976:
                zzu(i);
                this.zzC.zzK = (float) d;
                break;
            case 21977:
                zzu(i);
                this.zzC.zzL = (float) d;
                break;
            case 21978:
                zzu(i);
                this.zzC.zzM = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzu(i);
                        this.zzC.zzs = (float) d;
                        break;
                    case 30324:
                        zzu(i);
                        this.zzC.zzt = (float) d;
                        break;
                    case 30325:
                        zzu(i);
                        this.zzC.zzu = (float) d;
                        break;
                }
        }
    }

    protected final void zzm(int i, long j) throws zzbo {
        boolean z;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw zzbo.zza("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw zzbo.zza("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case Opcodes.LXOR /* 131 */:
                zzu(i);
                this.zzC.zzd = (int) j;
                return;
            case Opcodes.L2I /* 136 */:
                z = j == 1;
                zzu(i);
                this.zzC.zzV = z;
                return;
            case 155:
                this.zzQ = zzs(j);
                return;
            case Opcodes.IF_ICMPEQ /* 159 */:
                zzu(i);
                this.zzC.zzO = (int) j;
                return;
            case Opcodes.ARETURN /* 176 */:
                zzu(i);
                this.zzC.zzl = (int) j;
                return;
            case Opcodes.PUTSTATIC /* 179 */:
                zzt(i);
                this.zzK.zzc(zzs(j));
                return;
            case Opcodes.INVOKEDYNAMIC /* 186 */:
                zzu(i);
                this.zzC.zzm = (int) j;
                return;
            case 215:
                zzu(i);
                this.zzC.zzc = (int) j;
                return;
            case 231:
                this.zzJ = zzs(j);
                return;
            case 238:
                this.zzX = (int) j;
                return;
            case 241:
                if (this.zzM) {
                    return;
                }
                zzt(i);
                this.zzL.zzc(j);
                this.zzM = true;
                return;
            case 251:
                this.zzY = true;
                return;
            case 16871:
                zzu(i);
                this.zzC.zzY = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw zzbo.zza("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw zzbo.zza("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw zzbo.zza("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw zzbo.zza("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw zzbo.zza("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.zzF = j + this.zzy;
                return;
            case 21432:
                int i2 = (int) j;
                zzu(i);
                if (i2 == 0) {
                    this.zzC.zzw = 0;
                    return;
                }
                if (i2 == 1) {
                    this.zzC.zzw = 2;
                    return;
                } else if (i2 == 3) {
                    this.zzC.zzw = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.zzC.zzw = 3;
                    return;
                }
            case 21680:
                zzu(i);
                this.zzC.zzo = (int) j;
                return;
            case 21682:
                zzu(i);
                this.zzC.zzq = (int) j;
                return;
            case 21690:
                zzu(i);
                this.zzC.zzp = (int) j;
                return;
            case 21930:
                z = j == 1;
                zzu(i);
                this.zzC.zzU = z;
                return;
            case 21938:
                zzu(i);
                zzahi zzahiVar = this.zzC;
                zzahiVar.zzx = true;
                zzahiVar.zzn = (int) j;
                return;
            case 21998:
                zzu(i);
                this.zzC.zzf = (int) j;
                return;
            case 22186:
                zzu(i);
                this.zzC.zzR = j;
                return;
            case 22203:
                zzu(i);
                this.zzC.zzS = j;
                return;
            case 25188:
                zzu(i);
                this.zzC.zzP = (int) j;
                return;
            case 30114:
                this.zzZ = j;
                return;
            case 30321:
                int i3 = (int) j;
                zzu(i);
                if (i3 == 0) {
                    this.zzC.zzr = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzC.zzr = 1;
                    return;
                } else if (i3 == 2) {
                    this.zzC.zzr = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.zzC.zzr = 3;
                    return;
                }
            case 2352003:
                zzu(i);
                this.zzC.zze = (int) j;
                return;
            case 2807729:
                this.zzz = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i4 = (int) j;
                        zzu(i);
                        if (i4 == 1) {
                            this.zzC.zzA = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.zzC.zzA = 1;
                            return;
                        }
                    case 21946:
                        zzu(i);
                        int zzb2 = zzo.zzb((int) j);
                        if (zzb2 != -1) {
                            this.zzC.zzz = zzb2;
                            return;
                        }
                        return;
                    case 21947:
                        zzu(i);
                        this.zzC.zzx = true;
                        int zza2 = zzo.zza((int) j);
                        if (zza2 != -1) {
                            this.zzC.zzy = zza2;
                            return;
                        }
                        return;
                    case 21948:
                        zzu(i);
                        this.zzC.zzB = (int) j;
                        return;
                    case 21949:
                        zzu(i);
                        this.zzC.zzC = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }
}
