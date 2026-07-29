package io.flutter.embedding.engine;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaExtractor;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.AttachedSurfaceControl;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.e;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.a;
import io.flutter.view.b;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import o.AbstractC1052fg;
import o.AbstractC1888sN;
import o.AbstractC2188wx;
import o.B00;
import o.BI;
import o.C0016An;
import o.C0042Bn;
import o.C0057Cc;
import o.C0068Cn;
import o.C0950e6;
import o.C1057fl;
import o.C1256in;
import o.C1301jT;
import o.C1319jl;
import o.C1334k;
import o.C1379kf;
import o.C1387kn;
import o.C1422lI;
import o.C1445lf;
import o.C1574nc;
import o.C1577nf;
import o.C1590ns;
import o.C1623oL;
import o.C1656os;
import o.C1818rJ;
import o.C2002u5;
import o.C2258y0;
import o.C2282yL;
import o.C2324z0;
import o.CI;
import o.D0;
import o.D1;
import o.DI;
import o.EnumC2192x0;
import o.GU;
import o.IC;
import o.InterfaceC0554Vg;
import o.InterfaceC0797bn;
import o.InterfaceC1346k8;
import o.InterfaceC1356kI;
import o.InterfaceC1453ln;
import o.InterfaceC1519mn;
import o.InterfaceC2244xn;
import o.InterfaceC2310yn;
import o.K7;
import o.LA;
import o.MB;
import o.QL;
import o.YQ;
import o.ZQ;

@Keep
/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static InterfaceC1519mn asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private InterfaceC1453ln accessibilityDelegate;
    private InterfaceC0554Vg deferredComponentManager;
    private LA localizationPlugin;
    private Long nativeShellHolderId;
    private InterfaceC1356kI platformMessageHandler;
    private DI platformViewsController;
    private CI platformViewsController2;
    private ZQ settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<InterfaceC0797bn> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<InterfaceC2244xn> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Set<InterfaceC2310yn> flutterUiResizeListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j) {
        InterfaceC1519mn interfaceC1519mn = asyncWaitForVsyncDelegate;
        if (interfaceC1519mn == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        C1818rJ c1818rJ = (C1818rJ) interfaceC1519mn;
        c1818rJ.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        QL ql = (QL) c1818rJ.i;
        B00 b00 = (B00) ql.c;
        if (b00 != null) {
            b00.h = j;
            ql.c = null;
        } else {
            b00 = new B00(ql, j);
        }
        choreographer.postFrameCallback(b00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j) {
        C1656os c1656os;
        C1590ns c1590ns = 0;
        c1590ns = 0;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        C1387kn c1387kn = new C1387kn(j);
        IC ic = new IC();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.rewind();
        int i = 1;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
            ic.d = options.outMimeType;
            ic.f = options.outHeight;
            ic.g = options.outWidth;
        } catch (Exception e) {
            Log.e("BitmapMetadataReader", "Failed to decode image for mime type", e);
        }
        if ("image/heif".equals(ic.d)) {
            try {
                MB mb = new MB(bArr);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(mb);
                AbstractC1052fg.K(ic, mediaExtractor);
            } catch (Exception e2) {
                Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e2);
            }
            nativeImageHeaderCallback(c1387kn.a, ic.a, ic.b);
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    C1319jl c1319jl = new C1319jl(byteArrayInputStream);
                    C1057fl c = c1319jl.c("Orientation");
                    if (c != null) {
                        try {
                            i = c.e(c1319jl.e);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    ic.e = i;
                    byteArrayInputStream.close();
                } finally {
                }
            } catch (IOException e3) {
                Log.e("ExifMetadataReader", "Failed to read EXIF metadata", e3);
            }
        }
        if ("image/heif".equals(ic.d)) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 == 36) {
                c1656os = new C1656os(c1590ns, 0);
            } else if (i2 < 36) {
                c1656os = new C1656os(c1590ns, 1);
            }
            c1590ns = c1656os;
        }
        if (c1590ns == 0) {
            c1590ns = new C1590ns(0, c1387kn);
        }
        return c1590ns.j(byteBuffer, ic);
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i, ByteBuffer byteBuffer) {
        InterfaceC1346k8 interfaceC1346k8;
        InterfaceC1356kI interfaceC1356kI = this.platformMessageHandler;
        if (interfaceC1356kI == null || (interfaceC1346k8 = (InterfaceC1346k8) ((C1577nf) interfaceC1356kI).m.remove(Integer.valueOf(i))) == null) {
            return;
        }
        try {
            interfaceC1346k8.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e) {
            Thread currentThread = Thread.currentThread();
            if (currentThread.getUncaughtExceptionHandler() == null) {
                throw e;
            }
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e);
        } catch (Exception e2) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j);

    private native void nativeDeferredComponentInstallFailure(int i, String str, boolean z);

    private native void nativeDestroy(long j);

    private native void nativeDispatchEmptyPlatformMessage(long j, String str, int i);

    private native void nativeDispatchPlatformMessage(long j, String str, ByteBuffer byteBuffer, int i, int i2);

    private native void nativeDispatchPointerDataPacket(long j, ByteBuffer byteBuffer, int i);

    private native void nativeDispatchSemanticsAction(long j, int i, int i2, ByteBuffer byteBuffer, int i3);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i);

    private native Bitmap nativeGetBitmap(long j);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j, int i, int i2);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j, int i);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j, int i);

    private native void nativeInvokePlatformMessageResponseCallback(long j, int i, ByteBuffer byteBuffer, int i2);

    private native boolean nativeIsSurfaceControlEnabled(long j);

    private native void nativeLoadDartDeferredLibrary(long j, int i, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j);

    private native void nativeMarkTextureFrameAvailable(long j, long j2);

    private native void nativeNotifyLowMemoryWarning(long j);

    private native void nativeOnVsync(long j, long j2, long j3);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j, long j2, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z);

    private native void nativeRegisterTexture(long j, long j2, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j2);

    private native void nativeScheduleFrame(long j);

    private native void nativeSetAccessibilityFeatures(long j, int i);

    private native void nativeSetSemanticsEnabled(long j, boolean z);

    private native void nativeSetViewportMetrics(long j, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, int[] iArr3, int i16, int i17, int i18, int i19);

    private native FlutterJNI nativeSpawn(long j, String str, String str2, String str3, List<String> list, long j2);

    private native void nativeSurfaceChanged(long j, int i, int i2);

    private native void nativeSurfaceCreated(long j, Surface surface);

    private native void nativeSurfaceDestroyed(long j);

    private native void nativeSurfaceWindowChanged(long j, Surface surface);

    private native void nativeUnregisterTexture(long j, long j2);

    private native void nativeUpdateDisplayMetrics(long j);

    private native void nativeUpdateJavaAssetManager(long j, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f);

    private void onPreEngineRestart() {
        Iterator<InterfaceC0797bn> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        InterfaceC1453ln interfaceC1453ln = this.accessibilityDelegate;
        if (interfaceC1453ln != null) {
            ((a) interfaceC1453ln).a.l = str;
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        InterfaceC1453ln interfaceC1453ln = this.accessibilityDelegate;
        if (interfaceC1453ln != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            b bVar = ((a) interfaceC1453ln).a;
            while (byteBuffer.hasRemaining()) {
                C2258y0 a = bVar.a(byteBuffer.getInt());
                a.c = byteBuffer.getInt();
                a.d = b.c(byteBuffer, strArr);
                a.e = b.c(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        InterfaceC1453ln interfaceC1453ln = this.accessibilityDelegate;
        if (interfaceC1453ln != null) {
            ((a) interfaceC1453ln).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(InterfaceC0797bn interfaceC0797bn) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(interfaceC0797bn);
    }

    public void addIsDisplayingFlutterUiListener(InterfaceC2244xn interfaceC2244xn) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(interfaceC2244xn);
    }

    public void addResizingFlutterUiListener(InterfaceC2310yn interfaceC2310yn) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(interfaceC2310yn);
    }

    @SuppressLint({"NewApi"})
    public void applyTransactions() {
        CI ci = this.platformViewsController2;
        if (ci == null) {
            throw new RuntimeException("");
        }
        ArrayList arrayList = ci.p;
        SurfaceControl.Transaction f = BI.f();
        for (int i = 0; i < arrayList.size(); i++) {
            f = f.merge(BI.h(arrayList.get(i)));
        }
        f.apply();
        arrayList.clear();
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j) {
        nativeCleanupMessageData(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
    
        if (r10 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0129, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0131, code lost:
    
        if (r4.hasNext() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0133, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0148, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0150, code lost:
    
        if (r4.hasNext() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0152, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0164, code lost:
    
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0167, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String[] computePlatformResolvedLocale(String[] strArr) {
        Locale locale;
        Locale locale2;
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i += 3) {
            String str = strArr[i];
            String str2 = strArr[i + 1];
            String str3 = strArr[i + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        Context context = this.localizationPlugin.b;
        if (arrayList.isEmpty()) {
            locale2 = null;
        } else if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList2 = new ArrayList();
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i2 = 0; i2 < size; i2++) {
                Locale locale3 = locales.get(i2);
                String language = locale3.getLanguage();
                if (!locale3.getScript().isEmpty()) {
                    language = language + "-" + locale3.getScript();
                }
                if (!locale3.getCountry().isEmpty()) {
                    language = language + "-" + locale3.getCountry();
                }
                arrayList2.add(K7.s(language));
                K7.u();
                arrayList2.add(K7.s(locale3.getLanguage()));
                K7.u();
                arrayList2.add(K7.s(locale3.getLanguage() + "-*"));
            }
            locale2 = Locale.lookup(arrayList2, arrayList);
        } else {
            LocaleList locales2 = context.getResources().getConfiguration().getLocales();
            int i3 = 0;
            loop2: while (i3 < locales2.size()) {
                Locale locale4 = locales2.get(i3);
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    locale = (Locale) it.next();
                    if (locale4.equals(locale)) {
                        break loop2;
                    }
                }
                locale2 = locale;
            }
            locale2 = (Locale) arrayList.get(0);
        }
        return locale2 == null ? new String[0] : new String[]{locale2.getLanguage(), locale2.getCountry(), locale2.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        DI di = this.platformViewsController;
        if (di == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        Context context = di.j.getContext();
        int width = di.j.getWidth();
        int height = di.j.getHeight();
        D0 d0 = di.f29o;
        C1422lI c1422lI = new C1422lI(context, width, height, 2);
        c1422lI.f192o = d0;
        int i = di.v;
        di.v = i + 1;
        di.t.put(i, c1422lI);
        return new FlutterOverlaySurface(i, c1422lI.getSurface());
    }

    @SuppressLint({"NewApi"})
    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        CI ci = this.platformViewsController2;
        if (ci == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (ci.r == null) {
            SurfaceControl.Builder e = BI.e();
            e.setBufferSize(ci.j.getWidth(), ci.j.getHeight());
            e.setFormat(1);
            e.setName("Flutter Overlay Surface");
            e.setOpaque(false);
            e.setHidden(false);
            build = e.build();
            rootSurfaceControl = ci.j.getRootSurfaceControl();
            buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, 1000);
            buildReparentTransaction.apply();
            ci.r = BI.d(build);
            ci.s = build;
        }
        return new FlutterOverlaySurface(0, ci.r);
    }

    @SuppressLint({"NewApi"})
    public SurfaceControl.Transaction createTransaction() {
        CI ci = this.platformViewsController2;
        if (ci == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction f = BI.f();
        ci.p.add(f);
        return f;
    }

    public void deferredComponentInstallFailure(int i, String str, boolean z) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i, str, z);
    }

    @SuppressLint({"NewApi"})
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        CI ci = this.platformViewsController2;
        if (ci == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = ci.r;
        if (surface != null) {
            surface.release();
            ci.r = null;
            ci.s = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        DI di = this.platformViewsController;
        if (di == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        di.b();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i, i2);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i2);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i);
    }

    public void dispatchSemanticsAction(int i, EnumC2192x0 enumC2192x0) {
        dispatchSemanticsAction(i, enumC2192x0, null);
    }

    @SuppressLint({"NewApi"})
    public void endFrame2() {
        AttachedSurfaceControl rootSurfaceControl;
        CI ci = this.platformViewsController2;
        if (ci == null) {
            throw new RuntimeException("");
        }
        ArrayList arrayList = ci.q;
        SurfaceControl.Transaction f = BI.f();
        for (int i = 0; i < arrayList.size(); i++) {
            f = f.merge(BI.h(arrayList.get(i)));
        }
        arrayList.clear();
        ci.j.invalidate();
        rootSurfaceControl = ci.j.getRootSurfaceControl();
        rootSurfaceControl.applyTransactionOnDraw(f);
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getScaledFontSize(float f, int i) {
        YQ yq;
        ZQ zq = this.settingsChannel;
        DisplayMetrics displayMetrics = null;
        if (zq != null) {
            C0950e6 c0950e6 = zq.a;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c0950e6.i;
            if (((YQ) c0950e6.j) == null) {
                c0950e6.j = (YQ) concurrentLinkedQueue.poll();
            }
            while (true) {
                yq = (YQ) c0950e6.j;
                if (yq == null || yq.a >= i) {
                    break;
                }
                c0950e6.j = (YQ) concurrentLinkedQueue.poll();
            }
            if (yq == null) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + i + ", after exhausting the queue.");
            } else {
                if (yq.a != i) {
                    StringBuilder i2 = AbstractC2188wx.i(i, "Cannot find config with generation: ", ", the oldest config is now: ");
                    i2.append(((YQ) c0950e6.j).a);
                    Log.e("SettingsChannel", i2.toString());
                }
                if (yq != null) {
                    displayMetrics = yq.b;
                }
            }
            yq = null;
            if (yq != null) {
            }
        }
        if (displayMetrics != null) {
            return TypedValue.applyDimension(2, f, displayMetrics) / displayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i) + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i, long j) {
        C1445lf c1445lf;
        boolean z;
        InterfaceC1356kI interfaceC1356kI = this.platformMessageHandler;
        if (interfaceC1356kI == null) {
            nativeCleanupMessageData(j);
            return;
        }
        C1577nf c1577nf = (C1577nf) interfaceC1356kI;
        synchronized (c1577nf.k) {
            try {
                c1445lf = (C1445lf) c1577nf.i.get(str);
                z = c1577nf.l.get() && c1445lf == null;
                if (z) {
                    if (!c1577nf.j.containsKey(str)) {
                        c1577nf.j.put(str, new LinkedList());
                    }
                    ((List) c1577nf.j.get(str)).add(new C1379kf(j, byteBuffer, i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        c1577nf.a(str, c1445lf, byteBuffer, i, j);
    }

    @SuppressLint({"NewApi"})
    public void hideOverlaySurface2() {
        CI ci = this.platformViewsController2;
        if (ci == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (ci.s == null) {
            return;
        }
        SurfaceControl.Transaction f = BI.f();
        f.setVisibility(ci.s, false);
        f.apply();
    }

    @SuppressLint({"NewApi"})
    public void hidePlatformView2(int i) {
        ensureRunningOnMainThread();
        CI ci = this.platformViewsController2;
        if (ci == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        if (ci.n.get(i) != null) {
            throw new ClassCastException();
        }
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j, int i) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j, i);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [io.flutter.embedding.engine.FlutterJNI] */
    public void invokePlatformMessageResponseCallback(int i, ByteBuffer byteBuffer, int i2) {
        FlutterJNI flutterJNI;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            flutterJNI = isAttached();
            try {
                if (flutterJNI != 0) {
                    FlutterJNI flutterJNI2 = this;
                    flutterJNI2.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i, byteBuffer, i2);
                    flutterJNI = flutterJNI2;
                } else {
                    flutterJNI = this;
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
                }
                flutterJNI.shellHolderLock.readLock().unlock();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                flutterJNI.shellHolderLock.readLock().unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            flutterJNI = this;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i) {
        return nativeFlutterTextUtilsIsEmoji(i);
    }

    public boolean isCodePointEmojiModifier(int i) {
        return nativeFlutterTextUtilsIsEmojiModifier(i);
    }

    public boolean isCodePointEmojiModifierBase(int i) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i);
    }

    public boolean isCodePointRegionalIndicator(int i) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i);
    }

    public boolean isCodePointVariantSelector(int i) {
        return nativeFlutterTextUtilsIsVariationSelector(i);
    }

    public void loadDartDeferredLibrary(int i, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i, strArr);
    }

    public void loadLibrary(Context context) {
        C2002u5 m;
        String[] strArr;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        long j;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        C1574nc c1574nc = new C1574nc(12);
        C1334k c1334k = new C1334k(14);
        c1334k.l = c1574nc;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        c1334k.B("Beginning load of %s...", "flutter");
        GU gu = (GU) c1334k.j;
        HashSet hashSet = (HashSet) c1334k.i;
        if (hashSet.contains("flutter")) {
            c1334k.B("%s already loaded previously!", "flutter");
        } else {
            C2002u5 c2002u5 = null;
            try {
                gu.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                c1334k.B("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e) {
                c1334k.B("Loading the library normally failed: %s", Log.getStackTraceString(e));
                c1334k.B("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File z = c1334k.z(context);
                if (!z.exists()) {
                    File dir = context.getDir("lib", 0);
                    File z2 = c1334k.z(context);
                    gu.getClass();
                    File[] listFiles = dir.listFiles(new C2282yL(System.mapLibraryName("flutter")));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(z2.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    C1623oL c1623oL = (C1623oL) c1334k.k;
                    String[] strArr2 = Build.SUPPORTED_ABIS;
                    if (strArr2.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr2 = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String mapLibraryName = System.mapLibraryName("flutter");
                    c1623oL.getClass();
                    try {
                        m = C1623oL.m(context, strArr2, mapLibraryName, c1334k);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (m == null) {
                            try {
                                strArr = C1623oL.o(context, mapLibraryName);
                            } catch (Exception e2) {
                                strArr = new String[]{e2.toString()};
                            }
                            StringBuilder sb = new StringBuilder("Could not find '");
                            sb.append(mapLibraryName);
                            sb.append("'. Looked for: ");
                            sb.append(Arrays.toString(strArr2));
                            sb.append(", but only found: ");
                            throw new C0057Cc(AbstractC1888sN.l(sb, Arrays.toString(strArr), "."));
                        }
                        ZipFile zipFile = (ZipFile) m.i;
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            if (i < 5) {
                                c1334k.B("Found %s! Extracting...", mapLibraryName);
                                try {
                                    if (z.exists() || z.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) m.j);
                                            try {
                                                fileOutputStream2 = new FileOutputStream(z);
                                                try {
                                                    byte[] bArr = new byte[4096];
                                                    j = 0;
                                                    while (true) {
                                                        int read = inputStream2.read(bArr);
                                                        if (read == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream2.write(bArr, 0, read);
                                                        j += read;
                                                    }
                                                    fileOutputStream2.flush();
                                                    fileOutputStream2.getFD().sync();
                                                } catch (FileNotFoundException unused) {
                                                    C1623oL.k(inputStream2);
                                                    C1623oL.k(fileOutputStream2);
                                                    i = i2;
                                                } catch (IOException unused2) {
                                                    C1623oL.k(inputStream2);
                                                    C1623oL.k(fileOutputStream2);
                                                    i = i2;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = fileOutputStream2;
                                                    C1623oL.k(inputStream);
                                                    C1623oL.k(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused3) {
                                                fileOutputStream2 = null;
                                                C1623oL.k(inputStream2);
                                                C1623oL.k(fileOutputStream2);
                                                i = i2;
                                            } catch (IOException unused4) {
                                                fileOutputStream2 = null;
                                                C1623oL.k(inputStream2);
                                                C1623oL.k(fileOutputStream2);
                                                i = i2;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                C1623oL.k(inputStream);
                                                C1623oL.k(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused5) {
                                            inputStream2 = null;
                                        } catch (IOException unused6) {
                                            inputStream2 = null;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream = null;
                                        }
                                        if (j == z.length()) {
                                            C1623oL.k(inputStream2);
                                            C1623oL.k(fileOutputStream2);
                                            z.setReadable(true, false);
                                            z.setExecutable(true, false);
                                            z.setWritable(true);
                                            break;
                                        }
                                        C1623oL.k(inputStream2);
                                        C1623oL.k(fileOutputStream2);
                                    }
                                } catch (IOException unused7) {
                                }
                                i = i2;
                            } else if (((C1574nc) c1334k.l) != null) {
                                lambda$loadLibrary$0("FATAL! Couldn't extract the library from the APK!");
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused8) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        c2002u5 = m;
                        if (c2002u5 != null) {
                            try {
                                ((ZipFile) c2002u5.i).close();
                            } catch (IOException unused9) {
                            }
                        }
                        throw th;
                    }
                }
                String absolutePath = z.getAbsolutePath();
                gu.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                c1334k.B("%s (%s) was re-linked!", "flutter", null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j);
    }

    public void maybeResizeSurfaceView(int i, int i2) {
        boolean z;
        Iterator<InterfaceC2310yn> it = this.flutterUiResizeListeners.iterator();
        while (it.hasNext()) {
            C0068Cn c0068Cn = ((C0016An) it.next()).a;
            View view = c0068Cn.m;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean z2 = true;
                if (view.getHeight() != i2) {
                    layoutParams.height = i2;
                    z = true;
                } else {
                    z = false;
                }
                if (view.getWidth() != i) {
                    layoutParams.width = i;
                } else {
                    z2 = z;
                }
                if (z2) {
                    c0068Cn.h.set(false);
                    view.setLayoutParams(layoutParams);
                }
            } else {
                Log.e("FlutterView", "Flutter engine view not set.");
            }
        }
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        DI di = this.platformViewsController;
        if (di == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        di.y.clear();
        di.z.clear();
    }

    public void onDisplayOverlaySurface(int i, int i2, int i3, int i4, int i5) {
        ensureRunningOnMainThread();
        DI di = this.platformViewsController;
        if (di == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = di.t;
        if (sparseArray.get(i) == null) {
            throw new IllegalStateException(AbstractC1888sN.h(i, "The overlay surface (id:", ") doesn't exist"));
        }
        di.d();
        View view = (C1422lI) sparseArray.get(i);
        if (view.getParent() == null) {
            di.j.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = i3;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        di.y.add(Integer.valueOf(i));
    }

    public void onDisplayPlatformView(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        DI di = this.platformViewsController;
        if (di == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        di.d();
        if (di.r.get(i) != null) {
            throw new ClassCastException();
        }
    }

    @SuppressLint({"NewApi"})
    public void onDisplayPlatformView2(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        CI ci = this.platformViewsController2;
        if (ci == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        if (ci.n.get(i) != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, o.oN] */
    public void onEndFrame() {
        ?? r3;
        ensureRunningOnMainThread();
        DI di = this.platformViewsController;
        if (di == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z = false;
        if (!di.w || !di.z.isEmpty()) {
            if (di.w) {
                C1256in c1256in = di.j.l;
                if (c1256in != null ? c1256in.c() : false) {
                    z = true;
                }
            }
            di.c(z);
            return;
        }
        di.w = false;
        C0068Cn c0068Cn = di.j;
        D1 d1 = new D1(11, di);
        C1256in c1256in2 = c0068Cn.l;
        if (c1256in2 == null || (r3 = c0068Cn.n) == 0) {
            return;
        }
        c0068Cn.m = r3;
        c0068Cn.n = null;
        e eVar = c0068Cn.q.b;
        if (eVar != null) {
            r3.resume();
            eVar.a(new C0042Bn(c0068Cn, eVar, d1));
            return;
        }
        c1256in2.a();
        C1256in c1256in3 = c0068Cn.l;
        if (c1256in3 != null) {
            c1256in3.h.close();
            c0068Cn.removeView(c0068Cn.l);
            c0068Cn.l = null;
        }
        d1.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<InterfaceC2244xn> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<InterfaceC2244xn> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onSurfaceChanged(int i, int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i, i2);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j, long j2, long j3) {
        nativeOnVsync(j, j2, j3);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(textureRegistry$ImageConsumer), z);
    }

    public void registerTexture(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(InterfaceC0797bn interfaceC0797bn) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(interfaceC0797bn);
    }

    public void removeIsDisplayingFlutterUiListener(InterfaceC2244xn interfaceC2244xn) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(interfaceC2244xn);
    }

    public void removeResizingFlutterUiListener(InterfaceC2310yn interfaceC2310yn) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.remove(interfaceC2310yn);
    }

    public void requestDartDeferredLibrary(int i) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(InterfaceC1453ln interfaceC1453ln) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = interfaceC1453ln;
    }

    public void setAccessibilityFeatures(int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i);
        }
    }

    public void setAccessibilityFeaturesInNative(int i) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i);
    }

    public void setAsyncWaitForVsyncDelegate(InterfaceC1519mn interfaceC1519mn) {
        asyncWaitForVsyncDelegate = interfaceC1519mn;
    }

    public void setDeferredComponentManager(InterfaceC0554Vg interfaceC0554Vg) {
        ensureRunningOnMainThread();
        if (interfaceC0554Vg != null) {
            interfaceC0554Vg.a();
        }
    }

    public void setLocalizationPlugin(LA la) {
        ensureRunningOnMainThread();
        this.localizationPlugin = la;
    }

    public void setPlatformMessageHandler(InterfaceC1356kI interfaceC1356kI) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = interfaceC1356kI;
    }

    public void setPlatformViewsController(DI di) {
        ensureRunningOnMainThread();
        this.platformViewsController = di;
    }

    public void setPlatformViewsController2(CI ci) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = ci;
    }

    public void setRefreshRateFPS(float f) {
        refreshRateFPS = f;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z);
        }
    }

    public void setSemanticsEnabledInNative(boolean z) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z);
    }

    public void setSemanticsTreeEnabled(boolean z) {
        ensureRunningOnMainThread();
        InterfaceC1453ln interfaceC1453ln = this.accessibilityDelegate;
        if (interfaceC1453ln == null || z) {
            return;
        }
        b bVar = ((a) interfaceC1453ln).a;
        bVar.g.clear();
        C2324z0 c2324z0 = bVar.i;
        if (c2324z0 != null) {
            bVar.g(c2324z0.b, 65536);
        }
        bVar.i = null;
        bVar.f10o = null;
        AccessibilityEvent d = bVar.d(0, 2048);
        d.setContentChangeTypes(1);
        bVar.h(d);
    }

    public void setSettingsChannel(ZQ zq) {
        ensureRunningOnMainThread();
        this.settingsChannel = zq;
    }

    public void setViewportMetrics(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, int[] iArr3, int i16, int i17, int i18, int i19) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, iArr, iArr2, iArr3, i16, i17, i18, i19);
    }

    @SuppressLint({"NewApi"})
    public void showOverlaySurface2() {
        CI ci = this.platformViewsController2;
        if (ci == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (ci.s == null) {
            return;
        }
        SurfaceControl.Transaction f = BI.f();
        f.setVisibility(ci.s, true);
        f.apply();
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j);
        Long l = nativeSpawn.nativeShellHolderId;
        if ((l == null || l.longValue() == 0) ? false : true) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    @SuppressLint({"NewApi"})
    public void swapTransactions() {
        CI ci = this.platformViewsController2;
        if (ci == null) {
            throw new RuntimeException("");
        }
        synchronized (ci) {
            try {
                ci.q.clear();
                for (int i = 0; i < ci.p.size(); i++) {
                    ci.q.add(BI.h(ci.p.get(i)));
                }
                ci.p.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unregisterTexture(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j);
    }

    public void updateDisplayMetrics(int i, float f, float f2, float f3) {
        displayWidth = f;
        displayHeight = f2;
        displayDensity = f3;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i, EnumC2192x0 enumC2192x0, Object obj) {
        ByteBuffer byteBuffer;
        int i2;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = C1301jT.h.d(obj);
            i2 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i2 = 0;
        }
        dispatchSemanticsAction(i, enumC2192x0.h, byteBuffer, i2);
    }

    public void dispatchSemanticsAction(int i, int i2, ByteBuffer byteBuffer, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i, i2, byteBuffer, i3);
    }
}
