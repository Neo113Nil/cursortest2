package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʄ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0444 extends WeakHashMap implements InterfaceC1111 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0426 f327;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C1189 f328;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0444(C0426 c0426, WeakHashMap weakHashMap, C1189 c1189) {
        super(weakHashMap);
        this.f327 = c0426;
        this.f328 = c1189;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        View view = (View) obj;
        WeakReference weakReference = (WeakReference) obj2;
        this.f327.m4103(this, this.f328, StringFog.decrypt("iN1E/jJKf2SR2VH8DE5NaIvdQLk0Wko=\n", "xrwwl0QvPgA=\n"), view, weakReference);
        return (WeakReference) super.put(view, weakReference);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1111
    /* renamed from: ﾒ */
    public final Object mo3996() {
        return this;
    }
}
