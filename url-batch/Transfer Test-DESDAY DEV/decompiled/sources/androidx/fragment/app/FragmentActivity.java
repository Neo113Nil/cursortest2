package androidx.fragment.app;

import A0.h;
import J.a;
import Y.AbstractComponentCallbacksC0049q;
import Y.C0051t;
import Y.C0052u;
import Y.I;
import Y.Q;
import Y.r;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.EnumC0072m;
import androidx.lifecycle.v;
import d0.C0089a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.l;

/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f1477x = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1480u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1481v;

    /* renamed from: s, reason: collision with root package name */
    public final h f1478s = new h(15, new C0052u(this));

    /* renamed from: t, reason: collision with root package name */
    public final v f1479t = new v(this);

    /* renamed from: w, reason: collision with root package name */
    public boolean f1482w = true;

    public FragmentActivity() {
        this.d.f2617b.e("android:support:lifecycle", new r(0, this));
        final int i = 0;
        g(new a(this) { // from class: Y.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f1144b;

            {
                this.f1144b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        this.f1144b.f1478s.y();
                        break;
                    default:
                        this.f1144b.f1478s.y();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.f1244k.add(new a(this) { // from class: Y.s

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f1144b;

            {
                this.f1144b = this;
            }

            @Override // J.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        this.f1144b.f1478s.y();
                        break;
                    default:
                        this.f1144b.f1478s.y();
                        break;
                }
            }
        });
        h(new C0051t(this, 0));
    }

    public static boolean k(I i) {
        boolean z2 = false;
        for (AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q : i.f963c.h()) {
            if (abstractComponentCallbacksC0049q != null) {
                C0052u c0052u = abstractComponentCallbacksC0049q.f1133s;
                if ((c0052u == null ? null : c0052u.f1150e) != null) {
                    z2 |= k(abstractComponentCallbacksC0049q.g());
                }
                Q q2 = abstractComponentCallbacksC0049q.f1113N;
                EnumC0072m enumC0072m = EnumC0072m.d;
                if (q2 != null && q2.d().d.compareTo(enumC0072m) >= 0) {
                    abstractComponentCallbacksC0049q.f1113N.f1018c.g();
                    z2 = true;
                }
                if (abstractComponentCallbacksC0049q.f1112M.d.compareTo(enumC0072m) >= 0) {
                    abstractComponentCallbacksC0049q.f1112M.g();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r1.equals("--list-dumpables") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (r1.equals("--dump-dumpable") == false) goto L34;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f1480u);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1481v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1482w);
        if (getApplication() != null) {
            l lVar = ((C0089a) new h(c(), C0089a.f2100c).x(C0089a.class)).f2101b;
            if (lVar.f3189c > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (lVar.f3189c > 0) {
                    if (lVar.f3188b[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(lVar.f3187a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0052u) this.f1478s.f30b).d.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f1478s.y();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1479t.d(EnumC0071l.ON_CREATE);
        I i = ((C0052u) this.f1478s.f30b).d;
        i.f953E = false;
        i.F = false;
        i.f959L.f995g = false;
        i.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0052u) this.f1478s.f30b).d.f965f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C0052u) this.f1478s.f30b).d.k();
        this.f1479t.d(EnumC0071l.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0052u) this.f1478s.f30b).d.i();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f1481v = false;
        ((C0052u) this.f1478s.f30b).d.t(5);
        this.f1479t.d(EnumC0071l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f1479t.d(EnumC0071l.ON_RESUME);
        I i = ((C0052u) this.f1478s.f30b).d;
        i.f953E = false;
        i.F = false;
        i.f959L.f995g = false;
        i.t(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f1478s.y();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        h hVar = this.f1478s;
        hVar.y();
        super.onResume();
        this.f1481v = true;
        ((C0052u) hVar.f30b).d.y(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        h hVar = this.f1478s;
        hVar.y();
        super.onStart();
        this.f1482w = false;
        boolean z2 = this.f1480u;
        C0052u c0052u = (C0052u) hVar.f30b;
        if (!z2) {
            this.f1480u = true;
            I i = c0052u.d;
            i.f953E = false;
            i.F = false;
            i.f959L.f995g = false;
            i.t(4);
        }
        c0052u.d.y(true);
        this.f1479t.d(EnumC0071l.ON_START);
        I i2 = c0052u.d;
        i2.f953E = false;
        i2.F = false;
        i2.f959L.f995g = false;
        i2.t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f1478s.y();
    }

    @Override // android.app.Activity
    public void onStop() {
        h hVar;
        super.onStop();
        this.f1482w = true;
        do {
            hVar = this.f1478s;
        } while (k(((C0052u) hVar.f30b).d));
        I i = ((C0052u) hVar.f30b).d;
        i.F = true;
        i.f959L.f995g = true;
        i.t(4);
        this.f1479t.d(EnumC0071l.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0052u) this.f1478s.f30b).d.f965f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
