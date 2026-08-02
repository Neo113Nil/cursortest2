package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzftk {
    private final zzfsj zza;
    private final zzftj zzb;

    private zzftk(zzftj zzftjVar) {
        zzfsi zzfsiVar = zzfsi.zza;
        this.zzb = zzftjVar;
        this.zza = zzfsiVar;
    }

    public static zzftk zzb(int i) {
        return new zzftk(new zzftg(4000));
    }

    public static zzftk zzc(zzfsj zzfsjVar) {
        return new zzftk(new zzfte(zzfsjVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new zzfth(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
