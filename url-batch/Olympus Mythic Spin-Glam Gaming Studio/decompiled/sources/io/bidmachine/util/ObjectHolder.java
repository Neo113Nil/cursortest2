package io.bidmachine.util;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* compiled from: ObjectHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Lio/bidmachine/util/ObjectHolder;", "T", "", "obj", "(Ljava/lang/Object;)V", "getObj", "()Ljava/lang/Object;", "setObj", "Ljava/lang/Object;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ObjectHolder<T> {

    @Nullable
    private T obj;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ObjectHolder() {
        this(r0, 1, r0);
        DefaultConstructorMarker defaultConstructorMarker = null;
    }

    public ObjectHolder(@Nullable T t) {
        this.obj = t;
    }

    public /* synthetic */ ObjectHolder(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }

    @Nullable
    public final T getObj() {
        return this.obj;
    }

    public final void setObj(@Nullable T t) {
        this.obj = t;
    }
}
