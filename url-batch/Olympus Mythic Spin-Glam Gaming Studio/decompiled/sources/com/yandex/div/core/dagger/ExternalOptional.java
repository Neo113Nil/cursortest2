package com.yandex.div.core.dagger;

import com.yandex.yatagan.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExternalOptional.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001\bB\u0015\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/dagger/ExternalOptional;", "T", "", "optional", "Lcom/yandex/yatagan/Optional;", "(Lcom/yandex/yatagan/Optional;)V", "getOptional", "()Lcom/yandex/yatagan/Optional;", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ExternalOptional<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Optional optional;

    @NotNull
    public static final <T> ExternalOptional<T> empty() {
        return INSTANCE.empty();
    }

    @NotNull
    public static final <T> ExternalOptional<T> of(@NotNull T t) {
        return INSTANCE.of(t);
    }

    @NotNull
    public static final <T> ExternalOptional<T> ofNullable(@Nullable T t) {
        return INSTANCE.ofNullable(t);
    }

    @NotNull
    public static final <T> ExternalOptional<T> wrap(@NotNull Optional optional) {
        return INSTANCE.wrap(optional);
    }

    public ExternalOptional(@NotNull Optional optional) {
        this.optional = optional;
    }

    @NotNull
    public final Optional getOptional() {
        return this.optional;
    }

    /* compiled from: ExternalOptional.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0001\u0010\u0005*\u00020\u0001H\u0007J%\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00012\u0006\u0010\u0007\u001a\u0002H\u0005H\u0007¢\u0006\u0002\u0010\bJ'\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0005H\u0007¢\u0006\u0002\u0010\bJ&\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00050\fH\u0007¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/dagger/ExternalOptional$Companion;", "", "()V", "empty", "Lcom/yandex/div/core/dagger/ExternalOptional;", "T", "of", "value", "(Ljava/lang/Object;)Lcom/yandex/div/core/dagger/ExternalOptional;", "ofNullable", "wrap", "optional", "Lcom/yandex/yatagan/Optional;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final <T> ExternalOptional<T> wrap(@NotNull Optional optional) {
            return new ExternalOptional<>(optional);
        }

        @NotNull
        public final <T> ExternalOptional<T> empty() {
            return new ExternalOptional<>(Optional.Companion.empty());
        }

        @NotNull
        public final <T> ExternalOptional<T> of(@NotNull T value) {
            return new ExternalOptional<>(Optional.Companion.of(value));
        }

        @NotNull
        public final <T> ExternalOptional<T> ofNullable(@Nullable T value) {
            return value != null ? of(value) : empty();
        }
    }
}
