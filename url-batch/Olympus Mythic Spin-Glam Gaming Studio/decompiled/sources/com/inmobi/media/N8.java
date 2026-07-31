package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class N8 extends AbstractC4500yg {
    public final C4385u7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N8(Fg dao) {
        super(dao);
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.d = new C4385u7(dao, new M8(this), this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C4053hg c4053hg, ContinuationImpl continuationImpl) {
        K8 k8;
        int i;
        if (continuationImpl instanceof K8) {
            k8 = (K8) continuationImpl;
            int i2 = k8.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k8.d = i2 - Integer.MIN_VALUE;
                Object obj = k8.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = k8.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4446wf c4446wf = this.c;
                    k8.a = c4053hg;
                    k8.d = 1;
                    c4446wf.getClass();
                    HashMap hashMap = new HashMap(c4053hg.c);
                    hashMap.put("User-Agent", AbstractC4002fj.c());
                    obj = c4446wf.a.a.a(new Xe(c4053hg.a, hashMap, null, null, null, c4053hg.d, 28), k8);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4053hg = k8.a;
                    ResultKt.throwOnFailure(obj);
                }
                InterfaceC3892bf interfaceC3892bf = (InterfaceC3892bf) obj;
                return new C4210ng(c4053hg, interfaceC3892bf.c(), interfaceC3892bf.e());
            }
        }
        k8 = new K8(this, continuationImpl);
        Object obj2 = k8.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = k8.d;
        if (i != 0) {
        }
        InterfaceC3892bf interfaceC3892bf2 = (InterfaceC3892bf) obj2;
        return new C4210ng(c4053hg, interfaceC3892bf2.c(), interfaceC3892bf2.e());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|89|6|7|8|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0142, code lost:
    
        if (r15.a(r0) != r1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x003e, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0146, code lost:
    
        r9 = r14;
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0148, code lost:
    
        r14.getMessage();
        r15 = (java.lang.ref.WeakReference) r13.b.get(r9.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0155, code lost:
    
        if (r15 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0157, code lost:
    
        r12 = (com.inmobi.media.InterfaceC4421vg) r15.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0160, code lost:
    
        com.inmobi.media.AbstractC4500yg.a(0, r14.getMessage(), 2251, r9, java.lang.System.currentTimeMillis(), r12);
        r14 = r13.d;
        r0.a = null;
        r0.b = null;
        r0.e = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017c, code lost:
    
        if (r14.a(r0) == r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015f, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0041, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017f, code lost:
    
        r9 = r14;
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0181, code lost:
    
        r14.getMessage();
        r15 = (java.lang.ref.WeakReference) r13.b.get(r9.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018e, code lost:
    
        if (r15 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0190, code lost:
    
        r12 = (com.inmobi.media.InterfaceC4421vg) r15.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0199, code lost:
    
        com.inmobi.media.AbstractC4500yg.a(0, r14.getMessage(), 2250, r9, java.lang.System.currentTimeMillis(), r12);
        r14 = r13.d;
        r0.a = null;
        r0.b = null;
        r0.e = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b4, code lost:
    
        if (r14.a(r0) == r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0198, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0052, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x006b, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0054, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x006e, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee A[Catch: Error -> 0x0052, Exception -> 0x0054, TryCatch #3 {Error -> 0x0052, Exception -> 0x0054, blocks: (B:23:0x004d, B:24:0x00e6, B:26:0x00ee, B:29:0x0116, B:34:0x011d, B:35:0x0114, B:36:0x0123, B:40:0x005a, B:46:0x0065), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123 A[Catch: Error -> 0x0052, Exception -> 0x0054, TRY_LEAVE, TryCatch #3 {Error -> 0x0052, Exception -> 0x0054, blocks: (B:23:0x004d, B:24:0x00e6, B:26:0x00ee, B:29:0x0116, B:34:0x011d, B:35:0x0114, B:36:0x0123, B:40:0x005a, B:46:0x0065), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5 A[Catch: Error -> 0x003e, Exception -> 0x0041, TryCatch #4 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:16:0x0044, B:18:0x0039, B:19:0x0137, B:42:0x00d5, B:48:0x009d, B:50:0x00a5, B:52:0x00b5, B:57:0x00cf, B:59:0x0074, B:61:0x0082, B:62:0x008a), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5 A[Catch: Error -> 0x003e, Exception -> 0x0041, TryCatch #4 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:16:0x0044, B:18:0x0039, B:19:0x0137, B:42:0x00d5, B:48:0x009d, B:50:0x00a5, B:52:0x00b5, B:57:0x00cf, B:59:0x0074, B:61:0x0082, B:62:0x008a), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(C4053hg c4053hg, ContinuationImpl continuationImpl) {
        L8 l8;
        ?? r2;
        InterfaceC4421vg interfaceC4421vg;
        C4053hg c4053hg2;
        InterfaceC4421vg interfaceC4421vg2;
        C4210ng c4210ng;
        C4053hg c4053hg3;
        if (continuationImpl instanceof L8) {
            l8 = (L8) continuationImpl;
            int i = l8.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                l8.e = i - Integer.MIN_VALUE;
                Object obj = l8.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = l8.e;
                switch (r2) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        String str = c4053hg.b;
                        WeakReference weakReference = (WeakReference) this.b.get(c4053hg.h);
                        InterfaceC4421vg interfaceC4421vg3 = weakReference != null ? (InterfaceC4421vg) weakReference.get() : null;
                        String str2 = c4053hg.e;
                        l8.a = c4053hg;
                        l8.b = interfaceC4421vg3;
                        l8.e = 1;
                        Object a = a(str2, l8);
                        if (a == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        interfaceC4421vg = interfaceC4421vg3;
                        obj = a;
                        if (((Boolean) obj).booleanValue()) {
                            AbstractC4500yg.a(0, "Database capacity exceeded for pings", (short) 2248, c4053hg, System.currentTimeMillis(), interfaceC4421vg);
                            return Unit.INSTANCE;
                        }
                        Fg fg = this.a;
                        l8.a = c4053hg;
                        l8.b = interfaceC4421vg;
                        l8.e = 2;
                        Object a2 = fg.a.a("pings", Gg.a(c4053hg), 4, l8);
                        if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a2 = Unit.INSTANCE;
                        }
                        if (a2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        l8.a = c4053hg;
                        l8.b = interfaceC4421vg;
                        l8.e = 3;
                        obj = a(c4053hg, l8);
                        if (obj != coroutine_suspended) {
                            c4053hg2 = c4053hg;
                            interfaceC4421vg2 = interfaceC4421vg;
                            c4210ng = (C4210ng) obj;
                            if (!AbstractC4289qg.a(c4210ng)) {
                                String str3 = c4210ng.a.b;
                                l8.a = c4053hg2;
                                l8.b = null;
                                l8.e = 4;
                                AbstractC4500yg.a(c4210ng, interfaceC4421vg2);
                                Object a3 = this.a.a.a("pings", "id=?", new String[]{c4210ng.a.b}, l8);
                                if (a3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    a3 = Unit.INSTANCE;
                                }
                                if (a3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    a3 = Unit.INSTANCE;
                                }
                                if (a3 == coroutine_suspended) {
                                }
                                return Unit.INSTANCE;
                            }
                            String str4 = c4210ng.a.b;
                            l8.a = c4053hg2;
                            l8.b = null;
                            l8.e = 5;
                            if (a(c4210ng, interfaceC4421vg2, l8) != coroutine_suspended) {
                                c4053hg3 = c4053hg2;
                                C4385u7 c4385u7 = this.d;
                                l8.a = c4053hg3;
                                l8.e = 6;
                                break;
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        InterfaceC4421vg interfaceC4421vg4 = l8.b;
                        C4053hg c4053hg4 = l8.a;
                        ResultKt.throwOnFailure(obj);
                        interfaceC4421vg = interfaceC4421vg4;
                        c4053hg = c4053hg4;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 2:
                        InterfaceC4421vg interfaceC4421vg5 = l8.b;
                        C4053hg c4053hg5 = l8.a;
                        ResultKt.throwOnFailure(obj);
                        interfaceC4421vg = interfaceC4421vg5;
                        c4053hg = c4053hg5;
                        l8.a = c4053hg;
                        l8.b = interfaceC4421vg;
                        l8.e = 3;
                        obj = a(c4053hg, l8);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                        interfaceC4421vg2 = l8.b;
                        c4053hg2 = l8.a;
                        ResultKt.throwOnFailure(obj);
                        c4210ng = (C4210ng) obj;
                        if (!AbstractC4289qg.a(c4210ng)) {
                        }
                        return coroutine_suspended;
                    case 4:
                    case 6:
                        C4053hg c4053hg6 = l8.a;
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 5:
                        c4053hg3 = l8.a;
                        ResultKt.throwOnFailure(obj);
                        C4385u7 c4385u72 = this.d;
                        l8.a = c4053hg3;
                        l8.e = 6;
                        break;
                    case 7:
                    case 8:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        l8 = new L8(this, continuationImpl);
        Object obj2 = l8.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = l8.e;
        switch (r2) {
        }
    }
}
