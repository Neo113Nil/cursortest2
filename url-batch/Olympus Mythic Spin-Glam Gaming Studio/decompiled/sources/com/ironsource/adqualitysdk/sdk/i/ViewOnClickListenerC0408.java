package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ǀ, reason: contains not printable characters */
/* loaded from: classes13.dex */
public final class ViewOnClickListenerC0408 extends AbstractC0403 implements View.OnClickListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f232 = StringFog.decrypt("+BIbPgw3wW3eDyw3CzHYZdIfNyAEIMVT\n", "t3xYUmVUqiE=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0424 f233;

    public ViewOnClickListenerC0408(View.OnClickListener onClickListener, InterfaceC0424 interfaceC0424) {
        super(onClickListener);
        this.f233 = interfaceC0424;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f233.mo3990(this, view);
        } catch (Throwable th) {
            AbstractC0577.m4068(f232, StringFog.decrypt("mc7eIKH/IDb80fgtn7Y6LLnSyT3zsCcbsNXPJA==\n", "3LysT9PfSVg=\n"), th, false);
        }
        Object obj = this.f223;
        if (obj != null) {
            ((View.OnClickListener) obj).onClick(view);
        }
    }
}
