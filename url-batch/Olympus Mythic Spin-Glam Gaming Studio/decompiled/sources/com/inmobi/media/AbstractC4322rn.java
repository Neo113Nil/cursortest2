package com.inmobi.media;

import androidx.media3.common.MediaLibraryInfo;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.rn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4322rn {
    public static final void a(String str) {
        try {
            Class.forName("androidx.media3.exoplayer.ExoPlayerImpl");
            if (str == null || str.length() == 0) {
                return;
            }
            String str2 = null;
            try {
                String str3 = MediaLibraryInfo.TAG;
                Field declaredField = MediaLibraryInfo.class.getDeclaredField("VERSION");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                String str4 = obj instanceof String ? (String) obj : null;
                if (str4 != null) {
                    if (!StringsKt.isBlank(str4)) {
                        str2 = str4;
                    }
                }
            } catch (Throwable unused) {
            }
            if (str2 == null) {
                throw new Ig(8800);
            }
            C4082ij b = b(str2);
            if (b == null) {
                throw new Ig(8802);
            }
            C4082ij b2 = b(str);
            if (b2 == null) {
                throw new Ig(8803);
            }
            int i = b.a;
            int i2 = b2.a;
            if (i >= i2) {
                if (i != i2 || b.b > b2.b) {
                    throw new Ig(8804);
                }
            }
        } catch (ClassNotFoundException unused2) {
            throw new Ig(8800);
        }
    }

    public static final C4082ij b(String str) {
        List split$default = StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 3, 2, (Object) null);
        if (split$default.size() < 2) {
            return null;
        }
        int c = c((String) split$default.get(0));
        int c2 = c((String) split$default.get(1));
        int c3 = split$default.size() >= 3 ? c((String) split$default.get(2)) : 0;
        if (c < 0 || c2 < 0) {
            return null;
        }
        return new C4082ij(c, c2, c3);
    }

    public static final int c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!Character.isDigit(str.charAt(i))) {
                str = str.substring(0, i);
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                break;
            }
            i++;
        }
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }
}
