package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.d7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4606d7 {

    /* renamed from: com.ironsource.d7$a */
    public static final class a implements ReadWriteProperty {

        @NotNull
        private WeakReference<T> a;

        a(T t) {
            this.a = new WeakReference<>(t);
        }

        @NotNull
        public final WeakReference<T> a() {
            return this.a;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Object] */
        @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
        @Nullable
        public T getValue(@NotNull Object thisRef, @NotNull KProperty<?> property) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            return this.a.get();
        }

        @Override // kotlin.properties.ReadWriteProperty
        public void setValue(@NotNull Object thisRef, @NotNull KProperty<?> property, @Nullable T t) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            this.a = new WeakReference<>(t);
        }

        public final void a(@NotNull WeakReference<T> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.a = weakReference;
        }
    }

    public static /* synthetic */ ReadWriteProperty a(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    @NotNull
    public static final <T> ReadWriteProperty a(@Nullable T t) {
        return new a(t);
    }
}
