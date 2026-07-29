package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zznw implements zzmz {
    protected zzmx zzb;
    protected zzmx zzc;
    private zzmx zzd;
    private zzmx zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zznw() {
        ByteBuffer byteBuffer = zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        this.zzd = zzmx.zza;
        zzmx zzmxVar = zzmx.zza;
        this.zze = zzmxVar;
        this.zzb = zzmxVar;
        this.zzc = zzmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final zzmx zza(zzmx zzmxVar) throws zzmy {
        this.zzd = zzmxVar;
        this.zze = zzi(zzmxVar);
        return zzg() ? this.zze : zzmx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzc() {
        this.zzg = zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzf() {
        zzc();
        this.zzf = zza;
        this.zzd = zzmx.zza;
        zzmx zzmxVar = zzmx.zza;
        this.zze = zzmxVar;
        this.zzb = zzmxVar;
        this.zzc = zzmxVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public boolean zzg() {
        return this.zze != zzmx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public boolean zzh() {
        return this.zzh && this.zzg == zza;
    }

    protected zzmx zzi(zzmx zzmxVar) throws zzmy {
        throw null;
    }

    protected final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    protected void zzk() {
    }

    protected void zzl() {
    }

    protected void zzm() {
    }

    protected final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
