package com.vungle.ads.internal.signals;

import com.vungle.ads.internal.model.r3;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;

/* loaded from: classes11.dex */
public final class d extends Lambda implements Function0 {
    public final /* synthetic */ j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar) {
        super(0);
        this.a = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        Json json;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("unclosedad: ");
        json = this.a.b;
        List c = this.a.b().c();
        KSerializer serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(r3.class))));
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        a.append(json.encodeToString(serializer, c));
        return a.toString();
    }
}
