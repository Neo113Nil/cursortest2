package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.kg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4131kg {
    public static N8 b;
    public static C4462x5 c;
    public static final C4131kg a = new C4131kg();
    public static final AtomicBoolean d = new AtomicBoolean(false);

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00da, code lost:
    
        if (r7 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        if (r7 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C4079ig c4079ig;
        int i;
        Unit unit;
        C4462x5 c4462x5;
        Unit unit2;
        if (continuationImpl instanceof C4079ig) {
            c4079ig = (C4079ig) continuationImpl;
            int i2 = c4079ig.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4079ig.c = i2 - Integer.MIN_VALUE;
                Object obj = c4079ig.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4079ig.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4277q4 c4277q4 = AbstractC4015g4.a;
                    Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
                    if (!((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getPingV2().getEnabled()) {
                        return Unit.INSTANCE;
                    }
                    if (d.compareAndSet(false, true)) {
                        Fg fg = new Fg(AbstractC4334s9.b());
                        b = new N8(fg);
                        c = new C4462x5(fg);
                        N8 n8 = b;
                        if (n8 != null) {
                            c4079ig.c = 1;
                            C4385u7 c4385u7 = n8.d;
                            c4385u7.getClass();
                            EnumC4183mg enumC4183mg = EnumC4183mg.b;
                            if (c4385u7.d == EnumC4183mg.a) {
                                c4385u7.d = enumC4183mg;
                                unit = c4385u7.b();
                                if (unit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    unit = Unit.INSTANCE;
                                }
                            } else {
                                unit = Unit.INSTANCE;
                            }
                            if (unit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                unit = Unit.INSTANCE;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                c4462x5 = c;
                if (c4462x5 != null) {
                    c4079ig.c = 2;
                    C4288qf c4288qf = c4462x5.d;
                    c4288qf.getClass();
                    EnumC4183mg enumC4183mg2 = EnumC4183mg.b;
                    if (c4288qf.d == EnumC4183mg.a) {
                        c4288qf.d = enumC4183mg2;
                        unit2 = c4288qf.b();
                        if (unit2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            unit2 = Unit.INSTANCE;
                        }
                    } else {
                        unit2 = Unit.INSTANCE;
                    }
                    if (unit2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        unit2 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        c4079ig = new C4079ig(this, continuationImpl);
        Object obj2 = c4079ig.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4079ig.c;
        if (i != 0) {
        }
        c4462x5 = c;
        if (c4462x5 != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        if (r7 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        if (r7 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        C4105jg c4105jg;
        int i;
        Object obj;
        C4462x5 c4462x5;
        Object obj2;
        if (continuationImpl instanceof C4105jg) {
            c4105jg = (C4105jg) continuationImpl;
            int i2 = c4105jg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4105jg.c = i2 - Integer.MIN_VALUE;
                Object obj3 = c4105jg.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4105jg.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    if (d.compareAndSet(true, false)) {
                        N8 n8 = b;
                        if (n8 != null) {
                            c4105jg.c = 1;
                            C4385u7 c4385u7 = n8.d;
                            c4385u7.getClass();
                            EnumC4183mg enumC4183mg = EnumC4183mg.a;
                            if (c4385u7.d == EnumC4183mg.b) {
                                c4385u7.d = enumC4183mg;
                                obj = c4385u7.e(c4105jg);
                                if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    obj = Unit.INSTANCE;
                                }
                            } else {
                                obj = Unit.INSTANCE;
                            }
                            if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                obj = Unit.INSTANCE;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj3);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj3);
                c4462x5 = c;
                if (c4462x5 != null) {
                    c4105jg.c = 2;
                    Intrinsics.checkNotNullExpressionValue("x5", "TAG");
                    C4288qf c4288qf = c4462x5.d;
                    c4288qf.getClass();
                    EnumC4183mg enumC4183mg2 = EnumC4183mg.a;
                    if (c4288qf.d == EnumC4183mg.b) {
                        c4288qf.d = enumC4183mg2;
                        obj2 = c4288qf.d(c4105jg);
                        if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj2 = Unit.INSTANCE;
                        }
                    } else {
                        obj2 = Unit.INSTANCE;
                    }
                    if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        obj2 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        c4105jg = new C4105jg(this, continuationImpl);
        Object obj32 = c4105jg.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4105jg.c;
        if (i != 0) {
        }
        c4462x5 = c;
        if (c4462x5 != null) {
        }
        return Unit.INSTANCE;
    }
}
