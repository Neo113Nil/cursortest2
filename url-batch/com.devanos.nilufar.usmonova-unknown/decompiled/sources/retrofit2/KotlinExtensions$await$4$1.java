package retrofit2;

import kotlin.Metadata;
import o.AbstractC1596ny;
import o.C0782bY;
import o.InterfaceC2114vp;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "Lo/bY;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class KotlinExtensions$await$4$1 extends AbstractC1596ny implements InterfaceC2114vp {
    final /* synthetic */ Call<T> $this_await;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinExtensions$await$4$1(Call<T> call) {
        super(1);
        this.$this_await = call;
    }

    @Override // o.InterfaceC2114vp
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C0782bY.a;
    }

    public final void invoke(Throwable th) {
        this.$this_await.cancel();
    }
}
