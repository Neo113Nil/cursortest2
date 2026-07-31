package com.inmobi.media;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.na, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4204na implements InterfaceC4125ka {
    public final C4047ha a;

    public C4204na(C4047ha incompleteLogData) {
        Intrinsics.checkNotNullParameter(incompleteLogData, "incompleteLogData");
        this.a = incompleteLogData;
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            JSONArray jSONArray = this.a.b;
            Nb logLevel = Nb.c;
            SimpleDateFormat simpleDateFormat = Qb.a;
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scope", "ERROR");
            jSONObject.put("timestamp", Qb.a.format(new Date()));
            jSONObject.put("tag", "IncompleteLogFinalizer");
            jSONObject.put("data", message);
            jSONArray.put(jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void b(String value) {
        Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", "tag");
        Intrinsics.checkNotNullParameter("exitReason", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            this.a.a.put("exitReason", value);
        } catch (Exception unused) {
        }
    }

    public final Object b() {
        final String str = "IncompleteLogFinalizer";
        Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", "tag");
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = this.a.a;
            Intrinsics.checkNotNullParameter(jSONObject, "<this>");
            if (!Intrinsics.areEqual(jSONObject.toString(), JsonUtils.EMPTY_JSON)) {
                JSONArray jSONArray = this.a.b;
                Intrinsics.checkNotNullParameter(jSONArray, "<this>");
                if (jSONArray.length() != 0) {
                    CoroutineScope coroutineScope = AbstractC3995fc.a;
                    AbstractC3967ec.a(new Function0() { // from class: com.inmobi.media.na$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final Object mo4828invoke() {
                            return C4204na.a(C4204na.this, str);
                        }
                    });
                }
            }
            return Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static final Unit a(C4204na c4204na, String str) {
        C4047ha c4047ha = c4204na.a;
        JSONObject jSONObject = c4047ha.a;
        JSONArray jSONArray = c4047ha.b;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("vitals", jSONObject);
        jSONObject2.put(CreativeInfo.f, jSONArray);
        String jSONObject3 = jSONObject2.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
        AbstractC4023gc.a(str, jSONObject3, c4204na.a.c.a);
        String str2 = c4204na.a.c.a;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Db db = c4204na.a.c;
        BuildersKt__BuildersKt.runBlocking$default(null, new C4177ma(new Db(str2, timeInMillis, 0, db.d, true, db.f), null), 1, null);
        return Unit.INSTANCE;
    }

    public final Object a() {
        try {
            Result.Companion companion = Result.INSTANCE;
            CoroutineScope coroutineScope = AbstractC3995fc.a;
            return Result.m8023constructorimpl(Result.m8022boximpl(AbstractC3967ec.a(new Function0() { // from class: com.inmobi.media.na$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return C4204na.a(C4204na.this);
                }
            })));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static final Unit a(C4204na c4204na) {
        AbstractC4023gc.a(c4204na.a.c.a);
        BuildersKt__BuildersKt.runBlocking$default(null, new C4151la(c4204na, null), 1, null);
        return Unit.INSTANCE;
    }
}
