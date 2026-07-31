package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.w4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4435w4 {
    public final String a = C4435w4.class.getSimpleName();

    public final Il a(C4143l2 configResponseObj, C4382u4 configRequestContext) {
        Integer num;
        Intrinsics.checkNotNullParameter(configResponseObj, "configResponseObj");
        Intrinsics.checkNotNullParameter(configRequestContext, "configRequestContext");
        int b = configResponseObj.b();
        Config config = configRequestContext.b;
        if (b == 200) {
            try {
                Config a = configResponseObj.a();
                if (a == null) {
                    String tag = this.a;
                    Intrinsics.checkNotNullExpressionValue(tag, "tag");
                    num = 3;
                } else if (a.isValid()) {
                    num = null;
                } else {
                    String tag2 = this.a;
                    Intrinsics.checkNotNullExpressionValue(tag2, "tag");
                    num = 4;
                }
                if (num != null) {
                    b = num.intValue();
                } else {
                    if (a == null) {
                        throw new IllegalArgumentException("Config object is null");
                    }
                    config = a;
                }
            } catch (IllegalArgumentException unused) {
                b = 2;
            }
        } else if (b != 304) {
            String tag3 = this.a;
            Intrinsics.checkNotNullExpressionValue(tag3, "tag");
            b += 1000;
        } else {
            String tag4 = this.a;
            Intrinsics.checkNotNullExpressionValue(tag4, "tag");
            configRequestContext.b.getType();
        }
        return new Il(b, config);
    }
}
