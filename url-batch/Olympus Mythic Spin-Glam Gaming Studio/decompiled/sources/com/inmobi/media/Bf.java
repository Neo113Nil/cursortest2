package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.R;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes11.dex */
public final class Bf extends SuspendLambda implements Function2 {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bf(Context context, Continuation continuation) {
        super(2, continuation);
        this.a = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Bf(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Bf(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Df df = Df.a;
        Context context = this.a;
        Gf gf = Df.c;
        if (gf == null) {
            gf = new Gf(context);
            Df.c = gf;
        }
        String a = gf.a.a("omid_js_string");
        if (a != null) {
            return a;
        }
        Context context2 = this.a;
        int i = R.raw.inmobi_omid_js;
        Intrinsics.checkNotNullParameter(context2, "<this>");
        try {
            InputStream openRawResource = context2.getResources().openRawResource(i);
            Intrinsics.checkNotNullExpressionValue(openRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, Charsets.UTF_8), 8192);
            try {
                String readText = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                return readText;
            } finally {
            }
        } catch (Exception unused) {
            return "";
        }
    }
}
