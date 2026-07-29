package o;

import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import java.util.List;
import java.util.function.Consumer;

/* renamed from: o.u3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2000u3 {
    public static final C2000u3 a = new C2000u3();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        r0 = r0.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r0 = r0.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(ViewOnAttachStateChangeListenerC2132w3 viewOnAttachStateChangeListenerC2132w3, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        AQ aq;
        C2287yQ c2287yQ;
        InterfaceC2114vp interfaceC2114vp;
        int i = 0;
        while (i < longSparseArray.size()) {
            int i2 = i + 1;
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse m = D2.m(longSparseArray.get(keyAt));
            if (m != null && value != null && text != null && (aq = (AQ) viewOnAttachStateChangeListenerC2132w3.d().e((int) keyAt)) != null && (c2287yQ = aq.a) != null) {
                Object obj = c2287yQ.d.h.get(C1957tQ.i);
                if (obj == null) {
                    obj = null;
                }
                C1599o0 c1599o0 = (C1599o0) obj;
                if (c1599o0 != null && (interfaceC2114vp = (InterfaceC2114vp) c1599o0.b) != null) {
                }
            }
            i = i2;
        }
    }

    public final void b(ViewOnAttachStateChangeListenerC2132w3 viewOnAttachStateChangeListenerC2132w3, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        C2287yQ c2287yQ;
        AutofillId autofillId;
        String l;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        for (long j : jArr) {
            AQ aq = (AQ) viewOnAttachStateChangeListenerC2132w3.d().e((int) j);
            if (aq != null && (c2287yQ = aq.a) != null) {
                D2.p();
                autofillId = viewOnAttachStateChangeListenerC2132w3.h.getAutofillId();
                ViewTranslationRequest.Builder k = D2.k(autofillId, c2287yQ.g);
                Object obj = c2287yQ.d.h.get(CQ.s);
                if (obj == null) {
                    obj = null;
                }
                List list = (List) obj;
                if (list != null && (l = AbstractC1052fg.l("\n", list)) != null) {
                    forText = TranslationRequestValue.forText(new Y3(l, null, null, null));
                    k.setValue("android:text", forText);
                    build = k.build();
                    consumer.accept(build);
                }
            }
        }
    }

    public final void c(ViewOnAttachStateChangeListenerC2132w3 viewOnAttachStateChangeListenerC2132w3, LongSparseArray<ViewTranslationResponse> longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AbstractC0048Bt.h(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            a(viewOnAttachStateChangeListenerC2132w3, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC2132w3.h.post(new RunnableC1866s2(viewOnAttachStateChangeListenerC2132w3, 2, longSparseArray));
        }
    }
}
