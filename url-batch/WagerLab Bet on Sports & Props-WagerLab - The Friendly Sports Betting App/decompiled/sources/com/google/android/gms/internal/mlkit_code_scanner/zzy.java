package com.google.android.gms.internal.mlkit_code_scanner;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-code-scanner@@16.1.0 */
/* loaded from: classes5.dex */
final class zzy extends zzr {
    static final zzr zza = new zzy(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    private zzy(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    static zzy zzg(int i, Object[] objArr, zzq zzqVar) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        zzi.zza(obj, obj2);
        return new zzy(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020 A[RETURN] */
    @Override // com.google.android.gms.internal.mlkit_code_scanner.zzr, java.util.Map
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        Object[] objArr = this.zzb;
        int i = this.zzc;
        if (obj != null && i == 1) {
            Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
                if (obj2 != null) {
                    return null;
                }
                return obj2;
            }
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_code_scanner.zzr
    final zzl zza() {
        return new zzx(this.zzb, 1, this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_code_scanner.zzr
    final zzs zzd() {
        return new zzv(this, this.zzb, 0, this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_code_scanner.zzr
    final zzs zze() {
        return new zzw(this, new zzx(this.zzb, 0, this.zzc));
    }
}
