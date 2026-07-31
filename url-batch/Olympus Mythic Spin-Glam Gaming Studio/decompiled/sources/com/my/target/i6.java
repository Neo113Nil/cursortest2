package com.my.target;

import android.os.Handler;
import com.my.target.instreamads.qrcta.QrCtaPlayer;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class i6 {
    private QrCtaPlayer a = null;
    private final Handler b = o0.g;
    private final Runnable c = new Runnable() { // from class: com.my.target.i6$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            i6.this.a();
        }
    };
    private boolean d = false;

    public void a(QrCtaPlayer qrCtaPlayer) {
        this.a = qrCtaPlayer;
    }

    public void b() {
        if (this.a != null) {
            a();
        }
    }

    public void a(float f, float f2, eb ebVar) {
        if (ebVar.j0() == null || this.a == null || f <= 0.0f) {
            return;
        }
        a(f, f2, ebVar.j0());
    }

    public void a() {
        this.d = false;
        QrCtaPlayer qrCtaPlayer = this.a;
        if (qrCtaPlayer != null) {
            qrCtaPlayer.hide();
        }
        this.b.removeCallbacks(this.c);
    }

    private void a(float f, float f2, rf rfVar) {
        QrCtaPlayer qrCtaPlayer;
        if (this.d || f2 - f <= a(f2, rfVar.b) || (qrCtaPlayer = this.a) == null) {
            return;
        }
        qrCtaPlayer.show(rfVar.a);
        this.d = true;
    }

    public void a(rf rfVar) {
        int i = rfVar.b.c;
        if (i > 0) {
            this.b.postDelayed(this.c, i * 1000);
        } else {
            a();
        }
    }

    private long a(float f, ji jiVar) {
        long j = jiVar.a;
        if (j >= 0) {
            return j;
        }
        if (jiVar.b >= 0) {
            return (int) ((r7 * f) / 100.0f);
        }
        return 0L;
    }
}
