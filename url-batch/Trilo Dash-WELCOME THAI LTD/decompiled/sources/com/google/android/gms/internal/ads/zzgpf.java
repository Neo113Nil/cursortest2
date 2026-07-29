package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public class zzgpf implements Iterator, Closeable, zzakp {
    private static final zzako zza = new zzgpe("eof ");
    private static final zzgpm zzb = zzgpm.zzb(zzgpf.class);
    protected zzakl zzc;
    protected zzgpg zzd;
    zzako zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List zzh = new ArrayList();

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzako zzakoVar = this.zze;
        if (zzakoVar == zza) {
            return false;
        }
        if (zzakoVar != null) {
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
            sb.append(((zzako) this.zzh.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.Iterator
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzako next() {
        zzako zzb2;
        zzako zzakoVar = this.zze;
        if (zzakoVar != null && zzakoVar != zza) {
            this.zze = null;
            return zzakoVar;
        }
        zzgpg zzgpgVar = this.zzd;
        if (zzgpgVar == null || this.zzf >= this.zzg) {
            this.zze = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzgpgVar) {
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
        return (this.zzd == null || this.zze == zza) ? this.zzh : new zzgpl(this.zzh, this);
    }

    public final void zzf(zzgpg zzgpgVar, long j, zzakl zzaklVar) throws IOException {
        this.zzd = zzgpgVar;
        this.zzf = zzgpgVar.zzb();
        zzgpgVar.zze(zzgpgVar.zzb() + j);
        this.zzg = zzgpgVar.zzb();
        this.zzc = zzaklVar;
    }
}
