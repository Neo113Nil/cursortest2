package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class Yd implements ProtobufConverter {

    @NotNull
    public static final Xd a = new Xd();
    public static final Map b = MapsKt.mapOf(TuplesKt.to(NativeCrashSource.UNKNOWN, 0), TuplesKt.to(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5481l6 fromModel(@NotNull C5308ee c5308ee) {
        C5481l6 c5481l6 = new C5481l6();
        c5481l6.f = 1;
        C5455k6 c5455k6 = new C5455k6();
        c5455k6.a = c5308ee.a;
        C5559o6 c5559o6 = new C5559o6();
        Integer num = (Integer) b.get(c5308ee.b.a);
        if (num != null) {
            c5559o6.a = num.intValue();
        }
        String str = c5308ee.b.b;
        if (str == null) {
            str = "";
        }
        c5559o6.b = str;
        c5455k6.b = c5559o6;
        c5481l6.g = c5455k6;
        return c5481l6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final C5308ee a(@NotNull C5481l6 c5481l6) {
        throw new UnsupportedOperationException();
    }
}
