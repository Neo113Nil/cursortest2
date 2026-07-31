package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.collection.SieveCacheKt;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.ts.TsExtractor;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imageutils.JfifUtil;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzagz implements zzacu {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzD;
    private zzagy zzE;
    private boolean zzF;
    private int zzG;
    private long zzH;
    private boolean zzI;
    private long zzJ;
    private long zzK;
    private long zzL;
    private zzdt zzM;
    private zzdt zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private long zzR;
    private long zzS;
    private int zzT;
    private int zzU;
    private int[] zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private int zzZ;
    private boolean zzaa;
    private long zzab;
    private int zzac;
    private int zzad;
    private int zzae;
    private boolean zzaf;
    private boolean zzag;
    private boolean zzah;
    private int zzai;
    private byte zzaj;
    private boolean zzak;
    private zzacx zzal;
    private final zzagu zzam;
    private final zzahb zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzajt zzl;
    private final zzef zzm;
    private final zzef zzn;
    private final zzef zzo;
    private final zzef zzp;
    private final zzef zzq;
    private final zzef zzr;
    private final zzef zzs;
    private final zzef zzt;
    private final zzef zzu;
    private final zzef zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i = zzagx.zza;
        zzb = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        String str = zzeo.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", Integer.valueOf(RotationOptions.ROTATE_180));
        hashMap.put("htc_video_rotA-270", Integer.valueOf(RotationOptions.ROTATE_270));
        zzg = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public zzagz() {
        this(new zzagu(), 2, zzajt.zza);
    }

    private final void zzA() {
        if (!this.zzD) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                zzacx zzacxVar = this.zzal;
                zzacxVar.getClass();
                zzacxVar.zzv();
                this.zzD = false;
                return;
            }
            if (((zzagy) sparseArray.valueAt(i)).zzV) {
                return;
            } else {
                i++;
            }
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzp(int i) throws zzas {
        if (this.zzE != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw zzas.zzb(sb.toString(), null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzq(int i) throws zzas {
        if (this.zzM == null || this.zzN == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw zzas.zzb(sb.toString(), null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f6  */
    @RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzr(zzagy zzagyVar, long j, int i, int i2, int i3) {
        char c;
        byte[] zzw;
        int i4;
        int zze2;
        zzaec zzaecVar = zzagyVar.zzU;
        if (zzaecVar != null) {
            zzaecVar.zzc(zzagyVar.zzY, j, i, i2, i3, zzagyVar.zzj);
        } else {
            if ("S_TEXT/UTF8".equals(zzagyVar.zzc) || "S_TEXT/ASS".equals(zzagyVar.zzc) || "S_TEXT/SSA".equals(zzagyVar.zzc) || "S_TEXT/WEBVTT".equals(zzagyVar.zzc)) {
                if (this.zzU > 1) {
                    zzds.zzc("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.zzS;
                    if (j2 == C.TIME_UNSET) {
                        zzds.zzc("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = zzagyVar.zzc;
                        zzef zzefVar = this.zzs;
                        byte[] zzi = zzefVar.zzi();
                        switch (str.hashCode()) {
                            case 738597099:
                                if (str.equals("S_TEXT/ASS")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 738614379:
                                if (str.equals("S_TEXT/SSA")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1045209816:
                                if (str.equals("S_TEXT/WEBVTT")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1422270023:
                                if (str.equals("S_TEXT/UTF8")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c == 0) {
                            zzw = zzw(j2, "%02d:%02d:%02d,%03d", 1000L);
                            i4 = 19;
                        } else if (c == 1 || c == 2) {
                            zzw = zzw(j2, "%01d:%02d:%02d:%02d", 10000L);
                            i4 = 21;
                        } else {
                            if (c != 3) {
                                throw new IllegalArgumentException();
                            }
                            zzw = zzw(j2, "%02d:%02d:%02d.%03d", 1000L);
                            i4 = 25;
                        }
                        System.arraycopy(zzw, 0, zzi, i4, zzw.length);
                        int zzg2 = zzefVar.zzg();
                        while (true) {
                            if (zzg2 < zzefVar.zze()) {
                                if (zzefVar.zzi()[zzg2] == 0) {
                                    zzefVar.zzf(zzg2);
                                } else {
                                    zzg2++;
                                }
                            }
                        }
                        zzagyVar.zzY.zzz(zzefVar, zzefVar.zze());
                        zze2 = i2 + zzefVar.zze();
                        if ((i & 268435456) != 0) {
                            if (this.zzU > 1) {
                                this.zzv.zza(0);
                            } else {
                                zzef zzefVar2 = this.zzv;
                                int zze3 = zzefVar2.zze();
                                zzagyVar.zzY.zzw(zzefVar2, zze3, 2);
                                zze2 += zze3;
                            }
                        }
                        zzagyVar.zzY.zzx(j, i, zze2, i3, zzagyVar.zzj);
                    }
                }
            }
            zze2 = i2;
            if ((i & 268435456) != 0) {
            }
            zzagyVar.zzY.zzx(j, i, zze2, i3, zzagyVar.zzj);
        }
        this.zzP = true;
    }

    private final void zzs(zzacv zzacvVar, int i) throws IOException {
        zzef zzefVar = this.zzo;
        if (zzefVar.zze() >= i) {
            return;
        }
        if (zzefVar.zzj() < i) {
            int zzj = zzefVar.zzj();
            zzefVar.zzc(Math.max(zzj + zzj, i));
        }
        zzacvVar.zzc(zzefVar.zzi(), zzefVar.zze(), i - zzefVar.zze());
        zzefVar.zzf(i);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzt(zzacv zzacvVar, zzagy zzagyVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzagyVar.zzc)) {
            zzv(zzacvVar, zzb, i);
            int i3 = this.zzad;
            zzu();
            return i3;
        }
        if ("S_TEXT/ASS".equals(zzagyVar.zzc) || "S_TEXT/SSA".equals(zzagyVar.zzc)) {
            zzv(zzacvVar, zzd, i);
            int i4 = this.zzad;
            zzu();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(zzagyVar.zzc)) {
            zzv(zzacvVar, zze, i);
            int i5 = this.zzad;
            zzu();
            return i5;
        }
        if (zzagyVar.zzV) {
            zzagyVar.zzZ.getClass();
            int i6 = zzact.zza;
            zzef zzefVar = new zzef(i);
            if (zzacvVar.zzh(zzefVar.zzi(), 0, i, true)) {
                zzacvVar.zzl();
                if (zzact.zza(zzefVar.zzr()) == 1 && zzefVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzefVar.zzm(bArr, 0, 10);
                    zzefVar.zzh(0);
                    int zzc2 = zzact.zzc(bArr);
                    if (zzefVar.zzd() >= zzc2 + 4) {
                        zzefVar.zzk(zzc2);
                        if (zzact.zza(zzefVar.zzB()) == 2) {
                            zzs zza2 = zzagyVar.zzZ.zza();
                            zza2.zzm(MimeTypes.AUDIO_DTS_HD);
                            zzagyVar.zzZ = zza2.zzM();
                        }
                    }
                }
            }
            zzagyVar.zzY.zzu(zzagyVar.zzZ);
            zzagyVar.zzV = false;
            zzA();
        }
        zzaeb zzaebVar = zzagyVar.zzY;
        if (!this.zzaf) {
            if (zzagyVar.zzh) {
                this.zzY &= -1073741825;
                if (!this.zzag) {
                    zzef zzefVar2 = this.zzo;
                    zzacvVar.zzc(zzefVar2.zzi(), 0, 1);
                    this.zzac++;
                    if ((zzefVar2.zzi()[0] & 128) == 128) {
                        throw zzas.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzaj = zzefVar2.zzi()[0];
                    this.zzag = true;
                }
                byte b = this.zzaj;
                if ((b & 1) == 1) {
                    int i7 = b & 2;
                    this.zzY |= 1073741824;
                    if (!this.zzak) {
                        zzef zzefVar3 = this.zzt;
                        zzacvVar.zzc(zzefVar3.zzi(), 0, 8);
                        this.zzac += 8;
                        this.zzak = true;
                        zzef zzefVar4 = this.zzo;
                        zzefVar4.zzi()[0] = (byte) ((i7 != 2 ? 0 : 128) | 8);
                        zzefVar4.zzh(0);
                        zzaebVar.zzw(zzefVar4, 1, 1);
                        this.zzad++;
                        zzefVar3.zzh(0);
                        zzaebVar.zzw(zzefVar3, 8, 1);
                        this.zzad += 8;
                    }
                    if (i7 == 2) {
                        if (!this.zzah) {
                            zzef zzefVar5 = this.zzo;
                            zzacvVar.zzc(zzefVar5.zzi(), 0, 1);
                            this.zzac++;
                            zzefVar5.zzh(0);
                            this.zzai = zzefVar5.zzs();
                            this.zzah = true;
                        }
                        int i8 = this.zzai * 4;
                        zzef zzefVar6 = this.zzo;
                        zzefVar6.zza(i8);
                        zzacvVar.zzc(zzefVar6.zzi(), 0, i8);
                        this.zzac += i8;
                        int i9 = (this.zzai >> 1) + 1;
                        int i10 = (i9 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i10) {
                            this.zzw = ByteBuffer.allocate(i10);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i9);
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            i2 = this.zzai;
                            if (i11 >= i2) {
                                break;
                            }
                            int zzH = zzefVar6.zzH();
                            int i13 = zzH - i12;
                            if (i11 % 2 == 0) {
                                this.zzw.putShort((short) i13);
                            } else {
                                this.zzw.putInt(i13);
                            }
                            i11++;
                            i12 = zzH;
                        }
                        int i14 = (i - this.zzac) - i12;
                        if ((i2 & 1) == 1) {
                            this.zzw.putInt(i14);
                        } else {
                            this.zzw.putShort((short) i14);
                            this.zzw.putInt(0);
                        }
                        zzef zzefVar7 = this.zzu;
                        zzefVar7.zzb(this.zzw.array(), i10);
                        zzaebVar.zzw(zzefVar7, i10, 1);
                        this.zzad += i10;
                    }
                }
            } else {
                byte[] bArr2 = zzagyVar.zzi;
                if (bArr2 != null) {
                    this.zzr.zzb(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(zzagyVar.zzc) ? zzagyVar.zzg > 0 : z) {
                this.zzY |= 268435456;
                this.zzv.zza(0);
                int zze2 = (this.zzr.zze() + i) - this.zzac;
                zzef zzefVar8 = this.zzo;
                zzefVar8.zza(4);
                zzefVar8.zzi()[0] = (byte) ((zze2 >> 24) & 255);
                zzefVar8.zzi()[1] = (byte) ((zze2 >> 16) & 255);
                zzefVar8.zzi()[2] = (byte) ((zze2 >> 8) & 255);
                zzefVar8.zzi()[3] = (byte) (zze2 & 255);
                zzaebVar.zzw(zzefVar8, 4, 2);
                this.zzad += 4;
            }
            this.zzaf = true;
        }
        zzef zzefVar9 = this.zzr;
        int zze3 = i + zzefVar9.zze();
        if (!"V_MPEG4/ISO/AVC".equals(zzagyVar.zzc) && !"V_MPEGH/ISO/HEVC".equals(zzagyVar.zzc)) {
            if (zzagyVar.zzU != null) {
                zzghc.zzh(zzefVar9.zze() == 0);
                zzagyVar.zzU.zzb(zzacvVar);
            }
            while (true) {
                int i15 = this.zzac;
                if (i15 >= zze3) {
                    break;
                }
                int zzx = zzx(zzacvVar, zzaebVar, zze3 - i15);
                this.zzac += zzx;
                this.zzad += zzx;
            }
        } else {
            zzef zzefVar10 = this.zzn;
            byte[] zzi = zzefVar10.zzi();
            zzi[0] = 0;
            zzi[1] = 0;
            zzi[2] = 0;
            int i16 = zzagyVar.zzaa;
            int i17 = 4 - i16;
            while (this.zzac < zze3) {
                int i18 = this.zzae;
                if (i18 == 0) {
                    int min = Math.min(i16, zzefVar9.zzd());
                    zzacvVar.zzc(zzi, i17 + min, i16 - min);
                    if (min > 0) {
                        zzefVar9.zzm(zzi, i17, min);
                    }
                    this.zzac += i16;
                    zzefVar10.zzh(0);
                    this.zzae = zzefVar10.zzH();
                    zzef zzefVar11 = this.zzm;
                    zzefVar11.zzh(0);
                    zzaebVar.zzz(zzefVar11, 4);
                    this.zzad += 4;
                } else {
                    int zzx2 = zzx(zzacvVar, zzaebVar, i18);
                    this.zzac += zzx2;
                    this.zzad += zzx2;
                    this.zzae -= zzx2;
                }
            }
        }
        if ("A_VORBIS".equals(zzagyVar.zzc)) {
            zzef zzefVar12 = this.zzp;
            zzefVar12.zzh(0);
            zzaebVar.zzz(zzefVar12, 4);
            this.zzad += 4;
        }
        int i19 = this.zzad;
        zzu();
        return i19;
    }

    private final void zzu() {
        this.zzac = 0;
        this.zzad = 0;
        this.zzae = 0;
        this.zzaf = false;
        this.zzag = false;
        this.zzah = false;
        this.zzai = 0;
        this.zzaj = (byte) 0;
        this.zzak = false;
        this.zzr.zza(0);
    }

    private final void zzv(zzacv zzacvVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        zzef zzefVar = this.zzs;
        if (zzefVar.zzj() < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzefVar.zzb(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzefVar.zzi(), 0, length);
        }
        zzacvVar.zzc(zzefVar.zzi(), length, i);
        zzefVar.zzh(0);
        zzefVar.zzf(i2);
    }

    private static byte[] zzw(long j, String str, long j2) {
        zzghc.zza(j != C.TIME_UNSET);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer valueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = zzeo.zza;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzx(zzacv zzacvVar, zzaeb zzaebVar, int i) throws IOException {
        zzef zzefVar = this.zzr;
        int zzd2 = zzefVar.zzd();
        if (zzd2 <= 0) {
            return zzaebVar.zzy(zzacvVar, i, false);
        }
        int min = Math.min(i, zzd2);
        zzaebVar.zzz(zzefVar, min);
        return min;
    }

    private final long zzy(long j) throws zzas {
        long j2 = this.zzz;
        if (j2 != C.TIME_UNSET) {
            return zzeo.zzt(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw zzas.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static int[] zzz(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        return new zzaha().zza(zzacvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        if (this.zzk) {
            zzacxVar = new zzajw(zzacxVar, this.zzl);
        }
        this.zzal = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        int i = 0;
        this.zzP = false;
        while (!this.zzP) {
            if (this.zzam.zzc(zzacvVar)) {
                long zzn = zzacvVar.zzn();
                if (this.zzI) {
                    this.zzK = zzn;
                    zzadsVar.zza = this.zzJ;
                    this.zzI = false;
                    return 1;
                }
                if (this.zzF) {
                    long j = this.zzK;
                    if (j != -1) {
                        zzadsVar.zza = j;
                        this.zzK = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzagy zzagyVar = (zzagy) sparseArray.valueAt(i);
                    zzagyVar.zzb();
                    zzaec zzaecVar = zzagyVar.zzU;
                    if (zzaecVar != null) {
                        zzaecVar.zzd(zzagyVar.zzY, zzagyVar.zzj);
                    }
                    i++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zzL = C.TIME_UNSET;
        int i = 0;
        this.zzQ = 0;
        this.zzam.zzb();
        this.zzh.zza();
        zzu();
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i >= sparseArray.size()) {
                return;
            }
            zzaec zzaecVar = ((zzagy) sparseArray.valueAt(i)).zzU;
            if (zzaecVar != null) {
                zzaecVar.zza();
            }
            i++;
        }
    }

    zzagz(zzagu zzaguVar, int i, zzajt zzajtVar) {
        this.zzy = -1L;
        this.zzz = C.TIME_UNSET;
        this.zzA = C.TIME_UNSET;
        this.zzB = C.TIME_UNSET;
        this.zzJ = -1L;
        this.zzK = -1L;
        this.zzL = C.TIME_UNSET;
        this.zzam = zzaguVar;
        zzaguVar.zza(new zzagw(this, null));
        this.zzl = zzajtVar;
        this.zzj = 1 == ((i & 1) ^ 1);
        this.zzk = (i & 2) == 0;
        this.zzh = new zzahb();
        this.zzi = new SparseArray();
        this.zzo = new zzef(4);
        this.zzp = new zzef(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzef(4);
        this.zzm = new zzef(zzfl.zza);
        this.zzn = new zzef(4);
        this.zzr = new zzef();
        this.zzs = new zzef();
        this.zzt = new zzef(8);
        this.zzu = new zzef();
        this.zzv = new zzef();
        this.zzV = new int[1];
        this.zzD = true;
    }

    protected final void zza(int i, long j, long j2) throws zzas {
        zzacx zzacxVar = this.zzal;
        zzacxVar.getClass();
        if (i == 160) {
            this.zzaa = false;
            this.zzab = 0L;
            return;
        }
        if (i == 174) {
            zzagy zzagyVar = new zzagy();
            this.zzE = zzagyVar;
            zzagyVar.zza = this.zzC;
            return;
        }
        if (i == 187) {
            this.zzO = false;
            return;
        }
        if (i == 19899) {
            this.zzG = -1;
            this.zzH = -1L;
            return;
        }
        if (i == 20533) {
            zzp(i);
            this.zzE.zzh = true;
            return;
        }
        if (i == 21968) {
            zzp(i);
            this.zzE.zzy = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzy;
            if (j3 != -1 && j3 != j) {
                throw zzas.zzb("Multiple Segment elements not supported", null);
            }
            this.zzy = j;
            this.zzx = j2;
            return;
        }
        if (i == 475249515) {
            this.zzM = new zzdt(32);
            this.zzN = new zzdt(32);
        } else if (i == 524531317 && !this.zzF) {
            if (this.zzj && this.zzJ != -1) {
                this.zzI = true;
            } else {
                zzacxVar.zzw(new zzadu(this.zzB, 0L));
                this.zzF = true;
            }
        }
    }

    protected final void zzk(int i, String str) throws zzas {
        if (i == 134) {
            zzp(i);
            this.zzE.zzc = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                zzp(i);
                this.zzE.zzb = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                zzp(i);
                this.zzE.zze(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzC = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw zzas.zzb(sb.toString(), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0273, code lost:
    
        throw com.google.android.gms.internal.ads.zzas.zzb("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzl(int i, int i2, zzacv zzacvVar) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = i;
        int i13 = 1;
        int i14 = 0;
        if (i12 != 161 && i12 != 163) {
            if (i12 == 165) {
                if (this.zzQ != 2) {
                    return;
                }
                zzagy zzagyVar = (zzagy) this.zzi.get(this.zzW);
                if (this.zzZ != 4 || !"V_VP9".equals(zzagyVar.zzc)) {
                    zzacvVar.zzf(i2);
                    return;
                }
                zzef zzefVar = this.zzv;
                zzefVar.zza(i2);
                zzacvVar.zzc(zzefVar.zzi(), 0, i2);
                return;
            }
            if (i12 == 16877) {
                zzp(i);
                zzagy zzagyVar2 = this.zzE;
                if (zzagyVar2.zzc() != 1685485123 && zzagyVar2.zzc() != 1685480259) {
                    zzacvVar.zzf(i2);
                    return;
                } else {
                    zzagyVar2.zzO = new byte[i2];
                    zzacvVar.zzc(zzagyVar2.zzO, 0, i2);
                    return;
                }
            }
            if (i12 == 16981) {
                zzp(i);
                zzagy zzagyVar3 = this.zzE;
                zzagyVar3.zzi = new byte[i2];
                zzacvVar.zzc(zzagyVar3.zzi, 0, i2);
                return;
            }
            if (i12 == 18402) {
                byte[] bArr = new byte[i2];
                zzacvVar.zzc(bArr, 0, i2);
                zzp(i);
                this.zzE.zzj = new zzaea(1, bArr, 0, 0);
                return;
            }
            if (i12 == 21419) {
                zzef zzefVar2 = this.zzq;
                Arrays.fill(zzefVar2.zzi(), (byte) 0);
                zzacvVar.zzc(zzefVar2.zzi(), 4 - i2, i2);
                zzefVar2.zzh(0);
                this.zzG = (int) zzefVar2.zzz();
                return;
            }
            if (i12 == 25506) {
                zzp(i);
                zzagy zzagyVar4 = this.zzE;
                zzagyVar4.zzk = new byte[i2];
                zzacvVar.zzc(zzagyVar4.zzk, 0, i2);
                return;
            }
            if (i12 != 30322) {
                StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 15);
                sb.append("Unexpected id: ");
                sb.append(i12);
                throw zzas.zzb(sb.toString(), null);
            }
            zzp(i);
            zzagy zzagyVar5 = this.zzE;
            zzagyVar5.zzw = new byte[i2];
            zzacvVar.zzc(zzagyVar5.zzw, 0, i2);
            return;
        }
        int i15 = 8;
        if (this.zzQ == 0) {
            zzahb zzahbVar = this.zzh;
            this.zzW = (int) zzahbVar.zzb(zzacvVar, false, true, 8);
            this.zzX = zzahbVar.zzc();
            this.zzS = C.TIME_UNSET;
            this.zzQ = 1;
            this.zzo.zza(0);
        }
        zzagy zzagyVar6 = (zzagy) this.zzi.get(this.zzW);
        if (zzagyVar6 == null) {
            zzacvVar.zzf(i2 - this.zzX);
            this.zzQ = 0;
            return;
        }
        zzagyVar6.zzb();
        if (this.zzQ == 1) {
            zzs(zzacvVar, 3);
            zzef zzefVar3 = this.zzo;
            int i16 = (zzefVar3.zzi()[2] & 6) >> 1;
            if (i16 == 0) {
                this.zzU = 1;
                int[] zzz = zzz(this.zzV, 1);
                this.zzV = zzz;
                zzz[0] = (i2 - this.zzX) - 3;
            } else {
                zzs(zzacvVar, 4);
                int i17 = (zzefVar3.zzi()[3] & 255) + 1;
                this.zzU = i17;
                int[] zzz2 = zzz(this.zzV, i17);
                this.zzV = zzz2;
                if (i16 == 2) {
                    int i18 = (i2 - this.zzX) - 4;
                    int i19 = this.zzU;
                    Arrays.fill(zzz2, 0, i19, i18 / i19);
                } else if (i16 == 1) {
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = 4;
                    while (true) {
                        i8 = this.zzU - 1;
                        if (i20 >= i8) {
                            break;
                        }
                        this.zzV[i20] = 0;
                        while (true) {
                            i9 = i22 + 1;
                            zzs(zzacvVar, i9);
                            int i23 = zzefVar3.zzi()[i22] & 255;
                            int[] iArr = this.zzV;
                            i10 = iArr[i20] + i23;
                            iArr[i20] = i10;
                            if (i23 != 255) {
                                break;
                            } else {
                                i22 = i9;
                            }
                        }
                        i21 += i10;
                        i20++;
                        i22 = i9;
                    }
                    this.zzV[i8] = ((i2 - this.zzX) - i22) - i21;
                } else {
                    if (i16 != 3) {
                        throw zzas.zzb("Unexpected lacing value: 2", null);
                    }
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 4;
                    while (true) {
                        int i27 = this.zzU - 1;
                        if (i24 >= i27) {
                            i3 = i13;
                            i5 = i14;
                            this.zzV[i27] = ((i2 - this.zzX) - i26) - i25;
                            break;
                        }
                        this.zzV[i24] = i14;
                        int i28 = i26 + 1;
                        zzs(zzacvVar, i28);
                        if (zzefVar3.zzi()[i26] == 0) {
                            throw zzas.zzb("No valid varint length mask found", null);
                        }
                        int i29 = i13;
                        int i30 = i14;
                        while (true) {
                            if (i30 >= i15) {
                                i6 = i14;
                                i7 = i15;
                                j = 0;
                                break;
                            }
                            i7 = i15;
                            int i31 = i29 << (7 - i30);
                            if ((zzefVar3.zzi()[i26] & i31) != 0) {
                                i28 += i30;
                                zzs(zzacvVar, i28);
                                i6 = i14;
                                j = zzefVar3.zzi()[i26] & 255 & (~i31);
                                int i32 = i26 + 1;
                                while (i32 < i28) {
                                    j = (j << i7) | (zzefVar3.zzi()[i32] & 255);
                                    i32++;
                                    i30 = i30;
                                }
                                int i33 = i30;
                                if (i24 > 0) {
                                    j -= (1 << ((i33 * 7) + 6)) - 1;
                                }
                            } else {
                                i30++;
                                i15 = i7;
                            }
                        }
                        i26 = i28;
                        if (j < SieveCacheKt.NodeMetaAndPreviousMask || j > SieveCacheKt.NodeLinkMask) {
                            break;
                        }
                        int[] iArr2 = this.zzV;
                        int i34 = (int) j;
                        if (i24 != 0) {
                            i34 += iArr2[i24 - 1];
                        }
                        iArr2[i24] = i34;
                        i25 += i34;
                        i24++;
                        i13 = i29;
                        i14 = i6;
                        i15 = i7;
                    }
                }
            }
            i3 = 1;
            i5 = 0;
            this.zzR = this.zzL + zzy((zzefVar3.zzi()[i5] << 8) | (zzefVar3.zzi()[i3] & 255));
            if (zzagyVar6.zze == 2) {
                i11 = i3;
            } else if (i12 == 163) {
                i11 = (zzefVar3.zzi()[2] & 128) == 128 ? i3 : i5;
                i12 = 163;
            } else {
                i11 = i5;
            }
            this.zzY = i11;
            this.zzQ = 2;
            this.zzT = i5;
            i4 = 163;
        } else {
            i3 = 1;
            i4 = 163;
        }
        if (i12 == i4) {
            while (true) {
                int i35 = this.zzT;
                if (i35 >= this.zzU) {
                    this.zzQ = 0;
                    return;
                }
                int zzt = zzt(zzacvVar, zzagyVar6, this.zzV[i35], false);
                zzagy zzagyVar7 = zzagyVar6;
                zzr(zzagyVar7, this.zzR + ((this.zzT * zzagyVar6.zzf) / 1000), this.zzY, zzt, 0);
                this.zzT++;
                zzagyVar6 = zzagyVar7;
            }
        } else {
            while (true) {
                int i36 = this.zzT;
                if (i36 >= this.zzU) {
                    return;
                }
                int[] iArr3 = this.zzV;
                boolean z = i3;
                iArr3[i36] = zzt(zzacvVar, zzagyVar6, iArr3[i36], z);
                this.zzT += z ? 1 : 0;
            }
        }
    }

    public zzagz(zzajt zzajtVar, int i) {
        this(new zzagu(), 0, zzajtVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01dc, code lost:
    
        if (r3.equals("V_MPEGH/ISO/HEVC") != false) goto L195;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzb(int i) throws zzas {
        int i2;
        zzadv zzaduVar;
        int i3;
        zzacx zzacxVar = this.zzal;
        zzacxVar.getClass();
        char c = '\b';
        int i4 = 0;
        if (i == 160) {
            if (this.zzQ == 2) {
                zzagy zzagyVar = (zzagy) this.zzi.get(this.zzW);
                zzagyVar.zzb();
                if (this.zzab > 0 && "A_OPUS".equals(zzagyVar.zzc)) {
                    zzef zzefVar = this.zzv;
                    byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzab).array();
                    zzefVar.zzb(array, array.length);
                }
                int i5 = 0;
                for (int i6 = 0; i6 < this.zzU; i6++) {
                    i5 += this.zzV[i6];
                }
                int i7 = 0;
                while (i7 < this.zzU) {
                    long j = this.zzR + ((zzagyVar.zzf * i7) / 1000);
                    int i8 = this.zzY;
                    if (i7 == 0) {
                        if (!this.zzaa) {
                            i8 |= 1;
                        }
                        i2 = 0;
                    } else {
                        i2 = i7;
                    }
                    int i9 = this.zzV[i2];
                    int i10 = i5 - i9;
                    zzr(zzagyVar, j, i8, i9, i10);
                    i7 = i2 + 1;
                    i5 = i10;
                }
                this.zzQ = 0;
                return;
            }
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i11 = this.zzG;
                if (i11 != -1) {
                    long j2 = this.zzH;
                    if (j2 != -1) {
                        if (i11 == 475249515) {
                            this.zzJ = j2;
                            return;
                        }
                        return;
                    }
                }
                throw zzas.zzb("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i == 25152) {
                zzp(i);
                zzagy zzagyVar2 = this.zzE;
                if (zzagyVar2.zzh) {
                    if (zzagyVar2.zzj == null) {
                        throw zzas.zzb("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzagyVar2.zzl = new zzp(null, new zzo(zzf.zza, null, MimeTypes.VIDEO_WEBM, this.zzE.zzj.zzb));
                    return;
                }
                return;
            }
            if (i == 28032) {
                zzp(i);
                zzagy zzagyVar3 = this.zzE;
                if (zzagyVar3.zzh && zzagyVar3.zzi != null) {
                    throw zzas.zzb("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.zzz == C.TIME_UNSET) {
                    this.zzz = 1000000L;
                }
                long j3 = this.zzA;
                if (j3 != C.TIME_UNSET) {
                    this.zzB = zzy(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.zzi.size() == 0) {
                    throw zzas.zzb("No valid tracks were found", null);
                }
                zzA();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.zzF) {
                zzdt zzdtVar = this.zzM;
                zzdt zzdtVar2 = this.zzN;
                if (this.zzy == -1 || this.zzB == C.TIME_UNSET || zzdtVar == null || zzdtVar.zzd() == 0 || zzdtVar2 == null || zzdtVar2.zzd() != zzdtVar.zzd()) {
                    zzaduVar = new zzadu(this.zzB, 0L);
                } else {
                    int zzd2 = zzdtVar.zzd();
                    int[] iArr = new int[zzd2];
                    long[] jArr = new long[zzd2];
                    long[] jArr2 = new long[zzd2];
                    long[] jArr3 = new long[zzd2];
                    for (int i12 = 0; i12 < zzd2; i12++) {
                        jArr3[i12] = zzdtVar.zzc(i12);
                        jArr[i12] = this.zzy + zzdtVar2.zzc(i12);
                    }
                    while (true) {
                        i3 = zzd2 - 1;
                        if (i4 >= i3) {
                            break;
                        }
                        int i13 = i4 + 1;
                        iArr[i4] = (int) (jArr[i13] - jArr[i4]);
                        jArr2[i4] = jArr3[i13] - jArr3[i4];
                        i4 = i13;
                    }
                    int i14 = i3;
                    while (i14 > 0 && jArr3[i14] > this.zzB) {
                        i14--;
                    }
                    iArr[i14] = (int) ((this.zzy + this.zzx) - jArr[i14]);
                    jArr2[i14] = this.zzB - jArr3[i14];
                    if (i14 < i3) {
                        zzds.zzc("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
                        int i15 = i14 + 1;
                        iArr = Arrays.copyOf(iArr, i15);
                        jArr = Arrays.copyOf(jArr, i15);
                        jArr2 = Arrays.copyOf(jArr2, i15);
                        jArr3 = Arrays.copyOf(jArr3, i15);
                    }
                    zzaduVar = new zzaci(iArr, jArr, jArr2, jArr3);
                }
                zzacxVar.zzw(zzaduVar);
                this.zzF = true;
            }
            this.zzM = null;
            this.zzN = null;
            return;
        }
        zzagy zzagyVar4 = this.zzE;
        zzagyVar4.getClass();
        String str = zzagyVar4.zzc;
        if (str == null) {
            throw zzas.zzb("CodecId is missing in TrackEntry element", null);
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
                    c = '!';
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
                    c = 31;
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
                    c = ' ';
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
            case 738614379:
                if (str.equals("S_TEXT/SSA")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c = 30;
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
            case '!':
                zzagyVar4.zza(zzacxVar, zzagyVar4.zzd);
                this.zzi.put(zzagyVar4.zzd, zzagyVar4);
                break;
        }
        this.zzE = null;
    }

    protected final void zzj(int i, double d) throws zzas {
        if (i == 181) {
            zzp(i);
            this.zzE.zzR = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzA = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzp(i);
                this.zzE.zzE = (float) d;
                break;
            case 21970:
                zzp(i);
                this.zzE.zzF = (float) d;
                break;
            case 21971:
                zzp(i);
                this.zzE.zzG = (float) d;
                break;
            case 21972:
                zzp(i);
                this.zzE.zzH = (float) d;
                break;
            case 21973:
                zzp(i);
                this.zzE.zzI = (float) d;
                break;
            case 21974:
                zzp(i);
                this.zzE.zzJ = (float) d;
                break;
            case 21975:
                zzp(i);
                this.zzE.zzK = (float) d;
                break;
            case 21976:
                zzp(i);
                this.zzE.zzL = (float) d;
                break;
            case 21977:
                zzp(i);
                this.zzE.zzM = (float) d;
                break;
            case 21978:
                zzp(i);
                this.zzE.zzN = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzp(i);
                        this.zzE.zzt = (float) d;
                        break;
                    case 30324:
                        zzp(i);
                        this.zzE.zzu = (float) d;
                        break;
                    case 30325:
                        zzp(i);
                        this.zzE.zzv = (float) d;
                        break;
                }
        }
    }

    protected final void zzc(int i, long j) throws zzas {
        boolean z;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw zzas.zzb(sb.toString(), null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw zzas.zzb(sb2.toString(), null);
        }
        switch (i) {
            case 131:
                zzp(i);
                this.zzE.zze = (int) j;
                return;
            case TsExtractor.TS_STREAM_TYPE_DTS_HD /* 136 */:
                z = j == 1;
                zzp(i);
                this.zzE.zzX = z;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.zzS = zzy(j);
                return;
            case 159:
                zzp(i);
                this.zzE.zzP = (int) j;
                return;
            case 176:
                zzp(i);
                this.zzE.zzm = (int) j;
                return;
            case 179:
                zzq(i);
                this.zzM.zza(zzy(j));
                return;
            case 186:
                zzp(i);
                this.zzE.zzn = (int) j;
                return;
            case JfifUtil.MARKER_RST7 /* 215 */:
                zzp(i);
                this.zzE.zzd = (int) j;
                return;
            case 231:
                this.zzL = zzy(j);
                return;
            case 238:
                this.zzZ = (int) j;
                return;
            case 241:
                if (this.zzO) {
                    return;
                }
                zzq(i);
                this.zzN.zza(j);
                this.zzO = true;
                return;
            case 251:
                this.zzaa = true;
                return;
            case 16871:
                zzp(i);
                this.zzE.zzd((int) j);
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw zzas.zzb(sb3.toString(), null);
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw zzas.zzb(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw zzas.zzb(sb5.toString(), null);
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw zzas.zzb(sb6.toString(), null);
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw zzas.zzb(sb7.toString(), null);
            case 21420:
                this.zzH = j + this.zzy;
                return;
            case 21432:
                int i2 = (int) j;
                zzp(i);
                if (i2 == 0) {
                    this.zzE.zzx = 0;
                    return;
                }
                if (i2 == 1) {
                    this.zzE.zzx = 2;
                    return;
                } else if (i2 == 3) {
                    this.zzE.zzx = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.zzE.zzx = 3;
                    return;
                }
            case 21680:
                zzp(i);
                this.zzE.zzp = (int) j;
                return;
            case 21682:
                zzp(i);
                this.zzE.zzr = (int) j;
                return;
            case 21690:
                zzp(i);
                this.zzE.zzq = (int) j;
                return;
            case 21930:
                z = j == 1;
                zzp(i);
                this.zzE.zzW = z;
                return;
            case 21938:
                zzp(i);
                zzagy zzagyVar = this.zzE;
                zzagyVar.zzy = true;
                zzagyVar.zzo = (int) j;
                return;
            case 21998:
                zzp(i);
                this.zzE.zzg = (int) j;
                return;
            case 22186:
                zzp(i);
                this.zzE.zzS = j;
                return;
            case 22203:
                zzp(i);
                this.zzE.zzT = j;
                return;
            case 25188:
                zzp(i);
                this.zzE.zzQ = (int) j;
                return;
            case 30114:
                this.zzab = j;
                return;
            case 30321:
                int i3 = (int) j;
                zzp(i);
                if (i3 == 0) {
                    this.zzE.zzs = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzE.zzs = 1;
                    return;
                } else if (i3 == 2) {
                    this.zzE.zzs = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.zzE.zzs = 3;
                    return;
                }
            case 2352003:
                zzp(i);
                this.zzE.zzf = (int) j;
                return;
            case 2807729:
                this.zzz = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i4 = (int) j;
                        zzp(i);
                        if (i4 == 1) {
                            this.zzE.zzB = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.zzE.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzp(i);
                        int zzc2 = zzh.zzc((int) j);
                        if (zzc2 != -1) {
                            this.zzE.zzA = zzc2;
                            return;
                        }
                        return;
                    case 21947:
                        zzp(i);
                        this.zzE.zzy = true;
                        int zzb2 = zzh.zzb((int) j);
                        if (zzb2 != -1) {
                            this.zzE.zzz = zzb2;
                            return;
                        }
                        return;
                    case 21948:
                        zzp(i);
                        this.zzE.zzC = (int) j;
                        return;
                    case 21949:
                        zzp(i);
                        this.zzE.zzD = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }
}
