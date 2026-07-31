package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public class zzgxz<K, V> extends zzgxu<K, V> implements zzgyu<K, V> {
    private final transient zzgxw<V> emptySet;
    private transient zzgxw zza;

    zzgxz(zzgxp zzgxpVar, int i, Comparator comparator) {
        super(zzgxpVar, i);
        this.emptySet = zzgzn.zza;
    }

    public final zzgxw zza() {
        zzgxw zzgxwVar = this.zza;
        if (zzgxwVar != null) {
            return zzgxwVar;
        }
        zzgxy zzgxyVar = new zzgxy(this);
        this.zza = zzgxyVar;
        return zzgxyVar;
    }
}
