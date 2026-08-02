package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzavr implements zzauz {
    public static final zzavb zza = new zzavm();
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final UUID zzd = new UUID(72057594037932032L, -9223371306706625679L);
    private boolean zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private zzbaf zzE;
    private zzbaf zzF;
    private boolean zzG;
    private int zzH;
    private long zzI;
    private long zzJ;
    private int zzK;
    private int zzL;
    private int[] zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private byte zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    private boolean zzaa;
    private zzava zzab;
    private final zzavl zzac;
    private final zzavt zze;
    private final SparseArray zzf;
    private final boolean zzg;
    private final zzbak zzh;
    private final zzbak zzi;
    private final zzbak zzj;
    private final zzbak zzk;
    private final zzbak zzl;
    private final zzbak zzm;
    private final zzbak zzn;
    private final zzbak zzo;
    private final zzbak zzp;
    private ByteBuffer zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private zzavq zzw;
    private boolean zzx;
    private int zzy;
    private long zzz;

    public zzavr() {
        this(0);
    }

    static final int zzl(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    static final boolean zzm(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    private final long zzn(long j) throws zzasz {
        long j2 = this.zzt;
        if (j2 != -9223372036854775807L) {
            return zzbar.zzj(j, j2, 1000L);
        }
        throw new zzasz("Can't scale timecode prior to timecodeScale being set.");
    }

    private final void zzo(zzavq zzavqVar, long j) {
        byte[] zzq;
        if ("S_TEXT/UTF8".equals(zzavqVar.zza)) {
            byte[] bArr = this.zzn.zza;
            long j2 = this.zzJ;
            if (j2 == -9223372036854775807L) {
                zzq = zzc;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (i * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - (60000000 * i2);
                zzq = zzbar.zzq(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf((int) (j4 / 1000000)), Integer.valueOf((int) ((j4 - (r7 * DurationKt.NANOS_IN_MILLIS)) / 1000))));
            }
            System.arraycopy(zzq, 0, bArr, 19, 12);
            zzavi zzaviVar = zzavqVar.zzN;
            zzbak zzbakVar = this.zzn;
            zzaviVar.zzb(zzbakVar, zzbakVar.zzd());
            this.zzY += this.zzn.zzd();
        }
        zzavqVar.zzN.zzc(j, this.zzP, this.zzY, 0, zzavqVar.zzg);
        this.zzZ = true;
        zzp();
    }

    private final void zzp() {
        this.zzQ = 0;
        this.zzY = 0;
        this.zzX = 0;
        this.zzR = false;
        this.zzS = false;
        this.zzU = false;
        this.zzW = 0;
        this.zzV = (byte) 0;
        this.zzT = false;
        this.zzm.zzr();
    }

    private static int[] zzq(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    private final int zzr(zzauy zzauyVar, zzavi zzaviVar, int i) throws IOException, InterruptedException {
        int zzd2;
        int zza2 = this.zzm.zza();
        if (zza2 > 0) {
            zzd2 = Math.min(i, zza2);
            zzaviVar.zzb(this.zzm, zzd2);
        } else {
            zzd2 = zzaviVar.zzd(zzauyVar, i, false);
        }
        this.zzQ += zzd2;
        this.zzY += zzd2;
        return zzd2;
    }

    private final void zzs(zzauy zzauyVar, int i) throws IOException, InterruptedException {
        if (this.zzj.zzd() >= i) {
            return;
        }
        if (this.zzj.zzb() < i) {
            zzbak zzbakVar = this.zzj;
            byte[] bArr = zzbakVar.zza;
            int length = bArr.length;
            zzbakVar.zzt(Arrays.copyOf(bArr, Math.max(length + length, i)), this.zzj.zzd());
        }
        zzbak zzbakVar2 = this.zzj;
        zzauyVar.zzh(zzbakVar2.zza, zzbakVar2.zzd(), i - this.zzj.zzd(), false);
        this.zzj.zzu(i);
    }

    private final void zzt(zzauy zzauyVar, zzavq zzavqVar, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzavqVar.zza)) {
            int i3 = i + 32;
            if (this.zzn.zzb() < i3) {
                this.zzn.zza = Arrays.copyOf(zzb, i3 + i);
            }
            zzauyVar.zzh(this.zzn.zza, 32, i, false);
            this.zzn.zzv(0);
            this.zzn.zzu(i3);
            return;
        }
        zzavi zzaviVar = zzavqVar.zzN;
        if (!this.zzR) {
            if (zzavqVar.zze) {
                this.zzP &= -1073741825;
                if (!this.zzS) {
                    zzauyVar.zzh(this.zzj.zza, 0, 1, false);
                    this.zzQ++;
                    byte b = this.zzj.zza[0];
                    if ((b & ByteCompanionObject.MIN_VALUE) == 128) {
                        throw new zzasz("Extension bit is set in signal byte");
                    }
                    this.zzV = b;
                    this.zzS = true;
                }
                byte b2 = this.zzV;
                if ((b2 & 1) == 1) {
                    int i4 = b2 & 2;
                    this.zzP |= BasicMeasure.EXACTLY;
                    if (!this.zzT) {
                        zzauyVar.zzh(this.zzo.zza, 0, 8, false);
                        this.zzQ += 8;
                        this.zzT = true;
                        zzbak zzbakVar = this.zzj;
                        zzbakVar.zza[0] = (byte) ((i4 != 2 ? 0 : 128) | 8);
                        zzbakVar.zzv(0);
                        zzaviVar.zzb(this.zzj, 1);
                        this.zzY++;
                        this.zzo.zzv(0);
                        zzaviVar.zzb(this.zzo, 8);
                        this.zzY += 8;
                    }
                    if (i4 == 2) {
                        if (!this.zzU) {
                            zzauyVar.zzh(this.zzj.zza, 0, 1, false);
                            this.zzQ++;
                            this.zzj.zzv(0);
                            this.zzW = this.zzj.zzg();
                            this.zzU = true;
                        }
                        int i5 = this.zzW * 4;
                        this.zzj.zzs(i5);
                        zzauyVar.zzh(this.zzj.zza, 0, i5, false);
                        this.zzQ += i5;
                        int i6 = (this.zzW >> 1) + 1;
                        int i7 = (i6 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzq;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.zzq = ByteBuffer.allocate(i7);
                        }
                        this.zzq.position(0);
                        this.zzq.putShort((short) i6);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.zzW;
                            if (i8 >= i2) {
                                break;
                            }
                            int zzi = this.zzj.zzi();
                            if (i8 % 2 == 0) {
                                this.zzq.putShort((short) (zzi - i9));
                            } else {
                                this.zzq.putInt(zzi - i9);
                            }
                            i8++;
                            i9 = zzi;
                        }
                        int i10 = (i - this.zzQ) - i9;
                        if ((i2 & 1) == 1) {
                            this.zzq.putInt(i10);
                        } else {
                            this.zzq.putShort((short) i10);
                            this.zzq.putInt(0);
                        }
                        this.zzp.zzt(this.zzq.array(), i7);
                        zzaviVar.zzb(this.zzp, i7);
                        this.zzY += i7;
                    }
                }
            } else {
                byte[] bArr = zzavqVar.zzf;
                if (bArr != null) {
                    this.zzm.zzt(bArr, bArr.length);
                }
            }
            this.zzR = true;
        }
        int zzd2 = i + this.zzm.zzd();
        if (!"V_MPEG4/ISO/AVC".equals(zzavqVar.zza) && !"V_MPEGH/ISO/HEVC".equals(zzavqVar.zza)) {
            while (true) {
                int i11 = this.zzQ;
                if (i11 >= zzd2) {
                    break;
                } else {
                    zzr(zzauyVar, zzaviVar, zzd2 - i11);
                }
            }
        } else {
            byte[] bArr2 = this.zzi.zza;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i12 = zzavqVar.zzO;
            int i13 = 4 - i12;
            while (this.zzQ < zzd2) {
                int i14 = this.zzX;
                if (i14 == 0) {
                    int min = Math.min(i12, this.zzm.zza());
                    zzauyVar.zzh(bArr2, i13 + min, i12 - min, false);
                    if (min > 0) {
                        this.zzm.zzq(bArr2, i13, min);
                    }
                    this.zzQ += i12;
                    this.zzi.zzv(0);
                    this.zzX = this.zzi.zzi();
                    this.zzh.zzv(0);
                    zzaviVar.zzb(this.zzh, 4);
                    this.zzY += 4;
                } else {
                    this.zzX = i14 - zzr(zzauyVar, zzaviVar, i14);
                }
            }
        }
        if ("A_VORBIS".equals(zzavqVar.zza)) {
            this.zzk.zzv(0);
            zzaviVar.zzb(this.zzk, 4);
            this.zzY += 4;
        }
    }

    final void zzc(int i, double d) {
        if (i == 181) {
            this.zzw.zzI = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzu = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                this.zzw.zzw = (float) d;
                break;
            case 21970:
                this.zzw.zzx = (float) d;
                break;
            case 21971:
                this.zzw.zzy = (float) d;
                break;
            case 21972:
                this.zzw.zzz = (float) d;
                break;
            case 21973:
                this.zzw.zzA = (float) d;
                break;
            case 21974:
                this.zzw.zzB = (float) d;
                break;
            case 21975:
                this.zzw.zzC = (float) d;
                break;
            case 21976:
                this.zzw.zzD = (float) d;
                break;
            case 21977:
                this.zzw.zzE = (float) d;
                break;
            case 21978:
                this.zzw.zzF = (float) d;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauz
    public final void zzd(zzava zzavaVar) {
        this.zzab = zzavaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauz
    public final void zze(long j, long j2) {
        this.zzD = -9223372036854775807L;
        this.zzH = 0;
        this.zzac.zza();
        this.zze.zzd();
        zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzauz
    public final int zzf(zzauy zzauyVar, zzave zzaveVar) throws IOException, InterruptedException {
        this.zzZ = false;
        while (!this.zzZ) {
            if (!this.zzac.zzc(zzauyVar)) {
                return -1;
            }
            long zzd2 = zzauyVar.zzd();
            if (this.zzA) {
                this.zzC = zzd2;
                zzaveVar.zza = this.zzB;
                this.zzA = false;
                return 1;
            }
            if (this.zzx) {
                long j = this.zzC;
                if (j != -1) {
                    zzaveVar.zza = j;
                    this.zzC = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzauz
    public final boolean zzg(zzauy zzauyVar) throws IOException, InterruptedException {
        return new zzavs().zza(zzauyVar);
    }

    final void zzi(int i, long j, long j2) throws zzasz {
        if (i == 160) {
            this.zzaa = false;
            return;
        }
        if (i == 174) {
            this.zzw = new zzavq(null);
            return;
        }
        if (i == 187) {
            this.zzG = false;
            return;
        }
        if (i == 19899) {
            this.zzy = -1;
            this.zzz = -1L;
            return;
        }
        if (i == 20533) {
            this.zzw.zze = true;
            return;
        }
        if (i == 21968) {
            this.zzw.zzq = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzs;
            if (j3 != -1 && j3 != j) {
                throw new zzasz("Multiple Segment elements not supported");
            }
            this.zzs = j;
            this.zzr = j2;
            return;
        }
        if (i == 475249515) {
            this.zzE = new zzbaf(32);
            this.zzF = new zzbaf(32);
        } else if (i == 524531317 && !this.zzx) {
            if (this.zzg && this.zzB != -1) {
                this.zzA = true;
            } else {
                this.zzab.zzc(new zzavf(this.zzv));
                this.zzx = true;
            }
        }
    }

    public zzavr(int i) {
        zzavl zzavlVar = new zzavl();
        this.zzs = -1L;
        this.zzt = -9223372036854775807L;
        this.zzu = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzB = -1L;
        this.zzC = -1L;
        this.zzD = -9223372036854775807L;
        this.zzac = zzavlVar;
        zzavlVar.zzb(new zzavo(this, null));
        this.zzg = true;
        this.zze = new zzavt();
        this.zzf = new SparseArray();
        this.zzj = new zzbak(4);
        this.zzk = new zzbak(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzl = new zzbak(4);
        this.zzh = new zzbak(zzbai.zza);
        this.zzi = new zzbak(4);
        this.zzm = new zzbak();
        this.zzn = new zzbak();
        this.zzo = new zzbak(8);
        this.zzp = new zzbak();
    }

    final void zzj(int i, String str) throws zzasz {
        if (i == 134) {
            this.zzw.zza = str;
            return;
        }
        if (i != 17026) {
            if (i != 2274716) {
                return;
            }
            this.zzw.zzP = str;
        } else {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw new zzasz("DocType " + str + " not supported");
        }
    }

    final void zzh(int i, long j) throws zzasz {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw new zzasz("ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw new zzasz("ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                this.zzw.zzc = (int) j;
                return;
            case 136:
                this.zzw.zzL = j == 1;
                return;
            case 155:
                this.zzJ = zzn(j);
                return;
            case 159:
                this.zzw.zzG = (int) j;
                return;
            case 176:
                this.zzw.zzj = (int) j;
                return;
            case 179:
                this.zzE.zzc(zzn(j));
                return;
            case 186:
                this.zzw.zzk = (int) j;
                return;
            case 215:
                this.zzw.zzb = (int) j;
                return;
            case 231:
                this.zzD = zzn(j);
                return;
            case 241:
                if (this.zzG) {
                    return;
                }
                this.zzF.zzc(j);
                this.zzG = true;
                return;
            case 251:
                this.zzaa = true;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw new zzasz("ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw new zzasz("DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw new zzasz("EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw new zzasz("ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw new zzasz("AESSettingsCipherMode " + j + " not supported");
            case 21420:
                this.zzz = j + this.zzs;
                return;
            case 21432:
                int i2 = (int) j;
                if (i2 == 0) {
                    this.zzw.zzp = 0;
                    return;
                }
                if (i2 == 1) {
                    this.zzw.zzp = 2;
                    return;
                } else if (i2 == 3) {
                    this.zzw.zzp = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.zzw.zzp = 3;
                    return;
                }
            case 21680:
                this.zzw.zzl = (int) j;
                return;
            case 21682:
                this.zzw.zzn = (int) j;
                return;
            case 21690:
                this.zzw.zzm = (int) j;
                return;
            case 21930:
                this.zzw.zzM = j == 1;
                return;
            case 22186:
                this.zzw.zzJ = j;
                return;
            case 22203:
                this.zzw.zzK = j;
                return;
            case 25188:
                this.zzw.zzH = (int) j;
                return;
            case 2352003:
                this.zzw.zzd = (int) j;
                return;
            case 2807729:
                this.zzt = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i3 = (int) j;
                        if (i3 == 1) {
                            this.zzw.zzt = 2;
                            return;
                        } else {
                            if (i3 != 2) {
                                return;
                            }
                            this.zzw.zzt = 1;
                            return;
                        }
                    case 21946:
                        int i4 = (int) j;
                        if (i4 != 1) {
                            if (i4 == 16) {
                                this.zzw.zzs = 6;
                                return;
                            } else if (i4 == 18) {
                                this.zzw.zzs = 7;
                                return;
                            } else if (i4 != 6 && i4 != 7) {
                                return;
                            }
                        }
                        this.zzw.zzs = 3;
                        return;
                    case 21947:
                        zzavq zzavqVar = this.zzw;
                        zzavqVar.zzq = true;
                        int i5 = (int) j;
                        if (i5 == 1) {
                            zzavqVar.zzr = 1;
                            return;
                        }
                        if (i5 == 9) {
                            zzavqVar.zzr = 6;
                            return;
                        } else {
                            if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                zzavqVar.zzr = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        this.zzw.zzu = (int) j;
                        return;
                    case 21949:
                        this.zzw.zzv = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f1, code lost:
    
        throw new com.google.android.gms.internal.ads.zzasz("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzk(int i, int i2, zzauy zzauyVar) throws IOException, InterruptedException {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = 1;
        if (i8 != 161 && i8 != 163) {
            if (i8 == 16981) {
                zzavq zzavqVar = this.zzw;
                zzavqVar.zzf = new byte[i2];
                zzauyVar.zzh(zzavqVar.zzf, 0, i2, false);
                return;
            }
            if (i8 == 18402) {
                byte[] bArr = new byte[i2];
                zzauyVar.zzh(bArr, 0, i2, false);
                this.zzw.zzg = new zzavh(1, bArr);
                return;
            }
            if (i8 == 21419) {
                Arrays.fill(this.zzl.zza, (byte) 0);
                zzauyVar.zzh(this.zzl.zza, 4 - i2, i2, false);
                this.zzl.zzv(0);
                this.zzy = (int) this.zzl.zzm();
                return;
            }
            if (i8 == 25506) {
                zzavq zzavqVar2 = this.zzw;
                zzavqVar2.zzh = new byte[i2];
                zzauyVar.zzh(zzavqVar2.zzh, 0, i2, false);
                return;
            } else if (i8 == 30322) {
                zzavq zzavqVar3 = this.zzw;
                zzavqVar3.zzo = new byte[i2];
                zzauyVar.zzh(zzavqVar3.zzo, 0, i2, false);
                return;
            } else {
                throw new zzasz("Unexpected id: " + i8);
            }
        }
        int i10 = 8;
        if (this.zzH == 0) {
            this.zzN = (int) this.zze.zze(zzauyVar, false, true, 8);
            this.zzO = this.zze.zza();
            this.zzJ = -9223372036854775807L;
            this.zzH = 1;
            this.zzj.zzr();
        }
        zzavq zzavqVar4 = (zzavq) this.zzf.get(this.zzN);
        if (zzavqVar4 == null) {
            zzauyVar.zzi(i2 - this.zzO, false);
            this.zzH = 0;
            return;
        }
        if (this.zzH == 1) {
            zzs(zzauyVar, 3);
            int i11 = (this.zzj.zza[2] & 6) >> 1;
            byte b = UByte.MAX_VALUE;
            if (i11 == 0) {
                this.zzL = 1;
                int[] zzq = zzq(this.zzM, 1);
                this.zzM = zzq;
                zzq[0] = (i2 - this.zzO) - 3;
            } else {
                if (i8 != 163) {
                    throw new zzasz("Lacing only supported in SimpleBlocks.");
                }
                int i12 = 4;
                zzs(zzauyVar, 4);
                int i13 = (this.zzj.zza[3] & UByte.MAX_VALUE) + 1;
                this.zzL = i13;
                int[] zzq2 = zzq(this.zzM, i13);
                this.zzM = zzq2;
                if (i11 == 2) {
                    int i14 = this.zzO;
                    int i15 = this.zzL;
                    Arrays.fill(zzq2, 0, i15, ((i2 - i14) - 4) / i15);
                } else if (i11 == 1) {
                    int i16 = 0;
                    int i17 = 0;
                    while (true) {
                        i4 = this.zzL - 1;
                        if (i16 >= i4) {
                            break;
                        }
                        this.zzM[i16] = 0;
                        do {
                            i12++;
                            zzs(zzauyVar, i12);
                            i5 = this.zzj.zza[i12 - 1] & UByte.MAX_VALUE;
                            int[] iArr = this.zzM;
                            i6 = iArr[i16] + i5;
                            iArr[i16] = i6;
                        } while (i5 == 255);
                        i17 += i6;
                        i16++;
                    }
                    this.zzM[i4] = ((i2 - this.zzO) - i12) - i17;
                } else {
                    if (i11 != 3) {
                        throw new zzasz("Unexpected lacing value: 2");
                    }
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        int i20 = this.zzL - 1;
                        if (i18 >= i20) {
                            this.zzM[i20] = ((i2 - this.zzO) - i12) - i19;
                            break;
                        }
                        this.zzM[i18] = 0;
                        i12++;
                        zzs(zzauyVar, i12);
                        int i21 = i12 - 1;
                        if (this.zzj.zza[i21] == 0) {
                            throw new zzasz("No valid varint length mask found");
                        }
                        int i22 = 0;
                        while (true) {
                            if (i22 >= i10) {
                                j = 0;
                                break;
                            }
                            int i23 = i9 << (7 - i22);
                            if ((this.zzj.zza[i21] & i23) != 0) {
                                int i24 = i12 + i22;
                                zzs(zzauyVar, i24);
                                int i25 = i21 + 1;
                                j = (~i23) & this.zzj.zza[i21] & b;
                                while (i25 < i24) {
                                    j = (j << i10) | (this.zzj.zza[i25] & b);
                                    i25++;
                                    i24 = i24;
                                    i10 = 8;
                                    b = UByte.MAX_VALUE;
                                }
                                int i26 = i24;
                                if (i18 > 0) {
                                    j -= (1 << ((i22 * 7) + 6)) - 1;
                                }
                                i12 = i26;
                            } else {
                                i22++;
                                i9 = 1;
                                i10 = 8;
                                b = UByte.MAX_VALUE;
                            }
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            break;
                        }
                        int i27 = (int) j;
                        int[] iArr2 = this.zzM;
                        if (i18 != 0) {
                            i27 += iArr2[i18 - 1];
                        }
                        iArr2[i18] = i27;
                        i19 += i27;
                        i18++;
                        i9 = 1;
                        i10 = 8;
                        b = UByte.MAX_VALUE;
                    }
                }
            }
            byte b2 = this.zzj.zza[0];
            this.zzI = this.zzD + zzn((r2[1] & UByte.MAX_VALUE) | (b2 << 8));
            byte b3 = this.zzj.zza[2];
            int i28 = b3 & 8;
            if (zzavqVar4.zzc != 2) {
                if (i8 != 163) {
                    i7 = 0;
                } else if ((b3 & ByteCompanionObject.MIN_VALUE) == 128) {
                    i8 = 163;
                } else {
                    i7 = 0;
                    i8 = 163;
                }
                this.zzP = i7 | (i28 != 8 ? Integer.MIN_VALUE : 0);
                this.zzH = 2;
                this.zzK = 0;
                i3 = 163;
            }
            i7 = 1;
            this.zzP = i7 | (i28 != 8 ? Integer.MIN_VALUE : 0);
            this.zzH = 2;
            this.zzK = 0;
            i3 = 163;
        } else {
            i3 = 163;
        }
        if (i8 != i3) {
            zzt(zzauyVar, zzavqVar4, this.zzM[0]);
            return;
        }
        while (true) {
            int i29 = this.zzK;
            if (i29 >= this.zzL) {
                this.zzH = 0;
                return;
            } else {
                zzt(zzauyVar, zzavqVar4, this.zzM[i29]);
                zzo(zzavqVar4, this.zzI + ((this.zzK * zzavqVar4.zzd) / 1000));
                this.zzK++;
            }
        }
    }

    final void zzb(int i) throws zzasz {
        zzavg zzavfVar;
        zzbaf zzbafVar;
        zzbaf zzbafVar2;
        int i2;
        int i3 = 0;
        if (i == 160) {
            if (this.zzH != 2) {
                return;
            }
            if (!this.zzaa) {
                this.zzP |= 1;
            }
            zzo((zzavq) this.zzf.get(this.zzN), this.zzI);
            this.zzH = 0;
            return;
        }
        if (i == 174) {
            String str = this.zzw.zza;
            if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                zzavq zzavqVar = this.zzw;
                zzavqVar.zzb(this.zzab, zzavqVar.zzb);
                SparseArray sparseArray = this.zzf;
                zzavq zzavqVar2 = this.zzw;
                sparseArray.put(zzavqVar2.zzb, zzavqVar2);
            }
            this.zzw = null;
            return;
        }
        if (i == 19899) {
            int i4 = this.zzy;
            if (i4 != -1) {
                long j = this.zzz;
                if (j != -1) {
                    if (i4 == 475249515) {
                        this.zzB = j;
                        return;
                    }
                    return;
                }
            }
            throw new zzasz("Mandatory element SeekID or SeekPosition not found");
        }
        if (i == 25152) {
            zzavq zzavqVar3 = this.zzw;
            if (zzavqVar3.zze) {
                if (zzavqVar3.zzg == null) {
                    throw new zzasz("Encrypted Track found but ContentEncKeyID was not found");
                }
                zzavqVar3.zzi = new zzauv(new zzauu(zzash.zzb, "video/webm", this.zzw.zzg.zzb, false));
                return;
            }
            return;
        }
        if (i == 28032) {
            zzavq zzavqVar4 = this.zzw;
            if (zzavqVar4.zze && zzavqVar4.zzf != null) {
                throw new zzasz("Combining encryption and compression is not supported");
            }
            return;
        }
        if (i == 357149030) {
            if (this.zzt == -9223372036854775807L) {
                this.zzt = 1000000L;
            }
            long j2 = this.zzu;
            if (j2 != -9223372036854775807L) {
                this.zzv = zzn(j2);
                return;
            }
            return;
        }
        if (i == 374648427) {
            if (this.zzf.size() == 0) {
                throw new zzasz("No valid tracks were found");
            }
            this.zzab.zzb();
            return;
        }
        if (i == 475249515 && !this.zzx) {
            zzava zzavaVar = this.zzab;
            if (this.zzs == -1 || this.zzv == -9223372036854775807L || (zzbafVar = this.zzE) == null || zzbafVar.zza() == 0 || (zzbafVar2 = this.zzF) == null || zzbafVar2.zza() != zzbafVar.zza()) {
                this.zzE = null;
                this.zzF = null;
                zzavfVar = new zzavf(this.zzv);
            } else {
                int zza2 = zzbafVar.zza();
                int[] iArr = new int[zza2];
                long[] jArr = new long[zza2];
                long[] jArr2 = new long[zza2];
                long[] jArr3 = new long[zza2];
                for (int i5 = 0; i5 < zza2; i5++) {
                    jArr3[i5] = this.zzE.zzb(i5);
                    jArr[i5] = this.zzs + this.zzF.zzb(i5);
                }
                while (true) {
                    i2 = zza2 - 1;
                    if (i3 >= i2) {
                        break;
                    }
                    int i6 = i3 + 1;
                    iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                    jArr2[i3] = jArr3[i6] - jArr3[i3];
                    i3 = i6;
                }
                iArr[i2] = (int) ((this.zzs + this.zzr) - jArr[i2]);
                jArr2[i2] = this.zzv - jArr3[i2];
                this.zzE = null;
                this.zzF = null;
                zzavfVar = new zzaux(iArr, jArr, jArr2, jArr3);
            }
            zzavaVar.zzc(zzavfVar);
            this.zzx = true;
        }
    }
}
