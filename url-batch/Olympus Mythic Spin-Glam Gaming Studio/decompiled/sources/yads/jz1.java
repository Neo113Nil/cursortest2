package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* loaded from: classes15.dex */
public final class jz1 extends SuspendLambda implements Function2 {
    public kz1 b;
    public Collection c;
    public Iterator d;
    public ry1 e;
    public Collection f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ List i;
    public final /* synthetic */ kz1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz1(List list, kz1 kz1Var, Continuation continuation) {
        super(2, continuation);
        this.i = list;
        this.j = kz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        jz1 jz1Var = new jz1(this.i, this.j, continuation);
        jz1Var.h = obj;
        return jz1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jz1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00fc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e8 -> B:5:0x00eb). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kz1 kz1Var;
        Iterator it;
        CoroutineScope coroutineScope;
        Collection collection;
        ph phVar;
        ArrayList arrayList;
        Deferred CompletableDeferred;
        dn1 dn1Var;
        de3 de3Var;
        List list;
        jz1 jz1Var = this;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = jz1Var.g;
        int i2 = 10;
        int i3 = 1;
        Continuation continuation = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) jz1Var.h;
            List list2 = jz1Var.i;
            kz1 kz1Var2 = jz1Var.j;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            kz1Var = kz1Var2;
            it = list2.iterator();
            coroutineScope = coroutineScope2;
            collection = arrayList2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = jz1Var.f;
            ry1 ry1Var = jz1Var.e;
            it = jz1Var.d;
            Collection collection2 = jz1Var.c;
            kz1Var = jz1Var.b;
            CoroutineScope coroutineScope3 = (CoroutineScope) jz1Var.h;
            ResultKt.throwOnFailure(obj);
            Object awaitAll = obj;
            List list3 = (List) awaitAll;
            List filterNotNull = CollectionsKt.filterNotNull(list3);
            if (list3.size() == filterNotNull.size()) {
                return continuation;
            }
            collection.add(new ry1(ry1Var.a, filterNotNull, ry1Var.c, ry1Var.d, ry1Var.e, ry1Var.f, ry1Var.g, ry1Var.h, ry1Var.i, ry1Var.j, ry1Var.k));
            jz1Var = this;
            collection = collection2;
            coroutineScope = coroutineScope3;
            coroutine_suspended = coroutine_suspended;
            i2 = 10;
            i3 = 1;
            continuation = null;
            if (it.hasNext()) {
                return (List) collection;
            }
            ry1 ry1Var2 = (ry1) it.next();
            List<ph> list4 = ry1Var2.b;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, i2));
            for (ph phVar2 : list4) {
                kz1Var.c.getClass();
                if (phVar2.c instanceof dn1) {
                    Intrinsics.checkNotNull(phVar2, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<R of com.monetization.ads.network.model.AssetKt.castGeneric>");
                    phVar = phVar2;
                } else {
                    phVar = continuation;
                }
                if (phVar != 0 && (dn1Var = (dn1) phVar.c) != null && (de3Var = dn1Var.b) != null && (list = de3Var.a) != null && !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((we3) it2.next()).b.a) {
                            arrayList = arrayList3;
                            CompletableDeferred = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new iz1(kz1Var, phVar2, continuation), 3, null);
                            break;
                        }
                    }
                }
                arrayList = arrayList3;
                CompletableDeferred = CompletableDeferredKt.CompletableDeferred(phVar2);
                arrayList.add(CompletableDeferred);
                arrayList3 = arrayList;
            }
            jz1Var.h = coroutineScope;
            jz1Var.b = kz1Var;
            jz1Var.c = collection;
            jz1Var.d = it;
            jz1Var.e = ry1Var2;
            jz1Var.f = collection;
            jz1Var.g = i3;
            awaitAll = AwaitKt.awaitAll(arrayList3, jz1Var);
            if (awaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope3 = coroutineScope;
            ry1Var = ry1Var2;
            collection2 = collection;
            List list32 = (List) awaitAll;
            List filterNotNull2 = CollectionsKt.filterNotNull(list32);
            if (list32.size() == filterNotNull2.size()) {
            }
        }
    }
}
