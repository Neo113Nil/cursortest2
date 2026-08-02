package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgbn {
    private final Class zza;
    private zzgbo zzc;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private zzghm zzd = zzghm.zza;

    /* synthetic */ zzgbn(Class cls, zzgbm zzgbmVar) {
        this.zza = cls;
    }

    private final zzgbn zze(Object obj, zzgmj zzgmjVar, boolean z) throws GeneralSecurityException {
        byte[] array;
        if (this.zzb == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (zzgmjVar.zzi() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        zzgbs zzgbsVar = new zzgbs(zzgmjVar.zzc().zzf(), zzgmjVar.zzj(), null);
        int zzj = zzgmjVar.zzj() - 2;
        if (zzj != 1) {
            if (zzj != 2) {
                if (zzj == 3) {
                    array = zzgap.zza;
                } else if (zzj != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgmjVar.zza()).array();
        } else {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgmjVar.zza()).array();
        }
        zzgbo zzgboVar = new zzgbo(obj, array, zzgmjVar.zzi(), zzgmjVar.zzj(), zzgmjVar.zza(), zzgbsVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzgboVar);
        zzgbq zzgbqVar = new zzgbq(zzgboVar.zzd(), null);
        List list = (List) this.zzb.put(zzgbqVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(zzgboVar);
            this.zzb.put(zzgbqVar, Collections.unmodifiableList(arrayList2));
        }
        if (z) {
            if (this.zzc != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.zzc = zzgboVar;
        }
        return this;
    }

    public final zzgbn zza(Object obj, zzgmj zzgmjVar) throws GeneralSecurityException {
        zze(obj, zzgmjVar, true);
        return this;
    }

    public final zzgbn zzb(Object obj, zzgmj zzgmjVar) throws GeneralSecurityException {
        zze(obj, zzgmjVar, false);
        return this;
    }

    public final zzgbn zzc(zzghm zzghmVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zzd = zzghmVar;
        return this;
    }

    public final zzgbu zzd() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzgbu zzgbuVar = new zzgbu(concurrentMap, this.zzc, this.zzd, this.zza, null);
        this.zzb = null;
        return zzgbuVar;
    }
}
