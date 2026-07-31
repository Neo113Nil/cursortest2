package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.x5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4462x5 extends AbstractC4500yg {
    public final C4288qf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4462x5(Fg dao) {
        super(dao);
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.d = new C4288qf(dao, new C4410v5(this), this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
    
        if (r13.a(r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r13 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
    
        if (r14 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C4053hg c4053hg, ContinuationImpl continuationImpl) {
        C4436w5 c4436w5;
        Object obj;
        int i;
        if (continuationImpl instanceof C4436w5) {
            c4436w5 = (C4436w5) continuationImpl;
            int i2 = c4436w5.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4436w5.d = i2 - Integer.MIN_VALUE;
                obj = c4436w5.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4436w5.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Intrinsics.checkNotNullExpressionValue("x5", "TAG");
                    String str = c4053hg.b;
                    String str2 = c4053hg.e;
                    c4436w5.a = c4053hg;
                    c4436w5.d = 1;
                    obj = a(str2, c4436w5);
                } else if (i == 1) {
                    c4053hg = c4436w5.a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    C4288qf c4288qf = this.d;
                    c4436w5.d = 3;
                }
                C4053hg c4053hg2 = c4053hg;
                if (((Boolean) obj).booleanValue()) {
                    WeakReference weakReference = (WeakReference) this.b.get(c4053hg2.h);
                    AbstractC4500yg.a(0, "Database capacity exceeded for pings", (short) 2248, c4053hg2, System.currentTimeMillis(), weakReference != null ? (InterfaceC4421vg) weakReference.get() : null);
                    return Unit.INSTANCE;
                }
                Fg fg = this.a;
                c4436w5.a = null;
                c4436w5.d = 2;
                Object a = fg.a.a("pings", Gg.a(c4053hg2), 4, c4436w5);
                if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a = Unit.INSTANCE;
                }
            }
        }
        c4436w5 = new C4436w5(this, continuationImpl);
        obj = c4436w5.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4436w5.d;
        if (i != 0) {
        }
        C4053hg c4053hg22 = c4053hg;
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
