package sg.bigo.ads.cv;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.adsession.AdEvents;
import com.iab.omid.library.bigosg.adsession.AdSession;
import com.iab.omid.library.bigosg.adsession.media.InteractionType;
import com.iab.omid.library.bigosg.adsession.media.MediaEvents;
import com.iab.omid.library.bigosg.adsession.media.Position;
import com.iab.omid.library.bigosg.adsession.media.VastProperties;
import com.ironsource.X3;
import java.util.Objects;
import sg.bigo.ads.bh.d;

/* loaded from: classes6.dex */
public final class b {
    public MediaEvents a;
    public boolean b = false;

    @NonNull
    private final AdSession c;

    @NonNull
    private final AdEvents d;

    /* renamed from: sg.bigo.ads.cv.b$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[a.a().length];
            b = iArr;
            try {
                iArr[a.a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[a.b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[a.c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[a.d - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[a.e - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC1884b.a().length];
            a = iArr2;
            try {
                iArr2[EnumC1884b.a - 1] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[EnumC1884b.b - 1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[EnumC1884b.c - 1] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[EnumC1884b.d - 1] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        private static final /* synthetic */ int[] f = {1, 2, 3, 4, 5};

        public static int[] a() {
            return (int[]) f.clone();
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: sg.bigo.ads.cv.b$b, reason: collision with other inner class name */
    public static final class EnumC1884b {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] e = {1, 2, 3, 4};

        public static int[] a() {
            return (int[]) e.clone();
        }
    }

    b(@NonNull AdSession adSession, @Nullable MediaEvents mediaEvents) {
        this.c = adSession;
        this.a = mediaEvents;
        AdEvents createAdEvents = AdEvents.createAdEvents(adSession);
        this.d = createAdEvents;
        if (this.a != null) {
            try {
                createAdEvents.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                a(X3.i.r);
            } catch (Exception unused) {
            }
        } else {
            try {
                createAdEvents.loaded();
                a(X3.i.r);
            } catch (Exception unused2) {
            }
        }
    }

    public final void a() {
        try {
            this.d.impressionOccurred();
            a("impression");
        } catch (Exception unused) {
        }
    }

    public final void a(float f, @FloatRange float f2) {
        MediaEvents mediaEvents = this.a;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.start(f, f2);
        this.b = true;
        a("video start, duration: " + f + ", volume: " + f2);
    }

    public final void a(int i) {
        String str;
        MediaEvents mediaEvents = this.a;
        if (mediaEvents == null) {
            return;
        }
        int i2 = AnonymousClass2.a[i - 1];
        if (i2 == 1) {
            mediaEvents.firstQuartile();
            str = "video first quartile";
        } else if (i2 == 2) {
            mediaEvents.midpoint();
            str = "video mid point";
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    return;
                }
                mediaEvents.complete();
                a("video complete");
                return;
            }
            mediaEvents.thirdQuartile();
            str = "video third quartile";
        }
        a(str);
    }

    public final void a(InteractionType interactionType) {
        MediaEvents mediaEvents = this.a;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.adUserInteraction(interactionType);
        a("ad user interaction: " + interactionType.toString());
    }

    public final void a(String str) {
        Objects.toString(this.c);
    }

    public final void b() {
        if (d.b()) {
            c();
        } else {
            d.a(2, new Runnable() { // from class: sg.bigo.ads.cv.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.c();
                }
            });
        }
        this.a = null;
    }

    public final void b(int i) {
        String str;
        MediaEvents mediaEvents = this.a;
        if (mediaEvents == null) {
            return;
        }
        int i2 = AnonymousClass2.b[i - 1];
        if (i2 == 1) {
            mediaEvents.pause();
            str = "video pause";
        } else if (i2 == 2) {
            mediaEvents.resume();
            str = "video resume";
        } else if (i2 == 3) {
            mediaEvents.bufferStart();
            str = "video buffer start";
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    return;
                }
                mediaEvents.skipped();
                a("video skipped");
                return;
            }
            mediaEvents.bufferFinish();
            str = "video buffer finish";
        }
        a(str);
    }

    final void c() {
        try {
            this.c.finish();
        } catch (Throwable unused) {
        }
    }
}
