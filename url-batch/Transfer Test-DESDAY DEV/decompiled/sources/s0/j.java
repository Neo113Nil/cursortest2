package s0;

import android.os.CountDownTimer;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.J;
import com.football.transfertrivia.GameActivity;
import com.football.transfertrivia.R;
import java.util.Iterator;
import java.util.List;
import o1.AbstractC0302t;
import o1.AbstractC0308z;
import t0.C0336a;

/* loaded from: classes.dex */
public final class j extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GameActivity f3664a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(GameActivity gameActivity) {
        super(15000L, 1000L);
        this.f3664a = gameActivity;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        GameActivity gameActivity = this.f3664a;
        gameActivity.f1743G = 0L;
        gameActivity.F--;
        b bVar = (b) gameActivity.f1744H.get(gameActivity.f1741D);
        C0336a c0336a = gameActivity.f1745z;
        if (c0336a == null) {
            g1.f.g("binding");
            throw null;
        }
        List a02 = V0.f.a0(c0336a.f3768b, c0336a.f3769c, c0336a.d, c0336a.f3770e);
        Iterator it = a02.iterator();
        while (it.hasNext()) {
            ((AppCompatButton) it.next()).setEnabled(false);
        }
        ((AppCompatButton) a02.get(bVar.f3647e.indexOf(bVar.d))).setBackgroundColor(A.b.a(gameActivity, R.color.correct_green));
        AbstractC0302t.i(J.e(gameActivity), AbstractC0308z.f3346b, new g(gameActivity, null));
        AbstractC0302t.i(J.e(gameActivity), s1.m.f3714a, new h(gameActivity, null));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j2) {
        GameActivity gameActivity = this.f3664a;
        gameActivity.f1743G = j2;
        int i = (int) (j2 / 1000);
        C0336a c0336a = gameActivity.f1745z;
        if (c0336a == null) {
            g1.f.g("binding");
            throw null;
        }
        c0336a.f3773j.setText(gameActivity.getString(R.string.timer_format, Integer.valueOf(i)));
    }
}
