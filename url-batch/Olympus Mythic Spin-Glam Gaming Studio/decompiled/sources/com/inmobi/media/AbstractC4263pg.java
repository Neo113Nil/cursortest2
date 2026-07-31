package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.pg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4263pg {
    public final Fg a;
    public final InterfaceC4157lg b;
    public final C4446wf c;
    public volatile EnumC4183mg d;
    public final ConcurrentHashMap e;

    public AbstractC4263pg(Fg dao, InterfaceC4157lg interfaceC4157lg, C4446wf networkHandler) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(networkHandler, "networkHandler");
        this.a = dao;
        this.b = interfaceC4157lg;
        this.c = networkHandler;
        this.d = EnumC4183mg.a;
        this.e = new ConcurrentHashMap();
    }

    public static C4210ng a(C4053hg c4053hg, InterfaceC3892bf interfaceC3892bf) {
        String str = c4053hg.a;
        interfaceC3892bf.c();
        interfaceC3892bf.e();
        return new C4210ng(c4053hg, interfaceC3892bf.c(), interfaceC3892bf.e());
    }

    public abstract Unit b();

    public static AdConfig.PingsV2Config a() {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getPingV2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
    
        if (r5.invoke(r2, r3) != r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b3, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r2 == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C4053hg c4053hg, Function2 function2, ContinuationImpl continuationImpl) {
        C4237og c4237og;
        int i;
        Function2 function22;
        C4053hg c4053hg2 = c4053hg;
        if (continuationImpl instanceof C4237og) {
            c4237og = (C4237og) continuationImpl;
            int i2 = c4237og.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4237og.e = i2 - Integer.MIN_VALUE;
                Object obj = c4237og.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4237og.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.d == EnumC4183mg.b) {
                        if (this.e.containsKey(c4053hg2.b)) {
                            return Unit.INSTANCE;
                        }
                        this.e.put(c4053hg2.b, c4053hg2.a);
                        C4446wf c4446wf = this.c;
                        c4237og.a = c4053hg2;
                        function22 = function2;
                        c4237og.b = function22;
                        c4237og.e = 1;
                        c4446wf.getClass();
                        HashMap hashMap = new HashMap(c4053hg2.c);
                        hashMap.put("User-Agent", AbstractC4002fj.c());
                        obj = c4446wf.a.a.a(new Xe(c4053hg2.a, hashMap, null, null, null, c4053hg2.d, 28), c4237og);
                    } else {
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c4053hg2 = c4237og.a;
                        ResultKt.throwOnFailure(obj);
                        this.e.remove(c4053hg2.b);
                        return Unit.INSTANCE;
                    }
                    Function2 function23 = c4237og.b;
                    C4053hg c4053hg3 = c4237og.a;
                    ResultKt.throwOnFailure(obj);
                    function22 = function23;
                    c4053hg2 = c4053hg3;
                }
                C4210ng a = a(c4053hg2, (InterfaceC3892bf) obj);
                c4237og.a = c4053hg2;
                c4237og.b = null;
                c4237og.e = 2;
            }
        }
        c4237og = new C4237og(this, continuationImpl);
        Object obj2 = c4237og.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4237og.e;
        if (i != 0) {
        }
        C4210ng a2 = a(c4053hg2, (InterfaceC3892bf) obj2);
        c4237og.a = c4053hg2;
        c4237og.b = null;
        c4237og.e = 2;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        EnumC4183mg enumC4183mg = this.d;
        EnumC4183mg enumC4183mg2 = EnumC4183mg.b;
        EnumC4183mg enumC4183mg3 = EnumC4183mg.a;
        Objects.toString(enumC4183mg);
        if (this.d == enumC4183mg3) {
            this.d = enumC4183mg2;
            Unit b = b();
            return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
