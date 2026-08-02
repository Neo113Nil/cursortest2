package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzgwq extends zzgwt implements zzalq {
    zzalr zza;
    protected final String zzb = "moov";

    public zzgwq(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zzb(zzgwu zzgwuVar, ByteBuffer byteBuffer, long j, zzaln zzalnVar) throws IOException {
        zzgwuVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzgwuVar;
        this.zzf = zzgwuVar.zzb();
        zzgwuVar.zze(zzgwuVar.zzb() + j);
        this.zzg = zzgwuVar.zzb();
        this.zzc = zzalnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zzc(zzalr zzalrVar) {
        this.zza = zzalrVar;
    }
}
