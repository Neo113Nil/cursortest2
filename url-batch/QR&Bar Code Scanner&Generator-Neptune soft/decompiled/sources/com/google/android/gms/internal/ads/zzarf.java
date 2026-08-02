package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzarf extends zzarq {
    public zzarf(zzaqe zzaqeVar, String str, String str2, zzamk zzamkVar, int i, int i2) {
        super(zzaqeVar, "WepZYnT/MXyJE28LKN26NT6D3mAA2J2spDFApE1ixrQxTNXRg7wshW7BC/EU90LT", "sjYkfzJTuYKxh1jvZaP9n5dx9JGmzJotOUC/vdvgi4M=", zzamkVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzarq
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzamk zzamkVar = this.zze;
            if (true == booleanValue) {
                i = 2;
            }
            zzamkVar.zzae(i);
        } catch (InvocationTargetException unused) {
            this.zze.zzae(3);
        }
    }
}
