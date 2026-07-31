package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public abstract class zzgty implements zzgul {
    protected zzgty() {
    }

    public static zzgty zzc() {
        return zzgtx.zzb;
    }

    public static zzgty zzd(char c) {
        return new zzgtu(c);
    }

    @Override // com.google.android.gms.internal.ads.zzgul
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
