package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: assets/audience_network.dex */
public class LF implements InvocationHandler {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C02177f A01;
    public final /* synthetic */ LinkedBlockingQueue A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{16, Ascii.SO, Ascii.ETB, Ascii.SO, Ascii.ESC, Ascii.DC2, Ascii.FF, Ascii.NAK, 19, 34, 1, Ascii.RS, Ascii.SUB, Ascii.ETB, 34, -4, Ascii.SI, Ascii.ESC, 19, Ascii.GS, Ascii.ESC, 42, 10, 47, 38, Ascii.ESC, -75, -77, -62, -92, -81, -70, -61, -77, 40, 39, -4, 33, Ascii.RS, Ascii.FS, 36, 44, 46, 38, 44, Ascii.VT, Ascii.RS, Ascii.SUB, Ascii.GS, 50};
    }

    public LF(int i, LinkedBlockingQueue linkedBlockingQueue, C02177f c02177f) {
        this.A00 = i;
        this.A02 = linkedBlockingQueue;
        this.A01 = c02177f;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            if (method.getName().equals(A00(34, 16, 122)) && objArr.length == 1 && (objArr[0] instanceof List)) {
                for (Object c : (List) objArr[0]) {
                    String str = (String) c.getClass().getMethod(A00(7, 12, 111), new Class[0]).invoke(c, new Object[0]);
                    int intValue = ((Integer) c.getClass().getMethod(A00(19, 7, 119), new Class[0]).invoke(c, new Object[0])).intValue();
                    if (str == null && intValue == this.A00) {
                        byte[] value = (byte[]) c.getClass().getMethod(A00(26, 8, 15), new Class[0]).invoke(c, new Object[0]);
                        this.A02.put(value);
                        return null;
                    }
                }
                this.A02.put(null);
            }
        } catch (Throwable t) {
            this.A01.A07().A9a(A00(0, 7, 106), C8A.A1G, new C8B(t));
        }
        return null;
    }
}
