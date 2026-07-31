package com.inmobi.media;

import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlinx.coroutines.Deferred;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class Eo extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ InterfaceC4466x9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eo(String str, InterfaceC4466x9 interfaceC4466x9, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = interfaceC4466x9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Eo(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Eo(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bo bo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Io io2 = Io.a;
            Deferred a = Io.a(this.b, this.c);
            this.a = 1;
            obj = a.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        InterfaceC3892bf interfaceC3892bf = (InterfaceC3892bf) obj;
        Io io3 = Io.a;
        if (interfaceC3892bf != null && Fl.a(interfaceC3892bf)) {
            ByteString d = interfaceC3892bf.d();
            Charset charset = Charsets.UTF_8;
            if (d.string(charset).length() > 0 && (bo = Io.c) != null) {
                String str = this.b;
                IntRange intRange = AbstractC4026gf.a;
                Intrinsics.checkNotNullParameter(interfaceC3892bf, "<this>");
                String string = interfaceC3892bf.d().string(charset);
                InterfaceC4466x9 interfaceC4466x9 = this.c;
                String str2 = this.b;
                if (interfaceC4466x9 != null) {
                    ((C4493y9) interfaceC4466x9).c("WebResourceHandler", "downloadResourceAndSaveToCache() response received: " + str2);
                }
                Unit unit = Unit.INSTANCE;
                Boxing.boxBoolean(bo.a(str, string, this.c));
            }
        }
        return interfaceC3892bf;
    }
}
