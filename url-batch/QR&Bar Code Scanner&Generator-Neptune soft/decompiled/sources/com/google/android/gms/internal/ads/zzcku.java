package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcku implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    final zzckt zza(zzciy zzciyVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzckt zzcktVar = (zzckt) it.next();
            if (zzcktVar.zza == zzciyVar) {
                return zzcktVar;
            }
        }
        return null;
    }

    public final void zzb(zzckt zzcktVar) {
        this.zza.add(zzcktVar);
    }

    public final void zzc(zzckt zzcktVar) {
        this.zza.remove(zzcktVar);
    }

    public final boolean zzd(zzciy zzciyVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzckt zzcktVar = (zzckt) it.next();
            if (zzcktVar.zza == zzciyVar) {
                arrayList.add(zzcktVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzckt) it2.next()).zzb.zzb();
        }
        return true;
    }
}
