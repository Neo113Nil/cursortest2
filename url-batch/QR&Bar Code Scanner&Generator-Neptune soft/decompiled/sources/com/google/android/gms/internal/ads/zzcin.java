package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcin {
    private final Context zza;
    private final zzciy zzb;
    private final ViewGroup zzc;
    private zzcim zzd;

    public zzcin(Context context, ViewGroup viewGroup, zzcmp zzcmpVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcmpVar;
        this.zzd = null;
    }

    public final zzcim zza() {
        return this.zzd;
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcim zzcimVar = this.zzd;
        if (zzcimVar != null) {
            zzcimVar.zzF(i, i2, i3, i4);
        }
    }

    public final void zzc(int i, int i2, int i3, int i4, int i5, boolean z, zzcix zzcixVar, Integer num) {
        if (this.zzd != null) {
            return;
        }
        zzbjj.zza(this.zzb.zzo().zza(), this.zzb.zzn(), "vpr2");
        Context context = this.zza;
        zzciy zzciyVar = this.zzb;
        zzcim zzcimVar = new zzcim(context, zzciyVar, i5, z, zzciyVar.zzo().zza(), zzcixVar, num);
        this.zzd = zzcimVar;
        this.zzc.addView(zzcimVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i, i2, i3, i4);
        this.zzb.zzB(false);
    }

    public final void zzd() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcim zzcimVar = this.zzd;
        if (zzcimVar != null) {
            zzcimVar.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zze() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcim zzcimVar = this.zzd;
        if (zzcimVar != null) {
            zzcimVar.zzu();
        }
    }

    public final void zzf(int i) {
        zzcim zzcimVar = this.zzd;
        if (zzcimVar != null) {
            zzcimVar.zzC(i);
        }
    }
}
