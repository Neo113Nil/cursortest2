package com.inmobi.media;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ch, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3920ch extends SuspendLambda implements Function2 {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3920ch(Context context, Continuation continuation) {
        super(2, continuation);
        this.a = context;
    }

    public static final boolean a(String str) {
        Intrinsics.checkNotNull(str);
        return StringsKt.startsWith$default(str, "auto_", false, 2, (Object) null);
    }

    public static final boolean b(String str) {
        return Intrinsics.areEqual(str, "a_i_dep");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3920ch(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3920ch(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            C4000fh c4000fh = C4000fh.a;
            Context context = this.a;
            c4000fh.getClass();
            if (C4000fh.d == null) {
                C4000fh.d = new Qg(context, "pub_signals_store");
            }
            Qg qg = null;
            try {
                Qg qg2 = C4000fh.d;
                if (qg2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                    qg2 = null;
                }
                String a = qg2.a("saved_signals");
                if (a != null) {
                    JSONObject jSONObject = new JSONObject(a);
                    Iterator<String> keys = jSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                    Iterator it = SequencesKt.toList(SequencesKt.filterNot(SequencesKt.asSequence(keys), new Function1() { // from class: com.inmobi.media.ch$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(C3920ch.a((String) obj2));
                        }
                    })).iterator();
                    while (it.hasNext()) {
                        jSONObject.remove((String) it.next());
                    }
                    Qg qg3 = C4000fh.d;
                    if (qg3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                        qg3 = null;
                    }
                    String value = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
                    qg3.getClass();
                    Intrinsics.checkNotNullParameter("saved_signals", "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    qg3.a.a("saved_signals", value, true);
                }
            } catch (Exception e) {
                Qg qg4 = C4000fh.d;
                if (qg4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                    qg4 = null;
                }
                qg4.getClass();
                Intrinsics.checkNotNullParameter("saved_signals", "key");
                qg4.a.a("saved_signals");
                C4000fh.a.getClass();
                C4000fh.e.a();
                Xb.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
                Lazy lazy = AbstractC3861aa.a;
                AbstractC3861aa.a(new Q2(e));
            }
            try {
                Qg qg5 = C4000fh.d;
                if (qg5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                    qg5 = null;
                }
                String a2 = qg5.a("imp_depth");
                if (a2 != null) {
                    JSONObject jSONObject2 = new JSONObject(a2);
                    Iterator<String> keys2 = jSONObject2.keys();
                    Intrinsics.checkNotNullExpressionValue(keys2, "keys(...)");
                    Iterator it2 = SequencesKt.toList(SequencesKt.filterNot(SequencesKt.asSequence(keys2), new Function1() { // from class: com.inmobi.media.ch$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(C3920ch.b((String) obj2));
                        }
                    })).iterator();
                    while (it2.hasNext()) {
                        jSONObject2.remove((String) it2.next());
                    }
                    Qg qg6 = C4000fh.d;
                    if (qg6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                        qg6 = null;
                    }
                    String value2 = jSONObject2.toString();
                    Intrinsics.checkNotNullExpressionValue(value2, "toString(...)");
                    qg6.getClass();
                    Intrinsics.checkNotNullParameter("imp_depth", "key");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    Qa qa = qg6.a;
                    ConcurrentHashMap concurrentHashMap = Qa.b;
                    qa.a("imp_depth", value2, false);
                }
            } catch (Exception unused) {
                Qg qg7 = C4000fh.d;
                if (qg7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                } else {
                    qg = qg7;
                }
                qg.getClass();
                Intrinsics.checkNotNullParameter("imp_depth", "key");
                qg.a.a("imp_depth");
            }
            C4000fh.a.getClass();
            M1 m1 = C4000fh.e;
            m1.c = m1.a.mo4828invoke();
            M1 m12 = C4000fh.f;
            m12.c = m12.a.mo4828invoke();
        } catch (Exception e2) {
            Xb.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
            Lazy lazy2 = AbstractC3861aa.a;
            AbstractC4361t9.a(e2);
        }
        C4000fh.a.getClass();
        M1 m13 = C4000fh.e;
        m13.c = m13.a.mo4828invoke();
        M1 m14 = C4000fh.f;
        m14.c = m14.a.mo4828invoke();
        return Unit.INSTANCE;
    }
}
