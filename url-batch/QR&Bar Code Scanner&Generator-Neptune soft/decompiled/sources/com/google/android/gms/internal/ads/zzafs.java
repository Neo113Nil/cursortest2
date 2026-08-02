package com.google.android.gms.internal.ads;

import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzafs {
    /* JADX WARN: Removed duplicated region for block: B:5:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UUID zza(byte[] bArr) {
        zzafr zzafrVar;
        UUID uuid;
        zzef zzefVar = new zzef(bArr);
        if (zzefVar.zzd() >= 32) {
            zzefVar.zzF(0);
            if (zzefVar.zze() == zzefVar.zza() + 4 && zzefVar.zze() == 1886614376) {
                int zze = zzaex.zze(zzefVar.zze());
                if (zze > 1) {
                    zzdw.zze("PsshAtomUtil", "Unsupported pssh version: " + zze);
                } else {
                    UUID uuid2 = new UUID(zzefVar.zzr(), zzefVar.zzr());
                    if (zze == 1) {
                        zzefVar.zzG(zzefVar.zzn() * 16);
                    }
                    int zzn = zzefVar.zzn();
                    if (zzn == zzefVar.zza()) {
                        byte[] bArr2 = new byte[zzn];
                        zzefVar.zzB(bArr2, 0, zzn);
                        zzafrVar = new zzafr(uuid2, zze, bArr2);
                        if (zzafrVar != null) {
                            return null;
                        }
                        uuid = zzafrVar.zza;
                        return uuid;
                    }
                }
            }
        }
        zzafrVar = null;
        if (zzafrVar != null) {
        }
    }
}
