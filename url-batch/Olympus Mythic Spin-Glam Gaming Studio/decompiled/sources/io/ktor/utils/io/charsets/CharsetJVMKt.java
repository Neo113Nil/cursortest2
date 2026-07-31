package io.ktor.utils.io.charsets;

import io.ktor.utils.io.core.ByteReadPacketKt;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.io.ByteStringsKt;
import kotlinx.io.Sink;
import kotlinx.io.Source;
import kotlinx.io.Utf8Kt;
import kotlinx.io.bytestring.ByteStringJvmExtKt;

/* compiled from: CharsetJVM.kt */
/* loaded from: classes14.dex */
public abstract class CharsetJVMKt {
    public static final Charset forName(Charsets charsets, String name) {
        Intrinsics.checkNotNullParameter(charsets, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Charset forName = Charset.forName(name);
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        return forName;
    }

    public static final String getName(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        String name = charset.name();
        Intrinsics.checkNotNullExpressionValue(name, "name(...)");
        return name;
    }

    public static final byte[] encodeToByteArray(CharsetEncoder charsetEncoder, CharSequence input, int i, int i2) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof String) {
            if (i == 0) {
                String str = (String) input;
                if (i2 == str.length()) {
                    byte[] bytes = str.getBytes(charsetEncoder.charset());
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    return bytes;
                }
            }
            String substring = ((String) input).substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes2 = substring.getBytes(charsetEncoder.charset());
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            return bytes2;
        }
        return encodeToByteArraySlow(charsetEncoder, input, i, i2);
    }

    private static final byte[] encodeToByteArraySlow(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2) {
        ByteBuffer encode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i, i2));
        byte[] bArr = null;
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            byte[] array = encode.array();
            if (array.length == encode.remaining()) {
                bArr = array;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[encode.remaining()];
        encode.get(bArr2);
        return bArr2;
    }

    public static final int encodeImpl(CharsetEncoder charsetEncoder, CharSequence input, int i, int i2, Sink dst) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        byte[] encodeToByteArray = encodeToByteArray(charsetEncoder, input, i, i2);
        Sink.write$default(dst, encodeToByteArray, 0, 0, 6, null);
        return encodeToByteArray.length;
    }

    public static final Charset getCharset(CharsetDecoder charsetDecoder) {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Charset charset = charsetDecoder.charset();
        Intrinsics.checkNotNull(charset);
        return charset;
    }

    public static final int decode(CharsetDecoder charsetDecoder, Source input, Appendable dst, int i) {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        if (Intrinsics.areEqual(getCharset(charsetDecoder), Charsets.UTF_8)) {
            String readString = Utf8Kt.readString(input);
            dst.append(readString);
            return readString.length();
        }
        long remaining = ByteReadPacketKt.getRemaining(input);
        dst.append(ByteStringJvmExtKt.decodeToString(ByteStringsKt.readByteString(input), getCharset(charsetDecoder)));
        return (int) remaining;
    }
}
