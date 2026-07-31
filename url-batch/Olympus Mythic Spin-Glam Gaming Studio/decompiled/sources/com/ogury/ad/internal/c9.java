package com.ogury.ad.internal;

import android.util.Base64;
import com.ogury.ad.OguryBidTokenErrorCode;
import com.ogury.ad.OguryBidTokenListener;
import com.ogury.core.OguryError;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;

/* loaded from: classes10.dex */
public final class c9 extends Lambda implements Function1 {
    public final /* synthetic */ q1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ OguryBidTokenListener f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(q1 q1Var, String str, String str2, String str3, String str4, OguryBidTokenListener oguryBidTokenListener) {
        super(1);
        this.a = q1Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = oguryBidTokenListener;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke(pf profigResponse) {
        OguryError oguryError;
        String str;
        Intrinsics.checkNotNullParameter(profigResponse, "profigResponse");
        te teVar = profigResponse.d;
        if (teVar.a) {
            str = this.a.a(this.b, this.c, this.d, this.e).a().toString();
            Logger.INSTANCE.d(LogTag.INTERNAL, SourceTag.ADS, "Bidder token generated: " + str);
        } else {
            int i = teVar.d;
            if (i == 0) {
                Logger.INSTANCE.d(LogTag.INTERNAL, SourceTag.ADS, "Ad serving disabled, generating token in mode 0.");
                String str2 = profigResponse.d.c;
                int hashCode = str2.hashCode();
                if (hashCode == -1984720000) {
                    if (str2.equals("CONSENT_DENIED")) {
                        oguryError = new OguryError(OguryBidTokenErrorCode.AD_DISABLED_CONSENT_DENIED, "The bid token could not be generated because ads are disabled; the user has denied consent for advertising");
                        this.f.onBidTokenGenerationFailed(oguryError);
                    }
                    oguryError = new OguryError(OguryBidTokenErrorCode.AD_DISABLED_UNSPECIFIED_REASON, "The bid token could not be generated because ads are disabled for an unspecified reason.");
                    this.f.onBidTokenGenerationFailed(oguryError);
                } else if (hashCode != -1879742975) {
                    if (hashCode == 659206911 && str2.equals("COUNTRY_NOT_OPEN")) {
                        oguryError = new OguryError(OguryBidTokenErrorCode.AD_DISABLED_COUNTRY_NOT_OPENED, "The bid token could not be generated because ads are disabled; the user’s country is not yet available for advertising.");
                        this.f.onBidTokenGenerationFailed(oguryError);
                    }
                    oguryError = new OguryError(OguryBidTokenErrorCode.AD_DISABLED_UNSPECIFIED_REASON, "The bid token could not be generated because ads are disabled for an unspecified reason.");
                    this.f.onBidTokenGenerationFailed(oguryError);
                } else {
                    if (str2.equals("CONSENT_MISSING")) {
                        oguryError = new OguryError(OguryBidTokenErrorCode.AD_DISABLED_CONSENT_MISSING, "The bid token could not be generated because ads are disabled; user consent is missing or has not been provided.");
                        this.f.onBidTokenGenerationFailed(oguryError);
                    }
                    oguryError = new OguryError(OguryBidTokenErrorCode.AD_DISABLED_UNSPECIFIED_REASON, "The bid token could not be generated because ads are disabled for an unspecified reason.");
                    this.f.onBidTokenGenerationFailed(oguryError);
                }
            } else if (i == 1) {
                Logger.INSTANCE.d(LogTag.INTERNAL, SourceTag.ADS, "Ad serving disabled, generating token in mode 1.");
                str = this.a.a(this.b, this.c, this.d, this.e).a().toString();
            }
            str = null;
        }
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return Base64.encodeToString(bytes, 2);
    }
}
