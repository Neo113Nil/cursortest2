package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzcx {

    @Nullable
    private CharSequence zza;

    @Nullable
    private Bitmap zzb;

    @Nullable
    private Layout.Alignment zzc;

    @Nullable
    private Layout.Alignment zzd;
    private float zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;
    private float zzo;
    private int zzp;

    public zzcx() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = -3.4028235E38f;
        this.zzf = Integer.MIN_VALUE;
        this.zzg = Integer.MIN_VALUE;
        this.zzh = -3.4028235E38f;
        this.zzi = Integer.MIN_VALUE;
        this.zzj = Integer.MIN_VALUE;
        this.zzk = -3.4028235E38f;
        this.zzl = -3.4028235E38f;
        this.zzm = -3.4028235E38f;
        this.zzn = Integer.MIN_VALUE;
    }

    /* synthetic */ zzcx(zzcy zzcyVar, byte[] bArr) {
        this.zza = zzcyVar.zza;
        this.zzb = zzcyVar.zzd;
        this.zzc = zzcyVar.zzb;
        this.zzd = zzcyVar.zzc;
        this.zze = zzcyVar.zze;
        this.zzf = zzcyVar.zzf;
        this.zzg = zzcyVar.zzg;
        this.zzh = zzcyVar.zzh;
        this.zzi = zzcyVar.zzi;
        this.zzj = zzcyVar.zzl;
        this.zzk = zzcyVar.zzm;
        this.zzl = zzcyVar.zzj;
        this.zzm = zzcyVar.zzk;
        this.zzn = zzcyVar.zzn;
        this.zzo = zzcyVar.zzo;
        this.zzp = zzcyVar.zzp;
    }

    public final zzcx zza(CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = null;
        return this;
    }

    @Nullable
    public final CharSequence zzb() {
        return this.zza;
    }

    public final zzcx zzc(Bitmap bitmap) {
        this.zzb = bitmap;
        this.zza = null;
        return this;
    }

    public final zzcx zzd(@Nullable Layout.Alignment alignment) {
        this.zzc = alignment;
        return this;
    }

    public final zzcx zze(@Nullable Layout.Alignment alignment) {
        this.zzd = alignment;
        return this;
    }

    public final zzcx zzf(float f, int i) {
        this.zze = f;
        this.zzf = i;
        return this;
    }

    public final zzcx zzg(int i) {
        this.zzg = i;
        return this;
    }

    public final int zzh() {
        return this.zzg;
    }

    public final zzcx zzi(float f) {
        this.zzh = f;
        return this;
    }

    public final zzcx zzj(int i) {
        this.zzi = i;
        return this;
    }

    public final int zzk() {
        return this.zzi;
    }

    public final zzcx zzl(float f, int i) {
        this.zzk = f;
        this.zzj = i;
        return this;
    }

    public final zzcx zzm(float f) {
        this.zzl = f;
        return this;
    }

    public final zzcx zzn(float f) {
        this.zzm = f;
        return this;
    }

    public final zzcx zzo(int i) {
        this.zzn = i;
        return this;
    }

    public final zzcx zzp(float f) {
        this.zzo = f;
        return this;
    }

    public final zzcx zzq(int i) {
        this.zzp = i;
        return this;
    }

    public final zzcy zzr() {
        return new zzcy(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, false, -16777216, this.zzn, this.zzo, this.zzp, null);
    }
}
