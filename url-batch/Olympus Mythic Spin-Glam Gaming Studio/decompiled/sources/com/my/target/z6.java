package com.my.target;

import android.content.Context;
import com.my.target.common.CustomParams;
import com.my.target.common.webform.WebFormClient;
import com.my.target.instreamads.InstreamAd;
import com.my.target.instreamads.InstreamAdVideoMotionPlayer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public final class z6 implements InstreamAdVideoMotionPlayer.VideoMotionPlayerListener {
    final l2 a;
    final CustomParams b;
    final WebFormClient c;
    InstreamAdVideoMotionPlayer d;
    a e;
    hj f;
    Set g;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(hj hjVar);

        void b(hj hjVar);
    }

    private z6(l2 l2Var, CustomParams customParams, WebFormClient webFormClient) {
        this.a = l2Var;
        this.b = customParams;
        this.c = webFormClient;
    }

    public static z6 a(l2 l2Var, CustomParams customParams, WebFormClient webFormClient) {
        return new z6(l2Var, customParams, webFormClient);
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onBannerComplete(Context context) {
        a aVar;
        hj hjVar = this.f;
        if (hjVar == null || (aVar = this.e) == null) {
            return;
        }
        wh.b(hjVar.H(), "playbackCompleted", 1);
        aVar.a(hjVar);
        this.f = null;
        this.g = null;
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onBannerShow(Context context) {
        a aVar;
        hj hjVar = this.f;
        if (hjVar == null || (aVar = this.e) == null) {
            return;
        }
        th H = hjVar.H();
        wh.b(H, "playbackStarted", 1);
        String e = qi.e(context);
        if (e != null) {
            wh.a(H, e, 1);
        }
        aVar.b(hjVar);
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onCloseByUser(Context context) {
        a aVar;
        hj hjVar = this.f;
        if (hjVar == null || (aVar = this.e) == null) {
            return;
        }
        wh.b(hjVar.H(), "closedByUser", 1);
        aVar.a(hjVar);
        this.f = null;
        this.g = null;
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onError(String str, Context context) {
        hj hjVar = this.f;
        if (hjVar == null) {
            return;
        }
        wh.b(hjVar.H(), "playbackError", 1);
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onHeaderClick(Context context) {
        g8 C0;
        hj hjVar = this.f;
        if (hjVar == null || (C0 = hjVar.C0()) == null) {
            return;
        }
        f7 f7Var = C0.a;
        wh.b(f7Var.f, "click", 2);
        this.a.a(hjVar, f7Var.h, f7Var.i, f7Var.g, this.c, context);
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onItemClick(String str, Context context) {
        g8 C0;
        h8 h8Var;
        hj hjVar = this.f;
        if (hjVar == null || (C0 = hjVar.C0()) == null) {
            return;
        }
        Iterator it = C0.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                h8Var = null;
                break;
            } else {
                h8Var = (h8) it.next();
                if (h8Var.a.equals(str)) {
                    break;
                }
            }
        }
        if (h8Var == null) {
            return;
        }
        wh.b(h8Var.f, "click", 2);
        this.a.a(hjVar, h8Var.j, h8Var.k, h8Var.i, this.c, context);
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onItemShow(String str, Context context) {
        hj hjVar;
        g8 C0;
        h8 h8Var;
        Set set = this.g;
        if (set == null || set.contains(str) || (hjVar = this.f) == null || (C0 = hjVar.C0()) == null) {
            return;
        }
        Iterator it = C0.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                h8Var = null;
                break;
            } else {
                h8Var = (h8) it.next();
                if (h8Var.a.equals(str)) {
                    break;
                }
            }
        }
        if (h8Var == null) {
            return;
        }
        this.g.add(str);
        wh.b(h8Var.f, "show", 1);
        wh.b(h8Var.f, "render", 1);
    }

    public void a(hj hjVar, InstreamAd.InstreamAdVideoMotionBanner instreamAdVideoMotionBanner) {
        this.f = hjVar;
        this.g = new HashSet();
        InstreamAdVideoMotionPlayer instreamAdVideoMotionPlayer = this.d;
        if (instreamAdVideoMotionPlayer != null) {
            instreamAdVideoMotionPlayer.playVideoMotionBanner(instreamAdVideoMotionBanner);
            return;
        }
        mi.a("InstreamVideoMotionController: can't start videoMotionBanner. VideoMotionPlayer is null");
        a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a(hjVar);
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    public void a(InstreamAdVideoMotionPlayer instreamAdVideoMotionPlayer) {
        this.d = instreamAdVideoMotionPlayer;
        instreamAdVideoMotionPlayer.setVideoMotionPlayerListener(this);
    }
}
