package com.smaato.sdk.banner.widget;

import com.smaato.sdk.ng.NextGenError;
import com.smaato.sdk.ng.NextGenErrorCode;

/* loaded from: classes12.dex */
final class ErrorMapper {
    ErrorMapper() {
    }

    static BannerError mapBannerError(Throwable th) {
        if (th == null) {
            return BannerError.INTERNAL_ERROR;
        }
        if (th instanceof NextGenError) {
            NextGenError nextGenError = (NextGenError) th;
            if (nextGenError.getErrorCode() != null) {
                switch (AnonymousClass1.$SwitchMap$com$smaato$sdk$ng$NextGenErrorCode[nextGenError.getErrorCode().ordinal()]) {
                }
                return BannerError.INTERNAL_ERROR;
            }
            return BannerError.INTERNAL_ERROR;
        }
        return BannerError.INTERNAL_ERROR;
    }

    /* renamed from: com.smaato.sdk.banner.widget.ErrorMapper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$ng$NextGenErrorCode;

        static {
            int[] iArr = new int[NextGenErrorCode.values().length];
            $SwitchMap$com$smaato$sdk$ng$NextGenErrorCode = iArr;
            try {
                iArr[NextGenErrorCode.NO_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$NextGenErrorCode[NextGenErrorCode.AUCTION_NO_AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$NextGenErrorCode[NextGenErrorCode.INVALID_ZONE_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$NextGenErrorCode[NextGenErrorCode.INVALID_SIGNAL_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$NextGenErrorCode[NextGenErrorCode.INVALID_URL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$NextGenErrorCode[NextGenErrorCode.OUT_OF_MEMORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$NextGenErrorCode[NextGenErrorCode.EXPIRED_AD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }
}
