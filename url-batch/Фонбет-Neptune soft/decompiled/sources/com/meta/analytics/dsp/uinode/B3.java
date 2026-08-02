package com.meta.analytics.dsp.uinode;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.PointerIconCompat;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class B3 extends FrameLayout implements MD, TD {
    public static byte[] A0I;
    public static String[] A0J = {"Ky6zrcoV7NYtZpO3AnBVhERgUe61TP4A", "7", "MIS71VG0t7feKobdqgnq1TwubiJ1N09z", "nEwmQOfqxRkjYDAAu8TY0n89Pulsb82", "nm6mhrtocmSPL4qM7u9wOkkvqXPHcra", "ADTrDSFqqVysA22fSklmKPGMwsWvvDiN", "oNlgPu", "28CTXOUAXLtNi6XFaROwO0buCKC9QIVi"};
    public C5T A00;
    public C5V A01;
    public PL A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AbstractC0992b5 A06;
    public final C0889Yn A07;
    public final J2 A08;
    public final JA A09;
    public final ViewOnSystemUiVisibilityChangeListenerC0543Lb A0A;
    public final C0548Lg A0B;
    public final MC A0C;
    public final InterfaceC0577Mj A0D;
    public final P3 A0E;
    public final PB A0F;
    public final RD A0G;
    public final RE A0H;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{-88, -43, -43, -46, -43, -125, -58, -43, -56, -60, -41, -52, -47, -54, -125, -58, -46, -47, -55, -52, -54, -125, -83, -74, -78, -79, 6, Ascii.VT, 4, Ascii.FF, 17, 8, 7, 2, 4, 7, -95, -90, -97, -89, -84, -93, -94, -99, -97, -94, -99, -89, -84, -94, -93, -74, -107, -102, -109, -101, -96, -105, -106, -111, -109, -106, -111, -90, -95, -90, -109, -98, -115, -110, -117, -109, -104, -113, -114, -119, -98, -109, -105, -113, -119, -99, -102, -113, -104, -98, -90, -81, -84, -90, -82, -94, -74, -78, -72, -75, -90, -88, Ascii.EM, Ascii.ETB, 9, Ascii.SYN, 7, 16, Ascii.CR, 7, Ascii.SI};
    }

    static {
        A0D();
    }

    public B3(C0889Yn c0889Yn, J2 j2, MC mc, AbstractC0992b5 abstractC0992b5, InterfaceC0577Mj interfaceC0577Mj, int i) {
        super(c0889Yn);
        int i2;
        this.A00 = new TQ(this);
        TP tp = new TP(this);
        this.A0G = tp;
        this.A03 = true;
        this.A07 = c0889Yn;
        this.A08 = j2;
        this.A0C = mc;
        this.A06 = abstractC0992b5;
        this.A0D = interfaceC0577Mj;
        PB A02 = PC.A02(abstractC0992b5.A0S());
        if (A02 == null) {
            this.A0F = new PB(c0889Yn, abstractC0992b5, j2, i);
            this.A04 = false;
        } else {
            this.A0F = A02;
            this.A04 = true;
        }
        JA A0K = this.A0F.A0K();
        this.A09 = A0K;
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new TO(this));
        AbstractC0556Lo.A0G(PointerIconCompat.TYPE_HELP, this.A0F.A0O());
        if (abstractC0992b5.A0g()) {
            i2 = 0;
            P3 p3 = new P3(c0889Yn, j2, abstractC0992b5, new C01946c(c0889Yn), A0K, mc, interfaceC0577Mj, new TN(this));
            this.A0E = p3;
            p3.A0N();
            this.A0F.A0O().setOnTouchListener(new ViewOnTouchListenerC0645Oz(this));
            addView(p3, new FrameLayout.LayoutParams(-1, -1));
        } else {
            i2 = 0;
            this.A0E = null;
        }
        ViewGroup mediaView = getMediaView();
        RE re = new RE(mediaView, 1, new WeakReference(tp), c0889Yn);
        this.A0H = re;
        re.A0W(abstractC0992b5.A0C());
        re.A0X(abstractC0992b5.A0D());
        this.A0F.A0e(re);
        ViewOnSystemUiVisibilityChangeListenerC0543Lb viewOnSystemUiVisibilityChangeListenerC0543Lb = new ViewOnSystemUiVisibilityChangeListenerC0543Lb(this);
        this.A0A = viewOnSystemUiVisibilityChangeListenerC0543Lb;
        viewOnSystemUiVisibilityChangeListenerC0543Lb.A05(EnumC0542La.A03);
        setBackgroundColor(i2);
        if (C0478Ih.A1W(c0889Yn)) {
            c0889Yn.A0A().AGx(mediaView, abstractC0992b5.A12(), false, false, true);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean A18 = abstractC0992b5.A18();
            String A0B = A0B(68, 18, 1);
            String A0B2 = A0B(36, 16, 21);
            String A0B3 = A0B(52, 16, 9);
            String A0B4 = A0B(26, 10, 122);
            if (A18) {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, i2);
                jSONObject.put(A0B, abstractC0992b5.A0I());
            } else if (C0541Kz.A05(abstractC0992b5.A0O())) {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, 1);
                jSONObject.put(A0B, abstractC0992b5.A0I());
            }
            this.A0F.A0j(jSONObject);
        } catch (JSONException unused) {
            this.A0F.A0M().A04(C8A.A15, A0B(0, 26, 58));
        }
    }

    private void A0C() {
        C0652Pg A0B = new C0650Pe(this.A07, this.A06.A0x().A0E(), this.A06.A10()).A08(this.A06.A0w().A01()).A0B();
        addView(A0B, new FrameLayout.LayoutParams(-1, -1));
        A0B.A04(new TL(this));
    }

    private final void A0E() {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0E().A5H();
            this.A0F.A0X();
        } else {
            this.A07.A0E().A5I();
            if (this.A0F.A0k()) {
                AGY();
                C0889Yn c0889Yn = this.A07;
                if (A0J[6].length() != 6) {
                    throw new RuntimeException();
                }
                A0J[7] = "2uXfZ95rl8UwGJAIvPTgfy7qu4p9pGiW";
                if (C0478Ih.A1W(c0889Yn)) {
                    this.A07.A0A().ABG();
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.A0F.A0O().getParent();
        if (viewGroup != null) {
            ViewGroup parent = this.A0F.A0O();
            viewGroup.removeView(parent);
        }
        addView(this.A0F.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3U(this, new RelativeLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT >= 19 && this.A06.A0h()) {
            this.A0A.A05(EnumC0542La.A04);
        }
    }

    private void A0F(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0611Nr c0611Nr = new C0611Nr(this.A07, this.A0D.A6R(), this.A0H, this.A0B, this.A08, this.A06.A0y(), this.A0C);
        HashMap hashMap = new HashMap();
        hashMap.put(A0B(86, 12, 26), A0B(98, 9, 123));
        c0611Nr.A07(this.A06.A12(), str, hashMap);
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void A8S() {
        A0F(this.A06.A0x().A0F().A05());
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void A8T(String str) {
        A0F(str);
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void A8X() {
        this.A0C.A43(this.A0D.A5s());
        Q7 serverSideRewardHandler = new Q7(this.A07, this.A0D, this.A06.A0T(), this.A0C);
        serverSideRewardHandler.A05();
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void A9K() {
        new Handler(Looper.getMainLooper()).post(new TM(this));
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void A9Q(Intent intent, Bundle bundle, C5V c5v) {
        PB.A0B().incrementAndGet();
        c5v.A0N(this.A00);
        this.A01 = c5v;
        A0E();
        if (this.A06.A0x().A0P()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void ABb() {
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void ABf() {
        P3 p3 = this.A0E;
        if (p3 != null) {
            p3.A0P();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void ACL(boolean z) {
        P3 p3 = this.A0E;
        if (p3 != null) {
            p3.A0R(z);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void ACW(boolean z) {
        P3 p3 = this.A0E;
        if (p3 != null) {
            p3.A0S(z);
        }
        if (z) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void ACu(boolean z) {
        P3 p3 = this.A0E;
        if (p3 != null) {
            p3.A0T(z);
        }
        boolean z2 = this.A03;
        if (A0J[1].length() == 11) {
            throw new RuntimeException();
        }
        A0J[5] = "5WCDyt3aDRAQqvSthuq2O6x8YHnGvtvN";
        if (z2) {
            this.A03 = false;
        } else if (z) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void AD8() {
        P3 p3 = this.A0E;
        if (p3 != null) {
            p3.A0Q();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void ADc(boolean z) {
        P3 p3 = this.A0E;
        if (p3 != null) {
            p3.A0U(z);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void ADe(boolean z) {
        P3 p3 = this.A0E;
        if (p3 != null) {
            p3.A0V(z);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void ADr(String str) {
        String urlString = this.A06.A13(str);
        if (urlString == null) {
            return;
        }
        C0537Kv.A0M(new C0537Kv(), this.A07, AbstractC0540Ky.A00(urlString), this.A06.A12());
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void AFT(Bundle bundle) {
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void AGY() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.TD
    public final void close() {
        C5V c5v = this.A01;
        if (c5v == null) {
            return;
        }
        c5v.finish(4);
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public String getCurrentClientToken() {
        return this.A06.A12();
    }

    private ViewGroup getMediaView() {
        P3 p3 = this.A0E;
        return p3 != null ? p3 : this.A0F.A0O();
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void onDestroy() {
        if (C0478Ih.A1W(this.A07)) {
            this.A07.A0A().AGk(getMediaView());
        }
        P3 p3 = this.A0E;
        if (p3 != null) {
            p3.A0O();
        }
        this.A0A.A03();
        this.A08.A9X(this.A06.A12(), new C0602Ni().A02(this.A0B).A03(this.A0H).A05());
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        PC.A04(this.A06.A0S());
        PB.A0B().decrementAndGet();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(MC mc) {
    }

    public void setRtfActionsJavascriptListener(PL pl) {
        this.A02 = pl;
    }
}
