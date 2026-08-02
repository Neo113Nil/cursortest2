package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzgwt implements Iterator, Closeable, zzalr {
    private static final zzalq zza = new zzgws("eof ");
    private static final zzgxa zzb = zzgxa.zzb(zzgwt.class);
    protected zzaln zzc;
    protected zzgwu zzd;
    zzalq zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List zzh = new ArrayList();

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzalq zzalqVar = this.zze;
        if (zzalqVar == zza) {
            return false;
        }
        if (zzalqVar != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zzh.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzalq) this.zzh.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.Iterator
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzalq next() {
        zzalq zzb2;
        zzalq zzalqVar = this.zze;
        if (zzalqVar != null && zzalqVar != zza) {
            this.zze = null;
            return zzalqVar;
        }
        zzgwu zzgwuVar = this.zzd;
        if (zzgwuVar == null || this.zzf >= this.zzg) {
            this.zze = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzgwuVar) {
                this.zzd.zze(this.zzf);
                zzb2 = this.zzc.zzb(this.zzd, this);
                this.zzf = this.zzd.zzb();
            }
            return zzb2;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List zze() {
        return (this.zzd == null || this.zze == zza) ? this.zzh : new zzgwz(this.zzh, this);
    }

    public final void zzf(zzgwu zzgwuVar, long j, zzaln zzalnVar) throws IOException {
        this.zzd = zzgwuVar;
        this.zzf = zzgwuVar.zzb();
        zzgwuVar.zze(zzgwuVar.zzb() + j);
        this.zzg = zzgwuVar.zzb();
        this.zzc = zzalnVar;
    }
}
