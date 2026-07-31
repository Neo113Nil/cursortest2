package com.composables.core.androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScatterSet.kt */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0007\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b\u001a\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b\u001a\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u0002H\b¢\u0006\u0002\u0010\u000b\u001a'\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u0002H\b2\u0006\u0010\f\u001a\u0002H\b¢\u0006\u0002\u0010\r\u001a/\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u0002H\b2\u0006\u0010\f\u001a\u0002H\b2\u0006\u0010\u000e\u001a\u0002H\b¢\u0006\u0002\u0010\u000f\u001a+\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\b0\u0011\"\u0002H\b¢\u0006\u0002\u0010\u0012\u001a\u0012\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\u0004\b\u0000\u0010\b\u001a\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u0002H\b¢\u0006\u0002\u0010\u0014\u001a'\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u0002H\b2\u0006\u0010\f\u001a\u0002H\b¢\u0006\u0002\u0010\u0015\u001a/\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u0002H\b2\u0006\u0010\f\u001a\u0002H\b2\u0006\u0010\u000e\u001a\u0002H\b¢\u0006\u0002\u0010\u0016\u001a+\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\u0004\b\u0000\u0010\b2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\b0\u0011\"\u0002H\b¢\u0006\u0002\u0010\u0017\"\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000*\u001c\u0010\u0000\u001a\u0004\b\u0000\u0010\u0001\"\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0002¨\u0006\u0018"}, d2 = {"ObjectList", "T", "", "EmptyScatterSet", "Lcom/composables/core/androidx/collection/MutableScatterSet;", "", "emptyScatterSet", "Lcom/composables/core/androidx/collection/ScatterSet;", ExifInterface.LONGITUDE_EAST, "scatterSetOf", "element1", "(Ljava/lang/Object;)Lcom/composables/core/androidx/collection/ScatterSet;", "element2", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/composables/core/androidx/collection/ScatterSet;", "element3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/composables/core/androidx/collection/ScatterSet;", "elements", "", "([Ljava/lang/Object;)Lcom/composables/core/androidx/collection/ScatterSet;", "mutableScatterSetOf", "(Ljava/lang/Object;)Lcom/composables/core/androidx/collection/MutableScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/composables/core/androidx/collection/MutableScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/composables/core/androidx/collection/MutableScatterSet;", "([Ljava/lang/Object;)Lcom/composables/core/androidx/collection/MutableScatterSet;", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScatterSetKt {
    private static final MutableScatterSet<Object> EmptyScatterSet = new MutableScatterSet<>(0);

    public static final <E> ScatterSet<E> emptyScatterSet() {
        MutableScatterSet<Object> mutableScatterSet = EmptyScatterSet;
        Intrinsics.checkNotNull(mutableScatterSet, "null cannot be cast to non-null type com.composables.core.androidx.collection.ScatterSet<E of com.composables.core.androidx.collection.ScatterSetKt.emptyScatterSet>");
        return mutableScatterSet;
    }

    public static final <E> ScatterSet<E> scatterSetOf() {
        MutableScatterSet<Object> mutableScatterSet = EmptyScatterSet;
        Intrinsics.checkNotNull(mutableScatterSet, "null cannot be cast to non-null type com.composables.core.androidx.collection.ScatterSet<E of com.composables.core.androidx.collection.ScatterSetKt.scatterSetOf>");
        return mutableScatterSet;
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e) {
        return mutableScatterSetOf(e);
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e, E e2) {
        return mutableScatterSetOf(e, e2);
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e, E e2, E e3) {
        return mutableScatterSetOf(e, e2, e3);
    }

    public static final <E> ScatterSet<E> scatterSetOf(E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableScatterSet mutableScatterSet = new MutableScatterSet(elements.length);
        mutableScatterSet.plusAssign((Object[]) elements);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf() {
        return new MutableScatterSet<>(0, 1, null);
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(1);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e, E e2) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(2);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e2);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e, E e2, E e3) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(3);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e2);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e3);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(elements.length);
        mutableScatterSet.plusAssign((Object[]) elements);
        return mutableScatterSet;
    }
}
