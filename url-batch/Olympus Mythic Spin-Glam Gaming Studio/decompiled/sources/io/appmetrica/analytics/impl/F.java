package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* loaded from: classes15.dex */
public final class F {
    public final AdRevenue a;
    public final boolean b;
    public final InterfaceC5708u c;
    public final C5576on d;
    public final C5498ln e;

    public F(AdRevenue adRevenue, boolean z, C5758vn c5758vn, PublicLogger publicLogger) {
        this.a = adRevenue;
        this.b = z;
        this.c = c5758vn;
        this.d = new C5576on(100, "ad revenue strings", publicLogger);
        this.e = new C5498ln(30720, "ad revenue payload", publicLogger);
    }

    public final Pair a() {
        Map linkedHashMap;
        C5656s c5656s = new C5656s();
        int i = 0;
        for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(this.a.adNetwork, new C5812y(c5656s)), TuplesKt.to(this.a.adPlacementId, new C5838z(c5656s)), TuplesKt.to(this.a.adPlacementName, new A(c5656s)), TuplesKt.to(this.a.adUnitId, new B(c5656s)), TuplesKt.to(this.a.adUnitName, new C(c5656s)), TuplesKt.to(this.a.precision, new D(c5656s)), TuplesKt.to(this.a.currency.getCurrencyCode(), new E(c5656s))})) {
            String str = (String) pair.getFirst();
            Function1 function1 = (Function1) pair.getSecond();
            C5576on c5576on = this.d;
            c5576on.getClass();
            String a = c5576on.a(str);
            byte[] stringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] stringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(a);
            function1.invoke(stringToBytesForProtobuf2);
            i += stringToBytesForProtobuf.length - stringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) G.a.get(this.a.adType);
        c5656s.d = num != null ? num.intValue() : 0;
        r rVar = new r();
        BigDecimal bigDecimal = this.a.adRevenue;
        BigInteger bigInteger = P7.a;
        int i2 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(P7.a) <= 0 && unscaledValue.compareTo(P7.b) >= 0) {
                break;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i2++;
        }
        Pair pair2 = TuplesKt.to(Long.valueOf(unscaledValue.longValue()), Integer.valueOf(i2));
        long longValue = ((Number) pair2.getFirst()).longValue();
        int intValue = ((Number) pair2.getSecond()).intValue();
        rVar.a = longValue;
        rVar.b = intValue;
        c5656s.b = rVar;
        Map<String, String> map = this.a.payload;
        InterfaceC5708u interfaceC5708u = this.c;
        if (map == null || (linkedHashMap = MapsKt.toMutableMap(map)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        String b = Cb.b(interfaceC5708u.a(linkedHashMap));
        C5498ln c5498ln = this.e;
        c5498ln.getClass();
        byte[] stringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(c5498ln.a(b));
        c5656s.k = stringToBytesForProtobuf3;
        int length = (StringUtils.stringToBytesForProtobuf(b).length - stringToBytesForProtobuf3.length) + i;
        if (this.b) {
            EnumC5682t[] enumC5682tArr = EnumC5682t.a;
            c5656s.a = "autocollected".getBytes(Charsets.UTF_8);
        }
        return TuplesKt.to(MessageNano.toByteArray(c5656s), Integer.valueOf(length));
    }
}
