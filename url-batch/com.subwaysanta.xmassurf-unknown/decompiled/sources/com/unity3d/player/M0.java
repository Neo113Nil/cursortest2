package com.unity3d.player;

import android.content.Context;
import com.unity3d.player.a.AbstractC0112k;
import com.unity3d.player.a.AbstractC0120t;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class M0 implements Runnable {
    public final /* synthetic */ UnityPlayerForActivityOrService a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Semaphore l;
    public final /* synthetic */ UnityPlayerForActivityOrService m;

    public M0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, UnityPlayerForActivityOrService unityPlayerForActivityOrService2, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6, Semaphore semaphore) {
        this.m = unityPlayerForActivityOrService;
        this.a = unityPlayerForActivityOrService2;
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str2;
        this.i = i2;
        this.j = z5;
        this.k = z6;
        this.l = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.a.r rVar;
        com.unity3d.player.a.r b;
        com.unity3d.player.a.r rVar2;
        com.unity3d.player.a.r rVar3;
        com.unity3d.player.a.r rVar4;
        try {
            try {
                UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.m;
                rVar = unityPlayerForActivityOrService.mSoftInput;
                if (rVar != null) {
                    unityPlayerForActivityOrService.dismissSoftInput();
                }
                UnityPlayerForActivityOrService unityPlayerForActivityOrService2 = this.m;
                int a = SoftInputProvider.a();
                Context context = this.m.mContext;
                UnityPlayerForActivityOrService unityPlayerForActivityOrService3 = this.a;
                int a2 = AbstractC0112k.a(a);
                if (a2 == 2) {
                    b = new B(context, unityPlayerForActivityOrService3);
                } else if (a2 == 3) {
                    AbstractC0120t.Log(6, "When using URS, all soft input events are forwarded to the client. This code path should not be used.");
                    b = null;
                } else {
                    b = new C(context, unityPlayerForActivityOrService3);
                }
                unityPlayerForActivityOrService2.mSoftInput = b;
                rVar2 = this.m.mSoftInput;
                rVar2.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
                rVar3 = this.m.mSoftInput;
                rVar3.a(new L0(this));
                rVar4 = this.m.mSoftInput;
                rVar4.a();
                this.m.nativeReportKeyboardConfigChanged();
            } catch (Exception e) {
                AbstractC0120t.Log(6, "Exception when opening Softinput " + e);
            }
        } finally {
            this.l.release();
        }
    }
}
