package com.apollographql.apollo.api;

import androidx.exifinterface.media.ExifInterface;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Optional.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a8\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00060\bH\u0007\u001a8\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\t\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00010\t2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00060\bH\u0007¨\u0006\n"}, d2 = {"getOrElse", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/apollographql/apollo/api/Optional;", "fallback", "(Lcom/apollographql/apollo/api/Optional;Ljava/lang/Object;)Ljava/lang/Object;", "map", "R", "mapper", "Lkotlin/Function1;", "Lcom/apollographql/apollo/api/Optional$Present;", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OptionalKt {
    public static final <V> V getOrElse(Optional<? extends V> optional, V v) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional instanceof Optional.Present ? (V) ((Optional.Present) optional).getValue() : v;
    }

    public static final <V, R> Optional<R> map(Optional<? extends V> optional, Function1<? super V, ? extends R> mapper) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        if (optional instanceof Optional.Absent) {
            return Optional.Absent.INSTANCE;
        }
        if (optional instanceof Optional.Present) {
            return Optional.INSTANCE.present(mapper.invoke((Object) ((Optional.Present) optional).getValue()));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <V, R> Optional.Present<R> map(Optional.Present<V> present, Function1<? super V, ? extends R> mapper) {
        Intrinsics.checkNotNullParameter(present, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return Optional.INSTANCE.present(mapper.invoke(present.getValue()));
    }
}
