package com.meta.analytics.dsp.uinode;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.google.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class P6 extends WebChromeClient {
    public static byte[] A01;
    public final /* synthetic */ PB A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-41, -44, -39, -48, -71, -32, -40, -51, -48, -35, 83, 75, 89, 89, 71, 77, 75, 68, 64, 70, 67, 52, 54, Ascii.SUB, 53};
    }

    public P6(PB pb) {
        this.A00 = pb;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        JA ja;
        C0644Oy c0644Oy;
        C0889Yn c0889Yn;
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(10, 7, 123), consoleMessage.message());
                jSONObject.put(A00(0, 10, 0), consoleMessage.lineNumber());
                jSONObject.put(A00(17, 8, 102), consoleMessage.sourceId());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            ja = this.A00.A0D;
            ja.A04(J9.A0N, null);
            c0644Oy = this.A00.A0E;
            c0644Oy.A04(C8A.A14, jSONObject2);
            c0889Yn = this.A00.A0B;
            c0889Yn.A0E().A5K(jSONObject2);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
