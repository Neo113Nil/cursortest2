package o;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class TI {
    public static final C1921su a = new C1921su(EnumC2078vF.i, false);
    public static final C1921su b;
    public static final C1921su c;
    public static final LinkedHashMap d;

    static {
        EnumC2078vF enumC2078vF = EnumC2078vF.j;
        b = new C1921su(enumC2078vF, false);
        c = new C1921su(enumC2078vF, true);
        String concat = "java/lang/".concat("Object");
        String concat2 = "java/util/function/".concat("Predicate");
        String concat3 = "java/util/function/".concat("Function");
        String concat4 = "java/util/function/".concat("Consumer");
        String concat5 = "java/util/function/".concat("BiFunction");
        String concat6 = "java/util/function/".concat("BiConsumer");
        String concat7 = "java/util/function/".concat("UnaryOperator");
        String concat8 = "java/util/".concat("stream/Stream");
        String concat9 = "java/util/".concat("Optional");
        C1745qB c1745qB = new C1745qB(1);
        new C0208Hx(c1745qB, "java/util/".concat("Iterator")).L0("forEachRemaining", new RI(concat4, 0));
        new C0208Hx(c1745qB, "java/lang/".concat("Iterable")).L0("spliterator", new UY(1, 16));
        C0208Hx c0208Hx = new C0208Hx(c1745qB, "java/util/".concat("Collection"));
        c0208Hx.L0("removeIf", new RI(concat2, 6));
        c0208Hx.L0("stream", new RI(concat8, 7));
        c0208Hx.L0("parallelStream", new RI(concat8, 8));
        new C0208Hx(c1745qB, "java/util/".concat("List")).L0("replaceAll", new RI(concat7, 9));
        C0208Hx c0208Hx2 = new C0208Hx(c1745qB, "java/util/".concat("Map"));
        c0208Hx2.L0("forEach", new RI(concat6, 10));
        c0208Hx2.L0("putIfAbsent", new RI(concat, 11));
        c0208Hx2.L0("replace", new RI(concat, 12));
        c0208Hx2.L0("replace", new RI(concat, 13));
        c0208Hx2.L0("replaceAll", new RI(concat5, 14));
        c0208Hx2.L0("compute", new SI(0, concat, concat5));
        c0208Hx2.L0("computeIfAbsent", new SI(1, concat, concat3));
        c0208Hx2.L0("computeIfPresent", new SI(2, concat, concat5));
        c0208Hx2.L0("merge", new SI(3, concat, concat5));
        C0208Hx c0208Hx3 = new C0208Hx(c1745qB, concat9);
        c0208Hx3.L0("empty", new RI(concat9, 15));
        c0208Hx3.L0("of", new SI(4, concat, concat9));
        c0208Hx3.L0("ofNullable", new SI(5, concat, concat9));
        c0208Hx3.L0("get", new RI(concat, 16));
        c0208Hx3.L0("ifPresent", new RI(concat4, 17));
        new C0208Hx(c1745qB, "java/lang/".concat("ref/Reference")).L0("get", new RI(concat, 18));
        new C0208Hx(c1745qB, concat2).L0("test", new RI(concat, 19));
        new C0208Hx(c1745qB, "java/util/function/".concat("BiPredicate")).L0("test", new RI(concat, 20));
        new C0208Hx(c1745qB, concat4).L0("accept", new RI(concat, 1));
        new C0208Hx(c1745qB, concat6).L0("accept", new RI(concat, 2));
        new C0208Hx(c1745qB, concat3).L0("apply", new RI(concat, 3));
        new C0208Hx(c1745qB, concat5).L0("apply", new RI(concat, 4));
        new C0208Hx(c1745qB, "java/util/function/".concat("Supplier")).L0("get", new RI(concat, 5));
        d = c1745qB.a;
    }
}
