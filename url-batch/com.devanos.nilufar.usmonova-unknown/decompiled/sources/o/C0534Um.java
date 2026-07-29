package o;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: o.Um, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0534Um implements OnBackAnimationCallback {
    public final /* synthetic */ AbstractActivityC0560Vm a;

    public C0534Um(AbstractActivityC0560Vm abstractActivityC0560Vm) {
        this.a = abstractActivityC0560Vm;
    }

    public final void onBackCancelled() {
        AbstractActivityC0560Vm abstractActivityC0560Vm = this.a;
        if (abstractActivityC0560Vm.j("cancelBackGesture")) {
            C0664Zm c0664Zm = abstractActivityC0560Vm.i;
            c0664Zm.c();
            C0862cn c0862cn = c0664Zm.b;
            if (c0862cn != null) {
                c0862cn.j.a.E("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC0560Vm abstractActivityC0560Vm = this.a;
        if (abstractActivityC0560Vm.j("commitBackGesture")) {
            C0664Zm c0664Zm = abstractActivityC0560Vm.i;
            c0664Zm.c();
            C0862cn c0862cn = c0664Zm.b;
            if (c0862cn != null) {
                c0862cn.j.a.E("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0560Vm abstractActivityC0560Vm = this.a;
        if (abstractActivityC0560Vm.j("updateBackGestureProgress")) {
            C0664Zm c0664Zm = abstractActivityC0560Vm.i;
            c0664Zm.c();
            C0862cn c0862cn = c0664Zm.b;
            if (c0862cn != null) {
                c0862cn.j.a.E("updateBackGestureProgress", P7.a(backEvent), null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0560Vm abstractActivityC0560Vm = this.a;
        if (abstractActivityC0560Vm.j("startBackGesture")) {
            C0664Zm c0664Zm = abstractActivityC0560Vm.i;
            c0664Zm.c();
            C0862cn c0862cn = c0664Zm.b;
            if (c0862cn != null) {
                c0862cn.j.a.E("startBackGesture", P7.a(backEvent), null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }
}
