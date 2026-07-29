package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzasd {
    public static final zzasd zza = new zzasa();

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzasb zzd(int i, zzasb zzasbVar, boolean z);

    public abstract zzasc zze(int i, zzasc zzascVar, boolean z, long j);

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if ((zzc() - 1) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzf(int i, zzasb zzasbVar, zzasc zzascVar, int i2) {
        zzd(i, zzasbVar, false);
        zzg(0, zzascVar, false);
        int i3 = 1;
        if (i != 0) {
            return i + 1;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException();
                }
            }
            i3 = 0;
        } else if (zzc() - 1 == 0) {
            i3 = -1;
        }
        if (i3 == -1) {
            return -1;
        }
        zzg(i3, zzascVar, false);
        return 0;
    }

    public final zzasc zzg(int i, zzasc zzascVar, boolean z) {
        return zze(i, zzascVar, false, 0L);
    }

    public final boolean zzh() {
        return zzc() == 0;
    }
}
