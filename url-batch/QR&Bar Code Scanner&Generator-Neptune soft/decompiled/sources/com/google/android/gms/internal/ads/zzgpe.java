package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgpe;
import com.google.android.gms.internal.ads.zzgpf;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgpe<MessageType extends zzgpf<MessageType, BuilderType>, BuilderType extends zzgpe<MessageType, BuilderType>> implements zzgsn {
    @Override // 
    public abstract zzgpe zzag();

    protected abstract zzgpe zzah(zzgpf zzgpfVar);

    @Override // com.google.android.gms.internal.ads.zzgsn
    public final /* bridge */ /* synthetic */ zzgsn zzai(zzgso zzgsoVar) {
        if (zzbh().getClass().isInstance(zzgsoVar)) {
            return zzah((zzgpf) zzgsoVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
