package com.my.target;

import com.my.target.common.models.IAdLoadingError;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public final class q implements IAdLoadingError {
    public static final q c = new q(1000);
    public static final q d = new q(1002);
    public static final q e = new q(1003);
    public static final q f = new q(IAdLoadingError.LoadErrorType.FORBIDDEN);
    public static final q g = new q(IAdLoadingError.LoadErrorType.NOT_FOUND);
    public static final q h = new q(1500);
    public static final q i = new q(2000);
    public static final q j = new q(2001);
    public static final q k = new q(2002);
    public static final q l = new q(2003);
    public static final q m = new q(2004);
    public static final q n = new q(2005);
    public static final q o = new q(3000);
    public static final q p = new q(3001);
    public static final q q = new q(3002);
    public static final q r = new q(3003);
    public static final q s = new q(3004);
    public static final q t = new q(4001);
    public static final q u = new q(4002);
    public static final q v = new q(5000);
    public static final q w = new q(6000);
    public final int a;
    public final String b;

    private q(int i2) {
        this.a = i2;
        this.b = a(i2);
    }

    public static q a(int i2, String str) {
        return new q(i2, str);
    }

    @Override // com.my.target.common.models.IAdLoadingError
    public int getCode() {
        return this.a;
    }

    @Override // com.my.target.common.models.IAdLoadingError
    public String getMessage() {
        return this.b;
    }

    public String toString() {
        return "AdLoadingError{code=" + this.a + ", message='" + this.b + "'}";
    }

    static String a(int i2) {
        if (i2 == 1403) {
            return "request forbidden error";
        }
        if (i2 == 1404) {
            return "request not found error";
        }
        if (i2 == 1500) {
            return "internal server error";
        }
        if (i2 == 6000) {
            return "internal error";
        }
        if (i2 == 4001) {
            return "reloading not allowed error";
        }
        if (i2 == 4002) {
            return "ad is not loaded yet";
        }
        if (i2 == 5000) {
            return "undefined mediation error";
        }
        if (i2 == 5001) {
            return "ad not loaded from mediation network";
        }
        switch (i2) {
            case 1000:
                return "undefined network error";
            case 1001:
                return "invalid url error";
            case 1002:
                return "hasn't network connection error";
            case 1003:
                return "request timeout error";
            default:
                switch (i2) {
                    case 2000:
                        return "undefined parse error";
                    case 2001:
                        return "empty response error";
                    case 2002:
                        return "invalid json error";
                    case 2003:
                        return "invalid xml error";
                    case 2004:
                        return "invalid ad type error";
                    case 2005:
                        return "required field missed";
                    default:
                        switch (i2) {
                            case 3000:
                                return "undefined data error";
                            case 3001:
                                return "hasn't images error";
                            case 3002:
                                return "hasn't html source error";
                            case 3003:
                                return "hasn't banners error";
                            case 3004:
                                return "invalid banner type error";
                            default:
                                return "undefined error";
                        }
                }
        }
    }

    private q(int i2, String str) {
        this.a = i2;
        this.b = str;
    }
}
