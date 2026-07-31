package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
final class zzhjj implements zzhkl {
    private static final zzhjq zzb = new zzhjh();
    private final zzhjq zza;

    public zzhjj() {
        zzhjq zzhjqVar = zzb;
        int i = zzhgo.zza;
        zzhji zzhjiVar = new zzhji(zzhia.zza(), zzhjqVar);
        byte[] bArr = zzhiu.zzb;
        this.zza = zzhjiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhkl
    public final zzhkk zza(Class cls) {
        int i = zzhkm.zza;
        if (!zzhih.class.isAssignableFrom(cls)) {
            int i2 = zzhgo.zza;
        }
        zzhjp zzc = this.zza.zzc(cls);
        if (zzc.zza()) {
            int i3 = zzhgo.zza;
            return zzhjw.zzh(zzhkm.zzF(), zzhhu.zza(), zzc.zzb());
        }
        int i4 = zzhgo.zza;
        return zzhjv.zzm(cls, zzc, zzhjz.zza(), zzhjf.zza(), zzhkm.zzF(), zzc.zzc() + (-1) != 1 ? zzhhu.zza() : null, zzhjo.zza());
    }
}
