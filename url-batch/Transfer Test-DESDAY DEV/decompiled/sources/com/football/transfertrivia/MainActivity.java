package com.football.transfertrivia;

import R0.ViewOnClickListenerC0027a;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import g1.f;
import t0.b;

/* loaded from: classes.dex */
public final class MainActivity extends AppCompatActivity {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f1746A = 0;

    /* renamed from: z, reason: collision with root package name */
    public b f1747z;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b inflate = b.inflate(getLayoutInflater());
        this.f1747z = inflate;
        if (inflate == null) {
            f.g("binding");
            throw null;
        }
        setContentView(inflate.f3775a);
        b bVar = this.f1747z;
        if (bVar == null) {
            f.g("binding");
            throw null;
        }
        bVar.f3776b.setOnClickListener(new ViewOnClickListenerC0027a(4, this));
    }
}
