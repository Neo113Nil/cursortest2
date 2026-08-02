package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfsj implements zzfsy {
    protected zzfsj() {
    }

    public static zzfsj zzc(char c) {
        return new zzfsg(c);
    }

    @Override // com.google.android.gms.internal.ads.zzfsy
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
