package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzakb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzakd zzc;

    zzakb(zzakd zzakdVar, String str, long j) {
        this.zzc = zzakdVar;
        this.zza = str;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzako zzakoVar;
        zzako zzakoVar2;
        zzakoVar = this.zzc.zza;
        zzakoVar.zza(this.zza, this.zzb);
        zzakd zzakdVar = this.zzc;
        zzakoVar2 = zzakdVar.zza;
        zzakoVar2.zzb(zzakdVar.toString());
    }
}
