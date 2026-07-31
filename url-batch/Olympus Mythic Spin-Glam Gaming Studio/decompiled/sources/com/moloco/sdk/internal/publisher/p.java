package com.moloco.sdk.internal.publisher;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.a;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.publisher.MolocoAdError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class p {

    @NotNull
    public static final a c = new a(null);
    public static final int d = 0;

    @NotNull
    public static final String e = "BidLoader";

    @NotNull
    public final com.moloco.sdk.internal.ortb.b a;

    @NotNull
    public final q b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BidLoader", f = "BidLoader.kt", l = {34, 47}, m = "parse")
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return p.this.a(null, null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BidLoader", f = "BidLoader.kt", l = {TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m = "parseBidResponse")
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return p.this.b(null, null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BidLoader", f = "BidLoader.kt", l = {59}, m = "processBidResponse$moloco_sdk_release")
    public static final class d extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return p.this.a(null, this);
        }
    }

    public p(@NotNull com.moloco.sdk.internal.ortb.b bidResponseParser, @NotNull q bidProcessor) {
        Intrinsics.checkNotNullParameter(bidResponseParser, "bidResponseParser");
        Intrinsics.checkNotNullParameter(bidProcessor, "bidProcessor");
        this.a = bidResponseParser;
        this.b = bidProcessor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if (r4 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fc, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, Continuation continuation) {
        c cVar;
        int i;
        p pVar;
        String str3;
        com.moloco.sdk.internal.x xVar;
        String str4;
        Map emptyMap;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.e = i2 - Integer.MIN_VALUE;
                Object obj = cVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.ortb.b bVar = this.a;
                    cVar.a = this;
                    cVar.b = str2;
                    cVar.e = 1;
                    obj = bVar.a(str, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pVar = this;
                    str3 = str2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = (String) cVar.b;
                    pVar = (p) cVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                xVar = (com.moloco.sdk.internal.x) obj;
                if (xVar instanceof x.a) {
                    if (xVar instanceof x.b) {
                        return new x.b(((com.moloco.sdk.internal.ortb.model.g) ((x.b) xVar).a()).b().get(0).b().get(0));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                x.a aVar = (x.a) xVar;
                com.moloco.sdk.internal.o a2 = pVar.a((com.moloco.sdk.internal.ortb.a) aVar.a());
                Object a3 = aVar.a();
                a.C1536a c1536a = a3 instanceof a.C1536a ? (a.C1536a) a3 : null;
                Exception b2 = c1536a != null ? c1536a.b() : null;
                Object a4 = aVar.a();
                a.b bVar2 = a4 instanceof a.b ? (a.b) a4 : null;
                List<String> b3 = bVar2 != null ? bVar2.b() : null;
                if (b3 != null) {
                    List<String> list = !b3.isEmpty() ? b3 : null;
                    if (list != null) {
                        str4 = CollectionsKt.joinToString$default(list, StringUtils.COMMA, " missingFields=", null, 0, null, null, 60, null);
                    }
                }
                str4 = "";
                MolocoLogger.error$default(MolocoLogger.INSTANCE, e, "parseBidResponse failed to parse BID json string. subType=" + a2 + str4, b2, false, 8, null);
                MolocoAdError.ErrorType errorType = MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
                if (b3 != null) {
                    List<String> list2 = !b3.isEmpty() ? b3 : null;
                    if (list2 != null) {
                        String joinToString$default = CollectionsKt.joinToString$default(list2, StringUtils.COMMA, null, null, 0, null, null, 62, null);
                        if (joinToString$default != null) {
                            emptyMap = MapsKt.mapOf(TuplesKt.to("missing_fields", joinToString$default));
                        }
                    }
                }
                emptyMap = MapsKt.emptyMap();
                return new x.a(com.moloco.sdk.internal.u.a(str3, errorType, a2, emptyMap));
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.e;
        if (i != 0) {
        }
        xVar = (com.moloco.sdk.internal.x) obj2;
        if (xVar instanceof x.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull String str2, @NotNull Continuation continuation) {
        b bVar;
        int i;
        p pVar;
        String str3;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.e = i2 - Integer.MIN_VALUE;
                Object obj = bVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, e, "parse() called with bidResponseJson: " + str2, false, 4, null);
                    bVar.a = this;
                    bVar.b = str;
                    bVar.e = 1;
                    obj = a(str2, bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pVar = this;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) bVar.b;
                    pVar = (p) bVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                String str4 = str;
                str3 = (String) obj;
                if (str3 != null) {
                    return new x.a(com.moloco.sdk.internal.u.a(str4, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR, com.moloco.sdk.internal.o.b, null, 8, null));
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "Processed the bidResponse, proceeding with parsing it.", null, false, 12, null);
                bVar.a = null;
                bVar.b = null;
                bVar.e = 2;
                obj = pVar.b(str3, str4, bVar);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.e;
        if (i != 0) {
        }
        String str42 = str;
        str3 = (String) obj2;
        if (str3 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @VisibleForTesting
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull Continuation continuation) {
        d dVar;
        int i;
        String str2;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d = i2 - Integer.MIN_VALUE;
                Object obj = dVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    q qVar = this.b;
                    dVar.a = str;
                    dVar.d = 1;
                    obj = qVar.a(str, dVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) dVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                str2 = (String) obj;
                if (str2 != null) {
                    return str;
                }
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, e, "Found no pre-preprocessor for the current mediation. Returning the original bid response.", null, false, 12, null);
                return str2;
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dVar.d;
        if (i != 0) {
        }
        str2 = (String) obj2;
        if (str2 != null) {
        }
    }

    public final com.moloco.sdk.internal.o a(com.moloco.sdk.internal.ortb.a aVar) {
        if (aVar instanceof a.C1536a) {
            return com.moloco.sdk.internal.o.c;
        }
        if (aVar instanceof a.b) {
            return com.moloco.sdk.internal.o.d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
