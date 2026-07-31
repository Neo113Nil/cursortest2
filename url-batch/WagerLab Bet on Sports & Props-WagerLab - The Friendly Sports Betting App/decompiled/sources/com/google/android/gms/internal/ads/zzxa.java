package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.MimeTypes;
import com.amazon.a.a.o.b.f;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzxa extends zzxv implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzxo zzh;
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x00b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100 A[LOOP:1: B:28:0x00fd->B:30:0x0100, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143 A[EDGE_INSN: B:80:0x0143->B:48:0x0143 BREAK  A[LOOP:3: B:40:0x0124->B:78:0x0140], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzxa(int i, zzbf zzbfVar, int i2, zzxo zzxoVar, int i3, boolean z, zzghd zzghdVar, int i4) {
        super(i, zzbfVar, i2);
        int i5;
        int i6;
        char c;
        boolean z2;
        int i7;
        String[] split;
        int i8;
        int i9;
        int i10;
        int i11;
        zzxo zzxoVar2;
        boolean z3;
        this.zzh = zzxoVar;
        int i12 = 1;
        int i13 = true != zzxoVar.zzT ? 16 : 24;
        boolean z4 = zzxoVar.zzP;
        this.zzg = zzyd.zzi(this.zzd.zzd);
        this.zzi = zzln.zzZ(i3, false);
        int i14 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i14 >= zzxoVar.zzq.size()) {
                i6 = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = zzyd.zzj(this.zzd, (String) zzxoVar.zzq.get(i14), false);
                if (i6 > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.zzk = i14;
        this.zzj = i6;
        int i15 = this.zzd.zzf;
        int i16 = zzxoVar.zzs;
        this.zzl = zzyd.zzm(i15, 0);
        this.zzm = zzyd.zzn(this.zzd, zzxoVar.zzr);
        zzu zzuVar = this.zzd;
        int i17 = zzuVar.zzf;
        this.zzn = i17 == 0 || (i17 & 1) != 0;
        this.zzq = 1 == (zzuVar.zze & 1);
        String str = zzuVar.zzo;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode == -2123537834) {
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c = 0;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            } else if (hashCode != 187078297) {
                if (hashCode == 1504698186 && str.equals(MimeTypes.AUDIO_IAMF)) {
                    c = 2;
                    z2 = (c != 0 || c == 1 || c == 2) ? true : z2;
                }
                c = 65535;
                if (c != 0) {
                }
            } else {
                if (str.equals(MimeTypes.AUDIO_AC4)) {
                    c = 1;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            }
            this.zzx = z2;
            this.zzr = zzuVar.zzG;
            this.zzs = zzuVar.zzH;
            this.zzt = zzuVar.zzj;
            int i18 = zzuVar.zzj;
            this.zzf = (i18 != -1 || i18 <= zzxoVar.zzu) && ((i7 = zzuVar.zzG) == -1 || i7 <= zzxoVar.zzt) && zzghdVar.zza(zzuVar);
            String str2 = zzeo.zza;
            split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(f.f598a, -1);
            for (i8 = 0; i8 < split.length; i8++) {
                split[i8] = zzeo.zzh(split[i8]);
            }
            i9 = 0;
            while (true) {
                if (i9 < split.length) {
                    i10 = 0;
                    i9 = Integer.MAX_VALUE;
                    break;
                } else {
                    i10 = zzyd.zzj(this.zzd, split[i9], false);
                    if (i10 > 0) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.zzo = i9;
            this.zzp = i10;
            i11 = 0;
            while (true) {
                if (i11 >= zzxoVar.zzv.size()) {
                    break;
                }
                String str3 = this.zzd.zzo;
                if (str3 != null && str3.equals(zzxoVar.zzv.get(i11))) {
                    i5 = i11;
                    break;
                }
                i11++;
            }
            this.zzu = i5;
            this.zzv = (i3 & 384) != 128;
            this.zzw = (i3 & 64) != 64;
            zzxoVar2 = this.zzh;
            if (zzln.zzZ(i3, zzxoVar2.zzV) && ((z3 = this.zzf) || zzxoVar2.zzO)) {
                int i19 = zzxoVar2.zzw.zzb;
                if (zzln.zzZ(i3, false) && z3 && this.zzd.zzj != -1) {
                    boolean z5 = zzxoVar2.zzG;
                    boolean z6 = zzxoVar2.zzF;
                    if ((!zzxoVar2.zzX || !z) && (i13 & i3) != 0) {
                        i12 = 2;
                    }
                }
            } else {
                i12 = 0;
            }
            this.zze = i12;
        }
        z2 = false;
        this.zzx = z2;
        this.zzr = zzuVar.zzG;
        this.zzs = zzuVar.zzH;
        this.zzt = zzuVar.zzj;
        int i182 = zzuVar.zzj;
        this.zzf = (i182 != -1 || i182 <= zzxoVar.zzu) && ((i7 = zzuVar.zzG) == -1 || i7 <= zzxoVar.zzt) && zzghdVar.zza(zzuVar);
        String str22 = zzeo.zza;
        split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(f.f598a, -1);
        while (i8 < split.length) {
        }
        i9 = 0;
        while (true) {
            if (i9 < split.length) {
            }
            i9++;
        }
        this.zzo = i9;
        this.zzp = i10;
        i11 = 0;
        while (true) {
            if (i11 >= zzxoVar.zzv.size()) {
            }
            i11++;
        }
        this.zzu = i5;
        this.zzv = (i3 & 384) != 128;
        this.zzw = (i3 & 64) != 64;
        zzxoVar2 = this.zzh;
        if (zzln.zzZ(i3, zzxoVar2.zzV)) {
            int i192 = zzxoVar2.zzw.zzb;
            if (zzln.zzZ(i3, false)) {
                boolean z52 = zzxoVar2.zzG;
                boolean z62 = zzxoVar2.zzF;
                if (!zzxoVar2.zzX) {
                }
                i12 = 2;
            }
            this.zze = i12;
        }
        i12 = 0;
        this.zze = i12;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final /* bridge */ /* synthetic */ boolean zzc(zzxv zzxvVar) {
        String str;
        zzxo zzxoVar = this.zzh;
        zzxa zzxaVar = (zzxa) zzxvVar;
        boolean z = zzxoVar.zzR;
        zzu zzuVar = this.zzd;
        int i = zzuVar.zzG;
        if (i == -1) {
            return false;
        }
        zzu zzuVar2 = zzxaVar.zzd;
        if (i != zzuVar2.zzG || (str = zzuVar.zzo) == null || !TextUtils.equals(str, zzuVar2.zzo)) {
            return false;
        }
        boolean z2 = zzxoVar.zzQ;
        int i2 = zzuVar.zzH;
        if (i2 == -1 || i2 != zzuVar2.zzH) {
            return false;
        }
        boolean z3 = zzxoVar.zzS;
        return this.zzv == zzxaVar.zzv && this.zzw == zzxaVar.zzw;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxa zzxaVar) {
        zzglj zzgljVar;
        zzglj zza;
        boolean z = this.zzf;
        if (z && this.zzi) {
            zza = zzyd.zzc;
        } else {
            zzgljVar = zzyd.zzc;
            zza = zzgljVar.zza();
        }
        zzgjp zza2 = zzgjp.zzg().zzd(this.zzi, zzxaVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzxaVar.zzk), zzglj.zzb().zza()).zzb(this.zzj, zzxaVar.zzj).zzb(this.zzl, zzxaVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzxaVar.zzm), zzglj.zzb().zza()).zzd(this.zzq, zzxaVar.zzq).zzd(this.zzn, zzxaVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzxaVar.zzo), zzglj.zzb().zza()).zzb(this.zzp, zzxaVar.zzp).zzd(z, zzxaVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzxaVar.zzu), zzglj.zzb().zza());
        boolean z2 = this.zzh.zzF;
        zzgjp zza3 = zza2.zzd(this.zzv, zzxaVar.zzv).zzd(this.zzw, zzxaVar.zzw).zzd(this.zzx, zzxaVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzxaVar.zzr), zza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzxaVar.zzs), zza);
        if (Objects.equals(this.zzg, zzxaVar.zzg)) {
            zza3 = zza3.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzxaVar.zzt), zza);
        }
        return zza3.zze();
    }
}
