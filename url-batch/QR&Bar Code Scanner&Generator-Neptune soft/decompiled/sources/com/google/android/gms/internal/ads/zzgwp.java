package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgwp implements zzalq {
    private static final zzgxa zza = zzgxa.zzb(zzgwp.class);
    protected final String zzb;
    long zze;
    zzgwu zzg;
    private zzalr zzh;
    private ByteBuffer zzi;
    long zzf = -1;
    private ByteBuffer zzj = null;
    boolean zzd = true;
    boolean zzc = true;

    protected zzgwp(String str) {
        this.zzb = str;
    }

    private final synchronized void zzd() {
        if (this.zzd) {
            return;
        }
        try {
            zzgxa zzgxaVar = zza;
            String str = this.zzb;
            zzgxaVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.zzi = this.zzg.zzd(this.zze, this.zzf);
            this.zzd = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zzb(zzgwu zzgwuVar, ByteBuffer byteBuffer, long j, zzaln zzalnVar) throws IOException {
        this.zze = zzgwuVar.zzb();
        byteBuffer.remaining();
        this.zzf = j;
        this.zzg = zzgwuVar;
        zzgwuVar.zze(zzgwuVar.zzb() + j);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zzc(zzalr zzalrVar) {
        this.zzh = zzalrVar;
    }

    protected abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        zzd();
        zzgxa zzgxaVar = zza;
        String str = this.zzb;
        zzgxaVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
