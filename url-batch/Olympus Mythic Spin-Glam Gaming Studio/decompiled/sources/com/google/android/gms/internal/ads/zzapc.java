package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzapc {

    @Nullable
    private String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private float zzk;

    @Nullable
    private String zzl;

    @Nullable
    private Layout.Alignment zzo;

    @Nullable
    private Layout.Alignment zzp;

    @Nullable
    private zzaov zzr;

    @Nullable
    private String zzt;

    @Nullable
    private String zzu;

    @Nullable
    private String zzv;
    private int zzf = -1;
    private int zzg = -1;
    private int zzh = -1;
    private int zzi = -1;
    private int zzj = -1;
    private int zzm = -1;
    private int zzn = -1;
    private int zzq = -1;
    private float zzs = Float.MAX_VALUE;

    @Nullable
    public final Layout.Alignment zzA() {
        return this.zzp;
    }

    public final zzapc zzB(@Nullable Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final boolean zzC() {
        return this.zzq == 1;
    }

    public final zzapc zzD(boolean z) {
        this.zzq = z ? 1 : 0;
        return this;
    }

    @Nullable
    public final zzaov zzE() {
        return this.zzr;
    }

    public final zzapc zzF(@Nullable zzaov zzaovVar) {
        this.zzr = zzaovVar;
        return this;
    }

    public final zzapc zzG(float f) {
        this.zzk = f;
        return this;
    }

    public final zzapc zzH(int i) {
        this.zzj = i;
        return this;
    }

    public final int zzI() {
        return this.zzj;
    }

    public final float zzJ() {
        return this.zzk;
    }

    public final zzapc zzK(@Nullable String str) {
        this.zzt = str;
        return this;
    }

    @Nullable
    public final String zzL() {
        return this.zzt;
    }

    public final zzapc zzM(@Nullable String str) {
        this.zzu = str;
        return this;
    }

    @Nullable
    public final String zzN() {
        return this.zzu;
    }

    public final zzapc zzO(String str) {
        this.zzv = str;
        return this;
    }

    @Nullable
    public final String zzP() {
        return this.zzv;
    }

    public final int zza() {
        int i = this.zzh;
        if (i == -1 && this.zzi == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.zzi == 1 ? 2 : 0);
    }

    public final boolean zzb() {
        return this.zzf == 1;
    }

    public final zzapc zzc(boolean z) {
        this.zzf = z ? 1 : 0;
        return this;
    }

    public final boolean zzd() {
        return this.zzg == 1;
    }

    public final zzapc zze(boolean z) {
        this.zzg = z ? 1 : 0;
        return this;
    }

    public final zzapc zzf(boolean z) {
        this.zzh = z ? 1 : 0;
        return this;
    }

    public final zzapc zzg(boolean z) {
        this.zzi = z ? 1 : 0;
        return this;
    }

    @Nullable
    public final String zzh() {
        return this.zza;
    }

    public final zzapc zzi(@Nullable String str) {
        this.zza = str;
        return this;
    }

    public final int zzj() {
        if (this.zzc) {
            return this.zzb;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final zzapc zzk(int i) {
        this.zzb = i;
        this.zzc = true;
        return this;
    }

    public final boolean zzl() {
        return this.zzc;
    }

    public final int zzm() {
        if (this.zze) {
            return this.zzd;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final zzapc zzn(int i) {
        this.zzd = i;
        this.zze = true;
        return this;
    }

    public final boolean zzo() {
        return this.zze;
    }

    public final zzapc zzp(float f) {
        this.zzs = f;
        return this;
    }

    public final float zzq() {
        return this.zzs;
    }

    public final zzapc zzr(@Nullable zzapc zzapcVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzapcVar != null) {
            if (!this.zzc && zzapcVar.zzc) {
                zzk(zzapcVar.zzb);
            }
            if (this.zzh == -1) {
                this.zzh = zzapcVar.zzh;
            }
            if (this.zzi == -1) {
                this.zzi = zzapcVar.zzi;
            }
            if (this.zza == null && (str = zzapcVar.zza) != null) {
                this.zza = str;
            }
            if (this.zzf == -1) {
                this.zzf = zzapcVar.zzf;
            }
            if (this.zzg == -1) {
                this.zzg = zzapcVar.zzg;
            }
            if (this.zzn == -1) {
                this.zzn = zzapcVar.zzn;
            }
            if (this.zzo == null && (alignment2 = zzapcVar.zzo) != null) {
                this.zzo = alignment2;
            }
            if (this.zzp == null && (alignment = zzapcVar.zzp) != null) {
                this.zzp = alignment;
            }
            if (this.zzq == -1) {
                this.zzq = zzapcVar.zzq;
            }
            if (this.zzj == -1) {
                this.zzj = zzapcVar.zzj;
                this.zzk = zzapcVar.zzk;
            }
            if (this.zzr == null) {
                this.zzr = zzapcVar.zzr;
            }
            if (this.zzs == Float.MAX_VALUE) {
                this.zzs = zzapcVar.zzs;
            }
            if (this.zzt == null) {
                this.zzt = zzapcVar.zzt;
            }
            if (this.zzu == null) {
                this.zzu = zzapcVar.zzu;
            }
            if (this.zzv == null) {
                this.zzv = zzapcVar.zzv;
            }
            if (!this.zze && zzapcVar.zze) {
                zzn(zzapcVar.zzd);
            }
            if (this.zzm == -1 && (i = zzapcVar.zzm) != -1) {
                this.zzm = i;
            }
        }
        return this;
    }

    public final zzapc zzs(@Nullable String str) {
        this.zzl = str;
        return this;
    }

    @Nullable
    public final String zzt() {
        return this.zzl;
    }

    public final zzapc zzu(int i) {
        this.zzm = i;
        return this;
    }

    public final int zzv() {
        return this.zzm;
    }

    public final zzapc zzw(int i) {
        this.zzn = i;
        return this;
    }

    public final int zzx() {
        return this.zzn;
    }

    @Nullable
    public final Layout.Alignment zzy() {
        return this.zzo;
    }

    public final zzapc zzz(@Nullable Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }
}
