package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhnt {
    private static final zzhnt zza = new zzhnt();
    private final AtomicReference zzb;

    zzhnt() {
        byte[] bArr = null;
        this.zzb = new AtomicReference(new zzhoo(new zzhol(bArr), bArr));
    }

    public static zzhnt zza() {
        return zza;
    }

    public final synchronized void zzb(zzhok zzhokVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        byte[] bArr = null;
        zzhol zzholVar = new zzhol((zzhoo) atomicReference.get(), bArr);
        zzholVar.zza(zzhokVar);
        atomicReference.set(new zzhoo(zzholVar, bArr));
    }

    public final synchronized void zzc(zzhoq zzhoqVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        byte[] bArr = null;
        zzhol zzholVar = new zzhol((zzhoo) atomicReference.get(), bArr);
        zzholVar.zzb(zzhoqVar);
        atomicReference.set(new zzhoo(zzholVar, bArr));
    }

    public final Object zzd(zzhes zzhesVar, Class cls) throws GeneralSecurityException {
        return ((zzhoo) this.zzb.get()).zza(zzhesVar, cls);
    }

    public final Object zze(zzhfe zzhfeVar, Class cls) throws GeneralSecurityException {
        return ((zzhoo) this.zzb.get()).zzb(zzhfeVar, cls);
    }
}
