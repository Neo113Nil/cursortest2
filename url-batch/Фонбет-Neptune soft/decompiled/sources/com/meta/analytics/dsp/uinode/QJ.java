package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class QJ extends RelativeLayout {
    public static String[] A03 = {"Z7YDROQZDOzGgLZ6JRzm0VB6SZj4zDor", "PEDxZ1hmcJv2HtokqPZuboN03zqPqfuu", "ZN3aiXgGzfL", "UoQOzdqMFdmvRVk6jZTbQbhJ01APWmUd", "BWydKlRDXGFiivyHlYlBLR13h8bygoZy", "calSGpe10AH6YV6oPZJsWkhcYoOFDSm8", "CqyCvSup05V", "6oqVw1T1HmkJfSZKyFG8rr7XXeYSScI0"};
    public C7R A00;
    public WeakReference<QI> A01;
    public final R9 A02;

    /* JADX WARN: Multi-variable type inference failed */
    public QJ(C0889Yn c0889Yn, R9 r9) {
        super(c0889Yn);
        this.A02 = r9;
        AbstractC0556Lo.A0J((View) r9);
        addView(r9.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A00(QQ qq) {
        addView(qq, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C7R) qq;
    }

    public final void A01(QQ qq) {
        AbstractC0556Lo.A0J(qq);
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A02.A8c();
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        C7R c7r = this.A00;
        if (c7r != null) {
            c7r.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
    
        if (r6 > r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a6, code lost:
    
        r5 = (r4 * r7) / r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
    
        if (r6 > r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e0, code lost:
    
        if (r6 == Integer.MIN_VALUE) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:
    
        if (r4 <= r3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        if (r6 == Integer.MIN_VALUE) goto L43;
     */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z = false;
        int heightSpecSize = this.A02.getVideoWidth();
        int heightSpecMode = this.A02.getVideoHeight();
        int height = getDefaultSize(heightSpecSize, i);
        int widthSpecMode = getDefaultSize(heightSpecMode, i2);
        if (heightSpecSize > 0 && heightSpecMode > 0) {
            z = true;
            int widthSpecSize = View.MeasureSpec.getMode(i);
            String[] strArr = A03;
            String str = strArr[5];
            String str2 = strArr[4];
            int mVideoWidth = str.charAt(24);
            if (mVideoWidth == str2.charAt(24)) {
                throw new RuntimeException();
            }
            A03[1] = "CDDJeYuNvDEJubiWpvjZnzRFdpaPIWUA";
            int width = View.MeasureSpec.getSize(i);
            int mVideoHeight = View.MeasureSpec.getMode(i2);
            int mVideoWidth2 = View.MeasureSpec.getSize(i2);
            if (widthSpecSize != 1073741824 || mVideoHeight != 1073741824) {
                if (widthSpecSize == 1073741824) {
                    height = width;
                    widthSpecMode = (height * heightSpecMode) / heightSpecSize;
                    if (mVideoHeight == Integer.MIN_VALUE && widthSpecMode > mVideoWidth2) {
                        widthSpecMode = mVideoWidth2;
                    }
                } else if (mVideoHeight == 1073741824) {
                    widthSpecMode = mVideoWidth2;
                    height = (widthSpecMode * heightSpecSize) / heightSpecMode;
                    String[] strArr2 = A03;
                    String str3 = strArr2[7];
                    String str4 = strArr2[0];
                    int mVideoWidth3 = str3.charAt(1);
                    if (mVideoWidth3 != str4.charAt(1)) {
                        String[] strArr3 = A03;
                        strArr3[7] = "6OY3VkVRTo9gTvB5T4EFQBtDC7FaIDf0";
                        strArr3[0] = "lXHmnICBdoyL7DjWTMRRGmshSxtLnfI6";
                    }
                } else {
                    height = heightSpecSize;
                    widthSpecMode = heightSpecMode;
                    if (mVideoHeight == Integer.MIN_VALUE && widthSpecMode > mVideoWidth2) {
                        widthSpecMode = mVideoWidth2;
                        height = (widthSpecMode * heightSpecSize) / heightSpecMode;
                    }
                    if (widthSpecSize == Integer.MIN_VALUE && height > width) {
                        height = width;
                        widthSpecMode = (height * heightSpecMode) / heightSpecSize;
                    }
                }
            } else {
                height = width;
                widthSpecMode = mVideoWidth2;
                int mVideoWidth4 = heightSpecSize * widthSpecMode;
                if (mVideoWidth4 < height * heightSpecMode) {
                    height = (widthSpecMode * heightSpecSize) / heightSpecMode;
                } else {
                    int i3 = heightSpecSize * widthSpecMode;
                    int width2 = height * heightSpecMode;
                    int mVideoWidth5 = A03[3].charAt(9);
                    if (mVideoWidth5 != 104) {
                        A03[3] = "fC7LLJ1Dm89Wzyv9Y7CU7RKyEHK0kUw2";
                    }
                }
            }
        }
        setMeasuredDimension(height, widthSpecMode);
        int mVideoWidth6 = A03[3].charAt(9);
        if (mVideoWidth6 != 104) {
            A03[1] = "jUvlMuc6V7f2FSIr4bukaecFyxTPY1HC";
            if (!z) {
                return;
            }
        } else if (!z) {
            return;
        }
        WeakReference<QI> weakReference = this.A01;
        if (weakReference != null && weakReference.get() != null) {
            this.A01.get().ADZ();
        }
    }

    public void setViewImplInflationListener(QI qi) {
        this.A01 = new WeakReference<>(qi);
    }
}
