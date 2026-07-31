package com.inmobi.media;

import android.os.Message;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.l3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4144l3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Z2 b;
    public final /* synthetic */ HandlerC4224o3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4144l3(Z2 z2, HandlerC4224o3 handlerC4224o3, Continuation continuation) {
        super(2, continuation);
        this.b = z2;
        this.c = handlerC4224o3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4144l3(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4144l3(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r8 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        if (r8 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        int i2 = 2;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C3932d3 c3932d3 = (C3932d3) E3.b.getValue();
            int i3 = this.b.a;
            this.a = 1;
            Object a = c3932d3.a.a("click", "id=?", new String[]{String.valueOf(i3)}, this);
            if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a = Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    return Boxing.boxBoolean(this.c.sendMessage(obtain));
                }
                E3 e3 = E3.a;
                Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
                E3.g.set(false);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        E3.f.remove(this.b);
        if (!E3.f.isEmpty()) {
            HandlerC4224o3 handlerC4224o3 = this.c;
            Z2 z2 = (Z2) E3.f.get(0);
            int i4 = HandlerC4224o3.a;
            Message obtain2 = Message.obtain();
            if (z2 != null && z2.e) {
                i2 = 3;
            }
            obtain2.what = i2;
            obtain2.obj = z2;
            handlerC4224o3.sendMessage(obtain2);
            return Unit.INSTANCE;
        }
        C3932d3 c3932d32 = (C3932d3) E3.b.getValue();
        this.a = 2;
        obj = c3932d32.a(this);
    }
}
