package retrofit2;

import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC0115Ei;
import o.AbstractC1473m3;
import o.AbstractC1494mO;
import o.C0057Cc;
import o.C0742ay;
import o.C0782bY;
import o.C0849ca;
import o.EnumC0448Re;
import o.FN;
import o.InterfaceC0718aa;
import o.InterfaceC2235xe;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a \u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a$\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a(\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0087@¢\u0006\u0004\b\b\u0010\u0007\u001a\u001a\u0010\u0006\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\t0\u0005H\u0087@¢\u0006\u0004\b\n\u0010\u0007\u001a&\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@¢\u0006\u0004\b\f\u0010\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0080@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "T", "Lretrofit2/Retrofit;", "create", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "Lretrofit2/Call;", "await", "(Lretrofit2/Call;Lo/xe;)Ljava/lang/Object;", "awaitNullable", "Lo/bY;", "awaitUnit", "Lretrofit2/Response;", "awaitResponse", "", "", "suspendAndThrow", "(Ljava/lang/Throwable;Lo/xe;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinExtensions {
    public static final <T> Object await(Call<T> call, InterfaceC2235xe<? super T> interfaceC2235xe) {
        final C0849ca c0849ca = new C0849ca(1, AbstractC1473m3.L(interfaceC2235xe));
        c0849ca.r();
        c0849ca.t(new KotlinExtensions$await$2$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t) {
                AbstractC0048Bt.n(call2, "call");
                AbstractC0048Bt.n(t, "t");
                InterfaceC0718aa.this.resumeWith(AbstractC1494mO.d(t));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                AbstractC0048Bt.n(call2, "call");
                AbstractC0048Bt.n(response, "response");
                if (!response.isSuccessful()) {
                    InterfaceC0718aa.this.resumeWith(AbstractC1494mO.d(new HttpException(response)));
                    return;
                }
                T body = response.body();
                if (body != null) {
                    InterfaceC0718aa.this.resumeWith(body);
                    return;
                }
                FN request = call2.request();
                request.getClass();
                Object cast = Invocation.class.cast(request.e.get(Invocation.class));
                AbstractC0048Bt.k(cast);
                Invocation invocation = (Invocation) cast;
                InterfaceC0718aa.this.resumeWith(AbstractC1494mO.d(new C0742ay("Response from " + invocation.service().getName() + '.' + invocation.method().getName() + " was null but response body type was declared as non-null")));
            }
        });
        return c0849ca.q();
    }

    public static final <T> Object awaitNullable(Call<T> call, InterfaceC2235xe<? super T> interfaceC2235xe) {
        final C0849ca c0849ca = new C0849ca(1, AbstractC1473m3.L(interfaceC2235xe));
        c0849ca.r();
        c0849ca.t(new KotlinExtensions$await$4$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t) {
                AbstractC0048Bt.n(call2, "call");
                AbstractC0048Bt.n(t, "t");
                InterfaceC0718aa.this.resumeWith(AbstractC1494mO.d(t));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                AbstractC0048Bt.n(call2, "call");
                AbstractC0048Bt.n(response, "response");
                if (response.isSuccessful()) {
                    InterfaceC0718aa.this.resumeWith(response.body());
                } else {
                    InterfaceC0718aa.this.resumeWith(AbstractC1494mO.d(new HttpException(response)));
                }
            }
        });
        return c0849ca.q();
    }

    public static final <T> Object awaitResponse(Call<T> call, InterfaceC2235xe<? super Response<T>> interfaceC2235xe) {
        final C0849ca c0849ca = new C0849ca(1, AbstractC1473m3.L(interfaceC2235xe));
        c0849ca.r();
        c0849ca.t(new KotlinExtensions$awaitResponse$2$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t) {
                AbstractC0048Bt.n(call2, "call");
                AbstractC0048Bt.n(t, "t");
                InterfaceC0718aa.this.resumeWith(AbstractC1494mO.d(t));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                AbstractC0048Bt.n(call2, "call");
                AbstractC0048Bt.n(response, "response");
                InterfaceC0718aa.this.resumeWith(response);
            }
        });
        return c0849ca.q();
    }

    public static final Object awaitUnit(Call<C0782bY> call, InterfaceC2235xe<? super C0782bY> interfaceC2235xe) {
        AbstractC0048Bt.l(call, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return awaitNullable(call, interfaceC2235xe);
    }

    public static final <T> T create(Retrofit retrofit) {
        AbstractC0048Bt.n(retrofit, "<this>");
        AbstractC0048Bt.h0();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object suspendAndThrow(final Throwable th, InterfaceC2235xe<?> interfaceC2235xe) {
        final KotlinExtensions$suspendAndThrow$1 kotlinExtensions$suspendAndThrow$1;
        int i;
        if (interfaceC2235xe instanceof KotlinExtensions$suspendAndThrow$1) {
            kotlinExtensions$suspendAndThrow$1 = (KotlinExtensions$suspendAndThrow$1) interfaceC2235xe;
            int i2 = kotlinExtensions$suspendAndThrow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kotlinExtensions$suspendAndThrow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kotlinExtensions$suspendAndThrow$1.result;
                i = kotlinExtensions$suspendAndThrow$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1494mO.l(obj);
                    throw new C0057Cc();
                }
                AbstractC1494mO.l(obj);
                kotlinExtensions$suspendAndThrow$1.L$0 = th;
                kotlinExtensions$suspendAndThrow$1.label = 1;
                AbstractC0115Ei.a.L(kotlinExtensions$suspendAndThrow$1.getContext(), new Runnable() { // from class: retrofit2.KotlinExtensions$suspendAndThrow$2$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC1473m3.L(kotlinExtensions$suspendAndThrow$1).resumeWith(AbstractC1494mO.d(th));
                    }
                });
                return EnumC0448Re.h;
            }
        }
        kotlinExtensions$suspendAndThrow$1 = new KotlinExtensions$suspendAndThrow$1(interfaceC2235xe);
        Object obj2 = kotlinExtensions$suspendAndThrow$1.result;
        i = kotlinExtensions$suspendAndThrow$1.label;
        if (i == 0) {
        }
    }
}
