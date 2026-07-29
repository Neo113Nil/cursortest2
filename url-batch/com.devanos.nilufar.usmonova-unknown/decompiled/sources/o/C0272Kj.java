package o;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: o.Kj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272Kj {
    public static final Object j = new Object();
    public static volatile C0272Kj k;
    public final ReentrantReadWriteLock a;
    public final N6 b;
    public volatile int c;
    public final Handler d;
    public final C0168Gj e;
    public final InterfaceC0246Jj f;
    public final C0218Ih g;
    public final int h;
    public final C2303yg i;

    public C0272Kj(C0665Zn c0665Zn) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        InterfaceC0246Jj interfaceC0246Jj = c0665Zn.a;
        this.f = interfaceC0246Jj;
        int i = c0665Zn.b;
        this.h = i;
        this.i = c0665Zn.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new N6(0);
        this.g = new C0218Ih(2);
        C0168Gj c0168Gj = new C0168Gj(this);
        this.e = c0168Gj;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                interfaceC0246Jj.a(new C0142Fj(c0168Gj));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static C0272Kj a() {
        C0272Kj c0272Kj;
        synchronized (j) {
            try {
                c0272Kj = k;
                if (!(c0272Kj != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c0272Kj;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            C0168Gj c0168Gj = this.e;
            C0272Kj c0272Kj = c0168Gj.a;
            try {
                c0272Kj.f.a(new C0142Fj(c0168Gj));
            } catch (Throwable th) {
                c0272Kj.d(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new F9(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[Catch: all -> 0x0079, TryCatch #3 {all -> 0x0079, blocks: (B:87:0x0051, B:90:0x0056, B:92:0x005a, B:94:0x0067, B:33:0x0086, B:35:0x0090, B:37:0x0093, B:39:0x0096, B:41:0x00a6, B:42:0x00a9), top: B:86:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence e(CharSequence charSequence, int i, int i2) {
        CharSequence charSequence2;
        Throwable th;
        int i3;
        int i4;
        IX[] ixArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i <= i2)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        C1372kY c1372kY = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i2 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        C0950e6 c0950e6 = this.e.b;
        c0950e6.getClass();
        boolean z = charSequence instanceof OS;
        if (z) {
            ((OS) charSequence).a();
        }
        try {
            if (!z) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, IX.class) <= i2) {
                            c1372kY = new C1372kY();
                            c1372kY.h = false;
                            c1372kY.i = new SpannableString(charSequence);
                        }
                        if (c1372kY != null && (ixArr = (IX[]) c1372kY.i.getSpans(i, i2, IX.class)) != null && ixArr.length > 0) {
                            for (IX ix : ixArr) {
                                int spanStart = c1372kY.i.getSpanStart(ix);
                                int spanEnd = c1372kY.i.getSpanEnd(ix);
                                if (spanStart != i2) {
                                    c1372kY.removeSpan(ix);
                                }
                                i = Math.min(spanStart, i);
                                i2 = Math.max(spanEnd, i2);
                            }
                        }
                        i3 = i;
                        i4 = i2;
                        if (i3 != i4 || i3 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z) {
                                return charSequence2;
                            }
                        } else {
                            try {
                                charSequence2 = charSequence;
                            } catch (Throwable th2) {
                                charSequence2 = charSequence;
                                th = th2;
                                if (z) {
                                }
                            }
                            try {
                                C1372kY c1372kY2 = (C1372kY) c0950e6.K(charSequence2, i3, i4, Integer.MAX_VALUE, false, new C2002u5(20, c1372kY, (C0218Ih) c0950e6.i, false));
                                if (c1372kY2 != null) {
                                    Spannable spannable = c1372kY2.i;
                                    if (z) {
                                        ((OS) charSequence2).b();
                                    }
                                    return spannable;
                                }
                                if (!z) {
                                    return charSequence2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                if (z) {
                                }
                            }
                        }
                        ((OS) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    if (z) {
                    }
                }
            }
            c1372kY = new C1372kY((Spannable) charSequence);
            if (c1372kY != null) {
                while (r1 < r5) {
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 != i4) {
            }
            charSequence2 = charSequence;
            if (!z) {
            }
            ((OS) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
            th = th;
            if (z) {
                throw th;
            }
            ((OS) charSequence2).b();
            throw th;
        }
    }

    public final void f(AbstractC0220Ij abstractC0220Ij) {
        AbstractC1807r8.m(abstractC0220Ij, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(abstractC0220Ij);
                this.a.writeLock().unlock();
            }
            this.d.post(new F9(Arrays.asList(abstractC0220Ij), this.c, (Throwable) null));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }
}
