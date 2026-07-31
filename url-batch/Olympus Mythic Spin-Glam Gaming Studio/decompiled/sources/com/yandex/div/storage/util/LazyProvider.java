package com.yandex.div.storage.util;

import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyProvider.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\bR\u001b\u0010\u0006\u001a\u00028\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/yandex/div/storage/util/LazyProvider;", "T", "Ljavax/inject/Provider;", "init", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "value", "getValue", "()Ljava/lang/Object;", "value$delegate", "Lkotlin/Lazy;", "get", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyProvider<T> implements Provider {

    /* renamed from: value$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy value;

    public LazyProvider(@NotNull Function0 function0) {
        this.value = LazyKt.lazy(function0);
    }

    private final T getValue() {
        return (T) this.value.getValue();
    }

    @Override // javax.inject.Provider
    public T get() {
        return getValue();
    }
}
