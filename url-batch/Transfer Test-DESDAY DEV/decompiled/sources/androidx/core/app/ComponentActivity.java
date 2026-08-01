package androidx.core.app;

import A.c;
import K.InterfaceC0013l;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.D;
import androidx.lifecycle.F;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import g1.f;

/* loaded from: classes.dex */
public class ComponentActivity extends Activity implements t, InterfaceC0013l {

    /* renamed from: a, reason: collision with root package name */
    public final v f1436a = new v(this);

    public v d() {
        return this.f1436a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        f.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        f.d(decorView, "window.decorView");
        if (c.z(decorView, keyEvent)) {
            return true;
        }
        return c.A(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        f.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        f.d(decorView, "window.decorView");
        if (c.z(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // K.InterfaceC0013l
    public final boolean e(KeyEvent keyEvent) {
        f.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = F.f1492b;
        D.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        f.e(bundle, "outState");
        this.f1436a.g();
        super.onSaveInstanceState(bundle);
    }
}
