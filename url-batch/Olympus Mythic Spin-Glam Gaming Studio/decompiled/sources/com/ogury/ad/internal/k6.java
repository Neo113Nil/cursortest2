package com.ogury.ad.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final /* synthetic */ class k6 extends FunctionReferenceImpl implements Function0 {
    public k6(t6 t6Var) {
        super(0, t6Var, t6.class, "handleNewOguryBrowserWebViewCreated", "handleNewOguryBrowserWebViewCreated()V", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("webView");
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r1.setMultiBrowserOpened(true);
        r1 = r0.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("webView");
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r1.setVisibility(4);
        r0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r0.a() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        r0.g.a(r0.f, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r0.i == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        r2 = "expanded";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r1 = r0.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r1 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mraidCommandExecutor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        r5.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "state");
        com.ogury.ad.internal.b8.a(r5.a, com.ogury.ad.internal.x6.c(r2));
        r5.a.setAdState(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        r1 = r0.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r1 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "<this>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if ((!r1.x.a()) != true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        r0.i = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0023, code lost:
    
        if (r0.i == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1.getAdState(), "default") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r1 = r0.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r1 != null) goto L15;
     */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4828invoke() {
        t6 t6Var = (t6) this.receiver;
        String state = "default";
        w6 w6Var = null;
        if (t6Var.i) {
            y7 y7Var = t6Var.o;
            if (y7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                y7Var = null;
            }
        }
    }
}
