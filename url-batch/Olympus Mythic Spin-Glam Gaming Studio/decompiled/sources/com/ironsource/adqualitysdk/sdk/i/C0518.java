package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ς, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0518 extends BroadcastReceiver {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C1284 f483;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ List f484;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f485;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0785 f486;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1064 f487;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f488;

    public C0518(C1284 c1284, C1064 c1064, C0880 c0880, C0785 c0785, List list, boolean z) {
        this.f483 = c1284;
        this.f488 = z;
        this.f487 = c1064;
        this.f486 = c0785;
        this.f485 = c0880;
        this.f484 = list;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!this.f488) {
            AbstractC1026.m4313(new C0526(this, context, intent));
            return;
        }
        this.f487.m4337(this.f486, this.f485, C1284.m4531(this.f483, this.f484, new Object[]{this, context, intent}));
    }
}
