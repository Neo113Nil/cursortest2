package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzhar {
    public static final FileOutputStream zza(File file, zzgxw zzgxwVar, zzhai zzhaiVar) throws IOException {
        return new FileOutputStream(file, zzgxwVar.contains(zzhaq.APPEND));
    }
}
