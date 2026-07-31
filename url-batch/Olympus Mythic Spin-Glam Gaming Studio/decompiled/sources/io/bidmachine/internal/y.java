package io.bidmachine.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public enum y {
    STRICT(0),
    MODERATE(1),
    OPEN(2);

    public static final a b = new a(null);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y a(Integer num) {
            for (y yVar : y.values()) {
                int b = yVar.b();
                if (num != null && b == num.intValue()) {
                    return yVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    y(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }

    public static final y a(Integer num) {
        return b.a(num);
    }
}
