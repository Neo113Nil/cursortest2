package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.s7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5664s7 implements ProtobufConverter {
    public final Ge a;
    public final A7 b;

    /* JADX WARN: Multi-variable type inference failed */
    public C5664s7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D7 fromModel(@NotNull C5716u7 c5716u7) {
        D7 d7 = new D7();
        Integer num = c5716u7.a;
        if (num != null) {
            d7.a = num.intValue();
        }
        String str = c5716u7.b;
        if (str != null) {
            d7.b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c5716u7.c;
        if (str2 != null) {
            d7.c = StringUtils.correctIllFormedString(str2);
        }
        Long l = c5716u7.d;
        if (l != null) {
            d7.d = l.longValue();
        }
        C5846z7 c5846z7 = c5716u7.e;
        if (c5846z7 != null) {
            d7.e = this.b.fromModel(c5846z7);
        }
        String str3 = c5716u7.f;
        if (str3 != null) {
            d7.f = str3;
        }
        String str4 = c5716u7.g;
        if (str4 != null) {
            d7.g = str4;
        }
        Long l2 = c5716u7.h;
        if (l2 != null) {
            d7.h = l2.longValue();
        }
        Integer num2 = c5716u7.i;
        if (num2 != null) {
            d7.i = num2.intValue();
        }
        Integer num3 = c5716u7.j;
        if (num3 != null) {
            d7.j = num3.intValue();
        }
        String str5 = c5716u7.k;
        if (str5 != null) {
            d7.k = str5;
        }
        EnumC5252c9 enumC5252c9 = c5716u7.l;
        if (enumC5252c9 != null) {
            d7.l = enumC5252c9.a;
        }
        String str6 = c5716u7.m;
        if (str6 != null) {
            d7.m = str6;
        }
        Aa aa = c5716u7.n;
        if (aa != null) {
            d7.n = aa.a;
        }
        G9 g9 = c5716u7.o;
        if (g9 != null) {
            d7.o = g9.a;
        }
        Boolean bool = c5716u7.p;
        if (bool != null) {
            d7.p = this.a.fromModel(bool).intValue();
        }
        Integer num4 = c5716u7.q;
        if (num4 != null) {
            d7.q = num4.intValue();
        }
        byte[] bArr = c5716u7.r;
        if (bArr != null) {
            d7.r = bArr;
        }
        return d7;
    }

    public C5664s7(@NotNull Ge ge, @NotNull A7 a7) {
        this.a = ge;
        this.b = a7;
    }

    public /* synthetic */ C5664s7(Ge ge, A7 a7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Ge() : ge, (i & 2) != 0 ? new A7(null, 1, null) : a7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5716u7 toModel(@NotNull D7 d7) {
        G9 g9;
        D7 d72 = new D7();
        int i = d7.a;
        Integer valueOf = i != d72.a ? Integer.valueOf(i) : null;
        String str = d7.b;
        String str2 = !Intrinsics.areEqual(str, d72.b) ? str : null;
        String str3 = d7.c;
        String str4 = !Intrinsics.areEqual(str3, d72.c) ? str3 : null;
        long j = d7.d;
        Long valueOf2 = j != d72.d ? Long.valueOf(j) : null;
        C5846z7 model = this.b.toModel(d7.e);
        String str5 = d7.f;
        String str6 = !Intrinsics.areEqual(str5, d72.f) ? str5 : null;
        String str7 = d7.g;
        String str8 = !Intrinsics.areEqual(str7, d72.g) ? str7 : null;
        long j2 = d7.h;
        Long valueOf3 = Long.valueOf(j2);
        if (j2 == d72.h) {
            valueOf3 = null;
        }
        int i2 = d7.i;
        Integer valueOf4 = i2 != d72.i ? Integer.valueOf(i2) : null;
        int i3 = d7.j;
        Integer valueOf5 = i3 != d72.j ? Integer.valueOf(i3) : null;
        String str9 = d7.k;
        String str10 = !Intrinsics.areEqual(str9, d72.k) ? str9 : null;
        int i4 = d7.l;
        Integer valueOf6 = Integer.valueOf(i4);
        if (i4 == d72.l) {
            valueOf6 = null;
        }
        EnumC5252c9 a = valueOf6 != null ? EnumC5252c9.a(Integer.valueOf(valueOf6.intValue())) : null;
        String str11 = d7.m;
        String str12 = !Intrinsics.areEqual(str11, d72.m) ? str11 : null;
        int i5 = d7.n;
        Integer valueOf7 = Integer.valueOf(i5);
        if (i5 == d72.n) {
            valueOf7 = null;
        }
        Aa a2 = valueOf7 != null ? Aa.a(Integer.valueOf(valueOf7.intValue())) : null;
        int i6 = d7.o;
        Integer valueOf8 = Integer.valueOf(i6);
        if (i6 == d72.o) {
            valueOf8 = null;
        }
        if (valueOf8 != null) {
            int intValue = valueOf8.intValue();
            G9[] values = G9.values();
            int length = values.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    G9 g92 = values[i7];
                    G9[] g9Arr = values;
                    if (g92.a == intValue) {
                        g9 = g92;
                        break;
                    }
                    i7++;
                    values = g9Arr;
                } else {
                    g9 = G9.NATIVE;
                    break;
                }
            }
        } else {
            g9 = null;
        }
        Boolean a3 = this.a.a(d7.p);
        int i8 = d7.q;
        Integer valueOf9 = i8 != d72.q ? Integer.valueOf(i8) : null;
        byte[] bArr = d7.r;
        return new C5716u7(valueOf, str2, str4, valueOf2, model, str6, str8, valueOf3, valueOf4, valueOf5, str10, a, str12, a2, g9, a3, valueOf9, !Arrays.equals(bArr, d72.r) ? bArr : null);
    }
}
