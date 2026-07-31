package com.ogury.ad.internal;

import android.util.Base64;
import com.ogury.ad.OguryBidTokenErrorCode;
import com.ogury.ad.OguryBidTokenListener;
import com.ogury.core.OguryError;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;

/* loaded from: classes10.dex */
public final class d9 extends Lambda implements Function1 {
    public final /* synthetic */ q1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ OguryBidTokenListener f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(q1 q1Var, String str, String str2, String str3, String str4, OguryBidTokenListener oguryBidTokenListener) {
        super(1);
        this.a = q1Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = oguryBidTokenListener;
    }

    public final void a(ph e) {
        Intrinsics.checkNotNullParameter(e, "e");
        Logger logger = Logger.INSTANCE;
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        logger.e(logTag, sourceTag, "Error while generating bidder token", e);
        try {
            String jSONObject = this.a.a(this.b, this.c, this.d, this.e).a().toString();
            OguryBidTokenListener oguryBidTokenListener = this.f;
            Intrinsics.checkNotNull(jSONObject);
            byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            String encodeToString = Base64.encodeToString(bytes, 2);
            logger.d(logTag, sourceTag, "Bidder token generated after profig refresh: " + encodeToString);
            Intrinsics.checkNotNull(encodeToString);
            oguryBidTokenListener.onBidTokenGenerated(encodeToString);
        } catch (Exception unused) {
            this.f.onBidTokenGenerationFailed(new OguryError(OguryBidTokenErrorCode.INVALID_CONFIGURATION, "The bid token could not be generated because the SDK configuration is invalid."));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((ph) obj);
        return Unit.INSTANCE;
    }
}
