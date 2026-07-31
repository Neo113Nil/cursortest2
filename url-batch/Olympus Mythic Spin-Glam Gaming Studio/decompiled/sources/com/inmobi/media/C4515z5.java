package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;

/* renamed from: com.inmobi.media.z5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4515z5 implements Bj {
    public Sc a;
    public AbstractC4353t1 b;
    public E8 c;

    public C4515z5(E8 e8) {
        this.a = null;
        this.b = null;
        this.c = e8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r1, null, null, new com.inmobi.media.C4489y5(r7, null), 3, null);
     */
    @Override // com.inmobi.media.Bj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Job launch$default;
        InterfaceC4466x9 c;
        E8 e8 = this.c;
        if (e8 != null && (c = e8.c()) != null) {
            ((C4493y9) c).a("AUM-DestroyedState", "Initialize Called");
        }
        E8 e82 = this.c;
        if (e82 == null || (r1 = e82.a()) == null || launch$default == null) {
            return;
        }
        launch$default.invokeOnCompletion(new Function1() { // from class: com.inmobi.media.z5$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4515z5.a(C4515z5.this, (Throwable) obj);
            }
        });
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    public C4515z5(Sc sc, AbstractC4353t1 abstractC4353t1, E8 e8) {
        this.a = sc;
        this.b = abstractC4353t1;
        this.c = e8;
    }

    public static final Unit a(C4515z5 c4515z5, Throwable th) {
        InterfaceC4466x9 c;
        E8 e8 = c4515z5.c;
        if (e8 != null && (c = e8.c()) != null) {
            ((C4493y9) c).a();
        }
        E8 e82 = c4515z5.c;
        N3.a(e82 != null ? e82.a() : null);
        c4515z5.b = null;
        c4515z5.c = null;
        c4515z5.a = null;
        return Unit.INSTANCE;
    }
}
