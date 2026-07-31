package com.inmobi.media;

import android.widget.ProgressBar;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* renamed from: com.inmobi.media.zn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4533zn extends SuspendLambda implements Function2 {
    public int a;
    public int b;
    public int c;
    public long d;
    public float e;
    public ProgressBar f;
    public int g;
    public final /* synthetic */ ProgressBar h;
    public final /* synthetic */ An i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4533zn(ProgressBar progressBar, An an, int i, Continuation continuation) {
        super(2, continuation);
        this.h = progressBar;
        this.i = an;
        this.j = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4533zn(this.h, this.i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4533zn) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0066 -> B:5:0x0069). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ProgressBar progressBar;
        int i;
        int i2;
        float f;
        int i3;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.g;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            int progress = this.h.getProgress();
            long j2 = this.i.c.f / 10;
            progressBar = this.h;
            i = progress;
            i2 = 10;
            f = (this.j - progress) / 10.0f;
            i3 = 0;
            j = j2;
            if (i3 < i2) {
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = this.c;
            i2 = this.b;
            f = this.e;
            j = this.d;
            i = this.a;
            progressBar = this.f;
            ResultKt.throwOnFailure(obj);
            i3++;
            if (i3 < i2) {
                Un.a(progressBar, (int) (((i3 + 1) * f) + i));
                this.f = progressBar;
                this.a = i;
                this.d = j;
                this.e = f;
                this.b = i2;
                this.c = i3;
                this.g = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i3++;
                if (i3 < i2) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
