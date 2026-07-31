package io.appmetrica.analytics.impl;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mobilefuse.sdk.MobileFuseDefaults;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* renamed from: io.appmetrica.analytics.impl.e8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5302e8 {
    public final W a;
    public final C5529n2 b;

    public C5302e8(W w, C5529n2 c5529n2) {
        this.a = w;
        this.b = c5529n2;
    }

    public final String a() {
        byte[] bArr;
        AdTrackingInfoResult yandex = this.a.getIdentifiers().getYandex();
        if (!yandex.isValid()) {
            String id = this.b.getAppSetId().getId();
            if (id != null && id.length() != 0) {
                try {
                    UUID.fromString(id);
                    if (!Intrinsics.areEqual(id, MobileFuseDefaults.ADVERTISING_ID_ZEROS)) {
                        return StringsKt.replace$default(id, "-", "", false, 4, (Object) null);
                    }
                } catch (Throwable unused) {
                }
            }
            return StringsKt.replace$default(UUID.randomUUID().toString(), "-", "", false, 4, (Object) null).toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        Intrinsics.checkNotNull(adTrackingInfo);
        String str = adTrackingInfo.advId;
        Intrinsics.checkNotNull(str);
        try {
            bArr = MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes(Charsets.UTF_8));
        } catch (NoSuchAlgorithmException unused2) {
            bArr = new byte[0];
        }
        return StringUtils.toHexString(bArr);
    }

    public C5302e8() {
        this(Ka.k().c(), Ka.k().d());
    }
}
