package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgsg implements zzgti {
    private static final zzgsm zza = new zzgse();
    private final zzgsm zzb;

    public zzgsg() {
        zzgsm zzgsmVar;
        zzgsm[] zzgsmVarArr = new zzgsm[2];
        zzgsmVarArr[0] = zzgqz.zza();
        try {
            zzgsmVar = (zzgsm) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzgsmVar = zza;
        }
        zzgsmVarArr[1] = zzgsmVar;
        zzgsf zzgsfVar = new zzgsf(zzgsmVarArr);
        zzgro.zzf(zzgsfVar, "messageInfoFactory");
        this.zzb = zzgsfVar;
    }

    private static boolean zzb(zzgsl zzgslVar) {
        return zzgslVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    public final zzgth zza(Class cls) {
        zzgtj.zzG(cls);
        zzgsl zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? zzgre.class.isAssignableFrom(cls) ? zzgss.zzc(zzgtj.zzB(), zzgqt.zzb(), zzb.zza()) : zzgss.zzc(zzgtj.zzz(), zzgqt.zza(), zzb.zza()) : zzgre.class.isAssignableFrom(cls) ? zzb(zzb) ? zzgsr.zzl(cls, zzb, zzgsu.zzb(), zzgsc.zze(), zzgtj.zzB(), zzgqt.zzb(), zzgsk.zzb()) : zzgsr.zzl(cls, zzb, zzgsu.zzb(), zzgsc.zze(), zzgtj.zzB(), null, zzgsk.zzb()) : zzb(zzb) ? zzgsr.zzl(cls, zzb, zzgsu.zza(), zzgsc.zzd(), zzgtj.zzz(), zzgqt.zza(), zzgsk.zza()) : zzgsr.zzl(cls, zzb, zzgsu.zza(), zzgsc.zzd(), zzgtj.zzA(), null, zzgsk.zza());
    }
}
