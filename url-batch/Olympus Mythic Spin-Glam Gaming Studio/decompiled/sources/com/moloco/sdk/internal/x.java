package com.moloco.sdk.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred
/* loaded from: classes5.dex */
public abstract class x<R, E> {
    public static final int a = 0;

    @StabilityInferred
    public static final class a<R, E> extends x<R, E> {
        public static final int c = 0;
        public final E b;

        public a(E e) {
            super(null);
            this.b = e;
        }

        public final E a() {
            return this.b;
        }
    }

    @StabilityInferred
    public static final class b<R, E> extends x<R, E> {
        public static final int c = 0;
        public final R b;

        public b(R r) {
            super(null);
            this.b = r;
        }

        public final R a() {
            return this.b;
        }
    }

    public /* synthetic */ x(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public x() {
    }
}
