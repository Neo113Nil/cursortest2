package com.mbridge.msdk.config.component.common.express.operator.parts;

/* compiled from: ExpressionResult.java */
/* loaded from: classes6.dex */
public class a {
    private final boolean a;
    private final Object b;

    private a(boolean z, Object obj) {
        this.a = z;
        this.b = obj;
    }

    public static a a(Object obj) {
        return new a(true, obj);
    }

    public static a c() {
        return new a(false, null);
    }

    public boolean b() {
        return this.a;
    }

    public Object a() {
        Object obj = this.b;
        return obj instanceof Boolean ? Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0) : obj instanceof Integer ? String.valueOf(obj) : obj;
    }
}
