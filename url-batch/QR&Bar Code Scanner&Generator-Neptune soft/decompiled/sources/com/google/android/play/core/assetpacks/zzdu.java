package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes2.dex */
final class zzdu {
    private static final com.google.android.play.core.internal.zzag zza = new com.google.android.play.core.internal.zzag("MergeSliceTaskHandler");
    private final zzbh zzb;

    zzdu(zzbh zzbhVar) {
        this.zzb = zzbhVar;
    }

    private static void zzb(File file, File file2) {
        if (!file.isDirectory()) {
            if (file2.exists()) {
                throw new zzck("File clashing with existing file from other slice: ".concat(file2.toString()));
            }
            if (file.renameTo(file2)) {
                return;
            }
            String valueOf = String.valueOf(file);
            String.valueOf(valueOf).length();
            throw new zzck("Unable to move file: ".concat(String.valueOf(valueOf)));
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            zzb(file3, new File(file2, file3.getName()));
        }
        if (file.delete()) {
            return;
        }
        String valueOf2 = String.valueOf(file);
        String.valueOf(valueOf2).length();
        throw new zzck("Unable to delete directory: ".concat(String.valueOf(valueOf2)));
    }

    public final void zza(zzdt zzdtVar) {
        File zzq = this.zzb.zzq(zzdtVar.zzl, zzdtVar.zza, zzdtVar.zzb, zzdtVar.zzc);
        if (!zzq.exists()) {
            throw new zzck(String.format("Cannot find verified files for slice %s.", zzdtVar.zzc), zzdtVar.zzk);
        }
        File zzj = this.zzb.zzj(zzdtVar.zzl, zzdtVar.zza, zzdtVar.zzb);
        if (!zzj.exists()) {
            zzj.mkdirs();
        }
        zzb(zzq, zzj);
        try {
            this.zzb.zzA(zzdtVar.zzl, zzdtVar.zza, zzdtVar.zzb, this.zzb.zzb(zzdtVar.zzl, zzdtVar.zza, zzdtVar.zzb) + 1);
        } catch (IOException e) {
            zza.zzb("Writing merge checkpoint failed with %s.", e.getMessage());
            throw new zzck("Writing merge checkpoint failed.", e, zzdtVar.zzk);
        }
    }
}
