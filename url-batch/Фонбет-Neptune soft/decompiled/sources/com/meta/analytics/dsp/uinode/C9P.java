package com.meta.analytics.dsp.uinode;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.9P, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9P extends UL {
    public static byte[] A0F;
    public static String[] A0G = {"hEO5MspmmQwWZDjfO9hYkGtE8t8ljCUN", "895GOd6GqHS2SDNwtQvAqIE", "zBXblOu1CdgXx49mdyV8flA", "GxqIbNjcrUQMSJiuMkyJv1mwkudVYaGP", "be3ZgXhlaup3yXbKLr41yKjcTusIQNjx", "HLi8FTj59ZkYUe8FmXrpO0CEflvtIm0o", "7bereGXxKpIS6kk2UNHV0kt11i4QSfeP", "LRvrjmvhZNKPrr4qRukG9JYrfPQqD7wd"};
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public AbstractC0992b5 A03;
    public C01946c A04;
    public C01333r A05;
    public O2 A06;
    public C0725Sb A07;
    public RD A08;
    public RE A09;
    public String A0A;
    public List<C0661Pp> A0B;
    public boolean A0C;
    public final C0889Yn A0D;
    public final C0548Lg A0E;

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0G;
            if (strArr[0].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[5] = "I427OJiZERIl1pgFYs7VIJxgJMuHqTWY";
            strArr2[4] = "m1VK8a3APoHjuOOKlTc7gi9yCeUy6Tbh";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
            i4++;
        }
    }

    public static void A0B() {
        A0F = new byte[]{118, 115, 72, 115, 118, 99, 118, 72, 117, 98, 121, 115, 123, 114, 117, 98, 112, 102, 117, 99, 98, 99, 81, 110, 99, 98, 104, 70, 99, 67, 102, 115, 102, 69, 114, 105, 99, 107, 98};
    }

    static {
        A0B();
        A0H = (int) (LD.A02 * 48.0f);
        A0I = (int) (LD.A02 * 8.0f);
        A0J = (int) (LD.A02 * 8.0f);
        A0L = (int) (LD.A02 * 56.0f);
        A0K = (int) (LD.A02 * 12.0f);
    }

    public C9P(C0889Yn c0889Yn, J2 j2, C01946c c01946c, MC mc, FS fs) {
        super(c0889Yn, j2, mc, fs);
        this.A0E = new C0548Lg();
        this.A0C = false;
        super.A07 = true;
        super.A06 = new Q7(c0889Yn, new U8(), super.A0A.A0T(), mc);
        this.A04 = c01946c;
        this.A0D = c0889Yn;
    }

    public C9P(C0889Yn c0889Yn, J2 j2, C01946c c01946c, MC mc, FU fu) {
        super(c0889Yn, j2, mc, fu);
        this.A0E = new C0548Lg();
        this.A0C = false;
        this.A04 = c01946c;
        this.A0D = c0889Yn;
    }

    private AbstractC0992b5 A00(Intent intent) {
        if (super.A07) {
            return (AbstractC0992b5) intent.getSerializableExtra(A09(14, 25, 77));
        }
        return (AbstractC0992b5) intent.getSerializableExtra(A09(0, 14, 93));
    }

    private final void A0C() {
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.A02 = null;
        }
        C01333r c01333r = this.A05;
        if (c01333r != null) {
            c01333r.removeAllViews();
            this.A05.A1Q();
            this.A05 = null;
        }
        O2 o2 = this.A06;
        if (o2 != null) {
            o2.removeAllViews();
            this.A06 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x012e, code lost:
    
        if (r6 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0130, code lost:
    
        r24.A0D.A0A().AGv(r24.A05, r24.A0A.A12(), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0141, code lost:
    
        A0U(r24.A02, false, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0146, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x014e, code lost:
    
        if (r6 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void A0D(int i, Bundle bundle) {
        int extraSpacing;
        int i2;
        int height;
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.A02 = linearLayout;
        if (i == 1) {
            linearLayout.setGravity(17);
        } else {
            linearLayout.setGravity(48);
        }
        this.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A02.setOrientation(1);
        int i3 = LD.A03.widthPixels;
        int i4 = LD.A03.heightPixels;
        if (i == 1) {
            extraSpacing = Math.min(i3 - (A0I * 4), i4 / 2);
            i2 = (i3 - extraSpacing) / 8;
            height = i2 * 4;
        } else {
            extraSpacing = i4 - ((A0L + A0H) + (A0I * 4));
            i2 = A0I;
            height = i2 * 2;
        }
        this.A08 = new SS(this);
        RE re = new RE(this, 1, new WeakReference(this.A08), this.A0D);
        this.A09 = re;
        re.A0W(this.A00);
        this.A09.A0X(this.A01);
        C01333r c01333r = new C01333r(this.A0D);
        this.A05 = c01333r;
        c01333r.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.A07 = new C0725Sb(this.A05, i, this.A0B, this.A09, bundle);
        int extraSpacing2 = i2;
        int childSpacing = extraSpacing;
        this.A05.setAdapter(new ST(this.A0D, this.A0B, this.A03, super.A0C, this.A04, this.A09, this.A0E, getAudienceNetworkListener(), this.A0A, childSpacing, extraSpacing2, height, i, this.A07, super.A0E));
        C01333r c01333r2 = this.A05;
        c01333r2.A1f(c01333r2.getOnScrollListener());
        if (i == 1) {
            A0F(this.A07);
        }
        LinearLayout linearLayout2 = this.A02;
        C01333r c01333r3 = this.A05;
        if (A0G[7].charAt(26) == 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[0] = "pS0yYjaDPNGuTrfnUmeGhxtdEtLadoEJ";
        strArr[6] = "mwC7eMAbLdHre0yQkkMBVztsNAF33a9m";
        linearLayout2.addView(c01333r3);
        O2 o2 = this.A06;
        if (o2 != null) {
            LinearLayout linearLayout3 = this.A02;
            String[] strArr2 = A0G;
            if (strArr2[5].charAt(16) == strArr2[4].charAt(16)) {
                throw new RuntimeException();
            }
            A0G[3] = "7ZjVpxQcOo2BFfYt51qxyVC8jdlns0bj";
            linearLayout3.addView(o2);
        }
        boolean A1W = C0478Ih.A1W(this.A0D);
        String[] strArr3 = A0G;
        if (strArr3[0].charAt(22) == strArr3[6].charAt(22)) {
            A0G[3] = "nKvQ299cRrmi8SltfoUYXILZ1CbfqCSq";
        }
    }

    private void A0E(AbstractC0992b5 abstractC0992b5) {
        this.A03 = abstractC0992b5;
        this.A0A = abstractC0992b5.A12();
        this.A00 = this.A03.A0C();
        this.A01 = this.A03.A0D();
        List<C1G> A14 = this.A03.A14();
        List<AdInfo> adInfoList = new ArrayList<>(A14.size());
        this.A0B = adInfoList;
        int i = 0;
        while (true) {
            int size = A14.size();
            String[] strArr = A0G;
            String str = strArr[5];
            String str2 = strArr[4];
            int i2 = str.charAt(16);
            if (i2 == str2.charAt(16)) {
                throw new RuntimeException();
            }
            A0G[3] = "1AHb04hcylshFNuVFPVd0IA840Fx90m0";
            if (i < size) {
                C1G c1g = A14.get(i);
                List<C0661Pp> list = this.A0B;
                int i3 = A14.size();
                list.add(new C0661Pp(i, i3, c1g));
                i++;
            } else {
                return;
            }
        }
    }

    private void A0F(C0725Sb c0725Sb) {
        new C0373Ec().A0G(this.A05);
        c0725Sb.A0Y(new SR(this));
        this.A06 = new O2(this.A0D, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0J);
        layoutParams.setMargins(0, A0K, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.meta.analytics.dsp.uinode.UL
    public final boolean A0a() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void A9Q(Intent intent, Bundle bundle, C5V c5v) {
        AbstractC0992b5 dataBundle = A00(intent);
        A0V(c5v);
        A0E(dataBundle);
        A0D(c5v.A0J().getResources().getConfiguration().orientation, bundle);
        c5v.A0N(new SQ(this, c5v));
        AbstractC0992b5 dataBundle2 = super.A0A;
        int unskippableSec = dataBundle2.A0x().A0D().A03();
        if (super.A07) {
            AbstractC0992b5 dataBundle3 = super.A0A;
            unskippableSec = dataBundle3.A0x().A0D().A02();
        }
        if (unskippableSec > 0) {
            A0T(unskippableSec);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.UL, com.meta.analytics.dsp.uinode.MD
    public final void ACW(boolean z) {
        super.ACW(z);
        C0725Sb c0725Sb = this.A07;
        if (c0725Sb != null) {
            c0725Sb.A0Q();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.UL, com.meta.analytics.dsp.uinode.MD
    public final void ACu(boolean z) {
        super.ACu(z);
        this.A07.A0R();
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void AFT(Bundle bundle) {
        C0725Sb c0725Sb = this.A07;
        if (c0725Sb != null) {
            c0725Sb.A0W(bundle);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.UL
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        AFT(bundle);
        A0C();
        A0D(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.meta.analytics.dsp.uinode.UL, com.meta.analytics.dsp.uinode.MD
    public final void onDestroy() {
        super.onDestroy();
        if (C0478Ih.A1W(this.A0D)) {
            this.A0D.A0A().AGk(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0C.A9X(this.A0A, new C0602Ni().A03(this.A09).A02(this.A0E).A05());
        }
        A0C();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0E.A06(this.A0D, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
