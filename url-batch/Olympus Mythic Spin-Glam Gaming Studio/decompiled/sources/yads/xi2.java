package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.text.StringsKt;

/* loaded from: classes13.dex */
public final class xi2 {
    public static final Lazy a = LazyKt.lazy(wi2.b);

    public static Bitmap a(String str) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] decode = Base64.decode(StringsKt.removePrefix(str, "data:image/png;base64,"), 0);
            if (!StringsKt.startsWith$default(str, "data:image/png;base64,", false, 2, (Object) null)) {
                decode = decode.length == 0 ? new byte[0] : ArraysKt.plus((byte[]) a.getValue(), decode);
            }
            m8023constructorimpl = Result.m8023constructorimpl(decode.length == 0 ? null : BitmapFactory.decodeByteArray(decode, 0, decode.length));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        return (Bitmap) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }
}
