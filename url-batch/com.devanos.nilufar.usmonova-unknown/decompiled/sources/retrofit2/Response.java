package retrofit2;

import java.util.ArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import o.AbstractC1166hO;
import o.AbstractC2188wx;
import o.C0968eO;
import o.C1787qr;
import o.C1852rr;
import o.EN;
import o.EnumC1359kL;
import o.FN;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class Response<T> {

    @Nullable
    private final T body;

    @Nullable
    private final AbstractC1166hO errorBody;
    private final C0968eO rawResponse;

    private Response(C0968eO c0968eO, @Nullable T t, @Nullable AbstractC1166hO abstractC1166hO) {
        this.rawResponse = c0968eO;
        this.body = t;
        this.errorBody = abstractC1166hO;
    }

    public static <T> Response<T> error(int i, AbstractC1166hO abstractC1166hO) {
        Objects.requireNonNull(abstractC1166hO, "body == null");
        if (i < 400) {
            throw new IllegalArgumentException(AbstractC2188wx.g(i, "code < 400: "));
        }
        ArrayList arrayList = new ArrayList(20);
        OkHttpCall.NoContentResponseBody noContentResponseBody = new OkHttpCall.NoContentResponseBody(abstractC1166hO.contentType(), abstractC1166hO.contentLength());
        EN en = new EN();
        en.e();
        FN a = en.a();
        if (i < 0) {
            throw new IllegalStateException(AbstractC2188wx.g(i, "code < 0: ").toString());
        }
        return error(abstractC1166hO, new C0968eO(a, EnumC1359kL.j, "Response.error()", i, null, new C1852rr((String[]) arrayList.toArray(new String[0])), noContentResponseBody, null, null, null, 0L, 0L, null));
    }

    public static <T> Response<T> success(@Nullable T t, C1852rr c1852rr) {
        Objects.requireNonNull(c1852rr, "headers == null");
        new C1787qr();
        C1787qr l = c1852rr.l();
        EN en = new EN();
        en.e();
        return success(t, new C0968eO(en.a(), EnumC1359kL.j, "OK", 200, null, l.d(), null, null, null, null, 0L, 0L, null));
    }

    @Nullable
    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.k;
    }

    @Nullable
    public AbstractC1166hO errorBody() {
        return this.errorBody;
    }

    public C1852rr headers() {
        return this.rawResponse.m;
    }

    public boolean isSuccessful() {
        int i = this.rawResponse.k;
        return 200 <= i && i < 300;
    }

    public String message() {
        return this.rawResponse.j;
    }

    public C0968eO raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    public static <T> Response<T> success(@Nullable T t, C0968eO c0968eO) {
        Objects.requireNonNull(c0968eO, "rawResponse == null");
        int i = c0968eO.k;
        if (200 <= i && i < 300) {
            return new Response<>(c0968eO, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public static <T> Response<T> success(int i, @Nullable T t) {
        if (i >= 200 && i < 300) {
            ArrayList arrayList = new ArrayList(20);
            EN en = new EN();
            en.e();
            FN a = en.a();
            if (i >= 0) {
                return success(t, new C0968eO(a, EnumC1359kL.j, "Response.success()", i, null, new C1852rr((String[]) arrayList.toArray(new String[0])), null, null, null, null, 0L, 0L, null));
            }
            throw new IllegalStateException(AbstractC2188wx.g(i, "code < 0: ").toString());
        }
        throw new IllegalArgumentException(AbstractC2188wx.g(i, "code < 200 or >= 300: "));
    }

    public static <T> Response<T> error(AbstractC1166hO abstractC1166hO, C0968eO c0968eO) {
        Objects.requireNonNull(abstractC1166hO, "body == null");
        Objects.requireNonNull(c0968eO, "rawResponse == null");
        int i = c0968eO.k;
        if (200 <= i && i < 300) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new Response<>(c0968eO, null, abstractC1166hO);
    }

    public static <T> Response<T> success(@Nullable T t) {
        ArrayList arrayList = new ArrayList(20);
        EN en = new EN();
        en.e();
        return success(t, new C0968eO(en.a(), EnumC1359kL.j, "OK", 200, null, new C1852rr((String[]) arrayList.toArray(new String[0])), null, null, null, null, 0L, 0L, null));
    }
}
