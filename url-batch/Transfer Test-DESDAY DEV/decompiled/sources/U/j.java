package U;

import K.C0014m;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f819j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile j f820k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f821a;

    /* renamed from: b, reason: collision with root package name */
    public final o.c f822b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f823c;
    public final Handler d;

    /* renamed from: e, reason: collision with root package name */
    public final f f824e;

    /* renamed from: f, reason: collision with root package name */
    public final i f825f;

    /* renamed from: g, reason: collision with root package name */
    public final O0.e f826g;
    public final int h;
    public final d i;

    public j(t tVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f821a = reentrantReadWriteLock;
        this.f823c = 3;
        i iVar = (i) tVar.f817b;
        this.f825f = iVar;
        int i = tVar.f816a;
        this.h = i;
        this.i = (d) tVar.f818c;
        this.d = new Handler(Looper.getMainLooper());
        this.f822b = new o.c();
        this.f826g = new O0.e(8);
        f fVar = new f(this);
        this.f824e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f823c = 0;
            } catch (Throwable th) {
                this.f821a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.h(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f819j) {
            try {
                jVar = f820k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f821a.readLock().lock();
        try {
            return this.f823c;
        } finally {
            this.f821a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f821a.writeLock().lock();
        try {
            if (this.f823c == 0) {
                return;
            }
            this.f823c = 0;
            this.f821a.writeLock().unlock();
            f fVar = this.f824e;
            j jVar = fVar.f813a;
            try {
                jVar.f825f.h(new e(fVar));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } finally {
            this.f821a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f821a.writeLock().lock();
        try {
            this.f823c = 2;
            arrayList.addAll(this.f822b);
            this.f822b.clear();
            this.f821a.writeLock().unlock();
            this.d.post(new H.b(arrayList, this.f823c, th));
        } catch (Throwable th2) {
            this.f821a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[Catch: all -> 0x007e, TryCatch #0 {all -> 0x007e, blocks: (B:67:0x0059, B:70:0x005e, B:72:0x0062, B:74:0x006f, B:29:0x008b, B:31:0x0095, B:33:0x0098, B:35:0x009b, B:37:0x00ab, B:39:0x00ae, B:44:0x00bd, B:47:0x00c4, B:49:0x00db, B:27:0x0081), top: B:66:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #0 {all -> 0x007e, blocks: (B:67:0x0059, B:70:0x005e, B:72:0x0062, B:74:0x006f, B:29:0x008b, B:31:0x0095, B:33:0x0098, B:35:0x009b, B:37:0x00ab, B:39:0x00ae, B:44:0x00bd, B:47:0x00c4, B:49:0x00db, B:27:0x0081), top: B:66:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence e(CharSequence charSequence, int i, int i2) {
        int i3;
        int i4;
        B b2;
        z[] zVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        A.c.j(i <= i2, "start should be <= than end");
        B b3 = null;
        if (charSequence == null) {
            return null;
        }
        A.c.j(i <= charSequence.length(), "start should be < than charSequence length");
        A.c.j(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        C0014m c0014m = this.f824e.f814b;
        c0014m.getClass();
        boolean z2 = charSequence instanceof x;
        if (z2) {
            ((x) charSequence).a();
        }
        if (!z2) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, z.class) <= i2) {
                        b3 = new B();
                        b3.f807a = false;
                        b3.f808b = new SpannableString(charSequence);
                    }
                    if (b3 != null && (zVarArr = (z[]) b3.f808b.getSpans(i, i2, z.class)) != null && zVarArr.length > 0) {
                        for (z zVar : zVarArr) {
                            int spanStart = b3.f808b.getSpanStart(zVar);
                            int spanEnd = b3.f808b.getSpanEnd(zVar);
                            if (spanStart != i2) {
                                b3.removeSpan(zVar);
                            }
                            i = Math.min(spanStart, i);
                            i2 = Math.max(spanEnd, i2);
                        }
                    }
                    i3 = i;
                    i4 = i2;
                    if (i3 != i4 && i3 < charSequence.length()) {
                        b2 = (B) c0014m.j(charSequence, i3, i4, Integer.MAX_VALUE, false, new B.j(b3, 4, (O0.e) c0014m.f424a));
                        if (b2 != null) {
                            if (!z2) {
                                return charSequence;
                            }
                            return charSequence;
                        }
                        Spannable spannable = b2.f808b;
                        if (z2) {
                            ((x) charSequence).b();
                        }
                        return spannable;
                    }
                    return charSequence;
                }
            } finally {
                if (z2) {
                    ((x) charSequence).b();
                }
            }
        }
        b3 = new B((Spannable) charSequence);
        if (b3 != null) {
            while (r1 < r5) {
            }
        }
        i3 = i;
        i4 = i2;
        if (i3 != i4) {
            b2 = (B) c0014m.j(charSequence, i3, i4, Integer.MAX_VALUE, false, new B.j(b3, 4, (O0.e) c0014m.f424a));
            if (b2 != null) {
            }
        }
        return charSequence;
    }

    public final void f(h hVar) {
        A.c.l(hVar, "initCallback cannot be null");
        this.f821a.writeLock().lock();
        try {
            if (this.f823c != 1 && this.f823c != 2) {
                this.f822b.add(hVar);
                this.f821a.writeLock().unlock();
            }
            this.d.post(new H.b(Arrays.asList(hVar), this.f823c, (Throwable) null));
            this.f821a.writeLock().unlock();
        } catch (Throwable th) {
            this.f821a.writeLock().unlock();
            throw th;
        }
    }
}
