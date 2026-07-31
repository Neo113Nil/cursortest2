package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class oa {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long a = (long) (Math.floor(Math.random() * 4294967295L) + 1);

    public static boolean a(iu iuVar) {
        return iuVar == null || iuVar.a();
    }

    public static Bitmap a(String str) {
        try {
            String substring = str.substring(StringsKt.indexOf$default((CharSequence) str, StringUtils.COMMA, 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (substring.length() <= 0) {
                return null;
            }
            byte[] decode = Base64.decode(substring, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final boolean a(Context context) {
        return yn3.a(context) != null;
    }
}
