package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzexq implements zzgxi {
    public static zzevh zza(Context context, zzcfm zzcfmVar, zzcfn zzcfnVar, Object obj, zzevz zzevzVar, zzexc zzexcVar, zzgxc zzgxcVar, zzgxc zzgxcVar2, zzgxc zzgxcVar3, zzgxc zzgxcVar4, zzgxc zzgxcVar5, zzgxc zzgxcVar6, zzgxc zzgxcVar7, zzgxc zzgxcVar8, zzgxc zzgxcVar9, Executor executor, zzfju zzfjuVar, zzdxq zzdxqVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzewv) obj);
        hashSet.add(zzevzVar);
        hashSet.add(zzexcVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeO)).booleanValue()) {
            hashSet.add((zzeve) zzgxcVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeP)).booleanValue()) {
            hashSet.add((zzeve) zzgxcVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeQ)).booleanValue()) {
            hashSet.add((zzeve) zzgxcVar3.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeR)).booleanValue()) {
            hashSet.add((zzeve) zzgxcVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeV)).booleanValue()) {
            hashSet.add((zzeve) zzgxcVar6.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeW)).booleanValue()) {
            hashSet.add((zzeve) zzgxcVar7.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcs)).booleanValue()) {
            hashSet.add((zzeve) zzgxcVar9.zzb());
        }
        return new zzevh(context, executor, hashSet, zzfjuVar, zzdxqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
