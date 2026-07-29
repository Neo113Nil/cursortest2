package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzaum {
    public boolean zzL;
    public zzaue zzN;
    public int zzO;
    public String zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public boolean zze;
    public byte[] zzf;
    public zzaud zzg;
    public byte[] zzh;
    public zzatr zzi;
    public int zzj = -1;
    public int zzk = -1;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = 0;
    public byte[] zzo = null;
    public int zzp = -1;
    public boolean zzq = false;
    public int zzr = -1;
    public int zzs = -1;
    public int zzt = -1;
    public int zzu = 1000;
    public int zzv = 200;
    public float zzw = -1.0f;
    public float zzx = -1.0f;
    public float zzy = -1.0f;
    public float zzz = -1.0f;
    public float zzA = -1.0f;
    public float zzB = -1.0f;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public int zzG = 1;
    public int zzH = -1;
    public int zzI = 8000;
    public long zzJ = 0;
    public long zzK = 0;
    public boolean zzM = true;
    private String zzP = "eng";

    private zzaum() {
    }

    /* synthetic */ zzaum(zzaul zzaulVar) {
    }

    private static List zzc(zzazg zzazgVar) throws zzarv {
        try {
            zzazgVar.zzw(16);
            if (zzazgVar.zzk() != 826496599) {
                return null;
            }
            int zzc = zzazgVar.zzc() + 20;
            byte[] bArr = zzazgVar.zza;
            while (true) {
                int length = bArr.length;
                if (zzc >= length - 4) {
                    throw new zzarv("Failed to find FourCC VC1 initialization data");
                }
                if (bArr[zzc] == 0 && bArr[zzc + 1] == 0 && bArr[zzc + 2] == 1 && bArr[zzc + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, zzc, length));
                }
                zzc++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzarv("Error parsing FourCC VC1 codec private");
        }
    }

    private static List zzd(byte[] bArr) throws zzarv {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw new zzarv("Error parsing vorbis codec private");
            }
            int i3 = 1;
            int i4 = 0;
            while (true) {
                i = bArr[i3];
                if (i != -1) {
                    break;
                }
                i4 += 255;
                i3++;
            }
            int i5 = i3 + 1;
            int i6 = i4 + i;
            int i7 = 0;
            while (true) {
                i2 = bArr[i5];
                if (i2 != -1) {
                    break;
                }
                i7 += 255;
                i5++;
            }
            int i8 = i5 + 1;
            int i9 = i7 + i2;
            if (bArr[i8] != 1) {
                throw new zzarv("Error parsing vorbis codec private");
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i8, bArr2, 0, i6);
            int i10 = i8 + i6;
            if (bArr[i10] != 3) {
                throw new zzarv("Error parsing vorbis codec private");
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw new zzarv("Error parsing vorbis codec private");
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzarv("Error parsing vorbis codec private");
        }
    }

    private static boolean zze(zzazg zzazgVar) throws zzarv {
        try {
            int zzf = zzazgVar.zzf();
            if (zzf == 1) {
                return true;
            }
            if (zzf == 65534) {
                zzazgVar.zzv(24);
                if (zzazgVar.zzl() == zzaun.zzd.getMostSignificantBits()) {
                    if (zzazgVar.zzl() == zzaun.zzd.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzarv("Error parsing MS/ACM codec private");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(zzatw zzatwVar, int i) throws zzarv {
        char c;
        List singletonList;
        List list;
        int i2;
        int i3;
        int zzh;
        zzars zzi;
        int i4;
        zzazq zzazqVar;
        byte[] bArr;
        int i5;
        String str = this.zza;
        int i6 = 2;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c = 18;
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
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c = 21;
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
        String str2 = "audio/raw";
        switch (c) {
            case 0:
                str2 = "video/x-vnd.on2.vp8";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                int i7 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                    zzi = zzars.zzh(Integer.toString(i), str2, null, -1, i3, this.zzG, this.zzI, i2, -1, -1, singletonList, this.zzi, i7, this.zzP, null);
                    i6 = 1;
                } else if (zzazd.zzb(str2)) {
                    if (this.zzn == 0) {
                        int i8 = this.zzl;
                        i4 = -1;
                        if (i8 == -1) {
                            i8 = this.zzj;
                        }
                        this.zzl = i8;
                        int i9 = this.zzm;
                        if (i9 == -1) {
                            i9 = this.zzk;
                        }
                        this.zzm = i9;
                    } else {
                        i4 = -1;
                    }
                    float f = (this.zzl == i4 || (i5 = this.zzm) == i4) ? -1.0f : (this.zzk * r2) / (this.zzj * i5);
                    if (this.zzq) {
                        if (this.zzw == -1.0f || this.zzx == -1.0f || this.zzy == -1.0f || this.zzz == -1.0f || this.zzA == -1.0f || this.zzB == -1.0f || this.zzC == -1.0f || this.zzD == -1.0f || this.zzE == -1.0f || this.zzF == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer wrap = ByteBuffer.wrap(bArr);
                            wrap.put((byte) 0);
                            wrap.putShort((short) ((this.zzw * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.zzx * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.zzy * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.zzz * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.zzA * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.zzB * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                            wrap.putShort((short) (this.zzE + 0.5f));
                            wrap.putShort((short) (this.zzF + 0.5f));
                            wrap.putShort((short) this.zzu);
                            wrap.putShort((short) this.zzv);
                        }
                        zzazqVar = new zzazq(this.zzr, this.zzt, this.zzs, bArr);
                    } else {
                        zzazqVar = null;
                    }
                    zzi = zzars.zzl(Integer.toString(i), str2, null, -1, i3, this.zzj, this.zzk, -1.0f, singletonList, -1, f, this.zzo, this.zzp, zzazqVar, this.zzi);
                } else {
                    if ("application/x-subrip".equals(str2)) {
                        zzi = zzars.zzk(Integer.toString(i), str2, null, -1, i7, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
                    } else {
                        if (!"application/vobsub".equals(str2) && !"application/pgs".equals(str2) && !"application/dvbsubs".equals(str2)) {
                            throw new zzarv("Unexpected MIME type.");
                        }
                        zzi = zzars.zzi(Integer.toString(i), str2, null, -1, singletonList, this.zzP, this.zzi);
                    }
                    i6 = 3;
                }
                zzaue zzbi = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi;
                zzbi.zza(zzi);
                return;
            case 1:
                str2 = "video/x-vnd.on2.vp9";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                int i72 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi2 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi2;
                zzbi2.zza(zzi);
                return;
            case 2:
                str2 = "video/mpeg2";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                int i722 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi22 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi22;
                zzbi22.zza(zzi);
                return;
            case 3:
            case 4:
            case 5:
                byte[] bArr2 = this.zzh;
                singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str2 = "video/mp4v-es";
                i2 = -1;
                i3 = -1;
                int i7222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi222;
                zzbi222.zza(zzi);
                return;
            case 6:
                zzazo zza = zzazo.zza(new zzazg(this.zzh));
                list = zza.zza;
                this.zzO = zza.zzb;
                str2 = "video/avc";
                singletonList = list;
                i2 = -1;
                i3 = -1;
                int i72222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi2222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi2222;
                zzbi2222.zza(zzi);
                return;
            case 7:
                zzazu zza2 = zzazu.zza(new zzazg(this.zzh));
                list = zza2.zza;
                this.zzO = zza2.zzb;
                str2 = "video/hevc";
                singletonList = list;
                i2 = -1;
                i3 = -1;
                int i722222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi22222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi22222;
                zzbi22222.zza(zzi);
                return;
            case '\b':
                singletonList = zzc(new zzazg(this.zzh));
                if (singletonList != null) {
                    str2 = "video/wvc1";
                } else {
                    Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                    str2 = "video/x-unknown";
                }
                i2 = -1;
                i3 = -1;
                int i7222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi222222;
                zzbi222222.zza(zzi);
                return;
            case '\t':
                str2 = "video/x-unknown";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                int i72222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi2222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi2222222;
                zzbi2222222.zza(zzi);
                return;
            case '\n':
                singletonList = zzd(this.zzh);
                str2 = "audio/vorbis";
                i2 = -1;
                i3 = 8192;
                int i722222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi22222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi22222222;
                zzbi22222222.zza(zzi);
                return;
            case 11:
                singletonList = new ArrayList(3);
                singletonList.add(this.zzh);
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.zzJ).array());
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.zzK).array());
                str2 = "audio/opus";
                i2 = -1;
                i3 = 5760;
                int i7222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi222222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi222222222;
                zzbi222222222.zza(zzi);
                return;
            case '\f':
                singletonList = Collections.singletonList(this.zzh);
                str2 = "audio/mp4a-latm";
                i2 = -1;
                i3 = -1;
                int i72222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi2222222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi2222222222;
                zzbi2222222222.zza(zzi);
                return;
            case '\r':
                str2 = "audio/mpeg-L2";
                singletonList = null;
                i2 = -1;
                i3 = 4096;
                int i722222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi22222222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi22222222222;
                zzbi22222222222.zza(zzi);
                return;
            case 14:
                str2 = "audio/mpeg";
                singletonList = null;
                i2 = -1;
                i3 = 4096;
                int i7222222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi222222222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi222222222222;
                zzbi222222222222.zza(zzi);
                return;
            case 15:
                str2 = "audio/ac3";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                int i72222222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi2222222222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi2222222222222;
                zzbi2222222222222.zza(zzi);
                return;
            case 16:
                str2 = "audio/eac3";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                int i722222222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi22222222222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi22222222222222;
                zzbi22222222222222.zza(zzi);
                return;
            case 17:
                str2 = "audio/true-hd";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                int i7222222222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi222222222222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi222222222222222;
                zzbi222222222222222.zza(zzi);
                return;
            case 18:
            case 19:
                str2 = "audio/vnd.dts";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                int i72222222222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi2222222222222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi2222222222222222;
                zzbi2222222222222222.zza(zzi);
                return;
            case 20:
                str2 = "audio/vnd.dts.hd";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                int i722222222222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi22222222222222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi22222222222222222;
                zzbi22222222222222222.zza(zzi);
                return;
            case 21:
                singletonList = Collections.singletonList(this.zzh);
                str2 = "audio/x-flac";
                i2 = -1;
                i3 = -1;
                int i7222222222222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi222222222222222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi222222222222222222;
                zzbi222222222222222222.zza(zzi);
                return;
            case 22:
                if (zze(new zzazg(this.zzh))) {
                    zzh = zzazn.zzh(this.zzH);
                    if (zzh == 0) {
                        Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzH + ". Setting mimeType to audio/x-unknown");
                    }
                    i2 = zzh;
                    singletonList = null;
                    i3 = -1;
                    int i72222222222222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                    if (zzazd.zza(str2)) {
                    }
                    zzaue zzbi2222222222222222222 = zzatwVar.zzbi(this.zzb, i6);
                    this.zzN = zzbi2222222222222222222;
                    zzbi2222222222222222222.zza(zzi);
                    return;
                }
                Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                str2 = "audio/x-unknown";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                int i722222222222222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi22222222222222222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi22222222222222222222;
                zzbi22222222222222222222.zza(zzi);
                return;
            case 23:
                zzh = zzazn.zzh(this.zzH);
                if (zzh == 0) {
                    Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzH + ". Setting mimeType to audio/x-unknown");
                    str2 = "audio/x-unknown";
                    singletonList = null;
                    i2 = -1;
                    i3 = -1;
                    int i7222222222222222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                    if (zzazd.zza(str2)) {
                    }
                    zzaue zzbi222222222222222222222 = zzatwVar.zzbi(this.zzb, i6);
                    this.zzN = zzbi222222222222222222222;
                    zzbi222222222222222222222.zza(zzi);
                    return;
                }
                i2 = zzh;
                singletonList = null;
                i3 = -1;
                int i72222222222222222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi2222222222222222222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi2222222222222222222222;
                zzbi2222222222222222222222.zza(zzi);
                return;
            case 24:
                str2 = "application/x-subrip";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                int i722222222222222222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi22222222222222222222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi22222222222222222222222;
                zzbi22222222222222222222222.zza(zzi);
                return;
            case 25:
                singletonList = Collections.singletonList(this.zzh);
                str2 = "application/vobsub";
                i2 = -1;
                i3 = -1;
                int i7222222222222222222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi222222222222222222222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi222222222222222222222222;
                zzbi222222222222222222222222.zza(zzi);
                return;
            case 26:
                str2 = "application/pgs";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                int i72222222222222222222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi2222222222222222222222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi2222222222222222222222222;
                zzbi2222222222222222222222222.zza(zzi);
                return;
            case 27:
                byte[] bArr3 = this.zzh;
                singletonList = Collections.singletonList(new byte[]{bArr3[0], bArr3[1], bArr3[2], bArr3[3]});
                str2 = "application/dvbsubs";
                i2 = -1;
                i3 = -1;
                int i722222222222222222222222222 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
                if (zzazd.zza(str2)) {
                }
                zzaue zzbi22222222222222222222222222 = zzatwVar.zzbi(this.zzb, i6);
                this.zzN = zzbi22222222222222222222222222;
                zzbi22222222222222222222222222.zza(zzi);
                return;
            default:
                throw new zzarv("Unrecognized codec identifier.");
        }
    }
}
