package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzffu implements zzinw {
    public static zzfdl zza(Context context, zzcfk zzcfkVar, zzcfl zzcflVar, Object obj, zzfen zzfenVar, zzffh zzffhVar, zzinq zzinqVar, zzinq zzinqVar2, zzinq zzinqVar3, zzinq zzinqVar4, zzinq zzinqVar5, zzinq zzinqVar6, zzinq zzinqVar7, Executor executor, zzfrg zzfrgVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzffa) obj);
        hashSet.add(zzfenVar);
        hashSet.add(zzffhVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgS)).booleanValue()) {
            hashSet.add((zzfdi) zzinqVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgT)).booleanValue()) {
            hashSet.add((zzfdi) zzinqVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgV)).booleanValue()) {
            hashSet.add((zzfdi) zzinqVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgW)).booleanValue()) {
            hashSet.add((zzfdi) zzinqVar5.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzec)).booleanValue()) {
            hashSet.add((zzfdi) zzinqVar7.zzb());
        }
        return new zzfdl(context, executor, hashSet, zzfrgVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
