package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
abstract class zzful implements zzfwj {

    @CheckForNull
    private transient Set zza;

    @CheckForNull
    private transient Collection zzb;

    @CheckForNull
    private transient Map zzc;

    zzful() {
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfwj) {
            return zzu().equals(((zzfwj) obj).zzu());
        }
        return false;
    }

    public final int hashCode() {
        return zzu().hashCode();
    }

    public final String toString() {
        return zzu().toString();
    }

    abstract Collection zzi();

    Iterator zzj() {
        throw null;
    }

    abstract Map zzm();

    abstract Set zzo();

    @Override // com.google.android.gms.internal.ads.zzfwj
    public boolean zzs(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    public final Collection zzt() {
        Collection collection = this.zzb;
        if (collection != null) {
            return collection;
        }
        Collection zzi = zzi();
        this.zzb = zzi;
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzfwj
    public final Map zzu() {
        Map map = this.zzc;
        if (map != null) {
            return map;
        }
        Map zzm = zzm();
        this.zzc = zzm;
        return zzm;
    }

    public final Set zzv() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set zzo = zzo();
        this.zza = zzo;
        return zzo;
    }
}
