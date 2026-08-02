package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzod implements zzng {
    protected zzne zzb;
    protected zzne zzc;
    private zzne zzd;
    private zzne zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzod() {
        ByteBuffer byteBuffer = zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        this.zzd = zzne.zza;
        zzne zzneVar = zzne.zza;
        this.zze = zzneVar;
        this.zzb = zzneVar;
        this.zzc = zzneVar;
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final zzne zza(zzne zzneVar) throws zznf {
        this.zzd = zzneVar;
        this.zze = zzi(zzneVar);
        return zzg() ? this.zze : zzne.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzc() {
        this.zzg = zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzf() {
        zzc();
        this.zzf = zza;
        this.zzd = zzne.zza;
        zzne zzneVar = zzne.zza;
        this.zze = zzneVar;
        this.zzb = zzneVar;
        this.zzc = zzneVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public boolean zzg() {
        return this.zze != zzne.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public boolean zzh() {
        return this.zzh && this.zzg == zza;
    }

    protected zzne zzi(zzne zzneVar) throws zznf {
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
