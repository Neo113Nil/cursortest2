package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import o.AbstractC1166hO;
import o.C0968eO;
import o.InterfaceC1940t9;
import o.InterfaceC2235xe;
import retrofit2.Utils;

/* loaded from: classes.dex */
abstract class HttpServiceMethod<ResponseT, ReturnT> extends ServiceMethod<ReturnT> {
    private final InterfaceC1940t9 callFactory;
    private final RequestFactory requestFactory;
    private final Converter<AbstractC1166hO, ResponseT> responseConverter;

    public static final class CallAdapted<ResponseT, ReturnT> extends HttpServiceMethod<ResponseT, ReturnT> {
        private final CallAdapter<ResponseT, ReturnT> callAdapter;

        public CallAdapted(RequestFactory requestFactory, InterfaceC1940t9 interfaceC1940t9, Converter<AbstractC1166hO, ResponseT> converter, CallAdapter<ResponseT, ReturnT> callAdapter) {
            super(requestFactory, interfaceC1940t9, converter);
            this.callAdapter = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        public ReturnT adapt(Call<ResponseT> call, Object[] objArr) {
            return this.callAdapter.adapt(call);
        }
    }

    public static final class SuspendForBody<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;
        private final boolean isNullable;
        private final boolean isUnit;

        public SuspendForBody(RequestFactory requestFactory, InterfaceC1940t9 interfaceC1940t9, Converter<AbstractC1166hO, ResponseT> converter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter, boolean z, boolean z2) {
            super(requestFactory, interfaceC1940t9, converter);
            this.callAdapter = callAdapter;
            this.isNullable = z;
            this.isUnit = z2;
        }

        @Override // retrofit2.HttpServiceMethod
        public Object adapt(Call<ResponseT> call, Object[] objArr) {
            Call<ResponseT> adapt = this.callAdapter.adapt(call);
            InterfaceC2235xe interfaceC2235xe = (InterfaceC2235xe) objArr[objArr.length - 1];
            try {
                return this.isUnit ? KotlinExtensions.awaitUnit(adapt, interfaceC2235xe) : this.isNullable ? KotlinExtensions.awaitNullable(adapt, interfaceC2235xe) : KotlinExtensions.await(adapt, interfaceC2235xe);
            } catch (LinkageError e) {
                throw e;
            } catch (ThreadDeath e2) {
                throw e2;
            } catch (VirtualMachineError e3) {
                throw e3;
            } catch (Throwable th) {
                return KotlinExtensions.suspendAndThrow(th, interfaceC2235xe);
            }
        }
    }

    public static final class SuspendForResponse<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;

        public SuspendForResponse(RequestFactory requestFactory, InterfaceC1940t9 interfaceC1940t9, Converter<AbstractC1166hO, ResponseT> converter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter) {
            super(requestFactory, interfaceC1940t9, converter);
            this.callAdapter = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        public Object adapt(Call<ResponseT> call, Object[] objArr) {
            Call<ResponseT> adapt = this.callAdapter.adapt(call);
            InterfaceC2235xe interfaceC2235xe = (InterfaceC2235xe) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.awaitResponse(adapt, interfaceC2235xe);
            } catch (Exception e) {
                return KotlinExtensions.suspendAndThrow(e, interfaceC2235xe);
            }
        }
    }

    public HttpServiceMethod(RequestFactory requestFactory, InterfaceC1940t9 interfaceC1940t9, Converter<AbstractC1166hO, ResponseT> converter) {
        this.requestFactory = requestFactory;
        this.callFactory = interfaceC1940t9;
        this.responseConverter = converter;
    }

    private static <ResponseT, ReturnT> CallAdapter<ResponseT, ReturnT> createCallAdapter(Retrofit retrofit, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (CallAdapter<ResponseT, ReturnT>) retrofit.callAdapter(type, annotationArr);
        } catch (RuntimeException e) {
            throw Utils.methodError(method, e, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> Converter<AbstractC1166hO, ResponseT> createResponseConverter(Retrofit retrofit, Method method, Type type) {
        try {
            return retrofit.responseBodyConverter(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw Utils.methodError(method, e, "Unable to create converter for %s", type);
        }
    }

    public static <ResponseT, ReturnT> HttpServiceMethod<ResponseT, ReturnT> parseAnnotations(Retrofit retrofit, Method method, RequestFactory requestFactory) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean isUnit;
        boolean z3 = requestFactory.isKotlinSuspendFunction;
        Annotation[] annotations = method.getAnnotations();
        if (z3) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type parameterLowerBound = Utils.getParameterLowerBound(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (Utils.getRawType(parameterLowerBound) == Response.class && (parameterLowerBound instanceof ParameterizedType)) {
                parameterLowerBound = Utils.getParameterUpperBound(0, (ParameterizedType) parameterLowerBound);
                isUnit = false;
                z = true;
            } else {
                if (Utils.getRawType(parameterLowerBound) == Call.class) {
                    throw Utils.methodError(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", Utils.getParameterUpperBound(0, (ParameterizedType) parameterLowerBound));
                }
                isUnit = Utils.isUnit(parameterLowerBound);
                z = false;
            }
            genericReturnType = new Utils.ParameterizedTypeImpl(null, Call.class, parameterLowerBound);
            annotations = SkipCallbackExecutorImpl.ensurePresent(annotations);
            z2 = isUnit;
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
            z2 = false;
        }
        CallAdapter createCallAdapter = createCallAdapter(retrofit, method, genericReturnType, annotations);
        Type responseType = createCallAdapter.responseType();
        if (responseType == C0968eO.class) {
            throw Utils.methodError(method, "'" + Utils.getRawType(responseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (responseType == Response.class) {
            throw Utils.methodError(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (requestFactory.httpMethod.equals("HEAD") && !Void.class.equals(responseType) && !Utils.isUnit(responseType)) {
            throw Utils.methodError(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        Converter createResponseConverter = createResponseConverter(retrofit, method, responseType);
        InterfaceC1940t9 interfaceC1940t9 = retrofit.callFactory;
        return !z3 ? new CallAdapted(requestFactory, interfaceC1940t9, createResponseConverter, createCallAdapter) : z ? new SuspendForResponse(requestFactory, interfaceC1940t9, createResponseConverter, createCallAdapter) : new SuspendForBody(requestFactory, interfaceC1940t9, createResponseConverter, createCallAdapter, false, z2);
    }

    @Nullable
    public abstract ReturnT adapt(Call<ResponseT> call, Object[] objArr);

    @Override // retrofit2.ServiceMethod
    @Nullable
    public final ReturnT invoke(Object obj, Object[] objArr) {
        return adapt(new OkHttpCall(this.requestFactory, obj, objArr, this.callFactory, this.responseConverter), objArr);
    }
}
