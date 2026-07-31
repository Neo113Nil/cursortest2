package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzadk {
    private final Context zza;
    private boolean zzb;
    private zzwb zzc = zzwb.zzb;
    private final zzvn zzd;

    @Nullable
    private Handler zze;

    @Nullable
    private zzaey zzf;

    public zzadk(Context context) {
        this.zza = context;
        this.zzd = new zzvh(context, null, null);
    }

    public final zzadk zza(zzwb zzwbVar) {
        this.zzc = zzwbVar;
        return this;
    }

    public final zzadk zzb(@Nullable Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzadk zzc(@Nullable zzaey zzaeyVar) {
        this.zzf = zzaeyVar;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r3.zzf != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzadn zzd() {
        boolean z;
        zzguk.zzi(!this.zzb);
        Handler handler = this.zze;
        if (handler != null || this.zzf != null) {
            z = false;
            if (handler != null) {
            }
            zzguk.zzi(z);
            this.zzb = true;
            return new zzadn(this);
        }
        z = true;
        zzguk.zzi(z);
        this.zzb = true;
        return new zzadn(this);
    }

    final /* synthetic */ Context zze() {
        return this.zza;
    }

    final /* synthetic */ zzwb zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzvn zzg() {
        return this.zzd;
    }

    final /* synthetic */ Handler zzh() {
        return this.zze;
    }

    final /* synthetic */ zzaey zzi() {
        return this.zzf;
    }
}
