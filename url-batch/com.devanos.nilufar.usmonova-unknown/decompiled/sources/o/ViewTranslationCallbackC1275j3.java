package o;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import java.util.LinkedHashMap;

/* renamed from: o.j3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTranslationCallbackC1275j3 implements ViewTranslationCallback {
    public static final ViewTranslationCallbackC1275j3 a = new ViewTranslationCallbackC1275j3();

    public final boolean onClearTranslation(View view) {
        InterfaceC1455lp interfaceC1455lp;
        AbstractC0048Bt.l(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC2132w3 contentCaptureManager$ui_release = ((S2) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.n = 1;
        C2340zD d = contentCaptureManager$ui_release.d();
        Object[] objArr = d.c;
        long[] jArr = d.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            LinkedHashMap linkedHashMap = ((AQ) objArr[(i << 3) + i3]).a.d.h;
                            Object obj = linkedHashMap.get(CQ.t);
                            if (obj == null) {
                                obj = null;
                            }
                            if (obj != null) {
                                Object obj2 = linkedHashMap.get(C1957tQ.k);
                                C1599o0 c1599o0 = (C1599o0) (obj2 != null ? obj2 : null);
                                if (c1599o0 != null && (interfaceC1455lp = (InterfaceC1455lp) c1599o0.b) != null) {
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final boolean onHideTranslation(View view) {
        InterfaceC2114vp interfaceC2114vp;
        AbstractC0048Bt.l(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC2132w3 contentCaptureManager$ui_release = ((S2) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.n = 1;
        C2340zD d = contentCaptureManager$ui_release.d();
        Object[] objArr = d.c;
        long[] jArr = d.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            LinkedHashMap linkedHashMap = ((AQ) objArr[(i << 3) + i3]).a.d.h;
                            Object obj = linkedHashMap.get(CQ.t);
                            if (obj == null) {
                                obj = null;
                            }
                            if (AbstractC0048Bt.h(obj, Boolean.TRUE)) {
                                Object obj2 = linkedHashMap.get(C1957tQ.j);
                                C1599o0 c1599o0 = (C1599o0) (obj2 != null ? obj2 : null);
                                if (c1599o0 != null && (interfaceC2114vp = (InterfaceC2114vp) c1599o0.b) != null) {
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        InterfaceC2114vp interfaceC2114vp;
        AbstractC0048Bt.l(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC2132w3 contentCaptureManager$ui_release = ((S2) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.n = 2;
        C2340zD d = contentCaptureManager$ui_release.d();
        Object[] objArr = d.c;
        long[] jArr = d.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        LinkedHashMap linkedHashMap = ((AQ) objArr[(i << 3) + i3]).a.d.h;
                        Object obj = linkedHashMap.get(CQ.t);
                        if (obj == null) {
                            obj = null;
                        }
                        if (AbstractC0048Bt.h(obj, Boolean.FALSE)) {
                            Object obj2 = linkedHashMap.get(C1957tQ.j);
                            C1599o0 c1599o0 = (C1599o0) (obj2 != null ? obj2 : null);
                            if (c1599o0 != null && (interfaceC2114vp = (InterfaceC2114vp) c1599o0.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
