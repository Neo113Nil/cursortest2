package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzaac {
    private final Context zza;
    private boolean zzb;
    private zztb zzc = zztb.zzb;
    private final zzso zzd;
    private Handler zze;
    private zzabm zzf;

    public zzaac(Context context) {
        this.zza = context;
        this.zzd = new zzsi(context, null, null);
    }

    public final zzaac zza(zztb zztbVar) {
        this.zzc = zztbVar;
        return this;
    }

    public final zzaac zzb(Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzaac zzc(zzabm zzabmVar) {
        this.zzf = zzabmVar;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r3.zzf != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaae zzd() {
        boolean z;
        zzghc.zzh(!this.zzb);
        Handler handler = this.zze;
        if (handler != null || this.zzf != null) {
            z = false;
            if (handler != null) {
            }
            zzghc.zzh(z);
            this.zzb = true;
            return new zzaae(this);
        }
        z = true;
        zzghc.zzh(z);
        this.zzb = true;
        return new zzaae(this);
    }

    final /* synthetic */ Context zze() {
        return this.zza;
    }

    final /* synthetic */ zztb zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzso zzg() {
        return this.zzd;
    }

    final /* synthetic */ Handler zzh() {
        return this.zze;
    }

    final /* synthetic */ zzabm zzi() {
        return this.zzf;
    }
}
