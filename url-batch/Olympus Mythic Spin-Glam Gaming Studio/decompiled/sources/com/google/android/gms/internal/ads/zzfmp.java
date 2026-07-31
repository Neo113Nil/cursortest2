package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzfmp {

    @Nullable
    private final Pattern zza;

    @VisibleForTesting
    public zzfmp() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhU));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.zza = pattern;
    }

    @Nullable
    public final String zza(@Nullable String str) {
        Pattern pattern = this.zza;
        if (pattern == null || str == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}
