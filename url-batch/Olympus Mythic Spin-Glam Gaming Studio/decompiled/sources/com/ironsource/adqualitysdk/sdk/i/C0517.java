package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Calendar;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ο, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0517 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0506 f481;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ MotionEvent f482;

    public C0517(C0506 c0506, MotionEvent motionEvent) {
        this.f481 = c0506;
        this.f482 = motionEvent;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        try {
            int round = Math.round(this.f482.getRawX());
            int round2 = Math.round(this.f482.getRawY());
            String str = AbstractC0608.f1070;
            if (round >= 0 && round2 >= 0 && round <= AbstractC1006.m4291(AbstractC0608.m4112(), false).optInt(AbstractC0608.f1063) && round2 <= AbstractC1006.m4291(AbstractC0608.m4112(), false).optInt(AbstractC0608.f1062)) {
                String str2 = AbstractC0530.f589;
                C0784 c0784 = new C0784(round, round2, Calendar.getInstance().getTimeInMillis(), SystemClock.elapsedRealtime());
                C0506 c0506 = this.f481;
                synchronized (c0506) {
                    c0506.f469 = c0784;
                }
                return;
            }
            AbstractC0580.m4072(StringFog.decrypt("vj1eWphlx/uMMll0kHrn8Zc0Q2uce+X9mjQ=\n", "+VExOPkJk5Q=\n"), StringFog.decrypt("1zuvJOrvNtbmOq5n8KowxeoivyOioCbUozu8Z+CgJs7nJ/ok7aAhxOo6uzPnvGmA+A==\n", "g1TaR4LPU6A=\n") + round + StringFog.decrypt("RAI=\n", "aCLI0sf5e48=\n") + round2 + StringFog.decrypt("3g==\n", "o3WEhZNFzjk=\n"));
        } catch (Throwable th) {
            AbstractC0577.m4068(StringFog.decrypt("xBAbneACioP2Hxyz6B2qie0ZBqzkHKiF4Bk=\n", "g3x0/4Fu3uw=\n"), StringFog.decrypt("/hwf/of+FECbAQPFmqseRg==\n", "u25tkfXefS4=\n"), th, false);
        }
    }
}
