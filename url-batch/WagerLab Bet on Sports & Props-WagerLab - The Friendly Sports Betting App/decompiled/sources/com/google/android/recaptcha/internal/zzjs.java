package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
abstract class zzjs implements zzjw {
    zzjs() {
    }

    @Override // com.google.android.recaptcha.internal.zzjw
    public final zzjv zza(CharSequence charSequence, Charset charset) {
        zzjx zzb = zzb();
        byte[] bytes = charSequence.toString().getBytes(charset);
        bytes.getClass();
        ((zzjr) zzb).zza(bytes, 0, bytes.length);
        return zzb.zzb();
    }
}
