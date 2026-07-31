package com.yandex.div.internal.util;

import com.yandex.div.core.annotations.InternalApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConvertUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¢\u0006\u0002\u0010\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"toBoolean", "", "", "(D)Ljava/lang/Boolean;", "", "(I)Ljava/lang/Boolean;", "", "(Ljava/lang/Number;)Ljava/lang/Boolean;", "utils_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ConvertUtilsKt {
    @InternalApi
    @Nullable
    public static final Boolean toBoolean(@NotNull Number number) {
        return number instanceof Double ? toBoolean(number.doubleValue()) : toBoolean(number.intValue());
    }

    @InternalApi
    @Nullable
    public static final Boolean toBoolean(int i) {
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (i != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    private static final Boolean toBoolean(double d) {
        if (d == 0.0d) {
            return Boolean.FALSE;
        }
        if (d == 1.0d) {
            return Boolean.TRUE;
        }
        return null;
    }
}
