package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.d4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5273d4 extends C5326f6 {
    public HashMap q;
    public C5576on r;
    public C5498ln s;
    public C5498ln t;
    public C5582p3 u;
    public C5576on v;

    @VisibleForTesting
    public C5273d4(@NonNull PublicLogger publicLogger) {
        this("", "", 0, 0, publicLogger);
    }

    public static C5326f6 b(String str, String str2) {
        C5326f6 c5326f6 = new C5326f6("", 0);
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        c5326f6.d = 5376;
        c5326f6.a(str, str2);
        return c5326f6;
    }

    public static C5326f6 n() {
        C5326f6 c5326f6 = new C5326f6("", 0);
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        c5326f6.d = 5632;
        return c5326f6;
    }

    public static C5326f6 o() {
        C5326f6 c5326f6 = new C5326f6("", 0);
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        c5326f6.d = 40961;
        return c5326f6;
    }

    public final void a(String str, String str2, EnumC5247c4 enumC5247c4) {
        if (StringUtils.equalsNullSafety(str, str2)) {
            this.q.remove(enumC5247c4);
        } else {
            this.q.put(enumC5247c4, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        }
        Iterator it = this.q.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Integer) it.next()).intValue();
        }
        this.g = i;
    }

    @Override // io.appmetrica.analytics.impl.C5326f6
    public final void c(@Nullable String str) {
        C5576on c5576on = this.v;
        c5576on.getClass();
        this.h = c5576on.a(str);
    }

    public final String d(String str) {
        C5576on c5576on = this.r;
        c5576on.getClass();
        String a = c5576on.a(str);
        a(str, a, EnumC5247c4.NAME);
        return a;
    }

    public final String e(String str) {
        C5498ln c5498ln = this.s;
        c5498ln.getClass();
        String a = c5498ln.a(str);
        a(str, a, EnumC5247c4.VALUE);
        return a;
    }

    public final C5273d4 f(@NonNull String str) {
        C5498ln c5498ln = this.t;
        c5498ln.getClass();
        String a = c5498ln.a(str);
        a(str, a, EnumC5247c4.VALUE);
        this.b = a;
        return this;
    }

    @NonNull
    public final HashMap<EnumC5247c4, Integer> p() {
        return this.q;
    }

    @Override // io.appmetrica.analytics.impl.C5326f6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(@Nullable String str) {
        this.a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.C5326f6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(@Nullable String str) {
        this.b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.C5326f6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(@Nullable byte[] bArr) {
        a(bArr);
    }

    public C5273d4(String str, int i, @NonNull PublicLogger publicLogger) {
        this("", str, i, publicLogger);
    }

    public C5273d4(String str, String str2, int i, @NonNull PublicLogger publicLogger) {
        this(str, str2, i, 0, publicLogger);
    }

    public C5273d4(int i, @NonNull PublicLogger publicLogger, long j) {
        this("", "", i, publicLogger);
        b(j);
    }

    public C5273d4(byte[] bArr, @Nullable String str, int i, @NonNull PublicLogger publicLogger) {
        this.q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.a = d(str);
        setType(i);
    }

    public final C5273d4 a(@NonNull HashMap<EnumC5247c4, Integer> hashMap) {
        this.q = hashMap;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.r = new C5576on(1000, "event name", publicLogger);
        this.s = new C5498ln(245760, "event value", publicLogger);
        this.t = new C5498ln(1024000, "event extended value", publicLogger);
        this.u = new C5582p3(245760, "event value bytes", publicLogger);
        this.v = new C5576on(200, "user profile id", publicLogger);
    }

    public final void a(byte[] bArr) {
        C5582p3 c5582p3 = this.u;
        c5582p3.getClass();
        byte[] a = c5582p3.a(bArr);
        EnumC5247c4 enumC5247c4 = EnumC5247c4.VALUE;
        if (bArr.length != a.length) {
            this.q.put(enumC5247c4, Integer.valueOf(bArr.length - a.length));
        } else {
            this.q.remove(enumC5247c4);
        }
        Iterator it = this.q.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Integer) it.next()).intValue();
        }
        this.g = i;
        super.setValueBytes(a);
    }

    public static C5326f6 a(@NonNull Ao ao) {
        C5326f6 o = o();
        o.setValue(new String(Base64.encode(MessageNano.toByteArray(ao), 0)));
        return o;
    }

    public static C5273d4 a(PublicLogger publicLogger, C5262cj c5262cj) {
        int i;
        C5273d4 c5273d4 = new C5273d4(publicLogger);
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        c5273d4.d = 40976;
        C5210aj c5210aj = new C5210aj();
        c5210aj.b = c5262cj.a.currency.getCurrencyCode().getBytes();
        c5210aj.f = c5262cj.a.priceMicros;
        c5210aj.c = StringUtils.stringToBytesForProtobuf(new C5576on(200, "revenue productID", c5262cj.e).a(c5262cj.a.productID));
        c5210aj.a = ((Integer) WrapUtils.getOrDefault(c5262cj.a.quantity, 1)).intValue();
        C5498ln c5498ln = c5262cj.b;
        String str = c5262cj.a.payload;
        c5498ln.getClass();
        c5210aj.d = StringUtils.stringToBytesForProtobuf(c5498ln.a(str));
        if (Do.a(c5262cj.a.receipt)) {
            Vi vi = new Vi();
            String str2 = (String) c5262cj.c.a(c5262cj.a.receipt.data);
            i = !StringUtils.equalsNullSafety(c5262cj.a.receipt.data, str2) ? c5262cj.a.receipt.data.length() : 0;
            String str3 = (String) c5262cj.d.a(c5262cj.a.receipt.signature);
            vi.a = StringUtils.stringToBytesForProtobuf(str2);
            vi.b = StringUtils.stringToBytesForProtobuf(str3);
            c5210aj.e = vi;
        } else {
            i = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(c5210aj), Integer.valueOf(i));
        c5273d4.b = c5273d4.e(new String(Base64.encode((byte[]) pair.first, 0)));
        c5273d4.g = ((Integer) pair.second).intValue();
        return c5273d4;
    }

    public C5273d4(byte[] bArr, @Nullable String str, int i, @NonNull PublicLogger publicLogger, long j) {
        this(bArr, str, i, publicLogger);
        b(j);
    }

    public C5273d4(String str, String str2, int i, int i2, @NonNull PublicLogger publicLogger) {
        this.q = new HashMap();
        a(publicLogger);
        this.b = e(str);
        this.a = d(str2);
        setType(i);
        setCustomType(i2);
    }

    public static C5273d4 a(PublicLogger publicLogger, F f) {
        C5273d4 c5273d4 = new C5273d4(publicLogger);
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        c5273d4.d = 40977;
        kotlin.Pair a = f.a();
        c5273d4.b = c5273d4.e(new String(Base64.encode((byte[]) a.getFirst(), 0)));
        c5273d4.g = ((Integer) a.getSecond()).intValue();
        return c5273d4;
    }
}
