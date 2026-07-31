package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5065n implements InterfaceC5064m {

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i a;

    @NotNull
    public final com.moloco.sdk.internal.error.b b;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.DECLoaderImpl", f = "DECLoader.kt", l = {31}, m = "load")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n$a */
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return C5065n.this.a(null, null, this);
        }
    }

    public C5065n(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i mediaCacheRepository, @NotNull com.moloco.sdk.internal.error.b errorReportingService) {
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        this.a = mediaCacheRepository;
        this.b = errorReportingService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC5064m
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull C5060i c5060i, @Nullable String str, @NotNull Continuation continuation) {
        a aVar;
        int i;
        String d;
        Object a2;
        C5065n c5065n;
        i.a aVar2;
        C5060i c5060i2;
        C5060i c5060i3 = c5060i;
        String str2 = str;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.g = i2 - Integer.MIN_VALUE;
                Object obj = aVar.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.g;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C5061j n = c5060i.n();
                    if (n == null || (d = n.d()) == null) {
                        this.b.a(C5066o.b, str2 != null ? new com.moloco.sdk.internal.error.a(str2) : new com.moloco.sdk.internal.error.a("UNKNOWN_MTID"));
                        C5066o.b("can't precache DEC: appIconUri is null");
                        return c5060i3;
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i iVar = this.a;
                    aVar.a = this;
                    aVar.b = c5060i3;
                    aVar.c = str2;
                    aVar.d = d;
                    aVar.g = 1;
                    a2 = iVar.a(d, aVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c5065n = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = (String) aVar.d;
                    str2 = (String) aVar.c;
                    C5060i c5060i4 = (C5060i) aVar.b;
                    C5065n c5065n2 = (C5065n) aVar.a;
                    ResultKt.throwOnFailure(obj);
                    d = str3;
                    c5060i3 = c5060i4;
                    c5065n = c5065n2;
                    a2 = obj;
                }
                aVar2 = (i.a) a2;
                if (aVar2 instanceof i.a.b) {
                    c5065n.b.a(C5066o.a, str2 != null ? new com.moloco.sdk.internal.error.a(str2) : new com.moloco.sdk.internal.error.a("UNKNOWN_MTID"));
                    C5066o.b("dec loading error: " + aVar2 + ": `Not found` for " + d);
                    c5060i2 = null;
                } else {
                    c5060i2 = r8.a((r20 & 1) != 0 ? r8.a : null, (r20 & 2) != 0 ? r8.b : null, (r20 & 4) != 0 ? r8.c : null, (r20 & 8) != 0 ? r8.d : null, (r20 & 16) != 0 ? r8.e : null, (r20 & 32) != 0 ? r8.f : null, (r20 & 64) != 0 ? r8.g : null, (r20 & 128) != 0 ? r8.h : new C5061j(c5060i3.n().f(), ((i.a.b) aVar2).a().getAbsolutePath(), c5060i3.n().e()), (r20 & 256) != 0 ? c5060i3.i : null);
                }
                return c5060i2 != null ? c5060i3 : c5060i2;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.g;
        if (i != 0) {
        }
        aVar2 = (i.a) a2;
        if (aVar2 instanceof i.a.b) {
        }
        if (c5060i2 != null) {
        }
    }
}
