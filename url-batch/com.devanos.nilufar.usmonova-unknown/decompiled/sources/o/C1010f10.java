package o;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* renamed from: o.f10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1010f10 {
    public static final C1142h10 b;
    public final C1142h10 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 30 ? new Y00() : i >= 29 ? new X00() : new W00()).b().a.a().a.b().a.c();
    }

    public C1010f10(C1142h10 c1142h10) {
        this.a = c1142h10;
    }

    public C1142h10 a() {
        return this.a;
    }

    public C1142h10 b() {
        return this.a;
    }

    public C1142h10 c() {
        return this.a;
    }

    public C0167Gi e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1010f10)) {
            return false;
        }
        C1010f10 c1010f10 = (C1010f10) obj;
        return m() == c1010f10.m() && l() == c1010f10.l() && Objects.equals(i(), c1010f10.i()) && Objects.equals(g(), c1010f10.g()) && Objects.equals(e(), c1010f10.e());
    }

    public C0644Ys f() {
        return i();
    }

    public C0644Ys g() {
        return C0644Ys.e;
    }

    public C0644Ys h() {
        return i();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(m()), Boolean.valueOf(l()), i(), g(), e());
    }

    public C0644Ys i() {
        return C0644Ys.e;
    }

    public C0644Ys j() {
        return i();
    }

    public C1142h10 k(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public boolean n(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void o(C0644Ys[] c0644YsArr) {
    }

    public void p(C1142h10 c1142h10) {
    }

    public void q(C0644Ys c0644Ys) {
    }
}
