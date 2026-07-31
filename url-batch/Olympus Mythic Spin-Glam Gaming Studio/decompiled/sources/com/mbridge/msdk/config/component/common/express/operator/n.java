package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

/* compiled from: OperatorMath.java */
/* loaded from: classes13.dex */
public class n {
    private static final List<String> b = Arrays.asList(com.mbridge.msdk.config.component.common.util.c.c("841"), com.mbridge.msdk.config.component.common.util.c.c("842"), com.mbridge.msdk.config.component.common.util.c.c("843"), com.mbridge.msdk.config.component.common.util.c.c("844"), com.mbridge.msdk.config.component.common.util.c.c("845"), com.mbridge.msdk.config.component.common.util.c.c("846"), com.mbridge.msdk.config.component.common.util.c.c("847"), com.mbridge.msdk.config.component.common.util.c.c("848"));
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public n(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    private Object a(double d) {
        return (Double.isNaN(d) || Double.isInfinite(d)) ? Double.valueOf(d) : d == Math.floor(d) ? Integer.valueOf((int) d) : Double.valueOf(b(d));
    }

    private double b(double d) {
        return new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0089 A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:35:0x007d, B:37:0x0089, B:39:0x0099, B:41:0x00a5, B:43:0x00b2, B:45:0x00be, B:47:0x00cb, B:49:0x00d7, B:51:0x00e5, B:54:0x00f3, B:56:0x0100, B:58:0x0105, B:60:0x0111, B:62:0x011e, B:65:0x012c, B:67:0x0139, B:69:0x013e, B:73:0x014e, B:75:0x0163, B:77:0x0168), top: B:34:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099 A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:35:0x007d, B:37:0x0089, B:39:0x0099, B:41:0x00a5, B:43:0x00b2, B:45:0x00be, B:47:0x00cb, B:49:0x00d7, B:51:0x00e5, B:54:0x00f3, B:56:0x0100, B:58:0x0105, B:60:0x0111, B:62:0x011e, B:65:0x012c, B:67:0x0139, B:69:0x013e, B:73:0x014e, B:75:0x0163, B:77:0x0168), top: B:34:0x007d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        double d;
        double d2;
        Object obj2;
        Object obj3;
        if (obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        try {
            d = obj instanceof Number ? ((Number) obj).doubleValue() : 0.0d;
        } catch (Exception e) {
            e = e;
            d = 0.0d;
            d2 = 0.0d;
        }
        try {
            try {
                if ((obj instanceof String) && !TextUtils.isEmpty(obj.toString())) {
                    d = Double.parseDouble(obj.toString());
                }
                if (list == null || list.isEmpty()) {
                    d2 = 0.0d;
                    obj3 = null;
                } else {
                    obj3 = list.get(0);
                    try {
                        d2 = obj3 instanceof Number ? ((Number) obj3).doubleValue() : 0.0d;
                        try {
                            if ((obj3 instanceof String) && !TextUtils.isEmpty(obj3.toString())) {
                                d2 = Double.parseDouble(obj3.toString());
                            }
                        } catch (Exception e2) {
                            e = e2;
                            Exception exc = e;
                            obj2 = obj3;
                            e = exc;
                            q0.b("MathOperator", e.getMessage(), e);
                            obj3 = obj2;
                            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("841"))) {
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        d2 = 0.0d;
                    }
                }
            } catch (Exception e4) {
                e = e4;
                d2 = 0.0d;
                obj2 = null;
                q0.b("MathOperator", e.getMessage(), e);
                obj3 = obj2;
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("841"))) {
                }
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("841"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.abs(d)));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("842"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.ceil(d)));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("843"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.floor(d)));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("844"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.round(d)));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("845"))) {
                return obj3 != null ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.pow(d, d2))) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("846"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.sqrt(d)));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("847"))) {
                return obj3 != null ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(Math.atan2(d, d2))) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            if (!str.equals(com.mbridge.msdk.config.component.common.util.c.c("848"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
            }
            if (d2 > 0.0d) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf((int) (Math.random() * ((int) Math.floor(d2)))));
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e5) {
            q0.b("MathOperator", e5.getMessage());
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (a(str)) {
            return b(str, obj, list);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private boolean a(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("841")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("842")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("843")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("844")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("845")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("846")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("847")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("848"));
    }
}
