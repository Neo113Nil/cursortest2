package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* loaded from: classes4.dex */
public class a extends Fragment {
    private static final String b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";
    private InterfaceC1367a a;

    /* renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    interface InterfaceC1367a {
        void a(Activity activity);

        void b(Activity activity);

        void c(Activity activity);
    }

    static a a(Activity activity) {
        return (a) activity.getFragmentManager().findFragmentByTag(b);
    }

    static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new a(), b).commit();
        fragmentManager.executePendingTransactions();
    }

    private void c(InterfaceC1367a interfaceC1367a) {
        if (interfaceC1367a != null) {
            interfaceC1367a.b(getActivity());
        }
    }

    void d(InterfaceC1367a interfaceC1367a) {
        this.a = interfaceC1367a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    private void a(InterfaceC1367a interfaceC1367a) {
        if (interfaceC1367a != null) {
            interfaceC1367a.c(getActivity());
        }
    }

    private void b(InterfaceC1367a interfaceC1367a) {
        if (interfaceC1367a != null) {
            interfaceC1367a.a(getActivity());
        }
    }
}
