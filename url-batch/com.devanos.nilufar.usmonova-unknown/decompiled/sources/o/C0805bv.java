package o;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: o.bv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0805bv {
    public static final LinkedHashSet a = WQ.o(C1097gL.z0("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
    public static final LinkedHashSet b;
    public static final LinkedHashSet c;
    public static final LinkedHashSet d;
    public static final LinkedHashSet e;
    public static final LinkedHashSet f;

    static {
        List<EnumC1791qv> K = AbstractC0868ct.K(EnumC1791qv.BOOLEAN, EnumC1791qv.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC1791qv enumC1791qv : K) {
            String b2 = enumC1791qv.e().f().b();
            AbstractC0048Bt.m(b2, "it.wrapperFqName.shortName().asString()");
            AbstractC1048fc.f0(linkedHashSet, C1097gL.u0(b2, enumC1791qv.i + "Value()" + enumC1791qv.c()));
        }
        b = WQ.n(WQ.n(WQ.n(WQ.n(WQ.n(WQ.n(linkedHashSet, C1097gL.z0("List", "sort(Ljava/util/Comparator;)V")), C1097gL.u0("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), C1097gL.u0("Double", "isInfinite()Z", "isNaN()Z")), C1097gL.u0("Float", "isInfinite()Z", "isNaN()Z")), C1097gL.u0("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), C1097gL.u0("CharSequence", "isEmpty()Z"));
        c = WQ.n(WQ.n(WQ.n(WQ.n(WQ.n(WQ.n(C1097gL.u0("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), C1097gL.z0("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), C1097gL.u0("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), C1097gL.u0("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), C1097gL.z0("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), C1097gL.z0("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), C1097gL.z0("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        d = WQ.n(WQ.n(C1097gL.z0("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), C1097gL.z0("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), C1097gL.z0("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        EnumC1791qv enumC1791qv2 = EnumC1791qv.BOOLEAN;
        EnumC1791qv enumC1791qv3 = EnumC1791qv.BYTE;
        List K2 = AbstractC0868ct.K(enumC1791qv2, enumC1791qv3, EnumC1791qv.DOUBLE, EnumC1791qv.FLOAT, enumC1791qv3, EnumC1791qv.INT, EnumC1791qv.LONG, EnumC1791qv.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = K2.iterator();
        while (it.hasNext()) {
            String b3 = ((EnumC1791qv) it.next()).e().f().b();
            AbstractC0048Bt.m(b3, "it.wrapperFqName.shortName().asString()");
            String[] W = C1097gL.W("Ljava/lang/String;");
            AbstractC1048fc.f0(linkedHashSet2, C1097gL.u0(b3, (String[]) Arrays.copyOf(W, W.length)));
        }
        String[] W2 = C1097gL.W("D");
        LinkedHashSet n = WQ.n(linkedHashSet2, C1097gL.u0("Float", (String[]) Arrays.copyOf(W2, W2.length)));
        String[] W3 = C1097gL.W("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        e = WQ.n(n, C1097gL.u0("String", (String[]) Arrays.copyOf(W3, W3.length)));
        String[] W4 = C1097gL.W("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f = C1097gL.u0("Throwable", (String[]) Arrays.copyOf(W4, W4.length));
    }
}
