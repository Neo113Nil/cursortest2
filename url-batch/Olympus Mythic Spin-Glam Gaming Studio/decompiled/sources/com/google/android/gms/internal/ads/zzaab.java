package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzaab extends zzaau implements Comparable {
    private final int zze;
    private final boolean zzf;

    @Nullable
    private final String zzg;
    private final zzaaq zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8 A[LOOP:1: B:28:0x00f5->B:30:0x00f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0138 A[EDGE_INSN: B:80:0x0138->B:48:0x0138 BREAK  A[LOOP:3: B:40:0x011a->B:78:0x0136], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaab(int i, zzbg zzbgVar, int i2, zzaaq zzaaqVar, int i3, boolean z, zzgul zzgulVar, int i4) {
        super(i, zzbgVar, i2);
        int i5;
        int i6;
        char c;
        boolean z2;
        String[] split;
        int i7;
        int i8;
        int i9;
        int i10;
        zzaaq zzaaqVar2;
        boolean z3;
        this.zzh = zzaaqVar;
        int i11 = 1;
        int i12 = true != zzaaqVar.zzT ? 16 : 24;
        this.zzg = zzabc.zzi(this.zzd.zzd);
        this.zzi = zzng.zzad(i3, false);
        int i13 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i13 >= zzaaqVar.zzq.size()) {
                i6 = 0;
                i13 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = zzabc.zzj(this.zzd, (String) zzaaqVar.zzq.get(i13), false);
                if (i6 > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.zzk = i13;
        this.zzj = i6;
        this.zzl = zzabc.zzm(this.zzd.zzf, 0);
        this.zzm = zzabc.zzn(this.zzd, zzaaqVar.zzr);
        zzv zzvVar = this.zzd;
        int i14 = zzvVar.zzf;
        this.zzn = i14 == 0 || (i14 & 1) != 0;
        this.zzq = 1 == (zzvVar.zze & 1);
        String str = zzvVar.zzp;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode == -2123537834) {
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            } else if (hashCode != 187078297) {
                if (hashCode == 1504698186 && str.equals("audio/iamf")) {
                    c = 2;
                    z2 = (c != 0 || c == 1 || c == 2) ? true : z2;
                }
                c = 65535;
                if (c != 0) {
                }
            } else {
                if (str.equals("audio/ac4")) {
                    c = 1;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            }
            this.zzx = z2;
            int i15 = zzvVar.zzI;
            this.zzr = i15;
            this.zzs = zzvVar.zzK;
            int i16 = zzvVar.zzj;
            this.zzt = i16;
            this.zzf = (i16 != -1 || i16 <= zzaaqVar.zzu) && (i15 == -1 || i15 <= zzaaqVar.zzt) && zzgulVar.zza(zzvVar);
            String str2 = zzfm.zza;
            split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(StringUtils.COMMA, -1);
            for (i7 = 0; i7 < split.length; i7++) {
                split[i7] = zzfm.zzi(split[i7]);
            }
            i8 = 0;
            while (true) {
                if (i8 < split.length) {
                    i9 = 0;
                    i8 = Integer.MAX_VALUE;
                    break;
                } else {
                    i9 = zzabc.zzj(this.zzd, split[i8], false);
                    if (i9 > 0) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.zzo = i8;
            this.zzp = i9;
            i10 = 0;
            while (true) {
                if (i10 >= zzaaqVar.zzv.size()) {
                    break;
                }
                String str3 = this.zzd.zzp;
                if (str3 != null && str3.equals(zzaaqVar.zzv.get(i10))) {
                    i5 = i10;
                    break;
                }
                i10++;
            }
            this.zzu = i5;
            this.zzv = (i3 & 384) != 128;
            this.zzw = (i3 & 64) != 64;
            zzaaqVar2 = this.zzh;
            if (zzng.zzad(i3, zzaaqVar2.zzV) && ((z3 = this.zzf) || zzaaqVar2.zzO)) {
                int i17 = zzaaqVar2.zzw.zzb;
                if (zzng.zzad(i3, false) && z3 && this.zzd.zzj != -1 && ((zzaaqVar2.zzX || !z) && (i12 & i3) != 0)) {
                    i11 = 2;
                }
            } else {
                i11 = 0;
            }
            this.zze = i11;
        }
        z2 = false;
        this.zzx = z2;
        int i152 = zzvVar.zzI;
        this.zzr = i152;
        this.zzs = zzvVar.zzK;
        int i162 = zzvVar.zzj;
        this.zzt = i162;
        this.zzf = (i162 != -1 || i162 <= zzaaqVar.zzu) && (i152 == -1 || i152 <= zzaaqVar.zzt) && zzgulVar.zza(zzvVar);
        String str22 = zzfm.zza;
        split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(StringUtils.COMMA, -1);
        while (i7 < split.length) {
        }
        i8 = 0;
        while (true) {
            if (i8 < split.length) {
            }
            i8++;
        }
        this.zzo = i8;
        this.zzp = i9;
        i10 = 0;
        while (true) {
            if (i10 >= zzaaqVar.zzv.size()) {
            }
            i10++;
        }
        this.zzu = i5;
        this.zzv = (i3 & 384) != 128;
        this.zzw = (i3 & 64) != 64;
        zzaaqVar2 = this.zzh;
        if (zzng.zzad(i3, zzaaqVar2.zzV)) {
            int i172 = zzaaqVar2.zzw.zzb;
            if (zzng.zzad(i3, false)) {
                i11 = 2;
            }
            this.zze = i11;
        }
        i11 = 0;
        this.zze = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaab zzaabVar) {
        zzgzg zzgzgVar;
        zzgzg zza;
        boolean z = this.zzf;
        if (z && this.zzi) {
            zza = zzabc.zzc;
        } else {
            zzgzgVar = zzabc.zzc;
            zza = zzgzgVar.zza();
        }
        zzgwz zza2 = zzgwz.zzg().zzd(this.zzi, zzaabVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzaabVar.zzk), zzgzg.zzb().zza()).zzb(this.zzj, zzaabVar.zzj).zzb(this.zzl, zzaabVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzaabVar.zzm), zzgzg.zzb().zza()).zzd(this.zzq, zzaabVar.zzq).zzd(this.zzn, zzaabVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzaabVar.zzo), zzgzg.zzb().zza()).zzb(this.zzp, zzaabVar.zzp).zzd(z, zzaabVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzaabVar.zzu), zzgzg.zzb().zza());
        boolean z2 = this.zzh.zzF;
        zzgwz zza3 = zza2.zzd(this.zzv, zzaabVar.zzv).zzd(this.zzw, zzaabVar.zzw).zzd(this.zzx, zzaabVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzaabVar.zzr), zza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzaabVar.zzs), zza);
        if (Objects.equals(this.zzg, zzaabVar.zzg)) {
            zza3 = zza3.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzaabVar.zzt), zza);
        }
        return zza3.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final /* bridge */ /* synthetic */ boolean zzc(zzaau zzaauVar) {
        String str;
        int i;
        zzaab zzaabVar = (zzaab) zzaauVar;
        boolean z = this.zzh.zzR;
        zzv zzvVar = this.zzd;
        int i2 = zzvVar.zzI;
        if (i2 == -1) {
            return false;
        }
        zzv zzvVar2 = zzaabVar.zzd;
        return i2 == zzvVar2.zzI && (str = zzvVar.zzp) != null && TextUtils.equals(str, zzvVar2.zzp) && (i = zzvVar.zzK) != -1 && i == zzvVar2.zzK && this.zzv == zzaabVar.zzv && this.zzw == zzaabVar.zzw;
    }
}
