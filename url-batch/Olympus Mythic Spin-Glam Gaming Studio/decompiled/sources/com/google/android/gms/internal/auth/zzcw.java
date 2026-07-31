package com.google.android.gms.internal.auth;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes4.dex */
final class zzcw extends zzdc {
    zzcw(zzcz zzczVar, String str, Boolean bool, boolean z) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.zzc() + ": " + ((String) obj));
        return null;
    }
}
