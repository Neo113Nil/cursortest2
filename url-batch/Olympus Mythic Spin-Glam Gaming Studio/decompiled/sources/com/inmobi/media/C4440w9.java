package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Objects;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.w9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4440w9 implements Xg {
    public final String a;
    public InMobiJsonResponse b;

    public C4440w9(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.a = content;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.inmobi.media.Xg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        C4414v9 c4414v9;
        int i;
        C4440w9 c4440w9;
        try {
            if (continuation instanceof C4414v9) {
                c4414v9 = (C4414v9) continuation;
                int i2 = c4414v9.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c4414v9.d = i2 - Integer.MIN_VALUE;
                    Object obj = c4414v9.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c4414v9.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Intrinsics.checkNotNullParameter(InMobiJsonResponse.class, "clazz");
                        Intrinsics.checkNotNullParameter(InMobiJsonResponse.class, "type");
                        String str = this.a;
                        c4414v9.a = this;
                        c4414v9.d = 1;
                        JSONObject jsonObject = new JSONObject(str);
                        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                        Intrinsics.checkNotNullParameter(InMobiJsonResponse.class, "type");
                        obj = InMobiJsonResponse.class.cast(AbstractC4494ya.a(jsonObject, InMobiJsonResponse.class, null, null));
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c4440w9 = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c4440w9 = c4414v9.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    c4440w9.b = (InMobiJsonResponse) obj;
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            c4440w9.b = (InMobiJsonResponse) obj;
            return Unit.INSTANCE;
        } catch (Throwable th) {
            ExceptionsKt.stackTraceToString(th);
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4108jj(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Boxing.boxShort((short) (!(th instanceof JSONException) ? th instanceof ClassCastException ? 2310 : 2311 : 2309))))));
        }
        c4414v9 = new C4414v9(this, (ContinuationImpl) continuation);
        Object obj2 = c4414v9.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4414v9.d;
    }

    @Override // com.inmobi.media.Xg
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InMobiJsonResponse b() {
        Objects.toString(this.b);
        return this.b;
    }

    @Override // com.inmobi.media.Xg
    public final void a() {
        if (this.b == null || this.a.length() == 0) {
            throw new Zg(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4108jj(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 3))));
        }
    }
}
