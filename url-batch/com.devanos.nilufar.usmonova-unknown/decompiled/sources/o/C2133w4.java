package o;

import com.devanos.nilufar.usmonova.p7.data.network.ApiService;
import com.devanos.nilufar.usmonova.p7.data.network.dto.ClickPayloadDto;

/* renamed from: o.w4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2133w4 extends AbstractC2225xU implements InterfaceC2114vp {
    public int h;
    public final /* synthetic */ C4 i;
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2133w4(C4 c4, String str, String str2, String str3, InterfaceC2235xe interfaceC2235xe) {
        super(1, interfaceC2235xe);
        this.i = c4;
        this.j = str;
        this.k = str2;
        this.l = str3;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(InterfaceC2235xe interfaceC2235xe) {
        return new C2133w4(this.i, this.j, this.k, this.l, interfaceC2235xe);
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        return ((C2133w4) create((InterfaceC2235xe) obj)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            C4 c4 = this.i;
            ApiService a = c4.a();
            String f0 = AbstractC1473m3.f0(AbstractC1473m3.f(73, 51, 112, 16, 39, 206, 87, 2));
            ClickPayloadDto clickPayloadDto = new ClickPayloadDto(this.j, this.k, this.l, c4.d.a());
            this.h = 1;
            Object postClick = a.postClick(f0, clickPayloadDto, this);
            EnumC0448Re enumC0448Re = EnumC0448Re.h;
            if (postClick == enumC0448Re) {
                return enumC0448Re;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
        }
        return C0782bY.a;
    }
}
