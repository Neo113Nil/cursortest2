package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class G7 implements ProtobufConverter {
    public final Ge a;

    /* JADX WARN: Multi-variable type inference failed */
    public G7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F7 fromModel(@NotNull I7 i7) {
        F7 f7 = new F7();
        Long l = i7.a;
        if (l != null) {
            f7.a = l.longValue();
        }
        Long l2 = i7.b;
        if (l2 != null) {
            f7.b = l2.longValue();
        }
        Boolean bool = i7.c;
        if (bool != null) {
            f7.c = this.a.fromModel(bool).intValue();
        }
        return f7;
    }

    public G7(@NotNull Ge ge) {
        this.a = ge;
    }

    public /* synthetic */ G7(Ge ge, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Ge() : ge);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final I7 toModel(@NotNull F7 f7) {
        F7 f72 = new F7();
        long j = f7.a;
        Long valueOf = Long.valueOf(j);
        if (j == f72.a) {
            valueOf = null;
        }
        long j2 = f7.b;
        return new I7(valueOf, j2 != f72.b ? Long.valueOf(j2) : null, this.a.a(f7.c));
    }
}
