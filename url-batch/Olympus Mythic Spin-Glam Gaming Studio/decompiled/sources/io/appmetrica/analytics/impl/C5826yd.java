package io.appmetrica.analytics.impl;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.yd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5826yd implements InterfaceC5417ik {
    public final Ol a;
    public final String b;
    public final SystemTimeProvider c;
    public final List d;
    public final String e;
    public final long f;

    public C5826yd(@NotNull Ol ol, @NotNull String str, @NotNull SystemTimeProvider systemTimeProvider, @NotNull List<C5748vd> list) {
        this.a = ol;
        this.b = str;
        this.c = systemTimeProvider;
        this.d = list;
        this.e = str.toUpperCase(Locale.ROOT) + "_STATUS";
        this.f = TimeUnit.DAYS.toMillis(1L);
    }

    @Nullable
    public final C5392hk a() {
        Nd nd;
        C5748vd c5748vd;
        if (this.d.isEmpty()) {
            return null;
        }
        List sortedWith = CollectionsKt.sortedWith(this.d, new C5800xd());
        String a = ((Sd) this.a).a(this.e, (String) null);
        if (a != null) {
            try {
                JSONObject jSONObject = new JSONObject(a);
                JSONArray jSONArray = jSONObject.getJSONArray("modulesStatus");
                IntRange until = RangesKt.until(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
                Iterator it = until.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(((IntIterator) it).nextInt());
                    try {
                        c5748vd = new C5748vd(jSONObject2.getString("moduleName"), jSONObject2.getBoolean(X3.i.r));
                    } catch (Throwable unused) {
                        c5748vd = new C5748vd("", false);
                    }
                    arrayList.add(c5748vd);
                }
                nd = new Nd(arrayList, jSONObject.getLong("lastSendTime"));
            } catch (Throwable unused2) {
                nd = new Nd(CollectionsKt.emptyList(), 0L);
            }
        } else {
            nd = null;
        }
        long currentTimeMillis = this.c.currentTimeMillis();
        if (nd != null && currentTimeMillis - nd.b <= this.f && Intrinsics.areEqual(sortedWith, nd.a)) {
            return null;
        }
        Nd nd2 = new Nd(sortedWith, currentTimeMillis);
        Ol ol = this.a;
        Sd sd = (Sd) ol;
        sd.d(sd.g(this.e), nd2.a());
        return new C5392hk(this.b + "_status", nd2.a());
    }

    public /* synthetic */ C5826yd(Ol ol, String str, SystemTimeProvider systemTimeProvider, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ol, str, (i & 4) != 0 ? new SystemTimeProvider() : systemTimeProvider, list);
    }
}
