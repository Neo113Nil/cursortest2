package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaeq {
    /* JADX WARN: Removed duplicated region for block: B:5:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UUID zza(byte[] bArr) {
        zzaep zzaepVar;
        UUID uuid;
        zzdy zzdyVar = new zzdy(bArr);
        if (zzdyVar.zzd() >= 32) {
            zzdyVar.zzF(0);
            if (zzdyVar.zze() == zzdyVar.zza() + 4 && zzdyVar.zze() == 1886614376) {
                int zze = zzadw.zze(zzdyVar.zze());
                if (zze > 1) {
                    Log.w("PsshAtomUtil", "Unsupported pssh version: " + zze);
                } else {
                    UUID uuid2 = new UUID(zzdyVar.zzr(), zzdyVar.zzr());
                    if (zze == 1) {
                        zzdyVar.zzG(zzdyVar.zzn() * 16);
                    }
                    int zzn = zzdyVar.zzn();
                    if (zzn == zzdyVar.zza()) {
                        byte[] bArr2 = new byte[zzn];
                        zzdyVar.zzB(bArr2, 0, zzn);
                        zzaepVar = new zzaep(uuid2, zze, bArr2);
                        if (zzaepVar != null) {
                            return null;
                        }
                        uuid = zzaepVar.zza;
                        return uuid;
                    }
                }
            }
        }
        zzaepVar = null;
        if (zzaepVar != null) {
        }
    }
}
