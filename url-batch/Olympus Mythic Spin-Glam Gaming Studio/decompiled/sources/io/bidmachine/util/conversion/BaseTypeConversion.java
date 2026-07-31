package io.bidmachine.util.conversion;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseTypeConversion.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0006H$¢\u0006\u0002\u0010\u0007J\u0017\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\bH$¢\u0006\u0002\u0010\tJ#\u0010\n\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\fJ#\u0010\n\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lio/bidmachine/util/conversion/BaseTypeConversion;", "T", "Lio/bidmachine/util/conversion/TypeConversion;", "()V", "to", "value", "", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "(Ljava/lang/String;)Ljava/lang/Object;", "toOrDefault", "fallback", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseTypeConversion<T> implements TypeConversion<T> {
    @Nullable
    protected abstract T to(@NotNull Object value);

    @Nullable
    protected abstract T to(@NotNull String value);

    @Override // io.bidmachine.util.conversion.TypeConversion
    @Nullable
    public T toOrDefault(@Nullable Object value, @Nullable T fallback) {
        T t;
        return (value == null || (t = to(value)) == null) ? fallback : t;
    }

    @Override // io.bidmachine.util.conversion.TypeConversion
    @Nullable
    public T toOrDefault(@Nullable String value, @Nullable T fallback) {
        T t;
        return (value == null || (t = to(value)) == null) ? fallback : t;
    }
}
