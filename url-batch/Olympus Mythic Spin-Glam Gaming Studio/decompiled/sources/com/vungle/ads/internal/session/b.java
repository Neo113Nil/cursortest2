package com.vungle.ads.internal.session;

import android.content.Context;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.internal.executor.d;
import com.vungle.ads.internal.model.r3;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.m;
import com.vungle.ads.internal.util.n;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;

/* loaded from: classes14.dex */
public final class b {
    public static final Json f = JsonKt.Json$default(null, a.a, 1, null);
    public final String a;
    public final com.vungle.ads.internal.executor.a b;
    public File c;
    public final CopyOnWriteArrayList d;
    public boolean e;

    public b(Context context, String sessionId, com.vungle.ads.internal.executor.a executors, PathProvider pathProvider) {
        Object m8023constructorimpl;
        boolean m8029isSuccessimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(executors, "executors");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.a = sessionId;
        this.b = executors;
        this.c = pathProvider.b();
        this.d = new CopyOnWriteArrayList();
        if (this.c.exists()) {
            m8029isSuccessimpl = true;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(Boolean.valueOf(this.c.createNewFile()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
            if (m8026exceptionOrNullimpl != null) {
                boolean z = u.a;
                StringBuilder a = l.a("Fail to create unclosed ad file: ");
                a.append(m8026exceptionOrNullimpl.getMessage());
                t.b("UnclosedAdDetector", a.toString());
            }
            m8029isSuccessimpl = Result.m8029isSuccessimpl(m8023constructorimpl);
        }
        this.e = m8029isSuccessimpl;
    }

    public final void a(r3 ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        if (this.e) {
            ad.a(this.a);
            this.d.add(ad);
            a(this.d);
        }
    }

    public final void b(r3 ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        if (this.e && this.d.contains(ad)) {
            this.d.remove(ad);
            a(this.d);
        }
    }

    public final List a() {
        if (!this.e) {
            return CollectionsKt.emptyList();
        }
        return (List) new com.vungle.ads.internal.executor.b(((d) this.b).c().submit(new Callable() { // from class: com.vungle.ads.internal.session.b$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return b.a(b.this);
            }
        })).get(1000L, TimeUnit.MILLISECONDS);
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        if (!this.e) {
            return arrayList;
        }
        List a = a();
        if (a != null) {
            arrayList.addAll(a);
        }
        ((d) this.b).a.execute(new Runnable() { // from class: com.vungle.ads.internal.session.b$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                b.b(b.this);
            }
        });
        return arrayList;
    }

    public static final void b(b this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            n.b(this$0.c);
        } catch (Exception e) {
            boolean z = u.a;
            StringBuilder a = l.a("Fail to delete file ");
            a.append(e.getMessage());
            t.b("UnclosedAdDetector", a.toString());
        }
    }

    public static final List a(b this$0) {
        List arrayList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            m mVar = n.a;
            String d = n.d(this$0.c);
            if (d != null && d.length() != 0) {
                Json json = f;
                KSerializer serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(r3.class))));
                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                arrayList = (List) json.decodeFromString(serializer, d);
                return arrayList;
            }
            arrayList = new ArrayList();
            return arrayList;
        } catch (Exception e) {
            boolean z = u.a;
            StringBuilder a = l.a("Fail to read unclosed ad file ");
            a.append(e.getMessage());
            t.b("UnclosedAdDetector", a.toString());
            return new ArrayList();
        }
    }

    public final void a(CopyOnWriteArrayList copyOnWriteArrayList) {
        if (this.e) {
            try {
                Json json = f;
                KSerializer serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(r3.class))));
                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                final String encodeToString = json.encodeToString(serializer, copyOnWriteArrayList);
                ((d) this.b).c().execute(new Runnable() { // from class: com.vungle.ads.internal.session.b$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.a(b.this, encodeToString);
                    }
                });
            } catch (Throwable th) {
                boolean z = u.a;
                StringBuilder a = l.a("Fail to write unclosed ad file ");
                a.append(th.getMessage());
                t.b("UnclosedAdDetector", a.toString());
            }
        }
    }

    public static final void a(b this$0, String jsonContent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(jsonContent, "$jsonContent");
        m mVar = n.a;
        n.a(this$0.c, jsonContent);
    }
}
