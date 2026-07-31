package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.dh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5286dh {
    public final Context a;
    public final InterfaceC5730ul b;
    public final D6 c;
    public final Jb d = new Jb();
    public final G4 e = new G4(new C5628qm(), new F4(), null);
    public final Consumer f;

    public C5286dh(Context context, final InterfaceC5689t6 interfaceC5689t6, final EnumC5798xb enumC5798xb, InterfaceC5730ul interfaceC5730ul, D6 d6) {
        this.a = context;
        this.b = interfaceC5730ul;
        this.c = d6;
        this.f = new Consumer() { // from class: io.appmetrica.analytics.impl.dh$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                C5286dh.a(EnumC5798xb.this, this, interfaceC5689t6, (Fb) obj);
            }
        };
    }

    public static final void a(EnumC5798xb enumC5798xb, C5286dh c5286dh, InterfaceC5689t6 interfaceC5689t6, Fb fb) {
        String str = fb.h;
        C5350g4 c5350g4 = new C5350g4(str, fb.e, fb.f, fb.g, fb.i);
        String str2 = fb.b;
        byte[] bArr = fb.a;
        int i = fb.c;
        HashMap hashMap = fb.d;
        String str3 = fb.j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        long a = ((C5693ta) c5286dh.c).a(fb);
        Set set = Q9.a;
        C5273d4 c5273d4 = new C5273d4(bArr, str2, enumC5798xb.a, orCreatePublicLogger);
        c5273d4.b(a);
        c5273d4.q = hashMap;
        c5273d4.g = i;
        c5273d4.c = str3;
        ((C5234bh) interfaceC5689t6).a(c5350g4, c5273d4, c5286dh.e);
    }
}
