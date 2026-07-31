package com.inmobi.media;

import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes12.dex */
public final class K7 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ V7 b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K7(V7 v7, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.b = v7;
        this.c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new K7(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new K7(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            V7 v7 = this.b;
            if (!v7.f.get()) {
                v7.f.set(true);
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    v7.p.addListener(v7.B);
                } else {
                    BuildersKt__Builders_commonKt.launch$default(v7.c, null, null, new A7(null, v7), 3, null);
                }
            }
            this.b.u = System.currentTimeMillis();
            V7 v72 = this.b;
            ExoPlayer exoPlayer = v72.p;
            ArrayList arrayList = this.c;
            InterfaceC4466x9 interfaceC4466x9 = v72.b;
            P2 p2 = v72.w;
            boolean isCache = v72.a.getIsCache();
            this.a = 1;
            obj = AbstractC4164ln.a(exoPlayer, arrayList, interfaceC4466x9, p2, isCache, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.b.a((AbstractC4175m8) obj);
        return Unit.INSTANCE;
    }
}
