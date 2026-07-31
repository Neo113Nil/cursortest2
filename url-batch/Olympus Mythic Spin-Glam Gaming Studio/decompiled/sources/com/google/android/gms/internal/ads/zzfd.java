package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzfd {
    private final zzbb zza;
    private final zzaz zzb;
    private final zzex zzc;
    private final zzbd zzd = new zzbd();
    private final zzea zze;
    private final zzey zzf;
    private final zzfa zzg;
    private final zzfb zzh;
    private final zzfc zzi;

    public zzfd(zzbb zzbbVar, zzex zzexVar, zzdp zzdpVar, int i, int i2, int i3, int i4) {
        this.zza = zzbbVar;
        this.zzc = zzexVar;
        this.zze = zzdpVar.zzd(zzbbVar.zzd(), new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzez
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(Message message) {
                return zzfd.this.zzb(message);
            }
        });
        this.zzf = new zzey(this, i);
        this.zzg = new zzfa(this, i2);
        this.zzh = new zzfb(this, i3);
        this.zzi = new zzfc(this, i4);
        zzew zzewVar = new zzew(this);
        this.zzb = zzewVar;
        zzbbVar.zze(zzewVar);
    }

    public final void zza() {
        this.zze.zzl(null);
        this.zza.zzf(this.zzb);
    }

    final /* synthetic */ boolean zzb(Message message) {
        int i = message.what;
        if (i == 1) {
            this.zzf.zza();
            return true;
        }
        if (i == 2) {
            this.zzg.zza();
            return true;
        }
        if (i == 3) {
            this.zzh.zza();
            return true;
        }
        if (i != 4) {
            return false;
        }
        this.zzi.zza();
        return true;
    }

    final /* synthetic */ void zzc() {
        this.zzf.zza();
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
    }

    final /* synthetic */ zzbb zzd() {
        return this.zza;
    }

    final /* synthetic */ zzex zze() {
        return this.zzc;
    }

    final /* synthetic */ zzbd zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzea zzg() {
        return this.zze;
    }
}
