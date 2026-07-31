package io.ktor.utils.io;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LineEndingMode.kt */
/* loaded from: classes13.dex */
public final class LineEndingMode {
    private static final int Any;
    private static final int CR;
    private static final int CRLF;
    public static final Companion Companion = new Companion(null);
    private static final int LF;
    private static final List values;
    private final int mode;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineEndingMode m8010boximpl(int i) {
        return new LineEndingMode(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m8011constructorimpl(int i) {
        return i;
    }

    /* renamed from: contains-lTjpP64, reason: not valid java name */
    public static final boolean m8012containslTjpP64(int i, int i2) {
        return (i2 | i) == i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8013equalsimpl(int i, Object obj) {
        return (obj instanceof LineEndingMode) && i == ((LineEndingMode) obj).m8018unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8014equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8015hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m8013equalsimpl(this.mode, obj);
    }

    public int hashCode() {
        return m8015hashCodeimpl(this.mode);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8018unboximpl() {
        return this.mode;
    }

    private /* synthetic */ LineEndingMode(int i) {
        this.mode = i;
    }

    /* renamed from: plus-1Ter-O4, reason: not valid java name */
    public static final int m8016plus1TerO4(int i, int i2) {
        return m8011constructorimpl(i | i2);
    }

    public String toString() {
        return m8017toStringimpl(this.mode);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8017toStringimpl(int i) {
        if (m8014equalsimpl0(i, CR)) {
            return "CR";
        }
        if (m8014equalsimpl0(i, LF)) {
            return "LF";
        }
        if (m8014equalsimpl0(i, CRLF)) {
            return "CRLF";
        }
        List list = values;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (m8012containslTjpP64(i, ((LineEndingMode) obj).m8018unboximpl())) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }

    /* compiled from: LineEndingMode.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getCR-f0jXZW8, reason: not valid java name */
        public final int m8019getCRf0jXZW8() {
            return LineEndingMode.CR;
        }

        /* renamed from: getLF-f0jXZW8, reason: not valid java name */
        public final int m8021getLFf0jXZW8() {
            return LineEndingMode.LF;
        }

        /* renamed from: getCRLF-f0jXZW8, reason: not valid java name */
        public final int m8020getCRLFf0jXZW8() {
            return LineEndingMode.CRLF;
        }
    }

    static {
        int m8011constructorimpl = m8011constructorimpl(1);
        CR = m8011constructorimpl;
        int m8011constructorimpl2 = m8011constructorimpl(2);
        LF = m8011constructorimpl2;
        int m8011constructorimpl3 = m8011constructorimpl(4);
        CRLF = m8011constructorimpl3;
        Any = m8011constructorimpl(7);
        values = CollectionsKt.listOf((Object[]) new LineEndingMode[]{m8010boximpl(m8011constructorimpl), m8010boximpl(m8011constructorimpl2), m8010boximpl(m8011constructorimpl3)});
    }
}
