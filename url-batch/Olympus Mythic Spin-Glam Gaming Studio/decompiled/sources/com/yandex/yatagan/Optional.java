package com.yandex.yatagan;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Optional.kt */
/* loaded from: classes3.dex */
public final class Optional {
    public static final Companion Companion = new Companion(null);
    private static final Optional Empty = new Optional(null);
    private final Object value;

    public /* synthetic */ Optional(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }

    private Optional(Object obj) {
        this.value = obj;
    }

    public final Object get() {
        Object obj = this.value;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final Object orNull() {
        return this.value;
    }

    public final boolean isPresent() {
        return this.value != null;
    }

    /* compiled from: Optional.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Optional of(Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Optional(value, null);
        }

        public final Optional empty() {
            return Optional.Empty;
        }
    }
}
