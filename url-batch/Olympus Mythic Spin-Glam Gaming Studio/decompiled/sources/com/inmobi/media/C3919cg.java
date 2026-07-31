package com.inmobi.media;

import android.content.Context;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* renamed from: com.inmobi.media.cg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3919cg extends SuspendLambda implements Function2 {
    public Mutex a;
    public Context b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3919cg(Context context, Continuation continuation) {
        super(2, continuation);
        this.e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C3919cg c3919cg = new C3919cg(this.e, continuation);
        c3919cg.d = obj;
        return c3919cg;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3919cg c3919cg = new C3919cg(this.e, (Continuation) obj2);
        c3919cg.d = (CoroutineScope) obj;
        return c3919cg.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        Context context;
        WeakReference weakReference;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.d;
            mutex = C4027gg.b;
            Context context2 = this.e;
            this.d = coroutineScope;
            this.a = mutex;
            this.b = context2;
            this.c = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            context = context2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = this.b;
            mutex = this.a;
            ResultKt.throwOnFailure(obj);
        }
        try {
            int size = C4027gg.c.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    weakReference = null;
                    break;
                }
                ArrayList arrayList = C4027gg.c;
                if (Intrinsics.areEqual((Context) ((WeakReference) arrayList.get(i2)).get(), context)) {
                    weakReference = (WeakReference) arrayList.get(i2);
                    break;
                }
                i2++;
            }
            if (weakReference == null) {
                C4027gg.c.add(new WeakReference(context));
            }
            Picasso picasso = C4027gg.a;
            if (picasso == null) {
                AbstractC4002fj.a(context, C4027gg.d);
                picasso = C4027gg.a(context);
                C4027gg.a = picasso;
            }
            mutex.unlock(null);
            return picasso;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
