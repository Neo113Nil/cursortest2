package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzxc extends zzxp implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzxi zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    /* JADX WARN: Multi-variable type inference failed */
    public zzxc(int i, zzcd zzcdVar, int i2, zzxi zzxiVar, int i3, boolean z, zzfuv zzfuvVar, int i4) {
        super(i, zzcdVar, i2);
        int i5;
        int i6;
        String[] strArr;
        int i7;
        boolean z2;
        LocaleList locales;
        String languageTags;
        this.zzh = zzxiVar;
        int i8 = 1;
        int i9 = true != zzxiVar.zzL ? 16 : 24;
        boolean z3 = zzxiVar.zzH;
        this.zzg = zzxt.zzh(this.zzd.zzd);
        this.zzi = zzlf.zza(i3, false);
        int i10 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i10 >= zzxiVar.zzn.size()) {
                i10 = Integer.MAX_VALUE;
                i6 = 0;
                break;
            } else {
                i6 = zzxt.zzc(this.zzd, (String) zzxiVar.zzn.get(i10), false);
                if (i6 > 0) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.zzk = i10;
        this.zzj = i6;
        int i11 = this.zzd.zzf;
        int i12 = zzxiVar.zzo;
        this.zzl = zzxt.zzb(i11, 0);
        zzaf zzafVar = this.zzd;
        int i13 = zzafVar.zzf;
        this.zzm = i13 == 0 || (i13 & 1) != 0;
        this.zzp = 1 == (zzafVar.zze & 1);
        this.zzq = zzafVar.zzz;
        this.zzr = zzafVar.zzA;
        this.zzs = zzafVar.zzi;
        if (zzafVar.zzi != -1) {
            int i14 = zzxiVar.zzq;
        }
        if (zzafVar.zzz != -1) {
            int i15 = zzxiVar.zzp;
        }
        this.zzf = zzfuvVar.zza(zzafVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (zzet.zza >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            strArr = languageTags.split(",", -1);
        } else {
            strArr = new String[]{configuration.locale.toLanguageTag()};
        }
        for (int i16 = 0; i16 < strArr.length; i16++) {
            strArr[i16] = zzet.zzD(strArr[i16]);
        }
        int i17 = 0;
        while (true) {
            if (i17 >= strArr.length) {
                i17 = Integer.MAX_VALUE;
                i7 = 0;
                break;
            } else {
                i7 = zzxt.zzc(this.zzd, strArr[i17], false);
                if (i7 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.zzn = i17;
        this.zzo = i7;
        int i18 = 0;
        while (true) {
            if (i18 >= zzxiVar.zzr.size()) {
                break;
            }
            String str = this.zzd.zzm;
            if (str != null && str.equals(zzxiVar.zzr.get(i18))) {
                i5 = i18;
                break;
            }
            i18++;
        }
        this.zzt = i5;
        this.zzu = (i3 & 384) == 128;
        this.zzv = (i3 & 64) == 64;
        zzxi zzxiVar2 = this.zzh;
        if (zzlf.zza(i3, zzxiVar2.zzN) && ((z2 = this.zzf) || zzxiVar2.zzG)) {
            zzcg zzcgVar = zzxiVar2.zzs;
            if (zzlf.zza(i3, false) && z2 && this.zzd.zzi != -1) {
                boolean z4 = zzxiVar2.zzz;
                boolean z5 = zzxiVar2.zzy;
                if ((zzxiVar2.zzP || !z) && (i9 & i3) != 0) {
                    i8 = 2;
                }
            }
        } else {
            i8 = 0;
        }
        this.zze = i8;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxc zzxcVar) {
        zzfzc zzfzcVar;
        zzfzc zza;
        if (this.zzf && this.zzi) {
            zza = zzxt.zzb;
        } else {
            zzfzcVar = zzxt.zzb;
            zza = zzfzcVar.zza();
        }
        zzfxg zzc = zzfxg.zzj().zzd(this.zzi, zzxcVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzxcVar.zzk), zzfzc.zzc().zza()).zzb(this.zzj, zzxcVar.zzj).zzb(this.zzl, zzxcVar.zzl).zzd(this.zzp, zzxcVar.zzp).zzd(this.zzm, zzxcVar.zzm).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzxcVar.zzn), zzfzc.zzc().zza()).zzb(this.zzo, zzxcVar.zzo).zzd(this.zzf, zzxcVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzxcVar.zzt), zzfzc.zzc().zza());
        boolean z = this.zzh.zzy;
        zzfxg zzc2 = zzc.zzd(this.zzu, zzxcVar.zzu).zzd(this.zzv, zzxcVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzxcVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzxcVar.zzr), zza);
        if (zzet.zzG(this.zzg, zzxcVar.zzg)) {
            zzc2 = zzc2.zzc(Integer.valueOf(this.zzs), Integer.valueOf(zzxcVar.zzs), zza);
        }
        return zzc2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final /* bridge */ /* synthetic */ boolean zzc(zzxp zzxpVar) {
        String str;
        zzxc zzxcVar = (zzxc) zzxpVar;
        boolean z = this.zzh.zzJ;
        zzaf zzafVar = this.zzd;
        int i = zzafVar.zzz;
        if (i == -1) {
            return false;
        }
        zzaf zzafVar2 = zzxcVar.zzd;
        if (i != zzafVar2.zzz || (str = zzafVar.zzm) == null || !TextUtils.equals(str, zzafVar2.zzm)) {
            return false;
        }
        zzxi zzxiVar = this.zzh;
        boolean z2 = zzxiVar.zzI;
        int i2 = this.zzd.zzA;
        if (i2 == -1 || i2 != zzxcVar.zzd.zzA) {
            return false;
        }
        boolean z3 = zzxiVar.zzK;
        return this.zzu == zzxcVar.zzu && this.zzv == zzxcVar.zzv;
    }
}
