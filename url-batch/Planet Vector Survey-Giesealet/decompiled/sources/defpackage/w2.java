package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.nio.MappedByteBuffer;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w2(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x01ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01d2, code lost:
    
        throw r0;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int[] iArr;
        int[] iArr2;
        int i = this.d;
        int i2 = 0;
        Object obj = this.e;
        switch (i) {
            case 0:
                f3 f3Var = (f3) obj;
                f3Var.B0 = false;
                MotionEvent motionEvent = f3Var.t0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    f3Var.G(motionEvent);
                    return;
                } else {
                    g8.s("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 1:
                n3 n3Var = (n3) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    n3Var.d.v(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        n3Var.f();
                        Trace.endSection();
                        n3Var.L = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 2:
                e4 e4Var = (e4) obj;
                boolean k = e4Var.k();
                f3 f3Var2 = e4Var.d;
                if (k) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        f3Var2.v(true);
                        p60 p60Var = e4Var.o;
                        int[] iArr3 = p60Var.b;
                        long[] jArr = p60Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    int i5 = i2;
                                    while (i5 < i4) {
                                        if ((255 & j) < 128) {
                                            int i6 = iArr3[(i3 << 3) + i5];
                                            if (!e4Var.j().a(i6)) {
                                                iArr2 = iArr3;
                                                e4Var.g.add(new xi(i6, e4Var.n, yi.e, null));
                                                e4Var.k.r(ky0.a);
                                                j >>= 8;
                                                i5++;
                                                iArr3 = iArr2;
                                            }
                                        }
                                        iArr2 = iArr3;
                                        j >>= 8;
                                        i5++;
                                        iArr3 = iArr2;
                                    }
                                    iArr = iArr3;
                                    if (i4 == 8) {
                                    }
                                } else {
                                    iArr = iArr3;
                                }
                                if (i3 != length) {
                                    i3++;
                                    iArr3 = iArr;
                                    i2 = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        e4Var.m(f3Var2.getSemanticsOwner().a(), e4Var.p);
                        Trace.endSection();
                        e4Var.i(e4Var.j());
                        e4Var.q();
                        e4Var.q = false;
                        return;
                    } finally {
                    }
                }
                return;
            case 3:
                wf wfVar = (wf) obj;
                Runnable runnable = wfVar.e;
                if (runnable != null) {
                    runnable.run();
                    wfVar.e = null;
                    return;
                }
                return;
            case 4:
                om.a((om) obj);
                return;
            case 5:
                nt ntVar = (nt) obj;
                synchronized (ntVar.g) {
                    try {
                        if (ntVar.k == null) {
                            return;
                        }
                        try {
                            wt d = ntVar.d();
                            int i7 = d.f;
                            if (i7 == 2) {
                                synchronized (ntVar.g) {
                                }
                            }
                            if (i7 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                            }
                            try {
                                int i8 = sw0.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                y7 y7Var = ntVar.f;
                                Context context = ntVar.d;
                                y7Var.getClass();
                                wt[] wtVarArr = {d};
                                ze0 ze0Var = rx0.a;
                                ch0.d("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface d2 = rx0.a.d(context, wtVarArr);
                                    Trace.endSection();
                                    MappedByteBuffer p = rg0.p(ntVar.d, d.a);
                                    if (p == null || d2 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        k2 k2Var = new k2(d2, a50.C(p));
                                        Trace.endSection();
                                        synchronized (ntVar.g) {
                                            try {
                                                px0 px0Var = ntVar.k;
                                                if (px0Var != null) {
                                                    px0Var.N(k2Var);
                                                }
                                            } finally {
                                            }
                                        }
                                        ntVar.a();
                                        return;
                                    } finally {
                                        int i9 = sw0.a;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            synchronized (ntVar.g) {
                                try {
                                    px0 px0Var2 = ntVar.k;
                                    if (px0Var2 != null) {
                                        px0Var2.M(th);
                                    }
                                    ntVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 6:
                uh0 uh0Var = (uh0) obj;
                q20 q20Var = uh0Var.i;
                if (uh0Var.e == 0) {
                    uh0Var.f = true;
                    q20Var.e(e20.ON_PAUSE);
                }
                if (uh0Var.d == 0 && uh0Var.f) {
                    q20Var.e(e20.ON_STOP);
                    uh0Var.g = true;
                    return;
                }
                return;
            case 7:
                ml0.setRippleState$lambda$2((ml0) obj);
                return;
            default:
                mu0 mu0Var = ((ou0) obj).a;
                ViewParent parent = mu0Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(mu0Var);
                    return;
                }
                return;
        }
    }
}
