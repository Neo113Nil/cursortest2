package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzadg {
    public byte[] zzM;
    public zzaaa zzS;
    public boolean zzT;
    public zzzz zzV;
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
    public zzzy zzi;
    public byte[] zzj;
    public zzv zzk;
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

    protected zzadg() {
    }

    private static Pair zzf(zzdy zzdyVar) throws zzbp {
        try {
            zzdyVar.zzG(16);
            long zzq = zzdyVar.zzq();
            if (zzq == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzq == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzq != 826496599) {
                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int zzc = zzdyVar.zzc() + 20;
            byte[] zzH = zzdyVar.zzH();
            while (true) {
                int length = zzH.length;
                if (zzc >= length - 4) {
                    throw zzbp.zza("Failed to find FourCC VC1 initialization data", null);
                }
                if (zzH[zzc] == 0 && zzH[zzc + 1] == 0 && zzH[zzc + 2] == 1 && zzH[zzc + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzH, zzc, length)));
                }
                zzc++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbp.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzbp {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzbp.zza("Error parsing vorbis codec private", null);
            }
            int i3 = 1;
            int i4 = 0;
            while (true) {
                i = bArr[i3] & 255;
                if (i != 255) {
                    break;
                }
                i4 += 255;
                i3++;
            }
            int i5 = i3 + 1;
            int i6 = i4 + i;
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
                throw zzbp.zza("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i8, bArr2, 0, i6);
            int i10 = i8 + i6;
            if (bArr[i10] != 3) {
                throw zzbp.zza("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzbp.zza("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbp.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzdy zzdyVar) throws zzbp {
        try {
            int zzi = zzdyVar.zzi();
            if (zzi == 1) {
                return true;
            }
            if (zzi == 65534) {
                zzdyVar.zzF(24);
                if (zzdyVar.zzr() == zzadh.zzf.getMostSignificantBits()) {
                    if (zzdyVar.zzr() == zzadh.zzf.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbp.zza("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzbp {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbp.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03e1  */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(zzyv zzyvVar, int i) throws zzbp {
        char c;
        List singletonList;
        List list;
        String str;
        int i2;
        String str2;
        byte[] bArr;
        String str3;
        zzab zzabVar;
        int i3;
        int i4;
        zzyp zza;
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
        String str5 = "audio/raw";
        zzo zzoVar = null;
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
                if (bArr != null && (zza = zzyp.zza(new zzdy(bArr))) != null) {
                    str2 = zza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                int i8 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                    zzabVar.zzw(this.zzN);
                    zzabVar.zzT(this.zzP);
                    zzabVar.zzN(i6);
                } else if (zzbo.zzh(str3)) {
                    if (this.zzp == 0) {
                        int i9 = this.zzn;
                        i3 = -1;
                        if (i9 == -1) {
                            i9 = this.zzl;
                        }
                        this.zzn = i9;
                        int i10 = this.zzo;
                        if (i10 == -1) {
                            i10 = this.zzm;
                        }
                        this.zzo = i10;
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
                        zzoVar = new zzo(this.zzx, this.zzz, this.zzy, bArr2);
                    }
                    if (this.zza != null && zzadh.zzg.containsKey(this.zza)) {
                        i3 = ((Integer) zzadh.zzg.get(this.zza)).intValue();
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
                        zzabVar.zzX(this.zzl);
                        zzabVar.zzF(this.zzm);
                        zzabVar.zzP(f);
                        zzabVar.zzR(i7);
                        zzabVar.zzQ(this.zzu);
                        zzabVar.zzV(this.zzv);
                        zzabVar.zzy(zzoVar);
                        i5 = 2;
                    }
                    i7 = i3;
                    zzabVar.zzX(this.zzl);
                    zzabVar.zzF(this.zzm);
                    zzabVar.zzP(f);
                    zzabVar.zzR(i7);
                    zzabVar.zzQ(this.zzu);
                    zzabVar.zzV(this.zzv);
                    zzabVar.zzy(zzoVar);
                    i5 = 2;
                } else {
                    if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw zzbp.zza("Unexpected MIME type.", null);
                    }
                    i5 = 3;
                }
                if (this.zza != null && !zzadh.zzg.containsKey(this.zza)) {
                    zzabVar.zzJ(this.zza);
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i8);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY = zzabVar.zzY();
                zzzz zzv = zzyvVar.zzv(this.zzc, i5);
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
                int i82 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                    zzabVar.zzJ(this.zza);
                    break;
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i82);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY2 = zzabVar.zzY();
                zzzz zzv2 = zzyvVar.zzv(this.zzc, i5);
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
                int i822 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i822);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY22 = zzabVar.zzY();
                zzzz zzv22 = zzyvVar.zzv(this.zzc, i5);
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
                int i8222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i8222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY222 = zzabVar.zzY();
                zzzz zzv222 = zzyvVar.zzv(this.zzc, i5);
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
                int i82222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i82222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY2222 = zzabVar.zzY();
                zzzz zzv2222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv2222;
                zzv2222.zzk(zzY2222);
                return;
            case 7:
                zzyb zza2 = zzyb.zza(new zzdy(zzi(str4)));
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
                int i822222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i822222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY22222 = zzabVar.zzY();
                zzzz zzv22222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv22222;
                zzv22222.zzk(zzY22222);
                return;
            case '\b':
                zzzi zza3 = zzzi.zza(new zzdy(zzi(str4)));
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
                int i8222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i8222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY222222 = zzabVar.zzY();
                zzzz zzv222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv222222;
                zzv222222.zzk(zzY222222);
                return;
            case '\t':
                Pair zzf = zzf(new zzdy(zzi(str4)));
                str5 = (String) zzf.first;
                singletonList = (List) zzf.second;
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i82222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i82222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY2222222 = zzabVar.zzY();
                zzzz zzv2222222 = zzyvVar.zzv(this.zzc, i5);
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
                int i822222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i822222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY22222222 = zzabVar.zzY();
                zzzz zzv22222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv22222222;
                zzv22222222.zzk(zzY22222222);
                return;
            case 11:
                singletonList = zzg(zzi(str4));
                str5 = "audio/vorbis";
                str2 = null;
                i2 = 8192;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i8222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i8222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY222222222 = zzabVar.zzY();
                zzzz zzv222222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv222222222;
                zzv222222222.zzk(zzY222222222);
                return;
            case '\f':
                singletonList = new ArrayList(3);
                singletonList.add(zzi(this.zzb));
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzQ).array());
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzR).array());
                str5 = "audio/opus";
                str2 = null;
                i2 = 5760;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i82222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i82222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY2222222222 = zzabVar.zzY();
                zzzz zzv2222222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv2222222222;
                zzv2222222222.zzk(zzY2222222222);
                return;
            case '\r':
                singletonList = Collections.singletonList(zzi(str4));
                zzxt zza4 = zzxu.zza(this.zzj);
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
                int i822222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i822222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY22222222222 = zzabVar.zzY();
                zzzz zzv22222222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv22222222222;
                zzv22222222222.zzk(zzY22222222222);
                return;
            case 14:
                str5 = "audio/mpeg-L2";
                singletonList = null;
                str2 = null;
                i2 = 4096;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i8222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i8222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY222222222222 = zzabVar.zzY();
                zzzz zzv222222222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv222222222222;
                zzv222222222222.zzk(zzY222222222222);
                return;
            case 15:
                str5 = "audio/mpeg";
                singletonList = null;
                str2 = null;
                i2 = 4096;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i82222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i82222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY2222222222222 = zzabVar.zzY();
                zzzz zzv2222222222222 = zzyvVar.zzv(this.zzc, i5);
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
                int i822222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i822222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY22222222222222 = zzabVar.zzY();
                zzzz zzv22222222222222 = zzyvVar.zzv(this.zzc, i5);
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
                int i8222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i8222222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY222222222222222 = zzabVar.zzY();
                zzzz zzv222222222222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv222222222222222;
                zzv222222222222222.zzk(zzY222222222222222);
                return;
            case 18:
                this.zzS = new zzaaa();
                str5 = "audio/true-hd";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i82222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i82222222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY2222222222222222 = zzabVar.zzY();
                zzzz zzv2222222222222222 = zzyvVar.zzv(this.zzc, i5);
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
                int i822222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i822222222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY22222222222222222 = zzabVar.zzY();
                zzzz zzv22222222222222222 = zzyvVar.zzv(this.zzc, i5);
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
                int i8222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i8222222222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY222222222222222222 = zzabVar.zzY();
                zzzz zzv222222222222222222 = zzyvVar.zzv(this.zzc, i5);
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
                int i82222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i82222222222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY2222222222222222222 = zzabVar.zzY();
                zzzz zzv2222222222222222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv2222222222222222222;
                zzv2222222222222222222.zzk(zzY2222222222222222222);
                return;
            case 23:
                if (zzh(new zzdy(zzi(str4)))) {
                    i6 = zzeg.zzn(this.zzO);
                    if (i6 == 0) {
                        Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                    }
                    singletonList = null;
                    str2 = null;
                    i2 = -1;
                    bArr = this.zzM;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i822222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                    zzabVar = new zzab();
                    if (zzbo.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzabVar.zzG(i);
                    zzabVar.zzS(str3);
                    zzabVar.zzL(i2);
                    zzabVar.zzK(this.zzY);
                    zzabVar.zzU(i822222222222222222222);
                    zzabVar.zzI(singletonList);
                    zzabVar.zzx(str2);
                    zzabVar.zzB(this.zzk);
                    zzad zzY22222222222222222222 = zzabVar.zzY();
                    zzzz zzv22222222222222222222 = zzyvVar.zzv(this.zzc, i5);
                    this.zzV = zzv22222222222222222222;
                    zzv22222222222222222222.zzk(zzY22222222222222222222);
                    return;
                }
                Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                singletonList = null;
                str2 = null;
                str5 = "audio/x-unknown";
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i8222222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i8222222222222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY222222222222222222222 = zzabVar.zzY();
                zzzz zzv222222222222222222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv222222222222222222222;
                zzv222222222222222222222.zzk(zzY222222222222222222222);
                return;
            case 24:
                i6 = zzeg.zzn(this.zzO);
                if (i6 == 0) {
                    Log.w("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                    singletonList = null;
                    str2 = null;
                    str5 = "audio/x-unknown";
                    i2 = -1;
                    i6 = -1;
                    bArr = this.zzM;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i82222222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                    zzabVar = new zzab();
                    if (zzbo.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzabVar.zzG(i);
                    zzabVar.zzS(str3);
                    zzabVar.zzL(i2);
                    zzabVar.zzK(this.zzY);
                    zzabVar.zzU(i82222222222222222222222);
                    zzabVar.zzI(singletonList);
                    zzabVar.zzx(str2);
                    zzabVar.zzB(this.zzk);
                    zzad zzY2222222222222222222222 = zzabVar.zzY();
                    zzzz zzv2222222222222222222222 = zzyvVar.zzv(this.zzc, i5);
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
                int i822222222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i822222222222222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY22222222222222222222222 = zzabVar.zzY();
                zzzz zzv22222222222222222222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv22222222222222222222222;
                zzv22222222222222222222222.zzk(zzY22222222222222222222222);
                return;
            case 25:
                int i11 = this.zzO;
                if (i11 == 8) {
                    singletonList = null;
                    str2 = null;
                    i2 = -1;
                    i6 = 3;
                    bArr = this.zzM;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i8222222222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                    zzabVar = new zzab();
                    if (zzbo.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzabVar.zzG(i);
                    zzabVar.zzS(str3);
                    zzabVar.zzL(i2);
                    zzabVar.zzK(this.zzY);
                    zzabVar.zzU(i8222222222222222222222222);
                    zzabVar.zzI(singletonList);
                    zzabVar.zzx(str2);
                    zzabVar.zzB(this.zzk);
                    zzad zzY222222222222222222222222 = zzabVar.zzY();
                    zzzz zzv222222222222222222222222 = zzyvVar.zzv(this.zzc, i5);
                    this.zzV = zzv222222222222222222222222;
                    zzv222222222222222222222222.zzk(zzY222222222222222222222222);
                    return;
                }
                if (i11 == 16) {
                    i6 = 268435456;
                    singletonList = null;
                    str2 = null;
                    i2 = -1;
                    bArr = this.zzM;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i82222222222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                    zzabVar = new zzab();
                    if (zzbo.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzabVar.zzG(i);
                    zzabVar.zzS(str3);
                    zzabVar.zzL(i2);
                    zzabVar.zzK(this.zzY);
                    zzabVar.zzU(i82222222222222222222222222);
                    zzabVar.zzI(singletonList);
                    zzabVar.zzx(str2);
                    zzabVar.zzB(this.zzk);
                    zzad zzY2222222222222222222222222 = zzabVar.zzY();
                    zzzz zzv2222222222222222222222222 = zzyvVar.zzv(this.zzc, i5);
                    this.zzV = zzv2222222222222222222222222;
                    zzv2222222222222222222222222.zzk(zzY2222222222222222222222222);
                    return;
                }
                Log.w("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i11 + ". Setting mimeType to audio/x-unknown");
                singletonList = null;
                str2 = null;
                str5 = "audio/x-unknown";
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i822222222222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i822222222222222222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY22222222222222222222222222 = zzabVar.zzY();
                zzzz zzv22222222222222222222222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv22222222222222222222222222;
                zzv22222222222222222222222222.zzk(zzY22222222222222222222222222);
                return;
            case 26:
                int i12 = this.zzO;
                if (i12 != 32) {
                    Log.w("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i12 + ". Setting mimeType to audio/x-unknown");
                    singletonList = null;
                    str2 = null;
                    str5 = "audio/x-unknown";
                    i2 = -1;
                    i6 = -1;
                    bArr = this.zzM;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i8222222222222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                    zzabVar = new zzab();
                    if (zzbo.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzabVar.zzG(i);
                    zzabVar.zzS(str3);
                    zzabVar.zzL(i2);
                    zzabVar.zzK(this.zzY);
                    zzabVar.zzU(i8222222222222222222222222222);
                    zzabVar.zzI(singletonList);
                    zzabVar.zzx(str2);
                    zzabVar.zzB(this.zzk);
                    zzad zzY222222222222222222222222222 = zzabVar.zzY();
                    zzzz zzv222222222222222222222222222 = zzyvVar.zzv(this.zzc, i5);
                    this.zzV = zzv222222222222222222222222222;
                    zzv222222222222222222222222222.zzk(zzY222222222222222222222222222);
                    return;
                }
                singletonList = null;
                str2 = null;
                i2 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i82222222222222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i82222222222222222222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY2222222222222222222222222222 = zzabVar.zzY();
                zzzz zzv2222222222222222222222222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv2222222222222222222222222222;
                zzv2222222222222222222222222222.zzk(zzY2222222222222222222222222222);
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
                int i822222222222222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i822222222222222222222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY22222222222222222222222222222 = zzabVar.zzY();
                zzzz zzv22222222222222222222222222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv22222222222222222222222222222;
                zzv22222222222222222222222222222.zzk(zzY22222222222222222222222222222);
                return;
            case 28:
                singletonList = zzfrh.zzq(zzadh.zzc, zzi(this.zzb));
                str2 = null;
                str5 = "text/x-ssa";
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i8222222222222222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i8222222222222222222222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY222222222222222222222222222222 = zzabVar.zzY();
                zzzz zzv222222222222222222222222222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv222222222222222222222222222222;
                zzv222222222222222222222222222222.zzk(zzY222222222222222222222222222222);
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
                int i82222222222222222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i82222222222222222222222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY2222222222222222222222222222222 = zzabVar.zzY();
                zzzz zzv2222222222222222222222222222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv2222222222222222222222222222222;
                zzv2222222222222222222222222222222.zzk(zzY2222222222222222222222222222222);
                return;
            case 30:
                singletonList = zzfrh.zzp(zzi(str4));
                str5 = "application/vobsub";
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i822222222222222222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i822222222222222222222222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY22222222222222222222222222222222 = zzabVar.zzY();
                zzzz zzv22222222222222222222222222222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv22222222222222222222222222222222;
                zzv22222222222222222222222222222222.zzk(zzY22222222222222222222222222222222);
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
                int i8222222222222222222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i8222222222222222222222222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY222222222222222222222222222222222 = zzabVar.zzY();
                zzzz zzv222222222222222222222222222222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv222222222222222222222222222222222;
                zzv222222222222222222222222222222222.zzk(zzY222222222222222222222222222222222);
                return;
            case ' ':
                byte[] bArr4 = new byte[4];
                System.arraycopy(zzi(str4), 0, bArr4, 0, 4);
                singletonList = zzfrh.zzp(bArr4);
                str5 = "application/dvbsubs";
                str2 = null;
                i2 = -1;
                i6 = -1;
                bArr = this.zzM;
                if (bArr != null) {
                }
                str3 = str5;
                int i82222222222222222222222222222222222 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
                zzabVar = new zzab();
                if (zzbo.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzabVar.zzG(i);
                zzabVar.zzS(str3);
                zzabVar.zzL(i2);
                zzabVar.zzK(this.zzY);
                zzabVar.zzU(i82222222222222222222222222222222222);
                zzabVar.zzI(singletonList);
                zzabVar.zzx(str2);
                zzabVar.zzB(this.zzk);
                zzad zzY2222222222222222222222222222222222 = zzabVar.zzY();
                zzzz zzv2222222222222222222222222222222222 = zzyvVar.zzv(this.zzc, i5);
                this.zzV = zzv2222222222222222222222222222222222;
                zzv2222222222222222222222222222222222.zzk(zzY2222222222222222222222222222222222);
                return;
            default:
                throw zzbp.zza("Unrecognized codec identifier.", null);
        }
    }
}
