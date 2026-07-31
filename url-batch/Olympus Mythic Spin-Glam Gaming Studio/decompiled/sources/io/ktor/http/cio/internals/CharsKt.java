package io.ktor.http.cio.internals;

import io.ktor.http.HttpMethod;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: Chars.kt */
/* loaded from: classes8.dex */
public abstract class CharsKt {
    private static final AsciiCharTree DefaultHttpMethods = AsciiCharTree.Companion.build(HttpMethod.Companion.getDefaultMethods(), new Function1() { // from class: io.ktor.http.cio.internals.CharsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            int DefaultHttpMethods$lambda$0;
            DefaultHttpMethods$lambda$0 = CharsKt.DefaultHttpMethods$lambda$0((HttpMethod) obj);
            return Integer.valueOf(DefaultHttpMethods$lambda$0);
        }
    }, new Function2() { // from class: io.ktor.http.cio.internals.CharsKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            char DefaultHttpMethods$lambda$1;
            DefaultHttpMethods$lambda$1 = CharsKt.DefaultHttpMethods$lambda$1((HttpMethod) obj, ((Integer) obj2).intValue());
            return Character.valueOf(DefaultHttpMethods$lambda$1);
        }
    });
    private static final byte[] HexLetterTable;
    private static final long[] HexTable;

    public static /* synthetic */ int hashCodeLowerCase$default(CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = charSequence.length();
        }
        return hashCodeLowerCase(charSequence, i, i2);
    }

    public static final int hashCodeLowerCase(CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int i3 = 0;
        while (i < i2) {
            int charAt = charSequence.charAt(i);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            i3 = (i3 * 31) + charAt;
            i++;
        }
        return i3;
    }

    public static final boolean equalsLowerCase(CharSequence charSequence, int i, int i2, CharSequence other) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 - i != other.length()) {
            return false;
        }
        for (int i3 = i; i3 < i2; i3++) {
            int charAt = charSequence.charAt(i3);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            int charAt2 = other.charAt(i3 - i);
            if (65 <= charAt2 && charAt2 < 91) {
                charAt2 += 32;
            }
            if (charAt != charAt2) {
                return false;
            }
        }
        return true;
    }

    static {
        long j;
        IntRange intRange = new IntRange(0, 255);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator it = intRange.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            if (48 > nextInt || nextInt >= 58) {
                long j2 = nextInt;
                long j3 = 97;
                if (j2 < 97 || j2 > 102) {
                    j3 = 65;
                    if (j2 < 65 || j2 > 70) {
                        j = -1;
                    }
                }
                j = (j2 - j3) + 10;
            } else {
                j = nextInt - 48;
            }
            arrayList.add(Long.valueOf(j));
        }
        HexTable = CollectionsKt.toLongArray(arrayList);
        IntRange intRange2 = new IntRange(0, 15);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange2, 10));
        Iterator it2 = intRange2.iterator();
        while (it2.hasNext()) {
            int nextInt2 = ((IntIterator) it2).nextInt();
            arrayList2.add(Byte.valueOf((byte) (nextInt2 < 10 ? nextInt2 + 48 : (char) (((char) (nextInt2 + 97)) - '\n'))));
        }
        HexLetterTable = CollectionsKt.toByteArray(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int DefaultHttpMethods$lambda$0(HttpMethod it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getValue().length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final char DefaultHttpMethods$lambda$1(HttpMethod m, int i) {
        Intrinsics.checkNotNullParameter(m, "m");
        return m.getValue().charAt(i);
    }

    public static final long parseDecLong(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length > 19) {
            numberFormatException(charSequence);
        }
        if (length == 19) {
            return parseDecLongWithCheck(charSequence);
        }
        long j = 0;
        for (int i = 0; i < length; i++) {
            long charAt = charSequence.charAt(i) - 48;
            if (charAt < 0 || charAt > 9) {
                numberFormatException(charSequence, i);
            }
            j = (j << 3) + (j << 1) + charAt;
        }
        return j;
    }

    private static final long parseDecLongWithCheck(CharSequence charSequence) {
        int length = charSequence.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            long charAt = charSequence.charAt(i) - 48;
            if (charAt < 0 || charAt > 9) {
                numberFormatException(charSequence, i);
            }
            j = (j << 3) + (j << 1) + charAt;
            if (j < 0) {
                numberFormatException(charSequence);
            }
        }
        return j;
    }

    private static final void numberFormatException(CharSequence charSequence, int i) {
        throw new NumberFormatException("Invalid number: " + ((Object) charSequence) + ", wrong digit: " + charSequence.charAt(i) + " at position " + i);
    }

    private static final void numberFormatException(CharSequence charSequence) {
        throw new NumberFormatException("Invalid number " + ((Object) charSequence) + ": too large for Long type");
    }
}
