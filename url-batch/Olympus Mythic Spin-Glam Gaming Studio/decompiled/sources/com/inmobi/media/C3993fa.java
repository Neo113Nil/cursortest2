package com.inmobi.media;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.fa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3993fa extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C4021ga b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3993fa(C4021ga c4021ga, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.b = c4021ga;
        this.c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3993fa(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3993fa(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C4047ha c4047ha;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Kb kb = (Kb) Lb.a.getValue();
            this.a = 1;
            obj = kb.b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ArrayList arrayList = this.c;
        for (Db db : (Iterable) obj) {
            CopyOnWriteArrayList copyOnWriteArrayList = Zb.a;
            if (!Yb.a(db.a)) {
                String b = AbstractC4023gc.b(db.a);
                if (b != null) {
                    JSONObject jSONObject = new JSONObject(b);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("vitals");
                    JSONArray jSONArray = jSONObject.getJSONArray(CreativeInfo.f);
                    Intrinsics.checkNotNull(jSONObject2);
                    Intrinsics.checkNotNull(jSONArray);
                    c4047ha = new C4047ha(jSONObject2, jSONArray, db);
                } else {
                    c4047ha = null;
                }
                if (c4047ha != null) {
                    arrayList.add(c4047ha);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
