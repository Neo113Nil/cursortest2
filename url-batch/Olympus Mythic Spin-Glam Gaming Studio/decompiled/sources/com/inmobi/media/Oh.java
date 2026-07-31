package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes12.dex */
public final class Oh extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Sh c;
    public final /* synthetic */ String d;
    public final /* synthetic */ RootConfig e;
    public final /* synthetic */ ProducerScope f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oh(List list, Sh sh, String str, RootConfig rootConfig, ProducerScope producerScope, Continuation continuation) {
        super(2, continuation);
        this.b = list;
        this.c = sh;
        this.d = str;
        this.e = rootConfig;
        this.f = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Oh oh = new Oh(this.b, this.c, this.d, this.e, this.f, continuation);
        oh.a = obj;
        return oh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Oh) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.a;
        List list = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            String str = ((C4382u4) obj2).a;
            Object obj3 = linkedHashMap.get(str);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(str, obj3);
            }
            ((List) obj3).add(obj2);
        }
        Sh sh = this.c;
        String str2 = this.d;
        RootConfig rootConfig = this.e;
        ProducerScope producerScope = this.f;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new Nh(sh, (String) entry.getKey(), str2, rootConfig, (List) entry.getValue(), producerScope, null), 3, null);
            rootConfig = rootConfig;
            producerScope = producerScope;
            str2 = str2;
        }
        return Unit.INSTANCE;
    }
}
