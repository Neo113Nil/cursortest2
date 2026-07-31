package com.inmobi.media;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* loaded from: classes12.dex */
public final class Ka {
    public final CoroutineScope a;
    public final String b;
    public final Map c;

    public Ka(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.a = coroutineScope;
        this.b = Ka.class.getSimpleName();
        this.c = Collections.synchronizedMap(new LinkedHashMap());
    }

    public final void a(final String id, Function2 block) {
        final Job launch$default;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(block, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new Ja(block, null), 3, null);
        Map jobMap = this.c;
        Intrinsics.checkNotNullExpressionValue(jobMap, "jobMap");
        Object obj = jobMap.get(id);
        if (obj == null) {
            obj = new CopyOnWriteArrayList();
            jobMap.put(id, obj);
        }
        ((List) obj).add(launch$default);
        launch$default.invokeOnCompletion(new Function1() { // from class: com.inmobi.media.Ka$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Ka.a(Ka.this, id, launch$default, (Throwable) obj2);
            }
        });
    }

    public static final Unit a(Ka ka, String str, Job job, Throwable th) {
        String tag = ka.b;
        Intrinsics.checkNotNullExpressionValue(tag, "tag");
        List list = (List) ka.c.get(str);
        if (list != null) {
            list.remove(job);
        }
        return Unit.INSTANCE;
    }
}
