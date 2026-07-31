package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* loaded from: classes12.dex */
public final class Um extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ double d;
    public final /* synthetic */ AdConfig.VastVideoConfig e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Um(ArrayList arrayList, double d, AdConfig.VastVideoConfig vastVideoConfig, Continuation continuation) {
        super(2, continuation);
        this.c = arrayList;
        this.d = d;
        this.e = vastVideoConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Um um = new Um(this.c, this.d, this.e, continuation);
        um.b = obj;
        return um;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Um) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object awaitAll;
        Deferred async$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            if (this.c.isEmpty()) {
                return CollectionsKt.emptyList();
            }
            int a = G5.a();
            EnumC3944df a2 = G4.a();
            ArrayList arrayList = this.c;
            double d = this.d;
            AdConfig.VastVideoConfig vastVideoConfig = this.e;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList arrayList3 = arrayList2;
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new Sm((Ol) it.next(), d, a2, a, vastVideoConfig, null), 3, null);
                arrayList3.add(async$default);
                arrayList2 = arrayList3;
                d = d;
            }
            this.a = 1;
            awaitAll = AwaitKt.awaitAll(arrayList2, this);
            if (awaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            awaitAll = obj;
        }
        List sortedWith = CollectionsKt.sortedWith((Iterable) awaitAll, new Tm());
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
        Iterator it2 = sortedWith.iterator();
        while (it2.hasNext()) {
            arrayList4.add((Ol) ((Pair) it2.next()).getFirst());
        }
        return arrayList4;
    }
}
