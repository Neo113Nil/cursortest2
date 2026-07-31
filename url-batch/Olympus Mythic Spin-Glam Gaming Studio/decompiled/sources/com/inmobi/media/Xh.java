package com.inmobi.media;

import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class Xh {
    public final Context a;
    public final long b;
    public final int c;
    public boolean d;
    public final Pb e;
    public final C3922cj f;
    public final List g;
    public final ConcurrentHashMap h;
    public final AtomicBoolean i;
    public String j;
    public final AtomicInteger k;

    public Xh(Context context, double d, Nb logLevel, long j, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.a = context;
        this.b = j;
        this.c = i;
        this.d = false;
        this.e = new Pb(logLevel);
        this.f = new C3922cj(d);
        this.g = Collections.synchronizedList(new ArrayList());
        this.h = new ConcurrentHashMap();
        this.i = new AtomicBoolean(false);
        this.j = "";
        this.k = new AtomicInteger(0);
    }

    public final void a(Nb logLevel, String tag, String message) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.i.get()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = Qb.a;
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", logLevel.name());
        jSONObject.put("timestamp", Qb.a.format(new Date()));
        jSONObject.put("tag", tag);
        jSONObject.put("data", message);
        CoroutineScope coroutineScope = AbstractC3995fc.a;
        AbstractC3967ec.a(new Vh(this, logLevel, jSONObject, null));
    }

    public final void b() {
        Objects.toString(this.i);
        if ((this.d || this.f.a()) && !this.i.getAndSet(true)) {
            CoroutineScope coroutineScope = AbstractC3995fc.a;
            AbstractC3967ec.a(new Uh(this, null));
        }
    }

    public final String c() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (this.h) {
            try {
                for (Map.Entry entry : this.h.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        jSONObject.put("vitals", jSONObject2);
        jSONObject.put(CreativeInfo.f, d());
        String jSONObject3 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    public final JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        List logData = this.g;
        Intrinsics.checkNotNullExpressionValue(logData, "logData");
        synchronized (logData) {
            try {
                List logData2 = this.g;
                Intrinsics.checkNotNullExpressionValue(logData2, "logData");
                Iterator it = logData2.iterator();
                while (it.hasNext()) {
                    jSONArray.put((JSONObject) it.next());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONArray;
    }

    public final boolean e() {
        if (this.g.isEmpty() || this.h.isEmpty()) {
            return true;
        }
        String c = c();
        Intrinsics.checkNotNullParameter(c, "<this>");
        return Intrinsics.areEqual(c, JsonUtils.EMPTY_JSON);
    }

    public final void b(boolean z) {
        Objects.toString(this.i);
        if (this.i.get()) {
            return;
        }
        this.d = z;
    }

    public final void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Objects.toString(this.i);
        if (this.i.get()) {
            return;
        }
        this.h.put(key, value);
    }

    public final void a() {
        Objects.toString(this.i);
        if ((this.d || this.f.a()) && !this.i.get()) {
            CoroutineScope coroutineScope = AbstractC3995fc.a;
            AbstractC3967ec.a(new Th(this, null));
        }
    }

    public final void a(final boolean z) {
        Objects.toString(this.i);
        CoroutineScope coroutineScope = AbstractC3995fc.a;
        if (Result.m8026exceptionOrNullimpl(AbstractC3967ec.a(new Function0() { // from class: com.inmobi.media.Xh$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Xh.a(Xh.this, z);
            }
        })) != null) {
            try {
                Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    public static final Unit a(Xh xh, boolean z) {
        if (xh.e()) {
            return Unit.INSTANCE;
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (xh.j.length() == 0) {
            CoroutineScope coroutineScope = AbstractC3995fc.a;
            xh.j = AbstractC3967ec.a(xh.a, timeInMillis);
        }
        if (xh.a(xh.j)) {
            BuildersKt__BuildersKt.runBlocking$default(null, new Wh(xh, timeInMillis, z, null), 1, null);
        }
        return Unit.INSTANCE;
    }

    public final boolean a(String str) {
        return AbstractC4023gc.a("RemoteLogger", c(), str);
    }
}
