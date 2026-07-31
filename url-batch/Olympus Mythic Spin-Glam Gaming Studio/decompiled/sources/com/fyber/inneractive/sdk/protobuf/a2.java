package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes11.dex */
public abstract class a2 {
    public static final z1 a;
    public static final z1 b;

    static {
        z1 z1Var = null;
        try {
            z1Var = (z1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = z1Var;
        b = new z1();
    }
}
