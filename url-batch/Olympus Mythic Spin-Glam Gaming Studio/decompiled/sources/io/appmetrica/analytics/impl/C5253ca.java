package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5253ca extends AbstractC5208ah {
    public final C5279da b;

    public C5253ca(@NotNull C5532n5 c5532n5, @NotNull TimeProvider timeProvider) {
        super(c5532n5);
        this.b = new C5279da(c5532n5, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NotNull C5326f6 c5326f6) {
        long optLong;
        C5279da c5279da = this.b;
        W9 w9 = c5279da.a.t().B;
        Long valueOf = w9 != null ? Long.valueOf(w9.a) : null;
        if (valueOf != null) {
            Po po = c5279da.a.t;
            synchronized (po) {
                optLong = po.a.a().optLong("external_attribution_window_start", -1L);
            }
            if (optLong < 0) {
                optLong = c5279da.b.currentTimeMillis();
                c5279da.a.t.a(optLong);
            }
            if (c5279da.b.currentTimeMillis() - optLong <= valueOf.longValue()) {
                V9 v9 = (V9) MessageNano.mergeFrom(new V9(), c5326f6.getValueBytes());
                int i = v9.a;
                String str = new String(v9.b, Charsets.UTF_8);
                String str2 = this.b.a.c.k().get(Integer.valueOf(i));
                if (str2 != null) {
                    try {
                        if (JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2))) {
                            this.a.m.info("Ignoring attribution of type `" + AbstractC5330fa.a(i) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                C5279da c5279da2 = this.b;
                Map<Integer, String> k = c5279da2.a.c.k();
                k.put(Integer.valueOf(i), str);
                c5279da2.a.c.b(k);
                this.a.m.info("Handling attribution of type `" + AbstractC5330fa.a(i) + '`', new Object[0]);
                return false;
            }
        }
        this.a.m.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}
