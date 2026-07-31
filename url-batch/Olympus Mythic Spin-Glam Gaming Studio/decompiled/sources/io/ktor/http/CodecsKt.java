package io.ktor.http;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.B5;
import io.ktor.utils.io.charsets.EncodingKt;
import io.ktor.utils.io.core.BufferKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.CharRange;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.io.Buffer;
import kotlinx.io.Source;

/* compiled from: Codecs.kt */
/* loaded from: classes13.dex */
public abstract class CodecsKt {
    private static final Set ATTRIBUTE_CHARACTERS;
    private static final Set HEX_ALPHABET;
    private static final List SPECIAL_SYMBOLS;
    private static final Set URL_ALPHABET;
    private static final Set URL_ALPHABET_CHARS;
    private static final List URL_PROTOCOL_PART;
    private static final Set VALID_PATH_PART;

    private static final int charToHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        if ('a' > c || c >= 'g') {
            return -1;
        }
        return c - 'W';
    }

    private static final char hexDigitToChar(int i) {
        return (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48);
    }

    static {
        List plus = CollectionsKt.plus((Collection) CollectionsKt.plus(new CharRange('a', 'z'), new CharRange('A', 'Z')), (Iterable) new CharRange('0', '9'));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(plus, 10));
        Iterator it = plus.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        URL_ALPHABET = CollectionsKt.toSet(arrayList);
        URL_ALPHABET_CHARS = CollectionsKt.toSet(CollectionsKt.plus((Collection) CollectionsKt.plus(new CharRange('a', 'z'), new CharRange('A', 'Z')), (Iterable) new CharRange('0', '9')));
        HEX_ALPHABET = CollectionsKt.toSet(CollectionsKt.plus((Collection) CollectionsKt.plus(new CharRange('a', 'f'), new CharRange('A', 'F')), (Iterable) new CharRange('0', '9')));
        Set of = SetsKt.setOf((Object[]) new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', Character.valueOf(B5.U), '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(of, 10));
        Iterator it2 = of.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        URL_PROTOCOL_PART = arrayList2;
        VALID_PATH_PART = SetsKt.setOf((Object[]) new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', Character.valueOf(B5.U), '-', '.', '_', '~'});
        ATTRIBUTE_CHARACTERS = SetsKt.plus(URL_ALPHABET_CHARS, (Iterable) SetsKt.setOf((Object[]) new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        List listOf = CollectionsKt.listOf((Object[]) new Character[]{'-', '.', '_', '~'});
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOf, 10));
        Iterator it3 = listOf.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        SPECIAL_SYMBOLS = arrayList3;
    }

    public static /* synthetic */ String encodeURLQueryComponent$default(String str, boolean z, boolean z2, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            charset = Charsets.UTF_8;
        }
        return encodeURLQueryComponent(str, z, z2, charset);
    }

    public static final String encodeURLQueryComponent(String str, final boolean z, final boolean z2, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        final StringBuilder sb = new StringBuilder();
        CharsetEncoder newEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(newEncoder, "newEncoder(...)");
        forEach(EncodingKt.encode$default(newEncoder, str, 0, 0, 6, null), new Function1() { // from class: io.ktor.http.CodecsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit encodeURLQueryComponent$lambda$4$lambda$3;
                encodeURLQueryComponent$lambda$4$lambda$3 = CodecsKt.encodeURLQueryComponent$lambda$4$lambda$3(z2, sb, z, ((Byte) obj).byteValue());
                return encodeURLQueryComponent$lambda$4$lambda$3;
            }
        });
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit encodeURLQueryComponent$lambda$4$lambda$3(boolean z, StringBuilder sb, boolean z2, byte b) {
        if (b == 32) {
            if (z) {
                sb.append('+');
            } else {
                sb.append("%20");
            }
        } else if (URL_ALPHABET.contains(Byte.valueOf(b)) || (!z2 && URL_PROTOCOL_PART.contains(Byte.valueOf(b)))) {
            sb.append((char) b);
        } else {
            sb.append(percentEncode(b));
        }
        return Unit.INSTANCE;
    }

    public static final String encodeURLPathPart(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return encodeURLPath$default(str, true, false, 2, null);
    }

    public static /* synthetic */ String encodeURLPath$default(String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return encodeURLPath(str, z, z2);
    }

    public static final String encodeURLPath(String str, boolean z, boolean z2) {
        int i;
        Intrinsics.checkNotNullParameter(str, "<this>");
        final StringBuilder sb = new StringBuilder();
        Charset charset = Charsets.UTF_8;
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if ((!z && charAt == '/') || URL_ALPHABET_CHARS.contains(Character.valueOf(charAt)) || VALID_PATH_PART.contains(Character.valueOf(charAt))) {
                sb.append(charAt);
                i2++;
            } else {
                if (!z2 && charAt == '%' && (i = i2 + 2) < str.length()) {
                    Set set = HEX_ALPHABET;
                    int i3 = i2 + 1;
                    if (set.contains(Character.valueOf(str.charAt(i3))) && set.contains(Character.valueOf(str.charAt(i)))) {
                        sb.append(charAt);
                        sb.append(str.charAt(i3));
                        sb.append(str.charAt(i));
                        i2 += 3;
                    }
                }
                int i4 = CharsKt.isSurrogate(charAt) ? 2 : 1;
                CharsetEncoder newEncoder = charset.newEncoder();
                Intrinsics.checkNotNullExpressionValue(newEncoder, "newEncoder(...)");
                int i5 = i4 + i2;
                forEach(EncodingKt.encode(newEncoder, str, i2, i5), new Function1() { // from class: io.ktor.http.CodecsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit encodeURLPath$lambda$6$lambda$5;
                        encodeURLPath$lambda$6$lambda$5 = CodecsKt.encodeURLPath$lambda$6$lambda$5(sb, ((Byte) obj).byteValue());
                        return encodeURLPath$lambda$6$lambda$5;
                    }
                });
                i2 = i5;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit encodeURLPath$lambda$6$lambda$5(StringBuilder sb, byte b) {
        sb.append(percentEncode(b));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String encodeURLParameter$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return encodeURLParameter(str, z);
    }

    public static final String encodeURLParameter(String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        final StringBuilder sb = new StringBuilder();
        CharsetEncoder newEncoder = Charsets.UTF_8.newEncoder();
        Intrinsics.checkNotNullExpressionValue(newEncoder, "newEncoder(...)");
        forEach(EncodingKt.encode$default(newEncoder, str, 0, 0, 6, null), new Function1() { // from class: io.ktor.http.CodecsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit encodeURLParameter$lambda$8$lambda$7;
                encodeURLParameter$lambda$8$lambda$7 = CodecsKt.encodeURLParameter$lambda$8$lambda$7(sb, z, ((Byte) obj).byteValue());
                return encodeURLParameter$lambda$8$lambda$7;
            }
        });
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit encodeURLParameter$lambda$8$lambda$7(StringBuilder sb, boolean z, byte b) {
        if (URL_ALPHABET.contains(Byte.valueOf(b)) || SPECIAL_SYMBOLS.contains(Byte.valueOf(b))) {
            sb.append((char) b);
        } else if (z && b == 32) {
            sb.append('+');
        } else {
            sb.append(percentEncode(b));
        }
        return Unit.INSTANCE;
    }

    public static final String encodeURLParameterValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return encodeURLParameter(str, true);
    }

    public static /* synthetic */ String decodeURLQueryComponent$default(String str, int i, int i2, boolean z, Charset charset, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            charset = Charsets.UTF_8;
        }
        return decodeURLQueryComponent(str, i, i2, z, charset);
    }

    public static final String decodeURLQueryComponent(String str, int i, int i2, boolean z, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return decodeScan(str, i, i2, z, charset);
    }

    public static /* synthetic */ String decodeURLPart$default(String str, int i, int i2, Charset charset, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            charset = Charsets.UTF_8;
        }
        return decodeURLPart(str, i, i2, charset);
    }

    public static final String decodeURLPart(String str, int i, int i2, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return decodeScan(str, i, i2, false, charset);
    }

    private static final String decodeScan(String str, int i, int i2, boolean z, Charset charset) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (z && charAt == '+')) {
                return decodeImpl(str, i, i2, i3, z, charset);
            }
        }
        if (i == 0 && i2 == str.length()) {
            return str.toString();
        }
        String substring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        throw new io.ktor.http.URLDecodeException("Wrong HEX escape: %" + r8.charAt(r3) + r8.charAt(r13) + ", in " + ((java.lang.Object) r8) + ", at " + r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String decodeImpl(CharSequence charSequence, int i, int i2, int i3, boolean z, Charset charset) {
        int i4;
        int i5 = i2 - i;
        if (i5 > 255) {
            i5 /= 3;
        }
        StringBuilder sb = new StringBuilder(i5);
        if (i3 > i) {
            sb.append(charSequence, i, i3);
        }
        byte[] bArr = null;
        loop0: while (i3 < i2) {
            char charAt = charSequence.charAt(i3);
            if (z && charAt == '+') {
                sb.append(' ');
            } else if (charAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(i2 - i3) / 3];
                }
                int i6 = 0;
                while (true) {
                    i4 = i6;
                    if (i3 >= i2 || charSequence.charAt(i3) != '%') {
                        break;
                    }
                    int i7 = i3 + 2;
                    if (i7 >= i2) {
                        throw new URLDecodeException("Incomplete trailing HEX escape: " + charSequence.subSequence(i3, charSequence.length()).toString() + ", in " + ((Object) charSequence) + " at " + i3);
                    }
                    int i8 = i3 + 1;
                    int charToHexDigit = charToHexDigit(charSequence.charAt(i8));
                    int charToHexDigit2 = charToHexDigit(charSequence.charAt(i7));
                    if (charToHexDigit == -1 || charToHexDigit2 == -1) {
                        break loop0;
                    }
                    i6 = i4 + 1;
                    bArr[i4] = (byte) ((charToHexDigit * 16) + charToHexDigit2);
                    i3 += 3;
                }
                sb.append(StringsKt.decodeToString$default(bArr, 0, i4, false, 4, null));
            } else {
                sb.append(charAt);
            }
            i3++;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final String percentEncode(byte b) {
        return StringsKt.concatToString(new char[]{'%', hexDigitToChar((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4), hexDigitToChar(b & 15)});
    }

    private static final void forEach(Source source, final Function1 function1) {
        ByteReadPacketKt.takeWhile(source, new Function1() { // from class: io.ktor.http.CodecsKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean forEach$lambda$11;
                forEach$lambda$11 = CodecsKt.forEach$lambda$11(Function1.this, (Buffer) obj);
                return Boolean.valueOf(forEach$lambda$11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean forEach$lambda$11(Function1 function1, Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        while (BufferKt.canRead(buffer)) {
            function1.invoke(Byte.valueOf(buffer.readByte()));
        }
        return true;
    }
}
