package yads;

import java.util.Map;
import kotlin.collections.MapsKt;

/* loaded from: classes4.dex */
public final class yo0 implements we2 {
    public boolean a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ zo0 d;

    public yo0(zo0 zo0Var) {
        this.d = zo0Var;
    }

    @Override // yads.we2
    public final void b(ne2 ne2Var) {
        this.a = false;
        this.d.g.b.a();
        this.d.a.n();
        String message = ne2Var.getMessage();
        ti3 ti3Var = this.d.c;
        io2 a = ti3Var.b.a();
        a.b(message, "error_message");
        fo2 fo2Var = fo2.c;
        Map map = a.a;
        ti3Var.a.a(new ho2("video_ad_player_error", MapsKt.toMutableMap(map), a.b));
        zo0 zo0Var = this.d;
        xf3 xf3Var = zo0Var.i;
        t62 t62Var = zo0Var.h;
        if (xf3Var == null || t62Var == null) {
            return;
        }
        zo0Var.d.getClass();
        xf3Var.a(new wf3(q52.a(ne2Var), ne2Var));
    }

    @Override // yads.we2
    public final void onIsPlayingChanged(boolean z) {
        if (!z) {
            if (this.b) {
                return;
            }
            this.c = true;
            zo0 zo0Var = this.d;
            xf3 xf3Var = zo0Var.i;
            t62 t62Var = zo0Var.h;
            if (xf3Var == null || t62Var == null) {
                return;
            }
            xf3Var.i();
            return;
        }
        if (!this.a) {
            zo0 zo0Var2 = this.d;
            xf3 xf3Var2 = zo0Var2.i;
            t62 t62Var2 = zo0Var2.h;
            if (xf3Var2 == null || t62Var2 == null) {
                return;
            }
            this.a = true;
            xf3Var2.c();
            return;
        }
        if (this.c) {
            this.c = false;
            zo0 zo0Var3 = this.d;
            xf3 xf3Var3 = zo0Var3.i;
            t62 t62Var3 = zo0Var3.h;
            if (xf3Var3 == null || t62Var3 == null) {
                return;
            }
            xf3Var3.f();
        }
    }

    @Override // yads.we2
    public final void onPlaybackStateChanged(int i) {
        if (i == 2) {
            this.b = true;
            zo0 zo0Var = this.d;
            xf3 xf3Var = zo0Var.i;
            t62 t62Var = zo0Var.h;
            if (xf3Var == null || t62Var == null) {
                return;
            }
            xf3Var.b();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            this.a = false;
            zo0 zo0Var2 = this.d;
            xf3 xf3Var2 = zo0Var2.i;
            t62 t62Var2 = zo0Var2.h;
            if (xf3Var2 == null || t62Var2 == null) {
                return;
            }
            xf3Var2.d();
            return;
        }
        this.d.g.b.a();
        zo0 zo0Var3 = this.d;
        xf3 xf3Var3 = zo0Var3.i;
        t62 t62Var3 = zo0Var3.h;
        if (xf3Var3 != null && t62Var3 != null) {
            xf3Var3.h();
        }
        if (this.b) {
            this.b = false;
            zo0 zo0Var4 = this.d;
            xf3 xf3Var4 = zo0Var4.i;
            t62 t62Var4 = zo0Var4.h;
            if (xf3Var4 == null || t62Var4 == null) {
                return;
            }
            xf3Var4.a();
        }
    }
}
