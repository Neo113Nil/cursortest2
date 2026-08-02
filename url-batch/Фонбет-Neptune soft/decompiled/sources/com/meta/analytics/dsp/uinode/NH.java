package com.meta.analytics.dsp.uinode;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class NH implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ NJ A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-58, -57, -44, -38, -39, -97, -57, -47, -58, -45, -48, Ascii.DC4, 33, Ascii.DC2, Ascii.DC4, Ascii.SYN, 39, Ascii.FS, 41, Ascii.FS, 39, 44, -60, -47, -57, -43, -46, -52, -57, -111, -52, -47, -41, -56, -47, -41, -111, -60, -58, -41, -52, -46, -47, -111, -71, -84, -88, -70};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        C0889Yn c0889Yn;
        C0889Yn c0889Yn2;
        C0889Yn c0889Yn3;
        NI ni;
        if (KL.A02(this)) {
            return;
        }
        try {
            str = this.A00.A07;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 35);
            str2 = this.A00.A07;
            if (A00.equals(str2)) {
                return;
            }
            String A002 = A00(22, 26, 33);
            str3 = this.A00.A07;
            Intent intent = new Intent(A002, AbstractC0540Ky.A00(str3));
            intent.addFlags(268435456);
            c0889Yn = this.A00.A0B;
            c0889Yn.A0E().A8g();
            try {
                c0889Yn3 = this.A00.A0B;
                C0527Kj.A0C(c0889Yn3, intent);
                ni = this.A00.A05;
                ni.ACR();
            } catch (C0525Kh e) {
                Throwable cause = e.getCause();
                Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                c0889Yn2 = this.A00.A0B;
                c0889Yn2.A07().A9a(A00(11, 11, 113), C8A.A00, new C8B(th));
            }
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }

    public NH(NJ nj) {
        this.A00 = nj;
    }
}
