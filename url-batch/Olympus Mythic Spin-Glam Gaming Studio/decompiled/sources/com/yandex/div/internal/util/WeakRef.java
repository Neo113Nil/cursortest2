package com.yandex.div.internal.util;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0005J&\u0010\b\u001a\u0004\u0018\u00018\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0096\u0002¢\u0006\u0002\u0010\fJ.\u0010\r\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0010R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/internal/util/WeakRef;", "T", "Lkotlin/properties/ReadWriteProperty;", "", "obj", "(Ljava/lang/Object;)V", "weakReference", "Ljava/lang/ref/WeakReference;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class WeakRef<T> implements ReadWriteProperty {

    @Nullable
    private WeakReference<T> weakReference;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WeakRef() {
        this(r0, 1, r0);
        DefaultConstructorMarker defaultConstructorMarker = null;
    }

    public WeakRef(@Nullable T t) {
        this.weakReference = t != null ? new WeakReference<>(t) : null;
    }

    public /* synthetic */ WeakRef(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    @Nullable
    public T getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
        WeakReference<T> weakReference = this.weakReference;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @Nullable T value) {
        this.weakReference = value != null ? new WeakReference<>(value) : null;
    }
}
