package com.meta.analytics.dsp.uinode;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class V4 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, InterfaceC02137b {
    public static byte[] A02;
    public final C0889Yn A00;
    public final /* synthetic */ V2 A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{43, Ascii.SO, 74, 9, Ascii.VT, 4, 4, 5, Ascii.RS, 74, 8, Ascii.SI, 74, 9, 6, 3, 9, 1, Ascii.SI, Ascii.SO, 74, 8, Ascii.SI, Ascii.FF, 5, Ascii.CAN, Ascii.SI, 74, 3, Ascii.RS, 74, 3, Ascii.EM, 74, Ascii.FS, 3, Ascii.SI, Ascii.GS, Ascii.SI, Ascii.SO, 68, 66, 109, 104, 98, 106, 114, 33, 105, 96, 113, 113, 100, 111, 100, 101, 33, 117, 110, 110, 33, 103, 96, 114, 117, 47, Ascii.DC4, 16, 19, 39, 54, 59, 55, 60, 49, 55, Ascii.FS, 55, 38, 37, Base64.padSymbol, 32, 57, 56, Ascii.EM, 86, 2, Ascii.EM, 3, Ascii.NAK, Ascii.RS, 86, Ascii.DC2, Ascii.ETB, 2, Ascii.ETB, 86, 4, 19, Ascii.NAK, Ascii.EM, 4, Ascii.DC2, 19, Ascii.DC2, 90, 86, 6, Ascii.SUB, 19, Ascii.ETB, 5, 19, 86, 19, Ascii.CAN, 5, 3, 4, 19, 86, 2, Ascii.EM, 3, Ascii.NAK, Ascii.RS, 86, 19, 0, 19, Ascii.CAN, 2, 5, 86, 4, 19, Ascii.ETB, Ascii.NAK, Ascii.RS, 86, 2, Ascii.RS, 19, 86, Ascii.ETB, Ascii.DC2, 86, 32, Ascii.US, 19, 1, 86, Ascii.DC4, Ascii.SI, 86, 4, 19, 2, 3, 4, Ascii.CAN, Ascii.US, Ascii.CAN, 17, 86, 16, Ascii.ETB, Ascii.SUB, 5, 19, 86, Ascii.US, 16, 86, Ascii.SI, Ascii.EM, 3, 86, Ascii.US, Ascii.CAN, 2, 19, 4, Ascii.NAK, 19, 6, 2, 86, 2, Ascii.RS, 19, 86, 19, 0, 19, Ascii.CAN, 2, 88, 33, 39, 60, 94, 68, 89};
    }

    public V4(V2 v2, C0889Yn c0889Yn) {
        this.A01 = v2;
        this.A00 = c0889Yn;
    }

    public /* synthetic */ V4(V2 v2, C0889Yn c0889Yn, VD vd) {
        this(v2, c0889Yn);
    }

    private Map<String, String> A01() {
        RE re;
        C0548Lg c0548Lg;
        JS js;
        boolean z;
        boolean z2;
        JS js2;
        C0602Ni c0602Ni = new C0602Ni();
        re = this.A01.A0R;
        C0602Ni A03 = c0602Ni.A03(re);
        c0548Lg = this.A01.A0f;
        Map<String, String> A05 = A03.A02(c0548Lg).A05();
        js = this.A01.A0I;
        if (js != null) {
            js2 = this.A01.A0I;
            A05.put(A00(201, 3, 11), String.valueOf(js2.A04()));
        }
        z = this.A01.A0W;
        if (z) {
            z2 = this.A01.A0W;
            A05.put(A00(Opcodes.IFNULL, 3, 116), String.valueOf(z2));
        }
        return A05;
    }

    private void A03(Map<String, String> extraData) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(extraData);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02137b
    public final C0889Yn A5t() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0548Lg c0548Lg;
        C0889Yn c0889Yn;
        C0548Lg c0548Lg2;
        C0889Yn c0889Yn2;
        C0548Lg c0548Lg3;
        C0548Lg c0548Lg4;
        if (KL.A02(this)) {
            return;
        }
        try {
            c0548Lg = this.A01.A0f;
            boolean A08 = c0548Lg.A08();
            String A00 = A00(66, 17, 105);
            if (!A08) {
                Log.e(A00, A00(83, 115, 77));
            }
            c0889Yn = this.A01.A0c;
            int minimumElapsedTime = C0478Ih.A0G(c0889Yn);
            if (minimumElapsedTime >= 0) {
                c0548Lg3 = this.A01.A0f;
                if (c0548Lg3.A03() < minimumElapsedTime) {
                    c0548Lg4 = this.A01.A0f;
                    if (!c0548Lg4.A07()) {
                        Log.e(A00, A00(0, 41, 81));
                        return;
                    } else {
                        Log.e(A00, A00(41, 25, 58));
                        return;
                    }
                }
            }
            c0548Lg2 = this.A01.A0f;
            c0889Yn2 = this.A01.A0c;
            if (c0548Lg2.A09(c0889Yn2)) {
                if (this.A01.A0a != null) {
                    this.A01.A0a.A0N(A01());
                    return;
                }
                return;
            }
            A03(A01());
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        C0600Ng c0600Ng;
        C0600Ng c0600Ng2;
        View view3;
        View view4;
        C0600Ng c0600Ng3;
        C0600Ng c0600Ng4;
        view2 = this.A01.A04;
        if (view2 != null) {
            c0600Ng = this.A01.A0L;
            if (c0600Ng != null) {
                c0600Ng2 = this.A01.A0L;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                c0600Ng2.setBounds(0, 0, width, view4.getHeight());
                c0600Ng3 = this.A01.A0L;
                c0600Ng4 = this.A01.A0L;
                c0600Ng3.A0D(!c0600Ng4.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0548Lg c0548Lg;
        C0889Yn c0889Yn;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        c0548Lg = this.A01.A0f;
        c0889Yn = this.A01.A0c;
        view2 = this.A01.A04;
        c0548Lg.A06(c0889Yn, motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
