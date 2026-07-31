package io.bidmachine.internal;

import io.bidmachine.util.UtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;

/* loaded from: classes12.dex */
public final class v {
    private final Lazy a;

    static final class a extends Lambda implements Function0 {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final byte[] mo4828invoke() {
            byte[] bytes = this.a.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
    }

    public v(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.a = LazyKt.lazy(new a(key));
    }

    private final byte[] a() {
        return (byte[]) this.a.getValue();
    }

    public final String a(byte[] input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (a().length == 0 || input.length == 0) {
            return "";
        }
        byte[] bArr = new byte[input.length];
        int length = input.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (input[i] ^ a()[i % a().length]);
        }
        String encodeToStringBase64$default = UtilsKt.encodeToStringBase64$default(bArr, 0, 1, null);
        return encodeToStringBase64$default == null ? "" : encodeToStringBase64$default;
    }
}
