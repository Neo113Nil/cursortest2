package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.z0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4510z0 extends SuspendLambda implements Function2 {
    public AdConfig a;
    public B0 b;
    public Iterator c;
    public AdQualityResult d;
    public int e;
    public final /* synthetic */ B0 f;
    public final /* synthetic */ AdConfig g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4510z0(B0 b0, AdConfig adConfig, Continuation continuation) {
        super(2, continuation);
        this.f = b0;
        this.g = adConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4510z0(this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4510z0(this.f, this.g, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:23|(1:24)|25|(2:62|63)|27|(1:29)|30|31|32|33|(1:35)|36|37) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:43|44|45|46|(1:48)|68|37) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0120, code lost:
    
        if (r5 != r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0122, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0040, code lost:
    
        if (r3 == r0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0120 -> B:6:0x0123). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        B0 b0;
        AdConfig adConfig;
        Iterator it;
        Na na;
        Bitmap bitmap;
        Bitmap bitmap2;
        C4055hi c4055hi;
        C4055hi c4055hi2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            I0 i0 = (I0) F0.a.getValue();
            this.e = 1;
            a = i0.a(this);
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            a = obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AdQualityResult result = this.d;
            it = this.c;
            b0 = this.b;
            adConfig = this.a;
            ResultKt.throwOnFailure(obj);
            Object a2 = obj;
            InterfaceC3892bf interfaceC3892bf = (InterfaceC3892bf) a2;
            C4017g6 c4017g6 = EnumC4069i6.b;
            if (interfaceC3892bf.c() == 0) {
                return Unit.INSTANCE;
            }
            b0.getClass();
            if (Fl.a(interfaceC3892bf)) {
                WeakReference weakReference = (WeakReference) b0.c.get(result.getBeaconUrl());
                if (weakReference != null && (c4055hi2 = (C4055hi) weakReference.get()) != null) {
                    c4055hi2.a.h("window.mraidview.broadcastEvent('AdReportSuccess')");
                }
            } else {
                WeakReference weakReference2 = (WeakReference) b0.c.get(result.getBeaconUrl());
                if (weakReference2 != null && (c4055hi = (C4055hi) weakReference2.get()) != null) {
                    c4055hi.a.h("window.mraidview.broadcastEvent('AdReportFailed')");
                }
            }
            B0.a(result);
            if (it.hasNext()) {
                this.f.b.set(true);
                return Unit.INSTANCE;
            }
            result = (AdQualityResult) it.next();
            F9 f9 = (F9) Ve.e.getValue();
            AdConfig.AdQualityConfig config = adConfig.getAdQuality();
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(config, "config");
            String url = result.getBeaconUrl();
            Intrinsics.checkNotNullParameter(url, "url");
            String beaconUrl = result.getBeaconUrl();
            JSONObject jSONObject = new JSONObject();
            if (result.getImageLocation().length() > 0) {
                Buffer buffer = new Buffer();
                try {
                } catch (FileNotFoundException unused) {
                    bitmap2 = null;
                } catch (Throwable th) {
                    th = th;
                    bitmap = null;
                }
                bitmap2 = BitmapFactory.decodeFile(result.getImageLocation());
                if (bitmap2 != null) {
                    try {
                    } catch (FileNotFoundException unused2) {
                        Intrinsics.checkNotNullParameter(buffer, "<this>");
                        buffer.close();
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        na = null;
                        Ze ze = new Ze(beaconUrl, null, new Ok(2000L, 2000L, 5000L), na, new Vi(config.getRetryInterval(), config.getMaxRetries()), 2);
                        this.a = adConfig;
                        this.b = b0;
                        this.c = it;
                        this.d = result;
                        this.e = 2;
                        a2 = f9.a.a(ze, this);
                    } catch (Throwable th2) {
                        th = th2;
                        bitmap = bitmap2;
                        Intrinsics.checkNotNullParameter(buffer, "<this>");
                        try {
                            buffer.close();
                        } catch (IOException unused3) {
                        }
                        if (bitmap == null) {
                            throw th;
                        }
                        bitmap.recycle();
                        throw th;
                    }
                    bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, buffer.outputStream());
                }
                if (!buffer.exhausted()) {
                    jSONObject.put("screenshotImageByte", N3.a(buffer));
                }
                Na na2 = new Na(jSONObject);
                Intrinsics.checkNotNullParameter(buffer, "<this>");
                buffer.close();
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                na = na2;
                Ze ze2 = new Ze(beaconUrl, null, new Ok(2000L, 2000L, 5000L), na, new Vi(config.getRetryInterval(), config.getMaxRetries()), 2);
                this.a = adConfig;
                this.b = b0;
                this.c = it;
                this.d = result;
                this.e = 2;
                a2 = f9.a.a(ze2, this);
            }
            na = null;
            Ze ze22 = new Ze(beaconUrl, null, new Ok(2000L, 2000L, 5000L), na, new Vi(config.getRetryInterval(), config.getMaxRetries()), 2);
            this.a = adConfig;
            this.b = b0;
            this.c = it;
            this.d = result;
            this.e = 2;
            a2 = f9.a.a(ze22, this);
        }
        AdConfig adConfig2 = this.g;
        b0 = this.f;
        adConfig = adConfig2;
        it = ((List) a).iterator();
        if (it.hasNext()) {
        }
    }
}
