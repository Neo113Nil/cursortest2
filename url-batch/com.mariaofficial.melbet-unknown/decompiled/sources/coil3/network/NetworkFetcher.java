package coil3.network;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import coil3.ImageLoader;
import coil3.Uri;
import coil3.decode.DataSource;
import coil3.decode.ImageSource;
import coil3.decode.ImageSourceKt;
import coil3.disk.DiskCache;
import coil3.fetch.FetchResult;
import coil3.fetch.Fetcher;
import coil3.fetch.SourceFetchResult;
import coil3.network.CacheStrategy;
import coil3.network.NetworkHeaders;
import coil3.network.internal.SingleParameterLazy;
import coil3.network.internal.SingleParameterLazyKt;
import coil3.network.internal.UtilsKt;
import coil3.network.internal.Utils_androidKt;
import coil3.request.Options;
import coil3.util.MimeTypeMap;
import com.facebook.common.util.UriUtil;
import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* compiled from: NetworkFetcher.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00016BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J4\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u001bH\u0002J@\u0010\u001f\u001a\u0002H \"\u0004\b\u0000\u0010 2\u0006\u0010!\u001a\u00020\u001b2\"\u0010\"\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0$\u0012\u0006\u0012\u0004\u0018\u00010%0#H\u0082@¢\u0006\u0002\u0010&J\u001c\u0010'\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0003H\u0007J\u000e\u0010)\u001a\u0004\u0018\u00010\u0019*\u00020\u0015H\u0002J\f\u0010*\u001a\u00020+*\u00020\u0015H\u0002J\u0012\u0010*\u001a\u00020+*\u00020,H\u0082@¢\u0006\u0002\u0010-J\f\u0010*\u001a\u00020+*\u00020.H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00102\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lcoil3/network/NetworkFetcher;", "Lcoil3/fetch/Fetcher;", "url", "", "options", "Lcoil3/request/Options;", "networkClient", "Lkotlin/Lazy;", "Lcoil3/network/NetworkClient;", "diskCache", "Lcoil3/disk/DiskCache;", "cacheStrategy", "Lcoil3/network/CacheStrategy;", "connectivityChecker", "Lcoil3/network/ConnectivityChecker;", "<init>", "(Ljava/lang/String;Lcoil3/request/Options;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil3/network/ConnectivityChecker;)V", "fetch", "Lcoil3/fetch/FetchResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFromDiskCache", "Lcoil3/disk/DiskCache$Snapshot;", "writeToDiskCache", "snapshot", "cacheResponse", "Lcoil3/network/NetworkResponse;", "networkRequest", "Lcoil3/network/NetworkRequest;", "networkResponse", "(Lcoil3/disk/DiskCache$Snapshot;Lcoil3/network/NetworkResponse;Lcoil3/network/NetworkRequest;Lcoil3/network/NetworkResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newRequest", "executeNetworkRequest", ExifInterface.GPS_DIRECTION_TRUE, "request", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lcoil3/network/NetworkRequest;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMimeType", "contentType", "toNetworkResponseOrNull", "toImageSource", "Lcoil3/decode/ImageSource;", "Lcoil3/network/NetworkResponseBody;", "(Lcoil3/network/NetworkResponseBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokio/Buffer;", "diskCacheKey", "getDiskCacheKey", "()Ljava/lang/String;", "fileSystem", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "Factory", "coil-network-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkFetcher implements Fetcher {
    private final Lazy<CacheStrategy> cacheStrategy;
    private final ConnectivityChecker connectivityChecker;
    private final Lazy<DiskCache> diskCache;
    private final Lazy<NetworkClient> networkClient;
    private final Options options;
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkFetcher(String str, Options options, Lazy<? extends NetworkClient> lazy, Lazy<? extends DiskCache> lazy2, Lazy<? extends CacheStrategy> lazy3, ConnectivityChecker connectivityChecker) {
        this.url = str;
        this.options = options;
        this.networkClient = lazy;
        this.diskCache = lazy2;
        this.cacheStrategy = lazy3;
        this.connectivityChecker = connectivityChecker;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0125, code lost:
    
        if (r14 == null) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0149 A[Catch: Exception -> 0x004f, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:29:0x004a, B:30:0x0145, B:32:0x0149), top: B:28:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4 A[Catch: Exception -> 0x0065, TRY_LEAVE, TryCatch #4 {Exception -> 0x0065, blocks: (B:42:0x0060, B:43:0x00ec, B:45:0x00f4), top: B:41:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, coil3.disk.DiskCache$Snapshot] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, coil3.network.NetworkResponse] */
    @Override // coil3.fetch.Fetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetch(Continuation<? super FetchResult> continuation) {
        NetworkFetcher$fetch$1 networkFetcher$fetch$1;
        int i;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        NetworkFetcher networkFetcher;
        Ref.ObjectRef objectRef3;
        CacheStrategy.ReadResult readResult;
        Ref.ObjectRef objectRef4;
        NetworkFetcher networkFetcher2;
        Exception exc;
        NetworkRequest request;
        Ref.ObjectRef objectRef5;
        NetworkFetcher networkFetcher3;
        SourceFetchResult sourceFetchResult;
        DiskCache.Snapshot snapshot;
        if (continuation instanceof NetworkFetcher$fetch$1) {
            networkFetcher$fetch$1 = (NetworkFetcher$fetch$1) continuation;
            if ((networkFetcher$fetch$1.label & Integer.MIN_VALUE) != 0) {
                networkFetcher$fetch$1.label -= Integer.MIN_VALUE;
                Object obj = networkFetcher$fetch$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = networkFetcher$fetch$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                    objectRef6.element = readFromDiskCache();
                    try {
                        objectRef2 = new Ref.ObjectRef();
                        if (objectRef6.element != 0) {
                            Long size = getFileSystem().metadata(((DiskCache.Snapshot) objectRef6.element).getMetadata()).getSize();
                            if (size != null && size.longValue() == 0) {
                                return new SourceFetchResult(toImageSource((DiskCache.Snapshot) objectRef6.element), getMimeType(this.url, null), DataSource.DISK);
                            }
                            objectRef2.element = toNetworkResponseOrNull((DiskCache.Snapshot) objectRef6.element);
                            if (objectRef2.element != 0) {
                                CacheStrategy value = this.cacheStrategy.getValue();
                                NetworkResponse networkResponse = (NetworkResponse) objectRef2.element;
                                NetworkRequest newRequest = newRequest();
                                Options options = this.options;
                                networkFetcher$fetch$1.L$0 = this;
                                networkFetcher$fetch$1.L$1 = objectRef6;
                                networkFetcher$fetch$1.L$2 = objectRef2;
                                networkFetcher$fetch$1.label = 1;
                                Object read = value.read(networkResponse, newRequest, options, networkFetcher$fetch$1);
                                if (read != coroutine_suspended) {
                                    objectRef4 = objectRef6;
                                    obj = read;
                                    networkFetcher2 = this;
                                }
                                return coroutine_suspended;
                            }
                        }
                        networkFetcher = this;
                        objectRef3 = objectRef6;
                        readResult = null;
                        Ref.ObjectRef objectRef7 = objectRef2;
                        if (readResult != null) {
                            try {
                                request = readResult.getRequest();
                            } catch (Exception e) {
                                exc = e;
                                objectRef = objectRef3;
                                snapshot = (DiskCache.Snapshot) objectRef.element;
                                if (snapshot == null) {
                                }
                            }
                        }
                        request = networkFetcher.newRequest();
                        NetworkRequest networkRequest = request;
                        NetworkFetcher$fetch$fetchResult$1 networkFetcher$fetch$fetchResult$1 = new NetworkFetcher$fetch$fetchResult$1(objectRef3, networkFetcher, objectRef7, networkRequest, null);
                        networkFetcher$fetch$1.L$0 = networkFetcher;
                        networkFetcher$fetch$1.L$1 = objectRef3;
                        networkFetcher$fetch$1.L$2 = null;
                        networkFetcher$fetch$1.label = 2;
                        obj = networkFetcher.executeNetworkRequest(networkRequest, networkFetcher$fetch$fetchResult$1, networkFetcher$fetch$1);
                        if (obj != coroutine_suspended) {
                            objectRef5 = objectRef3;
                            networkFetcher3 = networkFetcher;
                            sourceFetchResult = (SourceFetchResult) obj;
                            if (sourceFetchResult == null) {
                            }
                        }
                        return coroutine_suspended;
                    } catch (Exception e2) {
                        e = e2;
                        objectRef = objectRef6;
                        exc = e;
                        snapshot = (DiskCache.Snapshot) objectRef.element;
                        if (snapshot == null) {
                        }
                    }
                } else if (i == 1) {
                    objectRef2 = (Ref.ObjectRef) networkFetcher$fetch$1.L$2;
                    objectRef4 = (Ref.ObjectRef) networkFetcher$fetch$1.L$1;
                    networkFetcher2 = (NetworkFetcher) networkFetcher$fetch$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e3) {
                        exc = e3;
                        objectRef = objectRef4;
                        snapshot = (DiskCache.Snapshot) objectRef.element;
                        if (snapshot == null) {
                        }
                    }
                } else {
                    if (i == 2) {
                        objectRef5 = (Ref.ObjectRef) networkFetcher$fetch$1.L$1;
                        networkFetcher3 = (NetworkFetcher) networkFetcher$fetch$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            sourceFetchResult = (SourceFetchResult) obj;
                            if (sourceFetchResult == null) {
                                return sourceFetchResult;
                            }
                            NetworkRequest newRequest2 = networkFetcher3.newRequest();
                            NetworkFetcher$fetch$2 networkFetcher$fetch$2 = new NetworkFetcher$fetch$2(networkFetcher3, null);
                            networkFetcher$fetch$1.L$0 = objectRef5;
                            networkFetcher$fetch$1.L$1 = null;
                            networkFetcher$fetch$1.label = 3;
                            obj = networkFetcher3.executeNetworkRequest(newRequest2, networkFetcher$fetch$2, networkFetcher$fetch$1);
                            if (obj != coroutine_suspended) {
                                objectRef = objectRef5;
                                return (SourceFetchResult) obj;
                            }
                            return coroutine_suspended;
                        } catch (Exception e4) {
                            exc = e4;
                            objectRef = objectRef5;
                            snapshot = (DiskCache.Snapshot) objectRef.element;
                            if (snapshot == null) {
                                throw exc;
                            }
                            UtilsKt.closeQuietly(snapshot);
                            throw exc;
                        }
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) networkFetcher$fetch$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return (SourceFetchResult) obj;
                    } catch (Exception e5) {
                        e = e5;
                        exc = e;
                        snapshot = (DiskCache.Snapshot) objectRef.element;
                        if (snapshot == null) {
                        }
                    }
                }
                readResult = (CacheStrategy.ReadResult) obj;
                if (readResult.getResponse() == null) {
                    return new SourceFetchResult(networkFetcher2.toImageSource((DiskCache.Snapshot) objectRef4.element), networkFetcher2.getMimeType(networkFetcher2.url, readResult.getResponse().getHeaders().get(UtilsKt.CONTENT_TYPE)), DataSource.DISK);
                }
                objectRef3 = objectRef4;
                networkFetcher = networkFetcher2;
                Ref.ObjectRef objectRef72 = objectRef2;
                if (readResult != null) {
                }
                request = networkFetcher.newRequest();
                NetworkRequest networkRequest2 = request;
                NetworkFetcher$fetch$fetchResult$1 networkFetcher$fetch$fetchResult$12 = new NetworkFetcher$fetch$fetchResult$1(objectRef3, networkFetcher, objectRef72, networkRequest2, null);
                networkFetcher$fetch$1.L$0 = networkFetcher;
                networkFetcher$fetch$1.L$1 = objectRef3;
                networkFetcher$fetch$1.L$2 = null;
                networkFetcher$fetch$1.label = 2;
                obj = networkFetcher.executeNetworkRequest(networkRequest2, networkFetcher$fetch$fetchResult$12, networkFetcher$fetch$1);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        networkFetcher$fetch$1 = new NetworkFetcher$fetch$1(this, continuation);
        Object obj2 = networkFetcher$fetch$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = networkFetcher$fetch$1.label;
        if (i != 0) {
        }
        readResult = (CacheStrategy.ReadResult) obj2;
        if (readResult.getResponse() == null) {
        }
    }

    private final DiskCache.Snapshot readFromDiskCache() {
        DiskCache value;
        if (!this.options.getDiskCachePolicy().getReadEnabled() || (value = this.diskCache.getValue()) == null) {
            return null;
        }
        return value.openSnapshot(getDiskCacheKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0109, code lost:
    
        if (r0.writeTo(r14, r3, r7) == r1) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeToDiskCache(DiskCache.Snapshot snapshot, NetworkResponse networkResponse, NetworkRequest networkRequest, NetworkResponse networkResponse2, Continuation<? super DiskCache.Snapshot> continuation) {
        NetworkFetcher$writeToDiskCache$1 networkFetcher$writeToDiskCache$1;
        int i;
        NetworkFetcher networkFetcher;
        NetworkResponse networkResponse3;
        NetworkResponse response;
        DiskCache.Editor openEditor;
        NetworkResponse networkResponse4;
        NetworkResponse networkResponse5;
        NetworkResponseBody body;
        NetworkResponseBody body2;
        if (continuation instanceof NetworkFetcher$writeToDiskCache$1) {
            networkFetcher$writeToDiskCache$1 = (NetworkFetcher$writeToDiskCache$1) continuation;
            if ((networkFetcher$writeToDiskCache$1.label & Integer.MIN_VALUE) != 0) {
                networkFetcher$writeToDiskCache$1.label -= Integer.MIN_VALUE;
                NetworkFetcher$writeToDiskCache$1 networkFetcher$writeToDiskCache$12 = networkFetcher$writeToDiskCache$1;
                Object obj = networkFetcher$writeToDiskCache$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = networkFetcher$writeToDiskCache$12.label;
                Throwable th = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.options.getDiskCachePolicy().getWriteEnabled()) {
                        if (snapshot != null) {
                            UtilsKt.closeQuietly(snapshot);
                        }
                        return null;
                    }
                    CacheStrategy value = this.cacheStrategy.getValue();
                    Options options = this.options;
                    networkFetcher$writeToDiskCache$12.L$0 = this;
                    networkFetcher$writeToDiskCache$12.L$1 = snapshot;
                    networkFetcher$writeToDiskCache$12.L$2 = networkResponse2;
                    networkFetcher$writeToDiskCache$12.label = 1;
                    obj = value.write(networkResponse, networkRequest, networkResponse2, options, networkFetcher$writeToDiskCache$12);
                    if (obj != coroutine_suspended) {
                        networkFetcher = this;
                        networkResponse3 = networkResponse2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    openEditor = (DiskCache.Editor) networkFetcher$writeToDiskCache$12.L$2;
                    networkResponse5 = (NetworkResponse) networkFetcher$writeToDiskCache$12.L$1;
                    networkResponse4 = (NetworkResponse) networkFetcher$writeToDiskCache$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return openEditor.commitAndOpenSnapshot();
                    } catch (Exception e) {
                        e = e;
                        UtilsKt.abortQuietly(openEditor);
                        body = networkResponse4.getBody();
                        if (body != null) {
                            UtilsKt.closeQuietly(body);
                        }
                        body2 = networkResponse5.getBody();
                        if (body2 != null) {
                            UtilsKt.closeQuietly(body2);
                        }
                        throw e;
                    }
                }
                NetworkResponse networkResponse6 = (NetworkResponse) networkFetcher$writeToDiskCache$12.L$2;
                DiskCache.Snapshot snapshot2 = (DiskCache.Snapshot) networkFetcher$writeToDiskCache$12.L$1;
                networkFetcher = (NetworkFetcher) networkFetcher$writeToDiskCache$12.L$0;
                ResultKt.throwOnFailure(obj);
                networkResponse3 = networkResponse6;
                snapshot = snapshot2;
                response = ((CacheStrategy.WriteResult) obj).getResponse();
                if (response != null) {
                    return null;
                }
                if (snapshot != null) {
                    openEditor = snapshot.closeAndOpenEditor();
                } else {
                    DiskCache value2 = networkFetcher.diskCache.getValue();
                    openEditor = value2 != null ? value2.openEditor(networkFetcher.getDiskCacheKey()) : null;
                }
                if (openEditor == null) {
                    return null;
                }
                try {
                    BufferedSink buffer = Okio.buffer(networkFetcher.getFileSystem().sink(openEditor.getMetadata(), false));
                    try {
                        CacheNetworkResponse.INSTANCE.writeTo(response, buffer);
                        Unit unit = Unit.INSTANCE;
                        if (buffer != null) {
                            try {
                                buffer.close();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (buffer != null) {
                            try {
                                buffer.close();
                            } catch (Throwable th4) {
                                ExceptionsKt.addSuppressed(th, th4);
                            }
                        }
                    }
                    if (th == null) {
                        NetworkResponseBody body3 = response.getBody();
                        if (body3 != null) {
                            FileSystem fileSystem = networkFetcher.getFileSystem();
                            Path data = openEditor.getData();
                            networkFetcher$writeToDiskCache$12.L$0 = networkResponse3;
                            networkFetcher$writeToDiskCache$12.L$1 = response;
                            networkFetcher$writeToDiskCache$12.L$2 = openEditor;
                            networkFetcher$writeToDiskCache$12.label = 2;
                        }
                        networkResponse4 = networkResponse3;
                        networkResponse5 = response;
                        return openEditor.commitAndOpenSnapshot();
                    }
                    throw th;
                } catch (Exception e2) {
                    e = e2;
                    networkResponse4 = networkResponse3;
                    networkResponse5 = response;
                    UtilsKt.abortQuietly(openEditor);
                    body = networkResponse4.getBody();
                    if (body != null) {
                    }
                    body2 = networkResponse5.getBody();
                    if (body2 != null) {
                    }
                    throw e;
                }
            }
        }
        networkFetcher$writeToDiskCache$1 = new NetworkFetcher$writeToDiskCache$1(this, continuation);
        NetworkFetcher$writeToDiskCache$1 networkFetcher$writeToDiskCache$122 = networkFetcher$writeToDiskCache$1;
        Object obj2 = networkFetcher$writeToDiskCache$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = networkFetcher$writeToDiskCache$122.label;
        Throwable th5 = null;
        if (i != 0) {
        }
        response = ((CacheStrategy.WriteResult) obj2).getResponse();
        if (response != null) {
        }
    }

    private final NetworkRequest newRequest() {
        NetworkHeaders.Builder newBuilder = ImageRequestsKt.getHttpHeaders(this.options).newBuilder();
        boolean readEnabled = this.options.getDiskCachePolicy().getReadEnabled();
        boolean z = this.options.getNetworkCachePolicy().getReadEnabled() && this.connectivityChecker.isOnline();
        if (!z && readEnabled) {
            newBuilder.set(UtilsKt.CACHE_CONTROL, "only-if-cached, max-stale=2147483647");
        } else if (!z || readEnabled) {
            if (!z && !readEnabled) {
                newBuilder.set(UtilsKt.CACHE_CONTROL, "no-cache, only-if-cached");
            }
        } else if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            newBuilder.set(UtilsKt.CACHE_CONTROL, "no-cache");
        } else {
            newBuilder.set(UtilsKt.CACHE_CONTROL, "no-cache, no-store");
        }
        return new NetworkRequest(this.url, ImageRequestsKt.getHttpMethod(this.options), newBuilder.build(), ImageRequestsKt.getHttpBody(this.options));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object executeNetworkRequest(NetworkRequest networkRequest, Function2<? super NetworkResponse, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        if (this.options.getNetworkCachePolicy().getReadEnabled()) {
            Utils_androidKt.assertNotOnMainThread();
        }
        return this.networkClient.getValue().executeRequest(networkRequest, new NetworkFetcher$executeNetworkRequest$2(function2, null), continuation);
    }

    public final String getMimeType(String url, String contentType) {
        String mimeTypeFromUrl;
        if ((contentType == null || StringsKt.startsWith$default(contentType, "text/plain", false, 2, (Object) null)) && (mimeTypeFromUrl = MimeTypeMap.INSTANCE.getMimeTypeFromUrl(url)) != null) {
            return mimeTypeFromUrl;
        }
        if (contentType != null) {
            return StringsKt.substringBefore$default(contentType, ';', (String) null, 2, (Object) null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkResponse toNetworkResponseOrNull(DiskCache.Snapshot snapshot) {
        Throwable th;
        NetworkResponse networkResponse;
        try {
            BufferedSource buffer = Okio.buffer(getFileSystem().source(snapshot.getMetadata()));
            try {
                networkResponse = CacheNetworkResponse.INSTANCE.readFrom(buffer);
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                th = null;
            } catch (Throwable th3) {
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th4) {
                        ExceptionsKt.addSuppressed(th3, th4);
                    }
                }
                th = th3;
                networkResponse = null;
            }
            if (th == null) {
                return networkResponse;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageSource toImageSource(DiskCache.Snapshot snapshot) {
        return ImageSourceKt.ImageSource$default(snapshot.getData(), getFileSystem(), getDiskCacheKey(), snapshot, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object toImageSource(NetworkResponseBody networkResponseBody, Continuation<? super ImageSource> continuation) {
        NetworkFetcher$toImageSource$1 networkFetcher$toImageSource$1;
        int i;
        NetworkFetcher networkFetcher;
        Buffer buffer;
        if (continuation instanceof NetworkFetcher$toImageSource$1) {
            networkFetcher$toImageSource$1 = (NetworkFetcher$toImageSource$1) continuation;
            if ((networkFetcher$toImageSource$1.label & Integer.MIN_VALUE) != 0) {
                networkFetcher$toImageSource$1.label -= Integer.MIN_VALUE;
                Object obj = networkFetcher$toImageSource$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = networkFetcher$toImageSource$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Buffer buffer2 = new Buffer();
                    networkFetcher$toImageSource$1.L$0 = this;
                    networkFetcher$toImageSource$1.L$1 = buffer2;
                    networkFetcher$toImageSource$1.label = 1;
                    if (networkResponseBody.writeTo(buffer2, networkFetcher$toImageSource$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    networkFetcher = this;
                    buffer = buffer2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    buffer = (Buffer) networkFetcher$toImageSource$1.L$1;
                    networkFetcher = (NetworkFetcher) networkFetcher$toImageSource$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return networkFetcher.toImageSource(buffer);
            }
        }
        networkFetcher$toImageSource$1 = new NetworkFetcher$toImageSource$1(this, continuation);
        Object obj2 = networkFetcher$toImageSource$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = networkFetcher$toImageSource$1.label;
        if (i != 0) {
        }
        return networkFetcher.toImageSource(buffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageSource toImageSource(Buffer buffer) {
        return ImageSourceKt.ImageSource$default(buffer, getFileSystem(), null, 4, null);
    }

    private final String getDiskCacheKey() {
        String diskCacheKey = this.options.getDiskCacheKey();
        return diskCacheKey == null ? this.url : diskCacheKey;
    }

    private final FileSystem getFileSystem() {
        FileSystem fileSystem;
        DiskCache value = this.diskCache.getValue();
        return (value == null || (fileSystem = value.getFileSystem()) == null) ? this.options.getFileSystem() : fileSystem;
    }

    /* compiled from: NetworkFetcher.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcoil3/network/NetworkFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Lcoil3/Uri;", "networkClient", "Lkotlin/Function0;", "Lcoil3/network/NetworkClient;", "cacheStrategy", "Lcoil3/network/CacheStrategy;", "connectivityChecker", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "Lcoil3/network/ConnectivityChecker;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "networkClientLazy", "Lkotlin/Lazy;", "cacheStrategyLazy", "connectivityCheckerLazy", "Lcoil3/network/internal/SingleParameterLazy;", "create", "Lcoil3/fetch/Fetcher;", UriUtil.DATA_SCHEME, "options", "Lcoil3/request/Options;", "imageLoader", "Lcoil3/ImageLoader;", "isApplicable", "", "coil-network-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<Uri> {
        private final Lazy<CacheStrategy> cacheStrategyLazy;
        private final SingleParameterLazy<Context, ConnectivityChecker> connectivityCheckerLazy;
        private final Lazy<NetworkClient> networkClientLazy;

        public Factory(Function0<? extends NetworkClient> function0, Function0<? extends CacheStrategy> function02, Function1<? super Context, ? extends ConnectivityChecker> function1) {
            this.networkClientLazy = LazyKt.lazy(function0);
            this.cacheStrategyLazy = LazyKt.lazy(function02);
            this.connectivityCheckerLazy = SingleParameterLazyKt.singleParameterLazy(function1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NetworkFetcher.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: coil3.network.NetworkFetcher$Factory$2, reason: invalid class name */
        public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Context, ConnectivityChecker> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(1, ConnectivityCheckerKt.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final ConnectivityChecker invoke(Context context) {
                return ConnectivityCheckerKt.ConnectivityChecker(context);
            }
        }

        public /* synthetic */ Factory(Function0 function0, Function0 function02, AnonymousClass2 anonymousClass2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(function0, (i & 2) != 0 ? new Function0() { // from class: coil3.network.NetworkFetcher$Factory$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    CacheStrategy cacheStrategy;
                    cacheStrategy = CacheStrategy.DEFAULT;
                    return cacheStrategy;
                }
            } : function02, (i & 4) != 0 ? AnonymousClass2.INSTANCE : anonymousClass2);
        }

        @Override // coil3.fetch.Fetcher.Factory
        public Fetcher create(Uri data, Options options, final ImageLoader imageLoader) {
            if (isApplicable(data)) {
                return new NetworkFetcher(data.getData(), options, this.networkClientLazy, LazyKt.lazy(new Function0() { // from class: coil3.network.NetworkFetcher$Factory$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        DiskCache diskCache;
                        diskCache = ImageLoader.this.getDiskCache();
                        return diskCache;
                    }
                }), this.cacheStrategyLazy, this.connectivityCheckerLazy.get(options.getContext()));
            }
            return null;
        }

        private final boolean isApplicable(Uri data) {
            return Intrinsics.areEqual(data.getScheme(), "http") || Intrinsics.areEqual(data.getScheme(), "https");
        }
    }
}
