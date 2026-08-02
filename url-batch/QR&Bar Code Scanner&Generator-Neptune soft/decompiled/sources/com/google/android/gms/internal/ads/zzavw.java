package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
class zzavw {
    public static final int zzaA;
    public static final int zzaB;
    public static final int zzaC;
    public static final int zzaD;
    public static final int zzaE;
    public static final int zzaF;
    public static final int zzaG;
    public static final int zzaH;
    public static final int zzaI;
    public static final int zzaJ;
    public static final int zzaK;
    public static final int zzaL;
    public static final int zzaM;
    public static final int zzaN;
    public static final int zzaO;
    public static final int zzaP;
    public static final int zzaQ;
    public static final int zzan;
    public static final int zzao;
    public static final int zzap;
    public static final int zzaq;
    public static final int zzar;
    public static final int zzas;
    public static final int zzat;
    public static final int zzau;
    public static final int zzav;
    public static final int zzaw;
    public static final int zzax;
    public static final int zzay;
    public static final int zzaz;
    public final int zzaR;
    public static final int zzd = zzbar.zzg("ftyp");
    public static final int zze = zzbar.zzg("avc1");
    public static final int zzf = zzbar.zzg("avc3");
    public static final int zzg = zzbar.zzg("hvc1");
    public static final int zzh = zzbar.zzg("hev1");
    public static final int zzi = zzbar.zzg("s263");
    public static final int zzj = zzbar.zzg("d263");
    public static final int zzk = zzbar.zzg("mdat");
    public static final int zzl = zzbar.zzg("mp4a");
    public static final int zzm = zzbar.zzg(".mp3");
    public static final int zzn = zzbar.zzg("wave");
    public static final int zzo = zzbar.zzg("lpcm");
    public static final int zzp = zzbar.zzg("sowt");
    public static final int zzq = zzbar.zzg("ac-3");
    public static final int zzr = zzbar.zzg("dac3");
    public static final int zzs = zzbar.zzg("ec-3");
    public static final int zzt = zzbar.zzg("dec3");
    public static final int zzu = zzbar.zzg("dtsc");
    public static final int zzv = zzbar.zzg("dtsh");
    public static final int zzw = zzbar.zzg("dtsl");
    public static final int zzx = zzbar.zzg("dtse");
    public static final int zzy = zzbar.zzg("ddts");
    public static final int zzz = zzbar.zzg("tfdt");
    public static final int zzA = zzbar.zzg("tfhd");
    public static final int zzB = zzbar.zzg("trex");
    public static final int zzC = zzbar.zzg("trun");
    public static final int zzD = zzbar.zzg("sidx");
    public static final int zzE = zzbar.zzg("moov");
    public static final int zzF = zzbar.zzg("mvhd");
    public static final int zzG = zzbar.zzg("trak");
    public static final int zzH = zzbar.zzg("mdia");
    public static final int zzI = zzbar.zzg("minf");
    public static final int zzJ = zzbar.zzg("stbl");
    public static final int zzK = zzbar.zzg("avcC");
    public static final int zzL = zzbar.zzg("hvcC");
    public static final int zzM = zzbar.zzg("esds");
    public static final int zzN = zzbar.zzg("moof");
    public static final int zzO = zzbar.zzg("traf");
    public static final int zzP = zzbar.zzg("mvex");
    public static final int zzQ = zzbar.zzg("mehd");
    public static final int zzR = zzbar.zzg("tkhd");
    public static final int zzS = zzbar.zzg("edts");
    public static final int zzT = zzbar.zzg("elst");
    public static final int zzU = zzbar.zzg("mdhd");
    public static final int zzV = zzbar.zzg("hdlr");
    public static final int zzW = zzbar.zzg("stsd");
    public static final int zzX = zzbar.zzg("pssh");
    public static final int zzY = zzbar.zzg("sinf");
    public static final int zzZ = zzbar.zzg("schm");
    public static final int zzaa = zzbar.zzg("schi");
    public static final int zzab = zzbar.zzg("tenc");
    public static final int zzac = zzbar.zzg("encv");
    public static final int zzad = zzbar.zzg("enca");
    public static final int zzae = zzbar.zzg("frma");
    public static final int zzaf = zzbar.zzg("saiz");
    public static final int zzag = zzbar.zzg("saio");
    public static final int zzah = zzbar.zzg("sbgp");
    public static final int zzai = zzbar.zzg("sgpd");
    public static final int zzaj = zzbar.zzg("uuid");
    public static final int zzak = zzbar.zzg("senc");
    public static final int zzal = zzbar.zzg("pasp");
    public static final int zzam = zzbar.zzg("TTML");

    static {
        zzbar.zzg("vmhd");
        zzan = zzbar.zzg("mp4v");
        zzao = zzbar.zzg("stts");
        zzap = zzbar.zzg("stss");
        zzaq = zzbar.zzg("ctts");
        zzar = zzbar.zzg("stsc");
        zzas = zzbar.zzg("stsz");
        zzat = zzbar.zzg("stz2");
        zzau = zzbar.zzg("stco");
        zzav = zzbar.zzg("co64");
        zzaw = zzbar.zzg("tx3g");
        zzax = zzbar.zzg("wvtt");
        zzay = zzbar.zzg("stpp");
        zzaz = zzbar.zzg("c608");
        zzaA = zzbar.zzg("samr");
        zzaB = zzbar.zzg("sawb");
        zzaC = zzbar.zzg("udta");
        zzaD = zzbar.zzg("meta");
        zzaE = zzbar.zzg("ilst");
        zzaF = zzbar.zzg("mean");
        zzaG = zzbar.zzg(AppMeasurementSdk.ConditionalUserProperty.NAME);
        zzaH = zzbar.zzg("data");
        zzaI = zzbar.zzg("emsg");
        zzaJ = zzbar.zzg("st3d");
        zzaK = zzbar.zzg("sv3d");
        zzaL = zzbar.zzg("proj");
        zzaM = zzbar.zzg("vp08");
        zzaN = zzbar.zzg("vp09");
        zzaO = zzbar.zzg("vpcC");
        zzaP = zzbar.zzg("camm");
        zzaQ = zzbar.zzg("alac");
    }

    public zzavw(int i) {
        this.zzaR = i;
    }

    public static int zze(int i) {
        return i & ViewCompat.MEASURED_SIZE_MASK;
    }

    public static int zzf(int i) {
        return (i >> 24) & 255;
    }

    public static String zzg(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return zzg(this.zzaR);
    }
}
