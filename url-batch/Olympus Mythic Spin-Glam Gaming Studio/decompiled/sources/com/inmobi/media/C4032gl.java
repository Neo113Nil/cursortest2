package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlinx.coroutines.Deferred;
import okio.ByteString;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4032gl extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ SignalsConfig.UnifiedIdServiceConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4032gl(SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig, Continuation continuation) {
        super(1, continuation);
        this.b = unifiedIdServiceConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C4032gl(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C4032gl(this.b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        if (r2.a(r4, r12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e2, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e0, code lost:
    
        if (r1.a(r3, r13, r12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (r13 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String url = this.b.getUrl();
            Hh hh = AbstractC4477xj.a;
            C4277q4 c4277q4 = AbstractC4015g4.a;
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            Ze a = new C4268pl(url, new Zk(((SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class)).getIncludeIds()), AbstractC4002fj.c, this.b.getMaxRetries(), this.b.getRetryInterval(), this.b.getTimeout()).a();
            HashMap hashMap = new HashMap();
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("UnifiedIdNetworkCallRequested", hashMap, EnumC4530zk.a);
            Deferred a2 = ((F9) Ve.i.getValue()).a(a);
            C4084il.d = a2;
            this.a = 1;
            obj = a2.await(this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        InterfaceC3892bf interfaceC3892bf = (InterfaceC3892bf) obj;
        Objects.toString(interfaceC3892bf);
        IntRange intRange = AbstractC4026gf.a;
        Intrinsics.checkNotNullParameter(interfaceC3892bf, "<this>");
        ByteString d = interfaceC3892bf.d();
        Charset charset = Charsets.UTF_8;
        d.string(charset);
        C4084il c4084il = C4084il.a;
        C4084il.e = new C4162ll(interfaceC3892bf, C4084il.c);
        if (Fl.a(interfaceC3892bf)) {
            C4162ll c4162ll = C4084il.e;
            if (c4162ll != null) {
                Intrinsics.checkNotNullParameter(interfaceC3892bf, "<this>");
                JSONObject jSONObject = new JSONObject(interfaceC3892bf.d().string(charset));
                this.a = 2;
            }
            return Unit.INSTANCE;
        }
        C4162ll c4162ll2 = C4084il.e;
        if (c4162ll2 != null) {
            int c = interfaceC3892bf.c();
            String e = interfaceC3892bf.e();
            this.a = 3;
        }
        return Unit.INSTANCE;
    }
}
