package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzqy implements zzqf {
    final /* synthetic */ zzrc zza;

    /* synthetic */ zzqy(zzrc zzrcVar, byte[] bArr) {
        Objects.requireNonNull(zzrcVar);
        this.zza = zzrcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zza(long j) {
        zzrc zzrcVar = this.zza;
        if (zzrcVar.zzI() != null) {
            ((zzrf) zzrcVar.zzI()).zza.zzav().zzd(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zzb(long j, long j2, long j3, long j4) {
        zzrc zzrcVar = this.zza;
        long zzF = zzrcVar.zzF();
        long zzG = zzrcVar.zzG();
        int length = String.valueOf(j).length();
        int length2 = String.valueOf(j2).length();
        int length3 = String.valueOf(j3).length();
        int length4 = String.valueOf(j4).length();
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 2 + length3 + 2 + length4 + 2 + String.valueOf(zzF).length() + 2 + String.valueOf(zzG).length());
        sb.append("Spurious audio timestamp (frame position mismatch): ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", ");
        sb.append(zzF);
        sb.append(", ");
        sb.append(zzG);
        zzds.zzc("DefaultAudioSink", sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zzc(long j, long j2, long j3, long j4) {
        zzrc zzrcVar = this.zza;
        long zzF = zzrcVar.zzF();
        long zzG = zzrcVar.zzG();
        int length = String.valueOf(j).length();
        int length2 = String.valueOf(j2).length();
        int length3 = String.valueOf(j3).length();
        int length4 = String.valueOf(j4).length();
        StringBuilder sb = new StringBuilder(length + 52 + length2 + 2 + length3 + 2 + length4 + 2 + String.valueOf(zzF).length() + 2 + String.valueOf(zzG).length());
        sb.append("Spurious audio timestamp (system clock mismatch): ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", ");
        sb.append(zzF);
        sb.append(", ");
        sb.append(zzG);
        zzds.zzc("DefaultAudioSink", sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zzd(long j) {
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 41);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j);
        zzds.zzc("DefaultAudioSink", sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zze(int i, long j) {
        zzrc zzrcVar = this.zza;
        if (zzrcVar.zzI() != null) {
            ((zzrf) zzrcVar.zzI()).zza.zzav().zze(i, j, SystemClock.elapsedRealtime() - zzrcVar.zzM());
        }
    }
}
