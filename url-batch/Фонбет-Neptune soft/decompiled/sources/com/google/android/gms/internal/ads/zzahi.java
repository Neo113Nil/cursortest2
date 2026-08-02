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
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzahi {
    public byte[] zzN;
    public zzadq zzT;
    public boolean zzU;
    public zzadp zzW;
    public int zzX;
    private int zzY;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzado zzi;
    public byte[] zzj;
    public zzy zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = 0;
    public int zzr = -1;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public byte[] zzv = null;
    public int zzw = -1;
    public boolean zzx = false;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = 1000;
    public int zzC = 200;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public int zzO = 1;
    public int zzP = -1;
    public int zzQ = 8000;
    public long zzR = 0;
    public long zzS = 0;
    public boolean zzV = true;
    private String zzZ = "eng";

    protected zzahi() {
    }

    private static Pair zzf(zzek zzekVar) throws zzbo {
        try {
            zzekVar.zzL(16);
            long zzs = zzekVar.zzs();
            if (zzs == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzs == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzs != 826496599) {
                zzea.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int zzd = zzekVar.zzd() + 20;
            byte[] zzM = zzekVar.zzM();
            while (true) {
                int length = zzM.length;
                if (zzd >= length - 4) {
                    throw zzbo.zza("Failed to find FourCC VC1 initialization data", null);
                }
                int i = zzd + 1;
                if (zzM[zzd] == 0 && zzM[i] == 0 && zzM[zzd + 2] == 1 && zzM[zzd + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzM, zzd, length)));
                }
                zzd = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbo.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzbo {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzbo.zza("Error parsing vorbis codec private", null);
            }
            int i3 = 1;
            int i4 = 0;
            while (true) {
                int i5 = bArr[i3];
                i3++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i4 += 255;
            }
            int i6 = i4 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i3];
                i3++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i3] != 1) {
                throw zzbo.zza("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i3, bArr2, 0, i6);
            int i10 = i3 + i6;
            if (bArr[i10] != 3) {
                throw zzbo.zza("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzbo.zza("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbo.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzek zzekVar) throws zzbo {
        try {
            int zzk = zzekVar.zzk();
            if (zzk == 1) {
                return true;
            }
            if (zzk == 65534) {
                zzekVar.zzK(24);
                if (zzekVar.zzt() == zzahj.zze.getMostSignificantBits()) {
                    if (zzekVar.zzt() == zzahj.zze.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbo.zza("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzbo {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbo.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03e4  */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(zzacn zzacnVar, int i) throws zzbo {
        char c;
        List singletonList;
        List list;
        String str;
        String str2;
        int i2;
        String str3;
        zzad zzadVar;
        zzo zzoVar;
        byte[] bArr;
        int i3;
        zzace zza;
        String str4 = this.zzb;
        int i4 = 1;
        int i5 = 4;
        int i6 = 0;
        int i7 = -1;
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
        String str5 = "audio/raw";
        switch (c) {
            case 0:
                str5 = "video/x-vnd.on2.vp8";
                i2 = -1;
                list = null;
                str2 = null;
                i5 = -1;
                if (this.zzN != null && (zza = zzace.zza(new zzek(this.zzN))) != null) {
                    str2 = zza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                int i8 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                    zzadVar.zzy(this.zzO);
                    zzadVar.zzY(this.zzQ);
                    zzadVar.zzR(i5);
                } else if (zzbn.zzi(str3)) {
                    if (this.zzq == 0) {
                        int i9 = this.zzo;
                        if (i9 == -1) {
                            i9 = this.zzl;
                        }
                        this.zzo = i9;
                        int i10 = this.zzp;
                        if (i10 == -1) {
                            i10 = this.zzm;
                        }
                        this.zzp = i10;
                    }
                    float f = (this.zzo == -1 || (i3 = this.zzp) == -1) ? -1.0f : (this.zzm * r6) / (this.zzl * i3);
                    if (this.zzx) {
                        if (this.zzD == -1.0f || this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f || this.zzM == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            order.put((byte) 0);
                            order.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            order.putShort((short) (this.zzL + 0.5f));
                            order.putShort((short) (this.zzM + 0.5f));
                            order.putShort((short) this.zzB);
                            order.putShort((short) this.zzC);
                        }
                        zzm zzmVar = new zzm();
                        zzmVar.zzc(this.zzy);
                        zzmVar.zzb(this.zzA);
                        zzmVar.zzd(this.zzz);
                        zzmVar.zze(bArr);
                        zzmVar.zzf(this.zzn);
                        zzmVar.zza(this.zzn);
                        zzoVar = zzmVar.zzg();
                    } else {
                        zzoVar = null;
                    }
                    if (this.zza != null && zzahj.zzf.containsKey(this.zza)) {
                        i7 = ((Integer) zzahj.zzf.get(this.zza)).intValue();
                    }
                    if (this.zzr == 0 && Float.compare(this.zzs, 0.0f) == 0 && Float.compare(this.zzt, 0.0f) == 0) {
                        if (Float.compare(this.zzu, 0.0f) != 0) {
                            if (Float.compare(this.zzu, 90.0f) == 0) {
                                i6 = 90;
                            } else if (Float.compare(this.zzu, -180.0f) == 0 || Float.compare(this.zzu, 180.0f) == 0) {
                                i6 = Opcodes.GETFIELD;
                            } else if (Float.compare(this.zzu, -90.0f) == 0) {
                                i6 = 270;
                            }
                        }
                        zzadVar.zzac(this.zzl);
                        zzadVar.zzI(this.zzm);
                        zzadVar.zzT(f);
                        zzadVar.zzW(i6);
                        zzadVar.zzU(this.zzv);
                        zzadVar.zzaa(this.zzw);
                        zzadVar.zzA(zzoVar);
                        i4 = 2;
                    }
                    i6 = i7;
                    zzadVar.zzac(this.zzl);
                    zzadVar.zzI(this.zzm);
                    zzadVar.zzT(f);
                    zzadVar.zzW(i6);
                    zzadVar.zzU(this.zzv);
                    zzadVar.zzaa(this.zzw);
                    zzadVar.zzA(zzoVar);
                    i4 = 2;
                } else {
                    if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw zzbo.zza("Unexpected MIME type.", null);
                    }
                    i4 = 3;
                }
                if (this.zza != null && !zzahj.zzf.containsKey(this.zza)) {
                    zzadVar.zzM(this.zza);
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i8);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad = zzadVar.zzad();
                zzadp zzw = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw;
                zzw.zzl(zzad);
                return;
            case 1:
                str5 = "video/x-vnd.on2.vp9";
                i2 = -1;
                list = null;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                    str2 = zza.zza;
                    str5 = "video/dolby-vision";
                    break;
                }
                str3 = str5;
                int i82 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                    zzadVar.zzM(this.zza);
                    break;
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i82);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad2 = zzadVar.zzad();
                zzadp zzw2 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw2;
                zzw2.zzl(zzad2);
                return;
            case 2:
                str5 = "video/av01";
                i2 = -1;
                list = null;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i822 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i822);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad22 = zzadVar.zzad();
                zzadp zzw22 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw22;
                zzw22.zzl(zzad22);
                return;
            case 3:
                str5 = "video/mpeg2";
                i2 = -1;
                list = null;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i8222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i8222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad222 = zzadVar.zzad();
                zzadp zzw222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw222;
                zzw222.zzl(zzad222);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr2 = this.zzj;
                singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str5 = "video/mp4v-es";
                list = singletonList;
                i2 = -1;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i82222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i82222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad2222 = zzadVar.zzad();
                zzadp zzw2222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw2222;
                zzw2222.zzl(zzad2222);
                return;
            case 7:
                zzabn zza2 = zzabn.zza(new zzek(zzi(this.zzb)));
                list = zza2.zza;
                this.zzX = zza2.zzb;
                str = zza2.zzk;
                str5 = "video/avc";
                str2 = str;
                i2 = -1;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i822222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i822222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad22222 = zzadVar.zzad();
                zzadp zzw22222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw22222;
                zzw22222.zzl(zzad22222);
                return;
            case '\b':
                zzacz zza3 = zzacz.zza(new zzek(zzi(this.zzb)));
                list = zza3.zza;
                this.zzX = zza3.zzb;
                str = zza3.zzi;
                str5 = "video/hevc";
                str2 = str;
                i2 = -1;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i8222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i8222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad222222 = zzadVar.zzad();
                zzadp zzw222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw222222;
                zzw222222.zzl(zzad222222);
                return;
            case '\t':
                Pair zzf = zzf(new zzek(zzi(this.zzb)));
                str5 = (String) zzf.first;
                singletonList = (List) zzf.second;
                list = singletonList;
                i2 = -1;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i82222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i82222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad2222222 = zzadVar.zzad();
                zzadp zzw2222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw2222222;
                zzw2222222.zzl(zzad2222222);
                return;
            case '\n':
                str5 = "video/x-unknown";
                i2 = -1;
                list = null;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i822222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i822222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad22222222 = zzadVar.zzad();
                zzadp zzw22222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw22222222;
                zzw22222222.zzl(zzad22222222);
                return;
            case 11:
                str5 = "audio/vorbis";
                list = zzg(zzi(str4));
                i2 = 8192;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i8222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i8222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad222222222 = zzadVar.zzad();
                zzadp zzw222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw222222222;
                zzw222222222.zzl(zzad222222222);
                return;
            case '\f':
                ArrayList arrayList = new ArrayList(3);
                arrayList.add(zzi(this.zzb));
                arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzR).array());
                arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzS).array());
                str5 = "audio/opus";
                list = arrayList;
                i2 = 5760;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i82222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i82222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad2222222222 = zzadVar.zzad();
                zzadp zzw2222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw2222222222;
                zzw2222222222.zzl(zzad2222222222);
                return;
            case '\r':
                List singletonList2 = Collections.singletonList(zzi(str4));
                zzabf zza4 = zzabg.zza(this.zzj);
                this.zzQ = zza4.zza;
                this.zzO = zza4.zzb;
                str5 = "audio/mp4a-latm";
                str2 = zza4.zzc;
                i5 = -1;
                list = singletonList2;
                i2 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i822222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i822222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad22222222222 = zzadVar.zzad();
                zzadp zzw22222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw22222222222;
                zzw22222222222.zzl(zzad22222222222);
                return;
            case 14:
                str5 = "audio/mpeg-L2";
                i2 = 4096;
                list = null;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i8222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i8222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad222222222222 = zzadVar.zzad();
                zzadp zzw222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw222222222222;
                zzw222222222222.zzl(zzad222222222222);
                return;
            case 15:
                str5 = "audio/mpeg";
                i2 = 4096;
                list = null;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i82222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i82222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad2222222222222 = zzadVar.zzad();
                zzadp zzw2222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw2222222222222;
                zzw2222222222222.zzl(zzad2222222222222);
                return;
            case 16:
                str5 = "audio/ac3";
                i2 = -1;
                list = null;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i822222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i822222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad22222222222222 = zzadVar.zzad();
                zzadp zzw22222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw22222222222222;
                zzw22222222222222.zzl(zzad22222222222222);
                return;
            case 17:
                str5 = "audio/eac3";
                i2 = -1;
                list = null;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i8222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i8222222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad222222222222222 = zzadVar.zzad();
                zzadp zzw222222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw222222222222222;
                zzw222222222222222.zzl(zzad222222222222222);
                return;
            case 18:
                this.zzT = new zzadq();
                str5 = "audio/true-hd";
                i2 = -1;
                list = null;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i82222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i82222222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad2222222222222222 = zzadVar.zzad();
                zzadp zzw2222222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw2222222222222222;
                zzw2222222222222222.zzl(zzad2222222222222222);
                return;
            case 19:
            case 20:
                str5 = "audio/vnd.dts";
                i2 = -1;
                list = null;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i822222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i822222222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad22222222222222222 = zzadVar.zzad();
                zzadp zzw22222222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw22222222222222222;
                zzw22222222222222222.zzl(zzad22222222222222222);
                return;
            case 21:
                str5 = "audio/vnd.dts.hd";
                i2 = -1;
                list = null;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i8222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i8222222222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad222222222222222222 = zzadVar.zzad();
                zzadp zzw222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw222222222222222222;
                zzw222222222222222222.zzl(zzad222222222222222222);
                return;
            case 22:
                singletonList = Collections.singletonList(zzi(str4));
                str5 = "audio/flac";
                list = singletonList;
                i2 = -1;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i82222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i82222222222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad2222222222222222222 = zzadVar.zzad();
                zzadp zzw2222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw2222222222222222222;
                zzw2222222222222222222.zzl(zzad2222222222222222222);
                return;
            case 23:
                if (zzh(new zzek(zzi(this.zzb)))) {
                    i5 = zzet.zzl(this.zzP);
                    if (i5 == 0) {
                        zzea.zzf("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzP + ". Setting mimeType to audio/x-unknown");
                    }
                    i2 = -1;
                    list = null;
                    str2 = null;
                    if (this.zzN != null) {
                    }
                    str3 = str5;
                    int i822222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                    zzadVar = new zzad();
                    if (zzbn.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzadVar.zzJ(i);
                    zzadVar.zzX(str3);
                    zzadVar.zzP(i2);
                    zzadVar.zzO(this.zzZ);
                    zzadVar.zzZ(i822222222222222222222);
                    zzadVar.zzL(list);
                    zzadVar.zzz(str2);
                    zzadVar.zzE(this.zzk);
                    zzaf zzad22222222222222222222 = zzadVar.zzad();
                    zzadp zzw22222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                    this.zzW = zzw22222222222222222222;
                    zzw22222222222222222222.zzl(zzad22222222222222222222);
                    return;
                }
                zzea.zzf("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                str5 = "audio/x-unknown";
                i2 = -1;
                list = null;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i8222222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i8222222222222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad222222222222222222222 = zzadVar.zzad();
                zzadp zzw222222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw222222222222222222222;
                zzw222222222222222222222.zzl(zzad222222222222222222222);
                return;
            case 24:
                i5 = zzet.zzl(this.zzP);
                if (i5 == 0) {
                    zzea.zzf("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzP + ". Setting mimeType to audio/x-unknown");
                    str5 = "audio/x-unknown";
                    i2 = -1;
                    list = null;
                    str2 = null;
                    i5 = -1;
                    if (this.zzN != null) {
                    }
                    str3 = str5;
                    int i82222222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                    zzadVar = new zzad();
                    if (zzbn.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzadVar.zzJ(i);
                    zzadVar.zzX(str3);
                    zzadVar.zzP(i2);
                    zzadVar.zzO(this.zzZ);
                    zzadVar.zzZ(i82222222222222222222222);
                    zzadVar.zzL(list);
                    zzadVar.zzz(str2);
                    zzadVar.zzE(this.zzk);
                    zzaf zzad2222222222222222222222 = zzadVar.zzad();
                    zzadp zzw2222222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                    this.zzW = zzw2222222222222222222222;
                    zzw2222222222222222222222.zzl(zzad2222222222222222222222);
                    return;
                }
                i2 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i822222222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i822222222222222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad22222222222222222222222 = zzadVar.zzad();
                zzadp zzw22222222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw22222222222222222222222;
                zzw22222222222222222222222.zzl(zzad22222222222222222222222);
                return;
            case 25:
                int i11 = this.zzP;
                if (i11 == 8) {
                    i2 = -1;
                    list = null;
                    str2 = null;
                    i5 = 3;
                    if (this.zzN != null) {
                    }
                    str3 = str5;
                    int i8222222222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                    zzadVar = new zzad();
                    if (zzbn.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzadVar.zzJ(i);
                    zzadVar.zzX(str3);
                    zzadVar.zzP(i2);
                    zzadVar.zzO(this.zzZ);
                    zzadVar.zzZ(i8222222222222222222222222);
                    zzadVar.zzL(list);
                    zzadVar.zzz(str2);
                    zzadVar.zzE(this.zzk);
                    zzaf zzad222222222222222222222222 = zzadVar.zzad();
                    zzadp zzw222222222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                    this.zzW = zzw222222222222222222222222;
                    zzw222222222222222222222222.zzl(zzad222222222222222222222222);
                    return;
                }
                if (i11 == 16) {
                    i5 = 268435456;
                } else if (i11 == 24) {
                    i5 = 1342177280;
                } else {
                    if (i11 != 32) {
                        zzea.zzf("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i11 + ". Setting mimeType to audio/x-unknown");
                        str5 = "audio/x-unknown";
                        i2 = -1;
                        list = null;
                        str2 = null;
                        i5 = -1;
                        if (this.zzN != null) {
                        }
                        str3 = str5;
                        int i82222222222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                        zzadVar = new zzad();
                        if (zzbn.zzg(str3)) {
                        }
                        if (this.zza != null) {
                        }
                        zzadVar.zzJ(i);
                        zzadVar.zzX(str3);
                        zzadVar.zzP(i2);
                        zzadVar.zzO(this.zzZ);
                        zzadVar.zzZ(i82222222222222222222222222);
                        zzadVar.zzL(list);
                        zzadVar.zzz(str2);
                        zzadVar.zzE(this.zzk);
                        zzaf zzad2222222222222222222222222 = zzadVar.zzad();
                        zzadp zzw2222222222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                        this.zzW = zzw2222222222222222222222222;
                        zzw2222222222222222222222222.zzl(zzad2222222222222222222222222);
                        return;
                    }
                    i5 = 1610612736;
                }
                i2 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i822222222222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i822222222222222222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad22222222222222222222222222 = zzadVar.zzad();
                zzadp zzw22222222222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw22222222222222222222222222;
                zzw22222222222222222222222222.zzl(zzad22222222222222222222222222);
                return;
            case 26:
                int i12 = this.zzP;
                if (i12 != 32) {
                    zzea.zzf("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i12 + ". Setting mimeType to audio/x-unknown");
                    str5 = "audio/x-unknown";
                    i2 = -1;
                    list = null;
                    str2 = null;
                    i5 = -1;
                    if (this.zzN != null) {
                    }
                    str3 = str5;
                    int i8222222222222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                    zzadVar = new zzad();
                    if (zzbn.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzadVar.zzJ(i);
                    zzadVar.zzX(str3);
                    zzadVar.zzP(i2);
                    zzadVar.zzO(this.zzZ);
                    zzadVar.zzZ(i8222222222222222222222222222);
                    zzadVar.zzL(list);
                    zzadVar.zzz(str2);
                    zzadVar.zzE(this.zzk);
                    zzaf zzad222222222222222222222222222 = zzadVar.zzad();
                    zzadp zzw222222222222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                    this.zzW = zzw222222222222222222222222222;
                    zzw222222222222222222222222222.zzl(zzad222222222222222222222222222);
                    return;
                }
                i2 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i82222222222222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i82222222222222222222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad2222222222222222222222222222 = zzadVar.zzad();
                zzadp zzw2222222222222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw2222222222222222222222222222;
                zzw2222222222222222222222222222.zzl(zzad2222222222222222222222222222);
                return;
            case 27:
                str5 = "application/x-subrip";
                i2 = -1;
                list = null;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i822222222222222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i822222222222222222222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad22222222222222222222222222222 = zzadVar.zzad();
                zzadp zzw22222222222222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw22222222222222222222222222222;
                zzw22222222222222222222222222222.zzl(zzad22222222222222222222222222222);
                return;
            case 28:
                list = zzfxr.zzo(zzahj.zzb, zzi(this.zzb));
                str5 = "text/x-ssa";
                i2 = -1;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i8222222222222222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i8222222222222222222222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad222222222222222222222222222222 = zzadVar.zzad();
                zzadp zzw222222222222222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw222222222222222222222222222222;
                zzw222222222222222222222222222222.zzl(zzad222222222222222222222222222222);
                return;
            case 29:
                str5 = "text/vtt";
                i2 = -1;
                list = null;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i82222222222222222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i82222222222222222222222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad2222222222222222222222222222222 = zzadVar.zzad();
                zzadp zzw2222222222222222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw2222222222222222222222222222222;
                zzw2222222222222222222222222222222.zzl(zzad2222222222222222222222222222222);
                return;
            case 30:
                singletonList = zzfxr.zzn(zzi(str4));
                str5 = "application/vobsub";
                list = singletonList;
                i2 = -1;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i822222222222222222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i822222222222222222222222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad22222222222222222222222222222222 = zzadVar.zzad();
                zzadp zzw22222222222222222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw22222222222222222222222222222222;
                zzw22222222222222222222222222222222.zzl(zzad22222222222222222222222222222222);
                return;
            case 31:
                str5 = "application/pgs";
                i2 = -1;
                list = null;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i8222222222222222222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i8222222222222222222222222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad222222222222222222222222222222222 = zzadVar.zzad();
                zzadp zzw222222222222222222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw222222222222222222222222222222222;
                zzw222222222222222222222222222222222.zzl(zzad222222222222222222222222222222222);
                return;
            case ' ':
                byte[] bArr3 = new byte[4];
                System.arraycopy(zzi(str4), 0, bArr3, 0, 4);
                singletonList = zzfxr.zzn(bArr3);
                str5 = "application/dvbsubs";
                list = singletonList;
                i2 = -1;
                str2 = null;
                i5 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i82222222222222222222222222222222222 = (this.zzV ? 1 : 0) | (true != this.zzU ? 0 : 2);
                zzadVar = new zzad();
                if (zzbn.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzadVar.zzJ(i);
                zzadVar.zzX(str3);
                zzadVar.zzP(i2);
                zzadVar.zzO(this.zzZ);
                zzadVar.zzZ(i82222222222222222222222222222222222);
                zzadVar.zzL(list);
                zzadVar.zzz(str2);
                zzadVar.zzE(this.zzk);
                zzaf zzad2222222222222222222222222222222222 = zzadVar.zzad();
                zzadp zzw2222222222222222222222222222222222 = zzacnVar.zzw(this.zzc, i4);
                this.zzW = zzw2222222222222222222222222222222222;
                zzw2222222222222222222222222222222222.zzl(zzad2222222222222222222222222222222222);
                return;
            default:
                throw zzbo.zza("Unrecognized codec identifier.", null);
        }
    }
}
