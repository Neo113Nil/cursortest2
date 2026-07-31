package com.ogury.ad.internal;

import com.ogury.ad.common.OguryMediation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class n extends Lambda implements Function0 {
    public final /* synthetic */ o a;
    public final /* synthetic */ x b;
    public final /* synthetic */ c c;
    public final /* synthetic */ String d;
    public final /* synthetic */ OguryMediation e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, x xVar, c cVar, String str, OguryMediation oguryMediation, boolean z, String str2, int i) {
        super(0);
        this.a = oVar;
        this.b = xVar;
        this.c = cVar;
        this.d = str;
        this.e = oguryMediation;
        this.f = z;
        this.g = str2;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        try {
            return o.a(this.a, this.b, this.c, null, this.d, this.e, this.f, true, this.g);
        } catch (Throwable th) {
            o.a(this.a, this.c, this.d, this.e, th, true, this.f, this.h);
            throw new ph(th, nh.b);
        }
    }
}
