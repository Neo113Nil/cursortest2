package com.smaato.sdk.ng;

import android.annotation.TargetApi;

/* loaded from: classes6.dex */
public class NextGenError extends Exception {
    private NextGenErrorCode a;

    public NextGenError() {
        this.a = NextGenErrorCode.INTERNAL_ERROR;
    }

    public NextGenErrorCode getErrorCode() {
        return this.a;
    }

    public NextGenError(NextGenErrorCode nextGenErrorCode) {
        super(nextGenErrorCode.getMessage());
        NextGenErrorCode nextGenErrorCode2 = NextGenErrorCode.NO_FILL;
        this.a = nextGenErrorCode;
    }

    public NextGenError(String str) {
        super(str);
        this.a = NextGenErrorCode.INTERNAL_ERROR;
    }

    public NextGenError(NextGenErrorCode nextGenErrorCode, String str) {
        super(str);
        NextGenErrorCode nextGenErrorCode2 = NextGenErrorCode.NO_FILL;
        this.a = nextGenErrorCode;
    }

    public NextGenError(NextGenErrorCode nextGenErrorCode, Throwable th) {
        super(nextGenErrorCode.getMessage(), th);
        NextGenErrorCode nextGenErrorCode2 = NextGenErrorCode.NO_FILL;
        this.a = nextGenErrorCode;
    }

    public NextGenError(String str, Throwable th) {
        super(str, th);
        this.a = NextGenErrorCode.INTERNAL_ERROR;
    }

    public NextGenError(Throwable th) {
        super(th);
        this.a = NextGenErrorCode.INTERNAL_ERROR;
    }

    @TargetApi(24)
    public NextGenError(String str, Throwable th, boolean z, boolean z2) {
        super(str, th, z, z2);
        this.a = NextGenErrorCode.INTERNAL_ERROR;
    }
}
