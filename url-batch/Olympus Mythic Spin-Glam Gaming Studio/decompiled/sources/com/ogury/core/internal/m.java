package com.ogury.core.internal;

import com.ogury.core.internal.datastore.datastore.OnDataStoreChangeListener;
import java.util.Iterator;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes4.dex */
public final class m extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ OnDataStoreChangeListener b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(OnDataStoreChangeListener onDataStoreChangeListener, Continuation continuation) {
        super(2, continuation);
        this.b = onDataStoreChangeListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        m mVar = new m(this.b, continuation);
        mVar.a = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m mVar = new m(this.b, (Continuation) obj2);
        mVar.a = (Set) obj;
        return mVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Set set = (Set) this.a;
        OnDataStoreChangeListener onDataStoreChangeListener = this.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            onDataStoreChangeListener.onDataStoreChanged((String) it.next());
        }
        return Unit.INSTANCE;
    }
}
