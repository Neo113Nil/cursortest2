package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaeh {
    public byte[] zzM;
    public zzaaq zzS;
    public boolean zzT;
    public zzaap zzV;
    public int zzW;
    private int zzX;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzaao zzi;
    public byte[] zzj;
    public zzx zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = 0.0f;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = 1000;
    public int zzB = 200;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = 8000;
    public long zzQ = 0;
    public long zzR = 0;
    public boolean zzU = true;
    private String zzY = "eng";

    protected zzaeh() {
    }

    private static Pair zzf(zzef zzefVar) throws zzbu {
        try {
            zzefVar.zzG(16);
            long zzq = zzefVar.zzq();
            if (zzq == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzq == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzq != 826496599) {
                zzdw.zze("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int zzc = zzefVar.zzc() + 20;
            byte[] zzH = zzefVar.zzH();
            while (true) {
                int length = zzH.length;
                if (zzc >= length - 4) {
                    throw zzbu.zza("Failed to find FourCC VC1 initialization data", null);
                }
                if (zzH[zzc] == 0 && zzH[zzc + 1] == 0 && zzH[zzc + 2] == 1 && zzH[zzc + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzH, zzc, length)));
                }
                zzc++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzbu {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzbu.zza("Error parsing vorbis codec private", null);
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                i = bArr[i4] & 255;
                if (i != 255) {
                    break;
                }
                i3 += 255;
                i4++;
            }
            int i5 = i4 + 1;
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                i2 = bArr[i5] & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
                i5++;
            }
            int i8 = i5 + 1;
            int i9 = i7 + i2;
            if (bArr[i8] != 1) {
                throw zzbu.zza("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i8, bArr2, 0, i6);
            int i10 = i8 + i6;
            if (bArr[i10] != 3) {
                throw zzbu.zza("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzbu.zza("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzef zzefVar) throws zzbu {
        try {
            int zzi = zzefVar.zzi();
            if (zzi == 1) {
                return true;
            }
            if (zzi == 65534) {
                zzefVar.zzF(24);
                if (zzefVar.zzr() == zzaei.zzf.getMostSignificantBits()) {
                    if (zzefVar.zzr() == zzaei.zzf.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbu.zza("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzbu {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbu.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03d3  */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(zzzl zzzlVar, int i) throws zzbu {
        char c;
        List singletonList;
        List list;
        String str;
        int i2;
        String str2;
        byte[] bArr;
        String str3;
        zzad zzadVar;
        int i3;
        int i4;
        zzze zza;
        String str4 = this.zzb;
        int i5 = 1;
        int i6 = 4;
        int i7 = 0;
        switch (str4.hashCode()) {
            case -2095576542:
                if (str4.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str4.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str4.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str4.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str4.equals("A_VORBIS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str4.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str4.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str4.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str4.equals("S_DVBSUB")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str4.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str4.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str4.equals("S_VOBSUB")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str4.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str4.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str4.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str4.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str4.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str4.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str4.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str4.equals("S_HDMV/PGS")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str4.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str4.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str4.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str4.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str4.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str4.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str4.equals("V_MPEGH/ISO/HEVC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                if (str4.equals("S_TEXT/WEBVTT")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str4.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str4.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str4.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str4.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str4.equals("A_OPUS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        int i8 = 4096;
        String str5 = "audio/raw";
        zzq zzqVar = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        byte[] bArr2 = null;
        switch (c) {
            case 0:
                str5 = "video/x-vnd.on2.vp8";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null && (zza = zzze.zza(new zzef(bArr))) != null) {
                    str2 = zza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                int i9 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(i6);
                } else if (zzbt.zzh(str3)) {
                    if (this.zzp == 0) {
                        int i10 = this.zzn;
                        i3 = -1;
                        if (i10 == -1) {
                            i10 = this.zzl;
                        }
                        this.zzn = i10;
                        int i11 = this.zzo;
                        if (i11 == -1) {
                            i11 = this.zzm;
                        }
                        this.zzo = i11;
                    } else {
                        i3 = -1;
                    }
                    float f = (this.zzn == i3 || (i4 = this.zzo) == i3) ? -1.0f : (this.zzm * r6) / (this.zzl * i4);
                    if (this.zzw) {
                        if (this.zzC != -1.0f && this.zzD != -1.0f && this.zzE != -1.0f && this.zzF != -1.0f && this.zzG != -1.0f && this.zzH != -1.0f && this.zzI != -1.0f && this.zzJ != -1.0f && this.zzK != -1.0f && this.zzL != -1.0f) {
                            bArr2 = new byte[25];
                            ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                            order.put((byte) 0);
                            order.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            order.putShort((short) (this.zzK + 0.5f));
                            order.putShort((short) (this.zzL + 0.5f));
                            order.putShort((short) this.zzA);
                            order.putShort((short) this.zzB);
                        }
                        zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                    }
                    if (this.zza != null && zzaei.zzg.containsKey(this.zza)) {
                        i3 = ((Integer) zzaei.zzg.get(this.zza)).intValue();
                    }
                    if (this.zzq == 0 && Float.compare(this.zzr, 0.0f) == 0 && Float.compare(this.zzs, 0.0f) == 0) {
                        if (Float.compare(this.zzt, 0.0f) != 0) {
                            if (Float.compare(this.zzs, 90.0f) == 0) {
                                i7 = 90;
                            } else if (Float.compare(this.zzs, -180.0f) == 0 || Float.compare(this.zzs, 180.0f) == 0) {
                                i7 = 180;
                            } else if (Float.compare(this.zzs, -90.0f) == 0) {
                                i7 = 270;
                            }
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i7);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                        i5 = 2;
                    }
                    i7 = i3;
                    zzadVar.zzX(this.zzl);
                    zzadVar.zzF(this.zzm);
                    zzadVar.zzP(f);
                    zzadVar.zzR(i7);
                    zzadVar.zzQ(this.zzu);
                    zzadVar.zzV(this.zzv);
                    zzadVar.zzy(zzqVar);
                    i5 = 2;
                } else {
                    if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw zzbu.zza("Unexpected MIME type.", null);
                    }
                    i5 = 3;
                }
                if (this.zza != null && !zzaei.zzg.containsKey(this.zza)) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i9);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY = zzadVar.zzY();
                zzaap zzv = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv;
                zzv.zzk(zzY);
                return;
            case 1:
                str5 = "video/x-vnd.on2.vp9";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zza.zza;
                    str5 = "video/dolby-vision";
                    break;
                }
                str3 = str5;
                int i92 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                    zzadVar.zzJ(this.zza);
                    break;
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i92);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY2 = zzadVar.zzY();
                zzaap zzv2 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv2;
                zzv2.zzk(zzY2);
                return;
            case 2:
                str5 = "video/av01";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i922 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i922);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY22 = zzadVar.zzY();
                zzaap zzv22 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv22;
                zzv22.zzk(zzY22);
                return;
            case 3:
                str5 = "video/mpeg2";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i9222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i9222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY222 = zzadVar.zzY();
                zzaap zzv222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv222;
                zzv222.zzk(zzY222);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr3 = this.zzj;
                singletonList = bArr3 == null ? null : Collections.singletonList(bArr3);
                str5 = "video/mp4v-es";
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i92222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i92222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY2222 = zzadVar.zzY();
                zzaap zzv2222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv2222;
                zzv2222.zzk(zzY2222);
                return;
            case 7:
                zzyn zza2 = zzyn.zza(new zzef(zzi(str4)));
                list = zza2.zza;
                this.zzW = zza2.zzb;
                str = zza2.zzf;
                str5 = "video/avc";
                i2 = -1;
                i6 = -1;
                List list2 = list;
                str2 = str;
                singletonList = list2;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i922222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i922222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY22222 = zzadVar.zzY();
                zzaap zzv22222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv22222;
                zzv22222.zzk(zzY22222);
                return;
            case '\b':
                zzzy zza3 = zzzy.zza(new zzef(zzi(str4)));
                list = zza3.zza;
                this.zzW = zza3.zzb;
                str = zza3.zzd;
                str5 = "video/hevc";
                i2 = -1;
                i6 = -1;
                List list22 = list;
                str2 = str;
                singletonList = list22;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i9222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i9222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY222222 = zzadVar.zzY();
                zzaap zzv222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv222222;
                zzv222222.zzk(zzY222222);
                return;
            case '\t':
                Pair zzf = zzf(new zzef(zzi(str4)));
                str5 = (String) zzf.first;
                singletonList = (List) zzf.second;
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i92222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i92222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY2222222 = zzadVar.zzY();
                zzaap zzv2222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv2222222;
                zzv2222222.zzk(zzY2222222);
                return;
            case '\n':
                str5 = "video/x-unknown";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i922222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i922222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY22222222 = zzadVar.zzY();
                zzaap zzv22222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv22222222;
                zzv22222222.zzk(zzY22222222);
                return;
            case 11:
                singletonList = zzg(zzi(str4));
                i8 = 8192;
                str5 = "audio/vorbis";
                str2 = null;
                i2 = i8;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i9222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i9222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY222222222 = zzadVar.zzY();
                zzaap zzv222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv222222222;
                zzv222222222.zzk(zzY222222222);
                return;
            case '\f':
                singletonList = new ArrayList(3);
                singletonList.add(zzi(this.zzb));
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzQ).array());
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzR).array());
                i8 = 5760;
                str5 = "audio/opus";
                str2 = null;
                i2 = i8;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i92222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i92222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY2222222222 = zzadVar.zzY();
                zzaap zzv2222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv2222222222;
                zzv2222222222.zzk(zzY2222222222);
                return;
            case '\r':
                singletonList = Collections.singletonList(zzi(str4));
                zzyf zza4 = zzyg.zza(this.zzj);
                this.zzP = zza4.zza;
                this.zzN = zza4.zzb;
                str2 = zza4.zzc;
                str5 = "audio/mp4a-latm";
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i922222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i922222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY22222222222 = zzadVar.zzY();
                zzaap zzv22222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv22222222222;
                zzv22222222222.zzk(zzY22222222222);
                return;
            case 14:
                str5 = "audio/mpeg-L2";
                singletonList = null;
                str2 = null;
                i2 = i8;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i9222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i9222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY222222222222 = zzadVar.zzY();
                zzaap zzv222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv222222222222;
                zzv222222222222.zzk(zzY222222222222);
                return;
            case 15:
                str5 = "audio/mpeg";
                singletonList = null;
                str2 = null;
                i2 = i8;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i92222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i92222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY2222222222222 = zzadVar.zzY();
                zzaap zzv2222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv2222222222222;
                zzv2222222222222.zzk(zzY2222222222222);
                return;
            case 16:
                str5 = "audio/ac3";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i922222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i922222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY22222222222222 = zzadVar.zzY();
                zzaap zzv22222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv22222222222222;
                zzv22222222222222.zzk(zzY22222222222222);
                return;
            case 17:
                str5 = "audio/eac3";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i9222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i9222222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY222222222222222 = zzadVar.zzY();
                zzaap zzv222222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv222222222222222;
                zzv222222222222222.zzk(zzY222222222222222);
                return;
            case 18:
                this.zzS = new zzaaq();
                str5 = "audio/true-hd";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i92222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i92222222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY2222222222222222 = zzadVar.zzY();
                zzaap zzv2222222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv2222222222222222;
                zzv2222222222222222.zzk(zzY2222222222222222);
                return;
            case 19:
            case 20:
                str5 = "audio/vnd.dts";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i922222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i922222222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY22222222222222222 = zzadVar.zzY();
                zzaap zzv22222222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv22222222222222222;
                zzv22222222222222222.zzk(zzY22222222222222222);
                return;
            case 21:
                str5 = "audio/vnd.dts.hd";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i9222222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i9222222222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY222222222222222222 = zzadVar.zzY();
                zzaap zzv222222222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv222222222222222222;
                zzv222222222222222222.zzk(zzY222222222222222222);
                return;
            case 22:
                singletonList = Collections.singletonList(zzi(str4));
                str5 = "audio/flac";
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i92222222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i92222222222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY2222222222222222222 = zzadVar.zzY();
                zzaap zzv2222222222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv2222222222222222222;
                zzv2222222222222222222.zzk(zzY2222222222222222222);
                return;
            case 23:
                if (zzh(new zzef(zzi(str4)))) {
                    i6 = zzen.zzn(this.zzO);
                    if (i6 == 0) {
                        zzdw.zze("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                    }
                    singletonList = null;
                    str2 = null;
                    i2 = -1;
                    bArr = this.zzM;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i922222222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                    zzadVar = new zzad();
                    if (!zzbt.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzadVar.zzG(i);
                    zzadVar.zzS(str3);
                    zzadVar.zzL(i2);
                    zzadVar.zzK(this.zzY);
                    zzadVar.zzU(i922222222222222222222);
                    zzadVar.zzI(singletonList);
                    zzadVar.zzx(str2);
                    zzadVar.zzB(this.zzk);
                    zzaf zzY22222222222222222222 = zzadVar.zzY();
                    zzaap zzv22222222222222222222 = zzzlVar.zzv(this.zzc, i5);
                    this.zzV = zzv22222222222222222222;
                    zzv22222222222222222222.zzk(zzY22222222222222222222);
                    return;
                }
                zzdw.zze("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                singletonList = null;
                str2 = null;
                str5 = "audio/x-unknown";
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i9222222222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i9222222222222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY222222222222222222222 = zzadVar.zzY();
                zzaap zzv222222222222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv222222222222222222222;
                zzv222222222222222222222.zzk(zzY222222222222222222222);
                return;
            case 24:
                i6 = zzen.zzn(this.zzO);
                if (i6 == 0) {
                    zzdw.zze("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                    singletonList = null;
                    str2 = null;
                    str5 = "audio/x-unknown";
                    i2 = -1;
                    i6 = -1;
                    bArr = this.zzM;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i92222222222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                    zzadVar = new zzad();
                    if (!zzbt.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzadVar.zzG(i);
                    zzadVar.zzS(str3);
                    zzadVar.zzL(i2);
                    zzadVar.zzK(this.zzY);
                    zzadVar.zzU(i92222222222222222222222);
                    zzadVar.zzI(singletonList);
                    zzadVar.zzx(str2);
                    zzadVar.zzB(this.zzk);
                    zzaf zzY2222222222222222222222 = zzadVar.zzY();
                    zzaap zzv2222222222222222222222 = zzzlVar.zzv(this.zzc, i5);
                    this.zzV = zzv2222222222222222222222;
                    zzv2222222222222222222222.zzk(zzY2222222222222222222222);
                    return;
                }
                singletonList = null;
                str2 = null;
                i2 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i922222222222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i922222222222222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY22222222222222222222222 = zzadVar.zzY();
                zzaap zzv22222222222222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv22222222222222222222222;
                zzv22222222222222222222222.zzk(zzY22222222222222222222222);
                return;
            case 25:
                int i12 = this.zzO;
                if (i12 == 8) {
                    i6 = 3;
                } else {
                    if (i12 != 16) {
                        zzdw.zze("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i12 + ". Setting mimeType to audio/x-unknown");
                        singletonList = null;
                        str2 = null;
                        str5 = "audio/x-unknown";
                        i2 = -1;
                        i6 = -1;
                        bArr = this.zzM;
                        if (bArr != null) {
                        }
                        str3 = str5;
                        int i9222222222222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                        zzadVar = new zzad();
                        if (!zzbt.zzg(str3)) {
                        }
                        if (this.zza != null) {
                        }
                        zzadVar.zzG(i);
                        zzadVar.zzS(str3);
                        zzadVar.zzL(i2);
                        zzadVar.zzK(this.zzY);
                        zzadVar.zzU(i9222222222222222222222222);
                        zzadVar.zzI(singletonList);
                        zzadVar.zzx(str2);
                        zzadVar.zzB(this.zzk);
                        zzaf zzY222222222222222222222222 = zzadVar.zzY();
                        zzaap zzv222222222222222222222222 = zzzlVar.zzv(this.zzc, i5);
                        this.zzV = zzv222222222222222222222222;
                        zzv222222222222222222222222.zzk(zzY222222222222222222222222);
                        return;
                    }
                    i6 = 268435456;
                }
                singletonList = null;
                str2 = null;
                i2 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i92222222222222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i92222222222222222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY2222222222222222222222222 = zzadVar.zzY();
                zzaap zzv2222222222222222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv2222222222222222222222222;
                zzv2222222222222222222222222.zzk(zzY2222222222222222222222222);
                return;
            case 26:
                int i13 = this.zzO;
                if (i13 != 32) {
                    zzdw.zze("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i13 + ". Setting mimeType to audio/x-unknown");
                    singletonList = null;
                    str2 = null;
                    str5 = "audio/x-unknown";
                    i2 = -1;
                    i6 = -1;
                    bArr = this.zzM;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i922222222222222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                    zzadVar = new zzad();
                    if (!zzbt.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzadVar.zzG(i);
                    zzadVar.zzS(str3);
                    zzadVar.zzL(i2);
                    zzadVar.zzK(this.zzY);
                    zzadVar.zzU(i922222222222222222222222222);
                    zzadVar.zzI(singletonList);
                    zzadVar.zzx(str2);
                    zzadVar.zzB(this.zzk);
                    zzaf zzY22222222222222222222222222 = zzadVar.zzY();
                    zzaap zzv22222222222222222222222222 = zzzlVar.zzv(this.zzc, i5);
                    this.zzV = zzv22222222222222222222222222;
                    zzv22222222222222222222222222.zzk(zzY22222222222222222222222222);
                    return;
                }
                singletonList = null;
                str2 = null;
                i2 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i9222222222222222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i9222222222222222222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY222222222222222222222222222 = zzadVar.zzY();
                zzaap zzv222222222222222222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv222222222222222222222222222;
                zzv222222222222222222222222222.zzk(zzY222222222222222222222222222);
                return;
            case 27:
                str5 = "application/x-subrip";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i92222222222222222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i92222222222222222222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY2222222222222222222222222222 = zzadVar.zzY();
                zzaap zzv2222222222222222222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv2222222222222222222222222222;
                zzv2222222222222222222222222222.zzk(zzY2222222222222222222222222222);
                return;
            case 28:
                singletonList = zzfvn.zzq(zzaei.zzc, zzi(this.zzb));
                str2 = null;
                str5 = "text/x-ssa";
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i922222222222222222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i922222222222222222222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY22222222222222222222222222222 = zzadVar.zzY();
                zzaap zzv22222222222222222222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv22222222222222222222222222222;
                zzv22222222222222222222222222222.zzk(zzY22222222222222222222222222222);
                return;
            case 29:
                singletonList = null;
                str2 = null;
                str5 = "text/vtt";
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i9222222222222222222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i9222222222222222222222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY222222222222222222222222222222 = zzadVar.zzY();
                zzaap zzv222222222222222222222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv222222222222222222222222222222;
                zzv222222222222222222222222222222.zzk(zzY222222222222222222222222222222);
                return;
            case 30:
                singletonList = zzfvn.zzp(zzi(str4));
                str5 = "application/vobsub";
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i92222222222222222222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i92222222222222222222222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY2222222222222222222222222222222 = zzadVar.zzY();
                zzaap zzv2222222222222222222222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv2222222222222222222222222222222;
                zzv2222222222222222222222222222222.zzk(zzY2222222222222222222222222222222);
                return;
            case 31:
                str5 = "application/pgs";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i922222222222222222222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i922222222222222222222222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY22222222222222222222222222222222 = zzadVar.zzY();
                zzaap zzv22222222222222222222222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv22222222222222222222222222222222;
                zzv22222222222222222222222222222222.zzk(zzY22222222222222222222222222222222);
                return;
            case ' ':
                byte[] bArr4 = new byte[4];
                System.arraycopy(zzi(str4), 0, bArr4, 0, 4);
                singletonList = zzfvn.zzp(bArr4);
                str5 = "application/dvbsubs";
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i9222222222222222222222222222222222 = (this.zzU ? 1 : 0) | (true == this.zzT ? 0 : 2);
                zzadVar = new zzad();
                if (!zzbt.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.zzY);
                zzadVar.zzU(i9222222222222222222222222222222222);
                zzadVar.zzI(singletonList);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzY222222222222222222222222222222222 = zzadVar.zzY();
                zzaap zzv222222222222222222222222222222222 = zzzlVar.zzv(this.zzc, i5);
                this.zzV = zzv222222222222222222222222222222222;
                zzv222222222222222222222222222222222.zzk(zzY222222222222222222222222222222222);
                return;
            default:
                throw zzbu.zza("Unrecognized codec identifier.", null);
        }
    }
}
