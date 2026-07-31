package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
public final class zzgh implements zzgx {
    public static final zzgh zza = new zzgh();

    private zzgh() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num = (Integer) zza3;
        if (num == null) {
            throw new zzce(4, 5, null);
        }
        int intValue = num.intValue();
        try {
            zzgdVar.zzc().zze(i, zza2 instanceof String ? String.valueOf(((String) zza2).charAt(intValue)) : zza2 instanceof List ? ((List) zza2).get(intValue) : Array.get(zza2, intValue));
        } catch (Exception e) {
            if (!(e instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzce(4, 23, e);
            }
            throw new zzce(4, 22, e);
        }
    }
}
