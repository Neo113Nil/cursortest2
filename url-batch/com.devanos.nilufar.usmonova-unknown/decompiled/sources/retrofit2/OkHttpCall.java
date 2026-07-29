package retrofit2;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import o.A9;
import o.AbstractC0048Bt;
import o.AbstractC0946e20;
import o.AbstractC1166hO;
import o.AbstractC2113vo;
import o.C0897dI;
import o.C0903dO;
import o.C0968eO;
import o.C1334k;
import o.EF;
import o.FN;
import o.G8;
import o.InterfaceC1940t9;
import o.InterfaceC2006u9;
import o.KL;
import o.N8;
import o.NB;
import o.NL;
import o.NV;

/* loaded from: classes.dex */
final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final InterfaceC1940t9 callFactory;
    private volatile boolean canceled;

    @GuardedBy("this")
    @Nullable
    private Throwable creationFailure;

    @GuardedBy("this")
    private boolean executed;
    private final Object instance;

    @GuardedBy("this")
    @Nullable
    private InterfaceC2006u9 rawCall;
    private final RequestFactory requestFactory;
    private final Converter<AbstractC1166hO, T> responseConverter;

    public static final class ExceptionCatchingResponseBody extends AbstractC1166hO {
        private final AbstractC1166hO delegate;
        private final N8 delegateSource;

        @Nullable
        IOException thrownException;

        public ExceptionCatchingResponseBody(AbstractC1166hO abstractC1166hO) {
            this.delegate = abstractC1166hO;
            this.delegateSource = AbstractC0946e20.h(new AbstractC2113vo(abstractC1166hO.source()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // o.AbstractC2113vo, o.HS
                public long read(G8 g8, long j) {
                    try {
                        return super.read(g8, j);
                    } catch (IOException e) {
                        ExceptionCatchingResponseBody.this.thrownException = e;
                        throw e;
                    }
                }
            });
        }

        @Override // o.AbstractC1166hO, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // o.AbstractC1166hO
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // o.AbstractC1166hO
        public NB contentType() {
            return this.delegate.contentType();
        }

        @Override // o.AbstractC1166hO
        public N8 source() {
            return this.delegateSource;
        }

        public void throwIfCaught() {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public static final class NoContentResponseBody extends AbstractC1166hO {
        private final long contentLength;

        @Nullable
        private final NB contentType;

        public NoContentResponseBody(@Nullable NB nb, long j) {
            this.contentType = nb;
            this.contentLength = j;
        }

        @Override // o.AbstractC1166hO
        public long contentLength() {
            return this.contentLength;
        }

        @Override // o.AbstractC1166hO
        public NB contentType() {
            return this.contentType;
        }

        @Override // o.AbstractC1166hO
        public N8 source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(RequestFactory requestFactory, Object obj, Object[] objArr, InterfaceC1940t9 interfaceC1940t9, Converter<AbstractC1166hO, T> converter) {
        this.requestFactory = requestFactory;
        this.instance = obj;
        this.args = objArr;
        this.callFactory = interfaceC1940t9;
        this.responseConverter = converter;
    }

    private InterfaceC2006u9 createRawCall() {
        InterfaceC1940t9 interfaceC1940t9 = this.callFactory;
        FN create = this.requestFactory.create(this.instance, this.args);
        EF ef = (EF) interfaceC1940t9;
        ef.getClass();
        AbstractC0048Bt.n(create, "request");
        return new NL(ef, create);
    }

    @GuardedBy("this")
    private InterfaceC2006u9 getRawCall() {
        InterfaceC2006u9 interfaceC2006u9 = this.rawCall;
        if (interfaceC2006u9 != null) {
            return interfaceC2006u9;
        }
        Throwable th = this.creationFailure;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            InterfaceC2006u9 createRawCall = createRawCall();
            this.rawCall = createRawCall;
            return createRawCall;
        } catch (IOException | Error | RuntimeException e) {
            Utils.throwIfFatal(e);
            this.creationFailure = e;
            throw e;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        InterfaceC2006u9 interfaceC2006u9;
        this.canceled = true;
        synchronized (this) {
            interfaceC2006u9 = this.rawCall;
        }
        if (interfaceC2006u9 != null) {
            ((NL) interfaceC2006u9).cancel();
        }
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        InterfaceC2006u9 interfaceC2006u9;
        Throwable th;
        KL kl;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            try {
            } catch (Throwable th2) {
                th = th2;
                Utils.throwIfFatal(th);
                this.creationFailure = th;
            } finally {
            }
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            interfaceC2006u9 = this.rawCall;
            th = this.creationFailure;
            if (interfaceC2006u9 == null && th == null) {
                InterfaceC2006u9 createRawCall = createRawCall();
                this.rawCall = createRawCall;
                interfaceC2006u9 = createRawCall;
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            ((NL) interfaceC2006u9).cancel();
        }
        A9 a9 = new A9() { // from class: retrofit2.OkHttpCall.1
            private void callFailure(Throwable th3) {
                try {
                    callback.onFailure(OkHttpCall.this, th3);
                } catch (Throwable th4) {
                    Utils.throwIfFatal(th4);
                    th4.printStackTrace();
                }
            }

            @Override // o.A9
            public void onFailure(InterfaceC2006u9 interfaceC2006u92, IOException iOException) {
                callFailure(iOException);
            }

            @Override // o.A9
            public void onResponse(InterfaceC2006u9 interfaceC2006u92, C0968eO c0968eO) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(c0968eO));
                    } catch (Throwable th3) {
                        Utils.throwIfFatal(th3);
                        th3.printStackTrace();
                    }
                } catch (Throwable th4) {
                    Utils.throwIfFatal(th4);
                    callFailure(th4);
                }
            }
        };
        NL nl = (NL) interfaceC2006u9;
        nl.getClass();
        if (!nl.l.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        C0897dI c0897dI = C0897dI.a;
        nl.m = C0897dI.a.g();
        C1334k c1334k = nl.h.h;
        KL kl2 = new KL(nl, a9);
        c1334k.getClass();
        synchronized (c1334k) {
            ((ArrayDeque) c1334k.j).add(kl2);
            String str = nl.i.a.d;
            Iterator it = ((ArrayDeque) c1334k.k).iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator it2 = ((ArrayDeque) c1334k.j).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            kl = null;
                            break;
                        } else {
                            kl = (KL) it2.next();
                            if (AbstractC0048Bt.h(kl.j.i.a.d, str)) {
                            }
                        }
                    }
                } else {
                    kl = (KL) it.next();
                    if (AbstractC0048Bt.h(kl.j.i.a.d, str)) {
                    }
                }
            }
            if (kl != null) {
                kl2.i = kl.i;
            }
        }
        c1334k.E();
    }

    @Override // retrofit2.Call
    public Response<T> execute() {
        InterfaceC2006u9 rawCall;
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            rawCall = getRawCall();
        }
        if (this.canceled) {
            ((NL) rawCall).cancel();
        }
        NL nl = (NL) rawCall;
        if (!nl.l.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        nl.k.h();
        C0897dI c0897dI = C0897dI.a;
        nl.m = C0897dI.a.g();
        try {
            C1334k c1334k = nl.h.h;
            synchronized (c1334k) {
                ((ArrayDeque) c1334k.l).add(nl);
            }
            C0968eO e = nl.e();
            C1334k c1334k2 = nl.h.h;
            c1334k2.p((ArrayDeque) c1334k2.l, nl);
            return parseResponse(e);
        } catch (Throwable th) {
            C1334k c1334k3 = nl.h.h;
            c1334k3.p((ArrayDeque) c1334k3.l, nl);
            throw th;
        }
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            InterfaceC2006u9 interfaceC2006u9 = this.rawCall;
            if (interfaceC2006u9 == null || !((NL) interfaceC2006u9).u) {
                z = false;
            }
        }
        return z;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    public Response<T> parseResponse(C0968eO c0968eO) {
        AbstractC1166hO abstractC1166hO = c0968eO.n;
        C0903dO c = c0968eO.c();
        c.g = new NoContentResponseBody(abstractC1166hO.contentType(), abstractC1166hO.contentLength());
        C0968eO a = c.a();
        int i = a.k;
        if (i < 200 || i >= 300) {
            try {
                return Response.error(Utils.buffer(abstractC1166hO), a);
            } finally {
                abstractC1166hO.close();
            }
        }
        if (i == 204 || i == 205) {
            abstractC1166hO.close();
            return Response.success((Object) null, a);
        }
        ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(abstractC1166hO);
        try {
            return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), a);
        } catch (RuntimeException e) {
            exceptionCatchingResponseBody.throwIfCaught();
            throw e;
        }
    }

    @Override // retrofit2.Call
    public synchronized FN request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return ((NL) getRawCall()).i;
    }

    @Override // retrofit2.Call
    public synchronized NV timeout() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create call.", e);
        }
        return ((NL) getRawCall()).k;
    }

    @Override // retrofit2.Call
    public OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.requestFactory, this.instance, this.args, this.callFactory, this.responseConverter);
    }
}
